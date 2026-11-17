package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass002;
import X.BV5;
import X.C10571Hud;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C79;
import X.C7pd;
import X.C7qW;
import X.C8946FuJ;
import X.C8968Fup;
import X.C9586GQf;
import X.EnumC10452Hio;
import X.EnumC10589Hxc;
import X.FGI;
import X.GQW;
import X.GQX;
import android.content.Context;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class VoiceSessionHelpers {
    public static final long HATCH_BOT_ID = 156025504001094L;
    public static final VoiceSessionHelpers INSTANCE = new VoiceSessionHelpers();
    public static final String THREAD_ENTRYPOINT = "hatch_voice";

    private final String buildHatchVoiceConfig(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        if (!str.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            str = FGI.A0M(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        }
        C7pd c7pd = new C7pd();
        C2nw c2nw = new C2nw();
        C2nw c2nw2 = new C2nw();
        C7qW.A06("avatar_surface", "hatch", c2nw2);
        C7qW.A06("query_type_override", "PASSTHROUGH", c2nw2);
        C7qW.A06("wss_endpoint", str, c2nw2);
        C7qW.A06("auth_token", str2, c2nw2);
        C7qW.A06("stream_params:device", "app-audio", c2nw2);
        if (str3 != null && str3.length() != 0) {
            C7qW.A06("stream_params:session_id", str3, c2nw2);
        }
        if (str4 != null && str4.length() != 0) {
            C7qW.A06("stream_params:call_id", str4, c2nw2);
        }
        if (str5 != null && str5.length() != 0) {
            C7qW.A06("stream_params:ui_control_target_client_id", str5, c2nw2);
        }
        C7qW.A06("voicification_mode", "agent_prompt", c2nw2);
        c7pd.A06(C60O.A1I("config", c2nw2.A00(), c2nw));
        return c7pd.A05().toString();
    }

    public final String localCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str) {
        Object objA0s;
        if (str != null && str.length() != 0) {
            try {
                objA0s = UUID.fromString(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            if (objA0s != null && objA0s.toString().equalsIgnoreCase(str)) {
                return str;
            }
        }
        return BV5.A0j();
    }

    public final C9586GQf buildSessionParams(Context context, C3UX c3ux, String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, Integer num, String str7, String str8, Long l, boolean z4, boolean z5, boolean z6) {
        GQX c8946FuJ;
        EnumC10452Hio enumC10452Hio;
        String strLocalCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = str5;
        boolean zA1a = AnonymousClass002.A1a(context, c3ux);
        GQW gqw = new GQW(EnumC10589Hxc.A01, Boolean.valueOf(zA1a), str3, buildHatchVoiceConfig(str, str2, str3, str4, str6), i, z2, z5);
        if (strLocalCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl == null) {
            strLocalCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = localCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str4);
        }
        if (z6) {
            c8946FuJ = C8968Fup.A00;
        } else {
            c8946FuJ = new C8946FuJ(3870, z, z4, z2, zA1a);
        }
        boolean z7 = !z2;
        if (z2 && VoiceGating.INSTANCE.isH265GeneratedVideoSupported()) {
            enumC10452Hio = EnumC10452Hio.A03;
        } else {
            enumC10452Hio = null;
        }
        Integer num2 = C79.A00;
        C9586GQf c9586GQf = new C9586GQf(context, c8946FuJ, gqw, enumC10452Hio, num2, num, num2, l, strLocalCallId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, str7, str8, c3ux, z6, z3, z7);
        if (z6) {
            c9586GQf.A01 = false;
            c9586GQf.A02 = false;
            c9586GQf.A03 = false;
        }
        return c9586GQf;
    }

    public static /* synthetic */ C9586GQf buildSessionParams$default(VoiceSessionHelpers voiceSessionHelpers, Context context, C3UX c3ux, String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, Integer num, String str7, String str8, Long l, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) != 0) {
            str5 = null;
        }
        boolean zA1K = C3cG.A1K(i2 & 256, z);
        if ((i2 & 512) != 0) {
            str6 = null;
        }
        boolean zA1K2 = C3cG.A1K(i2 & 1024, z2);
        boolean zA1K3 = C3cG.A1K(i2 & 2048, z3);
        if ((i2 & 4096) != 0) {
            num = null;
        }
        if ((i2 & 8192) != 0) {
            str7 = null;
        }
        if ((i2 & 16384) != 0) {
            str8 = null;
        }
        if ((32768 & i2) != 0) {
            l = null;
        }
        boolean zA1L = C3cH.A1L(65536, i2, z4);
        if ((131072 & i2) != 0) {
            z5 = true;
        }
        return voiceSessionHelpers.buildSessionParams(context, c3ux, str, str2, i, str3, str4, str5, zA1K, str6, zA1K2, zA1K3, num, str7, str8, l, zA1L, z5, C3cH.A1L(i2, 262144, z6));
    }
}
