package com.facebook.aura.conversation.view;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.settings.CredentialCandidate;

/* loaded from: classes.dex */
public interface SavedCredential {

    public final class NotSaved implements SavedCredential {
        public static final int $stable = 0;
        public static final NotSaved INSTANCE = new NotSaved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotSaved);
        }

        public String toString() {
            return "NotSaved";
        }

        public int hashCode() {
            return -623034766;
        }
    }

    public final class Saved extends C06G implements SavedCredential {
        public static final int $stable = 0;
        public final CredentialCandidate candidate;

        public Saved(CredentialCandidate credentialCandidate) {
            C7384Etj.A0Y(credentialCandidate, 0);
            this.candidate = credentialCandidate;
        }

        public final Saved copy(CredentialCandidate credentialCandidate) {
            C7384Etj.A0Y(credentialCandidate, 0);
            return new Saved(credentialCandidate);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Saved) && C7384Etj.areEqual(this.candidate, ((Saved) obj).candidate));
        }

        public static /* synthetic */ Saved copy$default(Saved saved, CredentialCandidate credentialCandidate, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialCandidate = saved.candidate;
            }
            C7384Etj.A0Y(credentialCandidate, 0);
            return new Saved(credentialCandidate);
        }

        public final CredentialCandidate component1() {
            return this.candidate;
        }

        public final CredentialCandidate getCandidate() {
            return this.candidate;
        }

        public int hashCode() {
            return this.candidate.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unresolved implements SavedCredential {
        public static final int $stable = 0;
        public static final Unresolved INSTANCE = new Unresolved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unresolved);
        }

        public String toString() {
            return "Unresolved";
        }

        public int hashCode() {
            return -1190463217;
        }
    }
}
