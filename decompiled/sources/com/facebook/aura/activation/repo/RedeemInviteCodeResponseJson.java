package com.facebook.aura.activation.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RedeemInviteCodeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String waitlist_status;

    public final class Companion {
        public final C9hr<RedeemInviteCodeResponseJson> serializer() {
            return RedeemInviteCodeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(RedeemInviteCodeResponseJson redeemInviteCodeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || redeemInviteCodeResponseJson.waitlist_status != null) {
            c9j5.AAP(redeemInviteCodeResponseJson.waitlist_status, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RedeemInviteCodeResponseJson) && C7384Etj.areEqual(this.waitlist_status, ((RedeemInviteCodeResponseJson) obj).waitlist_status));
    }

    public static /* synthetic */ RedeemInviteCodeResponseJson copy$default(RedeemInviteCodeResponseJson redeemInviteCodeResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemInviteCodeResponseJson.waitlist_status;
        }
        return new RedeemInviteCodeResponseJson(str);
    }

    public final String component1() {
        return this.waitlist_status;
    }

    public final RedeemInviteCodeResponseJson copy(String str) {
        return new RedeemInviteCodeResponseJson(str);
    }

    public final String getWaitlist_status() {
        return this.waitlist_status;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.waitlist_status);
    }

    public /* synthetic */ RedeemInviteCodeResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.waitlist_status = null;
        } else {
            this.waitlist_status = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RedeemInviteCodeResponseJson(String str) {
        this.waitlist_status = str;
    }

    public /* synthetic */ RedeemInviteCodeResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public RedeemInviteCodeResponseJson() {
        this(null);
    }
}
