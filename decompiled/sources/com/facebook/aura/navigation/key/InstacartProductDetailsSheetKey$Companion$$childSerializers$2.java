package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C9hr;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKey$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<ShoppingAddToCartTarget>> {
    public static final InstacartProductDetailsSheetKey$Companion$$childSerializers$2 INSTANCE = new InstacartProductDetailsSheetKey$Companion$$childSerializers$2();

    public InstacartProductDetailsSheetKey$Companion$$childSerializers$2() {
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
