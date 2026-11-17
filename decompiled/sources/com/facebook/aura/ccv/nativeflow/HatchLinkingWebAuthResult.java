package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface HatchLinkingWebAuthResult {

    public final class Available extends C06G implements HatchLinkingWebAuthResult {
        public final String attemptId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.attemptId, ((Available) obj).attemptId));
        }

        public static /* synthetic */ Available copy$default(Available available, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = available.attemptId;
            }
            return new Available(str);
        }

        public final String component1() {
            return this.attemptId;
        }

        public final Available copy(String str) {
            return new Available(str);
        }

        public final String getAttemptId() {
            return this.attemptId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.attemptId);
        }

        public Available(String str) {
            this.attemptId = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Failed implements HatchLinkingWebAuthResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 275224635;
        }
    }

    public final class NotOffered implements HatchLinkingWebAuthResult {
        public static final NotOffered INSTANCE = new NotOffered();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotOffered);
        }

        public String toString() {
            return "NotOffered";
        }

        public int hashCode() {
            return 515735206;
        }
    }
}
