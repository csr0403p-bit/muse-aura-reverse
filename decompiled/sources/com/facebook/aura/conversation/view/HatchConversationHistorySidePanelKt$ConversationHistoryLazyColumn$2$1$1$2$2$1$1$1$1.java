package com.facebook.aura.conversation.view;

import X.AGH;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$1$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ MutableState<AaC> $actionOverlayBounds$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ HatchSessionItem $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$1$1(HatchSessionItem hatchSessionItem, MutableState<HatchSessionItem> mutableState, MutableState<AaC> mutableState2) {
        super(1);
        this.$session = hatchSessionItem;
        this.$actionOverlaySession$delegate = mutableState;
        this.$actionOverlayBounds$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        AnonymousClass006.A0b(aaC).logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.THREE_DOTS_MENU, null, AGH.A0D(new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), new HxE(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), "false"), new HxE(HatchMetadataKey.IS_ARCHIVED.getValue(), "true")), null);
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        HatchSessionItem hatchSessionItem = this.$session;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(hatchSessionItem);
        this.$actionOverlayBounds$delegate.Af8(aaC);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
