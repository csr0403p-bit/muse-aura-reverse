package com.facebook.aura.localbrowser.connector;

import X.C3cG;
import X.C3cH;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class WebViewDebuggingLease {
    public static final int $stable = 0;
    public static final WebViewDebuggingLease INSTANCE = new WebViewDebuggingLease();
    public static int holders;

    public final class Lease implements AutoCloseable {
        public boolean closed;

        @Override // java.lang.AutoCloseable
        public void close() {
            WebViewDebuggingLease.INSTANCE.checkMainThread();
            if (this.closed) {
                return;
            }
            this.closed = true;
            int i = WebViewDebuggingLease.holders - 1;
            WebViewDebuggingLease.holders = i;
            if (i == 0) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    public final AutoCloseable acquire() {
        checkMainThread();
        if (holders == 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        holders++;
        return new Lease();
    }
}
