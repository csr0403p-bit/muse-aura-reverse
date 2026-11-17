package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalDouble implements FfiConverterRustBuffer<Double> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalDouble INSTANCE = new FfiConverterOptionalDouble();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Double d, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (d == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            byteBuffer.putDouble(d.doubleValue());
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3331allocationSizeI7RO_PI(Double d) {
        return AbstractC7610F5x.A0X(d);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Double lift(RustBuffer.ByValue byValue) {
        return (Double) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Double liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Double) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Double d) {
        return lower((Object) d);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Double d) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, d);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Double read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return Double.valueOf(byteBuffer.getDouble());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Double lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
