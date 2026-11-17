package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BV3;
import X.C06H;
import X.C3UX;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchGatewayPreconnectPrefetcher implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AtomicBoolean prefetchInFlight;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$launchPrefetchAndWake$1", f = "HatchGatewayPreconnect.kt", l = {195}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$launchPrefetchAndWake$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayPreconnectPrefetcher.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGatewayPreconnectPrefetcher.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchGatewayPreconnectPrefetcher hatchGatewayPreconnectPrefetcher = HatchGatewayPreconnectPrefetcher.this;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (hatchGatewayPreconnectPrefetcher.prefetchAndWakeIfSuspended(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    CFK.A08(BV3.A00(34), BV3.A00(32), th);
                }
                HatchGatewayPreconnectPrefetcher.this.prefetchInFlight.set(false);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                HatchGatewayPreconnectPrefetcher.this.prefetchInFlight.set(false);
                throw th2;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher", f = "HatchGatewayPreconnect.kt", l = {203, 207}, m = "prefetchAndWakeIfSuspended", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$prefetchAndWakeIfSuspended$1, reason: invalid class name and case insensitive filesystem */
    public final class C121241 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121241(HtJ<? super C121241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayPreconnectPrefetcher.this.prefetchAndWakeIfSuspended(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchAndWakeIfSuspended(X.HtJ<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher.C121241
            if (r0 == 0) goto L6d
            r12 = r14
            com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$prefetchAndWakeIfSuspended$1 r12 = (com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher.C121241) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r1 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 == r3) goto L36
            if (r0 != r4) goto L73
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            X.CGz r0 = r13.userSession
            r12.label = r3
            java.lang.Object r1 = r1.prefetchVmForPreconnect(r0, r12)
            if (r1 != r2) goto L39
            return r2
        L36:
            X.Hwg.A00(r1)
        L39:
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r1 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success
            if (r0 == 0) goto L23
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Success r1 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success) r1
            if (r1 == 0) goto L23
            com.facebook.aura.gateway.HatchVmState r0 = r1.selectedVmState
            boolean r0 = com.facebook.aura.gateway.HatchVmRepositoryKt.shouldProactivelyWake(r0)
            if (r0 == 0) goto L23
            java.lang.String r6 = r1.selectedVmId
            if (r6 == 0) goto L23
            com.facebook.aura.gateway.HatchVmWakeApi r5 = com.facebook.aura.gateway.HatchVmWakeApi.INSTANCE
            java.util.UUID r0 = X.AbstractC7535F0i.A00()
            java.lang.String r8 = r0.toString()
            com.facebook.aura.gateway.HatchVmWakeTrigger r9 = com.facebook.aura.gateway.HatchVmWakeTrigger.PRECONNECT
            r10 = 0
            r12.L$0 = r10
            r12.L$1 = r10
            r12.L$2 = r10
            r12.label = r4
            r7 = 0
            r11 = r10
            java.lang.Object r0 = r5.wakeVm(r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L23
            return r2
        L6d:
            com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$prefetchAndWakeIfSuspended$1 r12 = new com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher$prefetchAndWakeIfSuspended$1
            r12.<init>(r14)
            goto L12
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayPreconnectPrefetcher.prefetchAndWakeIfSuspended(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final void launchPrefetchAndWake() {
        if (C3cI.A1W(this.prefetchInFlight)) {
            AnonymousClass001.A1J(new AnonymousClass1(null), this.scope);
        }
    }

    public final class Companion {
        public final HatchGatewayPreconnectPrefetcher getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGatewayPreconnectPrefetcher) abstractC3358CGz.A03(HatchGatewayPreconnectPrefetcher.class, new HatchGatewayPreconnectPrefetcher$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchGatewayPreconnectPrefetcher(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78T.A00();
        this.prefetchInFlight = C60O.A1E();
    }

    public /* synthetic */ HatchGatewayPreconnectPrefetcher(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
