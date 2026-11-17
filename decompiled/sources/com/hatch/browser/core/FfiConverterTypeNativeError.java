package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.BV4;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.NativeException;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeError implements FfiConverterRustBuffer<NativeException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeError INSTANCE = new FfiConverterTypeNativeError();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativeException nativeException) {
        C7384Etj.A0Y(nativeException, 0);
        if ((nativeException instanceof NativeException.Unavailable) || (nativeException instanceof NativeException.Unauthorized) || (nativeException instanceof NativeException.Timeout) || (nativeException instanceof NativeException.Unsupported)) {
            return 4L;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeException lift(RustBuffer.ByValue byValue) {
        return (NativeException) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeException liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeException) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeException nativeException) {
        return lower((Object) nativeException);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeException nativeException) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeException);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeException read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new NativeException.Unavailable();
        }
        if (iA0H == 2) {
            return new NativeException.Unauthorized();
        }
        if (iA0H == 3) {
            return new NativeException.Timeout();
        }
        if (iA0H == 4) {
            return new NativeException.Unsupported();
        }
        throw BV4.A0c("invalid error enum value, something is very wrong!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeException nativeException, ByteBuffer byteBuffer) {
        boolean z = nativeException instanceof NativeException.Unavailable;
        int iA1Y = C60P.A1Y(nativeException, byteBuffer);
        if (!z) {
            if (nativeException instanceof NativeException.Unauthorized) {
                iA1Y = 2;
            } else if (nativeException instanceof NativeException.Timeout) {
                iA1Y = 3;
            } else {
                if (!(nativeException instanceof NativeException.Unsupported)) {
                    throw C3cG.A0q();
                }
                iA1Y = 4;
            }
        }
        byteBuffer.putInt(iA1Y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeException, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeException lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer, reason: merged with bridge method [inline-methods] */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }
}
