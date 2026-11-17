package com.facebook.aura.vds.compose.input;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC1052ASw;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C1115Aae;
import X.C1116Aaf;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$3$1", f = "AuraCodeInput.kt", l = {151, 167}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ float $shakeAmplitudePx;
    public final /* synthetic */ AT5<Float, AOW> $shakeOffset;
    public int label;

    /* renamed from: com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$3$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C1115Aae<Float>, Unit> {
        public final /* synthetic */ float $shakeAmplitudePx;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1115Aae<Float> c1115Aae) {
            C7384Etj.A0Y(c1115Aae, 0);
            c1115Aae.A00 = 400;
            c1115Aae.A00(Float.valueOf(-this.$shakeAmplitudePx), 0);
            c1115Aae.A00(Float.valueOf(this.$shakeAmplitudePx), 67);
            c1115Aae.A00(Float.valueOf((-this.$shakeAmplitudePx) * 0.75f), 133);
            c1115Aae.A00(Float.valueOf(this.$shakeAmplitudePx * 0.75f), 200);
            c1115Aae.A00(Float.valueOf((-this.$shakeAmplitudePx) * 0.5f), VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH);
            c1115Aae.A00(Float.valueOf(this.$shakeAmplitudePx * 0.5f), 333);
            c1115Aae.A00(AnonymousClass005.A0a(), 400);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(1);
            this.$shakeAmplitudePx = f;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C1115Aae<Float> c1115Aae) {
            invoke2(c1115Aae);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$3$1(boolean z, AT5<Float, AOW> at5, float f, HtJ<? super AuraCodeInputKt$AuraCodeInput$3$1> htJ) {
        super(2, htJ);
        this.$isError = z;
        this.$shakeOffset = at5;
        this.$shakeAmplitudePx = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraCodeInputKt$AuraCodeInput$3$1(this.$isError, this.$shakeOffset, this.$shakeAmplitudePx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA04;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean z = this.$isError;
            AT5<Float, AOW> at5 = this.$shakeOffset;
            if (z) {
                Float f = new Float(0.0f);
                C1116Aaf c1116AafA00 = AbstractC1052ASw.A00(new AnonymousClass1(this.$shakeAmplitudePx));
                this.label = 1;
                objA04 = AnonymousClass002.A0i(at5, c1116AafA00, f, this, null);
            } else {
                Float f2 = new Float(0.0f);
                this.label = 2;
                objA04 = at5.A04(f2, this);
            }
            if (objA04 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraCodeInputKt$AuraCodeInput$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
