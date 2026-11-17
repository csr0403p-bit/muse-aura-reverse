package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass002;

/* loaded from: classes4.dex */
public abstract class HatchDeviceNodeIdKt {
    public static final String normalizeHatchDeviceNodeId(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            strA0l = "";
        }
        if (strA0l.length() != 0) {
            return AnonymousClass001.A0u(strA0l);
        }
        return null;
    }
}
