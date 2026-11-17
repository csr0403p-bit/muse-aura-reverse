package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePixelRegion implements FfiConverterRustBuffer<PixelRegion> {
    public static final int $stable = 0;
    public static final FfiConverterTypePixelRegion INSTANCE = new FfiConverterTypePixelRegion();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3510allocationSizeI7RO_PI(PixelRegion pixelRegion) {
        C7384Etj.A0Y(pixelRegion, 0);
        return 16L;
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
        return new PixelRegion(AbstractC7609F5w.A0H(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PixelRegion pixelRegion, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pixelRegion, byteBuffer);
        byteBuffer.putInt(pixelRegion.x);
        byteBuffer.putInt(pixelRegion.y);
        byteBuffer.putInt(pixelRegion.width);
        byteBuffer.putInt(pixelRegion.height);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 16L;
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
