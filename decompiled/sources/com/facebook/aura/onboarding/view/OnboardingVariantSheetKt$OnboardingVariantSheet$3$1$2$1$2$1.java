package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
    public final /* synthetic */ String $variant;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1(String str, MutableState<String> mutableState) {
        super(3);
        this.$variant = str;
        this.$selectedVariant$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            String str = this.$variant;
            boolean zAreEqual = C7384Etj.areEqual(this.$selectedVariant$delegate.getValue(), this.$variant);
            boolean zA65 = bfm.A65(this.$variant);
            String str2 = this.$variant;
            MutableState<String> mutableState = this.$selectedVariant$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1$1$1(str2, mutableState);
                bfm.Ai0(objAaT);
            }
            OnboardingVariantSheetKt.VariantRow(str, null, zAreEqual, (Function0) objAaT, bfm, 48);
            return;
        }
        bfm.Afo();
    }
}
