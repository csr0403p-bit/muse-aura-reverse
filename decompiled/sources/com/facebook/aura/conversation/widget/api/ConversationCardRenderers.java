package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass801;
import X.C7384Etj;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ConversationCardRenderers {
    public static final int $stable = 0;
    public static final ConversationCardRenderers INSTANCE = new ConversationCardRenderers();

    public final ConversationCardRenderer rendererFor(ConversationCardRequest conversationCardRequest) {
        Object next;
        int i = 0;
        C7384Etj.A0Y(conversationCardRequest, 0);
        int[] iArr = {0, 1};
        ArrayList arrayList = new ArrayList(2);
        do {
            arrayList.add(AnonymousClass801.A01(iArr[i]));
            i++;
        } while (i < 2);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConversationCardRenderer) next).canRender(conversationCardRequest)) {
                break;
            }
        }
        return (ConversationCardRenderer) next;
    }
}
