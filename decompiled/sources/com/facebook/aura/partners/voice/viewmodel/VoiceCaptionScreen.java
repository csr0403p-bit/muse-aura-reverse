package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface VoiceCaptionScreen {

    public final class Conversation extends C06G implements VoiceCaptionScreen {
        public static final int $stable = 0;
        public final String thread;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Conversation) && C7384Etj.areEqual(this.thread, ((Conversation) obj).thread));
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversation.thread;
            }
            return new Conversation(str);
        }

        public final String component1() {
            return this.thread;
        }

        public final Conversation copy(String str) {
            return new Conversation(str);
        }

        public final String getThread() {
            return this.thread;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.thread);
        }

        public Conversation(String str) {
            this.thread = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Hidden implements VoiceCaptionScreen {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public String toString() {
            return "Hidden";
        }

        public int hashCode() {
            return -603354753;
        }
    }

    public final class TabRoot implements VoiceCaptionScreen {
        public static final int $stable = 0;
        public static final TabRoot INSTANCE = new TabRoot();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TabRoot);
        }

        public String toString() {
            return "TabRoot";
        }

        public int hashCode() {
            return 304574690;
        }
    }
}
