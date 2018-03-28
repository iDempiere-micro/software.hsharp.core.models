package software.hsharp.core.models

interface IDataSource  {
    val columns : Array<IDataColumn>
    val limit : Int
}
