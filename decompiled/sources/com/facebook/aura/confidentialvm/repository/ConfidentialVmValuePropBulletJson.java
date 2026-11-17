package com.facebook.aura.confidentialvm.repository;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ConfidentialVmValuePropBulletJson extends C06G {
    public final String icon;
    public final String subtitle;
    public final List<ConfidentialVmValuePropEntityJson> subtitle_entities;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ConfidentialVmValuePropBulletJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<ConfidentialVmValuePropBulletJson> serializer() {
            return ConfidentialVmValuePropBulletJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmValuePropBulletJson() {
        this("", "", C0881AGi.A00, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropBulletJson) {
                ConfidentialVmValuePropBulletJson confidentialVmValuePropBulletJson = (ConfidentialVmValuePropBulletJson) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmValuePropBulletJson.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmValuePropBulletJson.subtitle) || !C7384Etj.areEqual(this.subtitle_entities, confidentialVmValuePropBulletJson.subtitle_entities) || !C7384Etj.areEqual(this.icon, confidentialVmValuePropBulletJson.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmValuePropBulletJson copy$default(ConfidentialVmValuePropBulletJson confidentialVmValuePropBulletJson, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmValuePropBulletJson.title;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmValuePropBulletJson.subtitle;
        }
        if ((i & 4) != 0) {
            list = confidentialVmValuePropBulletJson.subtitle_entities;
        }
        if ((i & 8) != 0) {
            str3 = confidentialVmValuePropBulletJson.icon;
        }
        AnonymousClass005.A0x(str, str2, list);
        return new ConfidentialVmValuePropBulletJson(str, str2, list, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmValuePropBulletJson confidentialVmValuePropBulletJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(confidentialVmValuePropBulletJson.title)) {
            c9j5.AAV(confidentialVmValuePropBulletJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(confidentialVmValuePropBulletJson.subtitle)) {
            c9j5.AAV(confidentialVmValuePropBulletJson.subtitle, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(confidentialVmValuePropBulletJson.subtitle_entities)) {
            c9j5.AAQ(confidentialVmValuePropBulletJson.subtitle_entities, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || confidentialVmValuePropBulletJson.icon != null) {
            c9j5.AAP(confidentialVmValuePropBulletJson.icon, C07779iq.A01, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<ConfidentialVmValuePropEntityJson> component3() {
        return this.subtitle_entities;
    }

    public final String component4() {
        return this.icon;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ConfidentialVmValuePropEntityJson> getSubtitle_entities() {
        return this.subtitle_entities;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.subtitle_entities, AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title))) + AnonymousClass006.A0G(this.icon);
    }

    public final ConfidentialVmValuePropBulletJson copy(String str, String str2, List<ConfidentialVmValuePropEntityJson> list, String str3) {
        AnonymousClass005.A0x(str, str2, list);
        return new ConfidentialVmValuePropBulletJson(str, str2, list, str3);
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmValuePropBulletJson(String str, String str2, List<ConfidentialVmValuePropEntityJson> list, String str3) {
        AnonymousClass005.A0x(str, str2, list);
        this.title = str;
        this.subtitle = str2;
        this.subtitle_entities = list;
        this.icon = str3;
    }

    public /* synthetic */ ConfidentialVmValuePropBulletJson(String str, String str2, List list, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0881AGi.A00 : list, AnonymousClass006.A0u(i, str3));
    }

    public /* synthetic */ ConfidentialVmValuePropBulletJson(int i, String str, String str2, List list, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle_entities = C0881AGi.A00;
        } else {
            this.subtitle_entities = list;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
    }
}
