package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBudget implements FfiConverterRustBuffer<Budget> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBudget INSTANCE = new FfiConverterTypeBudget();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Budget budget) {
        C7384Etj.A0Y(budget, 0);
        return 4 + AbstractC7610F5x.A0X(budget.expiresAtUnixMs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Budget lift(RustBuffer.ByValue byValue) {
        return (Budget) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Budget liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Budget) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Budget budget) {
        return lower((Object) budget);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Budget budget) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, budget);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Budget read(ByteBuffer byteBuffer) {
        return new Budget(AbstractC7609F5w.A0H(byteBuffer), FfiConverterOptionalULong.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Budget budget, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(budget, byteBuffer);
        byteBuffer.putInt(budget.remainingMs);
        FfiConverterOptionalULong.INSTANCE.write(budget.expiresAtUnixMs, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Budget, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Budget lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
