package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.HsK;
import X.HwO;
import java.util.List;

/* loaded from: classes6.dex */
public final class VisualInputReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long acknowledgedEvents;
    public List<VisualButtonEvent> buttonEvents;
    public Double finishedMs;
    public VisualFrameGeometry frame;
    public VisualInputKind kind;
    public VisualPointerState pointerAfter;
    public List<Point> requestedPoints;
    public double startedMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualInputReceipt) {
                VisualInputReceipt visualInputReceipt = (VisualInputReceipt) obj;
                if (this.kind != visualInputReceipt.kind || !C7384Etj.areEqual(this.frame, visualInputReceipt.frame) || !C7384Etj.areEqual(this.requestedPoints, visualInputReceipt.requestedPoints) || Double.compare(this.startedMs, visualInputReceipt.startedMs) != 0 || !C7384Etj.areEqual(this.finishedMs, visualInputReceipt.finishedMs) || this.acknowledgedEvents != visualInputReceipt.acknowledgedEvents || !C7384Etj.areEqual(this.buttonEvents, visualInputReceipt.buttonEvents) || !C7384Etj.areEqual(this.pointerAfter, visualInputReceipt.pointerAfter)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setButtonEvents(List<VisualButtonEvent> list) {
        C7384Etj.A0Y(list, 0);
        this.buttonEvents = list;
    }

    public final void setKind(VisualInputKind visualInputKind) {
        C7384Etj.A0Y(visualInputKind, 0);
        this.kind = visualInputKind;
    }

    public final void setPointerAfter(VisualPointerState visualPointerState) {
        C7384Etj.A0Y(visualPointerState, 0);
        this.pointerAfter = visualPointerState;
    }

    public final void setRequestedPoints(List<Point> list) {
        C7384Etj.A0Y(list, 0);
        this.requestedPoints = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-5lwdpRA$default, reason: not valid java name */
    public static /* synthetic */ VisualInputReceipt m3837copy5lwdpRA$default(VisualInputReceipt visualInputReceipt, VisualInputKind visualInputKind, VisualFrameGeometry visualFrameGeometry, List list, double d, Double d2, long j, List list2, VisualPointerState visualPointerState, int i, Object obj) {
        if ((i & 1) != 0) {
            visualInputKind = visualInputReceipt.kind;
        }
        if ((i & 2) != 0) {
            visualFrameGeometry = visualInputReceipt.frame;
        }
        if ((i & 4) != 0) {
            list = visualInputReceipt.requestedPoints;
        }
        if ((i & 8) != 0) {
            d = visualInputReceipt.startedMs;
        }
        if ((i & 16) != 0) {
            d2 = visualInputReceipt.finishedMs;
        }
        if ((i & 32) != 0) {
            j = visualInputReceipt.acknowledgedEvents;
        }
        if ((i & 64) != 0) {
            list2 = visualInputReceipt.buttonEvents;
        }
        if ((i & 128) != 0) {
            visualPointerState = visualInputReceipt.pointerAfter;
        }
        return visualInputReceipt.m3839copy5lwdpRA(visualInputKind, visualFrameGeometry, list, d, d2, j, list2, visualPointerState);
    }

    public final VisualInputKind component1() {
        return this.kind;
    }

    public final VisualFrameGeometry component2() {
        return this.frame;
    }

    public final List<Point> component3() {
        return this.requestedPoints;
    }

    public final double component4() {
        return this.startedMs;
    }

    public final Double component5() {
        return this.finishedMs;
    }

    /* renamed from: component6-s-VKNKU, reason: not valid java name */
    public final long m3838component6sVKNKU() {
        return this.acknowledgedEvents;
    }

    public final List<VisualButtonEvent> component7() {
        return this.buttonEvents;
    }

    public final VisualPointerState component8() {
        return this.pointerAfter;
    }

    /* renamed from: getAcknowledgedEvents-s-VKNKU, reason: not valid java name */
    public final long m3840getAcknowledgedEventssVKNKU() {
        return this.acknowledgedEvents;
    }

    public final List<VisualButtonEvent> getButtonEvents() {
        return this.buttonEvents;
    }

    public final Double getFinishedMs() {
        return this.finishedMs;
    }

    public final VisualFrameGeometry getFrame() {
        return this.frame;
    }

    public final VisualInputKind getKind() {
        return this.kind;
    }

    public final VisualPointerState getPointerAfter() {
        return this.pointerAfter;
    }

    public final List<Point> getRequestedPoints() {
        return this.requestedPoints;
    }

    public final double getStartedMs() {
        return this.startedMs;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pointerAfter, AnonymousClass005.A0F(this.buttonEvents, C60R.A00(this.acknowledgedEvents, (HsK.A01(this.startedMs, AnonymousClass005.A0F(this.requestedPoints, (AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0D(this.frame)) * 31)) + C3cH.A02(this.finishedMs)) * 31)));
    }

    /* renamed from: setAcknowledgedEvents-VKZWuLQ, reason: not valid java name */
    public final void m3841setAcknowledgedEventsVKZWuLQ(long j) {
        this.acknowledgedEvents = j;
    }

    public final void setFinishedMs(Double d) {
        this.finishedMs = d;
    }

    public final void setFrame(VisualFrameGeometry visualFrameGeometry) {
        this.frame = visualFrameGeometry;
    }

    public final void setStartedMs(double d) {
        this.startedMs = d;
    }

    public String toString() {
        VisualInputKind visualInputKind = this.kind;
        VisualFrameGeometry visualFrameGeometry = this.frame;
        List<Point> list = this.requestedPoints;
        double d = this.startedMs;
        Double d2 = this.finishedMs;
        String strA00 = HwO.A00(this.acknowledgedEvents);
        List<VisualButtonEvent> list2 = this.buttonEvents;
        VisualPointerState visualPointerState = this.pointerAfter;
        StringBuilder sbA0f = C3cG.A0f(visualInputKind, "VisualInputReceipt(kind=");
        sbA0f.append(", frame=");
        sbA0f.append(visualFrameGeometry);
        sbA0f.append(", requestedPoints=");
        sbA0f.append(list);
        sbA0f.append(", startedMs=");
        sbA0f.append(d);
        sbA0f.append(", finishedMs=");
        sbA0f.append(d2);
        sbA0f.append(", acknowledgedEvents=");
        sbA0f.append(strA00);
        sbA0f.append(", buttonEvents=");
        sbA0f.append(list2);
        return C3cJ.A0L(visualPointerState, ", pointerAfter=", sbA0f);
    }

    public VisualInputReceipt(VisualInputKind visualInputKind, VisualFrameGeometry visualFrameGeometry, List<Point> list, double d, Double d2, long j, List<VisualButtonEvent> list2, VisualPointerState visualPointerState) {
        AnonymousClass003.A0v(visualInputKind, list);
        AnonymousClass003.A10(list2, visualPointerState);
        this.kind = visualInputKind;
        this.frame = visualFrameGeometry;
        this.requestedPoints = list;
        this.startedMs = d;
        this.finishedMs = d2;
        this.acknowledgedEvents = j;
        this.buttonEvents = list2;
        this.pointerAfter = visualPointerState;
    }

    /* renamed from: copy-5lwdpRA, reason: not valid java name */
    public final VisualInputReceipt m3839copy5lwdpRA(VisualInputKind visualInputKind, VisualFrameGeometry visualFrameGeometry, List<Point> list, double d, Double d2, long j, List<VisualButtonEvent> list2, VisualPointerState visualPointerState) {
        AnonymousClass003.A0v(visualInputKind, list);
        AnonymousClass003.A10(list2, visualPointerState);
        return new VisualInputReceipt(visualInputKind, visualFrameGeometry, list, d, d2, j, list2, visualPointerState);
    }

    public /* synthetic */ VisualInputReceipt(VisualInputKind visualInputKind, VisualFrameGeometry visualFrameGeometry, List list, double d, Double d2, long j, List list2, VisualPointerState visualPointerState, C06H c06h) {
        this(visualInputKind, visualFrameGeometry, list, d, d2, j, list2, visualPointerState);
    }
}
