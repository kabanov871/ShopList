package com.example.shoplist.domain

class DeleteShopModelUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopModel(shopModel: ShopModel){
        shopListRepository.deleteShopModel(shopModel)
    }
}