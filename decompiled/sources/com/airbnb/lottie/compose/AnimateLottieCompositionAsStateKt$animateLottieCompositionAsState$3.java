package com.airbnb.lottie.compose;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B33;
import X.B36;
import X.B3E;
import X.C18j;
import X.C3UX;
import X.C3UY;
import X.C6837Eap;
import X.C8j3;
import X.EnumC10460Hji;
import X.EnumC1100AYl;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $actualSpeed;
    public final /* synthetic */ C18j $animatable;
    public final /* synthetic */ EnumC1100AYl $cancellationBehavior;
    public final /* synthetic */ B3E $clipSpec;
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ int $iterations;
    public final /* synthetic */ boolean $restartOnPlay;
    public final /* synthetic */ boolean $reverseOnRepeat;
    public final /* synthetic */ boolean $useCompositionFrameRate;
    public final /* synthetic */ MutableState<Boolean> $wasPlaying$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZZLX/18j;LX/Eap;IZFLX/B3E;LX/AYl;ZLandroidx/compose/runtime/MutableState<Ljava/lang/Boolean;>;LX/HtJ<-Lcom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3;>;)V */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(MutableState mutableState, C6837Eap c6837Eap, C18j c18j, EnumC1100AYl enumC1100AYl, B3E b3e, HtJ htJ, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, htJ);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = c18j;
        this.$composition = c6837Eap;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$clipSpec = b3e;
        this.$cancellationBehavior = enumC1100AYl;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        boolean z = this.$isPlaying;
        boolean z2 = this.$restartOnPlay;
        C18j c18j = this.$animatable;
        C6837Eap c6837Eap = this.$composition;
        int i = this.$iterations;
        boolean z3 = this.$reverseOnRepeat;
        float f = this.$actualSpeed;
        B3E b3e = this.$clipSpec;
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$wasPlaying$delegate, c6837Eap, c18j, this.$cancellationBehavior, b3e, htJ, f, i, z, z2, z3, this.$useCompositionFrameRate);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isPlaying && !MutableState.A0A((MutableState) this.$wasPlaying$delegate) && this.$restartOnPlay) {
                C18j c18j = this.$animatable;
                this.label = 1;
                B33 b33 = (B33) c18j;
                MutableState mutableState = b33.A02;
                float fA00 = B36.A00((C6837Eap) mutableState.getValue(), (B3E) b33.A01.getValue(), C8j3.A06(b33.A0A));
                Object objA01 = b33.A00.A01(C3UY.A02, this, new LottieAnimatableImpl$snapTo$2((C6837Eap) mutableState.getValue(), b33, null, fA00, 1, !AnonymousClass002.A1M((fA00 > C8j3.A06(((B33) c18j).A07) ? 1 : (fA00 == C8j3.A06(((B33) c18j).A07) ? 0 : -1)))));
                if (objA01 != enumC10460Hji) {
                    objA01 = Unit.INSTANCE;
                }
                if (objA01 != enumC10460Hji) {
                    objA01 = Unit.INSTANCE;
                }
                if (objA01 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        MutableState.A09(this.$isPlaying, this.$wasPlaying$delegate);
        if (this.$isPlaying) {
            C18j c18j2 = this.$animatable;
            C6837Eap c6837Eap = this.$composition;
            int i2 = this.$iterations;
            boolean z = this.$reverseOnRepeat;
            float f = this.$actualSpeed;
            B3E b3e = this.$clipSpec;
            float fA06 = C8j3.A06(((B33) c18j2).A07);
            EnumC1100AYl enumC1100AYl = this.$cancellationBehavior;
            boolean z2 = this.$useCompositionFrameRate;
            this.label = 2;
            B33 b332 = (B33) c18j2;
            Object objA012 = b332.A00.A01(C3UY.A02, this, new LottieAnimatableImpl$animate$2(c6837Eap, b332, enumC1100AYl, b3e, null, f, fA06, MutableState.A02(b332.A04), i2, z, z2, false));
            if (objA012 != enumC10460Hji) {
                objA012 = Unit.INSTANCE;
            }
            if (objA012 == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
