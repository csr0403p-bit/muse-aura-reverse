package com.facebook.aura.spaces.repo;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C6tn;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9oY;
import com.facebook.aura.model.SpaceConstructionStatus;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String artifact_path;
    public final String build_status;
    public final String construction_status;
    public final String emoji;
    public final JsonElement favorite_order;
    public final Boolean has_server_actions;
    public final String html;
    public final String id;
    public final String image_url;
    public final Boolean is_shared;
    public final String name;
    public final String shortcode;
    public final String slug;
    public final String source_url;
    public final String space_id;
    public final String title;
    public final JsonElement updated_at_ms;
    public final String view_url;

    public final class Companion {
        public final C9hr<SpaceEntryJson> serializer() {
            return SpaceEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(SpaceEntryJson spaceEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceEntryJson.slug != null) {
            c9j5.AAP(spaceEntryJson.slug, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || spaceEntryJson.space_id != null) {
            c9j5.AAP(spaceEntryJson.space_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || spaceEntryJson.id != null) {
            c9j5.AAP(spaceEntryJson.id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || spaceEntryJson.name != null) {
            c9j5.AAP(spaceEntryJson.name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || spaceEntryJson.title != null) {
            c9j5.AAP(spaceEntryJson.title, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || spaceEntryJson.emoji != null) {
            c9j5.AAP(spaceEntryJson.emoji, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || spaceEntryJson.image_url != null) {
            c9j5.AAP(spaceEntryJson.image_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || spaceEntryJson.updated_at_ms != null) {
            c9j5.AAP(spaceEntryJson.updated_at_ms, JsonElementSerializer.A00, c9iZ, 7);
        }
        if (zAfR || spaceEntryJson.favorite_order != null) {
            c9j5.AAP(spaceEntryJson.favorite_order, JsonElementSerializer.A00, c9iZ, 8);
        }
        if (zAfR || spaceEntryJson.artifact_path != null) {
            c9j5.AAP(spaceEntryJson.artifact_path, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || spaceEntryJson.html != null) {
            c9j5.AAP(spaceEntryJson.html, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || spaceEntryJson.is_shared != null) {
            c9j5.AAP(spaceEntryJson.is_shared, C07839ix.A00, c9iZ, 11);
        }
        if (zAfR || spaceEntryJson.shortcode != null) {
            c9j5.AAP(spaceEntryJson.shortcode, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || spaceEntryJson.source_url != null) {
            c9j5.AAP(spaceEntryJson.source_url, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || spaceEntryJson.construction_status != null) {
            c9j5.AAP(spaceEntryJson.construction_status, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || spaceEntryJson.build_status != null) {
            c9j5.AAP(spaceEntryJson.build_status, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || spaceEntryJson.has_server_actions != null) {
            c9j5.AAP(spaceEntryJson.has_server_actions, C07839ix.A00, c9iZ, 16);
        }
        if (zAfR || spaceEntryJson.view_url != null) {
            c9j5.AAP(spaceEntryJson.view_url, C07779iq.A01, c9iZ, 17);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceEntryJson) {
                SpaceEntryJson spaceEntryJson = (SpaceEntryJson) obj;
                if (!C7384Etj.areEqual(this.slug, spaceEntryJson.slug) || !C7384Etj.areEqual(this.space_id, spaceEntryJson.space_id) || !C7384Etj.areEqual(this.id, spaceEntryJson.id) || !C7384Etj.areEqual(this.name, spaceEntryJson.name) || !C7384Etj.areEqual(this.title, spaceEntryJson.title) || !C7384Etj.areEqual(this.emoji, spaceEntryJson.emoji) || !C7384Etj.areEqual(this.image_url, spaceEntryJson.image_url) || !C7384Etj.areEqual(this.updated_at_ms, spaceEntryJson.updated_at_ms) || !C7384Etj.areEqual(this.favorite_order, spaceEntryJson.favorite_order) || !C7384Etj.areEqual(this.artifact_path, spaceEntryJson.artifact_path) || !C7384Etj.areEqual(this.html, spaceEntryJson.html) || !C7384Etj.areEqual(this.is_shared, spaceEntryJson.is_shared) || !C7384Etj.areEqual(this.shortcode, spaceEntryJson.shortcode) || !C7384Etj.areEqual(this.source_url, spaceEntryJson.source_url) || !C7384Etj.areEqual(this.construction_status, spaceEntryJson.construction_status) || !C7384Etj.areEqual(this.build_status, spaceEntryJson.build_status) || !C7384Etj.areEqual(this.has_server_actions, spaceEntryJson.has_server_actions) || !C7384Etj.areEqual(this.view_url, spaceEntryJson.view_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String resolvedTitle(String str) {
        String strNonBlank;
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass002.A1b(this.is_shared, true) && (strNonBlank = HatchSpacesDataSourceJsonKt.nonBlank(this.slug)) != null) {
            return strNonBlank;
        }
        String strNonBlank2 = HatchSpacesDataSourceJsonKt.nonBlank(this.name);
        if (strNonBlank2 != null) {
            return strNonBlank2;
        }
        String strNonBlank3 = HatchSpacesDataSourceJsonKt.nonBlank(this.title);
        return strNonBlank3 == null ? HatchSpacesDataSourceJsonKt.defaultTitleForSlug(str) : strNonBlank3;
    }

    public /* synthetic */ SpaceEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, JsonElement jsonElement2, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14, int i, C06H c06h) {
        this(C3cG.A0e(str, i & 1), C3cG.A0e(str2, i & 2), C3cG.A0e(str3, i & 4), C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), C3cG.A0e(str6, i & 32), C3cG.A0e(str7, i & 64), (i & 128) != 0 ? null : jsonElement, (i & 256) != 0 ? null : jsonElement2, C3cG.A0e(str8, i & 512), C3cG.A0e(str9, i & 1024), (i & 2048) != 0 ? null : bool, C3cG.A0e(str10, i & 4096), C3cG.A0e(str11, i & 8192), C3cG.A0e(str12, i & 16384), C3cI.A0V(i, 32768, str13), (i & 65536) != 0 ? null : bool2, C3cI.A0V(i, 131072, str14));
    }

    public final String component1() {
        return this.slug;
    }

    public final String component10() {
        return this.artifact_path;
    }

    public final String component11() {
        return this.html;
    }

    public final Boolean component12() {
        return this.is_shared;
    }

    public final String component13() {
        return this.shortcode;
    }

    public final String component14() {
        return this.source_url;
    }

    public final String component15() {
        return this.construction_status;
    }

    public final String component16() {
        return this.build_status;
    }

    public final Boolean component17() {
        return this.has_server_actions;
    }

    public final String component18() {
        return this.view_url;
    }

    public final String component2() {
        return this.space_id;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.emoji;
    }

    public final String component7() {
        return this.image_url;
    }

    public final JsonElement component8() {
        return this.updated_at_ms;
    }

    public final JsonElement component9() {
        return this.favorite_order;
    }

    public final SpaceEntryJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, JsonElement jsonElement2, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14) {
        return new SpaceEntryJson(str, str2, str3, str4, str5, str6, str7, jsonElement, jsonElement2, str8, str9, bool, str10, str11, str12, str13, bool2, str14);
    }

    public final String getArtifact_path() {
        return this.artifact_path;
    }

    public final String getBuild_status() {
        return this.build_status;
    }

    public final String getConstruction_status() {
        return this.construction_status;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final JsonElement getFavorite_order() {
        return this.favorite_order;
    }

    public final Boolean getHas_server_actions() {
        return this.has_server_actions;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSource_url() {
        return this.source_url;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final JsonElement getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public final String getView_url() {
        return this.view_url;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((AnonymousClass006.A0G(this.slug) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.id)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0D(this.updated_at_ms)) * 31) + AnonymousClass006.A0D(this.favorite_order)) * 31) + AnonymousClass006.A0G(this.artifact_path)) * 31) + AnonymousClass006.A0G(this.html)) * 31) + AnonymousClass006.A0D(this.is_shared)) * 31) + AnonymousClass006.A0G(this.shortcode)) * 31) + AnonymousClass006.A0G(this.source_url)) * 31) + AnonymousClass006.A0G(this.construction_status)) * 31) + AnonymousClass006.A0G(this.build_status)) * 31) + AnonymousClass006.A0D(this.has_server_actions)) * 31) + AnonymousClass005.A0H(this.view_url);
    }

    public final Boolean is_shared() {
        return this.is_shared;
    }

    public final String legacyArtifactPath() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.artifact_path);
    }

    public final String legacyHtml() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.html);
    }

    public final String nonBlankEmoji() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.emoji);
    }

    public final String nonBlankImageUrl() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.image_url);
    }

    public final SpaceConstructionStatus resolvedConstructionStatus() {
        String strNonBlank = HatchSpacesDataSourceJsonKt.nonBlank(this.construction_status);
        if (strNonBlank == null && (strNonBlank = HatchSpacesDataSourceJsonKt.nonBlank(this.build_status)) == null) {
            return null;
        }
        return SpaceConstructionStatus.Companion.fromServerValue(strNonBlank);
    }

    public final boolean resolvedIsShared() {
        return AnonymousClass002.A1b(this.is_shared, true);
    }

    public final String resolvedShortcode() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.shortcode);
    }

    public final String resolvedSlug() {
        String strNonBlank;
        if (AnonymousClass002.A1b(this.is_shared, true) && (strNonBlank = HatchSpacesDataSourceJsonKt.nonBlank(this.shortcode)) != null) {
            return strNonBlank;
        }
        String strNonBlank2 = HatchSpacesDataSourceJsonKt.nonBlank(this.slug);
        if (strNonBlank2 != null) {
            return strNonBlank2;
        }
        String strNonBlank3 = HatchSpacesDataSourceJsonKt.nonBlank(this.space_id);
        return strNonBlank3 == null ? HatchSpacesDataSourceJsonKt.nonBlank(this.id) : strNonBlank3;
    }

    public final String resolvedSourceUrl() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.source_url);
    }

    public final String resolvedSpaceId() {
        return HatchSpacesDataSourceJsonKt.nonBlank(this.space_id);
    }

    public final Long resolvedUpdatedAtMs() {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        JsonElement jsonElement = this.updated_at_ms;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (lA03 = C9oY.A03(jsonPrimitive)) == null || lA03.longValue() <= 0) {
            return null;
        }
        return lA03;
    }

    public final Double toFavoriteOrder() {
        JsonPrimitive jsonPrimitive;
        Double dA00;
        JsonElement jsonElement = this.favorite_order;
        if (jsonElement == null || (jsonElement instanceof JsonNull) || !(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (dA00 = C6tn.A00(jsonPrimitive)) == null || Double.isNaN(dA00.doubleValue())) {
            return null;
        }
        return dA00;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ SpaceEntryJson copy$default(SpaceEntryJson spaceEntryJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, JsonElement jsonElement2, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14, int i, Object obj) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        JsonElement jsonElement3 = jsonElement;
        JsonElement jsonElement4 = jsonElement2;
        String str22 = str8;
        String str23 = str9;
        Boolean bool3 = bool;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        Boolean bool4 = bool2;
        String str28 = str14;
        if ((i & 1) != 0) {
            str15 = spaceEntryJson.slug;
        }
        if ((i & 2) != 0) {
            str16 = spaceEntryJson.space_id;
        }
        if ((i & 4) != 0) {
            str17 = spaceEntryJson.id;
        }
        if ((i & 8) != 0) {
            str18 = spaceEntryJson.name;
        }
        if ((i & 16) != 0) {
            str19 = spaceEntryJson.title;
        }
        if ((i & 32) != 0) {
            str20 = spaceEntryJson.emoji;
        }
        if ((i & 64) != 0) {
            str21 = spaceEntryJson.image_url;
        }
        if ((i & 128) != 0) {
            jsonElement3 = spaceEntryJson.updated_at_ms;
        }
        if ((i & 256) != 0) {
            jsonElement4 = spaceEntryJson.favorite_order;
        }
        if ((i & 512) != 0) {
            str22 = spaceEntryJson.artifact_path;
        }
        if ((i & 1024) != 0) {
            str23 = spaceEntryJson.html;
        }
        if ((i & 2048) != 0) {
            bool3 = spaceEntryJson.is_shared;
        }
        if ((i & 4096) != 0) {
            str24 = spaceEntryJson.shortcode;
        }
        if ((i & 8192) != 0) {
            str25 = spaceEntryJson.source_url;
        }
        if ((i & 16384) != 0) {
            str26 = spaceEntryJson.construction_status;
        }
        if ((i & 32768) != 0) {
            str27 = spaceEntryJson.build_status;
        }
        if ((i & 65536) != 0) {
            bool4 = spaceEntryJson.has_server_actions;
        }
        if ((i & 131072) != 0) {
            str28 = spaceEntryJson.view_url;
        }
        String str29 = str18;
        String str30 = str19;
        return new SpaceEntryJson(str15, str16, str17, str29, str30, str20, str21, jsonElement3, jsonElement4, str22, str23, bool3, str24, str25, str26, str27, bool4, str28);
    }

    public SpaceEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, JsonElement jsonElement2, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14) {
        this.slug = str;
        this.space_id = str2;
        this.id = str3;
        this.name = str4;
        this.title = str5;
        this.emoji = str6;
        this.image_url = str7;
        this.updated_at_ms = jsonElement;
        this.favorite_order = jsonElement2;
        this.artifact_path = str8;
        this.html = str9;
        this.is_shared = bool;
        this.shortcode = str10;
        this.source_url = str11;
        this.construction_status = str12;
        this.build_status = str13;
        this.has_server_actions = bool2;
        this.view_url = str14;
    }

    public /* synthetic */ SpaceEntryJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, JsonElement jsonElement2, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.slug = null;
        } else {
            this.slug = str;
        }
        if ((i & 2) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str2;
        }
        if ((i & 4) == 0) {
            this.id = null;
        } else {
            this.id = str3;
        }
        if ((i & 8) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i & 32) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str6;
        }
        if ((i & 64) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str7;
        }
        if ((i & 128) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = jsonElement;
        }
        if ((i & 256) == 0) {
            this.favorite_order = null;
        } else {
            this.favorite_order = jsonElement2;
        }
        if ((i & 512) == 0) {
            this.artifact_path = null;
        } else {
            this.artifact_path = str8;
        }
        if ((i & 1024) == 0) {
            this.html = null;
        } else {
            this.html = str9;
        }
        if ((i & 2048) == 0) {
            this.is_shared = null;
        } else {
            this.is_shared = bool;
        }
        if ((i & 4096) == 0) {
            this.shortcode = null;
        } else {
            this.shortcode = str10;
        }
        if ((i & 8192) == 0) {
            this.source_url = null;
        } else {
            this.source_url = str11;
        }
        if ((i & 16384) == 0) {
            this.construction_status = null;
        } else {
            this.construction_status = str12;
        }
        if ((32768 & i) == 0) {
            this.build_status = null;
        } else {
            this.build_status = str13;
        }
        if ((65536 & i) == 0) {
            this.has_server_actions = null;
        } else {
            this.has_server_actions = bool2;
        }
        if ((i & 131072) == 0) {
            this.view_url = null;
        } else {
            this.view_url = str14;
        }
    }

    public SpaceEntryJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
