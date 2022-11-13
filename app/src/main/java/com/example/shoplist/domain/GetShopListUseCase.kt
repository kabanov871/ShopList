package com.example.shoplist.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopModel>>{
        return shopListRepository.getShopList()
    }
}