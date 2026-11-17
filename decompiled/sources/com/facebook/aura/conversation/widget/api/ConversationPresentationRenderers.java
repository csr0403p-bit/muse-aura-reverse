package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import com.facebook.aura.conversation.widget.api.ConversationPresentationResolution;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConversationPresentationRenderers {
    public static final int $stable = 0;
    public static final ConversationPresentationRenderers INSTANCE = new ConversationPresentationRenderers();

    public final ConversationPresentationContent contentFor(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        Iterator it = new ArrayList(0).iterator();
        while (it.hasNext()) {
            ConversationPresentationContent conversationPresentationContentContentFor = ((ConversationPresentationRenderer) it.next()).contentFor(hatchWidgetPresentation);
            if (conversationPresentationContentContentFor != null) {
                return conversationPresentationContentContentFor;
            }
        }
        return null;
    }

    public final ConversationPresentationResolution rememberResolution(HatchWidgetPresentation hatchWidgetPresentation, AbstractC3358CGz abstractC3358CGz, BFM bfm, int i) {
        AnonymousClass003.A0u(hatchWidgetPresentation, abstractC3358CGz);
        bfm.AgE(1461519669);
        ConversationPresentationResolution.FileCard fileCard = ConversationPresentationResolution.FileCard.INSTANCE;
        AnonymousClass002.A19(bfm);
        return fileCard;
    }
}
