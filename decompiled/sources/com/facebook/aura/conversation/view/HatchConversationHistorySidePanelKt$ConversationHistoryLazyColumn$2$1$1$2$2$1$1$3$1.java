package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$3$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ MutableState<AaC> $actionOverlayBounds$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ HatchSessionItem $session;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        HatchSessionItem hatchSessionItem = this.$session;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(hatchSessionItem);
        this.$actionOverlayBounds$delegate.Af8(aaC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$3$1(HatchSessionItem hatchSessionItem, MutableState<HatchSessionItem> mutableState, MutableState<AaC> mutableState2) {
        super(1);
        this.$session = hatchSessionItem;
        this.$actionOverlaySession$delegate = mutableState;
        this.$actionOverlayBounds$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
