package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.activation.view.AuraActivationScreenKt$AuraActivationScreen$2$1", f = "AuraActivationScreen.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraActivationScreenKt$AuraActivationScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnNavigateBack$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentPerformLogOut$delegate;
    public final /* synthetic */ String $joinWaitlistFailedMessage;
    public final /* synthetic */ View $view;
    public final /* synthetic */ C20Q<AuraActivationViewModel.ViewEffect> $viewEffect;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationScreenKt$AuraActivationScreen$2$1(C20Q<? extends AuraActivationViewModel.ViewEffect> c20q, View view, String str, C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, HtJ<? super AuraActivationScreenKt$AuraActivationScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewEffect = c20q;
        this.$view = view;
        this.$joinWaitlistFailedMessage = str;
        this.$currentOnNavigateBack$delegate = c1bo;
        this.$currentPerformLogOut$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraActivationScreenKt$AuraActivationScreen$2$1(this.$viewEffect, this.$view, this.$joinWaitlistFailedMessage, this.$currentOnNavigateBack$delegate, this.$currentPerformLogOut$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<AuraActivationViewModel.ViewEffect> c20q = this.$viewEffect;
            final View view = this.$view;
            final String str = this.$joinWaitlistFailedMessage;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnNavigateBack$delegate;
            final C1BO<Function0<Unit>> c1bo2 = this.$currentPerformLogOut$delegate;
            C20Z<? super AuraActivationViewModel.ViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.activation.view.AuraActivationScreenKt$AuraActivationScreen$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraActivationViewModel.ViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(AuraActivationViewModel.ViewEffect viewEffect, HtJ<? super Unit> htJ) {
                    C1BO<Function0<Unit>> c1bo3;
                    if (viewEffect instanceof AuraActivationViewModel.ViewEffect.NavigateBack) {
                        c1bo3 = c1bo;
                    } else {
                        if (viewEffect instanceof AuraActivationViewModel.ViewEffect.JoinWaitlistFailed) {
                            AnonymousClass007.A0n(view, AuraToast.Companion, str);
                            return Unit.INSTANCE;
                        }
                        if (viewEffect instanceof AuraActivationViewModel.ViewEffect.LogOut) {
                            c1bo3 = c1bo2;
                        } else {
                            throw C3cG.A0q();
                        }
                    }
                    C1BO.A0D(c1bo3);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraActivationScreenKt$AuraActivationScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
