package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeFileReadResult implements FfiConverterRustBuffer<NativeFileReadResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeFileReadResult INSTANCE = new FfiConverterTypeNativeFileReadResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativeFileReadResult nativeFileReadResult) {
        C7384Etj.A0Y(nativeFileReadResult, 0);
        return AbstractC7610F5x.A0a(nativeFileReadResult.bytes);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeFileReadResult lift(RustBuffer.ByValue byValue) {
        return (NativeFileReadResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeFileReadResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeFileReadResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeFileReadResult nativeFileReadResult) {
        return lower((Object) nativeFileReadResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeFileReadResult nativeFileReadResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeFileReadResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeFileReadResult read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return new NativeFileReadResult(bArr);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeFileReadResult nativeFileReadResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeFileReadResult, byteBuffer);
        FfiConverterByteArray.INSTANCE.write(nativeFileReadResult.bytes, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeFileReadResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeFileReadResult lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }
}
