package com.facebook.aura.shopping.model;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductDetailsPresentation$Companion$$childSerializers$13 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends PdpVariantDetails>>> {
    public static final ProductDetailsPresentation$Companion$$childSerializers$13 INSTANCE = new ProductDetailsPresentation$Companion$$childSerializers$13();

    public ProductDetailsPresentation$Companion$$childSerializers$13() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends PdpVariantDetails>> invoke() {
        return new C9tS(C07779iq.A01, PdpVariantDetails$$serializer.INSTANCE);
    }
}
