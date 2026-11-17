package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactNodeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String artifact_ref;
    public final ArtifactCapabilitiesJson capabilities;
    public final Long created_at_ms;
    public final String display_name;
    public final String format;
    public final boolean is_pinned;
    public final Long last_activity_at_ms;
    public final Long last_opened_at_ms;
    public final ArtifactOpenTargetJson open_target;
    public final String placement;
    public final ArtifactPreviewJson preview;
    public final String publisher_name;
    public final ArtifactSharingInfoJson sharing;
    public final String source;
    public final String space_id;
    public final String status;
    public final Long updated_at_ms;

    public final class Companion {
        public final C9hr<ArtifactNodeJson> serializer() {
            return ArtifactNodeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactNodeJson artifactNodeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(artifactNodeJson.artifact_ref)) {
            c9j5.AAV(artifactNodeJson.artifact_ref, c9iZ, 0);
        }
        if (zAfR || !"".equals(artifactNodeJson.source)) {
            c9j5.AAV(artifactNodeJson.source, c9iZ, 1);
        }
        if (zAfR || !"".equals(artifactNodeJson.display_name)) {
            c9j5.AAV(artifactNodeJson.display_name, c9iZ, 2);
        }
        if (zAfR || artifactNodeJson.format != null) {
            c9j5.AAP(artifactNodeJson.format, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || artifactNodeJson.created_at_ms != null) {
            c9j5.AAP(artifactNodeJson.created_at_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || artifactNodeJson.updated_at_ms != null) {
            c9j5.AAP(artifactNodeJson.updated_at_ms, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || artifactNodeJson.last_opened_at_ms != null) {
            c9j5.AAP(artifactNodeJson.last_opened_at_ms, C9j1.A00, c9iZ, 6);
        }
        if (zAfR || artifactNodeJson.last_activity_at_ms != null) {
            c9j5.AAP(artifactNodeJson.last_activity_at_ms, C9j1.A00, c9iZ, 7);
        }
        if (zAfR || artifactNodeJson.is_pinned) {
            c9j5.AA7(c9iZ, 8, artifactNodeJson.is_pinned);
        }
        if (zAfR || artifactNodeJson.status != null) {
            c9j5.AAP(artifactNodeJson.status, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || artifactNodeJson.preview != null) {
            c9j5.AAP(artifactNodeJson.preview, ArtifactPreviewJson$$serializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || artifactNodeJson.open_target != null) {
            c9j5.AAP(artifactNodeJson.open_target, ArtifactOpenTargetJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || !C7384Etj.areEqual(artifactNodeJson.capabilities, new ArtifactCapabilitiesJson(false, false, false, false, false, false))) {
            c9j5.AAQ(artifactNodeJson.capabilities, ArtifactCapabilitiesJson$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || artifactNodeJson.space_id != null) {
            c9j5.AAP(artifactNodeJson.space_id, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || artifactNodeJson.placement != null) {
            c9j5.AAP(artifactNodeJson.placement, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || artifactNodeJson.sharing != null) {
            c9j5.AAP(artifactNodeJson.sharing, ArtifactSharingInfoJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || artifactNodeJson.publisher_name != null) {
            c9j5.AAP(artifactNodeJson.publisher_name, C07779iq.A01, c9iZ, 16);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactNodeJson) {
                ArtifactNodeJson artifactNodeJson = (ArtifactNodeJson) obj;
                if (!C7384Etj.areEqual(this.artifact_ref, artifactNodeJson.artifact_ref) || !C7384Etj.areEqual(this.source, artifactNodeJson.source) || !C7384Etj.areEqual(this.display_name, artifactNodeJson.display_name) || !C7384Etj.areEqual(this.format, artifactNodeJson.format) || !C7384Etj.areEqual(this.created_at_ms, artifactNodeJson.created_at_ms) || !C7384Etj.areEqual(this.updated_at_ms, artifactNodeJson.updated_at_ms) || !C7384Etj.areEqual(this.last_opened_at_ms, artifactNodeJson.last_opened_at_ms) || !C7384Etj.areEqual(this.last_activity_at_ms, artifactNodeJson.last_activity_at_ms) || this.is_pinned != artifactNodeJson.is_pinned || !C7384Etj.areEqual(this.status, artifactNodeJson.status) || !C7384Etj.areEqual(this.preview, artifactNodeJson.preview) || !C7384Etj.areEqual(this.open_target, artifactNodeJson.open_target) || !C7384Etj.areEqual(this.capabilities, artifactNodeJson.capabilities) || !C7384Etj.areEqual(this.space_id, artifactNodeJson.space_id) || !C7384Etj.areEqual(this.placement, artifactNodeJson.placement) || !C7384Etj.areEqual(this.sharing, artifactNodeJson.sharing) || !C7384Etj.areEqual(this.publisher_name, artifactNodeJson.publisher_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactNodeJson copy$default(ArtifactNodeJson artifactNodeJson, String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, boolean z, String str5, ArtifactPreviewJson artifactPreviewJson, ArtifactOpenTargetJson artifactOpenTargetJson, ArtifactCapabilitiesJson artifactCapabilitiesJson, String str6, String str7, ArtifactSharingInfoJson artifactSharingInfoJson, String str8, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        Long l5 = l;
        Long l6 = l2;
        Long l7 = l3;
        Long l8 = l4;
        boolean z2 = z;
        String str13 = str5;
        ArtifactPreviewJson artifactPreviewJson2 = artifactPreviewJson;
        ArtifactOpenTargetJson artifactOpenTargetJson2 = artifactOpenTargetJson;
        ArtifactCapabilitiesJson artifactCapabilitiesJson2 = artifactCapabilitiesJson;
        String str14 = str6;
        String str15 = str7;
        ArtifactSharingInfoJson artifactSharingInfoJson2 = artifactSharingInfoJson;
        String str16 = str8;
        if ((i & 1) != 0) {
            str9 = artifactNodeJson.artifact_ref;
        }
        if ((i & 2) != 0) {
            str10 = artifactNodeJson.source;
        }
        if ((i & 4) != 0) {
            str11 = artifactNodeJson.display_name;
        }
        if ((i & 8) != 0) {
            str12 = artifactNodeJson.format;
        }
        if ((i & 16) != 0) {
            l5 = artifactNodeJson.created_at_ms;
        }
        if ((i & 32) != 0) {
            l6 = artifactNodeJson.updated_at_ms;
        }
        if ((i & 64) != 0) {
            l7 = artifactNodeJson.last_opened_at_ms;
        }
        if ((i & 128) != 0) {
            l8 = artifactNodeJson.last_activity_at_ms;
        }
        if ((i & 256) != 0) {
            z2 = artifactNodeJson.is_pinned;
        }
        if ((i & 512) != 0) {
            str13 = artifactNodeJson.status;
        }
        if ((i & 1024) != 0) {
            artifactPreviewJson2 = artifactNodeJson.preview;
        }
        if ((i & 2048) != 0) {
            artifactOpenTargetJson2 = artifactNodeJson.open_target;
        }
        if ((i & 4096) != 0) {
            artifactCapabilitiesJson2 = artifactNodeJson.capabilities;
        }
        if ((i & 8192) != 0) {
            str14 = artifactNodeJson.space_id;
        }
        if ((i & 16384) != 0) {
            str15 = artifactNodeJson.placement;
        }
        if ((i & 32768) != 0) {
            artifactSharingInfoJson2 = artifactNodeJson.sharing;
        }
        if ((i & 65536) != 0) {
            str16 = artifactNodeJson.publisher_name;
        }
        Long l9 = l5;
        return artifactNodeJson.copy(str9, str10, str11, str12, l9, l6, l7, l8, z2, str13, artifactPreviewJson2, artifactOpenTargetJson2, artifactCapabilitiesJson2, str14, str15, artifactSharingInfoJson2, str16);
    }

    public final String component1() {
        return this.artifact_ref;
    }

    public final String component10() {
        return this.status;
    }

    public final ArtifactPreviewJson component11() {
        return this.preview;
    }

    public final ArtifactOpenTargetJson component12() {
        return this.open_target;
    }

    public final ArtifactCapabilitiesJson component13() {
        return this.capabilities;
    }

    public final String component14() {
        return this.space_id;
    }

    public final String component15() {
        return this.placement;
    }

    public final ArtifactSharingInfoJson component16() {
        return this.sharing;
    }

    public final String component17() {
        return this.publisher_name;
    }

    public final String component2() {
        return this.source;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String component4() {
        return this.format;
    }

    public final Long component5() {
        return this.created_at_ms;
    }

    public final Long component6() {
        return this.updated_at_ms;
    }

    public final Long component7() {
        return this.last_opened_at_ms;
    }

    public final Long component8() {
        return this.last_activity_at_ms;
    }

    public final boolean component9() {
        return this.is_pinned;
    }

    public final String getArtifact_ref() {
        return this.artifact_ref;
    }

    public final ArtifactCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final Long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Long getLast_activity_at_ms() {
        return this.last_activity_at_ms;
    }

    public final Long getLast_opened_at_ms() {
        return this.last_opened_at_ms;
    }

    public final ArtifactOpenTargetJson getOpen_target() {
        return this.open_target;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final ArtifactPreviewJson getPreview() {
        return this.preview;
    }

    public final String getPublisher_name() {
        return this.publisher_name;
    }

    public final ArtifactSharingInfoJson getSharing() {
        return this.sharing;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.capabilities, (((((C0KA.A01((((((((((AnonymousClass005.A0I(this.display_name, AnonymousClass005.A0I(this.source, AnonymousClass001.A0G(this.artifact_ref))) + AnonymousClass006.A0G(this.format)) * 31) + AnonymousClass006.A0D(this.created_at_ms)) * 31) + AnonymousClass006.A0D(this.updated_at_ms)) * 31) + AnonymousClass006.A0D(this.last_opened_at_ms)) * 31) + AnonymousClass006.A0D(this.last_activity_at_ms)) * 31, this.is_pinned) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0D(this.preview)) * 31) + AnonymousClass006.A0D(this.open_target)) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.placement)) * 31) + AnonymousClass006.A0D(this.sharing)) * 31) + AnonymousClass005.A0H(this.publisher_name);
    }

    public final boolean is_pinned() {
        return this.is_pinned;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066 A[PHI: r1
  0x0066: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:35:0x0064, B:33:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076 A[PHI: r1
  0x0076: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String), (r1v3 java.lang.String), (r1v3 java.lang.String) binds: [B:35:0x0064, B:37:0x0068, B:39:0x006e, B:41:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.library.repo.UnifiedArtifact toDomain() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactNodeJson.toDomain():com.facebook.aura.library.repo.UnifiedArtifact");
    }

    public ArtifactNodeJson(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, boolean z, String str5, ArtifactPreviewJson artifactPreviewJson, ArtifactOpenTargetJson artifactOpenTargetJson, ArtifactCapabilitiesJson artifactCapabilitiesJson, String str6, String str7, ArtifactSharingInfoJson artifactSharingInfoJson, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(artifactCapabilitiesJson, 12);
        this.artifact_ref = str;
        this.source = str2;
        this.display_name = str3;
        this.format = str4;
        this.created_at_ms = l;
        this.updated_at_ms = l2;
        this.last_opened_at_ms = l3;
        this.last_activity_at_ms = l4;
        this.is_pinned = z;
        this.status = str5;
        this.preview = artifactPreviewJson;
        this.open_target = artifactOpenTargetJson;
        this.capabilities = artifactCapabilitiesJson;
        this.space_id = str6;
        this.placement = str7;
        this.sharing = artifactSharingInfoJson;
        this.publisher_name = str8;
    }

    public final ArtifactNodeJson copy(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, boolean z, String str5, ArtifactPreviewJson artifactPreviewJson, ArtifactOpenTargetJson artifactOpenTargetJson, ArtifactCapabilitiesJson artifactCapabilitiesJson, String str6, String str7, ArtifactSharingInfoJson artifactSharingInfoJson, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(artifactCapabilitiesJson, 12);
        return new ArtifactNodeJson(str, str2, str3, str4, l, l2, l3, l4, z, str5, artifactPreviewJson, artifactOpenTargetJson, artifactCapabilitiesJson, str6, str7, artifactSharingInfoJson, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactNodeJson(int i, String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, boolean z, String str5, ArtifactPreviewJson artifactPreviewJson, ArtifactOpenTargetJson artifactOpenTargetJson, ArtifactCapabilitiesJson artifactCapabilitiesJson, String str6, String str7, ArtifactSharingInfoJson artifactSharingInfoJson, String str8, C2hx c2hx) {
        boolean z2 = z;
        if ((i & 1) == 0) {
            this.artifact_ref = "";
        } else {
            this.artifact_ref = str;
        }
        if ((i & 2) == 0) {
            this.source = "";
        } else {
            this.source = str2;
        }
        if ((i & 4) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str3;
        }
        if ((i & 8) == 0) {
            this.format = null;
        } else {
            this.format = str4;
        }
        if ((i & 16) == 0) {
            this.created_at_ms = null;
        } else {
            this.created_at_ms = l;
        }
        if ((i & 32) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = l2;
        }
        if ((i & 64) == 0) {
            this.last_opened_at_ms = null;
        } else {
            this.last_opened_at_ms = l3;
        }
        if ((i & 128) == 0) {
            this.last_activity_at_ms = null;
        } else {
            this.last_activity_at_ms = l4;
        }
        this.is_pinned = (i & 256) == 0 ? false : z2;
        if ((i & 512) == 0) {
            this.status = null;
        } else {
            this.status = str5;
        }
        if ((i & 1024) == 0) {
            this.preview = null;
        } else {
            this.preview = artifactPreviewJson;
        }
        if ((i & 2048) == 0) {
            this.open_target = null;
        } else {
            this.open_target = artifactOpenTargetJson;
        }
        if ((i & 4096) == 0) {
            this.capabilities = new ArtifactCapabilitiesJson(false, false, false, false, false, false);
        } else {
            this.capabilities = artifactCapabilitiesJson;
        }
        if ((i & 8192) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str6;
        }
        if ((i & 16384) == 0) {
            this.placement = null;
        } else {
            this.placement = str7;
        }
        if ((32768 & i) == 0) {
            this.sharing = null;
        } else {
            this.sharing = artifactSharingInfoJson;
        }
        if ((i & 65536) == 0) {
            this.publisher_name = null;
        } else {
            this.publisher_name = str8;
        }
    }

    public /* synthetic */ ArtifactNodeJson(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, boolean z, String str5, ArtifactPreviewJson artifactPreviewJson, ArtifactOpenTargetJson artifactOpenTargetJson, ArtifactCapabilitiesJson artifactCapabilitiesJson, String str6, String str7, ArtifactSharingInfoJson artifactSharingInfoJson, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", C3cG.A0e(str4, i & 8), (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : l4, C3cG.A1K(i & 256, z), C3cG.A0e(str5, i & 512), (i & 1024) != 0 ? null : artifactPreviewJson, (i & 2048) != 0 ? null : artifactOpenTargetJson, (i & 4096) != 0 ? new ArtifactCapabilitiesJson(false, false, false, false, false, false) : artifactCapabilitiesJson, C3cG.A0e(str6, i & 8192), C3cG.A0e(str7, i & 16384), (i & 32768) != 0 ? null : artifactSharingInfoJson, C3cI.A0V(i, 65536, str8));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ArtifactNodeJson() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        this((String) null, (String) objArr, (String) objArr2, (String) objArr3, (Long) objArr4, (Long) objArr5, (Long) objArr6, (Long) objArr7, false, (String) (0 == true ? 1 : 0), (ArtifactPreviewJson) (0 == true ? 1 : 0), (ArtifactOpenTargetJson) (0 == true ? 1 : 0), (ArtifactCapabilitiesJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ArtifactSharingInfoJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 131071, (C06H) (0 == true ? 1 : 0));
    }
}
