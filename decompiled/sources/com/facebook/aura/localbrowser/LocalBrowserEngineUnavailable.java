package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.C06H;
import X.C3cH;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LocalBrowserEngineUnavailable extends IOException {
    public static final int $stable = 8;
    public final Map<String, String> details;
    public final String stage;

    public /* synthetic */ LocalBrowserEngineUnavailable(String str, String str2, Throwable th, Map map, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : th, C3cH.A0o(map, i & 8));
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final String getStage() {
        return this.stage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEngineUnavailable(String str, String str2, Throwable th, Map<String, String> map) {
        super(str2, th);
        AnonymousClass005.A0y(str, str2, map);
        this.stage = str;
        this.details = map;
    }
}
