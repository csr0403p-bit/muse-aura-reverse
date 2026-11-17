package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePageCloseRequest implements FfiConverterRustBuffer<NativePageCloseRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePageCloseRequest INSTANCE = new FfiConverterTypeNativePageCloseRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativePageCloseRequest nativePageCloseRequest) {
        return AbstractC7608F5v.A0X(nativePageCloseRequest).mo3323allocationSizeI7RO_PI(nativePageCloseRequest.operationId) + FfiConverterTypePageAuthorityClaim.INSTANCE.mo3323allocationSizeI7RO_PI(nativePageCloseRequest.claim) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(nativePageCloseRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativePageCloseRequest lift(RustBuffer.ByValue byValue) {
        return (NativePageCloseRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativePageCloseRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePageCloseRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePageCloseRequest nativePageCloseRequest) {
        return lower((Object) nativePageCloseRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePageCloseRequest nativePageCloseRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePageCloseRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativePageCloseRequest read(ByteBuffer byteBuffer) {
        return new NativePageCloseRequest(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageAuthorityClaim.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativePageCloseRequest nativePageCloseRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativePageCloseRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(nativePageCloseRequest.operationId, byteBuffer);
        FfiConverterTypePageAuthorityClaim.INSTANCE.write(nativePageCloseRequest.claim, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(nativePageCloseRequest.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativePageCloseRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePageCloseRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
