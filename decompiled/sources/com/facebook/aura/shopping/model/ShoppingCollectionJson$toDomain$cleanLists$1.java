package com.facebook.aura.shopping.model;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class ShoppingCollectionJson$toDomain$cleanLists$1 extends AbstractC7559F3s implements G0U<ShoppingCollectionListJson, ShoppingCollectionList> {
    public final /* synthetic */ HashSet<Integer> $parsedWireIndices;

    @Override // X.G0U
    public final ShoppingCollectionList invoke(ShoppingCollectionListJson shoppingCollectionListJson) {
        C7384Etj.A0Y(shoppingCollectionListJson, 0);
        return shoppingCollectionListJson.toDomain(this.$parsedWireIndices);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCollectionJson$toDomain$cleanLists$1(HashSet<Integer> hashSet) {
        super(1);
        this.$parsedWireIndices = hashSet;
    }
}
