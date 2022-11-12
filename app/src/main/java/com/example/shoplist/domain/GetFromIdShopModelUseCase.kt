package com.example.shoplist.domain

class GetFromIdShopModelUseCase(private val shopListRepository: ShopListRepository) {

    fun getFromIdShopModel(shopModelId: Int): ShopModel{
       return shopListRepository.getFromIdShopModel(shopModelId)
    }
}