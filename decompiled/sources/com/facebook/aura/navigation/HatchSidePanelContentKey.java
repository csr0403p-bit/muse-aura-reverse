package com.facebook.aura.navigation;

/* loaded from: classes.dex */
public interface HatchSidePanelContentKey {

    public final class ConversationHistory implements HatchSidePanelContentKey {
        public static final int $stable = 0;
        public static final ConversationHistory INSTANCE = new ConversationHistory();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConversationHistory);
        }

        public String toString() {
            return "ConversationHistory";
        }

        public int hashCode() {
            return -1458623680;
        }
    }
}
