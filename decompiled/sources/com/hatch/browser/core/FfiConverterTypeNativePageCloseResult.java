package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.FfiConverterTypePageCloseOutcome;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePageCloseResult implements FfiConverterRustBuffer<NativePageCloseResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePageCloseResult INSTANCE = new FfiConverterTypeNativePageCloseResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativePageCloseResult nativePageCloseResult) {
        C7384Etj.A0Y(nativePageCloseResult, 0);
        return FfiConverterTypePageCloseOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(nativePageCloseResult.outcome);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativePageCloseResult read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new NativePageCloseResult(FfiConverterTypePageCloseOutcome.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativePageCloseResult lift(RustBuffer.ByValue byValue) {
        return (NativePageCloseResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativePageCloseResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePageCloseResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePageCloseResult nativePageCloseResult) {
        return lower((Object) nativePageCloseResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePageCloseResult nativePageCloseResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePageCloseResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativePageCloseResult nativePageCloseResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativePageCloseResult, byteBuffer);
        FfiConverterTypePageCloseOutcome.INSTANCE.write(nativePageCloseResult.outcome, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativePageCloseResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePageCloseResult lift(RustBuffer.ByValue byValue) {
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
