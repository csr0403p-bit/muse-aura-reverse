package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.model.SpaceConstructionStatus;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactItemJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long accessed_at_ms;
    public final String artifact_ref;
    public final String construction_status;
    public final String display_name;
    public final Double favorite_order;
    public final Double frequency_score;
    public final Boolean has_server_actions;
    public final String icon;
    public final boolean is_favorite;
    public final String item_key;
    public final String placement;
    public final ArtifactItemPreviewJson preview;
    public final ArtifactSharingInfoJson sharing;
    public final String source;
    public final String source_url;
    public final String space_id;
    public final String view_url;
    public final String xmds_icon;

    public final class Companion {
        public final C9hr<ArtifactItemJson> serializer() {
            return ArtifactItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactItemJson artifactItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(artifactItemJson.source)) {
            c9j5.AAV(artifactItemJson.source, c9iZ, 0);
        }
        if (zAfR || !"".equals(artifactItemJson.item_key)) {
            c9j5.AAV(artifactItemJson.item_key, c9iZ, 1);
        }
        if (zAfR || !"".equals(artifactItemJson.display_name)) {
            c9j5.AAV(artifactItemJson.display_name, c9iZ, 2);
        }
        if (zAfR || artifactItemJson.icon != null) {
            c9j5.AAP(artifactItemJson.icon, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || artifactItemJson.xmds_icon != null) {
            c9j5.AAP(artifactItemJson.xmds_icon, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || artifactItemJson.preview != null) {
            c9j5.AAP(artifactItemJson.preview, ArtifactItemPreviewJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || artifactItemJson.is_favorite) {
            c9j5.AA7(c9iZ, 6, artifactItemJson.is_favorite);
        }
        if (zAfR || artifactItemJson.favorite_order != null) {
            c9j5.AAP(artifactItemJson.favorite_order, C07799it.A00, c9iZ, 7);
        }
        if (zAfR || artifactItemJson.accessed_at_ms != null) {
            c9j5.AAP(artifactItemJson.accessed_at_ms, C9j1.A00, c9iZ, 8);
        }
        if (zAfR || artifactItemJson.frequency_score != null) {
            c9j5.AAP(artifactItemJson.frequency_score, C07799it.A00, c9iZ, 9);
        }
        if (zAfR || artifactItemJson.source_url != null) {
            c9j5.AAP(artifactItemJson.source_url, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || artifactItemJson.has_server_actions != null) {
            c9j5.AAP(artifactItemJson.has_server_actions, C07839ix.A00, c9iZ, 11);
        }
        if (zAfR || artifactItemJson.space_id != null) {
            c9j5.AAP(artifactItemJson.space_id, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || artifactItemJson.artifact_ref != null) {
            c9j5.AAP(artifactItemJson.artifact_ref, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || artifactItemJson.placement != null) {
            c9j5.AAP(artifactItemJson.placement, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || artifactItemJson.sharing != null) {
            c9j5.AAP(artifactItemJson.sharing, ArtifactSharingInfoJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || artifactItemJson.construction_status != null) {
            c9j5.AAP(artifactItemJson.construction_status, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || artifactItemJson.view_url != null) {
            c9j5.AAP(artifactItemJson.view_url, C07779iq.A01, c9iZ, 17);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactItemJson) {
                ArtifactItemJson artifactItemJson = (ArtifactItemJson) obj;
                if (!C7384Etj.areEqual(this.source, artifactItemJson.source) || !C7384Etj.areEqual(this.item_key, artifactItemJson.item_key) || !C7384Etj.areEqual(this.display_name, artifactItemJson.display_name) || !C7384Etj.areEqual(this.icon, artifactItemJson.icon) || !C7384Etj.areEqual(this.xmds_icon, artifactItemJson.xmds_icon) || !C7384Etj.areEqual(this.preview, artifactItemJson.preview) || this.is_favorite != artifactItemJson.is_favorite || !C7384Etj.areEqual(this.favorite_order, artifactItemJson.favorite_order) || !C7384Etj.areEqual(this.accessed_at_ms, artifactItemJson.accessed_at_ms) || !C7384Etj.areEqual(this.frequency_score, artifactItemJson.frequency_score) || !C7384Etj.areEqual(this.source_url, artifactItemJson.source_url) || !C7384Etj.areEqual(this.has_server_actions, artifactItemJson.has_server_actions) || !C7384Etj.areEqual(this.space_id, artifactItemJson.space_id) || !C7384Etj.areEqual(this.artifact_ref, artifactItemJson.artifact_ref) || !C7384Etj.areEqual(this.placement, artifactItemJson.placement) || !C7384Etj.areEqual(this.sharing, artifactItemJson.sharing) || !C7384Etj.areEqual(this.construction_status, artifactItemJson.construction_status) || !C7384Etj.areEqual(this.view_url, artifactItemJson.view_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ArtifactItemJson(String str, String str2, String str3, String str4, String str5, ArtifactItemPreviewJson artifactItemPreviewJson, boolean z, Double d, Long l, Double d2, String str6, Boolean bool, String str7, String str8, String str9, ArtifactSharingInfoJson artifactSharingInfoJson, String str10, String str11, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), (i & 32) != 0 ? null : artifactItemPreviewJson, C3cH.A1M(i, z), (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : d2, C3cG.A0e(str6, i & 1024), (i & 2048) != 0 ? null : bool, C3cG.A0e(str7, i & 4096), C3cG.A0e(str8, i & 8192), C3cG.A0e(str9, i & 16384), (i & 32768) != 0 ? null : artifactSharingInfoJson, C3cI.A0V(i, 65536, str10), C3cI.A0V(i, 131072, str11));
    }

    public final String component1() {
        return this.source;
    }

    public final Double component10() {
        return this.frequency_score;
    }

    public final String component11() {
        return this.source_url;
    }

    public final Boolean component12() {
        return this.has_server_actions;
    }

    public final String component13() {
        return this.space_id;
    }

    public final String component14() {
        return this.artifact_ref;
    }

    public final String component15() {
        return this.placement;
    }

    public final ArtifactSharingInfoJson component16() {
        return this.sharing;
    }

    public final String component17() {
        return this.construction_status;
    }

    public final String component18() {
        return this.view_url;
    }

    public final String component2() {
        return this.item_key;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.xmds_icon;
    }

    public final ArtifactItemPreviewJson component6() {
        return this.preview;
    }

    public final boolean component7() {
        return this.is_favorite;
    }

    public final Double component8() {
        return this.favorite_order;
    }

    public final Long component9() {
        return this.accessed_at_ms;
    }

    public final Long getAccessed_at_ms() {
        return this.accessed_at_ms;
    }

    public final String getArtifact_ref() {
        return this.artifact_ref;
    }

    public final String getConstruction_status() {
        return this.construction_status;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final Double getFavorite_order() {
        return this.favorite_order;
    }

    public final Double getFrequency_score() {
        return this.frequency_score;
    }

    public final Boolean getHas_server_actions() {
        return this.has_server_actions;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getItem_key() {
        return this.item_key;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final ArtifactItemPreviewJson getPreview() {
        return this.preview;
    }

    public final ArtifactSharingInfoJson getSharing() {
        return this.sharing;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSource_url() {
        return this.source_url;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getView_url() {
        return this.view_url;
    }

    public final String getXmds_icon() {
        return this.xmds_icon;
    }

    public int hashCode() {
        return ((((((((((((((((((((C0KA.A01((((((AnonymousClass005.A0I(this.display_name, AnonymousClass005.A0I(this.item_key, AnonymousClass001.A0G(this.source))) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.xmds_icon)) * 31) + AnonymousClass006.A0D(this.preview)) * 31, this.is_favorite) + AnonymousClass006.A0D(this.favorite_order)) * 31) + AnonymousClass006.A0D(this.accessed_at_ms)) * 31) + AnonymousClass006.A0D(this.frequency_score)) * 31) + AnonymousClass006.A0G(this.source_url)) * 31) + AnonymousClass006.A0D(this.has_server_actions)) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.artifact_ref)) * 31) + AnonymousClass006.A0G(this.placement)) * 31) + AnonymousClass006.A0D(this.sharing)) * 31) + AnonymousClass006.A0G(this.construction_status)) * 31) + AnonymousClass005.A0H(this.view_url);
    }

    public final boolean is_favorite() {
        return this.is_favorite;
    }

    public final ArtifactItem toDomain() {
        String str;
        ArtifactSource artifactSourceFromWire = ArtifactSource.Companion.fromWire(this.source);
        if (artifactSourceFromWire == null) {
            return null;
        }
        String str2 = this.item_key;
        if (str2.length() == 0) {
            return null;
        }
        String str3 = this.display_name;
        ArtifactItemPreviewJson artifactItemPreviewJson = this.preview;
        if ((artifactItemPreviewJson == null || (str = artifactItemPreviewJson.icon_url) == null || str.length() <= 0) && ((str = this.icon) == null || str.length() <= 0)) {
            str = null;
        }
        String str4 = this.xmds_icon;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        boolean z = this.is_favorite;
        Double d = this.favorite_order;
        Long l = this.accessed_at_ms;
        Double d2 = this.frequency_score;
        String str5 = this.source_url;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        Boolean bool = this.has_server_actions;
        String str6 = this.space_id;
        if (str6 == null || str6.length() <= 0) {
            str6 = null;
        }
        String str7 = this.artifact_ref;
        if (str7 == null || str7.length() <= 0) {
            str7 = null;
        }
        String str8 = this.placement;
        ArtifactPlacement artifactPlacementFromWire = str8 != null ? ArtifactPlacement.Companion.fromWire(str8) : null;
        ArtifactSharingInfoJson artifactSharingInfoJson = this.sharing;
        ArtifactSharingInfo domain = artifactSharingInfoJson != null ? artifactSharingInfoJson.toDomain() : null;
        String str9 = this.construction_status;
        SpaceConstructionStatus spaceConstructionStatusFromServerValue = str9 != null ? SpaceConstructionStatus.Companion.fromServerValue(str9) : null;
        String str10 = this.view_url;
        if (str10 == null || str10.length() <= 0) {
            str10 = null;
        }
        return new ArtifactItem(artifactSourceFromWire, str2, str3, str, str4, z, d, l, d2, str5, bool, str6, str7, artifactPlacementFromWire, spaceConstructionStatusFromServerValue, domain, str10);
    }

    public final ArtifactItemJson copy(String str, String str2, String str3, String str4, String str5, ArtifactItemPreviewJson artifactItemPreviewJson, boolean z, Double d, Long l, Double d2, String str6, Boolean bool, String str7, String str8, String str9, ArtifactSharingInfoJson artifactSharingInfoJson, String str10, String str11) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ArtifactItemJson(str, str2, str3, str4, str5, artifactItemPreviewJson, z, d, l, d2, str6, bool, str7, str8, str9, artifactSharingInfoJson, str10, str11);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ArtifactItemJson copy$default(ArtifactItemJson artifactItemJson, String str, String str2, String str3, String str4, String str5, ArtifactItemPreviewJson artifactItemPreviewJson, boolean z, Double d, Long l, Double d2, String str6, Boolean bool, String str7, String str8, String str9, ArtifactSharingInfoJson artifactSharingInfoJson, String str10, String str11, int i, Object obj) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        ArtifactItemPreviewJson artifactItemPreviewJson2 = artifactItemPreviewJson;
        boolean z2 = z;
        Double d3 = d;
        Long l2 = l;
        Double d4 = d2;
        String str15 = str6;
        Boolean bool2 = bool;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        ArtifactSharingInfoJson artifactSharingInfoJson2 = artifactSharingInfoJson;
        String str19 = str10;
        String str20 = str11;
        if ((i & 1) != 0) {
            str12 = artifactItemJson.source;
        }
        if ((i & 2) != 0) {
            str13 = artifactItemJson.item_key;
        }
        if ((i & 4) != 0) {
            str14 = artifactItemJson.display_name;
        }
        if ((i & 8) != 0) {
            str4 = artifactItemJson.icon;
        }
        if ((i & 16) != 0) {
            str5 = artifactItemJson.xmds_icon;
        }
        if ((i & 32) != 0) {
            artifactItemPreviewJson2 = artifactItemJson.preview;
        }
        if ((i & 64) != 0) {
            z2 = artifactItemJson.is_favorite;
        }
        if ((i & 128) != 0) {
            d3 = artifactItemJson.favorite_order;
        }
        if ((i & 256) != 0) {
            l2 = artifactItemJson.accessed_at_ms;
        }
        if ((i & 512) != 0) {
            d4 = artifactItemJson.frequency_score;
        }
        if ((i & 1024) != 0) {
            str15 = artifactItemJson.source_url;
        }
        if ((i & 2048) != 0) {
            bool2 = artifactItemJson.has_server_actions;
        }
        if ((i & 4096) != 0) {
            str16 = artifactItemJson.space_id;
        }
        if ((i & 8192) != 0) {
            str17 = artifactItemJson.artifact_ref;
        }
        if ((i & 16384) != 0) {
            str18 = artifactItemJson.placement;
        }
        if ((i & 32768) != 0) {
            artifactSharingInfoJson2 = artifactItemJson.sharing;
        }
        if ((i & 65536) != 0) {
            str19 = artifactItemJson.construction_status;
        }
        if ((i & 131072) != 0) {
            str20 = artifactItemJson.view_url;
        }
        AnonymousClass005.A0x(str12, str13, str14);
        ArtifactItemPreviewJson artifactItemPreviewJson3 = artifactItemPreviewJson2;
        boolean z3 = z2;
        Double d5 = d3;
        return new ArtifactItemJson(str12, str13, str14, str4, str5, artifactItemPreviewJson3, z3, d5, l2, d4, str15, bool2, str16, str17, str18, artifactSharingInfoJson2, str19, str20);
    }

    public ArtifactItemJson(String str, String str2, String str3, String str4, String str5, ArtifactItemPreviewJson artifactItemPreviewJson, boolean z, Double d, Long l, Double d2, String str6, Boolean bool, String str7, String str8, String str9, ArtifactSharingInfoJson artifactSharingInfoJson, String str10, String str11) {
        AnonymousClass005.A0x(str, str2, str3);
        this.source = str;
        this.item_key = str2;
        this.display_name = str3;
        this.icon = str4;
        this.xmds_icon = str5;
        this.preview = artifactItemPreviewJson;
        this.is_favorite = z;
        this.favorite_order = d;
        this.accessed_at_ms = l;
        this.frequency_score = d2;
        this.source_url = str6;
        this.has_server_actions = bool;
        this.space_id = str7;
        this.artifact_ref = str8;
        this.placement = str9;
        this.sharing = artifactSharingInfoJson;
        this.construction_status = str10;
        this.view_url = str11;
    }

    public /* synthetic */ ArtifactItemJson(int i, String str, String str2, String str3, String str4, String str5, ArtifactItemPreviewJson artifactItemPreviewJson, boolean z, Double d, Long l, Double d2, String str6, Boolean bool, String str7, String str8, String str9, ArtifactSharingInfoJson artifactSharingInfoJson, String str10, String str11, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source = "";
        } else {
            this.source = str;
        }
        if ((i & 2) == 0) {
            this.item_key = "";
        } else {
            this.item_key = str2;
        }
        if ((i & 4) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str3;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
        if ((i & 16) == 0) {
            this.xmds_icon = null;
        } else {
            this.xmds_icon = str5;
        }
        if ((i & 32) == 0) {
            this.preview = null;
        } else {
            this.preview = artifactItemPreviewJson;
        }
        if ((i & 64) == 0) {
            this.is_favorite = false;
        } else {
            this.is_favorite = z;
        }
        if ((i & 128) == 0) {
            this.favorite_order = null;
        } else {
            this.favorite_order = d;
        }
        if ((i & 256) == 0) {
            this.accessed_at_ms = null;
        } else {
            this.accessed_at_ms = l;
        }
        if ((i & 512) == 0) {
            this.frequency_score = null;
        } else {
            this.frequency_score = d2;
        }
        if ((i & 1024) == 0) {
            this.source_url = null;
        } else {
            this.source_url = str6;
        }
        if ((i & 2048) == 0) {
            this.has_server_actions = null;
        } else {
            this.has_server_actions = bool;
        }
        if ((i & 4096) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str7;
        }
        if ((i & 8192) == 0) {
            this.artifact_ref = null;
        } else {
            this.artifact_ref = str8;
        }
        if ((i & 16384) == 0) {
            this.placement = null;
        } else {
            this.placement = str9;
        }
        if ((32768 & i) == 0) {
            this.sharing = null;
        } else {
            this.sharing = artifactSharingInfoJson;
        }
        if ((65536 & i) == 0) {
            this.construction_status = null;
        } else {
            this.construction_status = str10;
        }
        if ((i & 131072) == 0) {
            this.view_url = null;
        } else {
            this.view_url = str11;
        }
    }

    public ArtifactItemJson() {
        this("", "", "", null, null, null, false, null, null, null, null, null, null, null, null, null, null, null);
    }
}
