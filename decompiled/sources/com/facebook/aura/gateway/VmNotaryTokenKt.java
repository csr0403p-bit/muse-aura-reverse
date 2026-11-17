package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.C7bS;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class VmNotaryTokenKt {
    public static final String KEY_NOTARY_TOKEN_EXPIRATION_TS = "notary_token_expiration_ts";
    public static final String KEY_WRITTEN_AT_MS = "written_at_ms";
    public static final String NOISE_INGRESS_PATH = "/v1/noise";
    public static final long NOTARY_TOKEN_EXPIRATION_SKEW_SECONDS = 60;

    public static final boolean commitVmNotaryTokens(String str, Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 1);
        C7bS c7bSNotaryTokensEditor = notaryTokensEditor(str, map, l);
        c7bSNotaryTokensEditor.AYp("written_at_ms", System.currentTimeMillis());
        return c7bSNotaryTokensEditor.commit();
    }

    public static final String getVmNotaryToken(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        String string = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.NOTARY_TOKENS).getString(str2, "");
        return string == null ? "" : string;
    }

    public static final boolean isVmNotaryTokenExpired(String str, String str2) {
        C4oT c4oT;
        String string;
        C7384Etj.A0Y(str2, 1);
        if (str == null || str.length() == 0 || (string = (c4oT = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.NOTARY_TOKENS)).getString(str2, "")) == null || string.length() == 0) {
            return false;
        }
        long j = c4oT.getLong(KEY_NOTARY_TOKEN_EXPIRATION_TS, 0L);
        if (j > 0) {
            return isNotaryExpiryDue(j);
        }
        return false;
    }

    public static final void setVmNotaryTokens(String str, Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 1);
        notaryTokensEditor(str, map, l).apply();
    }

    public static final C7bS notaryTokensEditor(String str, Map<String, String> map, Long l) {
        BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.NOTARY_TOKENS).A9q();
        bzKA9q.A08();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            bzKA9q.AYr((String) entry.getKey(), C7BY.A0F((String) entry.getValue()).toString());
        }
        if (l != null) {
            bzKA9q.AYp(KEY_NOTARY_TOKEN_EXPIRATION_TS, l.longValue());
        }
        return bzKA9q;
    }

    public static final boolean isNotaryExpiryDue(long j) {
        return (System.currentTimeMillis() / 1000) + 60 >= j;
    }
}
