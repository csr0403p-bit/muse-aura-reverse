package X;

import com.facebook.aura.commands.calendar.CalendarEventsCreateHandlerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class E1C implements DrW {
    public final C8ee<?> A00;
    public final C5943Dsd A01;

    @Override // X.DrW
    public final void Ab6(List<E1D> list, long j, long j2) {
        C5962Dsy c5962Dsy;
        C7384Etj.A0Y(list, 0);
        C5943Dsd c5943Dsd = this.A01;
        C8ee<?> c8ee = this.A00;
        E1E.A00.now();
        if (list.isEmpty()) {
            return;
        }
        C5674DnC.A00(c8ee, c5943Dsd.A00, c5943Dsd.A02, "client_compound_event_on_send", c5943Dsd.A01.A01(c5943Dsd.A00, j));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<E1D> it = list.iterator();
        while (true) {
            E1G e1g = null;
            if (!it.hasNext()) {
                break;
            }
            E1D next = it.next();
            if (next != null) {
                String str = next.A0c;
                E1G e1g2 = new E1G();
                AbstractC8150FWo.A02(e1g2, "client_time_ms", Long.valueOf(next.A01));
                AbstractC8150FWo.A02(e1g2, "event_name", str);
                AbstractC8150FWo.A02(e1g2, "media_time_ms", Long.valueOf(next.A03));
                if (str == "paused" || str == "completed" || str == "started_playing" || str == "reset") {
                    AbstractC8150FWo.A02(e1g2, "video_client_duration", Long.valueOf(next.A02));
                }
                if (str == "completed" || str == "started_playing") {
                    AbstractC8150FWo.A02(e1g2, "is_looping", Boolean.valueOf(next.A0k));
                }
                Long l = next.A0W;
                if (l != null) {
                    AbstractC8150FWo.A02(e1g2, "player_instance_id", l);
                }
                String str2 = next.A0g;
                if (str2 != null) {
                    AbstractC8150FWo.A02(e1g2, "player_instance_key", str2);
                    AbstractC8150FWo.A02(e1g2, "playback_session_id", str2);
                }
                if (str == "tags_changed" && (c5962Dsy = next.A05) != null) {
                    AbstractC8150FWo.A02(e1g2, "tag_metadata", c5962Dsy.A00);
                }
                String str3 = next.A0i;
                if (str3 != null) {
                    AbstractC8150FWo.A02(e1g2, "session_validation_token", str3);
                }
                String str4 = next.A0j;
                if (str4 != null) {
                    AbstractC8150FWo.A02(e1g2, "start_state", str4);
                }
                String str5 = next.A0b;
                if (str5 != null) {
                    AbstractC8150FWo.A02(e1g2, "callsite_context", str5);
                }
                String str6 = next.A0h;
                if (str6 != null) {
                    AbstractC8150FWo.A02(e1g2, "reason", str6);
                }
                Dt0 dt0 = next.A04;
                if (dt0 != null) {
                    AbstractC8150FWo.A02(e1g2, "error_metadata", dt0.A00);
                }
                Boolean bool = next.A06;
                if (bool != null) {
                    AbstractC8150FWo.A02(e1g2, "is_audio_stalling", bool);
                }
                Boolean bool2 = next.A0C;
                if (bool2 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_stalling", bool2);
                }
                Long l2 = next.A0I;
                if (l2 != null) {
                    AbstractC8150FWo.A02(e1g2, "buffer_end_to_live_head_delta_ms", l2);
                }
                Long l3 = next.A0L;
                if (l3 != null) {
                    AbstractC8150FWo.A02(e1g2, "induced_start_stall_latency_ms", l3);
                } else {
                    AbstractC8150FWo.A02(e1g2, "induced_start_stall_latency_ms", null);
                }
                Long l4 = next.A0J;
                Long l5 = next.A0K;
                if (l4 != null && l5 != null) {
                    AbstractC8150FWo.A02(e1g2, "induced_in_play_stall_latency_ms", l4);
                    AbstractC8150FWo.A02(e1g2, "induced_in_play_stall_position_ms", l5);
                }
                Boolean bool3 = next.A0B;
                if (bool3 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_preloaded", bool3);
                }
                Boolean bool4 = next.A0D;
                if (bool4 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_surface_valid", bool4);
                }
                Boolean bool5 = next.A08;
                if (bool5 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_from_scrubbing", bool5);
                }
                Boolean bool6 = next.A07;
                if (bool6 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_from_player_seek", bool6);
                }
                String str7 = next.A0d;
                if (str7 != null) {
                    AbstractC8150FWo.A02(e1g2, "failed_request_type", str7);
                }
                Long l6 = next.A0M;
                if (l6 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_http_status", l6);
                }
                Long l7 = next.A0O;
                if (l7 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_load_error_age_ms", l7);
                }
                Long l8 = next.A0P;
                if (l8 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_manifest_load_success_age_ms", l8);
                }
                Long l9 = next.A0Q;
                if (l9 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_media_load_success_age_ms", l9);
                }
                Long l10 = next.A0X;
                if (l10 != null) {
                    AbstractC8150FWo.A02(e1g2, "unchanged_manifest_range_count", l10);
                }
                Long l11 = next.A0U;
                if (l11 != null) {
                    AbstractC8150FWo.A02(e1g2, "manifest_load_failure_count", l11);
                }
                Long l12 = next.A0Z;
                if (l12 != null) {
                    AbstractC8150FWo.A02(e1g2, "video_chunk_load_failure_count", l12);
                }
                Long l13 = next.A0G;
                if (l13 != null) {
                    AbstractC8150FWo.A02(e1g2, "audio_chunk_load_failure_count", l13);
                }
                Long l14 = next.A0a;
                if (l14 != null) {
                    AbstractC8150FWo.A02(e1g2, "video_init_load_failure_count", l14);
                }
                Long l15 = next.A0H;
                if (l15 != null) {
                    AbstractC8150FWo.A02(e1g2, "audio_init_load_failure_count", l15);
                }
                Boolean bool7 = next.A09;
                if (bool7 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_loading", bool7);
                }
                Boolean bool8 = next.A0E;
                if (bool8 != null) {
                    AbstractC8150FWo.A02(e1g2, "load_control_wants_loading", bool8);
                }
                Boolean bool9 = next.A0A;
                if (bool9 != null) {
                    AbstractC8150FWo.A02(e1g2, "is_network_request_in_flight", bool9);
                }
                Long l16 = next.A0V;
                if (l16 != null) {
                    AbstractC8150FWo.A02(e1g2, "oldest_network_request_age_ms", l16);
                }
                Long l17 = next.A0F;
                if (l17 != null) {
                    AbstractC8150FWo.A02(e1g2, "audio_buffered_duration_ms", l17);
                }
                Long l18 = next.A0Y;
                if (l18 != null) {
                    AbstractC8150FWo.A02(e1g2, "video_buffered_duration_ms", l18);
                }
                Long l19 = next.A0T;
                if (l19 != null) {
                    AbstractC8150FWo.A02(e1g2, "manifest_end_to_live_head_delta_ms", l19);
                }
                String str8 = next.A0e;
                if (str8 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_latency_action_type", str8);
                }
                Long l20 = next.A0N;
                if (l20 != null) {
                    AbstractC8150FWo.A02(e1g2, "last_latency_action_age_ms", l20);
                }
                String str9 = next.A0f;
                if (str9 != null) {
                    AbstractC8150FWo.A02(e1g2, "latency_level", str9);
                }
                Long l21 = next.A0R;
                if (l21 != null) {
                    AbstractC8150FWo.A02(e1g2, "live_edge_position_ms", l21);
                }
                Long l22 = next.A0S;
                if (l22 != null) {
                    AbstractC8150FWo.A02(e1g2, "live_manifest_last_video_frame_time_ms", l22);
                }
                e1g = e1g2;
            }
            arrayListA0h.add(e1g);
        }
        C5963Dsz c5963Dsz = c5943Dsd.A00;
        Eu1 eu1AcquireEvent = c8ee.acquireEvent("media_playback_compound");
        E1I e1i = new E1I();
        String strA00 = C60N.A00(75);
        AbstractC8150FWo.A02(e1i, strA00, "");
        if (eu1AcquireEvent.isSampled() && c5963Dsz != null) {
            eu1AcquireEvent.A3z(c5963Dsz, "required_metadata");
            eu1AcquireEvent.A42(CalendarEventsCreateHandlerKt.PARAM_EVENTS, arrayListA0h);
            E1F e1f = new E1F();
            AbstractC8150FWo.A02(e1f, "sequence", Long.valueOf(j2));
            eu1AcquireEvent.A3z(e1f, "operational_metadata");
            eu1AcquireEvent.A3z(e1i, "dsp_correlation_metadata");
            eu1AcquireEvent.A3f("client_high_res_packaging_time_ms", C3cI.A0O());
            eu1AcquireEvent.APu();
        }
        if (c5943Dsd.A02.mEnableMediaPlaybackCompoundFast) {
            Eu1 eu1AcquireEvent2 = c8ee.acquireEvent("media_playback_compound_fast");
            E1H e1h = new E1H();
            AbstractC8150FWo.A02(e1h, strA00, "");
            if (!eu1AcquireEvent2.isSampled() || c5963Dsz == null) {
                return;
            }
            eu1AcquireEvent2.A3z(c5963Dsz, "required_metadata");
            eu1AcquireEvent2.A42(CalendarEventsCreateHandlerKt.PARAM_EVENTS, arrayListA0h);
            E1F e1f2 = new E1F();
            AbstractC8150FWo.A02(e1f2, "sequence", Long.valueOf(j2));
            eu1AcquireEvent2.A3z(e1f2, "operational_metadata");
            eu1AcquireEvent2.A3z(e1h, "dsp_correlation_metadata");
            eu1AcquireEvent2.A3f("client_high_res_packaging_time_ms", C3cI.A0O());
            eu1AcquireEvent2.APu();
        }
    }

    @Override // X.DrW
    public final void Ai1(C5963Dsz c5963Dsz) {
        this.A01.A00 = c5963Dsz;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dsd;LX/8ee<*>;)V */
    public E1C(C8ee c8ee, C5943Dsd c5943Dsd) {
        this.A01 = c5943Dsd;
        this.A00 = c8ee;
    }
}
