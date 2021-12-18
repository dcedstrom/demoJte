//keywords {
//    jfrogCreds = credentials('jfrog-cicd')
//}

application_environments {
    dev{
        short_name = "aw1dd"
        //jfrogCreds = credentials('jfrog-cicd')
    }
}

jfrogCreds = credentials('jfrog-cicd')

libraries {
    maven {
        jfrog_user = env.jfrogCreds_USR
        jfrog_pass = env.jfrogCreds_PSW
        image_repo = 'venerated.jfrog.io/default-docker-local/spring-jib-jte'
    }
    generic
}


