package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.FfiConverterTypeDownloadPublishOutcome;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeDownloadPublishResult implements FfiConverterRustBuffer<NativeDownloadPublishResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeDownloadPublishResult INSTANCE = new FfiConverterTypeNativeDownloadPublishResult();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativeDownloadPublishResult nativeDownloadPublishResult) {
        C7384Etj.A0Y(nativeDownloadPublishResult, 0);
        return FfiConverterTypeDownloadPublishOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(nativeDownloadPublishResult.outcome);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeDownloadPublishResult read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new NativeDownloadPublishResult(FfiConverterTypeDownloadPublishOutcome.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeDownloadPublishResult lift(RustBuffer.ByValue byValue) {
        return (NativeDownloadPublishResult) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeDownloadPublishResult liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeDownloadPublishResult) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeDownloadPublishResult nativeDownloadPublishResult) {
        return lower((Object) nativeDownloadPublishResult);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeDownloadPublishResult nativeDownloadPublishResult) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeDownloadPublishResult);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeDownloadPublishResult nativeDownloadPublishResult, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeDownloadPublishResult, byteBuffer);
        FfiConverterTypeDownloadPublishOutcome.INSTANCE.write(nativeDownloadPublishResult.outcome, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeDownloadPublishResult, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeDownloadPublishResult lift(RustBuffer.ByValue byValue) {
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
