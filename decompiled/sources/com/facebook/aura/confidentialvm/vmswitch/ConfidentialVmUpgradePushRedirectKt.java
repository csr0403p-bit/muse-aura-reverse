package com.facebook.aura.confidentialvm.vmswitch;

import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ConfidentialVmUpgradePushRedirectKt {
    public static final String upgradeCvmEnvIdOf(Map<String, String> map) {
        String str;
        C7384Etj.A0Y(map, 0);
        try {
            String strA0p = C60O.A0p("data_payload", map);
            if (strA0p != null && (str = ((VmLockedDataPayloadJson) HatchJsonKt.HatchJson.A00(strA0p, VmLockedDataPayloadJson$$serializer.INSTANCE)).cvm_env_id) != null) {
                if (!C7BY.A0j(str)) {
                    return str;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }
}
