package com.example.shoplist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplist.data.ShopListRepositoryImpl
import com.example.shoplist.domain.DeleteShopModelUseCase
import com.example.shoplist.domain.EditShopModelUseCase
import com.example.shoplist.domain.GetShopListUseCase
import com.example.shoplist.domain.ShopModel

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopModelUseCase = DeleteShopModelUseCase(repository)
    private val editShopModelUseCase = EditShopModelUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopModel(shopModel: ShopModel){
        deleteShopModelUseCase.deleteShopModel(shopModel)
    }
    fun changeShopEnableState (shopModel: ShopModel){
        val newModel = shopModel.copy(enabled = !shopModel.enabled)
        editShopModelUseCase.editShopModel(newModel)
    }
}