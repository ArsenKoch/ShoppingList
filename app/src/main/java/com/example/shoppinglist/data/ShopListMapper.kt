package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem

class ShopListMapper {

    fun mapEntityToDB(shopItem: ShopItem): ShopItemDbModel {
        return ShopItemDbModel(
            shopItem.id,
            shopItem.name,
            shopItem.count,
            shopItem.enabled
        )
    }

    fun mapDBToEntity(shopItemDbModel: ShopItemDbModel): ShopItem {
        return ShopItem(
            shopItemDbModel.name,
            shopItemDbModel.count,
            shopItemDbModel.enabled,
            shopItemDbModel.id
        )
    }

    fun mapListDBModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDBToEntity(it)
    }
}