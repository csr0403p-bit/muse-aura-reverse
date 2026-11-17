package com.facebook.aura.explore.repo;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface IdeaCardShareAttempt {

    public final class Failed extends C06G implements IdeaCardShareAttempt {
        public final boolean retryable;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.retryable == ((Failed) obj).retryable);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = failed.retryable;
            }
            return new Failed(z);
        }

        public final boolean component1() {
            return this.retryable;
        }

        public final Failed copy(boolean z) {
            return new Failed(z);
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            return this.retryable ? 1231 : 1237;
        }

        public Failed(boolean z) {
            this.retryable = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Shared extends C06G implements IdeaCardShareAttempt {
        public final IdeaCardShareResult result;

        public Shared(IdeaCardShareResult ideaCardShareResult) {
            C7384Etj.A0Y(ideaCardShareResult, 0);
            this.result = ideaCardShareResult;
        }

        public final Shared copy(IdeaCardShareResult ideaCardShareResult) {
            C7384Etj.A0Y(ideaCardShareResult, 0);
            return new Shared(ideaCardShareResult);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Shared) && C7384Etj.areEqual(this.result, ((Shared) obj).result));
        }

        public static /* synthetic */ Shared copy$default(Shared shared, IdeaCardShareResult ideaCardShareResult, int i, Object obj) {
            if ((i & 1) != 0) {
                ideaCardShareResult = shared.result;
            }
            C7384Etj.A0Y(ideaCardShareResult, 0);
            return new Shared(ideaCardShareResult);
        }

        public final IdeaCardShareResult component1() {
            return this.result;
        }

        public final IdeaCardShareResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unavailable implements IdeaCardShareAttempt {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1007991272;
        }
    }
}
