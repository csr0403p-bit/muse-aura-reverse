package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $deleteSession$delegate;
    public final /* synthetic */ HatchSessionItem $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$4$1(HatchSessionItem hatchSessionItem, MutableState<HatchSessionItem> mutableState, MutableState<HatchSessionItem> mutableState2) {
        super(0);
        this.$session = hatchSessionItem;
        this.$actionOverlaySession$delegate = mutableState;
        this.$deleteSession$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(null);
        this.$deleteSession$delegate.Af8(this.$session);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
