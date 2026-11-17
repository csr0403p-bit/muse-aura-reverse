package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualTransformEstimate implements FfiConverterRustBuffer<VisualTransformEstimate> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualTransformEstimate INSTANCE = new FfiConverterTypeVisualTransformEstimate();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualTransformEstimate visualTransformEstimate) {
        C7384Etj.A0Y(visualTransformEstimate, 0);
        C7384Etj.A0Y(visualTransformEstimate.translation, 0);
        C7384Etj.A0Y(visualTransformEstimate.regionCenterDisplacement, 0);
        return 80L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualTransformEstimate read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        double d = byteBuffer.getDouble();
        double d2 = byteBuffer.getDouble();
        FfiConverterTypePoint ffiConverterTypePoint = FfiConverterTypePoint.INSTANCE;
        return new VisualTransformEstimate(d, d2, ffiConverterTypePoint.read(byteBuffer), ffiConverterTypePoint.read(byteBuffer), byteBuffer.getLong(), byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualTransformEstimate lift(RustBuffer.ByValue byValue) {
        return (VisualTransformEstimate) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualTransformEstimate liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualTransformEstimate) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualTransformEstimate visualTransformEstimate) {
        return lower((Object) visualTransformEstimate);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualTransformEstimate visualTransformEstimate) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualTransformEstimate);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualTransformEstimate visualTransformEstimate, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualTransformEstimate, byteBuffer);
        byteBuffer.putDouble(visualTransformEstimate.clockwiseDegrees);
        byteBuffer.putDouble(visualTransformEstimate.scale);
        FfiConverterTypePoint ffiConverterTypePoint = FfiConverterTypePoint.INSTANCE;
        ffiConverterTypePoint.write(visualTransformEstimate.translation, byteBuffer);
        ffiConverterTypePoint.write(visualTransformEstimate.regionCenterDisplacement, byteBuffer);
        byteBuffer.putLong(visualTransformEstimate.matchedFeatures);
        byteBuffer.putLong(visualTransformEstimate.inliers);
        byteBuffer.putDouble(visualTransformEstimate.medianErrorPixels);
        byteBuffer.putDouble(visualTransformEstimate.inlierTolerancePixels);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualTransformEstimate, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualTransformEstimate lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
