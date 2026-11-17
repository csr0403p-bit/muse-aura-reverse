package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterByteArray implements FfiConverterRustBuffer<byte[]> {
    public static final int $stable = 0;
    public static final FfiConverterByteArray INSTANCE = new FfiConverterByteArray();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0a((byte[]) obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ byte[] liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (byte[]) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(byte[] bArr, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(bArr, byteBuffer);
        byteBuffer.putInt(bArr.length);
        byteBuffer.put(bArr);
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3231allocationSizeI7RO_PI(byte[] bArr) {
        return AbstractC7610F5x.A0a(bArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ byte[] lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(byte[] bArr) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, bArr);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public byte[] read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ byte[] lift2(RustBuffer.ByValue byValue) {
        return (byte[]) AbstractC7609F5w.A0p(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(byte[] bArr) {
        return lower((Object) bArr);
    }
}
