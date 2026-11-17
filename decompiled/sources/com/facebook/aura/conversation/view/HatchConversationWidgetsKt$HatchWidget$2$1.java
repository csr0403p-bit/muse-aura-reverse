package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$2$1 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(HatchConversationWidgetsKt.openLetterBriefing(str, this.$userSession, this.$navigator, this.$hostMessageId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$HatchWidget$2$1(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$hostMessageId = str;
    }
}
