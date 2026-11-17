package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes.dex */
public interface SaveViewerNameResult {

    public final class Failed extends C06G implements SaveViewerNameResult {
        public static final int $stable = 0;
        public final String detail;
        public final String reason;

        public Failed(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            this.detail = str;
            this.reason = str2;
        }

        public final Failed copy(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return new Failed(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.detail, failed.detail) || !C7384Etj.areEqual(this.reason, failed.reason)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.detail;
            }
            if ((i & 2) != 0) {
                str2 = failed.reason;
            }
            C7384Etj.A0Y(str2, 1);
            return new Failed(str, str2);
        }

        public final String component1() {
            return this.detail;
        }

        public final String component2() {
            return this.reason;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.reason, AnonymousClass006.A0G(this.detail) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class InvalidName extends C06G implements SaveViewerNameResult {
        public static final int $stable = 0;
        public final String detail;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof InvalidName) && C7384Etj.areEqual(this.detail, ((InvalidName) obj).detail));
        }

        public static /* synthetic */ InvalidName copy$default(InvalidName invalidName, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidName.detail;
            }
            return new InvalidName(str);
        }

        public final String component1() {
            return this.detail;
        }

        public final InvalidName copy(String str) {
            return new InvalidName(str);
        }

        public final String getDetail() {
            return this.detail;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.detail);
        }

        public InvalidName(String str) {
            this.detail = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success implements SaveViewerNameResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return -1543996057;
        }
    }
}
