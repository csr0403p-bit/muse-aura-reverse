package com.facebook.aura.subscription.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ViewerCatalogResponseJson$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ViewerCheckoutAddOnJson>>> {
    public static final ViewerCatalogResponseJson$Companion$$childSerializers$3 INSTANCE = new ViewerCatalogResponseJson$Companion$$childSerializers$3();

    public ViewerCatalogResponseJson$Companion$$childSerializers$3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ViewerCheckoutAddOnJson>> invoke() {
        return C3cG.A19(ViewerCheckoutAddOnJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ViewerCheckoutAddOnJson>> invoke() {
        return C3cG.A19(ViewerCheckoutAddOnJson$$serializer.INSTANCE);
    }
}
