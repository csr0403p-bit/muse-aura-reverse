package com.facebook.aura.vds.compose.theme;

import X.AbstractC1439Aj8;
import X.AnonymousClass002;
import X.BFM;
import X.C0dy;
import X.C1Z0;
import X.C1Z3;
import X.C3UH;
import X.Hs1;
import X.InterfaceC05111Yt;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public final class NoOpIndication implements C3UH {
    public static final NoOpIndication INSTANCE = new NoOpIndication();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof NoOpIndication);
    }

    @Override // X.C3UH
    public C1Z3 create(C0dy c0dy) {
        return new AbstractC1439Aj8() { // from class: com.facebook.aura.vds.compose.theme.NoOpIndication.create.1
        };
    }

    public String toString() {
        return "NoOpIndication";
    }

    @Override // X.InterfaceC05011Yg
    @Deprecated(level = Hs1.A02, message = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com")
    public /* bridge */ InterfaceC05111Yt rememberUpdatedInstance(C0dy c0dy, BFM bfm, int i) {
        bfm.AgE(1257603829);
        C1Z0 c1z0 = C1Z0.A00;
        AnonymousClass002.A19(bfm);
        return c1z0;
    }

    @Override // X.C3UH
    public int hashCode() {
        return 1465497624;
    }
}
