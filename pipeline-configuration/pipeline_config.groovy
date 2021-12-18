application_environments{
    dev{
        short_name = "aw1dd"
    }
}

libraries{
    maven {
        jfrog_user = withCredentials([usernamePassword(credentialsId: 'jfrog-cicd', passwordVariable: 'jfrogPass', usernameVariable: 'jfrogUser')]) {return jfrogUser}
        jfrog_pass = withCredentials([usernamePassword(credentialsId: 'jfrog-cicd', passwordVariable: 'jfrogPass', usernameVariable: 'jfrogUser')]) {return jfrogPass}
        image_repo = 'venerated.jfrog.io/default-docker-local/spring-jib-jte'
    }
    generic
}


