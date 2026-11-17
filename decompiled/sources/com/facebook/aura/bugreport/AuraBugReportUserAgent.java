package com.facebook.aura.bugreport;

import X.AGH;
import X.AnonymousClass006;
import X.C06827l3;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraBugReportUserAgent {
    public static final int $stable = 0;
    public static final String HEADER = "User-Agent";
    public static final AuraBugReportUserAgent INSTANCE = new AuraBugReportUserAgent();
    public static final C06827l3 CARRIER_AND_LOCALE_TOKENS = C06827l3.A02("FB(?:CR|LC)/[^;\\]]*;");

    public final Map<String, String> headers(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return z ? AnonymousClass006.A10("User-Agent", CARRIER_AND_LOCALE_TOKENS.A03(str, "")) : AGH.A0E();
    }
}
