package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeViewport implements FfiConverterRustBuffer<Viewport> {
    public static final int $stable = 0;
    public static final FfiConverterTypeViewport INSTANCE = new FfiConverterTypeViewport();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Viewport viewport) {
        C7384Etj.A0Y(viewport, 0);
        return 16 + AbstractC7610F5x.A0X(viewport.deviceScaleFactor) + FfiConverterTypeViewportScope.INSTANCE.mo3323allocationSizeI7RO_PI(viewport.scope) + AbstractC7610F5x.A0X(viewport.scrollX) + AbstractC7610F5x.A0X(viewport.scrollY) + AbstractC7610F5x.A0X(viewport.scrollMaxY) + AbstractC7610F5x.A0W(viewport.pixelWidth) + AbstractC7610F5x.A0W(viewport.pixelHeight);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Viewport read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        double d = byteBuffer.getDouble();
        double d2 = byteBuffer.getDouble();
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        Double d3 = ffiConverterOptionalDouble.read(byteBuffer);
        ViewportScope viewportScope = new ViewportScope(AbstractC7610F5x.A0z(byteBuffer));
        Double d4 = ffiConverterOptionalDouble.read(byteBuffer);
        Double d5 = ffiConverterOptionalDouble.read(byteBuffer);
        Long l = FfiConverterOptionalLong.INSTANCE.read(byteBuffer);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        return new Viewport(d, d2, d3, viewportScope, d4, d5, l, ffiConverterOptionalUInt.read(byteBuffer), ffiConverterOptionalUInt.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Viewport lift(RustBuffer.ByValue byValue) {
        return (Viewport) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Viewport liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Viewport) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Viewport viewport) {
        return lower((Object) viewport);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Viewport viewport) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, viewport);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Viewport viewport, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(viewport, byteBuffer);
        byteBuffer.putDouble(viewport.width);
        byteBuffer.putDouble(viewport.height);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(viewport.deviceScaleFactor, byteBuffer);
        FfiConverterTypeViewportScope.INSTANCE.write(viewport.scope, byteBuffer);
        ffiConverterOptionalDouble.write(viewport.scrollX, byteBuffer);
        ffiConverterOptionalDouble.write(viewport.scrollY, byteBuffer);
        FfiConverterOptionalLong.INSTANCE.write(viewport.scrollMaxY, byteBuffer);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        ffiConverterOptionalUInt.write(viewport.pixelWidth, byteBuffer);
        ffiConverterOptionalUInt.write(viewport.pixelHeight, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Viewport, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Viewport lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
