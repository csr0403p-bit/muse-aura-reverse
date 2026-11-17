package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
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
public final class StefiMiscInfoJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agent_feedback_id;
    public final Boolean agent_initiated;
    public final boolean app_only_report;
    public final String app_source;
    public final String bug_category_group;
    public final String bug_category_label;
    public final String bug_tags;
    public final String endpoint;
    public final String hatch_category;
    public final String hatchery_vm_id;
    public final String message_id;
    public final String model_name;
    public final String session_id;
    public final String vm_type;
    public final Long voice_call_connected_at_ms;
    public final Long voice_call_ended_at_ms;
    public final Boolean voice_call_is_active;
    public final Long voice_call_started_at_ms;
    public final String voice_shared_call_id;

    public final class Companion {
        public final C9hr<StefiMiscInfoJson> serializer() {
            return StefiMiscInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public StefiMiscInfoJson(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, String str13) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, str5, 1);
        this.bug_category_group = str;
        this.bug_category_label = str2;
        this.app_only_report = z;
        this.app_source = str3;
        this.bug_tags = str4;
        this.endpoint = str5;
        this.hatchery_vm_id = str6;
        this.vm_type = str7;
        this.message_id = str8;
        this.session_id = str9;
        this.model_name = str10;
        this.hatch_category = str11;
        this.voice_shared_call_id = str12;
        this.voice_call_started_at_ms = l;
        this.voice_call_connected_at_ms = l2;
        this.voice_call_ended_at_ms = l3;
        this.voice_call_is_active = bool;
        this.agent_initiated = bool2;
        this.agent_feedback_id = str13;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(StefiMiscInfoJson stefiMiscInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(stefiMiscInfoJson.bug_category_group, c9iZ, 0);
        c9j5.AAV(stefiMiscInfoJson.bug_category_label, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, stefiMiscInfoJson.app_only_report);
        c9j5.AAV(stefiMiscInfoJson.app_source, c9iZ, 3);
        c9j5.AAV(stefiMiscInfoJson.bug_tags, c9iZ, 4);
        c9j5.AAV(stefiMiscInfoJson.endpoint, c9iZ, 5);
        boolean zAfR = c9j5.AfR();
        if (zAfR || stefiMiscInfoJson.hatchery_vm_id != null) {
            c9j5.AAP(stefiMiscInfoJson.hatchery_vm_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || stefiMiscInfoJson.vm_type != null) {
            c9j5.AAP(stefiMiscInfoJson.vm_type, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || stefiMiscInfoJson.message_id != null) {
            c9j5.AAP(stefiMiscInfoJson.message_id, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || stefiMiscInfoJson.session_id != null) {
            c9j5.AAP(stefiMiscInfoJson.session_id, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || stefiMiscInfoJson.model_name != null) {
            c9j5.AAP(stefiMiscInfoJson.model_name, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || stefiMiscInfoJson.hatch_category != null) {
            c9j5.AAP(stefiMiscInfoJson.hatch_category, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || stefiMiscInfoJson.voice_shared_call_id != null) {
            c9j5.AAP(stefiMiscInfoJson.voice_shared_call_id, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || stefiMiscInfoJson.voice_call_started_at_ms != null) {
            c9j5.AAP(stefiMiscInfoJson.voice_call_started_at_ms, C9j1.A00, c9iZ, 13);
        }
        if (zAfR || stefiMiscInfoJson.voice_call_connected_at_ms != null) {
            c9j5.AAP(stefiMiscInfoJson.voice_call_connected_at_ms, C9j1.A00, c9iZ, 14);
        }
        if (zAfR || stefiMiscInfoJson.voice_call_ended_at_ms != null) {
            c9j5.AAP(stefiMiscInfoJson.voice_call_ended_at_ms, C9j1.A00, c9iZ, 15);
        }
        if (zAfR || stefiMiscInfoJson.voice_call_is_active != null) {
            c9j5.AAP(stefiMiscInfoJson.voice_call_is_active, C07839ix.A00, c9iZ, 16);
        }
        if (zAfR || stefiMiscInfoJson.agent_initiated != null) {
            c9j5.AAP(stefiMiscInfoJson.agent_initiated, C07839ix.A00, c9iZ, 17);
        }
        if (zAfR || stefiMiscInfoJson.agent_feedback_id != null) {
            c9j5.AAP(stefiMiscInfoJson.agent_feedback_id, C07779iq.A01, c9iZ, 18);
        }
    }

    public final StefiMiscInfoJson copy(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, String str13) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, str5, 1);
        return new StefiMiscInfoJson(str, str2, z, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, l, l2, l3, bool, bool2, str13);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StefiMiscInfoJson) {
                StefiMiscInfoJson stefiMiscInfoJson = (StefiMiscInfoJson) obj;
                if (!C7384Etj.areEqual(this.bug_category_group, stefiMiscInfoJson.bug_category_group) || !C7384Etj.areEqual(this.bug_category_label, stefiMiscInfoJson.bug_category_label) || this.app_only_report != stefiMiscInfoJson.app_only_report || !C7384Etj.areEqual(this.app_source, stefiMiscInfoJson.app_source) || !C7384Etj.areEqual(this.bug_tags, stefiMiscInfoJson.bug_tags) || !C7384Etj.areEqual(this.endpoint, stefiMiscInfoJson.endpoint) || !C7384Etj.areEqual(this.hatchery_vm_id, stefiMiscInfoJson.hatchery_vm_id) || !C7384Etj.areEqual(this.vm_type, stefiMiscInfoJson.vm_type) || !C7384Etj.areEqual(this.message_id, stefiMiscInfoJson.message_id) || !C7384Etj.areEqual(this.session_id, stefiMiscInfoJson.session_id) || !C7384Etj.areEqual(this.model_name, stefiMiscInfoJson.model_name) || !C7384Etj.areEqual(this.hatch_category, stefiMiscInfoJson.hatch_category) || !C7384Etj.areEqual(this.voice_shared_call_id, stefiMiscInfoJson.voice_shared_call_id) || !C7384Etj.areEqual(this.voice_call_started_at_ms, stefiMiscInfoJson.voice_call_started_at_ms) || !C7384Etj.areEqual(this.voice_call_connected_at_ms, stefiMiscInfoJson.voice_call_connected_at_ms) || !C7384Etj.areEqual(this.voice_call_ended_at_ms, stefiMiscInfoJson.voice_call_ended_at_ms) || !C7384Etj.areEqual(this.voice_call_is_active, stefiMiscInfoJson.voice_call_is_active) || !C7384Etj.areEqual(this.agent_initiated, stefiMiscInfoJson.agent_initiated) || !C7384Etj.areEqual(this.agent_feedback_id, stefiMiscInfoJson.agent_feedback_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.bug_category_group;
    }

    public final String component10() {
        return this.session_id;
    }

    public final String component11() {
        return this.model_name;
    }

    public final String component12() {
        return this.hatch_category;
    }

    public final String component13() {
        return this.voice_shared_call_id;
    }

    public final Long component14() {
        return this.voice_call_started_at_ms;
    }

    public final Long component15() {
        return this.voice_call_connected_at_ms;
    }

    public final Long component16() {
        return this.voice_call_ended_at_ms;
    }

    public final Boolean component17() {
        return this.voice_call_is_active;
    }

    public final Boolean component18() {
        return this.agent_initiated;
    }

    public final String component19() {
        return this.agent_feedback_id;
    }

    public final String component2() {
        return this.bug_category_label;
    }

    public final boolean component3() {
        return this.app_only_report;
    }

    public final String component4() {
        return this.app_source;
    }

    public final String component5() {
        return this.bug_tags;
    }

    public final String component6() {
        return this.endpoint;
    }

    public final String component7() {
        return this.hatchery_vm_id;
    }

    public final String component8() {
        return this.vm_type;
    }

    public final String component9() {
        return this.message_id;
    }

    public final String getAgent_feedback_id() {
        return this.agent_feedback_id;
    }

    public final Boolean getAgent_initiated() {
        return this.agent_initiated;
    }

    public final boolean getApp_only_report() {
        return this.app_only_report;
    }

    public final String getApp_source() {
        return this.app_source;
    }

    public final String getBug_category_group() {
        return this.bug_category_group;
    }

    public final String getBug_category_label() {
        return this.bug_category_label;
    }

    public final String getBug_tags() {
        return this.bug_tags;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getHatch_category() {
        return this.hatch_category;
    }

    public final String getHatchery_vm_id() {
        return this.hatchery_vm_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getVm_type() {
        return this.vm_type;
    }

    public final Long getVoice_call_connected_at_ms() {
        return this.voice_call_connected_at_ms;
    }

    public final Long getVoice_call_ended_at_ms() {
        return this.voice_call_ended_at_ms;
    }

    public final Boolean getVoice_call_is_active() {
        return this.voice_call_is_active;
    }

    public final Long getVoice_call_started_at_ms() {
        return this.voice_call_started_at_ms;
    }

    public final String getVoice_shared_call_id() {
        return this.voice_shared_call_id;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((AnonymousClass005.A0I(this.endpoint, AnonymousClass005.A0I(this.bug_tags, AnonymousClass005.A0I(this.app_source, C0KA.A01(AnonymousClass005.A0I(this.bug_category_label, AnonymousClass001.A0G(this.bug_category_group)), this.app_only_report)))) + AnonymousClass006.A0G(this.hatchery_vm_id)) * 31) + AnonymousClass006.A0G(this.vm_type)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.session_id)) * 31) + AnonymousClass006.A0G(this.model_name)) * 31) + AnonymousClass006.A0G(this.hatch_category)) * 31) + AnonymousClass006.A0G(this.voice_shared_call_id)) * 31) + AnonymousClass006.A0D(this.voice_call_started_at_ms)) * 31) + AnonymousClass006.A0D(this.voice_call_connected_at_ms)) * 31) + AnonymousClass006.A0D(this.voice_call_ended_at_ms)) * 31) + AnonymousClass006.A0D(this.voice_call_is_active)) * 31) + AnonymousClass006.A0D(this.agent_initiated)) * 31) + AnonymousClass005.A0H(this.agent_feedback_id);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ StefiMiscInfoJson copy$default(StefiMiscInfoJson stefiMiscInfoJson, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, String str13, int i, Object obj) {
        String str14 = str;
        String str15 = str2;
        boolean z2 = z;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        Long l4 = l;
        Long l5 = l2;
        Long l6 = l3;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str26 = str13;
        if ((i & 1) != 0) {
            str14 = stefiMiscInfoJson.bug_category_group;
        }
        if ((i & 2) != 0) {
            str15 = stefiMiscInfoJson.bug_category_label;
        }
        if ((i & 4) != 0) {
            z2 = stefiMiscInfoJson.app_only_report;
        }
        if ((i & 8) != 0) {
            str16 = stefiMiscInfoJson.app_source;
        }
        if ((i & 16) != 0) {
            str17 = stefiMiscInfoJson.bug_tags;
        }
        if ((i & 32) != 0) {
            str18 = stefiMiscInfoJson.endpoint;
        }
        if ((i & 64) != 0) {
            str19 = stefiMiscInfoJson.hatchery_vm_id;
        }
        if ((i & 128) != 0) {
            str20 = stefiMiscInfoJson.vm_type;
        }
        if ((i & 256) != 0) {
            str21 = stefiMiscInfoJson.message_id;
        }
        if ((i & 512) != 0) {
            str22 = stefiMiscInfoJson.session_id;
        }
        if ((i & 1024) != 0) {
            str23 = stefiMiscInfoJson.model_name;
        }
        if ((i & 2048) != 0) {
            str24 = stefiMiscInfoJson.hatch_category;
        }
        if ((i & 4096) != 0) {
            str25 = stefiMiscInfoJson.voice_shared_call_id;
        }
        if ((i & 8192) != 0) {
            l4 = stefiMiscInfoJson.voice_call_started_at_ms;
        }
        if ((i & 16384) != 0) {
            l5 = stefiMiscInfoJson.voice_call_connected_at_ms;
        }
        if ((i & 32768) != 0) {
            l6 = stefiMiscInfoJson.voice_call_ended_at_ms;
        }
        if ((i & 65536) != 0) {
            bool3 = stefiMiscInfoJson.voice_call_is_active;
        }
        if ((i & 131072) != 0) {
            bool4 = stefiMiscInfoJson.agent_initiated;
        }
        if ((i & 262144) != 0) {
            str26 = stefiMiscInfoJson.agent_feedback_id;
        }
        String str27 = str19;
        return stefiMiscInfoJson.copy(str14, str15, z2, str16, str17, str18, str27, str20, str21, str22, str23, str24, str25, l4, l5, l6, bool3, bool4, str26);
    }

    public /* synthetic */ StefiMiscInfoJson(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, String str13, int i, C06H c06h) {
        this(str, str2, z, str3, str4, str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : l, (i & 16384) != 0 ? null : l2, (32768 & i) != 0 ? null : l3, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : bool2, (i & 262144) != 0 ? null : str13);
    }

    public /* synthetic */ StefiMiscInfoJson(int i, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, String str13, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(StefiMiscInfoJson$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.bug_category_group = str;
        this.bug_category_label = str2;
        this.app_only_report = z;
        this.app_source = str3;
        this.bug_tags = str4;
        this.endpoint = str5;
        if ((i & 64) == 0) {
            this.hatchery_vm_id = null;
        } else {
            this.hatchery_vm_id = str6;
        }
        if ((i & 128) == 0) {
            this.vm_type = null;
        } else {
            this.vm_type = str7;
        }
        if ((i & 256) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str8;
        }
        if ((i & 512) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str9;
        }
        if ((i & 1024) == 0) {
            this.model_name = null;
        } else {
            this.model_name = str10;
        }
        if ((i & 2048) == 0) {
            this.hatch_category = null;
        } else {
            this.hatch_category = str11;
        }
        if ((i & 4096) == 0) {
            this.voice_shared_call_id = null;
        } else {
            this.voice_shared_call_id = str12;
        }
        if ((i & 8192) == 0) {
            this.voice_call_started_at_ms = null;
        } else {
            this.voice_call_started_at_ms = l;
        }
        if ((i & 16384) == 0) {
            this.voice_call_connected_at_ms = null;
        } else {
            this.voice_call_connected_at_ms = l2;
        }
        if ((32768 & i) == 0) {
            this.voice_call_ended_at_ms = null;
        } else {
            this.voice_call_ended_at_ms = l3;
        }
        if ((65536 & i) == 0) {
            this.voice_call_is_active = null;
        } else {
            this.voice_call_is_active = bool;
        }
        if ((131072 & i) == 0) {
            this.agent_initiated = null;
        } else {
            this.agent_initiated = bool2;
        }
        if ((i & 262144) == 0) {
            this.agent_feedback_id = null;
        } else {
            this.agent_feedback_id = str13;
        }
    }
}
