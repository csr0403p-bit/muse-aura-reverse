package com.facebook.aura.network.api;

import X.C7384Etj;
import X.C7BY;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class HatchVmHostsKt {
    public static final String META_AI_VM_DOMAIN = "metaaivm.com";

    public static final boolean isMetaAiVmHost(String str) {
        String string;
        String strA0Z;
        if (str != null && (string = C7BY.A0F(str).toString()) != null && (strA0Z = C7BY.A0Z(string, '.')) != null) {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            String lowerCase = strA0Z.toLowerCase(locale);
            if (lowerCase.equals("metaaivm.com") || lowerCase.endsWith(".metaaivm.com")) {
                return true;
            }
        }
        return false;
    }
}
