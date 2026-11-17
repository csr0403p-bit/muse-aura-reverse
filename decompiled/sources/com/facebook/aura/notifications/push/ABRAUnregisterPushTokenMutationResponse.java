package com.facebook.aura.notifications.push;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class ABRAUnregisterPushTokenMutationResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "abra-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = -627556932;

    public final class AbraUnregisterPushToken extends A7N {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbraUnregisterPushToken(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final String getErrorMessage$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.AIJ(-1938755376);
        }

        public final boolean getSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.ADk(-1867169789);
        }

        public final boolean hasSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.ANA(-1867169789);
        }
    }

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return ABRAUnregisterPushTokenMutationResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return ABRAUnregisterPushTokenMutationResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABRAUnregisterPushTokenMutationResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final AbraUnregisterPushToken getAbraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
        A7O a7oAIK = this.innerData.AIK(-427458680);
        if (a7oAIK != null) {
            return new AbraUnregisterPushToken(a7oAIK);
        }
        return null;
    }
}
