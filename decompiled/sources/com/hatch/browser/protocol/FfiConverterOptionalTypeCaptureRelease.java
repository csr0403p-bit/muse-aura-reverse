package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeCaptureRelease implements FfiConverterRustBuffer<CaptureRelease> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeCaptureRelease INSTANCE = new FfiConverterOptionalTypeCaptureRelease();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CaptureRelease captureRelease, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (captureRelease == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeCaptureRelease.INSTANCE.write(captureRelease, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CaptureRelease captureRelease) {
        if (captureRelease != null) {
            return FfiConverterTypeCaptureRelease.INSTANCE.mo3323allocationSizeI7RO_PI(captureRelease) + 1;
        }
        return 1L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CaptureRelease lift(RustBuffer.ByValue byValue) {
        return (CaptureRelease) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CaptureRelease liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CaptureRelease) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CaptureRelease captureRelease) {
        return lower((Object) captureRelease);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CaptureRelease captureRelease) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, captureRelease);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CaptureRelease read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeCaptureRelease.INSTANCE.read(byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CaptureRelease, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CaptureRelease lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
