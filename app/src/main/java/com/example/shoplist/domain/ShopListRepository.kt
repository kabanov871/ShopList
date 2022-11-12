package com.example.shoplist.domain

interface ShopListRepository {

    fun addShopModel(shopModel: ShopModel)

    fun deleteShopModel(shopModel: ShopModel)

    fun editShopModel(shopModel: ShopModel)

    fun getFromIdShopModel(shopModelId: Int): ShopModel

    fun getShopList(): List<ShopModel>
}