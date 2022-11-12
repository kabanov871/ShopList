package com.example.shoplist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopModel>{
        return shopListRepository.getShopList()
    }
}