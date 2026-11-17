package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeFillDiagnostics implements FfiConverterRustBuffer<FillDiagnostics> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFillDiagnostics INSTANCE = new FfiConverterTypeFillDiagnostics();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(FillDiagnostics fillDiagnostics) {
        C7384Etj.A0Y(fillDiagnostics, 0);
        return AbstractC7610F5x.A0W(fillDiagnostics.failureStage) + AbstractC7610F5x.A0V(fillDiagnostics.focusedAfter) + 1 + 1;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public FillDiagnostics read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new FillDiagnostics(FfiConverterOptionalTypeFillFailureStage.INSTANCE.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), byteBuffer.get());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ FillDiagnostics lift(RustBuffer.ByValue byValue) {
        return (FillDiagnostics) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ FillDiagnostics liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (FillDiagnostics) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(FillDiagnostics fillDiagnostics) {
        return lower((Object) fillDiagnostics);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(FillDiagnostics fillDiagnostics) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, fillDiagnostics);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(FillDiagnostics fillDiagnostics, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(fillDiagnostics, byteBuffer);
        FfiConverterOptionalTypeFillFailureStage.INSTANCE.write(fillDiagnostics.failureStage, byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(fillDiagnostics.focusedAfter, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(fillDiagnostics.directFocusUsed, byteBuffer);
        byteBuffer.put(fillDiagnostics.clearAttempts);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.FillDiagnostics, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FillDiagnostics lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
