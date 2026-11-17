package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerContactJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agent_name;
    public final boolean attested;
    public final String chat_session_id;
    public final long created_at_ms;
    public final String display_name;
    public final PeerLastActivityJson last_activity;
    public final PeerImageJson muse_avatar;
    public final PeerImageJson muse_avatar_ref;
    public final String muse_id;
    public final Long paired_at_ms;
    public final PeerImageJson profile_photo;
    public final PeerImageJson profile_photo_ref;
    public final String relationship_generation_id;
    public final long relationship_revision;
    public final Long relationship_started_at_ms;
    public final Long request_expires_at_ms;
    public final boolean sas_confirmed_local;
    public final String status;
    public final String trust_preset;

    public final class Companion {
        public final C9hr<PeerContactJson> serializer() {
            return PeerContactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerContactJson(String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j2, String str7, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, PeerLastActivityJson peerLastActivityJson, Long l3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A0z(str3, str4, str5);
        C7384Etj.A0Y(str6, 8);
        this.muse_id = str;
        this.relationship_generation_id = str2;
        this.relationship_revision = j;
        this.relationship_started_at_ms = l;
        this.request_expires_at_ms = l2;
        this.display_name = str3;
        this.agent_name = str4;
        this.status = str5;
        this.trust_preset = str6;
        this.sas_confirmed_local = z;
        this.attested = z2;
        this.created_at_ms = j2;
        this.chat_session_id = str7;
        this.profile_photo = peerImageJson;
        this.muse_avatar = peerImageJson2;
        this.profile_photo_ref = peerImageJson3;
        this.muse_avatar_ref = peerImageJson4;
        this.last_activity = peerLastActivityJson;
        this.paired_at_ms = l3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerContactJson peerContactJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerContactJson.muse_id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerContactJson.relationship_generation_id != null) {
            c9j5.AAP(peerContactJson.relationship_generation_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || peerContactJson.relationship_revision != 0) {
            c9j5.AAN(c9iZ, 2, peerContactJson.relationship_revision);
        }
        if (zAfR || peerContactJson.relationship_started_at_ms != null) {
            c9j5.AAP(peerContactJson.relationship_started_at_ms, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || peerContactJson.request_expires_at_ms != null) {
            c9j5.AAP(peerContactJson.request_expires_at_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || !"".equals(peerContactJson.display_name)) {
            c9j5.AAV(peerContactJson.display_name, c9iZ, 5);
        }
        if (zAfR || !"".equals(peerContactJson.agent_name)) {
            c9j5.AAV(peerContactJson.agent_name, c9iZ, 6);
        }
        if (zAfR || !"".equals(peerContactJson.status)) {
            c9j5.AAV(peerContactJson.status, c9iZ, 7);
        }
        if (zAfR || !"".equals(peerContactJson.trust_preset)) {
            c9j5.AAV(peerContactJson.trust_preset, c9iZ, 8);
        }
        if (zAfR || peerContactJson.sas_confirmed_local) {
            c9j5.AA7(c9iZ, 9, peerContactJson.sas_confirmed_local);
        }
        if (zAfR || peerContactJson.attested) {
            c9j5.AA7(c9iZ, 10, peerContactJson.attested);
        }
        if (zAfR || peerContactJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 11, peerContactJson.created_at_ms);
        }
        if (zAfR || peerContactJson.chat_session_id != null) {
            c9j5.AAP(peerContactJson.chat_session_id, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || peerContactJson.profile_photo != null) {
            c9j5.AAP(peerContactJson.profile_photo, PeerImageJson$$serializer.INSTANCE, c9iZ, 13);
        }
        if (zAfR || peerContactJson.muse_avatar != null) {
            c9j5.AAP(peerContactJson.muse_avatar, PeerImageJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || peerContactJson.profile_photo_ref != null) {
            c9j5.AAP(peerContactJson.profile_photo_ref, PeerImageJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || peerContactJson.muse_avatar_ref != null) {
            c9j5.AAP(peerContactJson.muse_avatar_ref, PeerImageJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || peerContactJson.last_activity != null) {
            c9j5.AAP(peerContactJson.last_activity, PeerLastActivityJson$$serializer.INSTANCE, c9iZ, 17);
        }
        if (zAfR || peerContactJson.paired_at_ms != null) {
            c9j5.AAP(peerContactJson.paired_at_ms, C9j1.A00, c9iZ, 18);
        }
    }

    public final PeerContactJson copy(String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j2, String str7, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, PeerLastActivityJson peerLastActivityJson, Long l3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A0z(str3, str4, str5);
        C7384Etj.A0Y(str6, 8);
        return new PeerContactJson(str, str2, j, l, l2, str3, str4, str5, str6, z, z2, j2, str7, peerImageJson, peerImageJson2, peerImageJson3, peerImageJson4, peerLastActivityJson, l3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerContactJson) {
                PeerContactJson peerContactJson = (PeerContactJson) obj;
                if (!C7384Etj.areEqual(this.muse_id, peerContactJson.muse_id) || !C7384Etj.areEqual(this.relationship_generation_id, peerContactJson.relationship_generation_id) || this.relationship_revision != peerContactJson.relationship_revision || !C7384Etj.areEqual(this.relationship_started_at_ms, peerContactJson.relationship_started_at_ms) || !C7384Etj.areEqual(this.request_expires_at_ms, peerContactJson.request_expires_at_ms) || !C7384Etj.areEqual(this.display_name, peerContactJson.display_name) || !C7384Etj.areEqual(this.agent_name, peerContactJson.agent_name) || !C7384Etj.areEqual(this.status, peerContactJson.status) || !C7384Etj.areEqual(this.trust_preset, peerContactJson.trust_preset) || this.sas_confirmed_local != peerContactJson.sas_confirmed_local || this.attested != peerContactJson.attested || this.created_at_ms != peerContactJson.created_at_ms || !C7384Etj.areEqual(this.chat_session_id, peerContactJson.chat_session_id) || !C7384Etj.areEqual(this.profile_photo, peerContactJson.profile_photo) || !C7384Etj.areEqual(this.muse_avatar, peerContactJson.muse_avatar) || !C7384Etj.areEqual(this.profile_photo_ref, peerContactJson.profile_photo_ref) || !C7384Etj.areEqual(this.muse_avatar_ref, peerContactJson.muse_avatar_ref) || !C7384Etj.areEqual(this.last_activity, peerContactJson.last_activity) || !C7384Etj.areEqual(this.paired_at_ms, peerContactJson.paired_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.muse_id;
    }

    public final boolean component10() {
        return this.sas_confirmed_local;
    }

    public final boolean component11() {
        return this.attested;
    }

    public final long component12() {
        return this.created_at_ms;
    }

    public final String component13() {
        return this.chat_session_id;
    }

    public final PeerImageJson component14() {
        return this.profile_photo;
    }

    public final PeerImageJson component15() {
        return this.muse_avatar;
    }

    public final PeerImageJson component16() {
        return this.profile_photo_ref;
    }

    public final PeerImageJson component17() {
        return this.muse_avatar_ref;
    }

    public final PeerLastActivityJson component18() {
        return this.last_activity;
    }

    public final Long component19() {
        return this.paired_at_ms;
    }

    public final String component2() {
        return this.relationship_generation_id;
    }

    public final long component3() {
        return this.relationship_revision;
    }

    public final Long component4() {
        return this.relationship_started_at_ms;
    }

    public final Long component5() {
        return this.request_expires_at_ms;
    }

    public final String component6() {
        return this.display_name;
    }

    public final String component7() {
        return this.agent_name;
    }

    public final String component8() {
        return this.status;
    }

    public final String component9() {
        return this.trust_preset;
    }

    public final String getAgent_name() {
        return this.agent_name;
    }

    public final boolean getAttested() {
        return this.attested;
    }

    public final String getChat_session_id() {
        return this.chat_session_id;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final PeerLastActivityJson getLast_activity() {
        return this.last_activity;
    }

    public final PeerImageJson getMuse_avatar() {
        return this.muse_avatar;
    }

    public final PeerImageJson getMuse_avatar_ref() {
        return this.muse_avatar_ref;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final Long getPaired_at_ms() {
        return this.paired_at_ms;
    }

    public final PeerImageJson getProfile_photo() {
        return this.profile_photo;
    }

    public final PeerImageJson getProfile_photo_ref() {
        return this.profile_photo_ref;
    }

    public final String getRelationship_generation_id() {
        return this.relationship_generation_id;
    }

    public final long getRelationship_revision() {
        return this.relationship_revision;
    }

    public final Long getRelationship_started_at_ms() {
        return this.relationship_started_at_ms;
    }

    public final Long getRequest_expires_at_ms() {
        return this.request_expires_at_ms;
    }

    public final boolean getSas_confirmed_local() {
        return this.sas_confirmed_local;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTrust_preset() {
        return this.trust_preset;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass006.A06(this.created_at_ms, C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.trust_preset, AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.agent_name, AnonymousClass005.A0I(this.display_name, (((AnonymousClass006.A06(this.relationship_revision, (AnonymousClass001.A0G(this.muse_id) + AnonymousClass006.A0G(this.relationship_generation_id)) * 31) + AnonymousClass006.A0D(this.relationship_started_at_ms)) * 31) + AnonymousClass006.A0D(this.request_expires_at_ms)) * 31)))), this.sas_confirmed_local), this.attested)) + AnonymousClass006.A0G(this.chat_session_id)) * 31) + AnonymousClass006.A0D(this.profile_photo)) * 31) + AnonymousClass006.A0D(this.muse_avatar)) * 31) + AnonymousClass006.A0D(this.profile_photo_ref)) * 31) + AnonymousClass006.A0D(this.muse_avatar_ref)) * 31) + AnonymousClass006.A0D(this.last_activity)) * 31) + C3cH.A02(this.paired_at_ms);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ PeerContactJson copy$default(PeerContactJson peerContactJson, String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j2, String str7, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, PeerLastActivityJson peerLastActivityJson, Long l3, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        long j3 = j;
        Long l4 = l;
        Long l5 = l2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        boolean z3 = z;
        boolean z4 = z2;
        long j4 = j2;
        String str14 = str7;
        PeerImageJson peerImageJson5 = peerImageJson;
        PeerImageJson peerImageJson6 = peerImageJson2;
        PeerImageJson peerImageJson7 = peerImageJson3;
        PeerImageJson peerImageJson8 = peerImageJson4;
        PeerLastActivityJson peerLastActivityJson2 = peerLastActivityJson;
        Long l6 = l3;
        if ((i & 1) != 0) {
            str8 = peerContactJson.muse_id;
        }
        if ((i & 2) != 0) {
            str9 = peerContactJson.relationship_generation_id;
        }
        if ((i & 4) != 0) {
            j3 = peerContactJson.relationship_revision;
        }
        if ((i & 8) != 0) {
            l4 = peerContactJson.relationship_started_at_ms;
        }
        if ((i & 16) != 0) {
            l5 = peerContactJson.request_expires_at_ms;
        }
        if ((i & 32) != 0) {
            str10 = peerContactJson.display_name;
        }
        if ((i & 64) != 0) {
            str11 = peerContactJson.agent_name;
        }
        if ((i & 128) != 0) {
            str12 = peerContactJson.status;
        }
        if ((i & 256) != 0) {
            str13 = peerContactJson.trust_preset;
        }
        if ((i & 512) != 0) {
            z3 = peerContactJson.sas_confirmed_local;
        }
        if ((i & 1024) != 0) {
            z4 = peerContactJson.attested;
        }
        if ((i & 2048) != 0) {
            j4 = peerContactJson.created_at_ms;
        }
        if ((i & 4096) != 0) {
            str14 = peerContactJson.chat_session_id;
        }
        if ((i & 8192) != 0) {
            peerImageJson5 = peerContactJson.profile_photo;
        }
        if ((i & 16384) != 0) {
            peerImageJson6 = peerContactJson.muse_avatar;
        }
        if ((i & 32768) != 0) {
            peerImageJson7 = peerContactJson.profile_photo_ref;
        }
        if ((i & 65536) != 0) {
            peerImageJson8 = peerContactJson.muse_avatar_ref;
        }
        if ((i & 131072) != 0) {
            peerLastActivityJson2 = peerContactJson.last_activity;
        }
        if ((i & 262144) != 0) {
            l6 = peerContactJson.paired_at_ms;
        }
        boolean z5 = z3;
        return peerContactJson.copy(str8, str9, j3, l4, l5, str10, str11, str12, str13, z5, z4, j4, str14, peerImageJson5, peerImageJson6, peerImageJson7, peerImageJson8, peerLastActivityJson2, l6);
    }

    public /* synthetic */ PeerContactJson(String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j2, String str7, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, PeerLastActivityJson peerLastActivityJson, Long l3, int i, C06H c06h) {
        this(str, C3cG.A0e(str2, i & 2), C3cH.A03(i & 4, j), (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) == 0 ? str6 : "", C3cG.A1K(i & 512, z), (i & 1024) == 0 ? z2 : false, (i & 2048) == 0 ? j2 : 0L, C3cG.A0e(str7, i & 4096), (i & 8192) != 0 ? null : peerImageJson, (i & 16384) != 0 ? null : peerImageJson2, (i & 32768) != 0 ? null : peerImageJson3, (i & 65536) != 0 ? null : peerImageJson4, (i & 131072) != 0 ? null : peerLastActivityJson, (i & 262144) != 0 ? null : l3);
    }

    public /* synthetic */ PeerContactJson(int i, String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j2, String str7, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, PeerLastActivityJson peerLastActivityJson, Long l3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerContactJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.muse_id = str;
        if ((i & 2) == 0) {
            this.relationship_generation_id = null;
        } else {
            this.relationship_generation_id = str2;
        }
        if ((i & 4) == 0) {
            this.relationship_revision = 0L;
        } else {
            this.relationship_revision = j;
        }
        if ((i & 8) == 0) {
            this.relationship_started_at_ms = null;
        } else {
            this.relationship_started_at_ms = l;
        }
        if ((i & 16) == 0) {
            this.request_expires_at_ms = null;
        } else {
            this.request_expires_at_ms = l2;
        }
        if ((i & 32) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str3;
        }
        if ((i & 64) == 0) {
            this.agent_name = "";
        } else {
            this.agent_name = str4;
        }
        if ((i & 128) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
        if ((i & 256) == 0) {
            this.trust_preset = "";
        } else {
            this.trust_preset = str6;
        }
        if ((i & 512) == 0) {
            this.sas_confirmed_local = false;
        } else {
            this.sas_confirmed_local = z;
        }
        if ((i & 1024) == 0) {
            this.attested = false;
        } else {
            this.attested = z2;
        }
        if ((i & 2048) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j2;
        }
        if ((i & 4096) == 0) {
            this.chat_session_id = null;
        } else {
            this.chat_session_id = str7;
        }
        if ((i & 8192) == 0) {
            this.profile_photo = null;
        } else {
            this.profile_photo = peerImageJson;
        }
        if ((i & 16384) == 0) {
            this.muse_avatar = null;
        } else {
            this.muse_avatar = peerImageJson2;
        }
        if ((32768 & i) == 0) {
            this.profile_photo_ref = null;
        } else {
            this.profile_photo_ref = peerImageJson3;
        }
        if ((65536 & i) == 0) {
            this.muse_avatar_ref = null;
        } else {
            this.muse_avatar_ref = peerImageJson4;
        }
        if ((131072 & i) == 0) {
            this.last_activity = null;
        } else {
            this.last_activity = peerLastActivityJson;
        }
        if ((i & 262144) == 0) {
            this.paired_at_ms = null;
        } else {
            this.paired_at_ms = l3;
        }
    }
}
