package com.facebook.aura.gateway;

import X.C7384Etj;
import X.C8j3;
import X.C9sU;
import android.util.Base64;

/* loaded from: classes4.dex */
public abstract class HatchPauseOperationsJsonKt {
    public static final String buildPauseRequestBody(byte[] bArr, Integer num) {
        C9sU c9sUA1G = C8j3.A1G(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        C7384Etj.A0U(strEncodeToString);
        return c9sUA1G.A02(new PauseRequestJson(strEncodeToString, num), PauseRequestJson$$serializer.INSTANCE);
    }

    public static final String buildUnpauseRequestBody(byte[] bArr) {
        C9sU c9sUA1G = C8j3.A1G(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        C7384Etj.A0U(strEncodeToString);
        return c9sUA1G.A02(new PauseRequestJson(strEncodeToString, null), PauseRequestJson$$serializer.INSTANCE);
    }

    public static final PauseAckResponseJson parsePauseAckResponse(String str) {
        return (PauseAckResponseJson) C8j3.A1G(str).A00(str, PauseAckResponseJson$$serializer.INSTANCE);
    }

    public static final PauseStatusResponseJson parsePauseStatusResponse(String str) {
        return (PauseStatusResponseJson) C8j3.A1G(str).A00(str, PauseStatusResponseJson$$serializer.INSTANCE);
    }
}
