package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeFillFailureStage implements FfiConverterRustBuffer<FillFailureStage> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeFillFailureStage INSTANCE = new FfiConverterOptionalTypeFillFailureStage();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(FillFailureStage fillFailureStage, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (fillFailureStage == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            AbstractC7611F5y.A0q(fillFailureStage, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3347allocationSizeI7RO_PI(FillFailureStage fillFailureStage) {
        return AbstractC7610F5x.A0W(fillFailureStage);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ FillFailureStage lift(RustBuffer.ByValue byValue) {
        return (FillFailureStage) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ FillFailureStage liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (FillFailureStage) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(FillFailureStage fillFailureStage) {
        return lower((Object) fillFailureStage);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(FillFailureStage fillFailureStage) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, fillFailureStage);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public FillFailureStage read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeFillFailureStage.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0W(obj);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.FillFailureStage, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FillFailureStage lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
