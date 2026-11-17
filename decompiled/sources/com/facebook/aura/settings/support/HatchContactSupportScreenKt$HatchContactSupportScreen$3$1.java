package com.facebook.aura.settings.support;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$3$1", f = "HatchContactSupportScreen.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$HatchContactSupportScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentSubmit$delegate;
    public final /* synthetic */ String $failureTitle;
    public final /* synthetic */ String $retryLabel;
    public final /* synthetic */ HatchContactSupportViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$HatchContactSupportScreen$3$1(HatchContactSupportViewModel hatchContactSupportViewModel, String str, String str2, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchContactSupportScreenKt$HatchContactSupportScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchContactSupportViewModel;
        this.$retryLabel = str;
        this.$failureTitle = str2;
        this.$currentSubmit$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchContactSupportScreenKt$HatchContactSupportScreen$3$1(this.$viewModel, this.$retryLabel, this.$failureTitle, this.$currentSubmit$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchContactSupportViewModel.ViewEffect> c22i = this.$viewModel.viewEffect;
            final String str = this.$retryLabel;
            final String str2 = this.$failureTitle;
            final C1BO<Function0<Unit>> c1bo = this.$currentSubmit$delegate;
            C20Z<? super HatchContactSupportViewModel.ViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchContactSupportViewModel.ViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchContactSupportViewModel.ViewEffect viewEffect, HtJ<? super Unit> htJ) {
                    AuraToastOption.Button button = new AuraToastOption.Button(str, null, false, true);
                    AuraToast.Duration duration = AuraToast.Duration.LONG;
                    final C1BO<Function0<Unit>> c1bo2 = c1bo;
                    ToastApi._toasts.AhV(new AuraToast.ToastArgs(str2, null, duration, null, button, new View.OnClickListener() { // from class: com.facebook.aura.settings.support.HatchContactSupportScreenKt.HatchContactSupportScreen.3.1.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HatchContactSupportScreenKt.logContactSupportClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.RETRY_BUTTON, null);
                            C1BO.A0D(c1bo2);
                        }
                    }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
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
        return ((HatchContactSupportScreenKt$HatchContactSupportScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
