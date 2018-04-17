package software.hsharp.core.util

import software.hsharp.core.models.IDataColumn
import software.hsharp.core.models.IDataTable

data class DataTable (
        override val tableName: String,
        override val schemaName : String,
        override val columns: Array<IDataColumn>
) : IDataTable