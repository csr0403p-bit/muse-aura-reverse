package com.facebook.aura.settings.importmemory;

import X.C06G;

/* loaded from: classes2.dex */
public interface ImportMemoryEffect {

    public final class NavigateToConversation implements ImportMemoryEffect {
        public static final int $stable = 0;
        public static final NavigateToConversation INSTANCE = new NavigateToConversation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToConversation);
        }

        public String toString() {
            return "NavigateToConversation";
        }

        public int hashCode() {
            return -781029607;
        }
    }

    public final class ShowToast extends C06G implements ImportMemoryEffect {
        public static final int $stable = 0;
        public final int messageResId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShowToast) && this.messageResId == ((ShowToast) obj).messageResId);
        }

        public static /* synthetic */ ShowToast copy$default(ShowToast showToast, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showToast.messageResId;
            }
            return new ShowToast(i);
        }

        public final int component1() {
            return this.messageResId;
        }

        public final ShowToast copy(int i) {
            return new ShowToast(i);
        }

        public final int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            return this.messageResId;
        }

        public ShowToast(int i) {
            this.messageResId = i;
        }

        public String toString() {
            return super.toString();
        }
    }
}
