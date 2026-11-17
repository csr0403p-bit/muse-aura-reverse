package com.facebook.aura.conversation.widget.api;

import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.C10650I0u;
import X.C20Q;
import X.C20Y;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.nudge.ConversationCardTimelineProvider;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ConversationTimelineContents {
    public static final int $stable = 0;
    public static final ConversationTimelineContents INSTANCE = new ConversationTimelineContents();

    public final C20Q<AHD<ConversationTimelineContent>> observe(ConversationTimelineContext conversationTimelineContext) {
        C7384Etj.A0Y(conversationTimelineContext, 0);
        if (!C7BY.A0j(conversationTimelineContext.conversationId)) {
            ArrayList arrayList = new ArrayList(1);
            int i = new int[]{0}[0];
            if (i != 0) {
                throw AnonymousClass005.A0c(i);
            }
            arrayList.add(new C10650I0u(2, new ConversationTimelineContents$observe$sources$1$1(null), ConversationCardTimelineProvider.INSTANCE.source().observe(conversationTimelineContext)));
            if (!arrayList.isEmpty()) {
                return new ConversationTimelineContents$observe$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayList).toArray(new C20Q[0]));
            }
        }
        return new C20Y(AHI.A01);
    }
}
