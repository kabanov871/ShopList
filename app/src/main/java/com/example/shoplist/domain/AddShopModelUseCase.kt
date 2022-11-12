package com.example.shoplist.domain

class AddShopModelUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopModel(shopModel: ShopModel){
        shopListRepository.addShopModel(shopModel)
    }
}