package com.facebook.aura.activation.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class RedeemInviteCodeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;

    public final class Companion {
        public final C9hr<RedeemInviteCodeRequestJson> serializer() {
            return RedeemInviteCodeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RedeemInviteCodeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new RedeemInviteCodeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RedeemInviteCodeRequestJson) && C7384Etj.areEqual(this.code, ((RedeemInviteCodeRequestJson) obj).code));
    }

    public /* synthetic */ RedeemInviteCodeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(RedeemInviteCodeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.code = str;
    }

    public static /* synthetic */ RedeemInviteCodeRequestJson copy$default(RedeemInviteCodeRequestJson redeemInviteCodeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemInviteCodeRequestJson.code;
        }
        C7384Etj.A0Y(str, 0);
        return new RedeemInviteCodeRequestJson(str);
    }

    public final String component1() {
        return this.code;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public RedeemInviteCodeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.code = str;
    }
}
