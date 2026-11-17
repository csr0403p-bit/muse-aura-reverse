package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.C3cG;
import X.EnumC10460Hji;
import X.GAt;
import X.HtJ;
import X.HzP;
import X.InterfaceC10560Hsz;
import com.facebook.aura.localbrowser.core.BrowserEngineClosure;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class LocalBrowserCloseAttempt {
    public static final int $stable = 8;
    public final BrowserEngineClosure closure;
    public final InterfaceC10560Hsz<Unit> completion;
    public boolean isSettled;
    public final String operationId;
    public final String sessionId;
    public boolean teardownComplete;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserCloseAttempt", f = "LocalBrowserCloseAttempt.kt", l = {27}, m = "settle", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserCloseAttempt$settle$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserCloseAttempt.this.settle(this);
        }
    }

    public final void markTeardownComplete() {
        this.teardownComplete = true;
    }

    public final Object awaitCompletion(HtJ<? super Unit> htJ) {
        Object objA0W = C3cG.A0W(this.completion, htJ);
        return objA0W != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0W;
    }

    public final boolean getCanEvict() {
        return this.isSettled || this.teardownComplete;
    }

    public final BrowserEngineClosure getClosure() {
        return this.closure;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean isSettled() {
        return this.isSettled;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settle(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.localbrowser.LocalBrowserCloseAttempt.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r6
            com.facebook.aura.localbrowser.LocalBrowserCloseAttempt$settle$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserCloseAttempt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            java.lang.Object r1 = r4.L$0
            com.facebook.aura.localbrowser.LocalBrowserCloseAttempt r1 = (com.facebook.aura.localbrowser.LocalBrowserCloseAttempt) r1
            goto L3f
        L22:
            com.facebook.aura.localbrowser.LocalBrowserCloseAttempt$settle$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserCloseAttempt$settle$1
            r4.<init>(r6)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            com.facebook.aura.localbrowser.core.BrowserEngineClosure r0 = r5.closure     // Catch: java.lang.Throwable -> L50
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L50
            r4.label = r1     // Catch: java.lang.Throwable -> L50
            java.lang.Object r3 = r0.settle(r4)     // Catch: java.lang.Throwable -> L50
            if (r3 != r2) goto L3d
            return r2
        L3d:
            r1 = r5
            goto L42
        L3f:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L50
        L42:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Throwable -> L50
            r1.isSettled = r0     // Catch: java.lang.Throwable -> L50
            X.Hsz<kotlin.Unit> r1 = r5.completion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.C3cG.A1F(r1, r0)
            return r0
        L50:
            r2 = move-exception
            X.Hsz<kotlin.Unit> r1 = r5.completion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.C3cG.A1F(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserCloseAttempt.settle(X.HtJ):java.lang.Object");
    }

    public LocalBrowserCloseAttempt(String str, String str2, BrowserEngineClosure browserEngineClosure) {
        AnonymousClass005.A0x(str, str2, browserEngineClosure);
        this.sessionId = str;
        this.operationId = str2;
        this.closure = browserEngineClosure;
        this.completion = new GAt(null);
    }
}
