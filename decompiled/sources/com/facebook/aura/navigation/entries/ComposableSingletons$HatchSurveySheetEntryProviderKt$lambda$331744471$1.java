package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.HatchSurveySheetKey;
import com.facebook.aura.survey.HatchSurveySheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$HatchSurveySheetEntryProviderKt$lambda$-331744471$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchSurveySheetEntryProviderKt$lambda$331744471$1 extends AbstractC7559F3s implements G0W<HatchSurveySheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSurveySheetEntryProviderKt$lambda$331744471$1 INSTANCE = new ComposableSingletons$HatchSurveySheetEntryProviderKt$lambda$331744471$1();

    public ComposableSingletons$HatchSurveySheetEntryProviderKt$lambda$331744471$1() {
        super(3);
    }

    public final void invoke(HatchSurveySheetKey hatchSurveySheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchSurveySheetKt.HatchSurveySheet(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchSurveySheetKey hatchSurveySheetKey, BFM bfm, Integer num) {
        invoke(hatchSurveySheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
