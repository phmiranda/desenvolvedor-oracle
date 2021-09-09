pipeline {
    agent any
    
    environments {
        GIT_CLASS='GitSCM'
        GIT_BRANCH_NAME='*/master'
        GIT_CREDENTIAL_ID='GITHUB'
        GIT_CREDENTIAL_URL='https://phmiranda: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@github.com/phmiranda/desenvolvedor-oracle-se.git'

        JENKINS_JOB_NAME=env.JOB_NAME
        JENKINS_JOB_NUMBER=env.BUILD_NUMBER
        JENKINS_JOB_URL=env.BUILD_URL

        SLACK_CHANNEL='#notification'
        SLACK_MESSAGE_INIT="O JOB '${JENKINS_JOB_NAME} COM NÚMERO [${JENKINS_JOB_NUMBER}]' FOI INICIALIZADO EM (${JENKINS_JOB_URL})"
        SLACK_MESSAGE_SUCCESS=""
        SLACK_MESSAGE_FAILURE=""

    }

    stages {
        stage('INICIALIZAÇÃO') {
            steps {
                slackSend (channel: '#notification', color: '#FFFF00', message: '$SLACK_MESSAGE_INIT')
            }
        }

        stage('CLONANDO REPOSITÓRIO') {
            checkout([
                $class: '$GIT_CLASS',
                branches: [
                    [
                        name: '$GIT_BRANCH_NAME'
                    ]
                ],
                doGenerateSubmoduleConfigurations: false,
                extensions: [],
                submoduleCfg: [],
                userRemoteConfigs: [
                    [
                        credentialsId: '$GIT_CREDENTIAL_ID',
                        url: '$GIT_CREDENTIAL_URL'
                    ]
                ]
            ])
        }
    }

    post {

    }
}