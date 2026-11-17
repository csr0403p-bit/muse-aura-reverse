package com.facebook.aura.conversation.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.model.HatchSearchResultData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$7$1 extends C7438Evz implements G0V<HatchSearchResultData, HatchCitationAnalytics, Unit> {
    public HatchConversationContentKt$HatchConversationContent$7$1(Object obj) {
        super(2, obj, HatchConversationViewModel.class, "showSourcesBottomSheet", "showSourcesBottomSheet(Lcom/facebook/aura/model/HatchSearchResultData;Lcom/facebook/aura/analytics/hatch/HatchCitationAnalytics;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics) {
        ((HatchConversationViewModel) AnonymousClass006.A0o(hatchSearchResultData, this)).showSourcesBottomSheet(hatchSearchResultData, hatchCitationAnalytics);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics) {
        invoke2(hatchSearchResultData, hatchCitationAnalytics);
        return Unit.INSTANCE;
    }
}
