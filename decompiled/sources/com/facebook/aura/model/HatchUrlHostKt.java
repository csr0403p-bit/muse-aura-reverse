package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C7BY;
import X.FGI;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class HatchUrlHostKt {
    public static final String toHost(String str) {
        String strA0l;
        String strA0l2;
        String strA0Y;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && !C7BY.A0j(strA0l)) {
            if (!C7BY.A0q(strA0l, "://", false)) {
                strA0l = FGI.A0M("https://", strA0l);
            }
            String host = Uri.parse(strA0l).getHost();
            if (host != null && (strA0l2 = AnonymousClass002.A0l(host)) != null && (strA0Y = C7BY.A0Y(strA0l2, '.')) != null) {
                String strA0u = AnonymousClass001.A0u(strA0Y);
                if (strA0u.length() > 0) {
                    return strA0u;
                }
            }
        }
        return null;
    }

    public static final String toDisplayHost(String str) {
        String host = toHost(str);
        if (host != null) {
            if (AnonymousClass006.A1b("www.", host)) {
                host = host.substring(4);
                if (host.length() > 0) {
                }
            }
            return host;
        }
        return null;
    }
}
