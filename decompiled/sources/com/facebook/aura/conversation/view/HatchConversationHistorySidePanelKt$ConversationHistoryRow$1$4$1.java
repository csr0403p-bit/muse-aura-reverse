package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.G0U;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryRow$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<AaC> $bounds$delegate;
    public final /* synthetic */ G0U<AaC, Unit> $onLongPress;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ ThreadsView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryRow$1$4$1(HatchSessionItem hatchSessionItem, ThreadsView threadsView, G0U<? super AaC, Unit> g0u, MutableState<AaC> mutableState) {
        super(0);
        this.$session = hatchSessionItem;
        this.$view = threadsView;
        this.$onLongPress = g0u;
        this.$bounds$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.THREAD_ITEM, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), new HxE(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), "false"), this.$view == ThreadsView.ARCHIVED));
        G0U<AaC, Unit> g0u = this.$onLongPress;
        MutableState<AaC> mutableState = this.$bounds$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        g0u.invoke(mutableState.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
