package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $completed$delegate;
    public final /* synthetic */ MutableState<HatchSurveyPage> $currentPage$delegate;
    public final /* synthetic */ HatchSurveyPage $initialPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$2$1(HatchSurveyPage hatchSurveyPage, MutableState<Boolean> mutableState, MutableState<HatchSurveyPage> mutableState2) {
        super(1);
        this.$initialPage = hatchSurveyPage;
        this.$completed$delegate = mutableState;
        this.$currentPage$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchSurveyPage hatchSurveyPage = this.$initialPage;
        final MutableState<Boolean> mutableState = this.$completed$delegate;
        final MutableState<HatchSurveyPage> mutableState2 = this.$currentPage$delegate;
        return new C78g() { // from class: com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchSurveyPage hatchSurveyPage2;
                if (!MutableState.A0A(mutableState) && (hatchSurveyPage2 = (HatchSurveyPage) mutableState2.getValue()) != null) {
                    HatchSurveyLogger.INSTANCE.logDismiss(hatchSurveyPage2);
                }
                HatchSurveyController.INSTANCE.onDismissed(hatchSurveyPage, MutableState.A0A(mutableState));
            }
        };
    }
}
