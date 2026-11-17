package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass801;
import X.C7384Etj;
import com.facebook.aura.model.HatchWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConversationWidgetRenderers {
    public static final int $stable = 0;
    public static final ConversationWidgetRenderers INSTANCE = new ConversationWidgetRenderers();

    public final ConversationWidgetRenderer rendererFor(HatchWidget hatchWidget) {
        Object next;
        C7384Etj.A0Y(hatchWidget, 0);
        int[] iArr = {0, 1, 2, 3, 4};
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        do {
            arrayList.add(AnonymousClass801.A04(iArr[i]));
            i++;
        } while (i < 5);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConversationWidgetRenderer) next).canRender(hatchWidget)) {
                break;
            }
        }
        return (ConversationWidgetRenderer) next;
    }
}
