package com.facebook.aura.conversation.viewmodel;

import X.C06G;
import X.C0KA;

/* loaded from: classes.dex */
public interface HatchConversationViewEffect {

    /* loaded from: classes5.dex */
    public final class DictatedTextLanded implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final DictatedTextLanded INSTANCE = new DictatedTextLanded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DictatedTextLanded);
        }

        public String toString() {
            return "DictatedTextLanded";
        }

        public int hashCode() {
            return -603923655;
        }
    }

    /* loaded from: classes5.dex */
    public final class DictationCaptureStarted implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final DictationCaptureStarted INSTANCE = new DictationCaptureStarted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DictationCaptureStarted);
        }

        public String toString() {
            return "DictationCaptureStarted";
        }

        public int hashCode() {
            return -1109548928;
        }
    }

    /* loaded from: classes5.dex */
    public final class SessionDeleted implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final SessionDeleted INSTANCE = new SessionDeleted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionDeleted);
        }

        public String toString() {
            return "SessionDeleted";
        }

        public int hashCode() {
            return 1060991645;
        }
    }

    /* loaded from: classes5.dex */
    public final class ShowAttachmentLimitReached implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final ShowAttachmentLimitReached INSTANCE = new ShowAttachmentLimitReached();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowAttachmentLimitReached);
        }

        public String toString() {
            return "ShowAttachmentLimitReached";
        }

        public int hashCode() {
            return 1575653425;
        }
    }

    /* loaded from: classes5.dex */
    public final class ShowAttachmentUploadFailed implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final ShowAttachmentUploadFailed INSTANCE = new ShowAttachmentUploadFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowAttachmentUploadFailed);
        }

        public String toString() {
            return "ShowAttachmentUploadFailed";
        }

        public int hashCode() {
            return 139579576;
        }
    }

    public final class ShowDictationFailed extends C06G implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public final int messageRes;
        public final boolean opensKeyboard;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShowDictationFailed) {
                    ShowDictationFailed showDictationFailed = (ShowDictationFailed) obj;
                    if (this.opensKeyboard != showDictationFailed.opensKeyboard || this.messageRes != showDictationFailed.messageRes) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ShowDictationFailed copy$default(ShowDictationFailed showDictationFailed, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = showDictationFailed.opensKeyboard;
            }
            if ((i2 & 2) != 0) {
                i = showDictationFailed.messageRes;
            }
            return new ShowDictationFailed(z, i);
        }

        public final boolean component1() {
            return this.opensKeyboard;
        }

        public final int component2() {
            return this.messageRes;
        }

        public final ShowDictationFailed copy(boolean z, int i) {
            return new ShowDictationFailed(z, i);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final boolean getOpensKeyboard() {
            return this.opensKeyboard;
        }

        public int hashCode() {
            return C0KA.A02(this.opensKeyboard) + this.messageRes;
        }

        public ShowDictationFailed(boolean z, int i) {
            this.opensKeyboard = z;
            this.messageRes = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class ShowDictationMicSilenced implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final ShowDictationMicSilenced INSTANCE = new ShowDictationMicSilenced();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowDictationMicSilenced);
        }

        public String toString() {
            return "ShowDictationMicSilenced";
        }

        public int hashCode() {
            return 1244652770;
        }
    }

    /* loaded from: classes5.dex */
    public final class ShowDictationNoSpeech implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final ShowDictationNoSpeech INSTANCE = new ShowDictationNoSpeech();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowDictationNoSpeech);
        }

        public String toString() {
            return "ShowDictationNoSpeech";
        }

        public int hashCode() {
            return -1989368981;
        }
    }

    public final class ShowLiveSessionAttachmentMessage extends C06G implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public final int messageRes;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShowLiveSessionAttachmentMessage) && this.messageRes == ((ShowLiveSessionAttachmentMessage) obj).messageRes);
        }

        public static /* synthetic */ ShowLiveSessionAttachmentMessage copy$default(ShowLiveSessionAttachmentMessage showLiveSessionAttachmentMessage, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showLiveSessionAttachmentMessage.messageRes;
            }
            return new ShowLiveSessionAttachmentMessage(i);
        }

        public final int component1() {
            return this.messageRes;
        }

        public final ShowLiveSessionAttachmentMessage copy(int i) {
            return new ShowLiveSessionAttachmentMessage(i);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public int hashCode() {
            return this.messageRes;
        }

        public ShowLiveSessionAttachmentMessage(int i) {
            this.messageRes = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class ShowUnsendFailed implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public static final ShowUnsendFailed INSTANCE = new ShowUnsendFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowUnsendFailed);
        }

        public String toString() {
            return "ShowUnsendFailed";
        }

        public int hashCode() {
            return 588715093;
        }
    }

    public final class ShowUploadSizeExceeded extends C06G implements HatchConversationViewEffect {
        public static final int $stable = 0;
        public final int maxSizeMb;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShowUploadSizeExceeded) && this.maxSizeMb == ((ShowUploadSizeExceeded) obj).maxSizeMb);
        }

        public static /* synthetic */ ShowUploadSizeExceeded copy$default(ShowUploadSizeExceeded showUploadSizeExceeded, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showUploadSizeExceeded.maxSizeMb;
            }
            return new ShowUploadSizeExceeded(i);
        }

        public final int component1() {
            return this.maxSizeMb;
        }

        public final ShowUploadSizeExceeded copy(int i) {
            return new ShowUploadSizeExceeded(i);
        }

        public final int getMaxSizeMb() {
            return this.maxSizeMb;
        }

        public int hashCode() {
            return this.maxSizeMb;
        }

        public ShowUploadSizeExceeded(int i) {
            this.maxSizeMb = i;
        }

        public String toString() {
            return super.toString();
        }
    }
}
