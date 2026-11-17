package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypePixelRegion implements FfiConverterRustBuffer<PixelRegion> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypePixelRegion INSTANCE = new FfiConverterOptionalTypePixelRegion();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PixelRegion pixelRegion, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (pixelRegion == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypePixelRegion.INSTANCE.write(pixelRegion, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3354allocationSizeI7RO_PI(PixelRegion pixelRegion) {
        return AbstractC7610F5x.A0Y(pixelRegion);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PixelRegion lift(RustBuffer.ByValue byValue) {
        return (PixelRegion) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PixelRegion liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PixelRegion) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PixelRegion pixelRegion) {
        return lower((Object) pixelRegion);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PixelRegion pixelRegion) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pixelRegion);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PixelRegion read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypePixelRegion.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0Y(obj);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PixelRegion, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PixelRegion lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
