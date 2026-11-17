package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import X.C9314GDq;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalULong implements FfiConverterRustBuffer<C9314GDq> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalULong INSTANCE = new FfiConverterOptionalULong();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: write-S8_Dj7E, reason: not valid java name and merged with bridge method [inline-methods] */
    public void write(C9314GDq c9314GDq, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (c9314GDq == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            byteBuffer.putLong(c9314GDq.A00);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
    }

    /* renamed from: allocationSize-pxRGoyM, reason: not valid java name */
    public long m3380allocationSizepxRGoyM(C9314GDq c9314GDq) {
        return AbstractC7610F5x.A0X(c9314GDq);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.GDq, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ C9314GDq lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }

    /* renamed from: lift-JlBESG8, reason: not valid java name */
    public /* bridge */ C9314GDq m3381liftJlBESG8(RustBuffer.ByValue byValue) {
        return (C9314GDq) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: liftFromRustBuffer-JlBESG8, reason: not valid java name */
    public /* bridge */ C9314GDq m3382liftFromRustBufferJlBESG8(RustBuffer.ByValue byValue) {
        return (C9314GDq) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lower-ADd3fzo, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3383lowerADd3fzo(C9314GDq c9314GDq) {
        return lower(c9314GDq);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* renamed from: lowerIntoRustBuffer-ADd3fzo, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3384lowerIntoRustBufferADd3fzo(C9314GDq c9314GDq) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, c9314GDq);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: read-JlBESG8, reason: not valid java name and merged with bridge method [inline-methods] */
    public C9314GDq read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return new C9314GDq(byteBuffer.getLong());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }
}
