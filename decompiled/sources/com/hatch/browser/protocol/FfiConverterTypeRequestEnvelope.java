package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeRequestEnvelope implements FfiConverterRustBuffer<RequestEnvelope> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRequestEnvelope INSTANCE = new FfiConverterTypeRequestEnvelope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(RequestEnvelope requestEnvelope) {
        C7384Etj.A0Y(requestEnvelope, 0);
        return 4 + FfiConverterTypeCommandRequest.INSTANCE.mo3323allocationSizeI7RO_PI(requestEnvelope.request);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ RequestEnvelope lift(RustBuffer.ByValue byValue) {
        return (RequestEnvelope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ RequestEnvelope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (RequestEnvelope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(RequestEnvelope requestEnvelope) {
        return lower((Object) requestEnvelope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(RequestEnvelope requestEnvelope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, requestEnvelope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public RequestEnvelope read(ByteBuffer byteBuffer) {
        return new RequestEnvelope(AbstractC7609F5w.A0H(byteBuffer), FfiConverterTypeCommandRequest.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(RequestEnvelope requestEnvelope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(requestEnvelope, byteBuffer);
        byteBuffer.putInt(requestEnvelope.apiVersion);
        FfiConverterTypeCommandRequest.INSTANCE.write(requestEnvelope.request, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.RequestEnvelope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ RequestEnvelope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
