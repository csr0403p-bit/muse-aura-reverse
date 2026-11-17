package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C7384Etj;
import X.C9oA;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterUByte implements FfiConverter<C9oA, Byte> {
    public static final int $stable = 0;
    public static final FfiConverterUByte INSTANCE = new FfiConverterUByte();

    /* renamed from: write-0ky7B_Q, reason: not valid java name */
    public void m3580write0ky7B_Q(byte b, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.put(b);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(C9oA c9oA) {
        return 1L;
    }

    /* renamed from: allocationSize-qRK8ubM, reason: not valid java name */
    public long m3573allocationSizeqRK8ubM(byte b) {
        return 1L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9oA lift(Byte b) {
        return new C9oA(b.byteValue());
    }

    /* renamed from: lift-Wa3L5BU, reason: not valid java name */
    public final byte m3575liftWa3L5BU(int i) {
        return (byte) i;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Byte lower(C9oA c9oA) {
        return Byte.valueOf(c9oA.A00);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(C9oA c9oA) {
        return m3578lowerIntoRustBuffer7apg3OU(c9oA.A00);
    }

    /* renamed from: lowerIntoRustBuffer-7apg3OU, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3578lowerIntoRustBuffer7apg3OU(byte b) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, new C9oA(b));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(C9oA c9oA, ByteBuffer byteBuffer) {
        m3580write0ky7B_Q(c9oA.A00, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9oA liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return new C9oA(m3576liftFromRustBufferWa3L5BU(byValue));
    }

    /* renamed from: liftFromRustBuffer-Wa3L5BU, reason: not valid java name */
    public /* bridge */ byte m3576liftFromRustBufferWa3L5BU(RustBuffer.ByValue byValue) {
        return ((C9oA) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue)).A00;
    }

    /* renamed from: lower-7apg3OU, reason: not valid java name */
    public Byte m3577lower7apg3OU(byte b) {
        return Byte.valueOf(b);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ C9oA read(ByteBuffer byteBuffer) {
        return new C9oA(AbstractC7609F5w.A00(byteBuffer));
    }

    /* renamed from: read-Wa3L5BU, reason: not valid java name */
    public byte m3579readWa3L5BU(ByteBuffer byteBuffer) {
        return AbstractC7609F5w.A00(byteBuffer);
    }

    /* renamed from: lift-Wa3L5BU, reason: not valid java name */
    public byte m3574liftWa3L5BU(byte b) {
        return b;
    }
}
