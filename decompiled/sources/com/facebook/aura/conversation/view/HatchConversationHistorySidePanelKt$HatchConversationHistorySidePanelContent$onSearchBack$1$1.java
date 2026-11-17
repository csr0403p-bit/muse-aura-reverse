package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onSearchBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public final /* synthetic */ MutableState<String> $searchQuery$delegate;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;
    public final /* synthetic */ MutableState<Boolean> $shouldFocusSearchField$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onSearchBack$1$1(HatchSearchViewModel hatchSearchViewModel, MutableState<String> mutableState, MutableState<SidePanelMode> mutableState2, MutableState<Boolean> mutableState3) {
        super(0);
        this.$searchViewModel = hatchSearchViewModel;
        this.$searchQuery$delegate = mutableState;
        this.$mode$delegate = mutableState2;
        this.$shouldFocusSearchField$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SEARCH, null, HatchScreen.SEARCH_RESULTS, HatchComponent.CLOSE_BUTTON, null, null);
        this.$searchViewModel.clearSearch();
        MutableState<String> mutableState = this.$searchQuery$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8("");
        this.$mode$delegate.Af8(SidePanelMode.DEFAULT);
        MutableState.A09(false, this.$shouldFocusSearchField$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
