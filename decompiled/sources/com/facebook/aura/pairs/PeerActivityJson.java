package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerActivityJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String activity_id;
    public final long at_ms;
    public final String connection_id;
    public final String delivery_id;
    public final String file_name;
    public final String file_ref;
    public final String goal_id;
    public final String host_muse;
    public final String icon_url;
    public final String item_id;
    public final String kind;
    public final Integer member_count;
    public final String message_id;
    public final String mime_type;
    public final String muse_id;
    public final String person_name;
    public final String person_photo_sha256;
    public final String reference;
    public final String relationship_generation_id;
    public final String share_id;
    public final String slug;
    public final String space_id;
    public final String space_name;
    public final String state;
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<PeerActivityJson> serializer() {
            return PeerActivityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerActivityJson peerActivityJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerActivityJson.activity_id)) {
            c9j5.AAV(peerActivityJson.activity_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerActivityJson.kind)) {
            c9j5.AAV(peerActivityJson.kind, c9iZ, 1);
        }
        if (zAfR || !"".equals(peerActivityJson.muse_id)) {
            c9j5.AAV(peerActivityJson.muse_id, c9iZ, 2);
        }
        if (zAfR || peerActivityJson.at_ms != 0) {
            c9j5.AAN(c9iZ, 3, peerActivityJson.at_ms);
        }
        if (zAfR || peerActivityJson.delivery_id != null) {
            c9j5.AAP(peerActivityJson.delivery_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || peerActivityJson.relationship_generation_id != null) {
            c9j5.AAP(peerActivityJson.relationship_generation_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || peerActivityJson.person_name != null) {
            c9j5.AAP(peerActivityJson.person_name, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || peerActivityJson.person_photo_sha256 != null) {
            c9j5.AAP(peerActivityJson.person_photo_sha256, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || peerActivityJson.file_name != null) {
            c9j5.AAP(peerActivityJson.file_name, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || peerActivityJson.file_ref != null) {
            c9j5.AAP(peerActivityJson.file_ref, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || peerActivityJson.mime_type != null) {
            c9j5.AAP(peerActivityJson.mime_type, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || peerActivityJson.state != null) {
            c9j5.AAP(peerActivityJson.state, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || peerActivityJson.space_name != null) {
            c9j5.AAP(peerActivityJson.space_name, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || peerActivityJson.member_count != null) {
            c9j5.AAP(peerActivityJson.member_count, C07729ii.A00, c9iZ, 13);
        }
        if (zAfR || peerActivityJson.title != null) {
            c9j5.AAP(peerActivityJson.title, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || peerActivityJson.space_id != null) {
            c9j5.AAP(peerActivityJson.space_id, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || peerActivityJson.slug != null) {
            c9j5.AAP(peerActivityJson.slug, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || peerActivityJson.reference != null) {
            c9j5.AAP(peerActivityJson.reference, C07779iq.A01, c9iZ, 17);
        }
        if (zAfR || peerActivityJson.share_id != null) {
            c9j5.AAP(peerActivityJson.share_id, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || peerActivityJson.url != null) {
            c9j5.AAP(peerActivityJson.url, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || peerActivityJson.item_id != null) {
            c9j5.AAP(peerActivityJson.item_id, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || peerActivityJson.goal_id != null) {
            c9j5.AAP(peerActivityJson.goal_id, C07779iq.A01, c9iZ, 21);
        }
        if (zAfR || peerActivityJson.host_muse != null) {
            c9j5.AAP(peerActivityJson.host_muse, C07779iq.A01, c9iZ, 22);
        }
        if (zAfR || peerActivityJson.message_id != null) {
            c9j5.AAP(peerActivityJson.message_id, C07779iq.A01, c9iZ, 23);
        }
        if (zAfR || peerActivityJson.connection_id != null) {
            c9j5.AAP(peerActivityJson.connection_id, C07779iq.A01, c9iZ, 24);
        }
        if (zAfR || peerActivityJson.icon_url != null) {
            c9j5.AAP(peerActivityJson.icon_url, C07779iq.A01, c9iZ, 25);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerActivityJson) {
                PeerActivityJson peerActivityJson = (PeerActivityJson) obj;
                if (!C7384Etj.areEqual(this.activity_id, peerActivityJson.activity_id) || !C7384Etj.areEqual(this.kind, peerActivityJson.kind) || !C7384Etj.areEqual(this.muse_id, peerActivityJson.muse_id) || this.at_ms != peerActivityJson.at_ms || !C7384Etj.areEqual(this.delivery_id, peerActivityJson.delivery_id) || !C7384Etj.areEqual(this.relationship_generation_id, peerActivityJson.relationship_generation_id) || !C7384Etj.areEqual(this.person_name, peerActivityJson.person_name) || !C7384Etj.areEqual(this.person_photo_sha256, peerActivityJson.person_photo_sha256) || !C7384Etj.areEqual(this.file_name, peerActivityJson.file_name) || !C7384Etj.areEqual(this.file_ref, peerActivityJson.file_ref) || !C7384Etj.areEqual(this.mime_type, peerActivityJson.mime_type) || !C7384Etj.areEqual(this.state, peerActivityJson.state) || !C7384Etj.areEqual(this.space_name, peerActivityJson.space_name) || !C7384Etj.areEqual(this.member_count, peerActivityJson.member_count) || !C7384Etj.areEqual(this.title, peerActivityJson.title) || !C7384Etj.areEqual(this.space_id, peerActivityJson.space_id) || !C7384Etj.areEqual(this.slug, peerActivityJson.slug) || !C7384Etj.areEqual(this.reference, peerActivityJson.reference) || !C7384Etj.areEqual(this.share_id, peerActivityJson.share_id) || !C7384Etj.areEqual(this.url, peerActivityJson.url) || !C7384Etj.areEqual(this.item_id, peerActivityJson.item_id) || !C7384Etj.areEqual(this.goal_id, peerActivityJson.goal_id) || !C7384Etj.areEqual(this.host_muse, peerActivityJson.host_muse) || !C7384Etj.areEqual(this.message_id, peerActivityJson.message_id) || !C7384Etj.areEqual(this.connection_id, peerActivityJson.connection_id) || !C7384Etj.areEqual(this.icon_url, peerActivityJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.activity_id;
    }

    public final String component10() {
        return this.file_ref;
    }

    public final String component11() {
        return this.mime_type;
    }

    public final String component12() {
        return this.state;
    }

    public final String component13() {
        return this.space_name;
    }

    public final Integer component14() {
        return this.member_count;
    }

    public final String component15() {
        return this.title;
    }

    public final String component16() {
        return this.space_id;
    }

    public final String component17() {
        return this.slug;
    }

    public final String component18() {
        return this.reference;
    }

    public final String component19() {
        return this.share_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component20() {
        return this.url;
    }

    public final String component21() {
        return this.item_id;
    }

    public final String component22() {
        return this.goal_id;
    }

    public final String component23() {
        return this.host_muse;
    }

    public final String component24() {
        return this.message_id;
    }

    public final String component25() {
        return this.connection_id;
    }

    public final String component26() {
        return this.icon_url;
    }

    public final String component3() {
        return this.muse_id;
    }

    public final long component4() {
        return this.at_ms;
    }

    public final String component5() {
        return this.delivery_id;
    }

    public final String component6() {
        return this.relationship_generation_id;
    }

    public final String component7() {
        return this.person_name;
    }

    public final String component8() {
        return this.person_photo_sha256;
    }

    public final String component9() {
        return this.file_name;
    }

    public final String getActivity_id() {
        return this.activity_id;
    }

    public final long getAt_ms() {
        return this.at_ms;
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getFile_ref() {
        return this.file_ref;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getItem_id() {
        return this.item_id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Integer getMember_count() {
        return this.member_count;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getPerson_name() {
        return this.person_name;
    }

    public final String getPerson_photo_sha256() {
        return this.person_photo_sha256;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getRelationship_generation_id() {
        return this.relationship_generation_id;
    }

    public final String getShare_id() {
        return this.share_id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getSpace_name() {
        return this.space_name;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((C60R.A00(this.at_ms, AnonymousClass005.A0I(this.muse_id, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.activity_id)))) + AnonymousClass006.A0G(this.delivery_id)) * 31) + AnonymousClass006.A0G(this.relationship_generation_id)) * 31) + AnonymousClass006.A0G(this.person_name)) * 31) + AnonymousClass006.A0G(this.person_photo_sha256)) * 31) + AnonymousClass006.A0G(this.file_name)) * 31) + AnonymousClass006.A0G(this.file_ref)) * 31) + AnonymousClass006.A0G(this.mime_type)) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.space_name)) * 31) + AnonymousClass006.A0D(this.member_count)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.slug)) * 31) + AnonymousClass006.A0G(this.reference)) * 31) + AnonymousClass006.A0G(this.share_id)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.item_id)) * 31) + AnonymousClass006.A0G(this.goal_id)) * 31) + AnonymousClass006.A0G(this.host_muse)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.connection_id)) * 31) + AnonymousClass005.A0H(this.icon_url);
    }

    public final PeerActivityJson copy(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerActivityJson(str, str2, str3, j, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerActivityJson(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.activity_id = "";
        } else {
            this.activity_id = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.muse_id = "";
        } else {
            this.muse_id = str3;
        }
        if ((i & 8) == 0) {
            this.at_ms = 0L;
        } else {
            this.at_ms = j;
        }
        if ((i & 16) == 0) {
            this.delivery_id = null;
        } else {
            this.delivery_id = str4;
        }
        if ((i & 32) == 0) {
            this.relationship_generation_id = null;
        } else {
            this.relationship_generation_id = str5;
        }
        if ((i & 64) == 0) {
            this.person_name = null;
        } else {
            this.person_name = str6;
        }
        if ((i & 128) == 0) {
            this.person_photo_sha256 = null;
        } else {
            this.person_photo_sha256 = str7;
        }
        if ((i & 256) == 0) {
            this.file_name = null;
        } else {
            this.file_name = str8;
        }
        if ((i & 512) == 0) {
            this.file_ref = null;
        } else {
            this.file_ref = str9;
        }
        if ((i & 1024) == 0) {
            this.mime_type = null;
        } else {
            this.mime_type = str10;
        }
        if ((i & 2048) == 0) {
            this.state = null;
        } else {
            this.state = str11;
        }
        if ((i & 4096) == 0) {
            this.space_name = null;
        } else {
            this.space_name = str12;
        }
        if ((i & 8192) == 0) {
            this.member_count = null;
        } else {
            this.member_count = num;
        }
        if ((i & 16384) == 0) {
            this.title = null;
        } else {
            this.title = str13;
        }
        if ((32768 & i) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str14;
        }
        if ((65536 & i) == 0) {
            this.slug = null;
        } else {
            this.slug = str15;
        }
        if ((131072 & i) == 0) {
            this.reference = null;
        } else {
            this.reference = str16;
        }
        if ((262144 & i) == 0) {
            this.share_id = null;
        } else {
            this.share_id = str17;
        }
        if ((524288 & i) == 0) {
            this.url = null;
        } else {
            this.url = str18;
        }
        if ((1048576 & i) == 0) {
            this.item_id = null;
        } else {
            this.item_id = str19;
        }
        if ((2097152 & i) == 0) {
            this.goal_id = null;
        } else {
            this.goal_id = str20;
        }
        if ((4194304 & i) == 0) {
            this.host_muse = null;
        } else {
            this.host_muse = str21;
        }
        if ((8388608 & i) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str22;
        }
        if ((16777216 & i) == 0) {
            this.connection_id = null;
        } else {
            this.connection_id = str23;
        }
        if ((i & 33554432) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str24;
        }
    }

    public static /* synthetic */ PeerActivityJson copy$default(PeerActivityJson peerActivityJson, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, Object obj) {
        String str25 = str;
        String str26 = str2;
        String str27 = str3;
        long j2 = j;
        String str28 = str13;
        String str29 = str20;
        String str30 = str21;
        String str31 = str22;
        String str32 = str23;
        String str33 = str14;
        String str34 = str15;
        String str35 = str16;
        String str36 = str17;
        String str37 = str18;
        String str38 = str19;
        String str39 = str24;
        if ((i & 1) != 0) {
            str25 = peerActivityJson.activity_id;
        }
        if ((i & 2) != 0) {
            str26 = peerActivityJson.kind;
        }
        if ((i & 4) != 0) {
            str27 = peerActivityJson.muse_id;
        }
        if ((i & 8) != 0) {
            j2 = peerActivityJson.at_ms;
        }
        if ((i & 16) != 0) {
            str4 = peerActivityJson.delivery_id;
        }
        if ((i & 32) != 0) {
            str5 = peerActivityJson.relationship_generation_id;
        }
        if ((i & 64) != 0) {
            str6 = peerActivityJson.person_name;
        }
        if ((i & 128) != 0) {
            str7 = peerActivityJson.person_photo_sha256;
        }
        if ((i & 256) != 0) {
            str8 = peerActivityJson.file_name;
        }
        if ((i & 512) != 0) {
            str9 = peerActivityJson.file_ref;
        }
        if ((i & 1024) != 0) {
            str10 = peerActivityJson.mime_type;
        }
        if ((i & 2048) != 0) {
            str11 = peerActivityJson.state;
        }
        if ((i & 4096) != 0) {
            str12 = peerActivityJson.space_name;
        }
        if ((i & 8192) != 0) {
            num = peerActivityJson.member_count;
        }
        if ((i & 16384) != 0) {
            str28 = peerActivityJson.title;
        }
        if ((i & 32768) != 0) {
            str33 = peerActivityJson.space_id;
        }
        if ((i & 65536) != 0) {
            str34 = peerActivityJson.slug;
        }
        if ((i & 131072) != 0) {
            str35 = peerActivityJson.reference;
        }
        if ((i & 262144) != 0) {
            str36 = peerActivityJson.share_id;
        }
        if ((i & 524288) != 0) {
            str37 = peerActivityJson.url;
        }
        if ((i & 1048576) != 0) {
            str38 = peerActivityJson.item_id;
        }
        if ((i & 2097152) != 0) {
            str29 = peerActivityJson.goal_id;
        }
        if ((i & 4194304) != 0) {
            str30 = peerActivityJson.host_muse;
        }
        if ((i & 8388608) != 0) {
            str31 = peerActivityJson.message_id;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str32 = peerActivityJson.connection_id;
        }
        if ((i & 33554432) != 0) {
            str39 = peerActivityJson.icon_url;
        }
        AnonymousClass005.A0x(str25, str26, str27);
        return new PeerActivityJson(str25, str26, str27, j2, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, str28, str33, str34, str35, str36, str37, str38, str29, str30, str31, str32, str39);
    }

    public /* synthetic */ PeerActivityJson(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", C3cH.A03(i & 8, j), C3cG.A0e(str4, i & 16), C3cG.A0e(str5, i & 32), C3cG.A0e(str6, i & 64), C3cG.A0e(str7, i & 128), C3cG.A0e(str8, i & 256), C3cG.A0e(str9, i & 512), C3cG.A0e(str10, i & 1024), C3cG.A0e(str11, i & 2048), C3cG.A0e(str12, i & 4096), (i & 8192) != 0 ? null : num, C3cG.A0e(str13, i & 16384), C3cI.A0V(i, 32768, str14), C3cI.A0V(i, 65536, str15), C3cI.A0V(i, 131072, str16), C3cI.A0V(i, 262144, str17), C3cI.A0V(i, 524288, str18), C3cI.A0V(i, 1048576, str19), C3cI.A0V(i, 2097152, str20), C3cI.A0V(i, 4194304, str21), C3cI.A0V(i, 8388608, str22), C3cI.A0V(i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, str23), C3cI.A0V(i, 33554432, str24));
    }

    public PeerActivityJson(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        AnonymousClass005.A0x(str, str2, str3);
        this.activity_id = str;
        this.kind = str2;
        this.muse_id = str3;
        this.at_ms = j;
        this.delivery_id = str4;
        this.relationship_generation_id = str5;
        this.person_name = str6;
        this.person_photo_sha256 = str7;
        this.file_name = str8;
        this.file_ref = str9;
        this.mime_type = str10;
        this.state = str11;
        this.space_name = str12;
        this.member_count = num;
        this.title = str13;
        this.space_id = str14;
        this.slug = str15;
        this.reference = str16;
        this.share_id = str17;
        this.url = str18;
        this.item_id = str19;
        this.goal_id = str20;
        this.host_muse = str21;
        this.message_id = str22;
        this.connection_id = str23;
        this.icon_url = str24;
    }

    public PeerActivityJson() {
        this("", "", "", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
