package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass002;
import android.net.Uri;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSRedirect;

/* loaded from: classes4.dex */
public abstract class HatchCheckoutWireTypesJsonKt {
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTP_METHOD_POST = "POST";

    public static final HatchThreeDSRedirect toThreeDSRedirect(HatchCheckoutNextActionJson hatchCheckoutNextActionJson) {
        HatchThreeDSRedirect hatchThreeDSRedirect;
        HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson;
        if (hatchCheckoutNextActionJson == null || (hatchCheckoutRedirectUrlJson = hatchCheckoutNextActionJson.redirect_url) == null || !AnonymousClass002.A1b(hatchCheckoutRedirectUrlJson.is_for_three_ds, true)) {
            hatchThreeDSRedirect = HatchThreeDSRedirect.None.INSTANCE;
        } else {
            String str = hatchCheckoutRedirectUrlJson.url;
            if (str != null && "https".equals(Uri.parse(str).getScheme())) {
                String str2 = hatchCheckoutRedirectUrlJson.http_method;
                return new HatchThreeDSRedirect.Valid(str, (str2 == null || !str2.equalsIgnoreCase("POST")) ? HatchThreeDSHttpMethod.GET : HatchThreeDSHttpMethod.POST);
            }
            hatchThreeDSRedirect = HatchThreeDSRedirect.Invalid.INSTANCE;
        }
        return hatchThreeDSRedirect;
    }
}
