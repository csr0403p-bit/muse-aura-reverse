package com.hatch.browser.protocol;

import X.BV6;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterDouble implements FfiConverter<Double, Double> {
    public static final int $stable = 0;
    public static final FfiConverterDouble INSTANCE = new FfiConverterDouble();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public Double read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return Double.valueOf(byteBuffer.getDouble());
    }

    public void write(double d, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putDouble(d);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Double d) {
        d.doubleValue();
        return 8L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Double lift(Double d) {
        return Double.valueOf(BV6.A00(d));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Double liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Double) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Double lower(Double d) {
        return Double.valueOf(BV6.A00(d));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Double d) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Double.valueOf(BV6.A00(d)));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3327allocationSizeI7RO_PI(double d) {
        return 8L;
    }

    public Double lift(double d) {
        return Double.valueOf(d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Double liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public Double lower(double d) {
        return Double.valueOf(d);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(double d) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Double.valueOf(d));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(Double d, ByteBuffer byteBuffer) {
        write(BV6.A00(d), byteBuffer);
    }
}
