package com.facebook.aura.shopping.model;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ProductDetailsPresentation$Companion$$childSerializers$10 extends AbstractC7559F3s implements Function0<C9hr<List<? extends PdpSellerReview>>> {
    public static final ProductDetailsPresentation$Companion$$childSerializers$10 INSTANCE = new ProductDetailsPresentation$Companion$$childSerializers$10();

    public ProductDetailsPresentation$Companion$$childSerializers$10() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends PdpSellerReview>> invoke() {
        return new A64(PdpSellerReview$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends PdpSellerReview>> invoke() {
        return new A64(PdpSellerReview$$serializer.INSTANCE);
    }
}
