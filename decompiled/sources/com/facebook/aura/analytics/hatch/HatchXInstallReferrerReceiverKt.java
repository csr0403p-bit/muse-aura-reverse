package com.facebook.aura.analytics.hatch;

import X.AbstractC07047nA;
import X.AbstractC10402HbJ;
import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.C7381Etf;
import X.C7mC;
import X.InterfaceC7359EnW;
import com.facebook.aura.analytics.hatch.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HatchXInstallReferrerReceiverKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchXInstallReferrerReceiverKt.class, "isXInstallReferrerHandoffEnabled", "isXInstallReferrerHandoffEnabled()Z", 1);
    public static final C31u isXInstallReferrerHandoffEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_sessionless.enable_x_install_referrer_handoff);
    public static final C7381Etf trustedSenders;

    static {
        Set<C7mC> set = AbstractC10402HbJ.A0o;
        Set<String> set2 = AbstractC07047nA.A00;
        HashMap map = new HashMap();
        Set setUnmodifiableSet = Collections.unmodifiableSet(set2);
        Iterator<C7mC> it = set.iterator();
        while (it.hasNext()) {
            map.put(it.next(), setUnmodifiableSet);
        }
        trustedSenders = new C7381Etf(Collections.unmodifiableMap(map));
    }

    public static final boolean isXInstallReferrerHandoffEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isXInstallReferrerHandoffEnabled$delegate, $$delegatedProperties));
    }
}
