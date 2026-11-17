package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C5303Dfm;
import X.C7Bq;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1", f = "VoiceEmbodimentSystemPip.kt", l = {369}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ComponentActivity $componentActivity;
    public final /* synthetic */ boolean $isCallActive;
    public final /* synthetic */ C1BO<HatchSystemPipPresentationState> $pipPresentationState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1(boolean z, ComponentActivity componentActivity, C1BO<? extends HatchSystemPipPresentationState> c1bo, HtJ<? super VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1> htJ) {
        super(2, htJ);
        this.$isCallActive = z;
        this.$componentActivity = componentActivity;
        this.$pipPresentationState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1(this.$isCallActive, this.$componentActivity, this.$pipPresentationState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isCallActive && this.$pipPresentationState$delegate.getValue() == HatchSystemPipPresentationState.ENTERING) {
                this.label = 1;
                if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        ComponentActivity componentActivity = this.$componentActivity;
        if (componentActivity != null) {
            if (((C5303Dfm) componentActivity.getLifecycle()).A01 == EnumC10573Huf.A05) {
                VoiceEmbodimentSystemPipKt.cancelFailedPipTransition();
            } else if (componentActivity.isInPictureInPictureMode()) {
                HatchSystemPipRuntime.INSTANCE.markPipActive();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
