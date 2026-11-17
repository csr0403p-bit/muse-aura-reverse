package com.facebook.pando.primaryexecution.tigon;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BUR;
import X.C06H;
import X.C7384Etj;
import X.G0V;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class PandoTigonConfig {
    public final boolean disableContentLengthHeader;
    public final boolean enableParseOnClientExecutor;
    public final boolean failNetworkOnZeroTimeout;
    public final G0V<String, String, Map<String, String>> headers;
    public final Function0<String> requestUrl;
    public final boolean shouldGzipCompressBody;

    public /* synthetic */ PandoTigonConfig(G0V g0v, Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this((i & 1) != 0 ? BUR.A00(42) : g0v, (i & 2) != 0 ? null : function0, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), AnonymousClass005.A1Q(i, z3), AnonymousClass002.A1R(i, z4));
    }

    public final boolean getDisableContentLengthHeader() {
        return this.disableContentLengthHeader;
    }

    public final boolean getEnableParseOnClientExecutor() {
        return this.enableParseOnClientExecutor;
    }

    public final boolean getFailNetworkOnZeroTimeout() {
        return this.failNetworkOnZeroTimeout;
    }

    public final String getRequestUrl() {
        Function0<String> function0 = this.requestUrl;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final boolean getShouldGzipCompressBody() {
        return this.shouldGzipCompressBody;
    }

    public final Map<String, String> getHeaders(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return this.headers.invoke(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PandoTigonConfig(G0V<? super String, ? super String, ? extends Map<String, String>> g0v, Function0<String> function0, boolean z, boolean z2, boolean z3, boolean z4) {
        C7384Etj.A0Y(g0v, 0);
        this.headers = g0v;
        this.requestUrl = function0;
        this.failNetworkOnZeroTimeout = z;
        this.shouldGzipCompressBody = z2;
        this.disableContentLengthHeader = z3;
        this.enableParseOnClientExecutor = z4;
    }

    public PandoTigonConfig() {
        this(BUR.A00(42), null, false, false, false, false);
    }
}
