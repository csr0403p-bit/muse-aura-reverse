package com.facebook.aura.localbrowser;

import X.AGH;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9258GBl;
import X.C9jH;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LocalBrowserBlockedPolicy {
    public static final int $stable = 8;
    public BrowserEngine authority;
    public boolean closed;
    public final Set<BrowserEngine> engines;
    public final InterfaceC2261BLa initialization;
    public byte[] installed;
    public final Object lock;
    public final Function0<Unit> onInconsistent;
    public final String runtimeId;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy", f = "LocalBrowserBlockedPolicy.kt", l = {96}, m = "close", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy$close$1, reason: invalid class name */
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
            return LocalBrowserBlockedPolicy.this.close(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy", f = "LocalBrowserBlockedPolicy.kt", l = {120, 34, 44, 44}, m = "initialize", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy$initialize$1, reason: invalid class name and case insensitive filesystem */
    public final class C124051 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C124051(HtJ<? super C124051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBlockedPolicy.this.initialize(null, this);
        }
    }

    public final void attach(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        synchronized (this.lock) {
            checkOpen();
            byte[] bArr = this.installed;
            if (bArr == null) {
                C9jH c9jHA0E = AGH.A0E();
                throw new LocalBrowserEndpointFailure("blocked_policy_uninstalled", false, null, null, c9jHA0E, c9jHA0E);
            }
            browserEngine.enableBlockedPolicy(this.runtimeId);
            receipt(browserEngine.setBlockedPolicy(bArr));
            this.engines.add(browserEngine);
        }
    }

    public final void detach(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        synchronized (this.lock) {
            this.engines.remove(browserEngine);
        }
    }

    public final JsonObject install(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        JsonObject jsonObjectPolicyReceipt;
        C7384Etj.A0Y(jsonObject, 0);
        synchronized (this.lock) {
            checkOpen();
            BrowserEngine browserEngine = this.authority;
            if (browserEngine == null) {
                C9jH c9jHA0E = AGH.A0E();
                throw new LocalBrowserEndpointFailure("blocked_policy_unavailable", false, null, null, c9jHA0E, c9jHA0E);
            }
            String string = jsonObject.toString();
            C7384Etj.A0Y(string, 0);
            byte[] bArrA1S = C3cG.A1S(string);
            jsonObjectPolicyReceipt = LocalBrowserBlockedPolicyKt.policyReceipt(browserEngine.setBlockedPolicy(bArrA1S), this.runtimeId);
            try {
                Iterator<BrowserEngine> it = this.engines.iterator();
                while (it.hasNext()) {
                    if (!LocalBrowserBlockedPolicyKt.policyReceipt(it.next().setBlockedPolicy(bArrA1S), this.runtimeId).equals(jsonObjectPolicyReceipt)) {
                        throw C3cG.A0Q("Check failed.");
                    }
                }
                this.installed = bArrA1S;
            } catch (Exception unused) {
                this.closed = true;
                this.onInconsistent.invoke();
                C9jH c9jHA0E2 = AGH.A0E();
                throw new LocalBrowserEndpointFailure("blocked_policy_unavailable", true, null, null, c9jHA0E2, c9jHA0E2);
            }
        }
        return jsonObjectPolicyReceipt;
    }

    private final void checkOpen() throws LocalBrowserEndpointFailure {
        if (this.closed) {
            throw C3cI.A0E("blocked_policy_unavailable");
        }
    }

    private final JsonObject receipt(byte[] bArr) {
        return LocalBrowserBlockedPolicyKt.policyReceipt(bArr, this.runtimeId);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object close(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy.AnonymousClass1
            if (r0 == 0) goto L40
            r5 = r7
            com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy$close$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L46
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            java.lang.Object r2 = r6.lock
            monitor-enter(r2)
            r6.closed = r3     // Catch: java.lang.Throwable -> L4b
            r1 = 0
            r6.installed = r1     // Catch: java.lang.Throwable -> L4b
            com.facebook.aura.localbrowser.core.BrowserEngine r0 = r6.authority     // Catch: java.lang.Throwable -> L4b
            r6.authority = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)
            if (r0 == 0) goto L20
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = r0.shutdown(r5)
            if (r0 != r4) goto L20
            return r4
        L40:
            com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy$close$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy$close$1
            r5.<init>(r7)
            goto L12
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L4b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy.close(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.BLa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialize(X.G0U<? super X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngine>, ? extends java.lang.Object> r10, X.HtJ<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy.initialize(X.G0U, X.HtJ):java.lang.Object");
    }

    public final JsonObject inventory() {
        byte[] bArrBlockedPolicyInventory;
        JsonObject jsonObjectPolicyReceipt;
        synchronized (this.lock) {
            checkOpen();
            BrowserEngine browserEngine = this.authority;
            if (browserEngine == null || (bArrBlockedPolicyInventory = browserEngine.blockedPolicyInventory()) == null) {
                C9jH c9jHA0E = AGH.A0E();
                throw new LocalBrowserEndpointFailure("blocked_policy_unavailable", false, null, null, c9jHA0E, c9jHA0E);
            }
            jsonObjectPolicyReceipt = LocalBrowserBlockedPolicyKt.policyReceipt(bArrBlockedPolicyInventory, this.runtimeId);
        }
        return jsonObjectPolicyReceipt;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInstalled() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.lock
            monitor-enter(r2)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lc
            byte[] r1 = r3.installed     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy.isInstalled():boolean");
    }

    public LocalBrowserBlockedPolicy(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        this.runtimeId = str;
        this.onInconsistent = function0;
        this.initialization = new C9258GBl();
        this.lock = C3cG.A0T();
        this.engines = C3cG.A0k();
    }
}
