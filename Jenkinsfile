pipeline {
    agent any

    tools {
        jdk 'Java 11'
        maven 'Maven 3.8'
    }

    environment {
        LC_ALL=C.UTF-8

        GIT_CLASS="GitSCM"
        GIT_BRANCH_NAME="*/master"
        GIT_CREDENTIAL_ID="GITHUB"
        GIT_CREDENTIAL_URL=""

        DOCKER_IMAGEM_NOME=""
        DOCKER_IMAGEM_VERSAO=""
        DOCKER_REGISTRY_ENDERECO=""

        JENKINS_JOB_NAME='${env.JOB_NAME}'
        JENKINS_JOB_NUMBER='${env.BUILD_NUMBER}'
        JENKINS_JOB_IDENTIFIER='${env.BUILD_ID}'
        JENKINS_JOB_STATUS='${env.BUILD_STATUS}'
        JENKINS_JOB_TAG='${env.BUILD_TAG}'
        JENKINS_JOB_URL='${env.BUILD_URL}'

        SLACK_CHANNEL="#notificação"
        SLACK_COLOR_DEFAULT='blue'
        SLACK_COLOR_SUCCESS='green'
        SLACK_COLOR_WARNING='yellow'
        SLACK_COLOR_FAILURE='red'
        SLACK_MESSAGE_DEFAULT="O JOB ${env.JENKINS_JOB_NAME} COM NÚMERO [${env.JENKINS_JOB_NUMBER}] FOI INICIALIZADO EM (${env.JENKINS_JOB_URL})"
        SLACK_MESSAGE_SUCCESS="O JOB ${env.JENKINS_JOB_NAME} COM NÚMERO [${env.JENKINS_JOB_NUMBER}] FOI GERADO O ARTEFATO COM SUCESSO EM (${env.JENKINS_JOB_URL})"
        SLACK_MESSAGE_FAILURE="O JOB ${env.JENKINS_JOB_NAME} COM NÚMERO [${env.JENKINS_JOB_NUMBER}] NÃO FOI GERADO O ARTEFATO COM SUCESSO EM (${env.JENKINS_JOB_URL})"
    }

    stages {
        stage('INICIALIZACAO'){
            steps{
                echo "NOME: $DOCKER_IMAGEM_NOME"
                echo "VERSÃO: $DOCKER_IMAGEM_VERSAO"
                echo "ENDEREÇO DO REPOSITÓRIO: $DOCKER_REGISTRY_ENDERECO"
                echo "--------------------------------------------------------------------------------------------------"
                echo "NOME DO JOB: $JENKINS_JOB_NAME"
                echo "NÚMERO DO JOB: $JENKINS_JOB_NUMBER"
                echo "TAG DE IDENTIFICAÇÃO: $JENKINS_JOB_TAG"
                echo "ENDEREÇO DO JOB: $JENKINS_JOB_URL"
            }
        }

        stage('CLONANDO REPOSITORIO'){
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [
                        [
                            name: '*/master'
                        ]
                    ],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [],
                    submoduleCfg: [],
                    userRemoteConfigs: [
                        [
                            credentialsId: 'GITHUB',
                            url: ''
                        ]
                    ]
                ])
            }
        }

        stage('GERANDO ARTEFATO DO PROJETO'){
            steps{
                withMaven(){
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('GERANDO IMAGEM BASE DOCKER'){
            script {
                dockerImage = docker.build "${DOCKER_IMAGEM_NOME}:${DOCKER_IMAGEM_VERSAO}"
            }
        }

        stage('PUBLICANDO ARTEFATO NO DOCKERHUB'){
            steps{
                script {
                    sh "docker tag ${AWS_IMAGE_NAME}:${AWS_IMAGE_TAG} ${AWS_REPOSITORY_URI}:$AWS_IMAGE_TAG"
                    sh "docker tag ${AWS_IMAGE_NAME}:${AWS_IMAGE_TAG} ${AWS_REPOSITORY_URI}:$AWS_IMAGE_TAG"
                }
            }
        }
    }
}