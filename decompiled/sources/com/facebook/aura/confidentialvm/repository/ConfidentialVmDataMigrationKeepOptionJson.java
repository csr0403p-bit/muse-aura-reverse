package com.facebook.aura.confidentialvm.repository;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
public final class ConfidentialVmDataMigrationKeepOptionJson extends C06G {
    public final String body;
    public final List<ConfidentialVmValuePropEntityJson> body_entities;
    public final String footnote;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ConfidentialVmDataMigrationKeepOptionJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<ConfidentialVmDataMigrationKeepOptionJson> serializer() {
            return ConfidentialVmDataMigrationKeepOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationKeepOptionJson) {
                ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson = (ConfidentialVmDataMigrationKeepOptionJson) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmDataMigrationKeepOptionJson.title) || !C7384Etj.areEqual(this.body, confidentialVmDataMigrationKeepOptionJson.body) || !C7384Etj.areEqual(this.body_entities, confidentialVmDataMigrationKeepOptionJson.body_entities) || !C7384Etj.areEqual(this.footnote, confidentialVmDataMigrationKeepOptionJson.footnote)) {
                }
            }
            return false;
        }
        return true;
    }

    public ConfidentialVmDataMigrationKeepOptionJson() {
        this("", "", C0881AGi.A00, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmDataMigrationKeepOptionJson copy$default(ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDataMigrationKeepOptionJson.title;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmDataMigrationKeepOptionJson.body;
        }
        if ((i & 4) != 0) {
            list = confidentialVmDataMigrationKeepOptionJson.body_entities;
        }
        if ((i & 8) != 0) {
            str3 = confidentialVmDataMigrationKeepOptionJson.footnote;
        }
        return confidentialVmDataMigrationKeepOptionJson.copy(str, str2, list, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(confidentialVmDataMigrationKeepOptionJson.title)) {
            c9j5.AAV(confidentialVmDataMigrationKeepOptionJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(confidentialVmDataMigrationKeepOptionJson.body)) {
            c9j5.AAV(confidentialVmDataMigrationKeepOptionJson.body, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(confidentialVmDataMigrationKeepOptionJson.body_entities)) {
            c9j5.AAQ(confidentialVmDataMigrationKeepOptionJson.body_entities, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !"".equals(confidentialVmDataMigrationKeepOptionJson.footnote)) {
            c9j5.AAV(confidentialVmDataMigrationKeepOptionJson.footnote, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final List<ConfidentialVmValuePropEntityJson> component3() {
        return this.body_entities;
    }

    public final String component4() {
        return this.footnote;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<ConfidentialVmValuePropEntityJson> getBody_entities() {
        return this.body_entities;
    }

    public final String getFootnote() {
        return this.footnote;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.footnote, AnonymousClass005.A0F(this.body_entities, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title))));
    }

    public final ConfidentialVmDataMigrationKeepOptionJson copy(String str, String str2, List<ConfidentialVmValuePropEntityJson> list, String str3) {
        AnonymousClass005.A14(str, str2, list, str3);
        return new ConfidentialVmDataMigrationKeepOptionJson(str, str2, list, str3);
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmDataMigrationKeepOptionJson(String str, String str2, List<ConfidentialVmValuePropEntityJson> list, String str3) {
        AnonymousClass005.A14(str, str2, list, str3);
        this.title = str;
        this.body = str2;
        this.body_entities = list;
        this.footnote = str3;
    }

    public /* synthetic */ ConfidentialVmDataMigrationKeepOptionJson(String str, String str2, List list, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? "" : str3);
    }

    public /* synthetic */ ConfidentialVmDataMigrationKeepOptionJson(int i, String str, String str2, List list, String str3, C2hx c2hx) {
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
        if ((i & 4) == 0) {
            this.body_entities = C0881AGi.A00;
        } else {
            this.body_entities = list;
        }
        if ((i & 8) == 0) {
            this.footnote = "";
        } else {
            this.footnote = str3;
        }
    }
}
