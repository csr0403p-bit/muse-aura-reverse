package com.facebook.aura.login.nativeflow;

import X.ADq;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3cG;
import X.C6th;
import X.C7384Etj;
import X.CFK;
import X.HsJ;
import android.net.Uri;
import com.facebook.aura.network.sandbox.AuraSandbox;

/* loaded from: classes3.dex */
public abstract class NativeLoginCheckpointContinuationKt {
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    public static final String AURA_CALLBACK_SCHEME = "aura";
    public static final String AURA_PACKAGE = "com.facebook.aura";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BLOB_PARAM = "blob";
    public static final long DECRYPT_TIMEOUT_MS = 30000;
    public static final String DECRYPT_URL = "https://meta.graph.meta.com/webview_blobs_decrypt";
    public static final String FORM_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final long MAX_RESPONSE_BYTES = 16384;
    public static final String REQUEST_TOKEN_PARAM = "request_token";
    public static final ADq SUCCESS_CODES = new ADq(200, 299);
    public static final int TRANSPORT_FAILURE_CODE = -1;
    public static final String USER_AGENT_HEADER = "User-Agent";

    public static final boolean isAuraCheckpointCallback(String str) {
        Object objA0s;
        Uri uriA00;
        C7384Etj.A0Y(str, 0);
        try {
            uriA00 = C6th.A00(str, AuraSandbox.INSTANCE.isHttpSandboxEnabled());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (uriA00 == null) {
            return false;
        }
        objA0s = Boolean.valueOf(C6th.A02(uriA00));
        if (HsJ.A00(objA0s) != null) {
            CFK.A06("MetaWebLoginCallbackParser", "callback validation failed");
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = false;
        }
        return AnonymousClass001.A1X(objA0s);
    }
}
