package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
/* loaded from: classes4.dex */
public final class RedeemInviteCodeScreenJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String disclaimer;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<RedeemInviteCodeScreenJson> serializer() {
            return RedeemInviteCodeScreenJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || redeemInviteCodeScreenJson.title != null) {
            c9j5.AAP(redeemInviteCodeScreenJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !"".equals(redeemInviteCodeScreenJson.subtitle)) {
            c9j5.AAV(redeemInviteCodeScreenJson.subtitle, c9iZ, 1);
        }
        if (zAfR || !"".equals(redeemInviteCodeScreenJson.disclaimer)) {
            c9j5.AAV(redeemInviteCodeScreenJson.disclaimer, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RedeemInviteCodeScreenJson) {
                RedeemInviteCodeScreenJson redeemInviteCodeScreenJson = (RedeemInviteCodeScreenJson) obj;
                if (!C7384Etj.areEqual(this.title, redeemInviteCodeScreenJson.title) || !C7384Etj.areEqual(this.subtitle, redeemInviteCodeScreenJson.subtitle) || !C7384Etj.areEqual(this.disclaimer, redeemInviteCodeScreenJson.disclaimer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RedeemInviteCodeScreenJson copy$default(RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemInviteCodeScreenJson.title;
        }
        if ((i & 2) != 0) {
            str2 = redeemInviteCodeScreenJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = redeemInviteCodeScreenJson.disclaimer;
        }
        return redeemInviteCodeScreenJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.disclaimer, AnonymousClass005.A0I(this.subtitle, AnonymousClass006.A0G(this.title) * 31));
    }

    public RedeemInviteCodeScreenJson(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.title = str;
        this.subtitle = str2;
        this.disclaimer = str3;
    }

    public final RedeemInviteCodeScreenJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        return new RedeemInviteCodeScreenJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RedeemInviteCodeScreenJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.title = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.disclaimer = "";
        } else {
            this.disclaimer = str3;
        }
    }

    public /* synthetic */ RedeemInviteCodeScreenJson(String str, String str2, String str3, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public RedeemInviteCodeScreenJson() {
        this(null, "", "");
    }
}
