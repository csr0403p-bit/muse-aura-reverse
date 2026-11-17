package com.hatch.browser.protocol;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F60;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.ForeignBytes;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Native;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterByRefBytes implements FfiConverter<ByteBuffer, ForeignBytes.ByValue> {
    public static final int $stable = 0;
    public static final FfiConverterByRefBytes INSTANCE = new FfiConverterByRefBytes();

    @Override // com.hatch.browser.protocol.FfiConverter
    public ForeignBytes.ByValue lower(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw C60O.A0i("UniFFI zero-copy &[u8] requires a direct ByteBuffer. Use ByteBuffer.allocateDirect().");
        }
        int iRemaining = byteBuffer.remaining();
        ForeignBytes.ByValue byValue = new ForeignBytes.ByValue();
        byValue.len = iRemaining;
        byValue.data = iRemaining == 0 ? null : Native.getDirectBufferPointer(byteBuffer);
        return byValue;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(ByteBuffer byteBuffer) {
        m3325allocationSizeI7RO_PI(byteBuffer);
        throw F60.createAndThrow();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ ByteBuffer lift(ForeignBytes.ByValue byValue) {
        lift2(byValue);
        throw F60.createAndThrow();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        throw C3cG.A0Q("ByRef bytes cannot be written to a buffer: zero-copy &[u8] is only supported in argument position, not nested in records/options/etc.");
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: liftFromRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ ByteBuffer liftFromRustBuffer2(RustBuffer.ByValue byValue) {
        return (ByteBuffer) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(ByteBuffer byteBuffer) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ ByteBuffer read(ByteBuffer byteBuffer) {
        read(byteBuffer);
        throw F60.createAndThrow();
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3325allocationSizeI7RO_PI(ByteBuffer byteBuffer) {
        throw C3cG.A0Q("ByRef bytes have no RustBuffer allocation size: zero-copy &[u8] is only supported in argument position, not nested in records/options/etc.");
    }

    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public ByteBuffer lift2(ForeignBytes.ByValue byValue) {
        throw C3cG.A0Q("ByRef bytes cannot be lifted: zero-copy &[u8] only flows foreign->Rust");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ ByteBuffer liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(ByteBuffer byteBuffer) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ByteBuffer read(ByteBuffer byteBuffer) {
        throw C3cG.A0Q("ByRef bytes cannot be read from a buffer: zero-copy &[u8] is only supported in argument position, not nested in records/options/etc.");
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        throw C3cG.A0Q("ByRef bytes cannot be written to a buffer: zero-copy &[u8] is only supported in argument position, not nested in records/options/etc.");
    }
}
