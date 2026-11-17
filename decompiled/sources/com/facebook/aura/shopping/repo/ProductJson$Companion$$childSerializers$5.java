package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductJson$Companion$$childSerializers$5 extends AbstractC7559F3s implements Function0<C9hr<List<? extends VariantStockStatusJson>>> {
    public static final ProductJson$Companion$$childSerializers$5 INSTANCE = new ProductJson$Companion$$childSerializers$5();

    public ProductJson$Companion$$childSerializers$5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends VariantStockStatusJson>> invoke() {
        return C3cG.A19(VariantStockStatusJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends VariantStockStatusJson>> invoke() {
        return C3cG.A19(VariantStockStatusJson$$serializer.INSTANCE);
    }
}
