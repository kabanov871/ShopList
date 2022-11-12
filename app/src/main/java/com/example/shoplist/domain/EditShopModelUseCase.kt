package com.example.shoplist.domain

class EditShopModelUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopModel(shopModel: ShopModel){
        shopListRepository.editShopModel(shopModel)
    }
}