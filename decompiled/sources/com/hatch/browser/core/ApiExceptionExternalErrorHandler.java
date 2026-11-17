package com.hatch.browser.core;

import X.C7384Etj;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.FfiConverterTypeApiError;
import com.hatch.browser.protocol.RustBuffer;

/* loaded from: classes6.dex */
public final class ApiExceptionExternalErrorHandler implements UniffiRustCallStatusErrorHandler<ApiException> {
    public static final int $stable = 0;
    public static final ApiExceptionExternalErrorHandler INSTANCE = new ApiExceptionExternalErrorHandler();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.UniffiRustCallStatusErrorHandler
    public ApiException lift(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        RustBuffer.ByValue byValue2 = new RustBuffer.ByValue();
        byValue2.capacity = byValue.capacity;
        byValue2.len = byValue.len;
        byValue2.data = byValue.data;
        return (ApiException) FfiConverterTypeApiError.INSTANCE.lift(byValue2);
    }
}
