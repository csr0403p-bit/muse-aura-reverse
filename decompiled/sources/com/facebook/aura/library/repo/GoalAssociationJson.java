package com.facebook.aura.library.repo;

import X.AnonymousClass001;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class GoalAssociationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String associationId;
    public final String associationType;
    public final String association_id;
    public final String association_type;
    public final String createdAt;
    public final String created_at;
    public final JsonObject details;
    public final String id;
    public final String imageUrl;
    public final String image_url;
    public final String updatedAt;
    public final String updated_at;

    public final class Companion {
        public final C9hr<GoalAssociationJson> serializer() {
            return GoalAssociationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ GoalAssociationJson copy$default(GoalAssociationJson goalAssociationJson, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        JsonObject jsonObject2 = jsonObject;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        if ((i & 1) != 0) {
            str12 = goalAssociationJson.association_id;
        }
        if ((i & 2) != 0) {
            str13 = goalAssociationJson.associationId;
        }
        if ((i & 4) != 0) {
            str14 = goalAssociationJson.id;
        }
        if ((i & 8) != 0) {
            str15 = goalAssociationJson.association_type;
        }
        if ((i & 16) != 0) {
            str16 = goalAssociationJson.associationType;
        }
        if ((i & 32) != 0) {
            jsonObject2 = goalAssociationJson.details;
        }
        if ((i & 64) != 0) {
            str17 = goalAssociationJson.image_url;
        }
        if ((i & 128) != 0) {
            str18 = goalAssociationJson.imageUrl;
        }
        if ((i & 256) != 0) {
            str19 = goalAssociationJson.created_at;
        }
        if ((i & 512) != 0) {
            str20 = goalAssociationJson.createdAt;
        }
        if ((i & 1024) != 0) {
            str21 = goalAssociationJson.updated_at;
        }
        if ((i & 2048) != 0) {
            str22 = goalAssociationJson.updatedAt;
        }
        AnonymousClass005.A0x(str12, str13, str14);
        return new GoalAssociationJson(str12, str13, str14, str15, str16, jsonObject2, str17, str18, str19, str20, str21, str22);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalAssociationJson goalAssociationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(goalAssociationJson.association_id)) {
            c9j5.AAV(goalAssociationJson.association_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(goalAssociationJson.associationId)) {
            c9j5.AAV(goalAssociationJson.associationId, c9iZ, 1);
        }
        if (zAfR || !"".equals(goalAssociationJson.id)) {
            c9j5.AAV(goalAssociationJson.id, c9iZ, 2);
        }
        if (zAfR || goalAssociationJson.association_type != null) {
            c9j5.AAP(goalAssociationJson.association_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || goalAssociationJson.associationType != null) {
            c9j5.AAP(goalAssociationJson.associationType, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || goalAssociationJson.details != null) {
            c9j5.AAP(goalAssociationJson.details, JsonObjectSerializer.A01, c9iZ, 5);
        }
        if (zAfR || goalAssociationJson.image_url != null) {
            c9j5.AAP(goalAssociationJson.image_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || goalAssociationJson.imageUrl != null) {
            c9j5.AAP(goalAssociationJson.imageUrl, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || goalAssociationJson.created_at != null) {
            c9j5.AAP(goalAssociationJson.created_at, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || goalAssociationJson.createdAt != null) {
            c9j5.AAP(goalAssociationJson.createdAt, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || goalAssociationJson.updated_at != null) {
            c9j5.AAP(goalAssociationJson.updated_at, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || goalAssociationJson.updatedAt != null) {
            c9j5.AAP(goalAssociationJson.updatedAt, C07779iq.A01, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalAssociationJson) {
                GoalAssociationJson goalAssociationJson = (GoalAssociationJson) obj;
                if (!C7384Etj.areEqual(this.association_id, goalAssociationJson.association_id) || !C7384Etj.areEqual(this.associationId, goalAssociationJson.associationId) || !C7384Etj.areEqual(this.id, goalAssociationJson.id) || !C7384Etj.areEqual(this.association_type, goalAssociationJson.association_type) || !C7384Etj.areEqual(this.associationType, goalAssociationJson.associationType) || !C7384Etj.areEqual(this.details, goalAssociationJson.details) || !C7384Etj.areEqual(this.image_url, goalAssociationJson.image_url) || !C7384Etj.areEqual(this.imageUrl, goalAssociationJson.imageUrl) || !C7384Etj.areEqual(this.created_at, goalAssociationJson.created_at) || !C7384Etj.areEqual(this.createdAt, goalAssociationJson.createdAt) || !C7384Etj.areEqual(this.updated_at, goalAssociationJson.updated_at) || !C7384Etj.areEqual(this.updatedAt, goalAssociationJson.updatedAt)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.association_id;
    }

    public final String component10() {
        return this.createdAt;
    }

    public final String component11() {
        return this.updated_at;
    }

    public final String component12() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.associationId;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.association_type;
    }

    public final String component5() {
        return this.associationType;
    }

    public final JsonObject component6() {
        return this.details;
    }

    public final String component7() {
        return this.image_url;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final String component9() {
        return this.created_at;
    }

    public final String getAssociationId() {
        return this.associationId;
    }

    public final String getAssociationType() {
        return this.associationType;
    }

    public final String getAssociation_id() {
        return this.association_id;
    }

    public final String getAssociation_type() {
        return this.association_type;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final JsonObject getDetails() {
        return this.details;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        return ((((((((((((((((AnonymousClass005.A0I(this.id, AnonymousClass005.A0I(this.associationId, AnonymousClass001.A0G(this.association_id))) + AnonymousClass006.A0G(this.association_type)) * 31) + AnonymousClass006.A0G(this.associationType)) * 31) + AnonymousClass006.A0D(this.details)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.created_at)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass006.A0G(this.updated_at)) * 31) + AnonymousClass005.A0H(this.updatedAt);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[PHI: r11
  0x0022: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v1 java.lang.String), (r11v0 java.lang.String) binds: [B:10:0x001f, B:7:0x0015, B:4:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.library.repo.GoalAssociation toDomain() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.GoalAssociationJson.toDomain():com.facebook.aura.library.repo.GoalAssociation");
    }

    public GoalAssociationJson(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, String str8, String str9, String str10, String str11) {
        AnonymousClass005.A0x(str, str2, str3);
        this.association_id = str;
        this.associationId = str2;
        this.id = str3;
        this.association_type = str4;
        this.associationType = str5;
        this.details = jsonObject;
        this.image_url = str6;
        this.imageUrl = str7;
        this.created_at = str8;
        this.createdAt = str9;
        this.updated_at = str10;
        this.updatedAt = str11;
    }

    public final GoalAssociationJson copy(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, String str8, String str9, String str10, String str11) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GoalAssociationJson(str, str2, str3, str4, str5, jsonObject, str6, str7, str8, str9, str10, str11);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalAssociationJson(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, String str8, String str9, String str10, String str11, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : jsonObject, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11);
    }

    public /* synthetic */ GoalAssociationJson(int i, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, String str8, String str9, String str10, String str11, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.association_id = "";
        } else {
            this.association_id = str;
        }
        if ((i & 2) == 0) {
            this.associationId = "";
        } else {
            this.associationId = str2;
        }
        if ((i & 4) == 0) {
            this.id = "";
        } else {
            this.id = str3;
        }
        if ((i & 8) == 0) {
            this.association_type = null;
        } else {
            this.association_type = str4;
        }
        if ((i & 16) == 0) {
            this.associationType = null;
        } else {
            this.associationType = str5;
        }
        if ((i & 32) == 0) {
            this.details = null;
        } else {
            this.details = jsonObject;
        }
        if ((i & 64) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str6;
        }
        if ((i & 128) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str7;
        }
        if ((i & 256) == 0) {
            this.created_at = null;
        } else {
            this.created_at = str8;
        }
        if ((i & 512) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str9;
        }
        if ((i & 1024) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = str10;
        }
        if ((i & 2048) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str11;
        }
    }

    public GoalAssociationJson() {
        this("", "", "", null, null, null, null, null, null, null, null, null);
    }
}
