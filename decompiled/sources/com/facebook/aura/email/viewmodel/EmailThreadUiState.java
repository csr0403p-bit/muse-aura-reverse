package com.facebook.aura.email.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailThread;

/* loaded from: classes.dex */
public interface EmailThreadUiState {

    public final class Error implements EmailThreadUiState {
        public static final Error INSTANCE = new Error();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public String toString() {
            return "Error";
        }

        public int hashCode() {
            return 1680954557;
        }
    }

    public final class Loaded extends C06G implements EmailThreadUiState {
        public final EmailMessage forwardTarget;
        public final EmailMessage replyTarget;
        public final EmailThread thread;

        public Loaded(EmailThread emailThread, EmailMessage emailMessage, EmailMessage emailMessage2) {
            C7384Etj.A0Y(emailThread, 0);
            this.thread = emailThread;
            this.replyTarget = emailMessage;
            this.forwardTarget = emailMessage2;
        }

        public final Loaded copy(EmailThread emailThread, EmailMessage emailMessage, EmailMessage emailMessage2) {
            C7384Etj.A0Y(emailThread, 0);
            return new Loaded(emailThread, emailMessage, emailMessage2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.thread, loaded.thread) || !C7384Etj.areEqual(this.replyTarget, loaded.replyTarget) || !C7384Etj.areEqual(this.forwardTarget, loaded.forwardTarget)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, EmailThread emailThread, EmailMessage emailMessage, EmailMessage emailMessage2, int i, Object obj) {
            if ((i & 1) != 0) {
                emailThread = loaded.thread;
            }
            if ((i & 2) != 0) {
                emailMessage = loaded.replyTarget;
            }
            if ((i & 4) != 0) {
                emailMessage2 = loaded.forwardTarget;
            }
            return loaded.copy(emailThread, emailMessage, emailMessage2);
        }

        public final EmailThread component1() {
            return this.thread;
        }

        public final EmailMessage component2() {
            return this.replyTarget;
        }

        public final EmailMessage component3() {
            return this.forwardTarget;
        }

        public final EmailMessage getForwardTarget() {
            return this.forwardTarget;
        }

        public final EmailMessage getReplyTarget() {
            return this.replyTarget;
        }

        public final EmailThread getThread() {
            return this.thread;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0E(this.thread) + AnonymousClass006.A0D(this.replyTarget)) * 31) + C06G.A04(this.forwardTarget);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements EmailThreadUiState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1989702991;
        }
    }
}
