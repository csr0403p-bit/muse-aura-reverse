package com.facebook.aura.conversation.api;

/* loaded from: classes2.dex */
public interface ConversationCardRequest {
    long getDeadlineElapsedMs();

    String getKey();

    ConversationCardPlacement getPlacement();

    boolean getRemembersDecline();

    String getTypeId();

    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequest$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getRemembersDecline(ConversationCardRequest conversationCardRequest) {
            return true;
        }

        public static /* synthetic */ boolean access$getRemembersDecline$jd(ConversationCardRequest conversationCardRequest) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getRemembersDecline(ConversationCardRequest conversationCardRequest) {
            return true;
        }
    }
}
