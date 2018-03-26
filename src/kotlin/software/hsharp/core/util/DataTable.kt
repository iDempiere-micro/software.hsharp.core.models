package software.hsharp.core.util

import software.hsharp.core.models.IDataColumn
import software.hsharp.core.models.IDataTable

data class DataTable (
        override val tableName: String,
        override val columns: Array<IDataColumn>,
        override val defaultSortBy: IDataColumn,
        override val limit: Int,
        override val Key: Int,
        override val name: String,
        override val isActive: Boolean) : IDataTable {
    override val ID: String
        get() = "" + Key
}