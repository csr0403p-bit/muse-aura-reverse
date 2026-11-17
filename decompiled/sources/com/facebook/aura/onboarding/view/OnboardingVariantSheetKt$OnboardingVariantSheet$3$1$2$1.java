package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $defaultVariantSubtitle;
    public final /* synthetic */ String $defaultVariantTitle;
    public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
    public final /* synthetic */ MutableState<List<String>> $variants$delegate;

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $defaultVariantSubtitle;
        public final /* synthetic */ String $defaultVariantTitle;
        public final /* synthetic */ MutableState<String> $selectedVariant$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, MutableState<String> mutableState) {
            super(3);
            this.$defaultVariantTitle = str;
            this.$defaultVariantSubtitle = str2;
            this.$selectedVariant$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                String str = this.$defaultVariantTitle;
                String str2 = this.$defaultVariantSubtitle;
                boolean zA1M = AnonymousClass002.A1M(MutableState.A01((MutableState) this.$selectedVariant$delegate));
                MutableState<String> mutableState = this.$selectedVariant$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                OnboardingVariantSheetKt.VariantRow(str, str2, zA1M, (Function0) objAaT, bfm, 3126);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$defaultVariantTitle, this.$defaultVariantSubtitle, this.$selectedVariant$delegate), -256051267);
        List<String> value = this.$variants$delegate.getValue();
        MutableState<String> mutableState = this.$selectedVariant$delegate;
        Iterator<String> it = value.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1(AnonymousClass005.A0j(it), mutableState), -1419004019);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1(String str, String str2, MutableState<String> mutableState, MutableState<List<String>> mutableState2) {
        super(1);
        this.$defaultVariantTitle = str;
        this.$defaultVariantSubtitle = str2;
        this.$selectedVariant$delegate = mutableState;
        this.$variants$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
