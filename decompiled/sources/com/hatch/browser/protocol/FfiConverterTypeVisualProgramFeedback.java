package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualProgramFeedback implements FfiConverterRustBuffer<VisualProgramFeedback> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualProgramFeedback INSTANCE = new FfiConverterTypeVisualProgramFeedback();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualProgramFeedback visualProgramFeedback) {
        C7384Etj.A0Y(visualProgramFeedback, 0);
        long jMo3323allocationSizeI7RO_PI = FfiConverterSequenceTypeVisualInputReceipt.INSTANCE.mo3323allocationSizeI7RO_PI(visualProgramFeedback.inputs) + FfiConverterSequenceTypeVisualMeasurement.INSTANCE.mo3323allocationSizeI7RO_PI(visualProgramFeedback.measurements);
        FfiConverterOptionalTypeVisualFrameEvidence ffiConverterOptionalTypeVisualFrameEvidence = FfiConverterOptionalTypeVisualFrameEvidence.INSTANCE;
        return jMo3323allocationSizeI7RO_PI + ffiConverterOptionalTypeVisualFrameEvidence.mo3323allocationSizeI7RO_PI(visualProgramFeedback.before) + ffiConverterOptionalTypeVisualFrameEvidence.mo3323allocationSizeI7RO_PI(visualProgramFeedback.after) + AbstractC7610F5x.A0W(visualProgramFeedback.evidenceUnavailable);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualProgramFeedback read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        List<VisualInputReceipt> list = FfiConverterSequenceTypeVisualInputReceipt.INSTANCE.read(byteBuffer);
        List<VisualMeasurement> list2 = FfiConverterSequenceTypeVisualMeasurement.INSTANCE.read(byteBuffer);
        FfiConverterOptionalTypeVisualFrameEvidence ffiConverterOptionalTypeVisualFrameEvidence = FfiConverterOptionalTypeVisualFrameEvidence.INSTANCE;
        return new VisualProgramFeedback(list, list2, ffiConverterOptionalTypeVisualFrameEvidence.read(byteBuffer), ffiConverterOptionalTypeVisualFrameEvidence.read(byteBuffer), FfiConverterOptionalTypeReleaseReason.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualProgramFeedback lift(RustBuffer.ByValue byValue) {
        return (VisualProgramFeedback) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualProgramFeedback liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualProgramFeedback) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualProgramFeedback visualProgramFeedback) {
        return lower((Object) visualProgramFeedback);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualProgramFeedback visualProgramFeedback) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualProgramFeedback);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualProgramFeedback visualProgramFeedback, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualProgramFeedback, byteBuffer);
        FfiConverterSequenceTypeVisualInputReceipt.INSTANCE.write(visualProgramFeedback.inputs, byteBuffer);
        FfiConverterSequenceTypeVisualMeasurement.INSTANCE.write(visualProgramFeedback.measurements, byteBuffer);
        FfiConverterOptionalTypeVisualFrameEvidence ffiConverterOptionalTypeVisualFrameEvidence = FfiConverterOptionalTypeVisualFrameEvidence.INSTANCE;
        ffiConverterOptionalTypeVisualFrameEvidence.write(visualProgramFeedback.before, byteBuffer);
        ffiConverterOptionalTypeVisualFrameEvidence.write(visualProgramFeedback.after, byteBuffer);
        FfiConverterOptionalTypeReleaseReason.INSTANCE.write(visualProgramFeedback.evidenceUnavailable, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualProgramFeedback, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualProgramFeedback lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
