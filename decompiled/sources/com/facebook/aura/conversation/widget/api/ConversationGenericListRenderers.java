package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.rentalcars.RentalCarResultsRendererProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConversationGenericListRenderers {
    public static final int $stable = 0;
    public static final ConversationGenericListRenderers INSTANCE = new ConversationGenericListRenderers();

    public final ConversationGenericListRenderer rendererFor(GenericListPresentation genericListPresentation) {
        Object next;
        C7384Etj.A0Y(genericListPresentation, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(RentalCarResultsRendererProvider.INSTANCE.renderer());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConversationGenericListRenderer) next).canRender(genericListPresentation)) {
                break;
            }
        }
        return (ConversationGenericListRenderer) next;
    }
}
