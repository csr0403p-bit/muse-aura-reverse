package com.facebook.aura.partners.voice.infra;

import X.C60O;
import X.C7384Etj;
import com.facebook.aura.partners.voice.api.CallMediaType;

/* loaded from: classes6.dex */
public abstract class VoiceCallActivityRepositoryJsonKt {
    public static final StartCallRequestJson buildStartCallRequestJson(String str, String str2, String str3, String str4, Double d, Double d2, String str5, CallMediaType callMediaType, Long l) {
        String str6 = str4;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(callMediaType, 7);
        Long l2 = null;
        if (d != null) {
            l2 = l;
        }
        Long lA0k = d != null ? C60O.A0k() : null;
        if (str4 == null) {
            str6 = str3;
        }
        return new StartCallRequestJson(str, str2, str3, d, d2, l2, lA0k, str5, str6, callMediaType.getWireValue());
    }

    public static /* synthetic */ StartCallRequestJson buildStartCallRequestJson$default(String str, String str2, String str3, String str4, Double d, Double d2, String str5, CallMediaType callMediaType, Long l, int i, Object obj) {
        if ((i & 256) != 0) {
            l = null;
        }
        return buildStartCallRequestJson(str, str2, str3, str4, d, d2, str5, callMediaType, l);
    }
}
