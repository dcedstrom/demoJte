keywords {
    jfrogCreds = credentials('jfrog-cicd')
}

libraries {
    maven {
        jfrog_user = jfrogCreds_USR
        jfrog_pass = jfrogCreds_PSW
        image_repo = 'venerated.jfrog.io/default-docker-local/spring-jib-jte'
    }
    generic
}


application_environments {
    dev{
        short_name = "aw1dd"
    }
}