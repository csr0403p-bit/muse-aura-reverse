package com.facebook.aura.webview.session;

import X.AnonymousClass001;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;

/* loaded from: classes3.dex */
public abstract class SharedSpaceWebSessionKt {
    public static final String META_GRAPH_HOST = "meta.graph.meta.com";

    public static final Uri sharedSpaceOrigin(String str) {
        String str2;
        String str3;
        C7384Etj.A0Y(str, 0);
        Uri uri = Uri.parse(str);
        if (!C60Q.A1R(uri) || uri.getUserInfo() != null || !C60R.A1T(uri, new Integer[]{-1, 443})) {
            throw C60O.A0i("Failed requirement.");
        }
        String host = uri.getHost();
        if (host != null) {
            String strA0u = AnonymousClass001.A0u(host);
            int iHashCode = strA0u.hashCode();
            if (iHashCode != -1360411835) {
                if (iHashCode != 1079027400) {
                    str3 = iHashCode == 1412525212 ? HatchUrl.SHARE_DOMAIN : "www.muse.ai";
                } else if (strA0u.equals(HatchUrl.DOMAIN)) {
                    str2 = "https://agent.meta.ai";
                    Uri uri2 = Uri.parse(str2);
                    C7384Etj.A0U(uri2);
                    return uri2;
                }
            }
            if (strA0u.equals(str3)) {
                str2 = "https://muse.ai";
                Uri uri22 = Uri.parse(str2);
                C7384Etj.A0U(uri22);
                return uri22;
            }
        }
        throw C3cG.A0Q("Unsupported shared viewer host");
    }
}
