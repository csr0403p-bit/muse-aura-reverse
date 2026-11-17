package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onMainChatClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onMainChatSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onMainChatClick$1$1(Function0<Unit> function0) {
        super(0);
        this.$onMainChatSelected = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.MAIN_CHAT_BUTTON, null, AnonymousClass007.A0d(HatchMetadataKey.IS_ARCHIVED.getValue(), "false", new HxE(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), "true")), null);
        this.$onMainChatSelected.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
