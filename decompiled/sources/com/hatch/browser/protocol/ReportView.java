package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C8j2;

/* loaded from: classes6.dex */
public final class ReportView {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public AudioRelease audio;
    public CaptureRelease capture;
    public SubmitContinuation continuation;
    public DocumentKey document;
    public EffectDisposition effect;
    public Point heldPointer;
    public ObservationRelease observation;
    public OperationId operationId;
    public CommandOutcome outcome;
    public PageReference page;
    public PageMetadataSnapshot pageMetadata;
    public CommandProgress progress;
    public ReceiptRelease receipt;
    public SettlementState settlement;
    public BrowserTaskBinding task;
    public Timings timings;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReportView) {
                ReportView reportView = (ReportView) obj;
                if (!C7384Etj.areEqual(this.operationId, reportView.operationId) || !C7384Etj.areEqual(this.page, reportView.page) || !C7384Etj.areEqual(this.task, reportView.task) || !C7384Etj.areEqual(this.outcome, reportView.outcome) || this.effect != reportView.effect || this.progress != reportView.progress || this.settlement != reportView.settlement || !C7384Etj.areEqual(this.receipt, reportView.receipt) || !C7384Etj.areEqual(this.observation, reportView.observation) || !C7384Etj.areEqual(this.continuation, reportView.continuation) || !C7384Etj.areEqual(this.document, reportView.document) || !C7384Etj.areEqual(this.pageMetadata, reportView.pageMetadata) || !C7384Etj.areEqual(this.capture, reportView.capture) || !C7384Etj.areEqual(this.audio, reportView.audio) || !C7384Etj.areEqual(this.heldPointer, reportView.heldPointer) || !C7384Etj.areEqual(this.timings, reportView.timings)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setEffect(EffectDisposition effectDisposition) {
        C7384Etj.A0Y(effectDisposition, 0);
        this.effect = effectDisposition;
    }

    public final void setObservation(ObservationRelease observationRelease) {
        C7384Etj.A0Y(observationRelease, 0);
        this.observation = observationRelease;
    }

    public final void setOperationId(OperationId operationId) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
    }

    public final void setOutcome(CommandOutcome commandOutcome) {
        C7384Etj.A0Y(commandOutcome, 0);
        this.outcome = commandOutcome;
    }

    public final void setPage(PageReference pageReference) {
        C7384Etj.A0Y(pageReference, 0);
        this.page = pageReference;
    }

    public final void setReceipt(ReceiptRelease receiptRelease) {
        C7384Etj.A0Y(receiptRelease, 0);
        this.receipt = receiptRelease;
    }

    public final void setSettlement(SettlementState settlementState) {
        C7384Etj.A0Y(settlementState, 0);
        this.settlement = settlementState;
    }

    public final void setTask(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
    }

    public final void setTimings(Timings timings) {
        C7384Etj.A0Y(timings, 0);
        this.timings = timings;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final SubmitContinuation component10() {
        return this.continuation;
    }

    public final DocumentKey component11() {
        return this.document;
    }

    public final PageMetadataSnapshot component12() {
        return this.pageMetadata;
    }

    public final CaptureRelease component13() {
        return this.capture;
    }

    public final AudioRelease component14() {
        return this.audio;
    }

    public final Point component15() {
        return this.heldPointer;
    }

    public final Timings component16() {
        return this.timings;
    }

    public final PageReference component2() {
        return this.page;
    }

    public final BrowserTaskBinding component3() {
        return this.task;
    }

    public final CommandOutcome component4() {
        return this.outcome;
    }

    public final EffectDisposition component5() {
        return this.effect;
    }

    public final CommandProgress component6() {
        return this.progress;
    }

    public final SettlementState component7() {
        return this.settlement;
    }

    public final ReceiptRelease component8() {
        return this.receipt;
    }

    public final ObservationRelease component9() {
        return this.observation;
    }

    public final AudioRelease getAudio() {
        return this.audio;
    }

    public final CaptureRelease getCapture() {
        return this.capture;
    }

    public final SubmitContinuation getContinuation() {
        return this.continuation;
    }

    public final DocumentKey getDocument() {
        return this.document;
    }

    public final EffectDisposition getEffect() {
        return this.effect;
    }

    public final Point getHeldPointer() {
        return this.heldPointer;
    }

    public final ObservationRelease getObservation() {
        return this.observation;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final CommandOutcome getOutcome() {
        return this.outcome;
    }

    public final PageReference getPage() {
        return this.page;
    }

    public final PageMetadataSnapshot getPageMetadata() {
        return this.pageMetadata;
    }

    public final CommandProgress getProgress() {
        return this.progress;
    }

    public final ReceiptRelease getReceipt() {
        return this.receipt;
    }

    public final SettlementState getSettlement() {
        return this.settlement;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public final Timings getTimings() {
        return this.timings;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.timings, (((((((((((AnonymousClass005.A0F(this.observation, AnonymousClass005.A0F(this.receipt, AnonymousClass005.A0F(this.settlement, (AnonymousClass005.A0F(this.effect, AnonymousClass005.A0F(this.outcome, AnonymousClass005.A0F(this.task, AnonymousClass005.A0F(this.page, AnonymousClass005.A0E(this.operationId))))) + AnonymousClass006.A0D(this.progress)) * 31))) + AnonymousClass006.A0D(this.continuation)) * 31) + AnonymousClass006.A0D(this.document)) * 31) + AnonymousClass006.A0D(this.pageMetadata)) * 31) + AnonymousClass006.A0D(this.capture)) * 31) + AnonymousClass006.A0D(this.audio)) * 31) + C3cH.A02(this.heldPointer)) * 31);
    }

    public final void setAudio(AudioRelease audioRelease) {
        this.audio = audioRelease;
    }

    public final void setCapture(CaptureRelease captureRelease) {
        this.capture = captureRelease;
    }

    public final void setContinuation(SubmitContinuation submitContinuation) {
        this.continuation = submitContinuation;
    }

    public final void setDocument(DocumentKey documentKey) {
        this.document = documentKey;
    }

    public final void setHeldPointer(Point point) {
        this.heldPointer = point;
    }

    public final void setPageMetadata(PageMetadataSnapshot pageMetadataSnapshot) {
        this.pageMetadata = pageMetadataSnapshot;
    }

    public final void setProgress(CommandProgress commandProgress) {
        this.progress = commandProgress;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageReference pageReference = this.page;
        BrowserTaskBinding browserTaskBinding = this.task;
        CommandOutcome commandOutcome = this.outcome;
        EffectDisposition effectDisposition = this.effect;
        CommandProgress commandProgress = this.progress;
        SettlementState settlementState = this.settlement;
        ReceiptRelease receiptRelease = this.receipt;
        ObservationRelease observationRelease = this.observation;
        SubmitContinuation submitContinuation = this.continuation;
        DocumentKey documentKey = this.document;
        PageMetadataSnapshot pageMetadataSnapshot = this.pageMetadata;
        CaptureRelease captureRelease = this.capture;
        AudioRelease audioRelease = this.audio;
        Point point = this.heldPointer;
        Timings timings = this.timings;
        StringBuilder sbA0f = C3cG.A0f(operationId, "ReportView(operationId=");
        sbA0f.append(", page=");
        sbA0f.append(pageReference);
        sbA0f.append(", task=");
        sbA0f.append(browserTaskBinding);
        sbA0f.append(", outcome=");
        sbA0f.append(commandOutcome);
        sbA0f.append(", effect=");
        sbA0f.append(effectDisposition);
        sbA0f.append(C8j2.A00(4));
        sbA0f.append(commandProgress);
        sbA0f.append(", settlement=");
        sbA0f.append(settlementState);
        sbA0f.append(", receipt=");
        sbA0f.append(receiptRelease);
        sbA0f.append(C8j2.A00(37));
        sbA0f.append(observationRelease);
        sbA0f.append(C8j2.A00(28));
        sbA0f.append(submitContinuation);
        sbA0f.append(", document=");
        sbA0f.append(documentKey);
        sbA0f.append(", pageMetadata=");
        sbA0f.append(pageMetadataSnapshot);
        sbA0f.append(", capture=");
        sbA0f.append(captureRelease);
        sbA0f.append(", audio=");
        sbA0f.append(audioRelease);
        sbA0f.append(", heldPointer=");
        sbA0f.append(point);
        return C3cJ.A0L(timings, ", timings=", sbA0f);
    }

    public ReportView(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, CommandOutcome commandOutcome, EffectDisposition effectDisposition, CommandProgress commandProgress, SettlementState settlementState, ReceiptRelease receiptRelease, ObservationRelease observationRelease, SubmitContinuation submitContinuation, DocumentKey documentKey, PageMetadataSnapshot pageMetadataSnapshot, CaptureRelease captureRelease, AudioRelease audioRelease, Point point, Timings timings) {
        AnonymousClass005.A17(operationId, pageReference, browserTaskBinding, commandOutcome, effectDisposition);
        AnonymousClass005.A13(settlementState, receiptRelease, observationRelease, 6);
        C7384Etj.A0Y(timings, 15);
        this.operationId = operationId;
        this.page = pageReference;
        this.task = browserTaskBinding;
        this.outcome = commandOutcome;
        this.effect = effectDisposition;
        this.progress = commandProgress;
        this.settlement = settlementState;
        this.receipt = receiptRelease;
        this.observation = observationRelease;
        this.continuation = submitContinuation;
        this.document = documentKey;
        this.pageMetadata = pageMetadataSnapshot;
        this.capture = captureRelease;
        this.audio = audioRelease;
        this.heldPointer = point;
        this.timings = timings;
    }

    public final ReportView copy(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, CommandOutcome commandOutcome, EffectDisposition effectDisposition, CommandProgress commandProgress, SettlementState settlementState, ReceiptRelease receiptRelease, ObservationRelease observationRelease, SubmitContinuation submitContinuation, DocumentKey documentKey, PageMetadataSnapshot pageMetadataSnapshot, CaptureRelease captureRelease, AudioRelease audioRelease, Point point, Timings timings) {
        AnonymousClass005.A17(operationId, pageReference, browserTaskBinding, commandOutcome, effectDisposition);
        AnonymousClass005.A13(settlementState, receiptRelease, observationRelease, 6);
        C7384Etj.A0Y(timings, 15);
        return new ReportView(operationId, pageReference, browserTaskBinding, commandOutcome, effectDisposition, commandProgress, settlementState, receiptRelease, observationRelease, submitContinuation, documentKey, pageMetadataSnapshot, captureRelease, audioRelease, point, timings);
    }

    public static /* synthetic */ ReportView copy$default(ReportView reportView, OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, CommandOutcome commandOutcome, EffectDisposition effectDisposition, CommandProgress commandProgress, SettlementState settlementState, ReceiptRelease receiptRelease, ObservationRelease observationRelease, SubmitContinuation submitContinuation, DocumentKey documentKey, PageMetadataSnapshot pageMetadataSnapshot, CaptureRelease captureRelease, AudioRelease audioRelease, Point point, Timings timings, int i, Object obj) {
        OperationId operationId2 = operationId;
        PageReference pageReference2 = pageReference;
        BrowserTaskBinding browserTaskBinding2 = browserTaskBinding;
        CommandOutcome commandOutcome2 = commandOutcome;
        EffectDisposition effectDisposition2 = effectDisposition;
        CommandProgress commandProgress2 = commandProgress;
        SettlementState settlementState2 = settlementState;
        ReceiptRelease receiptRelease2 = receiptRelease;
        ObservationRelease observationRelease2 = observationRelease;
        SubmitContinuation submitContinuation2 = submitContinuation;
        DocumentKey documentKey2 = documentKey;
        PageMetadataSnapshot pageMetadataSnapshot2 = pageMetadataSnapshot;
        CaptureRelease captureRelease2 = captureRelease;
        AudioRelease audioRelease2 = audioRelease;
        Point point2 = point;
        Timings timings2 = timings;
        if ((i & 1) != 0) {
            operationId2 = reportView.operationId;
        }
        if ((i & 2) != 0) {
            pageReference2 = reportView.page;
        }
        if ((i & 4) != 0) {
            browserTaskBinding2 = reportView.task;
        }
        if ((i & 8) != 0) {
            commandOutcome2 = reportView.outcome;
        }
        if ((i & 16) != 0) {
            effectDisposition2 = reportView.effect;
        }
        if ((i & 32) != 0) {
            commandProgress2 = reportView.progress;
        }
        if ((i & 64) != 0) {
            settlementState2 = reportView.settlement;
        }
        if ((i & 128) != 0) {
            receiptRelease2 = reportView.receipt;
        }
        if ((i & 256) != 0) {
            observationRelease2 = reportView.observation;
        }
        if ((i & 512) != 0) {
            submitContinuation2 = reportView.continuation;
        }
        if ((i & 1024) != 0) {
            documentKey2 = reportView.document;
        }
        if ((i & 2048) != 0) {
            pageMetadataSnapshot2 = reportView.pageMetadata;
        }
        if ((i & 4096) != 0) {
            captureRelease2 = reportView.capture;
        }
        if ((i & 8192) != 0) {
            audioRelease2 = reportView.audio;
        }
        if ((i & 16384) != 0) {
            point2 = reportView.heldPointer;
        }
        if ((i & 32768) != 0) {
            timings2 = reportView.timings;
        }
        CommandOutcome commandOutcome3 = commandOutcome2;
        return reportView.copy(operationId2, pageReference2, browserTaskBinding2, commandOutcome3, effectDisposition2, commandProgress2, settlementState2, receiptRelease2, observationRelease2, submitContinuation2, documentKey2, pageMetadataSnapshot2, captureRelease2, audioRelease2, point2, timings2);
    }
}
