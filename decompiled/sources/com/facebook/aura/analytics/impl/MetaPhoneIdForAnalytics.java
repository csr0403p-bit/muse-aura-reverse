package com.facebook.aura.analytics.impl;

import X.AbstractC3136BzG;
import X.BV4;
import X.InterfaceC4944DGi;
import android.os.Trace;

/* loaded from: classes5.dex */
public final class MetaPhoneIdForAnalytics {
    public final InterfaceC4944DGi provider;

    public final InterfaceC4944DGi getProvider() {
        return this.provider;
    }

    public MetaPhoneIdForAnalytics() {
        AbstractC3136BzG.A00("PhoneIdForAnalytics");
        try {
            MetaPhoneIdForAnalytics$provider$1$1 metaPhoneIdForAnalytics$provider$1$1 = new InterfaceC4944DGi() { // from class: com.facebook.aura.analytics.impl.MetaPhoneIdForAnalytics$provider$1$1
                public final String get() {
                    return BV4.A0f();
                }
            };
            Trace.endSection();
            this.provider = metaPhoneIdForAnalytics$provider$1$1;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
