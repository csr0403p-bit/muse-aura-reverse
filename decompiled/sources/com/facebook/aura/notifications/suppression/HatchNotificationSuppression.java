package com.facebook.aura.notifications.suppression;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchNotificationSuppression {
    public static final HatchNotificationSuppression INSTANCE = new HatchNotificationSuppression();
    public static volatile ChatOnScreen chatOnScreen;
    public static volatile boolean voiceCallActive;

    public final class ChatOnScreen {
        public final String sideChatId;

        public final String getSideChatId() {
            return this.sideChatId;
        }

        public ChatOnScreen(String str) {
            this.sideChatId = str;
        }
    }

    public final boolean isChatOnScreen(String str) {
        ChatOnScreen chatOnScreen2 = chatOnScreen;
        return chatOnScreen2 != null && C7384Etj.areEqual(chatOnScreen2.sideChatId, str);
    }

    public final boolean isVoiceCallActive() {
        return voiceCallActive;
    }

    public final void setChatOnScreen(String str, boolean z) {
        chatOnScreen = z ? new ChatOnScreen(str) : null;
    }

    public final void setVoiceCallActive(boolean z) {
        voiceCallActive = z;
    }
}
