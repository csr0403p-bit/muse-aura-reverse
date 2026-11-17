package com.facebook.aura.nudge;

import X.AnonymousClass801;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class ConversationNudgesKt {
    public static final ConversationNudge findNudge(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        int[] iArr = {0, 1, 2, 3, 4};
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        do {
            arrayList.add(AnonymousClass801.A09(iArr[i]));
            i++;
        } while (i < 5);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(((ConversationNudge) next).getId())) {
                break;
            }
        }
        return (ConversationNudge) next;
    }
}
