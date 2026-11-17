package com.facebook.aura.file.view;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes3.dex */
public abstract class DocxWebRenderState {

    public final class Error extends DocxWebRenderState {
        public static final int $stable = 0;
        public final String message;

        public Error(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public final class Loading extends DocxWebRenderState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1805747236;
        }
    }

    public final class Success extends DocxWebRenderState {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 285399715;
        }
    }

    public /* synthetic */ DocxWebRenderState(C06H c06h) {
    }

    public DocxWebRenderState() {
    }
}
