package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.FfiConverterTypeFileStageOutcome;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeFileStageResult implements FfiConverterRustBuffer<NativeFileStageResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeFileStageResult INSTANCE = new FfiConverterTypeNativeFileStageResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativeFileStageResult nativeFileStageResult) {
        C7384Etj.A0Y(nativeFileStageResult, 0);
        return FfiConverterTypeFileStageOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(nativeFileStageResult.outcome);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeFileStageResult read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new NativeFileStageResult(FfiConverterTypeFileStageOutcome.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeFileStageResult lift(RustBuffer.ByValue byValue) {
        return (NativeFileStageResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeFileStageResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeFileStageResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeFileStageResult nativeFileStageResult) {
        return lower((Object) nativeFileStageResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeFileStageResult nativeFileStageResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeFileStageResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeFileStageResult nativeFileStageResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeFileStageResult, byteBuffer);
        FfiConverterTypeFileStageOutcome.INSTANCE.write(nativeFileStageResult.outcome, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeFileStageResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeFileStageResult lift(RustBuffer.ByValue byValue) {
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
