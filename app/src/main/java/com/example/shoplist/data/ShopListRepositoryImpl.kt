package com.example.shoplist.data

import com.example.shoplist.domain.ShopListRepository
import com.example.shoplist.domain.ShopModel
import java.lang.RuntimeException

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopModel>()

    private var autoIncrementId = 0

    override fun addShopModel(shopModel: ShopModel) {
        if (shopModel.id == ShopModel.UNDEFINED_ID){
        shopModel.id = autoIncrementId++}
        shopList.add(shopModel)
    }

    override fun deleteShopModel(shopModel: ShopModel) {
        shopList.remove(shopModel)
    }

    override fun editShopModel(shopModel: ShopModel) {
        val oldElement = getFromIdShopModel(shopModel.id)
        shopList.remove(oldElement)
        addShopModel(shopModel)
    }

    override fun getFromIdShopModel(shopModelId: Int): ShopModel {
        return shopList.find {
            it.id == shopModelId
        } ?: throw RuntimeException("Element with id $shopModelId not found")
    }

    override fun getShopList(): List<ShopModel> {
        return shopList.toList()
    }
}