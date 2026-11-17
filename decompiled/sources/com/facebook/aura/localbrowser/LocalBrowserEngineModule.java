package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.appmodules.AuraAppModules;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class LocalBrowserEngineModule {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String MODULE_NAME = "browser_engine";

    @Deprecated
    public static final String TAG = "LocalBrowserEngineModule";
    public final SingleFlight install;
    public volatile boolean loaded;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEngineModule", f = "LocalBrowserEngineModule.kt", l = {32}, m = "prepare", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEngineModule.this.prepare(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$2", f = "LocalBrowserEngineModule.kt", l = {32}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LocalBrowserEngineModule.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return LocalBrowserEngineModule.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserEngineModule localBrowserEngineModule = LocalBrowserEngineModule.this;
                this.label = 1;
                if (localBrowserEngineModule.request(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEngineModule", f = "LocalBrowserEngineModule.kt", l = {98}, m = "request", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$1, reason: invalid class name and case insensitive filesystem */
    public final class C124291 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124291(HtJ<? super C124291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEngineModule.this.request(this);
        }
    }

    public LocalBrowserEngineModule(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.install = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    private final void deferInstall() {
        try {
            AuraAppModules.INSTANCE.deferInstall(MODULE_NAME);
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Browser engine deferred install failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object request(X.HtJ<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.localbrowser.LocalBrowserEngineModule.C124291
            if (r0 == 0) goto L72
            r7 = r9
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$1 r7 = (com.facebook.aura.localbrowser.LocalBrowserEngineModule.C124291) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L7b
            java.lang.Object r4 = r7.L$0
            X.Hwg.A00(r6)
        L22:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 == 0) goto L78
            X.CDe r0 = X.EnumC3305CDe.A03
            if (r4 != r0) goto L2d
            r8.deferInstall()
        L2d:
            throw r6
        L2e:
            X.Hwg.A00(r6)
            com.facebook.aura.appmodules.AuraAppModules r2 = com.facebook.aura.appmodules.AuraAppModules.INSTANCE
            java.lang.String r1 = "browser_engine"
            boolean r0 = r2.isInstalled(r1)
            if (r0 == 0) goto L67
            X.CDe r4 = X.EnumC3305CDe.A04
        L3d:
            r7.L$0 = r4
            r7.label = r3
            X.GBL r3 = X.C7Bm.A04(r7)
            X.CDa r2 = r2.getManager()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            X.Ews r0 = new X.Ews
            r0.<init>(r4, r1)
            X.CE0 r2 = r2.A00(r0)
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$failure$1$1 r1 = new com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$failure$1$1
            r1.<init>()
            java.util.concurrent.Executor r0 = X.C7Gt.A00
            r2.A05(r1, r0)
            java.lang.Object r6 = r3.A0F()
            if (r6 != r5) goto L22
            return r5
        L67:
            com.facebook.aura.lifecycle.AuraAppLifecycleManager r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.INSTANCE
            boolean r0 = r0.isAppInForeground()
            if (r0 == 0) goto L80
            X.CDe r4 = X.EnumC3305CDe.A03
            goto L3d
        L72:
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$1 r7 = new com.facebook.aura.localbrowser.LocalBrowserEngineModule$request$1
            r7.<init>(r9)
            goto L12
        L78:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L7b:
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A0n()
            throw r6
        L80:
            r8.deferInstall()
            r3 = 0
            java.lang.String r2 = "not_installed"
            java.lang.String r1 = "Browser engine module is not installed"
            X.9jH r0 = X.AGH.A0E()
            com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable r6 = new com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable
            r6.<init>(r2, r1, r3, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEngineModule.request(X.HtJ):java.lang.Object");
    }

    public final boolean getNeedsDownload() {
        if (!this.loaded) {
            AuraAppModules auraAppModules = AuraAppModules.INSTANCE;
            if (auraAppModules.isDeclared(MODULE_NAME) && !auraAppModules.isInstalled(MODULE_NAME)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isObtainable() {
        return AuraAppModules.INSTANCE.isObtainable(MODULE_NAME);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepare(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.localbrowser.LocalBrowserEngineModule.AnonymousClass1
            if (r0 == 0) goto L51
            r5 = r7
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserEngineModule.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L5e
            X.Hwg.A00(r0)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r1 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 != 0) goto L57
            r6.loaded = r3
        L2a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2d:
            X.Hwg.A00(r0)
            boolean r0 = r6.loaded
            if (r0 != 0) goto L2a
            com.facebook.aura.appmodules.AuraAppModules r1 = com.facebook.aura.appmodules.AuraAppModules.INSTANCE
            java.lang.String r0 = "browser_engine"
            boolean r0 = r1.isDeclared(r0)
            if (r0 == 0) goto L2a
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.install
            r0 = 0
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$2 r1 = new com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$2
            r1.<init>(r0)
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r2.invoke(r0, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L51:
            com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserEngineModule$prepare$1
            r5.<init>(r7)
            goto L12
        L57:
            java.lang.String r0 = "Browser engine install must join in-flight work"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEngineModule.prepare(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
