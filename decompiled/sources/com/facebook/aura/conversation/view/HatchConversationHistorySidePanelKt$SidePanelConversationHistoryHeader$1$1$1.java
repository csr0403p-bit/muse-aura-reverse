package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.tabs.AuraSidePanelCollapseState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SidePanelConversationHistoryHeader$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraSidePanelCollapseState $collapseState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$SidePanelConversationHistoryHeader$1$1$1(AuraSidePanelCollapseState auraSidePanelCollapseState) {
        super(0);
        this.$collapseState = auraSidePanelCollapseState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$collapseState.setSideChatsCollapsed(!MutableState.A0A(r1.sideChatsCollapsed$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
