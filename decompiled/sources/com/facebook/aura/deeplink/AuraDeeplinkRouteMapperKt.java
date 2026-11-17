package com.facebook.aura.deeplink;

import X.AnonymousClass001;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes.dex */
public abstract class AuraDeeplinkRouteMapperKt {
    public static final String normalizedRoutePath(Uri uri) {
        String host;
        StringBuilder sb;
        String strA0Z;
        String host2;
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        boolean zEqualsIgnoreCase = scheme == null ? false : scheme.equalsIgnoreCase("hatch");
        String strA0v = CustomConnectorRegisterRepositoryKt.ROOT_PATH;
        if (!zEqualsIgnoreCase || (host2 = uri.getHost()) == null || C7BY.A0j(host2)) {
            String path = uri.getPath();
            if (path == null || (strA0Z = C7BY.A0Z(path, '/')) == null || strA0Z.length() <= 0) {
                host = uri.getHost();
                if (host != null) {
                    sb = new StringBuilder(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                }
            } else {
                strA0v = strA0Z;
            }
            return AnonymousClass001.A0u(strA0v);
        }
        String host3 = uri.getHost();
        String path2 = uri.getPath();
        if (path2 == null || (host = C7BY.A0Z(path2, '/')) == null) {
            host = "";
        }
        sb = new StringBuilder(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sb.append(host3);
        strA0v = AnonymousClass001.A0v(host, sb);
        return AnonymousClass001.A0u(strA0v);
    }
}
