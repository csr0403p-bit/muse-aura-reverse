package com.facebook.aura.skills.repo;

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
/* loaded from: classes2.dex */
public final class RecipientPermissionActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_label;
    public final String key;

    public final class Companion {
        public final C9hr<RecipientPermissionActionJson> serializer() {
            return RecipientPermissionActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionActionJson recipientPermissionActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(recipientPermissionActionJson.key)) {
            c9j5.AAV(recipientPermissionActionJson.key, c9iZ, 0);
        }
        if (zAfR || !"".equals(recipientPermissionActionJson.display_label)) {
            c9j5.AAV(recipientPermissionActionJson.display_label, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionActionJson) {
                RecipientPermissionActionJson recipientPermissionActionJson = (RecipientPermissionActionJson) obj;
                if (!C7384Etj.areEqual(this.key, recipientPermissionActionJson.key) || !C7384Etj.areEqual(this.display_label, recipientPermissionActionJson.display_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientPermissionActionJson copy$default(RecipientPermissionActionJson recipientPermissionActionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientPermissionActionJson.key;
        }
        if ((i & 2) != 0) {
            str2 = recipientPermissionActionJson.display_label;
        }
        AnonymousClass003.A0u(str, str2);
        return new RecipientPermissionActionJson(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.display_label;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.display_label, AnonymousClass001.A0G(this.key));
    }

    public RecipientPermissionActionJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.display_label = str2;
    }

    public final RecipientPermissionActionJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RecipientPermissionActionJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionActionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.display_label = "";
        } else {
            this.display_label = str2;
        }
    }

    public /* synthetic */ RecipientPermissionActionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public RecipientPermissionActionJson() {
        this("", "");
    }
}
