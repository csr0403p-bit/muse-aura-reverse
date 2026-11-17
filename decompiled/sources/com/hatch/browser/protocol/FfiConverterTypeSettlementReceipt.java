package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSettlementReceipt implements FfiConverterRustBuffer<SettlementReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettlementReceipt INSTANCE = new FfiConverterTypeSettlementReceipt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SettlementReceipt settlementReceipt) {
        return AbstractC7608F5v.A0X(settlementReceipt).mo3323allocationSizeI7RO_PI(settlementReceipt.operationId) + 1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SettlementReceipt lift(RustBuffer.ByValue byValue) {
        return (SettlementReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SettlementReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SettlementReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SettlementReceipt settlementReceipt) {
        return lower((Object) settlementReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SettlementReceipt settlementReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, settlementReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SettlementReceipt read(ByteBuffer byteBuffer) {
        return new SettlementReceipt(AbstractC7610F5x.A0k(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SettlementReceipt settlementReceipt, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(settlementReceipt, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(settlementReceipt.operationId, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(settlementReceipt.settled, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SettlementReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SettlementReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
