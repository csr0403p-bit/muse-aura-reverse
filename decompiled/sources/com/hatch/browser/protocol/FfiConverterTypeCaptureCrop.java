package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCaptureCrop implements FfiConverterRustBuffer<CaptureCrop> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCaptureCrop INSTANCE = new FfiConverterTypeCaptureCrop();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3420allocationSizeI7RO_PI(CaptureCrop captureCrop) {
        C7384Etj.A0Y(captureCrop, 0);
        return 32L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CaptureCrop read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new CaptureCrop(byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CaptureCrop lift(RustBuffer.ByValue byValue) {
        return (CaptureCrop) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CaptureCrop liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CaptureCrop) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CaptureCrop captureCrop) {
        return lower((Object) captureCrop);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CaptureCrop captureCrop) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, captureCrop);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CaptureCrop captureCrop, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(captureCrop, byteBuffer);
        byteBuffer.putDouble(captureCrop.x);
        byteBuffer.putDouble(captureCrop.y);
        byteBuffer.putDouble(captureCrop.width);
        byteBuffer.putDouble(captureCrop.height);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 32L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CaptureCrop, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CaptureCrop lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
