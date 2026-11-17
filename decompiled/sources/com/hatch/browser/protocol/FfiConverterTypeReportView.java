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
public final class FfiConverterTypeReportView implements FfiConverterRustBuffer<ReportView> {
    public static final int $stable = 0;
    public static final FfiConverterTypeReportView INSTANCE = new FfiConverterTypeReportView();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ReportView reportView) {
        C7384Etj.A0Y(reportView, 0);
        long jA0M = AbstractC7609F5w.A0M(AbstractC7609F5w.A0M(FfiConverterTypeOperationId.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.operationId) + FfiConverterTypePageReference.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.page) + FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.task), FfiConverterTypeCommandOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.outcome)), AbstractC7610F5x.A0W(reportView.progress)) + FfiConverterTypeReceiptRelease.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.receipt) + FfiConverterTypeObservationRelease.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.observation) + FfiConverterOptionalTypeSubmitContinuation.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.continuation) + FfiConverterOptionalTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.document) + FfiConverterOptionalTypePageMetadataSnapshot.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.pageMetadata) + FfiConverterOptionalTypeCaptureRelease.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.capture) + FfiConverterOptionalTypeAudioRelease.INSTANCE.mo3323allocationSizeI7RO_PI(reportView.audio) + AbstractC7610F5x.A0Y(reportView.heldPointer);
        C7384Etj.A0Y(reportView.timings, 0);
        return jA0M + 12;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ReportView read(ByteBuffer byteBuffer) {
        return new ReportView(AbstractC7610F5x.A0k(byteBuffer), new PageReference(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeCommandOutcome.INSTANCE.read(byteBuffer), FfiConverterTypeEffectDisposition.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeCommandProgress.INSTANCE.read(byteBuffer), FfiConverterTypeSettlementState.INSTANCE.read(byteBuffer), FfiConverterTypeReceiptRelease.INSTANCE.read(byteBuffer), FfiConverterTypeObservationRelease.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSubmitContinuation.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeDocumentKey.INSTANCE.read(byteBuffer), FfiConverterOptionalTypePageMetadataSnapshot.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeCaptureRelease.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeAudioRelease.INSTANCE.read(byteBuffer), FfiConverterOptionalTypePoint.INSTANCE.read(byteBuffer), FfiConverterTypeTimings.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ReportView lift(RustBuffer.ByValue byValue) {
        return (ReportView) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ReportView liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ReportView) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ReportView reportView) {
        return lower((Object) reportView);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ReportView reportView) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, reportView);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ReportView reportView, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(reportView, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(reportView.operationId, byteBuffer);
        FfiConverterTypePageReference.INSTANCE.write(reportView.page, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(reportView.task, byteBuffer);
        FfiConverterTypeCommandOutcome.INSTANCE.write(reportView.outcome, byteBuffer);
        AbstractC7611F5y.A0q(reportView.effect, byteBuffer);
        FfiConverterOptionalTypeCommandProgress.INSTANCE.write(reportView.progress, byteBuffer);
        AbstractC7611F5y.A0q(reportView.settlement, byteBuffer);
        FfiConverterTypeReceiptRelease.INSTANCE.write(reportView.receipt, byteBuffer);
        FfiConverterTypeObservationRelease.INSTANCE.write(reportView.observation, byteBuffer);
        FfiConverterOptionalTypeSubmitContinuation.INSTANCE.write(reportView.continuation, byteBuffer);
        FfiConverterOptionalTypeDocumentKey.INSTANCE.write(reportView.document, byteBuffer);
        FfiConverterOptionalTypePageMetadataSnapshot.INSTANCE.write(reportView.pageMetadata, byteBuffer);
        FfiConverterOptionalTypeCaptureRelease.INSTANCE.write(reportView.capture, byteBuffer);
        FfiConverterOptionalTypeAudioRelease.INSTANCE.write(reportView.audio, byteBuffer);
        FfiConverterOptionalTypePoint.INSTANCE.write(reportView.heldPointer, byteBuffer);
        FfiConverterTypeTimings.INSTANCE.write(reportView.timings, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ReportView, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ReportView lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
