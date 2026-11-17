package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCaptureOptions implements FfiConverterRustBuffer<CaptureOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCaptureOptions INSTANCE = new FfiConverterTypeCaptureOptions();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CaptureOptions captureOptions) {
        C7384Etj.A0Y(captureOptions, 0);
        return AbstractC7610F5x.A0W(captureOptions.maxWidth) + AbstractC7610F5x.A0W(captureOptions.maxHeight) + 1;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CaptureOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        return new CaptureOptions(ffiConverterOptionalUInt.read(byteBuffer), ffiConverterOptionalUInt.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
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
    public void write(CaptureOptions captureOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(captureOptions, byteBuffer);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        ffiConverterOptionalUInt.write(captureOptions.maxWidth, byteBuffer);
        ffiConverterOptionalUInt.write(captureOptions.maxHeight, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(captureOptions.imageLoads, byteBuffer);
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
