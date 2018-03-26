package software.hsharp.core.util

import software.hsharp.core.models.IDataColumn
import software.hsharp.core.models.IDataFormat
import software.hsharp.core.models.IDataType

data class DataColumn(
        override val isRequired: Boolean,
        override val isReadOnly: Boolean,
        override val format: IDataFormat,
        override val columnName: String,
        override val columnType: IDataType,
        override val fieldLength: Int,
        override val Key: Int,
        override val name: String) : IDataColumn {
    override val ID: String
        get() = "" + Key
}