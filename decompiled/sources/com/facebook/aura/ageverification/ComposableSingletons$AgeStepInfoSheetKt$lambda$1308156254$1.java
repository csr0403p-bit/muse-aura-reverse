package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.AgeVerificationHowSelfiesWorkSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.ageverification.ComposableSingletons$AgeStepInfoSheetKt$lambda$-1308156254$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AgeStepInfoSheetKt$lambda$1308156254$1 extends AbstractC7559F3s implements G0W<AgeVerificationHowSelfiesWorkSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgeStepInfoSheetKt$lambda$1308156254$1 INSTANCE = new ComposableSingletons$AgeStepInfoSheetKt$lambda$1308156254$1();

    public ComposableSingletons$AgeStepInfoSheetKt$lambda$1308156254$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgeVerificationHowSelfiesWorkSheetKey ageVerificationHowSelfiesWorkSheetKey, BFM bfm, Integer num) {
        invoke(ageVerificationHowSelfiesWorkSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AgeVerificationHowSelfiesWorkSheetKey ageVerificationHowSelfiesWorkSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AgeStepInfoSheetKt.AgeStepInfoSheet(AgeStepInfo.HOW_SELFIES_WORK, null, bfm, 6, 2);
        } else {
            bfm.Afo();
        }
    }
}
