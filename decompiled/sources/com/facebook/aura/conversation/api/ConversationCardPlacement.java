package com.facebook.aura.conversation.api;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface ConversationCardPlacement {

    public final class ActiveConversation implements ConversationCardPlacement {
        public static final int $stable = 0;
        public static final ActiveConversation INSTANCE = new ActiveConversation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ActiveConversation);
        }

        public String toString() {
            return "ActiveConversation";
        }

        public int hashCode() {
            return -1074491980;
        }
    }

    /* loaded from: classes2.dex */
    public final class AnyConversation implements ConversationCardPlacement {
        public static final int $stable = 0;
        public static final AnyConversation INSTANCE = new AnyConversation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AnyConversation);
        }

        public String toString() {
            return "AnyConversation";
        }

        public int hashCode() {
            return 779240804;
        }
    }

    /* loaded from: classes2.dex */
    public final class Conversation extends C06G implements ConversationCardPlacement {
        public static final int $stable = 0;
        public final String conversationId;

        public Conversation(String str) {
            C7384Etj.A0Y(str, 0);
            this.conversationId = str;
        }

        public final Conversation copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Conversation(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Conversation) && C7384Etj.areEqual(this.conversationId, ((Conversation) obj).conversationId));
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversation.conversationId;
            }
            C7384Etj.A0Y(str, 0);
            return new Conversation(str);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class PrimaryChat implements ConversationCardPlacement {
        public static final int $stable = 0;
        public static final PrimaryChat INSTANCE = new PrimaryChat();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryChat);
        }

        public String toString() {
            return "PrimaryChat";
        }

        public int hashCode() {
            return -1547758641;
        }
    }
}
