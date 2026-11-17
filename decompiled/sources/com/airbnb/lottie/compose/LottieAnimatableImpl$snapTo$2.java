package com.airbnb.lottie.compose;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.B33;
import X.C6837Eap;
import X.G0U;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LottieAnimatableImpl$snapTo$2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ int $iteration;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ boolean $resetLastFrameNanos;
    public int label;
    public final /* synthetic */ B33 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/B33;LX/Eap;FIZLX/HtJ<-Lcom/airbnb/lottie/compose/LottieAnimatableImpl$snapTo$2;>;)V */
    public LottieAnimatableImpl$snapTo$2(C6837Eap c6837Eap, B33 b33, HtJ htJ, float f, int i, boolean z) {
        super(1, htJ);
        this.this$0 = b33;
        this.$composition = c6837Eap;
        this.$progress = f;
        this.$iteration = i;
        this.$resetLastFrameNanos = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LottieAnimatableImpl$snapTo$2(this.$composition, this.this$0, htJ, this.$progress, this.$iteration, this.$resetLastFrameNanos);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Unit> htJ) {
        return ((LottieAnimatableImpl$snapTo$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        B33 b33 = this.this$0;
        b33.A02.Af8(this.$composition);
        B33.A00(this.this$0, this.$progress);
        MutableState.A07(this.$iteration, this.this$0.A04);
        MutableState.A09(false, this.this$0.A03);
        if (this.$resetLastFrameNanos) {
            this.this$0.A06.Af8(Long.MIN_VALUE);
        }
        return Unit.INSTANCE;
    }
}
