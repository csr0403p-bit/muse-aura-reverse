package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $renameSession$delegate;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ HatchSessionItem $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$1$1(HatchSessionItem hatchSessionItem, MutableState<HatchSessionItem> mutableState, MutableState<String> mutableState2, MutableState<HatchSessionItem> mutableState3) {
        super(0);
        this.$session = hatchSessionItem;
        this.$actionOverlaySession$delegate = mutableState;
        this.$renameText$delegate = mutableState2;
        this.$renameSession$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(null);
        MutableState<String> mutableState2 = this.$renameText$delegate;
        String str = this.$session.title;
        if (str == null) {
            str = "";
        }
        mutableState2.Af8(str);
        this.$renameSession$delegate.Af8(this.$session);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
