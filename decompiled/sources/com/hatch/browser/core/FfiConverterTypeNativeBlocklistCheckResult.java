package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeBlocklistCheckResult implements FfiConverterRustBuffer<NativeBlocklistCheckResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeBlocklistCheckResult INSTANCE = new FfiConverterTypeNativeBlocklistCheckResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativeBlocklistCheckResult nativeBlocklistCheckResult) {
        C7384Etj.A0Y(nativeBlocklistCheckResult, 0);
        return AbstractC7610F5x.A0a(nativeBlocklistCheckResult.response);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeBlocklistCheckResult lift(RustBuffer.ByValue byValue) {
        return (NativeBlocklistCheckResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeBlocklistCheckResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeBlocklistCheckResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeBlocklistCheckResult nativeBlocklistCheckResult) {
        return lower((Object) nativeBlocklistCheckResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeBlocklistCheckResult nativeBlocklistCheckResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeBlocklistCheckResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeBlocklistCheckResult read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return new NativeBlocklistCheckResult(bArr);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeBlocklistCheckResult nativeBlocklistCheckResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeBlocklistCheckResult, byteBuffer);
        FfiConverterByteArray.INSTANCE.write(nativeBlocklistCheckResult.response, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeBlocklistCheckResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeBlocklistCheckResult lift(RustBuffer.ByValue byValue) {
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
