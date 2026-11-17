package com.facebook.aura.common.url;

import X.AnonymousClass006;
import X.C60R;
import X.C7384Etj;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class SharedContentIabSignal {
    public static final SharedContentIabSignal INSTANCE = new SharedContentIabSignal();

    public final String appendParams(String str) {
        C7384Etj.A0Y(str, 0);
        return C60R.A0b(Uri.parse(str).buildUpon().appendQueryParameter(SharedContentIabSignalKt.IAB_QUERY_PARAM, "AuraForAndroid").appendQueryParameter(SharedContentIabSignalKt.APP_VERSION_QUERY_PARAM, "16.0.0.11.159"));
    }

    private final String getToken() {
        return "AuraForAndroid";
    }

    public final Map<String, String> header() {
        return AnonymousClass006.A10(SharedContentIabSignalKt.IAB_HEADER, "AuraForAndroid");
    }
}
