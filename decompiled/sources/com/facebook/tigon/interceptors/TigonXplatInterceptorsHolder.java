package com.facebook.tigon.interceptors;

import X.C3cG;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes5.dex */
public class TigonXplatInterceptorsHolder {
    public static final TigonXplatInterceptorsHolder $redex_init_class = null;
    public final HybridData mHybridData = initHybrid();
    public final List<Interceptor> registeredInterceptors = C3cG.A0h();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void nativeRegisterRequestInterceptor(RequestInterceptor requestInterceptor);

    private final native void nativeRegisterResponseInterceptor(ResponseInterceptor responseInterceptor);

    public final void registerRequestInterceptor(RequestInterceptor requestInterceptor) {
        C7384Etj.A0Y(requestInterceptor, 0);
        this.registeredInterceptors.add(requestInterceptor);
        nativeRegisterRequestInterceptor(requestInterceptor);
    }

    public final void registerResponseInterceptor(ResponseInterceptor responseInterceptor) {
        C7384Etj.A0Y(responseInterceptor, 0);
        this.registeredInterceptors.add(responseInterceptor);
        nativeRegisterResponseInterceptor(responseInterceptor);
    }

    static {
        ETi.loadLibrary("tigoninterceptors");
    }
}
