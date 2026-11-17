package com.facebook.aura.shopping.model;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ShoppingCollection$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ShoppingCollectionList>>> {
    public static final ShoppingCollection$Companion$$childSerializers$2 INSTANCE = new ShoppingCollection$Companion$$childSerializers$2();

    public ShoppingCollection$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ShoppingCollectionList>> invoke() {
        return C3cG.A19(ShoppingCollectionList$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ShoppingCollectionList>> invoke() {
        return C3cG.A19(ShoppingCollectionList$$serializer.INSTANCE);
    }
}
