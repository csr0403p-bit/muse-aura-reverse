package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class VisualProgramFeedback {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public VisualFrameEvidence after;
    public VisualFrameEvidence before;
    public ReleaseReason evidenceUnavailable;
    public List<VisualInputReceipt> inputs;
    public List<VisualMeasurement> measurements;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualProgramFeedback) {
                VisualProgramFeedback visualProgramFeedback = (VisualProgramFeedback) obj;
                if (!C7384Etj.areEqual(this.inputs, visualProgramFeedback.inputs) || !C7384Etj.areEqual(this.measurements, visualProgramFeedback.measurements) || !C7384Etj.areEqual(this.before, visualProgramFeedback.before) || !C7384Etj.areEqual(this.after, visualProgramFeedback.after) || this.evidenceUnavailable != visualProgramFeedback.evidenceUnavailable) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setInputs(List<VisualInputReceipt> list) {
        C7384Etj.A0Y(list, 0);
        this.inputs = list;
    }

    public final void setMeasurements(List<VisualMeasurement> list) {
        C7384Etj.A0Y(list, 0);
        this.measurements = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualProgramFeedback copy$default(VisualProgramFeedback visualProgramFeedback, List list, List list2, VisualFrameEvidence visualFrameEvidence, VisualFrameEvidence visualFrameEvidence2, ReleaseReason releaseReason, int i, Object obj) {
        if ((i & 1) != 0) {
            list = visualProgramFeedback.inputs;
        }
        if ((i & 2) != 0) {
            list2 = visualProgramFeedback.measurements;
        }
        if ((i & 4) != 0) {
            visualFrameEvidence = visualProgramFeedback.before;
        }
        if ((i & 8) != 0) {
            visualFrameEvidence2 = visualProgramFeedback.after;
        }
        if ((i & 16) != 0) {
            releaseReason = visualProgramFeedback.evidenceUnavailable;
        }
        return visualProgramFeedback.copy(list, list2, visualFrameEvidence, visualFrameEvidence2, releaseReason);
    }

    public final List<VisualInputReceipt> component1() {
        return this.inputs;
    }

    public final List<VisualMeasurement> component2() {
        return this.measurements;
    }

    public final VisualFrameEvidence component3() {
        return this.before;
    }

    public final VisualFrameEvidence component4() {
        return this.after;
    }

    public final ReleaseReason component5() {
        return this.evidenceUnavailable;
    }

    public final VisualFrameEvidence getAfter() {
        return this.after;
    }

    public final VisualFrameEvidence getBefore() {
        return this.before;
    }

    public final ReleaseReason getEvidenceUnavailable() {
        return this.evidenceUnavailable;
    }

    public final List<VisualInputReceipt> getInputs() {
        return this.inputs;
    }

    public final List<VisualMeasurement> getMeasurements() {
        return this.measurements;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.measurements, AnonymousClass005.A0E(this.inputs)) + AnonymousClass006.A0D(this.before)) * 31) + AnonymousClass006.A0D(this.after)) * 31) + C3cH.A02(this.evidenceUnavailable);
    }

    public final void setAfter(VisualFrameEvidence visualFrameEvidence) {
        this.after = visualFrameEvidence;
    }

    public final void setBefore(VisualFrameEvidence visualFrameEvidence) {
        this.before = visualFrameEvidence;
    }

    public final void setEvidenceUnavailable(ReleaseReason releaseReason) {
        this.evidenceUnavailable = releaseReason;
    }

    public String toString() {
        List<VisualInputReceipt> list = this.inputs;
        List<VisualMeasurement> list2 = this.measurements;
        VisualFrameEvidence visualFrameEvidence = this.before;
        VisualFrameEvidence visualFrameEvidence2 = this.after;
        ReleaseReason releaseReason = this.evidenceUnavailable;
        StringBuilder sbA0f = C3cG.A0f(list, "VisualProgramFeedback(inputs=");
        sbA0f.append(", measurements=");
        sbA0f.append(list2);
        sbA0f.append(", before=");
        sbA0f.append(visualFrameEvidence);
        sbA0f.append(", after=");
        sbA0f.append(visualFrameEvidence2);
        return C3cJ.A0L(releaseReason, ", evidenceUnavailable=", sbA0f);
    }

    public VisualProgramFeedback(List<VisualInputReceipt> list, List<VisualMeasurement> list2, VisualFrameEvidence visualFrameEvidence, VisualFrameEvidence visualFrameEvidence2, ReleaseReason releaseReason) {
        AnonymousClass003.A0u(list, list2);
        this.inputs = list;
        this.measurements = list2;
        this.before = visualFrameEvidence;
        this.after = visualFrameEvidence2;
        this.evidenceUnavailable = releaseReason;
    }

    public final VisualProgramFeedback copy(List<VisualInputReceipt> list, List<VisualMeasurement> list2, VisualFrameEvidence visualFrameEvidence, VisualFrameEvidence visualFrameEvidence2, ReleaseReason releaseReason) {
        AnonymousClass003.A0u(list, list2);
        return new VisualProgramFeedback(list, list2, visualFrameEvidence, visualFrameEvidence2, releaseReason);
    }
}
