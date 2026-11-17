package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VariantImagesJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ImageJson>>> {
    public static final VariantImagesJson$Companion$$childSerializers$1 INSTANCE = new VariantImagesJson$Companion$$childSerializers$1();

    public VariantImagesJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ImageJson>> invoke() {
        return C3cG.A19(ImageJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ImageJson>> invoke() {
        return C3cG.A19(ImageJson$$serializer.INSTANCE);
    }
}
