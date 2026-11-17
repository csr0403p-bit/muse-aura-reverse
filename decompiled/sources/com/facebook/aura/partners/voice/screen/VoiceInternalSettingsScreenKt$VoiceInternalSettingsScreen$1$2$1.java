package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1", f = "VoiceInternalSettingsScreen.kt", l = {79}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $resetErrorToast;
    public final /* synthetic */ String $resetToast;
    public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, String str, String str2, HtJ<? super VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = voiceControlsSettingsViewModel;
        this.$resetToast = str;
        this.$resetErrorToast = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1(this.$viewModel, this.$resetToast, this.$resetErrorToast, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Boolean> c22i = this.$viewModel.resetSucceeded;
            final String str = this.$resetToast;
            final String str2 = this.$resetErrorToast;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    String str3;
                    ToastApi toastApi = ToastApi.INSTANCE;
                    if (z) {
                        str3 = str;
                    } else {
                        str3 = str2;
                    }
                    toastApi.showToast(str3);
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
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
