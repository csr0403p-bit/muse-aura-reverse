package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeVisualMeasurementUnavailable implements FfiConverterRustBuffer<VisualMeasurementUnavailable> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeVisualMeasurementUnavailable INSTANCE = new FfiConverterOptionalTypeVisualMeasurementUnavailable();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualMeasurementUnavailable visualMeasurementUnavailable, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (visualMeasurementUnavailable == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            AbstractC7611F5y.A0q(visualMeasurementUnavailable, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3370allocationSizeI7RO_PI(VisualMeasurementUnavailable visualMeasurementUnavailable) {
        return AbstractC7610F5x.A0W(visualMeasurementUnavailable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualMeasurementUnavailable lift(RustBuffer.ByValue byValue) {
        return (VisualMeasurementUnavailable) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualMeasurementUnavailable liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualMeasurementUnavailable) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualMeasurementUnavailable visualMeasurementUnavailable) {
        return lower((Object) visualMeasurementUnavailable);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualMeasurementUnavailable visualMeasurementUnavailable) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualMeasurementUnavailable);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualMeasurementUnavailable read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeVisualMeasurementUnavailable.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0W(obj);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualMeasurementUnavailable, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualMeasurementUnavailable lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
