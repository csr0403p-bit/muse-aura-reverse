package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalLong implements FfiConverterRustBuffer<Long> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalLong INSTANCE = new FfiConverterOptionalLong();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Long l, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (l == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            byteBuffer.putLong(l.longValue());
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3332allocationSizeI7RO_PI(Long l) {
        return AbstractC7610F5x.A0X(l);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Long lift(RustBuffer.ByValue byValue) {
        return (Long) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Long liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Long) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Long l) {
        return lower((Object) l);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Long l) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, l);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Long read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return Long.valueOf(byteBuffer.getLong());
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Long lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
