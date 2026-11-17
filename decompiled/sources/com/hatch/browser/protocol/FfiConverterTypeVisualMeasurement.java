package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualMeasurement implements FfiConverterRustBuffer<VisualMeasurement> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualMeasurement INSTANCE = new FfiConverterTypeVisualMeasurement();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualMeasurement visualMeasurement) {
        C7384Etj.A0Y(visualMeasurement, 0);
        C7384Etj.A0Y(visualMeasurement.region, 0);
        return 40 + AbstractC7610F5x.A0X(visualMeasurement.changedPixels) + AbstractC7610F5x.A0X(visualMeasurement.meanAbsoluteRgbChange) + AbstractC7610F5x.A0Y(visualMeasurement.changedBounds) + FfiConverterOptionalTypeVisualTransformEstimate.INSTANCE.mo3323allocationSizeI7RO_PI(visualMeasurement.transform) + AbstractC7610F5x.A0W(visualMeasurement.unavailable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualMeasurement lift(RustBuffer.ByValue byValue) {
        return (VisualMeasurement) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualMeasurement liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualMeasurement) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualMeasurement visualMeasurement) {
        return lower((Object) visualMeasurement);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualMeasurement visualMeasurement) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualMeasurement);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualMeasurement read(ByteBuffer byteBuffer) {
        return new VisualMeasurement(AbstractC7609F5w.A0N(byteBuffer), byteBuffer.getLong(), byteBuffer.getLong(), FfiConverterTypePixelRegion.INSTANCE.read(byteBuffer), FfiConverterOptionalULong.INSTANCE.read(byteBuffer), FfiConverterOptionalDouble.INSTANCE.read(byteBuffer), FfiConverterOptionalTypePixelRegion.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeVisualTransformEstimate.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeVisualMeasurementUnavailable.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualMeasurement visualMeasurement, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualMeasurement, byteBuffer);
        byteBuffer.putLong(visualMeasurement.input);
        byteBuffer.putLong(visualMeasurement.beforeFrame);
        byteBuffer.putLong(visualMeasurement.afterFrame);
        FfiConverterTypePixelRegion.INSTANCE.write(visualMeasurement.region, byteBuffer);
        FfiConverterOptionalULong.INSTANCE.write(visualMeasurement.changedPixels, byteBuffer);
        FfiConverterOptionalDouble.INSTANCE.write(visualMeasurement.meanAbsoluteRgbChange, byteBuffer);
        FfiConverterOptionalTypePixelRegion.INSTANCE.write(visualMeasurement.changedBounds, byteBuffer);
        FfiConverterOptionalTypeVisualTransformEstimate.INSTANCE.write(visualMeasurement.transform, byteBuffer);
        FfiConverterOptionalTypeVisualMeasurementUnavailable.INSTANCE.write(visualMeasurement.unavailable, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualMeasurement, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualMeasurement lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
