pipeline {
    agent any

    environment {
        GIT_CLASS="GitSCM"
        GIT_BRANCH_NAME="*/master"
        GIT_CREDENTIAL_ID="AUTENTICACAO_GITHUB"
        GIT_CREDENTIAL_URL="https://phmiranda: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@github.com/phmiranda/desenvolvedor-oracle-se.git"
        JENKINS_JOB_NAME="${env.JOB_NAME}"
        JENKINS_JOB_NUMBER="${env.BUILD_NUMBER}"
        JENKINS_JOB_URL="${env.BUILD_URL}"
        SLACK_CHANNEL="#notification"
        SLACK_COLOR_DEFAULT='yellow'
        SLACK_COLOR_SUCCESS='green'
        SLACK_COLOR_FAILURE='red'
        SLACK_MESSAGE_DEFAULT="O JOB '${JENKINS_JOB_NAME} COM NÚMERO [${JENKINS_JOB_NUMBER}]' FOI INICIALIZADO EM (${JENKINS_JOB_URL})"
        SLACK_MESSAGE_SUCCESS="O JOB '${JENKINS_JOB_NAME} COM NÚMERO [${JENKINS_JOB_NUMBER}]' FOI GERADO O ARTEFATO COM SUCESSO EM (${JENKINS_JOB_URL})"
        SLACK_MESSAGE_FAILURE="O JOB '${JENKINS_JOB_NAME} COM NÚMERO [${JENKINS_JOB_NUMBER}]' NÃO FOI GERADO O ARTEFATO COM SUCESSO EM (${JENKINS_JOB_URL})"
    }

    stages {
        stage('INICIALIZACAO') {
            steps {
                script {
                    slackSend (baseUrl: '/', channel: '${SLACK_CHANNEL}', botUser: 'Jenkins', color: '${SLACK_COLOR_DEFAULT}', message: '${SLACK_MESSAGE_DEFAULT}')
                }
            }
        }

        stage('CLONANDO REPOSITORIO') {
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
                            credentialsId: 'AUTENTICACAO_GITHUB',
                            url: 'https://phmiranda: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@github.com/phmiranda/desenvolvedor-oracle-se.git'
                        ]
                    ]
                ])
            }
        }
    }

    post {
        success {
            slackSend (channel: '#notification', color: 'green', teamDomain: 'ph-consultoria-grupo.slack.com', tokenCredentialId: 'U3JWdhqa9OyoO849tYmmCmUg', message: "O JOB '${env.JOB_NAME} COM NÚMERO [${env.BUILD_NUMBER}]' FOI GERADO O ARTEFATO COM SUCESSO EM (${env.BUILD_URL})")
        }
    }
}