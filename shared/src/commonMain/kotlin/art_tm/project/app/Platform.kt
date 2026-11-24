package art_tm.project.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform