package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.CnB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4118CnB {
    public static ApiException A00(Status status) {
        return status.A01 != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
