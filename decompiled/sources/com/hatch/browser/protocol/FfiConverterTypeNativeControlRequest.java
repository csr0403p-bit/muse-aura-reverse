package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeControlRequest implements FfiConverterRustBuffer<NativeControlRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeControlRequest INSTANCE = new FfiConverterTypeNativeControlRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativeControlRequest nativeControlRequest) {
        return AbstractC7609F5w.A0M(AbstractC7608F5v.A0X(nativeControlRequest).mo3323allocationSizeI7RO_PI(nativeControlRequest.operationId), FfiConverterTypePageAuthorityClaim.INSTANCE.mo3323allocationSizeI7RO_PI(nativeControlRequest.claim)) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(nativeControlRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativeControlRequest lift(RustBuffer.ByValue byValue) {
        return (NativeControlRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativeControlRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeControlRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeControlRequest nativeControlRequest) {
        return lower((Object) nativeControlRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeControlRequest nativeControlRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeControlRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativeControlRequest read(ByteBuffer byteBuffer) {
        return new NativeControlRequest(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageAuthorityClaim.INSTANCE.read(byteBuffer), FfiConverterTypeNativeControlKind.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativeControlRequest nativeControlRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeControlRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(nativeControlRequest.operationId, byteBuffer);
        FfiConverterTypePageAuthorityClaim.INSTANCE.write(nativeControlRequest.claim, byteBuffer);
        AbstractC7611F5y.A0q(nativeControlRequest.kind, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(nativeControlRequest.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativeControlRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeControlRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
