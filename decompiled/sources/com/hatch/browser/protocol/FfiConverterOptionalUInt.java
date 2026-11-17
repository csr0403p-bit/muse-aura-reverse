package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import X.FKC;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalUInt implements FfiConverterRustBuffer<FKC> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalUInt INSTANCE = new FfiConverterOptionalUInt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: write-aPkLuA0, reason: not valid java name and merged with bridge method [inline-methods] */
    public void write(FKC fkc, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (fkc == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            byteBuffer.putInt(fkc.A00);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0W(obj);
    }

    /* renamed from: allocationSize-hExw-GI, reason: not valid java name */
    public long m3373allocationSizehExwGI(FKC fkc) {
        return AbstractC7610F5x.A0W(fkc);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.FKC, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FKC lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }

    /* renamed from: lift-gbq4QnA, reason: not valid java name */
    public /* bridge */ FKC m3374liftgbq4QnA(RustBuffer.ByValue byValue) {
        return (FKC) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: liftFromRustBuffer-gbq4QnA, reason: not valid java name */
    public /* bridge */ FKC m3375liftFromRustBuffergbq4QnA(RustBuffer.ByValue byValue) {
        return (FKC) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lower-ExVfyTY, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3376lowerExVfyTY(FKC fkc) {
        return lower(fkc);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* renamed from: lowerIntoRustBuffer-ExVfyTY, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3377lowerIntoRustBufferExVfyTY(FKC fkc) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, fkc);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: read-gbq4QnA, reason: not valid java name and merged with bridge method [inline-methods] */
    public FKC read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FKC.A01(byteBuffer.getInt());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }
}
