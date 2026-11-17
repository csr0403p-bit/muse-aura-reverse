package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.BV4;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeApiError implements FfiConverterRustBuffer<ApiException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeApiError INSTANCE = new FfiConverterTypeApiError();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ApiException apiException) {
        C7384Etj.A0Y(apiException, 0);
        if ((apiException instanceof ApiException.Malformed) || (apiException instanceof ApiException.IncompatibleVersion) || (apiException instanceof ApiException.LimitExceeded) || (apiException instanceof ApiException.SetupFailed) || (apiException instanceof ApiException.UnknownPage) || (apiException instanceof ApiException.Closed) || (apiException instanceof ApiException.LifecycleConflict) || (apiException instanceof ApiException.EncodingFailed)) {
            return 4L;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ApiException lift(RustBuffer.ByValue byValue) {
        return (ApiException) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ApiException liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ApiException) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ApiException apiException) {
        return lower((Object) apiException);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ApiException apiException) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, apiException);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ApiException read(ByteBuffer byteBuffer) {
        switch (AbstractC7609F5w.A0H(byteBuffer)) {
            case 1:
                return new ApiException.Malformed();
            case 2:
                return new ApiException.IncompatibleVersion();
            case 3:
                return new ApiException.LimitExceeded();
            case 4:
                return new ApiException.SetupFailed();
            case 5:
                return new ApiException.UnknownPage();
            case 6:
                return new ApiException.Closed();
            case 7:
                return new ApiException.LifecycleConflict();
            case 8:
                return new ApiException.EncodingFailed();
            default:
                throw BV4.A0c("invalid error enum value, something is very wrong!!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ApiException apiException, ByteBuffer byteBuffer) {
        boolean z = apiException instanceof ApiException.Malformed;
        int iA1Y = C60P.A1Y(apiException, byteBuffer);
        if (!z) {
            if (apiException instanceof ApiException.IncompatibleVersion) {
                iA1Y = 2;
            } else if (apiException instanceof ApiException.LimitExceeded) {
                iA1Y = 3;
            } else if (apiException instanceof ApiException.SetupFailed) {
                iA1Y = 4;
            } else if (apiException instanceof ApiException.UnknownPage) {
                iA1Y = 5;
            } else if (apiException instanceof ApiException.Closed) {
                iA1Y = 6;
            } else if (apiException instanceof ApiException.LifecycleConflict) {
                iA1Y = 7;
            } else {
                if (!(apiException instanceof ApiException.EncodingFailed)) {
                    throw C3cG.A0q();
                }
                iA1Y = 8;
            }
        }
        byteBuffer.putInt(iA1Y);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer, reason: merged with bridge method [inline-methods] */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ApiException, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ApiException lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
