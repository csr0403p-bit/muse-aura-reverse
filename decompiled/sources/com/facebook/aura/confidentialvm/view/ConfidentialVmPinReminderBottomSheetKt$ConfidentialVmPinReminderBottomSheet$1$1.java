package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewEffect;
import com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1", f = "ConfidentialVmPinReminderBottomSheet.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmPinReminderViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1(ConfidentialVmPinReminderViewModel confidentialVmPinReminderViewModel, AuraNavigator auraNavigator, C0dx c0dx, HtJ<? super ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmPinReminderViewModel;
        this.$navigator = auraNavigator;
        this.$haptics = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1(this.$viewModel, this.$navigator, this.$haptics, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConfidentialVmPinReminderViewEffect> c22i = this.$viewModel.viewEffects;
            final AuraNavigator auraNavigator = this.$navigator;
            final C0dx c0dx = this.$haptics;
            C20Z<? super ConfidentialVmPinReminderViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConfidentialVmPinReminderViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConfidentialVmPinReminderViewEffect confidentialVmPinReminderViewEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(confidentialVmPinReminderViewEffect, ConfidentialVmPinReminderViewEffect.VerificationSucceeded.INSTANCE)) {
                        auraNavigator.back();
                    } else if (C7384Etj.areEqual(confidentialVmPinReminderViewEffect, ConfidentialVmPinReminderViewEffect.VerificationFailed.INSTANCE)) {
                        c0dx.AXr(AuraHaptics.FAILURE);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
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
        return ((ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
