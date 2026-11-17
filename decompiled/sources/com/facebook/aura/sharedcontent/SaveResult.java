package com.facebook.aura.sharedcontent;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes3.dex */
public interface SaveResult {

    public final class Failed extends C06G implements SaveResult {
        public static final int $stable = 0;
        public final String message;

        public Failed(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final Failed copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Failed(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            C7384Etj.A0Y(str, 0);
            return new Failed(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success implements SaveResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 459002841;
        }
    }
}
