package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass801;
import X.C7384Etj;
import com.facebook.aura.model.HatchPresentationData;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConversationPresentationCardRenderers {
    public static final int $stable = 0;
    public static final ConversationPresentationCardRenderers INSTANCE = new ConversationPresentationCardRenderers();

    public final ConversationPresentationCardRenderer rendererFor(HatchPresentationData hatchPresentationData) {
        Object next;
        C7384Etj.A0Y(hatchPresentationData, 0);
        int[] iArr = {0, 1, 2};
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        do {
            arrayList.add(AnonymousClass801.A03(iArr[i]));
            i++;
        } while (i < 3);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConversationPresentationCardRenderer) next).canRender(hatchPresentationData)) {
                break;
            }
        }
        return (ConversationPresentationCardRenderer) next;
    }
}
