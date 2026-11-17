package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCloseReceiptEnvelope implements FfiConverterRustBuffer<PageCloseReceiptEnvelope> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseReceiptEnvelope INSTANCE = new FfiConverterTypePageCloseReceiptEnvelope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseReceiptEnvelope pageCloseReceiptEnvelope) {
        C7384Etj.A0Y(pageCloseReceiptEnvelope, 0);
        return 4 + FfiConverterTypePageCloseReceipt.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseReceiptEnvelope.receipt);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseReceiptEnvelope lift(RustBuffer.ByValue byValue) {
        return (PageCloseReceiptEnvelope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseReceiptEnvelope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseReceiptEnvelope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseReceiptEnvelope pageCloseReceiptEnvelope) {
        return lower((Object) pageCloseReceiptEnvelope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseReceiptEnvelope pageCloseReceiptEnvelope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseReceiptEnvelope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseReceiptEnvelope read(ByteBuffer byteBuffer) {
        return new PageCloseReceiptEnvelope(AbstractC7609F5w.A0H(byteBuffer), FfiConverterTypePageCloseReceipt.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseReceiptEnvelope pageCloseReceiptEnvelope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCloseReceiptEnvelope, byteBuffer);
        byteBuffer.putInt(pageCloseReceiptEnvelope.apiVersion);
        FfiConverterTypePageCloseReceipt.INSTANCE.write(pageCloseReceiptEnvelope.receipt, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseReceiptEnvelope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseReceiptEnvelope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
