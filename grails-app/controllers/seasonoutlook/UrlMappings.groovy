package seasonoutlook

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(uri: "/season/seasonOutlook")
        "/patriots/roster"(uri: "/team/roster/1")
        "/nfl/stadiums"(uri: "/stadium/stadiums")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
