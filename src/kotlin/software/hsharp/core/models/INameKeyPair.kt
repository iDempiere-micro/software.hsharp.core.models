package software.hsharp.core.models

interface INameKeyPair : INameIdPair {
    val Key : Int
    fun toStringX() : String
}
