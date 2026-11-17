package com.facebook.aura.file.view;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes3.dex */
public abstract class SheetWebRenderState {

    public final class Error extends SheetWebRenderState {
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

    public final class Loading extends SheetWebRenderState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -907524787;
        }
    }

    public final class Success extends SheetWebRenderState {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 1183622164;
        }
    }

    public /* synthetic */ SheetWebRenderState(C06H c06h) {
    }

    public SheetWebRenderState() {
    }
}
