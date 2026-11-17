package com.airbnb.lottie.compose;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.B33;
import X.B3E;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C6837Eap;
import X.C6ys;
import X.C78T;
import X.C8j3;
import X.EnumC10460Hji;
import X.EnumC1100AYl;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.HzS;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LottieAnimatableImpl$animate$2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ EnumC1100AYl $cancellationBehavior;
    public final /* synthetic */ B3E $clipSpec;
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ boolean $continueFromPreviousAnimate;
    public final /* synthetic */ float $initialProgress;
    public final /* synthetic */ int $iteration;
    public final /* synthetic */ int $iterations;
    public final /* synthetic */ boolean $reverseOnRepeat;
    public final /* synthetic */ float $speed;
    public final /* synthetic */ boolean $useCompositionFrameRate;
    public int label;
    public final /* synthetic */ B33 this$0;

    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EnumC1100AYl $cancellationBehavior;
        public final /* synthetic */ int $iteration;
        public final /* synthetic */ int $iterations;
        public final /* synthetic */ HoC $parentJob;
        public int label;
        public final /* synthetic */ B33 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LX/AYl;LX/HoC;IILX/B33;LX/HtJ<-Lcom/airbnb/lottie/compose/LottieAnimatableImpl$animate$2$1;>;)V */
        public AnonymousClass1(B33 b33, EnumC1100AYl enumC1100AYl, HtJ htJ, HoC hoC, int i, int i2) {
            super(2, htJ);
            this.$cancellationBehavior = enumC1100AYl;
            this.$parentJob = hoC;
            this.$iterations = i;
            this.$iteration = i2;
            this.this$0 = b33;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$cancellationBehavior, htJ, this.$parentJob, this.$iterations, this.$iteration);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Path cross not found for [B:13:0x0022, B:22:0x0055], limit reached: 26 */
        /* JADX WARN: Path cross not found for [B:22:0x0055, B:13:0x0022], limit reached: 26 */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L17
                if (r0 != r4) goto L58
                X.Hwg.A00(r7)
            Lc:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r0 = r7.booleanValue()
                if (r0 != 0) goto L1a
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L17:
                X.Hwg.A00(r7)
            L1a:
                X.AYl r0 = r6.$cancellationBehavior
                int r0 = r0.ordinal()
                if (r0 != r4) goto L55
                X.HoC r0 = r6.$parentJob
                boolean r0 = r0.isActive()
                if (r0 != 0) goto L55
                int r2 = r6.$iteration
            L2c:
                X.B33 r3 = r6.this$0
                r6.label = r4
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r2 != r0) goto L4a
                X.BUf r2 = new X.BUf
                r2.<init>(r3)
                X.78T r1 = r6.getContext()
                X.BND r0 = X.BOO.A00
                r1.get(r0)
                java.lang.Object r7 = X.AvW.A01(r2, r6)
            L47:
                if (r7 != r5) goto Lc
                return r5
            L4a:
                r1 = 3
                X.BUf r0 = new X.BUf
                r0.<init>(r3, r2, r1)
                java.lang.Object r7 = X.AvW.A01(r0, r6)
                goto L47
            L55:
                int r2 = r6.$iterations
                goto L2c
            L58:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/B33;IIZFLX/B3E;LX/Eap;FZZLX/AYl;LX/HtJ<-Lcom/airbnb/lottie/compose/LottieAnimatableImpl$animate$2;>;)V */
    public LottieAnimatableImpl$animate$2(C6837Eap c6837Eap, B33 b33, EnumC1100AYl enumC1100AYl, B3E b3e, HtJ htJ, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(1, htJ);
        this.this$0 = b33;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$clipSpec = b3e;
        this.$composition = c6837Eap;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = enumC1100AYl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        B33 b33 = this.this$0;
        int i = this.$iteration;
        int i2 = this.$iterations;
        boolean z = this.$reverseOnRepeat;
        float f = this.$speed;
        B3E b3e = this.$clipSpec;
        return new LottieAnimatableImpl$animate$2(this.$composition, b33, this.$cancellationBehavior, b3e, htJ, f, this.$initialProgress, i, i2, z, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Unit> htJ) {
        return ((LottieAnimatableImpl$animate$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C78T c78t;
        MutableState mutableState;
        Object objValueOf;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                MutableState.A07(this.$iteration, this.this$0.A04);
                MutableState.A07(this.$iterations, this.this$0.A05);
                MutableState.A09(this.$reverseOnRepeat, this.this$0.A09);
                this.this$0.A0A.Af8(Float.valueOf(this.$speed));
                B33 b33 = this.this$0;
                b33.A01.Af8(this.$clipSpec);
                B33 b332 = this.this$0;
                b332.A02.Af8(this.$composition);
                B33.A00(this.this$0, this.$initialProgress);
                MutableState.A09(this.$useCompositionFrameRate, this.this$0.A0B);
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.A06.Af8(Long.MIN_VALUE);
                }
                if (this.$composition != null) {
                    boolean zIsInfinite = Float.isInfinite(this.$speed);
                    B33 b333 = this.this$0;
                    if (zIsInfinite) {
                        B33.A00(b333, C1BO.A01(b333.A0C));
                        MutableState.A09(false, this.this$0.A03);
                        B33 b334 = this.this$0;
                        int i2 = this.$iterations;
                        mutableState = b334.A04;
                        objValueOf = Integer.valueOf(i2);
                    } else {
                        MutableState.A09(true, b333.A03);
                        int iOrdinal = this.$cancellationBehavior.ordinal();
                        if (iOrdinal == 1) {
                            c78t = HwK.A00;
                        } else {
                            if (iOrdinal != 0) {
                                throw C3cG.A0q();
                            }
                            c78t = C6ys.A00;
                        }
                        HoC hoCA02 = HzS.A02(getContext());
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cancellationBehavior, null, hoCA02, this.$iterations, this.$iteration);
                        this.label = 1;
                        if (GAo.A00(this, c78t, anonymousClass1) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    mutableState = this.this$0.A03;
                    objValueOf = false;
                }
                mutableState.Af8(objValueOf);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C3cG.A1H(this);
            mutableState = this.this$0.A03;
            objValueOf = false;
            mutableState.Af8(objValueOf);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            MutableState.A09(false, this.this$0.A03);
            throw th;
        }
    }
}
