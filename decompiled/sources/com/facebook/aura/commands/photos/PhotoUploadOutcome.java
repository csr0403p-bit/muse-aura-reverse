package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes3.dex */
public interface PhotoUploadOutcome {

    public final class Failed extends C06G implements PhotoUploadOutcome {
        public final String message;
        public final boolean retryable;

        public Failed(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
            this.retryable = z;
        }

        public final Failed copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Failed(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.message, failed.message) || this.retryable != failed.retryable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            if ((i & 2) != 0) {
                z = failed.retryable;
            }
            C7384Etj.A0Y(str, 0);
            return new Failed(str, z);
        }

        public final String component1() {
            return this.message;
        }

        public final boolean component2() {
            return this.retryable;
        }

        public final String getMessage() {
            return this.message;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.message), this.retryable);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success implements PhotoUploadOutcome {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 1035163595;
        }
    }
}
