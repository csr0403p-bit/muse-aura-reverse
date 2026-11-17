package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1", f = "VoiceAnnouncementEffects.kt", l = {87}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<VoiceCallStart, Unit>> $currentCallStarter$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<? extends G0U<? super VoiceCallStart, Unit>> c1bo, HtJ<? super VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = voiceAnnouncementViewModel;
        this.$currentCallStarter$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1(this.$viewModel, this.$currentCallStarter$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<VoiceCallStart> c22i = this.$viewModel.callStarts;
            final C1BO<G0U<VoiceCallStart, Unit>> c1bo = this.$currentCallStarter$delegate;
            C20Z<? super VoiceCallStart> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((VoiceCallStart) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(VoiceCallStart voiceCallStart, HtJ<? super Unit> htJ) {
                    C1BO.A0B(c1bo).invoke(voiceCallStart);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
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
        return ((VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
