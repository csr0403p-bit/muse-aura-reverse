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
public final class FfiConverterTypeNativeDownloadPublishRequest implements FfiConverterRustBuffer<NativeDownloadPublishRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeDownloadPublishRequest INSTANCE = new FfiConverterTypeNativeDownloadPublishRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativeDownloadPublishRequest nativeDownloadPublishRequest) {
        long jMo3323allocationSizeI7RO_PI = AbstractC7608F5v.A0X(nativeDownloadPublishRequest).mo3323allocationSizeI7RO_PI(nativeDownloadPublishRequest.operationId) + FfiConverterTypePageAuthorityClaim.INSTANCE.mo3323allocationSizeI7RO_PI(nativeDownloadPublishRequest.claim);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return AbstractC7607F5u.A0R(ffiConverterString, nativeDownloadPublishRequest.sha256, AbstractC7607F5u.A0R(ffiConverterString, nativeDownloadPublishRequest.name, AbstractC7607F5u.A0R(ffiConverterString, nativeDownloadPublishRequest.destination, AbstractC7607F5u.A0R(ffiConverterString, nativeDownloadPublishRequest.downloadId, jMo3323allocationSizeI7RO_PI))) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(nativeDownloadPublishRequest.mimeType) + 8) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(nativeDownloadPublishRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativeDownloadPublishRequest lift(RustBuffer.ByValue byValue) {
        return (NativeDownloadPublishRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativeDownloadPublishRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeDownloadPublishRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeDownloadPublishRequest nativeDownloadPublishRequest) {
        return lower((Object) nativeDownloadPublishRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeDownloadPublishRequest nativeDownloadPublishRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeDownloadPublishRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativeDownloadPublishRequest read(ByteBuffer byteBuffer) {
        OperationId operationIdA0k = AbstractC7610F5x.A0k(byteBuffer);
        PageAuthorityClaim pageAuthorityClaim = FfiConverterTypePageAuthorityClaim.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new NativeDownloadPublishRequest(operationIdA0k, pageAuthorityClaim, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), byteBuffer.getLong(), ffiConverterString.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativeDownloadPublishRequest nativeDownloadPublishRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeDownloadPublishRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(nativeDownloadPublishRequest.operationId, byteBuffer);
        FfiConverterTypePageAuthorityClaim.INSTANCE.write(nativeDownloadPublishRequest.claim, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(nativeDownloadPublishRequest.downloadId, byteBuffer);
        ffiConverterString.write(nativeDownloadPublishRequest.destination, byteBuffer);
        ffiConverterString.write(nativeDownloadPublishRequest.name, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(nativeDownloadPublishRequest.mimeType, byteBuffer);
        byteBuffer.putLong(nativeDownloadPublishRequest.bytes);
        ffiConverterString.write(nativeDownloadPublishRequest.sha256, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(nativeDownloadPublishRequest.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativeDownloadPublishRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeDownloadPublishRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
