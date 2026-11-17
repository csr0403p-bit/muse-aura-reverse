package com.facebook.aura.analytics.hatch;

import X.AnonymousClass003;
import com.facebook.aura.ageverification.AgeVerificationClientKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContextKt;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchRequestFailureMetadataKt {
    public static final void putRequestFailure(Map<String, String> map, Throwable th) {
        NetworkException networkException;
        String str;
        String str2;
        AnonymousClass003.A0u(map, th);
        Integer num = null;
        if (th instanceof NetworkException) {
            networkException = (NetworkException) th;
            if (networkException != null) {
                int i = networkException.httpResponseCode;
                Integer numValueOf = Integer.valueOf(i);
                if (i > 0) {
                    num = numValueOf;
                }
            }
        } else {
            networkException = null;
        }
        String value = HatchMetadataKey.FAILURE_REASON.getValue();
        if (networkException == null) {
            str = "client_error";
        } else if (num == null) {
            str = HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE;
        } else {
            int iIntValue = num.intValue();
            str = (200 > iIntValue || iIntValue >= 300) ? "http_error" : AgeVerificationClientKt.INVALID_RESPONSE;
        }
        map.put(value, str);
        if (num != null) {
            map.put(HatchMetadataKey.HTTP_STATUS.getValue(), String.valueOf(num.intValue()));
        }
        if (networkException == null || (str2 = networkException.errorCode) == null) {
            return;
        }
        map.put(HatchMetadataKey.ERROR_CODE.getValue(), str2);
    }
}
