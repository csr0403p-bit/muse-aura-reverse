package com.facebook.aura.skills.connect.repository;

import X.C3cI;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes4.dex */
public abstract class CustomConnectorRegisterRepositoryKt {
    public static final String DIRECT_OAUTH_MODE = "direct_oauth";
    public static final String ROOT_PATH = "/";

    public static final String customConnectorRegisterErrorType(Throwable th) {
        NetworkException networkException;
        C7384Etj.A0Y(th, 0);
        if (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) {
            return C3cI.A0Y(th);
        }
        String str = networkException.errorCode;
        return str == null ? FGI.A0H("http_", networkException.httpResponseCode) : str;
    }
}
