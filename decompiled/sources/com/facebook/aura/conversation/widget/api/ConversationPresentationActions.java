package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.AnonymousClass801;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ConversationPresentationActions {
    public static final int $stable = 0;
    public static final ConversationPresentationActions INSTANCE = new ConversationPresentationActions();

    public final List<ConversationPresentationActionContributor> contributors() {
        int[] iArrA1a = AnonymousClass003.A1a();
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        do {
            arrayList.add(AnonymousClass801.A02(iArrA1a[i]));
            i++;
        } while (i < 2);
        return arrayList;
    }
}
