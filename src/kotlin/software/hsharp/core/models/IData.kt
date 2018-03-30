package software.hsharp.core.models

import software.hsharp.core.models.IResult
import software.hsharp.core.services.IService
import software.hsharp.core.services.IServiceRegister
import java.sql.Connection
import java.sql.ResultSet

interface IGetDataResult : IResult {
    val rs : ResultSet?
}

interface IDataService : IService {
    val schemasSupported : Array<String>
    fun getData(connection: Connection, tableName : String, limit : Int ): IGetDataResult
}

interface IDataServiceRegister : IServiceRegister<IDataService> {
    fun serviceBySchema( schema : String ) : IDataService?
}
