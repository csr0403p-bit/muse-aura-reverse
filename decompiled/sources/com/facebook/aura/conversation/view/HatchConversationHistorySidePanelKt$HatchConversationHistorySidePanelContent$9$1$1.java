package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$1$1(MutableState<SidePanelMode> mutableState) {
        super(0);
        this.$mode$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<SidePanelMode> mutableState = this.$mode$delegate;
        SidePanelMode sidePanelMode = SidePanelMode.DEFAULT;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(sidePanelMode);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
