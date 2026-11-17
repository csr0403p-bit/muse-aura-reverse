package com.facebook.aura.identity.dances;

import X.AHD;
import X.AHI;
import X.AbstractC3358CGz;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarDancesRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<AHD<HatchAvatarDance>> _dances;
    public final C1BN<AHD<HatchAvatarDance>> dances;
    public final SingleFlight fetch;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        public final HatchAvatarDancesRepository getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAvatarDancesRepository) abstractC3358CGz.A03(HatchAvatarDancesRepository.class, new Function0() { // from class: com.facebook.aura.identity.dances.HatchAvatarDancesRepository$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new HatchAvatarDancesRepository(abstractC3358CGz);
                }
            });
        }

        public static final HatchAvatarDancesRepository getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new HatchAvatarDancesRepository(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.dances.HatchAvatarDancesRepository", f = "HatchAvatarDancesRepository.kt", l = {33}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$1, reason: invalid class name */
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
            return HatchAvatarDancesRepository.this.load(this);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.fetch.clearAndCancelAll();
        this._dances.Af8(AHI.A01);
    }

    public final C1BN<AHD<HatchAvatarDance>> getDances() {
        return this.dances;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.identity.dances.HatchAvatarDancesRepository.AnonymousClass1
            if (r0 == 0) goto L55
            r6 = r8
            com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$1 r6 = (com.facebook.aura.identity.dances.HatchAvatarDancesRepository.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L5b
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L32
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L32
            r4 = 1
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L37:
            X.Hwg.A00(r1)
            com.facebook.aura.dancingavatars.gating.DancingAvatarsGating r0 = com.facebook.aura.dancingavatars.gating.DancingAvatarsGating.INSTANCE
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L32
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.fetch
            r0 = 0
            com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$result$1 r1 = new com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$result$1
            r1.<init>(r7, r0)
            r6.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r6)
            if (r1 != r5) goto L21
            return r5
        L55:
            com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$1 r6 = new com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$1
            r6.<init>(r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.dances.HatchAvatarDancesRepository.load(X.HtJ):java.lang.Object");
    }

    public /* synthetic */ HatchAvatarDancesRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public HatchAvatarDancesRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(AHI.A01);
        this._dances = c9286GCnA01;
        this.dances = C3Pi.A00(c9286GCnA01);
        this.fetch = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }
}
