package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePdfPrintRequest implements FfiConverterRustBuffer<NativePdfPrintRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePdfPrintRequest INSTANCE = new FfiConverterTypeNativePdfPrintRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativePdfPrintRequest nativePdfPrintRequest) {
        C7384Etj.A0Y(nativePdfPrintRequest, 0);
        long jMo3323allocationSizeI7RO_PI = FfiConverterTypeOperationId.INSTANCE.mo3323allocationSizeI7RO_PI(nativePdfPrintRequest.operationId) + FfiConverterTypePageAuthorityClaim.INSTANCE.mo3323allocationSizeI7RO_PI(nativePdfPrintRequest.claim);
        C7384Etj.A0Y(nativePdfPrintRequest.options, 0);
        return jMo3323allocationSizeI7RO_PI + 2 + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(nativePdfPrintRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativePdfPrintRequest lift(RustBuffer.ByValue byValue) {
        return (NativePdfPrintRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativePdfPrintRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePdfPrintRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePdfPrintRequest nativePdfPrintRequest) {
        return lower((Object) nativePdfPrintRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePdfPrintRequest nativePdfPrintRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePdfPrintRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativePdfPrintRequest read(ByteBuffer byteBuffer) {
        return new NativePdfPrintRequest(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageAuthorityClaim.INSTANCE.read(byteBuffer), FfiConverterTypePdfOptions.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativePdfPrintRequest nativePdfPrintRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativePdfPrintRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(nativePdfPrintRequest.operationId, byteBuffer);
        FfiConverterTypePageAuthorityClaim.INSTANCE.write(nativePdfPrintRequest.claim, byteBuffer);
        FfiConverterTypePdfOptions.INSTANCE.write(nativePdfPrintRequest.options, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(nativePdfPrintRequest.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativePdfPrintRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePdfPrintRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
