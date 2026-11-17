package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualInputReceipt implements FfiConverterRustBuffer<VisualInputReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualInputReceipt INSTANCE = new FfiConverterTypeVisualInputReceipt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualInputReceipt visualInputReceipt) {
        C7384Etj.A0Y(visualInputReceipt, 0);
        return 4 + FfiConverterOptionalTypeVisualFrameGeometry.INSTANCE.mo3323allocationSizeI7RO_PI(visualInputReceipt.frame) + FfiConverterSequenceTypePoint.INSTANCE.mo3323allocationSizeI7RO_PI(visualInputReceipt.requestedPoints) + 8 + AbstractC7610F5x.A0X(visualInputReceipt.finishedMs) + 8 + FfiConverterSequenceTypeVisualButtonEvent.INSTANCE.mo3323allocationSizeI7RO_PI(visualInputReceipt.buttonEvents) + FfiConverterTypeVisualPointerState.INSTANCE.mo3323allocationSizeI7RO_PI(visualInputReceipt.pointerAfter);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualInputReceipt read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new VisualInputReceipt(FfiConverterTypeVisualInputKind.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeVisualFrameGeometry.INSTANCE.read(byteBuffer), FfiConverterSequenceTypePoint.INSTANCE.read(byteBuffer), byteBuffer.getDouble(), FfiConverterOptionalDouble.INSTANCE.read(byteBuffer), byteBuffer.getLong(), FfiConverterSequenceTypeVisualButtonEvent.INSTANCE.read(byteBuffer), FfiConverterTypeVisualPointerState.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualInputReceipt lift(RustBuffer.ByValue byValue) {
        return (VisualInputReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualInputReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualInputReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualInputReceipt visualInputReceipt) {
        return lower((Object) visualInputReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualInputReceipt visualInputReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualInputReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualInputReceipt visualInputReceipt, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualInputReceipt, byteBuffer);
        AbstractC7611F5y.A0q(visualInputReceipt.kind, byteBuffer);
        FfiConverterOptionalTypeVisualFrameGeometry.INSTANCE.write(visualInputReceipt.frame, byteBuffer);
        FfiConverterSequenceTypePoint.INSTANCE.write(visualInputReceipt.requestedPoints, byteBuffer);
        byteBuffer.putDouble(visualInputReceipt.startedMs);
        FfiConverterOptionalDouble.INSTANCE.write(visualInputReceipt.finishedMs, byteBuffer);
        byteBuffer.putLong(visualInputReceipt.acknowledgedEvents);
        FfiConverterSequenceTypeVisualButtonEvent.INSTANCE.write(visualInputReceipt.buttonEvents, byteBuffer);
        FfiConverterTypeVisualPointerState.INSTANCE.write(visualInputReceipt.pointerAfter, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualInputReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualInputReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
