package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePdfPrintResult implements FfiConverterRustBuffer<NativePdfPrintResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePdfPrintResult INSTANCE = new FfiConverterTypeNativePdfPrintResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativePdfPrintResult nativePdfPrintResult) {
        C7384Etj.A0Y(nativePdfPrintResult, 0);
        return AbstractC7610F5x.A0a(nativePdfPrintResult.bytes);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativePdfPrintResult lift(RustBuffer.ByValue byValue) {
        return (NativePdfPrintResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativePdfPrintResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePdfPrintResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePdfPrintResult nativePdfPrintResult) {
        return lower((Object) nativePdfPrintResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePdfPrintResult nativePdfPrintResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePdfPrintResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativePdfPrintResult read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return new NativePdfPrintResult(bArr);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativePdfPrintResult nativePdfPrintResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativePdfPrintResult, byteBuffer);
        FfiConverterByteArray.INSTANCE.write(nativePdfPrintResult.bytes, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativePdfPrintResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePdfPrintResult lift(RustBuffer.ByValue byValue) {
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
