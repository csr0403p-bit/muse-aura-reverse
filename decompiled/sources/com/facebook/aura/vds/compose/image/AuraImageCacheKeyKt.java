package com.facebook.aura.vds.compose.image;

import X.AnonymousClass001;
import X.C60R;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;

/* loaded from: classes4.dex */
public abstract class AuraImageCacheKeyKt {
    public static final String stableImageKey(String str) {
        if (C60R.A02(str) == 0) {
            return str;
        }
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String strA0u = scheme != null ? AnonymousClass001.A0u(scheme) : null;
            if (!AuraDeeplinkHandlerActivity.HTTP.equals(strA0u) && !"https".equals(strA0u)) {
                return str;
            }
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority == null) {
                return str;
            }
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                encodedPath = "";
            }
            return FGI.A0d(strA0u, "://", encodedAuthority, encodedPath);
        } catch (Throwable unused) {
            return str;
        }
    }
}
