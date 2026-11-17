package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9258GBl;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2261BLa;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class LocalBrowserResourceUsage {
    public static final int $stable = 8;
    public final LocalBrowserUsageMeter backgroundWork;
    public final LocalBrowserUsageMeter cpuHold;
    public final LocalBrowserUsageMeter hostLease;
    public final InterfaceC2261BLa lock;
    public HatchAppEventLoggingContext loggingContext;
    public final LocalBrowserUsageMeter parked;
    public int peakSessions;
    public boolean periodOpen;
    public final C3UX scope;
    public Snapshot start;
    public int unparkCount;
    public Long unparkReadyMsMax;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserResourceUsage$1", f = "LocalBrowserResourceUsage.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserResourceUsage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserResourceUsage.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Boolean> c1bn = HatchNodeOperationLease.hasHostLease;
                final LocalBrowserResourceUsage localBrowserResourceUsage = LocalBrowserResourceUsage.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserResourceUsage.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        LocalBrowserUsageMeter localBrowserUsageMeter = localBrowserResourceUsage.hostLease;
                        if (z) {
                            localBrowserUsageMeter.start();
                        } else {
                            localBrowserUsageMeter.stop();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserResourceUsage.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class MeteredBackgroundWorkClaim implements BackgroundWorkContentClaim {
        public final BackgroundWorkContentClaim claim;
        public final LocalBrowserUsageMeter meter;
        public final AtomicBoolean released;

        @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim
        public void update(BackgroundWorkContent backgroundWorkContent) {
            C7384Etj.A0Y(backgroundWorkContent, 0);
            this.claim.update(backgroundWorkContent);
        }

        @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkClaim
        public void release() {
            if (C3cI.A1W(this.released)) {
                this.claim.release();
                this.meter.stop();
            }
        }

        public MeteredBackgroundWorkClaim(BackgroundWorkContentClaim backgroundWorkContentClaim, LocalBrowserUsageMeter localBrowserUsageMeter) {
            boolean zA1b = AnonymousClass004.A1b(backgroundWorkContentClaim, localBrowserUsageMeter);
            this.claim = backgroundWorkContentClaim;
            this.meter = localBrowserUsageMeter;
            this.released = new AtomicBoolean(zA1b);
            localBrowserUsageMeter.start();
        }
    }

    public final class Snapshot {
        public static final Companion Companion = new Companion();
        public final Long batteryPercent;
        public final Long chargeUah;
        public final Boolean charging;
        public final long elapsedMs;
        public final Boolean interactive;
        public final Long rxBytes;
        public final Long txBytes;

        public final class Companion {
            /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.facebook.aura.localbrowser.LocalBrowserResourceUsage.Snapshot read() {
                /*
                    Method dump skipped, instructions count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserResourceUsage.Snapshot.Companion.read():com.facebook.aura.localbrowser.LocalBrowserResourceUsage$Snapshot");
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Long getBatteryPercent() {
            return this.batteryPercent;
        }

        public final Long getChargeUah() {
            return this.chargeUah;
        }

        public final Boolean getCharging() {
            return this.charging;
        }

        public final long getElapsedMs() {
            return this.elapsedMs;
        }

        public final Boolean getInteractive() {
            return this.interactive;
        }

        public final Long getRxBytes() {
            return this.rxBytes;
        }

        public final Long getTxBytes() {
            return this.txBytes;
        }

        public Snapshot(long j, Long l, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2) {
            this.elapsedMs = j;
            this.rxBytes = l;
            this.txBytes = l2;
            this.chargeUah = l3;
            this.batteryPercent = l4;
            this.charging = bool;
            this.interactive = bool2;
        }
    }

    public final class Totals {
        public final long backgroundWorkMs;
        public final long cpuHoldMs;
        public final long hostLeaseMs;
        public final long parkedMs;
        public final int unparkCount;
        public final Long unparkReadyMsMax;

        public final long getBackgroundWorkMs() {
            return this.backgroundWorkMs;
        }

        public final long getCpuHoldMs() {
            return this.cpuHoldMs;
        }

        public final long getHostLeaseMs() {
            return this.hostLeaseMs;
        }

        public final long getParkedMs() {
            return this.parkedMs;
        }

        public final int getUnparkCount() {
            return this.unparkCount;
        }

        public final Long getUnparkReadyMsMax() {
            return this.unparkReadyMsMax;
        }

        public Totals(long j, long j2, long j3, long j4, int i, Long l) {
            this.parkedMs = j;
            this.cpuHoldMs = j2;
            this.backgroundWorkMs = j3;
            this.hostLeaseMs = j4;
            this.unparkCount = i;
            this.unparkReadyMsMax = l;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserResourceUsage$sessionsChanged$1", f = "LocalBrowserResourceUsage.kt", l = {249, 71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserResourceUsage$sessionsChanged$1, reason: invalid class name and case insensitive filesystem */
    public final class C124371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAppEventLoggingContext $context;
        public final /* synthetic */ int $count;
        public final /* synthetic */ LocalBrowserCloseReason $reason;
        public final /* synthetic */ Totals $totals;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124371(int i, HatchAppEventLoggingContext hatchAppEventLoggingContext, LocalBrowserCloseReason localBrowserCloseReason, Totals totals, HtJ<? super C124371> htJ) {
            super(2, htJ);
            this.$count = i;
            this.$context = hatchAppEventLoggingContext;
            this.$reason = localBrowserCloseReason;
            this.$totals = totals;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserResourceUsage.this.new C124371(this.$count, this.$context, this.$reason, this.$totals, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [X.BLa] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v4, types: [X.BLa] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            LocalBrowserResourceUsage localBrowserResourceUsage;
            int i;
            HatchAppEventLoggingContext hatchAppEventLoggingContext;
            LocalBrowserCloseReason localBrowserCloseReason;
            Totals totals;
            InterfaceC2261BLa interfaceC2261BLa;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    Hwg.A00(obj);
                    localBrowserResourceUsage = LocalBrowserResourceUsage.this;
                    InterfaceC2261BLa interfaceC2261BLa2 = localBrowserResourceUsage.lock;
                    i = this.$count;
                    hatchAppEventLoggingContext = this.$context;
                    localBrowserCloseReason = this.$reason;
                    totals = this.$totals;
                    this.L$0 = interfaceC2261BLa2;
                    this.L$1 = localBrowserResourceUsage;
                    this.L$2 = hatchAppEventLoggingContext;
                    this.L$3 = localBrowserCloseReason;
                    this.L$4 = totals;
                    this.I$0 = i;
                    this.label = 1;
                    Object objAPs = interfaceC2261BLa2.APs(null, this);
                    interfaceC2261BLa = interfaceC2261BLa2;
                    if (objAPs == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        InterfaceC2261BLa interfaceC2261BLa3 = (InterfaceC2261BLa) this.L$0;
                        Hwg.A00(obj);
                        r1 = interfaceC2261BLa3;
                        return Unit.INSTANCE;
                    }
                    i = this.I$0;
                    totals = (Totals) this.L$4;
                    localBrowserCloseReason = (LocalBrowserCloseReason) this.L$3;
                    hatchAppEventLoggingContext = (HatchAppEventLoggingContext) this.L$2;
                    localBrowserResourceUsage = (LocalBrowserResourceUsage) this.L$1;
                    InterfaceC2261BLa interfaceC2261BLa4 = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                    interfaceC2261BLa = interfaceC2261BLa4;
                }
                C78T c78tA0y = AnonymousClass001.A0y();
                LocalBrowserResourceUsage$sessionsChanged$1$1$1 localBrowserResourceUsage$sessionsChanged$1$1$1 = new LocalBrowserResourceUsage$sessionsChanged$1$1$1(i, localBrowserResourceUsage, hatchAppEventLoggingContext, localBrowserCloseReason, totals, null);
                this.L$0 = interfaceC2261BLa;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                r1 = interfaceC2261BLa;
                if (GAo.A00(this, c78tA0y, localBrowserResourceUsage$sessionsChanged$1$1$1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            } finally {
                r1.Ahe(null);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124371) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserResourceUsage(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        this.scope = c3ux;
        this.lock = new C9258GBl();
        this.parked = new LocalBrowserUsageMeter();
        this.cpuHold = new LocalBrowserUsageMeter();
        this.backgroundWork = new LocalBrowserUsageMeter();
        this.hostLease = new LocalBrowserUsageMeter();
        AnonymousClass001.A1J(new AnonymousClass1(null), c3ux);
    }

    private final synchronized Totals takeTotals() {
        Totals totals;
        totals = new Totals(this.parked.take(), this.cpuHold.take(), this.backgroundWork.take(), this.hostLease.take(), this.unparkCount, this.unparkReadyMsMax);
        this.unparkCount = 0;
        this.unparkReadyMsMax = null;
        return totals;
    }

    public final synchronized void recordUnpark() {
        this.unparkCount++;
    }

    public final synchronized void recordUnparkReady(long j) {
        Long l = this.unparkReadyMsMax;
        this.unparkReadyMsMax = Long.valueOf(Math.max(l != null ? l.longValue() : j, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long delta(Long l, Long l2) {
        if (l == null || l2 == null) {
            return null;
        }
        return Long.valueOf(l2.longValue() - l.longValue());
    }

    public static /* synthetic */ void sessionsChanged$default(LocalBrowserResourceUsage localBrowserResourceUsage, int i, LocalBrowserCloseReason localBrowserCloseReason, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            localBrowserCloseReason = null;
        }
        localBrowserResourceUsage.sessionsChanged(i, localBrowserCloseReason);
    }

    public final LocalBrowserUsageMeter getCpuHold() {
        return this.cpuHold;
    }

    public final LocalBrowserUsageMeter getParked() {
        return this.parked;
    }

    public final void sessionsChanged(int i, LocalBrowserCloseReason localBrowserCloseReason) {
        Object objA0s;
        try {
            objA0s = HatchAppEventLogger.INSTANCE.captureContext();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        HatchAppEventLoggingContext hatchAppEventLoggingContext = (HatchAppEventLoggingContext) objA0s;
        Totals totalsTakeTotals = AnonymousClass002.A1N(i) != this.periodOpen ? takeTotals() : null;
        this.periodOpen = i > 0;
        GAo.A02(C79.A0K, C6ys.A00, new C124371(i, hatchAppEventLoggingContext, localBrowserCloseReason, totalsTakeTotals, null), this.scope);
    }

    public final BackgroundWorkContentClaim claimBackgroundWork(AbstractC3358CGz abstractC3358CGz, BackgroundWorkContent backgroundWorkContent) {
        AnonymousClass003.A0u(abstractC3358CGz, backgroundWorkContent);
        return new MeteredBackgroundWorkClaim(BackgroundWork.INSTANCE.claim(abstractC3358CGz, backgroundWorkContent), this.backgroundWork);
    }
}
