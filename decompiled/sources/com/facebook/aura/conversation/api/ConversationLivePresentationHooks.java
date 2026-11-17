package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.shopping.repo.ShoppingResultsLivePresentationHook;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConversationLivePresentationHooks {
    public static final int $stable = 0;
    public static final ConversationLivePresentationHooks INSTANCE = new ConversationLivePresentationHooks();

    public final boolean isRestoredPresentation(List<HatchMessage> list, String str, String str2) {
        List<HatchWidgetPresentation> list2;
        boolean zA1a = AnonymousClass002.A1a(list, str);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HatchMessage> it = list.iterator();
            while (it.hasNext()) {
                HatchMessage hatchMessageA0K = C60Q.A0K(it);
                if (C7384Etj.areEqual(hatchMessageA0K.id, str2) && (list2 = hatchMessageA0K.presentations) != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                    Iterator<HatchWidgetPresentation> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(it2.next().presentationId)) {
                            return zA1a;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void notifyDelivered(AbstractC3358CGz abstractC3358CGz, HatchWidgetPresentation hatchWidgetPresentation) {
        int iA1b = AnonymousClass004.A1b(abstractC3358CGz, hatchWidgetPresentation);
        int i = new int[]{iA1b}[iA1b];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        ShoppingResultsLivePresentationHook.INSTANCE.onLivePresentation(abstractC3358CGz, hatchWidgetPresentation);
    }
}
