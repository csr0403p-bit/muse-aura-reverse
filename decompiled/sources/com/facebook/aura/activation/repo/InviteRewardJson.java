package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class InviteRewardJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String body;
    public final String title;

    public final class Companion {
        public final C9hr<InviteRewardJson> serializer() {
            return InviteRewardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(InviteRewardJson inviteRewardJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(inviteRewardJson.title)) {
            c9j5.AAV(inviteRewardJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(inviteRewardJson.body)) {
            c9j5.AAV(inviteRewardJson.body, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InviteRewardJson) {
                InviteRewardJson inviteRewardJson = (InviteRewardJson) obj;
                if (!C7384Etj.areEqual(this.title, inviteRewardJson.title) || !C7384Etj.areEqual(this.body, inviteRewardJson.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InviteRewardJson copy$default(InviteRewardJson inviteRewardJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteRewardJson.title;
        }
        if ((i & 2) != 0) {
            str2 = inviteRewardJson.body;
        }
        AnonymousClass003.A0u(str, str2);
        return new InviteRewardJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.body, AnonymousClass001.A0G(this.title));
    }

    public InviteRewardJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.body = str2;
    }

    public final InviteRewardJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new InviteRewardJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InviteRewardJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str2;
        }
    }

    public /* synthetic */ InviteRewardJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public InviteRewardJson() {
        this("", "");
    }
}
