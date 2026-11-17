package com.facebook.aura.bloks.plugins.core.editsandboxhostname;

import X.AnonymousClass002;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.F6D;
import X.FGI;
import X.Hj6;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.sandbox.AuraSandbox;

/* loaded from: classes5.dex */
public final class AuraEditSandboxHostNameImpl {
    public static final AuraEditSandboxHostNameImpl INSTANCE = new AuraEditSandboxHostNameImpl();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        String str;
        String strA0l;
        String strA0M;
        String strA0n;
        int length;
        String str2;
        C7384Etj.A0Y(hj6, 0);
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null && AuraInstallSourceDetector.INSTANCE.isInternalToolingAllowed(context)) {
            int i = 0;
            Object obj = hj6.A01[0];
            if ((obj instanceof String) && (str = (String) obj) != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
                if (strA0l.length() <= 0 || (length = (strA0n = C60Q.A0n(C7BY.A0h(strA0l, new char[1], '.'), 0)).length()) <= 0) {
                    strA0M = "";
                } else {
                    while (true) {
                        if (!Character.isDigit(strA0n.charAt(i))) {
                            str2 = ".sb";
                            break;
                        }
                        i++;
                        if (i >= length) {
                            str2 = ".od";
                            break;
                        }
                    }
                    strA0M = FGI.A0M(strA0n, str2);
                }
                AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
                auraSandbox.setGraphqlHost(strA0M);
                auraSandbox.setHttpHost(strA0M);
            }
        }
        return null;
    }
}
