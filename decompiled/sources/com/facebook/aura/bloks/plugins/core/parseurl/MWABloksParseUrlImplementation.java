package com.facebook.aura.bloks.plugins.core.parseurl;

import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7Je;
import X.F6D;
import X.Hj6;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class MWABloksParseUrlImplementation {
    public static final MWABloksParseUrlImplementation INSTANCE = new MWABloksParseUrlImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        C7384Etj.A0Y(hj6, 0);
        Uri uriA01 = C7Je.A01((String) hj6.A01[0]);
        C7384Etj.A0U(uriA01);
        Set<String> queryParameterNames = uriA01.getQueryParameterNames();
        C7384Etj.A0U(queryParameterNames);
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(queryParameterNames));
        for (String str : queryParameterNames) {
            linkedHashMapA15.put(str, uriA01.getQueryParameter(str));
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.put("scheme", uriA01.getScheme());
        linkedHashMapA0j.put("host", uriA01.getHost());
        linkedHashMapA0j.put("port", uriA01.getPort() != -1 ? Integer.valueOf(uriA01.getPort()) : null);
        linkedHashMapA0j.put("path", uriA01.getPath());
        linkedHashMapA0j.put("url_params", linkedHashMapA15);
        linkedHashMapA0j.put("fragment", uriA01.getFragment());
        return linkedHashMapA0j;
    }
}
