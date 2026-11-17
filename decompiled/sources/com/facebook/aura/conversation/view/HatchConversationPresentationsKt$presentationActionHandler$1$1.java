package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$presentationActionHandler$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ AHD<ConversationPresentationAction> $presentationActions;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$presentationActionHandler$1$1(G0U<? super HatchSendMessage, Unit> g0u, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, C3UX c3ux, AHD<? extends ConversationPresentationAction> ahd, String str, String str2) {
        super(2);
        this.$onWidgetSendMessage = g0u;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$coroutineScope = c3ux;
        this.$presentationActions = ahd;
        this.$sideChatSessionId = str;
        this.$presentationId = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        HatchConversationWidgetsKt.routePresentationAction(str, str2, this.$onWidgetSendMessage, this.$userSession, this.$context, this.$navigator, this.$coroutineScope, this.$presentationActions, this.$sideChatSessionId, null, this.$presentationId);
    }
}
