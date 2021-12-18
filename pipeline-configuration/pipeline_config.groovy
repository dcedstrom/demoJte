application_environments{
    dev{
        short_name = "aw1dd"
    }
}

libraries{
    maven {
        jfrog_user = 'jenkinsuser'
        jfrog_pass = '9kNHdSMA2JbN9sNx5k9F'
        image_repo = 'venerated.jfrog.io/default-docker-local/spring-jib-jte'
    }
    generic
}


