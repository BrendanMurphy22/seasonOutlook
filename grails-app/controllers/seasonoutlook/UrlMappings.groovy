package seasonoutlook

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(uri: "/season/seasonOutlook")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
