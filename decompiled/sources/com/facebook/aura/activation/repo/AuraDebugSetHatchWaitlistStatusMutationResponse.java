package com.facebook.aura.activation.repo;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C5b2;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AuraDebugSetHatchWaitlistStatusMutationResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "abra-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = 1866014844;

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return AuraDebugSetHatchWaitlistStatusMutationResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return AuraDebugSetHatchWaitlistStatusMutationResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class XabDebugSetHatchWaitlistStatus extends A7N {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XabDebugSetHatchWaitlistStatus(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final C5b2 getStatus$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo() {
            return (C5b2) this.innerData.AIH(C5b2.A05, -892481550);
        }

        public final boolean getSuccess$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo() {
            return this.innerData.ADk(-1867169789);
        }

        public final boolean hasSuccess$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo() {
            return this.innerData.ANA(-1867169789);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDebugSetHatchWaitlistStatusMutationResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final XabDebugSetHatchWaitlistStatus getXabDebugSetHatchWaitlistStatus$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo() {
        A7O a7oAIK = this.innerData.AIK(-736800912);
        if (a7oAIK != null) {
            return new XabDebugSetHatchWaitlistStatus(a7oAIK);
        }
        return null;
    }
}
