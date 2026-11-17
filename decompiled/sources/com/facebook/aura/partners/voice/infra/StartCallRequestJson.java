package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
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
/* loaded from: classes4.dex */
public final class StartCallRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String call_id;
    public final String call_media_type;
    public final String call_server_info_data;
    public final Double latitude;
    public final Long location_fix_timestamp_ms;
    public final Long location_upload_timestamp_ms;
    public final Double longitude;
    public final String rtc_session_id;
    public final String thread_id;
    public final String timezone;

    public final class Companion {
        public final C9hr<StartCallRequestJson> serializer() {
            return StartCallRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(StartCallRequestJson startCallRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(startCallRequestJson.call_id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || startCallRequestJson.thread_id != null) {
            c9j5.AAP(startCallRequestJson.thread_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || startCallRequestJson.call_server_info_data != null) {
            c9j5.AAP(startCallRequestJson.call_server_info_data, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || startCallRequestJson.latitude != null) {
            c9j5.AAP(startCallRequestJson.latitude, C07799it.A00, c9iZ, 3);
        }
        if (zAfR || startCallRequestJson.longitude != null) {
            c9j5.AAP(startCallRequestJson.longitude, C07799it.A00, c9iZ, 4);
        }
        if (zAfR || startCallRequestJson.location_fix_timestamp_ms != null) {
            c9j5.AAP(startCallRequestJson.location_fix_timestamp_ms, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || startCallRequestJson.location_upload_timestamp_ms != null) {
            c9j5.AAP(startCallRequestJson.location_upload_timestamp_ms, C9j1.A00, c9iZ, 6);
        }
        if (zAfR || startCallRequestJson.timezone != null) {
            c9j5.AAP(startCallRequestJson.timezone, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || startCallRequestJson.rtc_session_id != null) {
            c9j5.AAP(startCallRequestJson.rtc_session_id, C07779iq.A01, c9iZ, 8);
        }
        c9j5.AAV(startCallRequestJson.call_media_type, c9iZ, 9);
    }

    public final StartCallRequestJson copy(String str, String str2, String str3, Double d, Double d2, Long l, Long l2, String str4, String str5, String str6) {
        AnonymousClass002.A1F(str, 0, str6);
        return new StartCallRequestJson(str, str2, str3, d, d2, l, l2, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StartCallRequestJson) {
                StartCallRequestJson startCallRequestJson = (StartCallRequestJson) obj;
                if (!C7384Etj.areEqual(this.call_id, startCallRequestJson.call_id) || !C7384Etj.areEqual(this.thread_id, startCallRequestJson.thread_id) || !C7384Etj.areEqual(this.call_server_info_data, startCallRequestJson.call_server_info_data) || !C7384Etj.areEqual(this.latitude, startCallRequestJson.latitude) || !C7384Etj.areEqual(this.longitude, startCallRequestJson.longitude) || !C7384Etj.areEqual(this.location_fix_timestamp_ms, startCallRequestJson.location_fix_timestamp_ms) || !C7384Etj.areEqual(this.location_upload_timestamp_ms, startCallRequestJson.location_upload_timestamp_ms) || !C7384Etj.areEqual(this.timezone, startCallRequestJson.timezone) || !C7384Etj.areEqual(this.rtc_session_id, startCallRequestJson.rtc_session_id) || !C7384Etj.areEqual(this.call_media_type, startCallRequestJson.call_media_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ StartCallRequestJson(int i, String str, String str2, String str3, Double d, Double d2, Long l, Long l2, String str4, String str5, String str6, C2hx c2hx) {
        if (513 != (i & 513)) {
            C9iI.A00(StartCallRequestJson$$serializer.descriptor, i, 513);
            throw F60.createAndThrow();
        }
        this.call_id = str;
        if ((i & 2) == 0) {
            this.thread_id = null;
        } else {
            this.thread_id = str2;
        }
        if ((i & 4) == 0) {
            this.call_server_info_data = null;
        } else {
            this.call_server_info_data = str3;
        }
        if ((i & 8) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d;
        }
        if ((i & 16) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d2;
        }
        if ((i & 32) == 0) {
            this.location_fix_timestamp_ms = null;
        } else {
            this.location_fix_timestamp_ms = l;
        }
        if ((i & 64) == 0) {
            this.location_upload_timestamp_ms = null;
        } else {
            this.location_upload_timestamp_ms = l2;
        }
        if ((i & 128) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str4;
        }
        if ((i & 256) == 0) {
            this.rtc_session_id = null;
        } else {
            this.rtc_session_id = str5;
        }
        this.call_media_type = str6;
    }

    public static /* synthetic */ StartCallRequestJson copy$default(StartCallRequestJson startCallRequestJson, String str, String str2, String str3, Double d, Double d2, Long l, Long l2, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startCallRequestJson.call_id;
        }
        if ((i & 2) != 0) {
            str2 = startCallRequestJson.thread_id;
        }
        if ((i & 4) != 0) {
            str3 = startCallRequestJson.call_server_info_data;
        }
        if ((i & 8) != 0) {
            d = startCallRequestJson.latitude;
        }
        if ((i & 16) != 0) {
            d2 = startCallRequestJson.longitude;
        }
        if ((i & 32) != 0) {
            l = startCallRequestJson.location_fix_timestamp_ms;
        }
        if ((i & 64) != 0) {
            l2 = startCallRequestJson.location_upload_timestamp_ms;
        }
        if ((i & 128) != 0) {
            str4 = startCallRequestJson.timezone;
        }
        if ((i & 256) != 0) {
            str5 = startCallRequestJson.rtc_session_id;
        }
        if ((i & 512) != 0) {
            str6 = startCallRequestJson.call_media_type;
        }
        return startCallRequestJson.copy(str, str2, str3, d, d2, l, l2, str4, str5, str6);
    }

    public final String component1() {
        return this.call_id;
    }

    public final String component10() {
        return this.call_media_type;
    }

    public final String component2() {
        return this.thread_id;
    }

    public final String component3() {
        return this.call_server_info_data;
    }

    public final Double component4() {
        return this.latitude;
    }

    public final Double component5() {
        return this.longitude;
    }

    public final Long component6() {
        return this.location_fix_timestamp_ms;
    }

    public final Long component7() {
        return this.location_upload_timestamp_ms;
    }

    public final String component8() {
        return this.timezone;
    }

    public final String component9() {
        return this.rtc_session_id;
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

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Long getLocation_fix_timestamp_ms() {
        return this.location_fix_timestamp_ms;
    }

    public final Long getLocation_upload_timestamp_ms() {
        return this.location_upload_timestamp_ms;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getRtc_session_id() {
        return this.rtc_session_id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.call_media_type, (((((((((((((((AnonymousClass001.A0G(this.call_id) + AnonymousClass006.A0G(this.thread_id)) * 31) + AnonymousClass006.A0G(this.call_server_info_data)) * 31) + AnonymousClass006.A0D(this.latitude)) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass006.A0D(this.location_fix_timestamp_ms)) * 31) + AnonymousClass006.A0D(this.location_upload_timestamp_ms)) * 31) + AnonymousClass006.A0G(this.timezone)) * 31) + AnonymousClass005.A0H(this.rtc_session_id)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StartCallRequestJson(String str, String str2, String str3, Double d, Double d2, Long l, Long l2, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, str6);
    }

    public StartCallRequestJson(String str, String str2, String str3, Double d, Double d2, Long l, Long l2, String str4, String str5, String str6) {
        AnonymousClass002.A1F(str, 0, str6);
        this.call_id = str;
        this.thread_id = str2;
        this.call_server_info_data = str3;
        this.latitude = d;
        this.longitude = d2;
        this.location_fix_timestamp_ms = l;
        this.location_upload_timestamp_ms = l2;
        this.timezone = str4;
        this.rtc_session_id = str5;
        this.call_media_type = str6;
    }
}
