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
public final class FfiConverterTypePageCloseReceipt implements FfiConverterRustBuffer<PageCloseReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseReceipt INSTANCE = new FfiConverterTypePageCloseReceipt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseReceipt pageCloseReceipt) {
        return AbstractC7609F5w.A0M(AbstractC7608F5v.A0X(pageCloseReceipt).mo3323allocationSizeI7RO_PI(pageCloseReceipt.operationId), FfiConverterTypePageCloseOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseReceipt.outcome));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseReceipt lift(RustBuffer.ByValue byValue) {
        return (PageCloseReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseReceipt pageCloseReceipt) {
        return lower((Object) pageCloseReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseReceipt pageCloseReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseReceipt read(ByteBuffer byteBuffer) {
        return new PageCloseReceipt(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageCloseOutcome.INSTANCE.read(byteBuffer), FfiConverterTypeSettlementState.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseReceipt pageCloseReceipt, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCloseReceipt, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(pageCloseReceipt.operationId, byteBuffer);
        FfiConverterTypePageCloseOutcome.INSTANCE.write(pageCloseReceipt.outcome, byteBuffer);
        AbstractC7611F5y.A0q(pageCloseReceipt.settlement, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
