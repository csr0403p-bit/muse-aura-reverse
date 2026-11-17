package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.C06H;
import X.C3cH;

/* loaded from: classes3.dex */
public final class LocalBrowserPageState {
    public static final int $stable = 0;
    public final boolean canGoBack;
    public final boolean canGoForward;
    public final String document;
    public final LocalBrowserPageFailure failure;
    public final Integer httpStatus;
    public final LocalBrowserPagePhase phase;
    public final String url;

    public /* synthetic */ LocalBrowserPageState(String str, String str2, LocalBrowserPagePhase localBrowserPagePhase, LocalBrowserPageFailure localBrowserPageFailure, Integer num, boolean z, boolean z2, int i, C06H c06h) {
        this(str, str2, localBrowserPagePhase, (i & 8) != 0 ? null : localBrowserPageFailure, (i & 16) != 0 ? null : num, (i & 32) != 0 ? false : z, C3cH.A1M(i, z2));
    }

    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    public final boolean getCanGoForward() {
        return this.canGoForward;
    }

    public final String getDocument() {
        return this.document;
    }

    public final LocalBrowserPageFailure getFailure() {
        return this.failure;
    }

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final LocalBrowserPagePhase getPhase() {
        return this.phase;
    }

    public final String getUrl() {
        return this.url;
    }

    public LocalBrowserPageState(String str, String str2, LocalBrowserPagePhase localBrowserPagePhase, LocalBrowserPageFailure localBrowserPageFailure, Integer num, boolean z, boolean z2) {
        AnonymousClass005.A0x(str, str2, localBrowserPagePhase);
        this.document = str;
        this.url = str2;
        this.phase = localBrowserPagePhase;
        this.failure = localBrowserPageFailure;
        this.httpStatus = num;
        this.canGoBack = z;
        this.canGoForward = z2;
    }
}
