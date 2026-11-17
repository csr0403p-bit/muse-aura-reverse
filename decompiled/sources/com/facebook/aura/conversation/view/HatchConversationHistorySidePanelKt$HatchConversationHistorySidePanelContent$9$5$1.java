package com.facebook.aura.conversation.view;

import X.C7438Evz;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$5$1 extends C7438Evz implements Function0<Unit> {
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$5$1(Object obj) {
        super(0, obj, HatchSearchViewModel.class, "loadMoreSearchResults", "loadMoreSearchResults()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchSearchViewModel) this.receiver).loadMoreSearchResults();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
