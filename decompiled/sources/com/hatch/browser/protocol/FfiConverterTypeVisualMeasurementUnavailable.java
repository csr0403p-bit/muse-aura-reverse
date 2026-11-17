package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualMeasurementUnavailable implements FfiConverterRustBuffer<VisualMeasurementUnavailable> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualMeasurementUnavailable INSTANCE = new FfiConverterTypeVisualMeasurementUnavailable();

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualMeasurementUnavailable read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        try {
            return VisualMeasurementUnavailable.values()[AbstractC7607F5u.A0H(byteBuffer)];
        } catch (IndexOutOfBoundsException e) {
            throw AbstractC7608F5v.A0n(e);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3567allocationSizeI7RO_PI(VisualMeasurementUnavailable visualMeasurementUnavailable) {
        return 4L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(Object obj, ByteBuffer byteBuffer) {
        AbstractC7611F5y.A0q((VisualMeasurementUnavailable) obj, byteBuffer);
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
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return 4L;
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

    public void write(VisualMeasurementUnavailable visualMeasurementUnavailable, ByteBuffer byteBuffer) {
        AbstractC7611F5y.A0q(visualMeasurementUnavailable, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualMeasurementUnavailable, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualMeasurementUnavailable lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
