package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass801;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConversationWidgetKinds {
    public static final int $stable = 0;
    public static final ConversationWidgetKinds INSTANCE = new ConversationWidgetKinds();

    public final List<String> standalonePresentations(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        int[] iArr = {0, 1, 2, 3};
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (AnonymousClass801.A0j(i2, abstractC3358CGz)) {
                arrayListA0h.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < 4);
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AnonymousClass801.A0M(((Number) it.next()).intValue()));
        }
        return arrayListA0i;
    }

    public final List<String> registered() {
        int[] iArrA1a = C60P.A1a();
        ArrayList arrayListA11 = C60O.A11(4);
        int i = 0;
        do {
            arrayListA11.add(AnonymousClass801.A0M(iArrA1a[i]));
            i++;
        } while (i < 4);
        return arrayListA11;
    }
}
