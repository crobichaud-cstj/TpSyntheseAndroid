package ca.qc.cstj.tptenretni.models

import kotlinx.serialization.Serializable

@Serializable
data class Network(
    val nextReboot : String,
    val updateDate : String,
    val nodes : List<NetworkNode>
)
