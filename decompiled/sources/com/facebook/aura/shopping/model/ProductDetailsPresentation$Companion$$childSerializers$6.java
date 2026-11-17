package com.facebook.aura.shopping.model;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductDetailsPresentation$Companion$$childSerializers$6 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ShoppingResultProduct>>> {
    public static final ProductDetailsPresentation$Companion$$childSerializers$6 INSTANCE = new ProductDetailsPresentation$Companion$$childSerializers$6();

    public ProductDetailsPresentation$Companion$$childSerializers$6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ShoppingResultProduct>> invoke() {
        return C3cG.A19(ShoppingResultProduct$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ShoppingResultProduct>> invoke() {
        return C3cG.A19(ShoppingResultProduct$$serializer.INSTANCE);
    }
}
