keywords {
    jfrogCreds = credentials('jfrog-cicd')
}

application_environments{
    dev{
        short_name = "aw1dd"
        //jfrogCreds = credentials('jfrog-cicd')
    }
}

libraries{
    maven {
        jfrog_user = withCredentials([usernamePassword(credentialsId: 'jfrog-cicd', passwordVariable: 'jfrogPass', usernameVariable: 'jfrogUser')]) {return jfrogUser}
        jfrog_pass = jfrogCreds_PSW
        image_repo = withCredentials([usernamePassword(credentialsId: 'jfrog-cicd', passwordVariable: 'jfrogPass', usernameVariable: 'jfrogUser')]) {return jfrogPass}
    }
    generic
}


