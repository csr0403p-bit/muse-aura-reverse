package com.facebook.aura.conversation.widget.api;

import X.C7384Etj;

/* loaded from: classes.dex */
public interface ConversationPresentationResolution {

    public final class FileCard implements ConversationPresentationResolution {
        public static final int $stable = 0;
        public static final FileCard INSTANCE = new FileCard();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FileCard);
        }

        public String toString() {
            return "FileCard";
        }

        public int hashCode() {
            return 2108309358;
        }
    }

    public final class Pending implements ConversationPresentationResolution {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return -1976307563;
        }
    }

    public final class Ready implements ConversationPresentationResolution {
        public static final int $stable = 0;
        public final ConversationPresentationContent content;

        public Ready(ConversationPresentationContent conversationPresentationContent) {
            C7384Etj.A0Y(conversationPresentationContent, 0);
            this.content = conversationPresentationContent;
        }

        public final ConversationPresentationContent getContent() {
            return this.content;
        }
    }
}
