package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C9hr;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKey$Companion$$childSerializers$4 extends AbstractC7559F3s implements Function0<C9hr<ShoppingSaveTarget>> {
    public static final ShoppingProductDetailsPageKey$Companion$$childSerializers$4 INSTANCE = new ShoppingProductDetailsPageKey$Companion$$childSerializers$4();

    public ShoppingProductDetailsPageKey$Companion$$childSerializers$4() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ShoppingSaveTarget> invoke() {
        return ShoppingSaveTarget.Companion.serializer();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ShoppingSaveTarget> invoke() {
        return ShoppingSaveTarget.Companion.serializer();
    }
}
