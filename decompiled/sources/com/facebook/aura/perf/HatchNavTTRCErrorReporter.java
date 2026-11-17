package com.facebook.aura.perf;

import X.AbstractC06907md;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.DKe;
import X.FGI;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class HatchNavTTRCErrorReporter implements DKe {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchNavTTRC";
    public final ConcurrentHashMap<String, String> customData = C60O.A1C();

    public void removeCustomData(String str) {
        C7384Etj.A0Y(str, 0);
        this.customData.remove(str);
    }

    @Override // X.DKe
    public void report(String str, String str2, Throwable th) {
        String strA0M;
        AnonymousClass005.A0x(str, str2, th);
        if (this.customData.isEmpty()) {
            strA0M = "";
        } else {
            Set<Map.Entry<String, String>> setEntrySet = this.customData.entrySet();
            C7384Etj.A0U(setEntrySet);
            strA0M = FGI.A0M(" custom_data=", AbstractC06907md.A01(", ", setEntrySet, null));
        }
        CFK.A06(TAG, FGI.A0j(str, ": ", str2, strA0M, " cause=", th.getMessage()));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.DKe
    public void putCustomData(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.customData.put(str, str2);
    }
}
