package com.facebook.aura.analytics.impl;

import X.DHW;
import com.facebook.logginginfra.falco.PrivacyContext;

/* loaded from: classes5.dex */
public final class MetaPrivacyContextProvider {
    public PrivacyContext provide(PrivacyContext privacyContext, String str, String str2) {
        DHW dhw;
        char c;
        if (privacyContext != null) {
            c = 1;
            if (privacyContext.A00(1) != null) {
                return privacyContext;
            }
            dhw = new DHW(privacyContext);
        } else {
            dhw = new DHW();
            c = 1;
        }
        dhw.A00[c] = 48;
        Object[] objArr = dhw.A00;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        PrivacyContext privacyContext2 = new PrivacyContext();
        privacyContext2.A00 = "com.facebook.logginginfra.falco.PrivacyContext";
        privacyContext2.A01 = objArr2;
        return privacyContext2;
    }
}
