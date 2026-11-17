package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DIz {
    public static final C4958DIb A00;
    public static final Map<DJD, C4958DIb> A01;
    public static final C4958DIb A02;
    public static final C4958DIb A03;
    public static final C4958DIb A04;
    public static final C4958DIb A05;
    public static final C4958DIb A06;
    public static final C4958DIb A07;
    public static final C4958DIb A08;
    public static final C4958DIb A09;
    public static final C4958DIb A0A;
    public static final C4958DIb A0B;
    public static final C4958DIb A0C;
    public static final C4958DIb A0D;
    public static final C4958DIb A0E;
    public static final C4958DIb A0F;
    public static final C4958DIb A0G;
    public static final C4958DIb A0H;
    public static final C4958DIb A0I;
    public static final C4958DIb A0J;
    public static final C4958DIb A0K;
    public static final C4958DIb A0L;
    public static final C4958DIb A0M;
    public static final C4958DIb A0N;
    public static final C4958DIb A0O;
    public static final C4958DIb A0P;
    public static final C4958DIb A0Q;
    public static final C4958DIb A0R;
    public static final C4958DIb A0S;
    public static final C4958DIb A0T;
    public static final C4958DIb A0U;
    public static final C4958DIb A0V;
    public static final C4958DIb A0W;

    static {
        C4958DIb c4958DIb = new C4958DIb(AbstractC0885AGm.A0x(A06("myAnnotationString1", 20), A06("myAnnotationString2", 50), A04("myAnnotationInt"), A06("myAnnotationString3", 50)), AbstractC0885AGm.A0x("point1", "point2"), 196609, 5);
        A03 = c4958DIb;
        C4958DIb c4958DIb2 = new C4958DIb(AbstractC0885AGm.A0x(A06("effect_session_id", 40), A06("delivery_session_id", 40), A06("onecamera_active_session_id", 50), A06("product_session_id", 40), A06("product_name", 35), A06("effect_id", 20), A06("effect_instance_id", 20)), null, 16321564, 4);
        A04 = c4958DIb2;
        C4958DIb c4958DIb3 = new C4958DIb(AbstractC0885AGm.A0x(A06("camera_destination", 14), A06("camera_session_id", 48), A06("creation_session", 48)), null, 17638868, 1);
        A05 = c4958DIb3;
        C4958DIb c4958DIb4 = new C4958DIb(null, null, 838599736, 1);
        A06 = c4958DIb4;
        C4958DIb c4958DIb5 = new C4958DIb(AbstractC0885AGm.A0x(A06("ann_avail_mem_at_start", 13), A06("ann_zero", 4), A06("cp_low_on_memory", 14)), null, 16323880, 4);
        A02 = c4958DIb5;
        C4958DIb c4958DIb6 = new C4958DIb(AbstractC0885AGm.A0x(A06("localCallId", 36), A06("signaling_id", 10), A06("shared_call_id", 80), A06("call_trigger", 60), A06("is_connected", 1), A04("isOutgoing"), A04("is_first_call_after_initialization")), null, 144192964, 3);
        A00 = c4958DIb6;
        C4958DIb c4958DIb7 = new C4958DIb(AbstractC0885AGm.A0x(A06("send_trigger", 30), A06("ps2s_last_error", 30), A06("ps2s_offline_threading_id", 20), A06("ps2s_send_attribution", 30), A06("message_send_binder", 30), A04("is_e2ee"), A04("ps2s_transport_type"), A04("ps2s_did_retry_send"), A04("ps2s_thread_type"), A04("ps2s_h_s"), A04("ps2s_a_s"), A04("ps2s_m_s"), A04("ps2s_d_s"), A04("ps2s_h_s_e"), A04("ps2s_a_s_e"), A04("ps2s_m_s_e"), A04("ps2s_d_s_e"), A04("ps2s_active_sends_at_trace_start"), A04("ps2s_publish_retry_count")), null, 936451789, 20);
        A0V = c4958DIb7;
        C4958DIb c4958DIb8 = new C4958DIb(AbstractC0885AGm.A0x(A06("send_trigger", 40), A06("send_type", 30), A06("thread_type", 30), A06("ps2s_last_error", 40), A06("ps2s_send_attribution", 30), A06("ps2s_step", 30), A06("at", 50), A06("attachment_index", 50), A04("ps2s_at"), A04("media_fg"), A06("forward_source_protocol", 8), A06("forward_source_surface", 24)), null, 922160238, 20);
        A0J = c4958DIb8;
        C4958DIb c4958DIb9 = new C4958DIb(AbstractC0885AGm.A0x(A06("send_trigger", 40), A06("send_type", 30), A06("thread_type", 30), A06("ps2s_last_error", 40), A06("ps2s_send_attribution", 30), A06("ps2s_step", 30), A06("at", 50), A06("attachment_index", 50), A04("ps2s_at"), A04("media_fg")), null, 922160238, 20);
        A0I = c4958DIb9;
        C4958DIb c4958DIb10 = new C4958DIb(AbstractC0885AGm.A0x(A06("send_trigger", 40), A06("send_type", 30), A06("thread_type", 30), A06("ps2s_last_error", 40), A06("ps2s_send_attribution", 30), A06("ps2s_step", 30), A06("at", 50), A06("attachment_index", 50), A06("forward_source_protocol", 8), A06("forward_source_surface", 24)), null, 922166253, 20);
        A0L = c4958DIb10;
        C4958DIb c4958DIb11 = new C4958DIb(AbstractC0885AGm.A0x(A06("send_trigger", 40), A06("send_type", 30), A06("thread_type", 30), A06("ps2s_last_error", 40), A06("ps2s_send_attribution", 30), A06("ps2s_step", 30), A06("at", 50), A06("attachment_index", 50)), null, 922166253, 20);
        A0K = c4958DIb11;
        C4958DIb c4958DIb12 = new C4958DIb(AbstractC0885AGm.A0x(A06("media_type", 16), A06("entry_point", 40), A06("transport_type", 16)), AbstractC0885AGm.A0x("save_to_gallery_start"), 872941497, 100);
        A0E = c4958DIb12;
        C4958DIb c4958DIb13 = new C4958DIb(AbstractC0885AGm.A0x(A06("camera_entry_surface", 16), A06("composer_entry_point", 60), A06("thread_protocol", 16), A06("thread_type", 40), A04("first_capture"), A04("has_effect"), A06("end_reason", 40)), AbstractC0885AGm.A0x("PHOTO_BITMAP_READY", "CAMERA_PREVIEW_FROZEN"), 5505153, 2);
        A0G = c4958DIb13;
        C4958DIb c4958DIb14 = new C4958DIb(AbstractC0885AGm.A0x(A06("start_state", 16), A06("camera_entry_surface", 16), A06("composer_entry_point", 60), A06("thread_protocol", 16), A06("thread_type", 40), A06("end_reason", 40), A06("error_type", 80)), AbstractC0885AGm.A0x("CAMERA_VIEW_READY", "CAMERA_FIRST_FRAME"), 5505156, 2);
        A0H = c4958DIb14;
        C4958DIb c4958DIbA03 = A03(378675184);
        A0T = c4958DIbA03;
        C4958DIb c4958DIbA032 = A03(378669638);
        A0P = c4958DIbA032;
        C4958DIb c4958DIbA01 = A01(378675184);
        A0R = c4958DIbA01;
        C4958DIb c4958DIbA012 = A01(378669638);
        A0N = c4958DIbA012;
        C4958DIb c4958DIbA00 = A00(378675184);
        A0Q = c4958DIbA00;
        C4958DIb c4958DIbA002 = A00(378669638);
        A0M = c4958DIbA002;
        C4958DIb c4958DIbA02 = A02(378675184);
        A0S = c4958DIbA02;
        C4958DIb c4958DIbA022 = A02(378669638);
        A0O = c4958DIbA022;
        C4958DIb c4958DIb15 = new C4958DIb(AbstractC0885AGm.A0x(A06("entry_point", 24), A06("media_type", 8), A06(HatchDataExportRepositoryKt.FAILURE_TRANSPORT, 8), A04(HatchNavTTRCSpec.AnnotationKeys.MEDIA_COUNT), A06("viewer_entry_point", 32)), AbstractC0885AGm.A0x("prepare_start", "prepare_end", "present_start"), 872944088, 20);
        A0F = c4958DIb15;
        C4958DIb c4958DIb16 = new C4958DIb(AbstractC0885AGm.A0x(A06("last_error", 40), A06("send_attribution", 30), A04("transport_type"), A04("did_retry_send"), A04("thread_type"), A04("active_sends_at_trace_start"), A04("task_system_retry_send_trace"), A06("offline_threading_id", 20)), null, 549265716, 20);
        A0W = c4958DIb16;
        C4958DIb c4958DIb17 = new C4958DIb(AbstractC0885AGm.A0x(A06("offline_threading_id", 20), A06("ps2s_offline_threading_id", 20)), null, 936450723, 20);
        A0U = c4958DIb17;
        AbstractC4959DId[] abstractC4959DIdArr = new AbstractC4959DId[31];
        System.arraycopy(new AbstractC4959DId[]{A06("ai", 4), A06("at", 2), A06("ec", 8), A06("error_domain", 40), A06("log_entry_point", 20), A06("persistent_id", 36), A06("send_attribution", 50), A06("send_origin", 18), A06("send_trigger", 40), A06("step", 30), A06("ttype", 4), A06("trace_id", 23), A06("xma_send_method", 15), A06("network_state_at_start", 20), A06("chatd_connection_state", 15), A06("uit_failure_reason", 40), A06("get_transcode_config_exception", 200), A04("h_s_publish"), A04("a_s_publish"), A04("d_s_publish"), A04("m_s_publish"), A04("h_s_encrypt"), A04("a_s_encrypt"), A04("m_s_encrypt"), A04("d_s_encrypt"), A04("h_s_upload"), A04("a_s_upload")}, 0, abstractC4959DIdArr, 0, 27);
        System.arraycopy(new AbstractC4959DId[]{A04("d_s_upload"), A04("m_s_upload"), A06("forward_source_protocol", 8), A06("forward_source_surface", 24)}, 0, abstractC4959DIdArr, 27, 4);
        C4958DIb c4958DIb18 = new C4958DIb(AbstractC0885AGm.A0x(abstractC4959DIdArr), null, 919808481, 20);
        A0B = c4958DIb18;
        AbstractC4959DId[] abstractC4959DIdArr2 = new AbstractC4959DId[29];
        A0A("ai", abstractC4959DIdArr2, 4, 0);
        A0A("at", abstractC4959DIdArr2, 2, 1);
        A0A("ec", abstractC4959DIdArr2, 8, 2);
        A0A("error_domain", abstractC4959DIdArr2, 40, 3);
        A0A("log_entry_point", abstractC4959DIdArr2, 20, 4);
        A0A("persistent_id", abstractC4959DIdArr2, 36, 5);
        A0A("send_attribution", abstractC4959DIdArr2, 50, 6);
        A0A("send_origin", abstractC4959DIdArr2, 18, 7);
        A0A("send_trigger", abstractC4959DIdArr2, 40, 8);
        A0A("step", abstractC4959DIdArr2, 30, 9);
        A0A("ttype", abstractC4959DIdArr2, 4, 10);
        abstractC4959DIdArr2[11] = A06("trace_id", 23);
        A0A("xma_send_method", abstractC4959DIdArr2, 15, 12);
        A09("network_state_at_start", "chatd_connection_state", abstractC4959DIdArr2, 20, 15);
        A0A("uit_failure_reason", abstractC4959DIdArr2, 40, 15);
        A0A("get_transcode_config_exception", abstractC4959DIdArr2, 200, 16);
        abstractC4959DIdArr2[17] = A04("h_s_publish");
        abstractC4959DIdArr2[19] = A05("a_s_publish", "d_s_publish", abstractC4959DIdArr2, 18);
        abstractC4959DIdArr2[21] = A05("m_s_publish", "h_s_encrypt", abstractC4959DIdArr2, 20);
        abstractC4959DIdArr2[22] = A04("a_s_encrypt");
        A08(A05("m_s_encrypt", "d_s_encrypt", abstractC4959DIdArr2, 23), "h_s_upload", "a_s_upload", abstractC4959DIdArr2);
        abstractC4959DIdArr2[28] = A05("d_s_upload", "m_s_upload", abstractC4959DIdArr2, 27);
        C4958DIb c4958DIb19 = new C4958DIb(AbstractC0885AGm.A0x(abstractC4959DIdArr2), null, 919808481, 20);
        A07 = c4958DIb19;
        AbstractC4959DId[] abstractC4959DIdArr3 = new AbstractC4959DId[28];
        A0A("ai", abstractC4959DIdArr3, 4, 0);
        A0A("at", abstractC4959DIdArr3, 2, 1);
        A0A("ec", abstractC4959DIdArr3, 8, 2);
        A0A("error_domain", abstractC4959DIdArr3, 40, 3);
        A0A("log_entry_point", abstractC4959DIdArr3, 20, 4);
        A0A("persistent_id", abstractC4959DIdArr3, 36, 5);
        A0A("send_attribution", abstractC4959DIdArr3, 50, 6);
        A0A("send_trigger", abstractC4959DIdArr3, 40, 7);
        A0A("step", abstractC4959DIdArr3, 30, 8);
        A0A("ttype", abstractC4959DIdArr3, 4, 9);
        A0A("trace_id", abstractC4959DIdArr3, 23, 10);
        abstractC4959DIdArr3[11] = A06("xma_send_method", 15);
        A0A("network_state_at_start", abstractC4959DIdArr3, 20, 12);
        A09("chatd_connection_state", "uit_failure_reason", abstractC4959DIdArr3, 15, 40);
        A0A("get_transcode_config_exception", abstractC4959DIdArr3, 200, 15);
        abstractC4959DIdArr3[17] = A05("h_s_publish", "a_s_publish", abstractC4959DIdArr3, 16);
        abstractC4959DIdArr3[19] = A05("d_s_publish", "m_s_publish", abstractC4959DIdArr3, 18);
        abstractC4959DIdArr3[21] = A05("h_s_encrypt", "a_s_encrypt", abstractC4959DIdArr3, 20);
        abstractC4959DIdArr3[22] = A04("m_s_encrypt");
        A08(A05("d_s_encrypt", "h_s_upload", abstractC4959DIdArr3, 23), "a_s_upload", "d_s_upload", abstractC4959DIdArr3);
        abstractC4959DIdArr3[27] = A04("m_s_upload");
        C4958DIb c4958DIb20 = new C4958DIb(AbstractC0885AGm.A0x(abstractC4959DIdArr3), null, 919808481, 20);
        A08 = c4958DIb20;
        C4958DIb c4958DIb21 = new C4958DIb(AbstractC0885AGm.A0x(A06("ai", 4), A06("at", 2), A06("ec", 8), A06("error_domain", 40), A06("log_entry_point", 20), A06("send_attribution", 30), A06("step", 30), A06("ttype", 4), A06("trace_id", 23)), null, 919808481, 5);
        A09 = c4958DIb21;
        AbstractC4959DId[] abstractC4959DIdArr4 = new AbstractC4959DId[28];
        A0A("ai", abstractC4959DIdArr4, 4, 0);
        A0A("at", abstractC4959DIdArr4, 2, 1);
        A0A("ec", abstractC4959DIdArr4, 8, 2);
        A0A("error_domain", abstractC4959DIdArr4, 40, 3);
        A0A("log_entry_point", abstractC4959DIdArr4, 20, 4);
        A0A("persistent_id", abstractC4959DIdArr4, 36, 5);
        A0A("send_attribution", abstractC4959DIdArr4, 50, 6);
        A0A("send_trigger", abstractC4959DIdArr4, 40, 7);
        A0A("step", abstractC4959DIdArr4, 30, 8);
        A0A("ttype", abstractC4959DIdArr4, 4, 9);
        A0A("trace_id", abstractC4959DIdArr4, 23, 10);
        abstractC4959DIdArr4[11] = A06("xma_send_method", 15);
        A0A("network_state_at_start", abstractC4959DIdArr4, 20, 12);
        A09("chatd_connection_state", "uit_failure_reason", abstractC4959DIdArr4, 15, 40);
        A0A("get_transcode_config_exception", abstractC4959DIdArr4, 200, 15);
        abstractC4959DIdArr4[17] = A05("h_s_publish", "a_s_publish", abstractC4959DIdArr4, 16);
        abstractC4959DIdArr4[19] = A05("d_s_publish", "m_s_publish", abstractC4959DIdArr4, 18);
        abstractC4959DIdArr4[21] = A05("h_s_encrypt", "a_s_encrypt", abstractC4959DIdArr4, 20);
        abstractC4959DIdArr4[22] = A04("m_s_encrypt");
        A08(A05("d_s_encrypt", "h_s_upload", abstractC4959DIdArr4, 23), "a_s_upload", "d_s_upload", abstractC4959DIdArr4);
        abstractC4959DIdArr4[27] = A04("m_s_upload");
        C4958DIb c4958DIb22 = new C4958DIb(AbstractC0885AGm.A0x(abstractC4959DIdArr4), null, 919807829, 20);
        A0A = c4958DIb22;
        C4958DIb c4958DIb23 = new C4958DIb(AbstractC0885AGm.A0x(A06("log_entry_point", 40), A06("mt0", 2), A06("send_origin", 18), A06("step", 30), A04("attachment_count"), A04("media_type"), A04("media_type_0"), A04("num_of_attachments"), A04("thread_type")), null, 919800524, 100);
        A0D = c4958DIb23;
        C4958DIb c4958DIb24 = new C4958DIb(AbstractC0885AGm.A0x(A06("log_entry_point", 20), A06("otid", 20), A06("step", 20), A06("trace_id", 30), A06("mt0", 2), A04("is_gen_ai_thread"), A04("media_type_0"), A04("num_of_attachments"), A04("original_file_size_0"), A04("original_preview_height_0"), A04("original_preview_width_0")), null, 919800524, 20);
        A0C = c4958DIb24;
        HxE[] hxEArr = new HxE[32];
        System.arraycopy(new HxE[]{A07(c4958DIb), A07(c4958DIb2), A07(c4958DIb3), A07(c4958DIb4), A07(c4958DIb6), A07(c4958DIb7), A07(c4958DIb16), A07(c4958DIb17), A07(c4958DIb18), A07(c4958DIb19), A07(c4958DIb20), A07(c4958DIb21), A07(c4958DIb22), A07(c4958DIb23), A07(c4958DIb24), A07(c4958DIb5), A07(c4958DIb8), A07(c4958DIb9), A07(c4958DIb13), A07(c4958DIb10), A07(c4958DIb11), A07(c4958DIb12), A07(c4958DIb14), A07(c4958DIbA01), A07(c4958DIbA012), A07(c4958DIbA03), A07(c4958DIbA032)}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{A07(c4958DIbA00), A07(c4958DIbA002), A07(c4958DIbA02), A07(c4958DIbA022), A07(c4958DIb15)}, 0, hxEArr, 27, 5);
        A01 = AGH.A0D(hxEArr);
    }

    public static final C4958DIb A00(int i) {
        return new C4958DIb(AbstractC0885AGm.A0x(A06("player_type", 16), A06("transport_type", 32), A06("progress_source", 32), A06(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, 32), A04("controls_ready"), A04("progress_advanced")), AbstractC0885AGm.A0x("controls_ready_point", "progress_advanced_point", AuraDeeplinkRouteMapper.STATUS_ROUTE), i, 8);
    }

    public static final C4958DIb A01(int i) {
        return new C4958DIb(AbstractC0885AGm.A0x(A06("player_type", 16), A06("transport_type", 32), A06("message_age_bucket", 32), A06("progress_source", 32), A06(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, 32), A04("is_msg_self_sent"), A04("is_msg_sent_by_device"), A04("controls_ready"), A04("progress_advanced")), AbstractC0885AGm.A0x("controls_ready_point", "progress_advanced_point", AuraDeeplinkRouteMapper.STATUS_ROUTE), i, 8);
    }

    public static final C4958DIb A02(int i) {
        return new C4958DIb(AbstractC0885AGm.A0x(A06("player_type", 16), A06("progress_source", 32), A06(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, 32), A04("controls_ready"), A04("progress_advanced")), AbstractC0885AGm.A0x("controls_ready_point", "progress_advanced_point", AuraDeeplinkRouteMapper.STATUS_ROUTE), i, 8);
    }

    public static final C4958DIb A03(int i) {
        return new C4958DIb(AbstractC0885AGm.A0x(A06("player_type", 16), A06("transport_type", 32), A06("message_age_bucket", 32), A06("progress_source", 32), A06(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, 32), A04("is_msg_self_sent"), A04("is_msg_sent_by_device"), A04("controls_ready"), A04("progress_advanced"), A06("vp_session_id", 36), A04("readiness_contract_version"), A04("request_context"), A04("source_context"), A04("attempt_state"), A04("error_context"), A04("terminal_context"), A04("last_stage_reached"), A04("in_flight_state")), AbstractC0885AGm.A0x("controls_ready_point", "progress_advanced_point", AuraDeeplinkRouteMapper.STATUS_ROUTE, "source_resolved_point", "first_frame_presented_point"), i, 8);
    }

    public static DJ0 A04(String str) {
        return new DJ0(Integer.class, str, 5);
    }

    public static DJ0 A05(String str, String str2, Object[] objArr, int i) {
        objArr[i] = new DJ0(Integer.class, str, 5);
        return new DJ0(Integer.class, str2, 5);
    }

    public static DJ1 A06(String str, int i) {
        return new DJ1(str, i);
    }

    public static HxE A07(C4958DIb c4958DIb) {
        return new HxE(c4958DIb.A05.getValue(), c4958DIb);
    }

    public static void A08(Object obj, String str, String str2, Object[] objArr) {
        objArr[24] = obj;
        objArr[25] = new DJ0(Integer.class, str, 5);
        objArr[26] = new DJ0(Integer.class, str2, 5);
    }

    public static void A09(String str, String str2, Object[] objArr, int i, int i2) {
        objArr[13] = new DJ1(str, i);
        objArr[14] = new DJ1(str2, i2);
    }

    public static void A0A(String str, Object[] objArr, int i, int i2) {
        objArr[i2] = new DJ1(str, i);
    }
}
