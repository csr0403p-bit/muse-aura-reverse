package com.facebook.aura.skills.repo;

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
/* loaded from: classes2.dex */
public final class RecipientPermissionDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String mode_label;
    public final String permission_caption;
    public final String summary_title;

    public final class Companion {
        public final C9hr<RecipientPermissionDisplayJson> serializer() {
            return RecipientPermissionDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionDisplayJson recipientPermissionDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || recipientPermissionDisplayJson.summary_title != null) {
            c9j5.AAP(recipientPermissionDisplayJson.summary_title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || recipientPermissionDisplayJson.permission_caption != null) {
            c9j5.AAP(recipientPermissionDisplayJson.permission_caption, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || recipientPermissionDisplayJson.mode_label != null) {
            c9j5.AAP(recipientPermissionDisplayJson.mode_label, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionDisplayJson) {
                RecipientPermissionDisplayJson recipientPermissionDisplayJson = (RecipientPermissionDisplayJson) obj;
                if (!C7384Etj.areEqual(this.summary_title, recipientPermissionDisplayJson.summary_title) || !C7384Etj.areEqual(this.permission_caption, recipientPermissionDisplayJson.permission_caption) || !C7384Etj.areEqual(this.mode_label, recipientPermissionDisplayJson.mode_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientPermissionDisplayJson copy$default(RecipientPermissionDisplayJson recipientPermissionDisplayJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientPermissionDisplayJson.summary_title;
        }
        if ((i & 2) != 0) {
            str2 = recipientPermissionDisplayJson.permission_caption;
        }
        if ((i & 4) != 0) {
            str3 = recipientPermissionDisplayJson.mode_label;
        }
        return new RecipientPermissionDisplayJson(str, str2, str3);
    }

    public final String component1() {
        return this.summary_title;
    }

    public final String component2() {
        return this.permission_caption;
    }

    public final String component3() {
        return this.mode_label;
    }

    public final RecipientPermissionDisplayJson copy(String str, String str2, String str3) {
        return new RecipientPermissionDisplayJson(str, str2, str3);
    }

    public final String getMode_label() {
        return this.mode_label;
    }

    public final String getPermission_caption() {
        return this.permission_caption;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.summary_title) * 31) + AnonymousClass006.A0G(this.permission_caption)) * 31) + AnonymousClass005.A0H(this.mode_label);
    }

    public RecipientPermissionDisplayJson(String str, String str2, String str3) {
        this.summary_title = str;
        this.permission_caption = str2;
        this.mode_label = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionDisplayJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.summary_title = null;
        } else {
            this.summary_title = str;
        }
        if ((i & 2) == 0) {
            this.permission_caption = null;
        } else {
            this.permission_caption = str2;
        }
        if ((i & 4) == 0) {
            this.mode_label = null;
        } else {
            this.mode_label = str3;
        }
    }

    public /* synthetic */ RecipientPermissionDisplayJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public RecipientPermissionDisplayJson() {
        this(null, null, null);
    }
}
