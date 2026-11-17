package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeFileStageRequest implements FfiConverterRustBuffer<NativeFileStageRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeFileStageRequest INSTANCE = new FfiConverterTypeNativeFileStageRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativeFileStageRequest nativeFileStageRequest) {
        return AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, nativeFileStageRequest.stageId, AbstractC7608F5v.A0X(nativeFileStageRequest).mo3323allocationSizeI7RO_PI(nativeFileStageRequest.operationId) + FfiConverterTypePageAuthorityClaim.INSTANCE.mo3323allocationSizeI7RO_PI(nativeFileStageRequest.claim)) + FfiConverterSequenceTypeFileRef.INSTANCE.mo3323allocationSizeI7RO_PI(nativeFileStageRequest.files) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(nativeFileStageRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativeFileStageRequest lift(RustBuffer.ByValue byValue) {
        return (NativeFileStageRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativeFileStageRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeFileStageRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeFileStageRequest nativeFileStageRequest) {
        return lower((Object) nativeFileStageRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeFileStageRequest nativeFileStageRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeFileStageRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativeFileStageRequest read(ByteBuffer byteBuffer) {
        return new NativeFileStageRequest(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageAuthorityClaim.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), FfiConverterSequenceTypeFileRef.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativeFileStageRequest nativeFileStageRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeFileStageRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(nativeFileStageRequest.operationId, byteBuffer);
        FfiConverterTypePageAuthorityClaim.INSTANCE.write(nativeFileStageRequest.claim, byteBuffer);
        FfiConverterString.INSTANCE.write(nativeFileStageRequest.stageId, byteBuffer);
        FfiConverterSequenceTypeFileRef.INSTANCE.write(nativeFileStageRequest.files, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(nativeFileStageRequest.budget, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativeFileStageRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeFileStageRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
