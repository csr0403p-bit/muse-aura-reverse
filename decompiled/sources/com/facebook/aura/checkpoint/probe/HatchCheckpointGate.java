package com.facebook.aura.checkpoint.probe;

import X.ATD;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.checkpoint.HatchCheckpointRepository;
import com.facebook.aura.common.coroutines.SingleFlight;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCheckpointGate {
    public static final Companion Companion = new Companion();
    public volatile long cooldownMs;
    public volatile long lastProbeAtMs;
    public final HatchCheckpointRepository repository;
    public final SingleFlight singleFlight;

    @DebugMetadata(c = "com.facebook.aura.checkpoint.probe.HatchCheckpointGate", f = "HatchCheckpointGate.kt", l = {33}, m = "onActivity", v = 2)
    /* renamed from: com.facebook.aura.checkpoint.probe.HatchCheckpointGate$onActivity$1, reason: invalid class name */
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
            return HatchCheckpointGate.this.onActivity(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.checkpoint.probe.HatchCheckpointGate", f = "HatchCheckpointGate.kt", l = {40}, m = "runProbe", v = 2)
    /* renamed from: com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$1, reason: invalid class name and case insensitive filesystem */
    public final class C110591 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C110591(HtJ<? super C110591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckpointGate.this.runProbe(this);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCheckpointProbeStatus.values().length];
            try {
                AnonymousClass002.A13(HatchCheckpointProbeStatus.REQUIRED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCheckpointProbeStatus.CLEAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCheckpointProbeStatus.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(HatchCheckpointProbeResult hatchCheckpointProbeResult) {
        if (hatchCheckpointProbeResult.nextCheckAfterSeconds != null) {
            this.cooldownMs = ATD.A07(r0.intValue() * 1000, 30000L, 3600000L);
        }
        int iOrdinal = hatchCheckpointProbeResult.status.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.repository.clear();
                return;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                return;
            }
        }
        String strA00 = hatchCheckpointProbeResult.flowId;
        if (strA00 == null) {
            strA00 = C60N.A00(30);
        }
        CFK.A06(HatchCheckpointGateKt.TAG, FGI.A0M("account is checkpointed, flow: ", strA00));
        this.repository.onBlocked(hatchCheckpointProbeResult.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runProbe(X.HtJ<? super com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.checkpoint.probe.HatchCheckpointGate.C110591
            if (r0 == 0) goto L47
            r5 = r7
            com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$1 r5 = (com.facebook.aura.checkpoint.probe.HatchCheckpointGate.C110591) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L5d
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L4d
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r3 = r1.value
            return r3
        L2b:
            X.Hwg.A00(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.lastProbeAtMs = r0
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.singleFlight
            r0 = 0
            com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$flight$1 r1 = new com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$flight$1
            r1.<init>(r6, r0)
            r5.label = r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r3) goto L20
            return r3
        L47:
            com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$1 r5 = new com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$1
            r5.<init>(r7)
            goto L12
        L4d:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L58
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus r3 = com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus.UNAVAILABLE
            return r3
        L58:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkpoint.probe.HatchCheckpointGate.runProbe(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onActivity(X.HtJ<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.checkpoint.probe.HatchCheckpointGate.AnonymousClass1
            if (r0 == 0) goto L45
            r6 = r9
            com.facebook.aura.checkpoint.probe.HatchCheckpointGate$onActivity$1 r6 = (com.facebook.aura.checkpoint.probe.HatchCheckpointGate.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L23
            if (r0 != r7) goto L4b
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            long r3 = r8.lastProbeAtMs
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.lastProbeAtMs
            long r3 = r3 - r0
            long r1 = r8.cooldownMs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L20
        L3c:
            r6.label = r7
            java.lang.Object r0 = r8.runProbe(r6)
            if (r0 != r5) goto L20
            return r5
        L45:
            com.facebook.aura.checkpoint.probe.HatchCheckpointGate$onActivity$1 r6 = new com.facebook.aura.checkpoint.probe.HatchCheckpointGate$onActivity$1
            r6.<init>(r9)
            goto L12
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkpoint.probe.HatchCheckpointGate.onActivity(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchCheckpointGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCheckpointGate) abstractC3358CGz.A03(HatchCheckpointGate.class, new HatchCheckpointGate$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCheckpointGate(AbstractC3358CGz abstractC3358CGz) {
        this.repository = HatchCheckpointRepository.Companion.getInstance(abstractC3358CGz);
        this.singleFlight = C3cH.A0M();
        this.cooldownMs = 300000L;
    }

    public final Object probeNow(HtJ<? super HatchCheckpointProbeStatus> htJ) {
        return runProbe(htJ);
    }

    public /* synthetic */ HatchCheckpointGate(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
