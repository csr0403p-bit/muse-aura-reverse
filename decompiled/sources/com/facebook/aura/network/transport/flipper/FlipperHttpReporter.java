package com.facebook.aura.network.transport.flipper;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass751;
import X.C06H;
import X.C8Ky;
import java.util.Map;

/* loaded from: classes3.dex */
public final class FlipperHttpReporter {
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final FlipperHttpReporter create() {
            return new FlipperHttpReporter();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final C8Ky getPlugin() {
        synchronized (AnonymousClass751.class) {
        }
        return null;
    }

    public final boolean isActive() {
        synchronized (AnonymousClass751.class) {
        }
        return false;
    }

    public final void reportError(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        synchronized (AnonymousClass751.class) {
        }
    }

    public final String reportRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
        AnonymousClass005.A0y(str, str2, map);
        synchronized (AnonymousClass751.class) {
        }
        return null;
    }

    public final void reportResponse(String str, int i, byte[] bArr, Map<String, String> map) {
        AnonymousClass003.A0w(str, map);
        synchronized (AnonymousClass751.class) {
        }
    }

    public /* synthetic */ FlipperHttpReporter(C06H c06h) {
    }

    public FlipperHttpReporter() {
    }
}
