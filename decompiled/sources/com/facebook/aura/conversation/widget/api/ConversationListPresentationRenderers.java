package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.flights.FlightResultsListRendererProvider;
import com.facebook.aura.model.GenericListPresentation;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConversationListPresentationRenderers {
    public static final int $stable = 0;
    public static final ConversationListPresentationRenderers INSTANCE = new ConversationListPresentationRenderers();

    public final ConversationListPresentationRenderer rendererFor(GenericListPresentation genericListPresentation) {
        Object next;
        C7384Etj.A0Y(genericListPresentation, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(FlightResultsListRendererProvider.INSTANCE.renderer());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConversationListPresentationRenderer) next).canRender(genericListPresentation)) {
                break;
            }
        }
        return (ConversationListPresentationRenderer) next;
    }
}
