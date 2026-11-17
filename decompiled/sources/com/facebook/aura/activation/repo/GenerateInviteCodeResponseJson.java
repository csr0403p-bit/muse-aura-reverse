package com.facebook.aura.activation.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GenerateInviteCodeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final String invite_link;
    public final Integer max_uses;
    public final String share_text;
    public final Integer use_count;

    public final class Companion {
        public final C9hr<GenerateInviteCodeResponseJson> serializer() {
            return GenerateInviteCodeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(GenerateInviteCodeResponseJson generateInviteCodeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || generateInviteCodeResponseJson.code != null) {
            c9j5.AAP(generateInviteCodeResponseJson.code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || generateInviteCodeResponseJson.max_uses != null) {
            c9j5.AAP(generateInviteCodeResponseJson.max_uses, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || generateInviteCodeResponseJson.use_count != null) {
            c9j5.AAP(generateInviteCodeResponseJson.use_count, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || generateInviteCodeResponseJson.invite_link != null) {
            c9j5.AAP(generateInviteCodeResponseJson.invite_link, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || generateInviteCodeResponseJson.share_text != null) {
            c9j5.AAP(generateInviteCodeResponseJson.share_text, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenerateInviteCodeResponseJson) {
                GenerateInviteCodeResponseJson generateInviteCodeResponseJson = (GenerateInviteCodeResponseJson) obj;
                if (!C7384Etj.areEqual(this.code, generateInviteCodeResponseJson.code) || !C7384Etj.areEqual(this.max_uses, generateInviteCodeResponseJson.max_uses) || !C7384Etj.areEqual(this.use_count, generateInviteCodeResponseJson.use_count) || !C7384Etj.areEqual(this.invite_link, generateInviteCodeResponseJson.invite_link) || !C7384Etj.areEqual(this.share_text, generateInviteCodeResponseJson.share_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenerateInviteCodeResponseJson copy$default(GenerateInviteCodeResponseJson generateInviteCodeResponseJson, String str, Integer num, Integer num2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateInviteCodeResponseJson.code;
        }
        if ((i & 2) != 0) {
            num = generateInviteCodeResponseJson.max_uses;
        }
        if ((i & 4) != 0) {
            num2 = generateInviteCodeResponseJson.use_count;
        }
        if ((i & 8) != 0) {
            str2 = generateInviteCodeResponseJson.invite_link;
        }
        if ((i & 16) != 0) {
            str3 = generateInviteCodeResponseJson.share_text;
        }
        return generateInviteCodeResponseJson.copy(str, num, num2, str2, str3);
    }

    public final String component1() {
        return this.code;
    }

    public final Integer component2() {
        return this.max_uses;
    }

    public final Integer component3() {
        return this.use_count;
    }

    public final String component4() {
        return this.invite_link;
    }

    public final String component5() {
        return this.share_text;
    }

    public final GenerateInviteCodeResponseJson copy(String str, Integer num, Integer num2, String str2, String str3) {
        return new GenerateInviteCodeResponseJson(str, num, num2, str2, str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getInvite_link() {
        return this.invite_link;
    }

    public final Integer getMax_uses() {
        return this.max_uses;
    }

    public final String getShare_text() {
        return this.share_text;
    }

    public final Integer getUse_count() {
        return this.use_count;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.code) * 31) + AnonymousClass006.A0D(this.max_uses)) * 31) + AnonymousClass006.A0D(this.use_count)) * 31) + AnonymousClass006.A0G(this.invite_link)) * 31) + AnonymousClass005.A0H(this.share_text);
    }

    public /* synthetic */ GenerateInviteCodeResponseJson(int i, String str, Integer num, Integer num2, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.max_uses = null;
        } else {
            this.max_uses = num;
        }
        if ((i & 4) == 0) {
            this.use_count = null;
        } else {
            this.use_count = num2;
        }
        if ((i & 8) == 0) {
            this.invite_link = null;
        } else {
            this.invite_link = str2;
        }
        if ((i & 16) == 0) {
            this.share_text = null;
        } else {
            this.share_text = str3;
        }
    }

    public String toString() {
        return super.toString();
    }

    public GenerateInviteCodeResponseJson(String str, Integer num, Integer num2, String str2, String str3) {
        this.code = str;
        this.max_uses = num;
        this.use_count = num2;
        this.invite_link = str2;
        this.share_text = str3;
    }

    public /* synthetic */ GenerateInviteCodeResponseJson(String str, Integer num, Integer num2, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public GenerateInviteCodeResponseJson() {
        this(null, null, null, null, null);
    }
}
