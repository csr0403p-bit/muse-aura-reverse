package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onSearchClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public final /* synthetic */ MutableState<Boolean> $shouldFocusSearchField$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onSearchClick$1$1(MutableState<SidePanelMode> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$mode$delegate = mutableState;
        this.$shouldFocusSearchField$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchScreen.CONVERSATION_HISTORY, HatchComponent.SEARCH_BUTTON, null, null, null);
        MutableState<SidePanelMode> mutableState = this.$mode$delegate;
        SidePanelMode sidePanelMode = SidePanelMode.SEARCH;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(sidePanelMode);
        MutableState.A09(true, this.$shouldFocusSearchField$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
