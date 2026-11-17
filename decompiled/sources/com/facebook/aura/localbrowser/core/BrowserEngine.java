package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.executors.AuraDispatchers;
import com.hatch.browser.core.BrowserBlocklistFilter;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.BrowserHostBlocklist;
import com.hatch.browser.core.BrowserOperationsKt;
import com.hatch.browser.core.Hatch_browser_core_uniffiKt;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.BindingId;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.BrowserTaskId;
import com.hatch.browser.protocol.PageCloseRequest;
import com.hatch.browser.protocol.ShutdownReceipt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class BrowserEngine {
    public final BrowserEngineAuthority authority;
    public final BrowserCore core;
    public final G0U<BrowserEngine, Unit> onShutdown;
    public static final Companion Companion = new Companion();
    public static final int $stable = BrowserEngineAuthority.$stable | BrowserCore.$stable;

    /* loaded from: classes2.dex */
    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object create$default(Companion companion, BrowserHostBlocklist browserHostBlocklist, G0U g0u, HtJ htJ, int i, Object obj) {
            if ((i & 1) != 0) {
                browserHostBlocklist = null;
            }
            if ((i & 2) != 0) {
                g0u = new G0U() { // from class: com.facebook.aura.localbrowser.core.BrowserEngine$Companion$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return Unit.INSTANCE;
                    }
                };
            }
            return companion.create(browserHostBlocklist, g0u, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object create(com.hatch.browser.core.BrowserHostBlocklist r9, X.G0U<? super com.facebook.aura.localbrowser.core.BrowserEngine, kotlin.Unit> r10, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngine> r11) {
            /*
                r8 = this;
                boolean r0 = r11 instanceof com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$1
                if (r0 == 0) goto L65
                r7 = r11
                com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$1 r7 = (com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L65
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 0
                r4 = 2
                r2 = 1
                if (r0 == 0) goto L30
                if (r0 == r2) goto L26
                if (r0 == r4) goto L6b
                java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            L25:
                throw r2
            L26:
                java.lang.Object r3 = r7.L$2
                X.Hqv r3 = (X.C10543Hqv) r3
                X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L2e
                goto L73
            L2e:
                r2 = move-exception
                goto L4d
            L30:
                X.Hqv r3 = X.C3cG.A10(r1)
                X.78T r1 = X.C3cG.A0v()     // Catch: java.util.concurrent.CancellationException -> L4c
                com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$3 r0 = new com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$3     // Catch: java.util.concurrent.CancellationException -> L4c
                r0.<init>(r9, r10, r3, r5)     // Catch: java.util.concurrent.CancellationException -> L4c
                r7.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L4c
                r7.L$1 = r5     // Catch: java.util.concurrent.CancellationException -> L4c
                r7.L$2 = r3     // Catch: java.util.concurrent.CancellationException -> L4c
                r7.label = r2     // Catch: java.util.concurrent.CancellationException -> L4c
                java.lang.Object r0 = X.GAo.A00(r7, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L4c
                if (r0 == r6) goto L64
                goto L74
            L4c:
                r2 = move-exception
            L4d:
                X.HwK r1 = X.HwK.A00
                com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$4 r0 = new com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$4
                r0.<init>(r3, r5)
                r7.L$0 = r5
                r7.L$1 = r5
                r7.L$2 = r5
                r7.L$3 = r2
                r7.label = r4
                java.lang.Object r0 = X.GAo.A00(r7, r1, r0)
                if (r0 != r6) goto L25
            L64:
                return r6
            L65:
                com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$1 r7 = new com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$1
                r7.<init>(r8, r11)
                goto L12
            L6b:
                java.lang.Object r2 = r7.L$3
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                X.Hwg.A00(r1)
                throw r2
            L73:
                return r1
            L74:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngine.Companion.create(com.hatch.browser.core.BrowserHostBlocklist, X.G0U, X.HtJ):java.lang.Object");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine", f = "BrowserEngine.kt", l = {50}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngine$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserEngine.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine$shutdown$2", f = "BrowserEngine.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngine$shutdown$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserEngine.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return BrowserEngine.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BrowserEngine browserEngine = BrowserEngine.this;
                    browserEngine.onShutdown.invoke(browserEngine);
                    BrowserCore browserCore = BrowserEngine.this.core;
                    this.label = 1;
                    obj = BrowserOperationsKt.shutdown(browserCore, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                ShutdownReceipt shutdownReceipt = (ShutdownReceipt) obj;
                if (shutdownReceipt.closed && shutdownReceipt.settled) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                BrowserEngine browserEngine2 = BrowserEngine.this;
                if (boolValueOf.booleanValue()) {
                    browserEngine2.authority.files.close();
                    browserEngine2.core.destroy();
                }
                return boolValueOf;
            } catch (ApiException unused) {
                return false;
            }
        }
    }

    public final BrowserEngineClosure beginClose(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        try {
            return new BrowserEngineClosure(this.core.beginClose(Hatch_browser_core_uniffiKt.decodePageCloseRequest(bArr)));
        } catch (ApiException unused) {
            return null;
        }
    }

    public final void enableBlockedPolicy(String str) {
        C7384Etj.A0Y(str, 0);
        this.core.enableBlockedPolicy(str);
    }

    public final void enableHeaderPolicy(String str) {
        C7384Etj.A0Y(str, 0);
        this.core.enableHeaderPolicy(str);
    }

    public final void enableNavigationConsent(String str) {
        C7384Etj.A0Y(str, 0);
        this.core.enableNavigationConsent(str);
    }

    public final boolean needsScreening(String str) {
        C7384Etj.A0Y(str, 0);
        return "candidate".equals(this.core.prescreenUrl(str));
    }

    public final byte[] setBlockedPolicy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.core.setBlockedPolicy(bArr);
    }

    public final byte[] setHeaderPolicy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.core.setHeaderPolicy(bArr);
    }

    public final byte[] setNavigationPolicy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.core.setNavigationPolicy(bArr);
    }

    public final void useBlocklistFilter(BrowserBlocklistFilter browserBlocklistFilter) {
        C7384Etj.A0Y(browserBlocklistFilter, 0);
        this.core.useBlocklistFilter(browserBlocklistFilter);
    }

    public static /* synthetic */ BrowserEngineGroup openGroup$default(BrowserEngine browserEngine, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = AnonymousClass002.A0k();
        }
        return browserEngine.openGroup(str, str2);
    }

    public final byte[] blockedPolicyInventory() {
        return this.core.blockedPolicyInventory();
    }

    public final byte[] blocklistInfo() {
        return this.core.blocklistInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.hatch.browser.protocol.CommandRequest r9, X.HtJ<? super com.hatch.browser.core.CommandReport> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.localbrowser.core.BrowserEngine.AnonymousClass1
            r6 = r8
            if (r0 == 0) goto L23
            r4 = r10
            com.facebook.aura.localbrowser.core.BrowserEngine$execute$1 r4 = (com.facebook.aura.localbrowser.core.BrowserEngine.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.label = r2
        L13:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L69
            java.lang.Object r9 = r4.L$2
            X.Hqv r9 = (X.C10543Hqv) r9
            goto L54
        L23:
            com.facebook.aura.localbrowser.core.BrowserEngine$execute$1 r4 = new com.facebook.aura.localbrowser.core.BrowserEngine$execute$1
            r4.<init>(r10)
            goto L13
        L29:
            X.Hwg.A00(r0)
            com.hatch.browser.core.CapturedBudget$Companion r1 = com.hatch.browser.core.CapturedBudget.Companion
            r7 = r9
            com.hatch.browser.protocol.Budget r0 = r9.budget
            com.hatch.browser.core.CapturedBudget r8 = r1.captureAtReceipt(r0)
            X.Hqv r9 = X.C3cG.A0z()
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE     // Catch: java.lang.Throwable -> L5e
            X.78T r0 = r0.m764default()     // Catch: java.lang.Throwable -> L5e
            r10 = 0
            com.facebook.aura.localbrowser.core.BrowserEngine$execute$result$1 r5 = new com.facebook.aura.localbrowser.core.BrowserEngine$execute$result$1     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5e
            r4.L$0 = r10     // Catch: java.lang.Throwable -> L5e
            r4.L$1 = r10     // Catch: java.lang.Throwable -> L5e
            r4.L$2 = r9     // Catch: java.lang.Throwable -> L5e
            r4.label = r2     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = X.GAo.A00(r4, r0, r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r3) goto L57
            return r3
        L54:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L5e
        L57:
            r3 = r0
            com.hatch.browser.core.CommandReport r3 = (com.hatch.browser.core.CommandReport) r3     // Catch: java.lang.Throwable -> L5e
            r0 = 0
            r9.element = r0     // Catch: java.lang.Throwable -> L5e
            return r3
        L5e:
            r1 = move-exception
            T r0 = r9.element
            com.hatch.browser.core.CommandReport r0 = (com.hatch.browser.core.CommandReport) r0
            if (r0 == 0) goto L6d
            r0.destroy()
            throw r1
        L69:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngine.execute(com.hatch.browser.protocol.CommandRequest, X.HtJ):java.lang.Object");
    }

    public final byte[] headerPolicyInventory() {
        return this.core.headerPolicyInventory();
    }

    public final byte[] navigationInventory() {
        return this.core.navigationInventory();
    }

    public final Object screenNavigation(String str, boolean z, HtJ<? super byte[]> htJ) {
        return this.core.screenNavigation(str, z, htJ);
    }

    public final Object shutdown(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AuraDispatchers.INSTANCE.m764default(), new AnonymousClass2(null));
    }

    public final BrowserEngineGroup openGroup(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        BrowserTaskBinding browserTaskBinding = new BrowserTaskBinding(new BrowserTaskId(str), new BindingId(str2));
        try {
            return new BrowserEngineGroup(this.core.createTaskPageGroup(browserTaskBinding), browserTaskBinding, this.authority);
        } catch (ApiException unused) {
            return null;
        }
    }

    public /* synthetic */ BrowserEngine(BrowserCore browserCore, BrowserEngineAuthority browserEngineAuthority, G0U g0u, C06H c06h) {
        this(browserCore, browserEngineAuthority, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserEngine(BrowserCore browserCore, BrowserEngineAuthority browserEngineAuthority, G0U<? super BrowserEngine, Unit> g0u) {
        this.core = browserCore;
        this.authority = browserEngineAuthority;
        this.onShutdown = g0u;
    }

    public final BrowserEngineClosure beginClose(PageCloseRequest pageCloseRequest) {
        C7384Etj.A0Y(pageCloseRequest, 0);
        try {
            return new BrowserEngineClosure(this.core.beginClose(pageCloseRequest));
        } catch (ApiException unused) {
            return null;
        }
    }
}
