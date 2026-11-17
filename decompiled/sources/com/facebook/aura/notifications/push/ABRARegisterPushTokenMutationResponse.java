package com.facebook.aura.notifications.push;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class ABRARegisterPushTokenMutationResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "abra-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = 206279221;

    public final class AbraRegisterPushToken extends A7N {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbraRegisterPushToken(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final String getErrorMessage$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.AIJ(-1938755376);
        }

        public final boolean getSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.ADk(-1867169789);
        }

        public final String getTokenId$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.AIJ(-1103804127);
        }

        public final boolean hasSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
            return this.innerData.ANA(-1867169789);
        }
    }

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return ABRARegisterPushTokenMutationResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return ABRARegisterPushTokenMutationResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABRARegisterPushTokenMutationResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final AbraRegisterPushToken getAbraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() {
        A7O a7oAIK = this.innerData.AIK(-1807433983);
        if (a7oAIK != null) {
            return new AbraRegisterPushToken(a7oAIK);
        }
        return null;
    }
}
