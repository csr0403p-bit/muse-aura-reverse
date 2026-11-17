package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.OnboardingVariantSheetKey;
import com.facebook.aura.onboarding.view.OnboardingVariantSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$OnboardingVariantSheetEntryProviderKt$lambda$-327350823$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$OnboardingVariantSheetEntryProviderKt$lambda$327350823$1 extends AbstractC7559F3s implements G0W<OnboardingVariantSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$OnboardingVariantSheetEntryProviderKt$lambda$327350823$1 INSTANCE = new ComposableSingletons$OnboardingVariantSheetEntryProviderKt$lambda$327350823$1();

    public ComposableSingletons$OnboardingVariantSheetEntryProviderKt$lambda$327350823$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(OnboardingVariantSheetKey onboardingVariantSheetKey, BFM bfm, Integer num) {
        invoke(onboardingVariantSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(OnboardingVariantSheetKey onboardingVariantSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            OnboardingVariantSheetKt.OnboardingVariantSheet(bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
