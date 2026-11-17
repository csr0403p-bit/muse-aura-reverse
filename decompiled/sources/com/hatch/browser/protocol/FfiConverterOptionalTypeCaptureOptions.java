package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeCaptureOptions implements FfiConverterRustBuffer<CaptureOptions> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeCaptureOptions INSTANCE = new FfiConverterOptionalTypeCaptureOptions();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CaptureOptions captureOptions, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (captureOptions == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeCaptureOptions.INSTANCE.write(captureOptions, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CaptureOptions captureOptions) {
        if (captureOptions != null) {
            return FfiConverterTypeCaptureOptions.INSTANCE.mo3323allocationSizeI7RO_PI(captureOptions) + 1;
        }
        return 1L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CaptureOptions lift(RustBuffer.ByValue byValue) {
        return (CaptureOptions) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CaptureOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CaptureOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CaptureOptions captureOptions) {
        return lower((Object) captureOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CaptureOptions captureOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, captureOptions);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CaptureOptions read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeCaptureOptions.INSTANCE.read(byteBuffer);
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
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CaptureOptions, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CaptureOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
