package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.BRg;
import java.util.List;

/* loaded from: classes.dex */
public interface ConversationPresentationAction {
    BRg cardModifier(String str, List<String> list);

    boolean handle(String str, PresentationLinkSource presentationLinkSource);

    public abstract class DefaultImpls {
        @Deprecated
        public static BRg cardModifier(ConversationPresentationAction conversationPresentationAction, String str, List<String> list) {
            AnonymousClass003.A0x(str, list);
            return BRg.A00;
        }
    }

    /* renamed from: com.facebook.aura.conversation.widget.api.ConversationPresentationAction$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
    }
}
