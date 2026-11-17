package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallJoinParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String audio_only_subreason;
    public final String avatar_appearance;
    public final String call_id;
    public final String call_media_type;
    public final String call_server_info_data;
    public final Boolean defer_companion_setup;
    public final String device;
    public final String device_id;
    public final Boolean enable_media_to_cosmos;
    public final String entry_point;
    public final CallJoinLocationJson location;
    public final String payload_b64;
    public final String rtc_session_id;
    public final Boolean spoken_timing;
    public final String thread_id;
    public final String timezone;

    public final class Companion {
        public final C9hr<CallJoinParamsJson> serializer() {
            return CallJoinParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallJoinParamsJson callJoinParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(callJoinParamsJson.payload_b64)) {
            c9j5.AAV(callJoinParamsJson.payload_b64, c9iZ, 0);
        }
        if (zAfR || callJoinParamsJson.rtc_session_id != null) {
            c9j5.AAP(callJoinParamsJson.rtc_session_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || callJoinParamsJson.call_id != null) {
            c9j5.AAP(callJoinParamsJson.call_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || callJoinParamsJson.thread_id != null) {
            c9j5.AAP(callJoinParamsJson.thread_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || callJoinParamsJson.device != null) {
            c9j5.AAP(callJoinParamsJson.device, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || callJoinParamsJson.device_id != null) {
            c9j5.AAP(callJoinParamsJson.device_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || callJoinParamsJson.timezone != null) {
            c9j5.AAP(callJoinParamsJson.timezone, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || callJoinParamsJson.location != null) {
            c9j5.AAP(callJoinParamsJson.location, CallJoinLocationJson$$serializer.INSTANCE, c9iZ, 7);
        }
        c9j5.AAV(callJoinParamsJson.call_media_type, c9iZ, 8);
        if (zAfR || callJoinParamsJson.enable_media_to_cosmos != null) {
            c9j5.AAP(callJoinParamsJson.enable_media_to_cosmos, C07839ix.A00, c9iZ, 9);
        }
        if (zAfR || callJoinParamsJson.call_server_info_data != null) {
            c9j5.AAP(callJoinParamsJson.call_server_info_data, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || callJoinParamsJson.defer_companion_setup != null) {
            c9j5.AAP(callJoinParamsJson.defer_companion_setup, C07839ix.A00, c9iZ, 11);
        }
        if (zAfR || callJoinParamsJson.spoken_timing != null) {
            c9j5.AAP(callJoinParamsJson.spoken_timing, C07839ix.A00, c9iZ, 12);
        }
        if (zAfR || callJoinParamsJson.audio_only_subreason != null) {
            c9j5.AAP(callJoinParamsJson.audio_only_subreason, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || callJoinParamsJson.entry_point != null) {
            c9j5.AAP(callJoinParamsJson.entry_point, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || callJoinParamsJson.avatar_appearance != null) {
            c9j5.AAP(callJoinParamsJson.avatar_appearance, C07779iq.A01, c9iZ, 15);
        }
    }

    public final CallJoinParamsJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, CallJoinLocationJson callJoinLocationJson, String str8, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12) {
        C60O.A1N(str, 0, str8);
        return new CallJoinParamsJson(str, str2, str3, str4, str5, str6, str7, callJoinLocationJson, str8, bool, str9, bool2, bool3, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallJoinParamsJson) {
                CallJoinParamsJson callJoinParamsJson = (CallJoinParamsJson) obj;
                if (!C7384Etj.areEqual(this.payload_b64, callJoinParamsJson.payload_b64) || !C7384Etj.areEqual(this.rtc_session_id, callJoinParamsJson.rtc_session_id) || !C7384Etj.areEqual(this.call_id, callJoinParamsJson.call_id) || !C7384Etj.areEqual(this.thread_id, callJoinParamsJson.thread_id) || !C7384Etj.areEqual(this.device, callJoinParamsJson.device) || !C7384Etj.areEqual(this.device_id, callJoinParamsJson.device_id) || !C7384Etj.areEqual(this.timezone, callJoinParamsJson.timezone) || !C7384Etj.areEqual(this.location, callJoinParamsJson.location) || !C7384Etj.areEqual(this.call_media_type, callJoinParamsJson.call_media_type) || !C7384Etj.areEqual(this.enable_media_to_cosmos, callJoinParamsJson.enable_media_to_cosmos) || !C7384Etj.areEqual(this.call_server_info_data, callJoinParamsJson.call_server_info_data) || !C7384Etj.areEqual(this.defer_companion_setup, callJoinParamsJson.defer_companion_setup) || !C7384Etj.areEqual(this.spoken_timing, callJoinParamsJson.spoken_timing) || !C7384Etj.areEqual(this.audio_only_subreason, callJoinParamsJson.audio_only_subreason) || !C7384Etj.areEqual(this.entry_point, callJoinParamsJson.entry_point) || !C7384Etj.areEqual(this.avatar_appearance, callJoinParamsJson.avatar_appearance)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CallJoinParamsJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, CallJoinLocationJson callJoinLocationJson, String str8, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12, C2hx c2hx) {
        if (256 != (i & 256)) {
            C9iI.A00(CallJoinParamsJson$$serializer.descriptor, i, 256);
            throw F60.createAndThrow();
        }
        this.payload_b64 = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.rtc_session_id = null;
        } else {
            this.rtc_session_id = str2;
        }
        if ((i & 4) == 0) {
            this.call_id = null;
        } else {
            this.call_id = str3;
        }
        if ((i & 8) == 0) {
            this.thread_id = null;
        } else {
            this.thread_id = str4;
        }
        if ((i & 16) == 0) {
            this.device = null;
        } else {
            this.device = str5;
        }
        if ((i & 32) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str6;
        }
        if ((i & 64) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str7;
        }
        if ((i & 128) == 0) {
            this.location = null;
        } else {
            this.location = callJoinLocationJson;
        }
        this.call_media_type = str8;
        if ((i & 512) == 0) {
            this.enable_media_to_cosmos = null;
        } else {
            this.enable_media_to_cosmos = bool;
        }
        if ((i & 1024) == 0) {
            this.call_server_info_data = null;
        } else {
            this.call_server_info_data = str9;
        }
        if ((i & 2048) == 0) {
            this.defer_companion_setup = null;
        } else {
            this.defer_companion_setup = bool2;
        }
        if ((i & 4096) == 0) {
            this.spoken_timing = null;
        } else {
            this.spoken_timing = bool3;
        }
        if ((i & 8192) == 0) {
            this.audio_only_subreason = null;
        } else {
            this.audio_only_subreason = str10;
        }
        if ((i & 16384) == 0) {
            this.entry_point = null;
        } else {
            this.entry_point = str11;
        }
        if ((i & 32768) == 0) {
            this.avatar_appearance = null;
        } else {
            this.avatar_appearance = str12;
        }
    }

    public final String component1() {
        return this.payload_b64;
    }

    public final Boolean component10() {
        return this.enable_media_to_cosmos;
    }

    public final String component11() {
        return this.call_server_info_data;
    }

    public final Boolean component12() {
        return this.defer_companion_setup;
    }

    public final Boolean component13() {
        return this.spoken_timing;
    }

    public final String component14() {
        return this.audio_only_subreason;
    }

    public final String component15() {
        return this.entry_point;
    }

    public final String component16() {
        return this.avatar_appearance;
    }

    public final String component2() {
        return this.rtc_session_id;
    }

    public final String component3() {
        return this.call_id;
    }

    public final String component4() {
        return this.thread_id;
    }

    public final String component5() {
        return this.device;
    }

    public final String component6() {
        return this.device_id;
    }

    public final String component7() {
        return this.timezone;
    }

    public final CallJoinLocationJson component8() {
        return this.location;
    }

    public final String component9() {
        return this.call_media_type;
    }

    public final String getAudio_only_subreason() {
        return this.audio_only_subreason;
    }

    public final String getAvatar_appearance() {
        return this.avatar_appearance;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getCall_media_type() {
        return this.call_media_type;
    }

    public final String getCall_server_info_data() {
        return this.call_server_info_data;
    }

    public final Boolean getDefer_companion_setup() {
        return this.defer_companion_setup;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final Boolean getEnable_media_to_cosmos() {
        return this.enable_media_to_cosmos;
    }

    public final String getEntry_point() {
        return this.entry_point;
    }

    public final CallJoinLocationJson getLocation() {
        return this.location;
    }

    public final String getPayload_b64() {
        return this.payload_b64;
    }

    public final String getRtc_session_id() {
        return this.rtc_session_id;
    }

    public final Boolean getSpoken_timing() {
        return this.spoken_timing;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0I(this.call_media_type, (((((((((((((AnonymousClass001.A0G(this.payload_b64) + AnonymousClass006.A0G(this.rtc_session_id)) * 31) + AnonymousClass006.A0G(this.call_id)) * 31) + AnonymousClass006.A0G(this.thread_id)) * 31) + AnonymousClass006.A0G(this.device)) * 31) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass006.A0G(this.timezone)) * 31) + AnonymousClass006.A0D(this.location)) * 31) + AnonymousClass006.A0D(this.enable_media_to_cosmos)) * 31) + AnonymousClass006.A0G(this.call_server_info_data)) * 31) + AnonymousClass006.A0D(this.defer_companion_setup)) * 31) + AnonymousClass006.A0D(this.spoken_timing)) * 31) + AnonymousClass006.A0G(this.audio_only_subreason)) * 31) + AnonymousClass006.A0G(this.entry_point)) * 31) + AnonymousClass005.A0H(this.avatar_appearance);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ CallJoinParamsJson copy$default(CallJoinParamsJson callJoinParamsJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, CallJoinLocationJson callJoinLocationJson, String str8, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12, int i, Object obj) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        CallJoinLocationJson callJoinLocationJson2 = callJoinLocationJson;
        String str20 = str8;
        Boolean bool4 = bool;
        String str21 = str9;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        if ((i & 1) != 0) {
            str13 = callJoinParamsJson.payload_b64;
        }
        if ((i & 2) != 0) {
            str14 = callJoinParamsJson.rtc_session_id;
        }
        if ((i & 4) != 0) {
            str15 = callJoinParamsJson.call_id;
        }
        if ((i & 8) != 0) {
            str16 = callJoinParamsJson.thread_id;
        }
        if ((i & 16) != 0) {
            str17 = callJoinParamsJson.device;
        }
        if ((i & 32) != 0) {
            str18 = callJoinParamsJson.device_id;
        }
        if ((i & 64) != 0) {
            str19 = callJoinParamsJson.timezone;
        }
        if ((i & 128) != 0) {
            callJoinLocationJson2 = callJoinParamsJson.location;
        }
        if ((i & 256) != 0) {
            str20 = callJoinParamsJson.call_media_type;
        }
        if ((i & 512) != 0) {
            bool4 = callJoinParamsJson.enable_media_to_cosmos;
        }
        if ((i & 1024) != 0) {
            str21 = callJoinParamsJson.call_server_info_data;
        }
        if ((i & 2048) != 0) {
            bool5 = callJoinParamsJson.defer_companion_setup;
        }
        if ((i & 4096) != 0) {
            bool6 = callJoinParamsJson.spoken_timing;
        }
        if ((i & 8192) != 0) {
            str22 = callJoinParamsJson.audio_only_subreason;
        }
        if ((i & 16384) != 0) {
            str23 = callJoinParamsJson.entry_point;
        }
        if ((i & 32768) != 0) {
            str24 = callJoinParamsJson.avatar_appearance;
        }
        String str25 = str16;
        return callJoinParamsJson.copy(str13, str14, str15, str25, str17, str18, str19, callJoinLocationJson2, str20, bool4, str21, bool5, bool6, str22, str23, str24);
    }

    public CallJoinParamsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, CallJoinLocationJson callJoinLocationJson, String str8, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12) {
        C60O.A1N(str, 0, str8);
        this.payload_b64 = str;
        this.rtc_session_id = str2;
        this.call_id = str3;
        this.thread_id = str4;
        this.device = str5;
        this.device_id = str6;
        this.timezone = str7;
        this.location = callJoinLocationJson;
        this.call_media_type = str8;
        this.enable_media_to_cosmos = bool;
        this.call_server_info_data = str9;
        this.defer_companion_setup = bool2;
        this.spoken_timing = bool3;
        this.audio_only_subreason = str10;
        this.entry_point = str11;
        this.avatar_appearance = str12;
    }

    public /* synthetic */ CallJoinParamsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, CallJoinLocationJson callJoinLocationJson, String str8, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : callJoinLocationJson, str8, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12);
    }
}
