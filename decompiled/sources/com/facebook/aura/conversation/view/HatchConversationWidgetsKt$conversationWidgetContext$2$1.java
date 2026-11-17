package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$conversationWidgetContext$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, this.$sessionId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$conversationWidgetContext$2$1(AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
