package software.hsharp.core.models

interface IDataColumnDefinition : INameKeyPair {
    val columnName : String
    val columnType : IDataType
    val fieldLength : Int
}
