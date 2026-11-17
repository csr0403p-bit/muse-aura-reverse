package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ConversationWidgetKindProvider {

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean supportsStandalonePresentation(ConversationWidgetKindProvider conversationWidgetKindProvider, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 1);
            return false;
        }
    }

    String kind();

    boolean supportsStandalonePresentation(AbstractC3358CGz abstractC3358CGz);

    /* renamed from: com.facebook.aura.conversation.widget.api.ConversationWidgetKindProvider$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$supportsStandalonePresentation(ConversationWidgetKindProvider conversationWidgetKindProvider, AbstractC3358CGz abstractC3358CGz) {
            return false;
        }

        public static /* synthetic */ boolean access$supportsStandalonePresentation$jd(ConversationWidgetKindProvider conversationWidgetKindProvider, AbstractC3358CGz abstractC3358CGz) {
            return false;
        }
    }
}
