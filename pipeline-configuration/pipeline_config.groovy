libraries {
    maven {
        jfrog_user = jfrogCreds_USR
        jfrog_pass = jfrogCreds_PSW
    }
    generic
}

keywords {
    jfrogCreds = credentials('jfrog-cicd')
}

application_environments {
    dev{
        short_name = "aw1dd"
    }
}