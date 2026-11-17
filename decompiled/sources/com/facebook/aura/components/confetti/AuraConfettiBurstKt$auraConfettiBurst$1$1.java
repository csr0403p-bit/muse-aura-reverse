package com.facebook.aura.components.confetti;

import X.AHD;
import X.AOW;
import X.ASj;
import X.AT1;
import X.AT5;
import X.AXN;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B6A;
import X.C1DG;
import X.C2HU;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.components.confetti.AuraConfettiBurstKt$auraConfettiBurst$1$1", f = "AuraConfettiBurst.kt", l = {98, 99, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraConfettiBurstKt$auraConfettiBurst$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $active;
    public final /* synthetic */ float $burstRadius;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ int $particleCount;
    public final /* synthetic */ AT1<C1DG> $particleHeight;
    public final /* synthetic */ AT1<C1DG> $particleWidth;
    public final /* synthetic */ MutableState<List<ConfettiParticle>> $particles$delegate;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ MutableState<Boolean> $wasActive$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraConfettiBurstKt$auraConfettiBurst$1$1(boolean z, AXN axn, int i, float f, AHD<B6A> ahd, AT1<C1DG> at1, AT1<C1DG> at12, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, MutableState<List<ConfettiParticle>> mutableState2, HtJ<? super AuraConfettiBurstKt$auraConfettiBurst$1$1> htJ) {
        super(2, htJ);
        this.$active = z;
        this.$density = axn;
        this.$particleCount = i;
        this.$burstRadius = f;
        this.$palette = ahd;
        this.$particleWidth = at1;
        this.$particleHeight = at12;
        this.$progress = at5;
        this.$wasActive$delegate = mutableState;
        this.$particles$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraConfettiBurstKt$auraConfettiBurst$1$1(this.$active, this.$density, this.$particleCount, this.$burstRadius, this.$palette, this.$particleWidth, this.$particleHeight, this.$progress, this.$wasActive$delegate, this.$particles$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA04;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$active || MutableState.A0A((MutableState) this.$wasActive$delegate)) {
                if (!this.$active) {
                    AT5<Float, AOW> at5 = this.$progress;
                    Float fA0l = AnonymousClass001.A0l();
                    this.label = 3;
                    objA04 = at5.A04(fA0l, this);
                }
                MutableState.A09(this.$active, this.$wasActive$delegate);
                return Unit.INSTANCE;
            }
            MutableState<List<ConfettiParticle>> mutableState = this.$particles$delegate;
            AXN axn = this.$density;
            int i2 = this.$particleCount;
            float f = this.$burstRadius;
            C7384Etj.A0Y(axn, 1);
            mutableState.Af8(AuraConfettiBurstKt.createConfetti(axn, i2, AXN.A01(axn, f), this.$palette, this.$particleWidth, this.$particleHeight));
            AT5<Float, AOW> at52 = this.$progress;
            Float fA0l2 = AnonymousClass001.A0l();
            this.label = 1;
            if (at52.A04(fA0l2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            AT5<Float, AOW> at53 = this.$progress;
            Float fA0m = AnonymousClass001.A0m();
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, 700);
            this.label = 2;
            objA04 = AnonymousClass002.A0i(at53, aSjA0J, fA0m, this, null);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                MutableState.A09(this.$active, this.$wasActive$delegate);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            AT5<Float, AOW> at532 = this.$progress;
            Float fA0m2 = AnonymousClass001.A0m();
            ASj aSjA0J2 = AnonymousClass002.A0J(C2HU.A02, 700);
            this.label = 2;
            objA04 = AnonymousClass002.A0i(at532, aSjA0J2, fA0m2, this, null);
        }
        if (objA04 == enumC10460Hji) {
            return enumC10460Hji;
        }
        MutableState.A09(this.$active, this.$wasActive$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraConfettiBurstKt$auraConfettiBurst$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
