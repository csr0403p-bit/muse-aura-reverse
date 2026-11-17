package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterLong implements FfiConverter<Long, Long> {
    public static final int $stable = 0;
    public static final FfiConverterLong INSTANCE = new FfiConverterLong();

    public void write(long j, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putLong(j);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Long l) {
        l.longValue();
        return 8L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Long lift(Long l) {
        return Long.valueOf(C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Long liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Long) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Long lower(Long l) {
        return Long.valueOf(C3cG.A05(l));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Long l) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Long.valueOf(C3cG.A05(l)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public Long read(ByteBuffer byteBuffer) {
        return Long.valueOf(AbstractC7609F5w.A0N(byteBuffer));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3329allocationSizeI7RO_PI(long j) {
        return 8L;
    }

    public Long lift(long j) {
        return Long.valueOf(j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Long liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public Long lower(long j) {
        return Long.valueOf(j);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(long j) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Long.valueOf(j));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Long read(ByteBuffer byteBuffer) {
        return Long.valueOf(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(Long l, ByteBuffer byteBuffer) {
        write(C3cG.A05(l), byteBuffer);
    }
}
