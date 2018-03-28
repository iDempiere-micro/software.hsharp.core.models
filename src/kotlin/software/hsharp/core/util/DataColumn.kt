package software.hsharp.core.util

import software.hsharp.core.models.IDataColumn

data class DataColumn(
        override val isRequired: Boolean,
        override val isReadOnly: Boolean,
        override val columnName: String,
        override val columnType: String,
        override val fieldLength: Int
        ) : IDataColumn