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
public final class TosSectionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final String icon;
    public final String title;

    public final class Companion {
        public final C9hr<TosSectionJson> serializer() {
            return TosSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosSectionJson tosSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(tosSectionJson.title)) {
            c9j5.AAV(tosSectionJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(tosSectionJson.description)) {
            c9j5.AAV(tosSectionJson.description, c9iZ, 1);
        }
        if (zAfR || tosSectionJson.icon != null) {
            c9j5.AAP(tosSectionJson.icon, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosSectionJson) {
                TosSectionJson tosSectionJson = (TosSectionJson) obj;
                if (!C7384Etj.areEqual(this.title, tosSectionJson.title) || !C7384Etj.areEqual(this.description, tosSectionJson.description) || !C7384Etj.areEqual(this.icon, tosSectionJson.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TosSectionJson copy$default(TosSectionJson tosSectionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tosSectionJson.title;
        }
        if ((i & 2) != 0) {
            str2 = tosSectionJson.description;
        }
        if ((i & 4) != 0) {
            str3 = tosSectionJson.icon;
        }
        return tosSectionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.description, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.icon);
    }

    public TosSectionJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.description = str2;
        this.icon = str3;
    }

    public final TosSectionJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new TosSectionJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosSectionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
    }

    public /* synthetic */ TosSectionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public TosSectionJson() {
        this("", "", null);
    }
}
