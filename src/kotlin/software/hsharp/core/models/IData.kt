package software.hsharp.core.models

import software.hsharp.core.services.IService
import software.hsharp.core.services.IServiceRegister
import java.sql.Connection
import java.sql.ResultSet

interface IGetDataResult : IResult {
    val rs : ResultSet?
}

interface ICreateDataResult : IResult {
    val id : Int?
}

interface IUpdateDataResult : IResult {
    val id : Int?
}

interface IGetTreeDataResult : IResult {
    val rs : ResultSet?
}

interface ITreeDataDescriptor {
    val tableName : String
    val children: Pair<String, Array<ITreeDataDescriptor>>
}

interface IDataService : IService {
    fun getSchemasSupported( connection : Connection) : Array<String>

    fun getData(
            connection: Connection,
            tableName : String,
            orderBy : String , // Name
            orderByOrder : String , // ASC | DESC
            offset : Int, // 0
            limit : Int, // 100
            filterName1: String, // Name
            filterValue1: String, // Franta
            filterName2: String, // LastName
            filterValue2: String // Vokurka
    ): IGetDataResult

    fun createData(
            connection: Connection,
            tableName: String,
            fields: MutableList<Pair<String, Any>>
    ) : ICreateDataResult

    fun updateData(
            connection: Connection,
            tableName: String,
            id: Int,
            fields: MutableList<Pair<String, Any>>) : IUpdateDataResult

    fun execute(connection: Connection, procName: String, jsonBody: String): String?

    fun getTreeData(
            connection: Connection,
            root : ITreeDataDescriptor,
            orderBy : String , // Name
            orderByOrder : String , // ASC | DESC
            offset : Int, // 0
            limit : Int, // 100
            filterName1: String, // Name
            filterValue1: String, // Franta
            filterName2: String, // LastName
            filterValue2: String // Vokurka
    ): IGetTreeDataResult

}


interface IDataServiceRegister : IServiceRegister<IDataService> {
    fun serviceBySchema(connection: Connection, schema : String ) : IDataService?
}
