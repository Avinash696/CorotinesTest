package com.tia.vmresponce.Model

data class VmModelItem(
    val AssetCategoryDescription: String,
    val AssetCategoryID: Int,
    val AssetCategoryName: String,
    val CreateDate: CreateDate,
    val CreatedBy: Int,
    val IsActive: Int,
    val UpdateBy: Int,
    val UpdateDate: UpdateDate,
    val UpdateRemarks: String
)