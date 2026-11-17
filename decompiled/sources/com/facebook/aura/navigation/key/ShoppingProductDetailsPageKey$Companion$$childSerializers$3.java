package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C9hr;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKey$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<ShoppingAddToCartTarget>> {
    public static final ShoppingProductDetailsPageKey$Companion$$childSerializers$3 INSTANCE = new ShoppingProductDetailsPageKey$Companion$$childSerializers$3();

    public ShoppingProductDetailsPageKey$Companion$$childSerializers$3() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ShoppingAddToCartTarget> invoke() {
        return ShoppingAddToCartTarget.Companion.serializer();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ShoppingAddToCartTarget> invoke() {
        return ShoppingAddToCartTarget.Companion.serializer();
    }
}
