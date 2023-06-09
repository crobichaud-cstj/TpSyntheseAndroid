package ca.qc.cstj.tptenretni.core

object Constants {

    object BaseURL {
        //private const val BASE_API = "http://10.0.2.2:5000"
        private const val BASE_API = "https://api.andromia.science"
        const val TICKETS = "$BASE_API/tickets"
        const val CUSTOMERS = "$BASE_API/customers"
        const val GATEWAYS = "$BASE_API/gateways"
        const val NETWORK = "$BASE_API/network"
        const val COUNTRY_IMAGE_API = "https://flagcdn.com/w80/%s.png"
    }

    object NameStatus {
        const val OPEN = "open"
        const val SOLVE = "solve"
    }

    object  GatewayAction{
        const val UPDATE = "update"
        const val REBOOT = "reboot"
    }

    object Refresh_Delay {
        const val TICKET_DETAIL_REFRESH=1000L * 30
        const val GATEWAY_REFRESH = 1000L * 60
        const val NETWORK_REFRESH = 1000L * 180
        const val LOADING_TIME = 1000L * 10
    }


    object Gateway{
        const val ONLINE="Online"
    }
    const val FLAG_API_URL = "https://flagcdn.com/h40/%s.png"

    enum class TicketPriority {
        Low, Normal, High, Critical
    }

    enum class TicketStatus {
        Open, Solved
    }

    enum class ConnectionStatus {
        Online, Offline
    }

    object RecyclerAdapters {
        const val Gateways = 2
    }

}