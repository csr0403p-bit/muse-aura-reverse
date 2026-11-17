package com.facebook.aura.confidentialvm.network;

import X.AbstractC5321DgF;
import X.C10371HCv;
import X.F0C;

/* loaded from: classes4.dex */
public final class AuraVestaManagerProvider {
    public static final AuraVestaManagerProvider INSTANCE = new AuraVestaManagerProvider();
    public static final F0C manager$delegate = AbstractC5321DgF.A03(AuraVestaManagerProvider$manager$2.INSTANCE);

    public final C10371HCv getManager() {
        return (C10371HCv) manager$delegate.getValue();
    }
}
