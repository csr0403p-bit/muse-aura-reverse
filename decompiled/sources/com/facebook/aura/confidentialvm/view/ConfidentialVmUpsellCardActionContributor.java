package com.facebook.aura.confidentialvm.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C78N;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public final class ConfidentialVmUpsellCardActionContributor implements ConversationPresentationActionContributor {
    public static final ConfidentialVmUpsellCardActionContributor INSTANCE = new ConfidentialVmUpsellCardActionContributor();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor
    public ConversationPresentationAction rememberAction(ConversationPresentationActionContext conversationPresentationActionContext, BFM bfm, int i) {
        bfm.AgE(622810323);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA1K = AnonymousClass003.A1K(bfm, abstractC3358CGzA0h, auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = new ConfidentialVmUpsellCardAction(abstractC3358CGzA0h, auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        ConfidentialVmUpsellCardAction confidentialVmUpsellCardAction = (ConfidentialVmUpsellCardAction) objAaT;
        AnonymousClass002.A19(bfm);
        return confidentialVmUpsellCardAction;
    }
}
