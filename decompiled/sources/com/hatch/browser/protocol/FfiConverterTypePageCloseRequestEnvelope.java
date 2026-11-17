package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCloseRequestEnvelope implements FfiConverterRustBuffer<PageCloseRequestEnvelope> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseRequestEnvelope INSTANCE = new FfiConverterTypePageCloseRequestEnvelope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseRequestEnvelope pageCloseRequestEnvelope) {
        C7384Etj.A0Y(pageCloseRequestEnvelope, 0);
        return 4 + FfiConverterTypePageCloseRequest.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseRequestEnvelope.request);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseRequestEnvelope lift(RustBuffer.ByValue byValue) {
        return (PageCloseRequestEnvelope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseRequestEnvelope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseRequestEnvelope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseRequestEnvelope pageCloseRequestEnvelope) {
        return lower((Object) pageCloseRequestEnvelope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseRequestEnvelope pageCloseRequestEnvelope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseRequestEnvelope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseRequestEnvelope read(ByteBuffer byteBuffer) {
        return new PageCloseRequestEnvelope(AbstractC7609F5w.A0H(byteBuffer), FfiConverterTypePageCloseRequest.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseRequestEnvelope pageCloseRequestEnvelope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCloseRequestEnvelope, byteBuffer);
        byteBuffer.putInt(pageCloseRequestEnvelope.apiVersion);
        FfiConverterTypePageCloseRequest.INSTANCE.write(pageCloseRequestEnvelope.request, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseRequestEnvelope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseRequestEnvelope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
