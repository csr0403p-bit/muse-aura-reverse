package com.facebook.aura.analytics.impl.sampling;

import X.C4oT;
import X.C7384Etj;
import X.F1N;

/* loaded from: classes5.dex */
public final class MetaPrefsSamplingConfigAccessor extends F1N {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaPrefsSamplingConfigAccessor(C4oT c4oT) {
        super(c4oT);
        C7384Etj.A0Y(c4oT, 0);
    }

    @Override // X.AbstractC7492Exz
    public String getCheckSum() {
        String string = this.lightSharedPreferences.getString("_checksum", "");
        C7384Etj.A0X(string);
        return string;
    }
}
