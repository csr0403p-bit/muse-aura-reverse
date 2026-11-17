package com.facebook.aura.gateway;

import X.C3cF;
import com.facebook.aura.gateway.store.HatchCvmChipBudgetSpentPolicy;
import com.facebook.aura.json.NetworkException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class HatchCvmChipSelectionRepositoryKt {
    public static final String chipSelectionFailureCategory(Throwable th) {
        NetworkException networkException;
        if (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) {
            return "unexpected_error";
        }
        Throwable cause = networkException.getCause();
        int i = networkException.httpResponseCode;
        return (i <= 0 || (200 <= i && i < 300)) ? cause instanceof SocketTimeoutException ? "timeout" : cause instanceof UnknownHostException ? "dns_error" : cause instanceof SSLException ? "tls_error" : cause instanceof SerializationException ? C3cF.A00(36) : cause instanceof IOException ? "io_error" : 200 <= i ? "response_error" : C3cF.A00(52) : "http_error";
    }

    public static final HatchCvmChipBudgetSpentPolicy whenBudgetSpent(HatchCvmChipBidTrigger hatchCvmChipBidTrigger) {
        return hatchCvmChipBidTrigger == HatchCvmChipBidTrigger.AUTOMATIC ? HatchCvmChipBudgetSpentPolicy.STOP : HatchCvmChipBudgetSpentPolicy.RESEND;
    }
}
