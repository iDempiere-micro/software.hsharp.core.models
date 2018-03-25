package software.hsharp.core.models

interface IDataSource : INameKeyPair, IDeleteable {
    val columns : Array<IDataColumn>
    val defaultSortBy : IDataColumn
    val limit : Int
}
