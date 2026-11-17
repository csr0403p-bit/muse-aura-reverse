package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C3cG;
import X.C7384Etj;
import X.C9314GDq;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterULong implements FfiConverter<C9314GDq, Long> {
    public static final int $stable = 0;
    public static final FfiConverterULong INSTANCE = new FfiConverterULong();

    /* renamed from: write-4PLdz1A, reason: not valid java name */
    public void m3594write4PLdz1A(long j, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putLong(j);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(C9314GDq c9314GDq) {
        return 8L;
    }

    /* renamed from: allocationSize-PUiSbYQ, reason: not valid java name */
    public long m3588allocationSizePUiSbYQ(long j) {
        return 8L;
    }

    /* renamed from: lift-I7RO_PI, reason: not valid java name */
    public long m3589liftI7RO_PI(long j) {
        return j;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Long lower(C9314GDq c9314GDq) {
        return Long.valueOf(c9314GDq.A00);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(C9314GDq c9314GDq) {
        return m3592lowerIntoRustBufferVKZWuLQ(c9314GDq.A00);
    }

    /* renamed from: lowerIntoRustBuffer-VKZWuLQ, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3592lowerIntoRustBufferVKZWuLQ(long j) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, new C9314GDq(j));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(C9314GDq c9314GDq, ByteBuffer byteBuffer) {
        m3594write4PLdz1A(c9314GDq.A00, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9314GDq lift(Long l) {
        return new C9314GDq(C3cG.A05(l));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9314GDq liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return new C9314GDq(m3590liftFromRustBufferI7RO_PI(byValue));
    }

    /* renamed from: liftFromRustBuffer-I7RO_PI, reason: not valid java name */
    public /* bridge */ long m3590liftFromRustBufferI7RO_PI(RustBuffer.ByValue byValue) {
        return ((C9314GDq) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue)).A00;
    }

    /* renamed from: lower-VKZWuLQ, reason: not valid java name */
    public Long m3591lowerVKZWuLQ(long j) {
        return Long.valueOf(j);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9314GDq read(ByteBuffer byteBuffer) {
        return new C9314GDq(AbstractC7609F5w.A0N(byteBuffer));
    }

    /* renamed from: read-I7RO_PI, reason: not valid java name */
    public long m3593readI7RO_PI(ByteBuffer byteBuffer) {
        return AbstractC7609F5w.A0N(byteBuffer);
    }
}
