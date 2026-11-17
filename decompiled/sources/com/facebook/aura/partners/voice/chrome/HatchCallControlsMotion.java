package com.facebook.aura.partners.voice.chrome;

import X.AWx;
import X.AaC;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HoC;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchCallControlsMotion {
    public static final int $stable = 8;
    public CallControlsBounds bounds;
    public Float captionReservation;
    public boolean followsHeader;
    public Float heldDefaultY;
    public boolean isDragging;
    public CallControlsBounds layoutBounds;
    public Float measuredHeight;
    public final G0V<AWx, Boolean, Unit> onPositionChanged;
    public final MutableState position$delegate;
    public long positionFraction;
    public final C3UX scope;
    public HoC settling;
    public AWx settlingTarget;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchCallControlsMotion(C3UX c3ux, long j, boolean z, CallControlsBounds callControlsBounds, G0V<? super AWx, ? super Boolean, Unit> g0v) {
        AnonymousClass005.A12(c3ux, callControlsBounds, g0v, 0);
        this.scope = c3ux;
        this.onPositionChanged = g0v;
        this.layoutBounds = callControlsBounds;
        this.bounds = callControlsBounds;
        this.positionFraction = j;
        this.followsHeader = z;
        this.position$delegate = AnonymousClass002.A0P(new AWx(m1696positionInBoundsF1C5BW0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: settle-3MmeM6k, reason: not valid java name */
    public final void m1699settle3MmeM6k(long j, boolean z) {
        AWx aWx;
        HoC hoC = this.settling;
        if (hoC == null || !hoC.isActive() || (aWx = this.settlingTarget) == null || aWx.A00 != j) {
            AnonymousClass002.A1K(this.settling);
            if (m1703getPositionF1C5BW0() != j) {
                this.settlingTarget = new AWx(j);
                this.settling = AnonymousClass001.A11(new HatchCallControlsMotion$settle$1(this, z, j, null), this.scope);
            }
        }
    }

    public final void endDrag() {
        this.isDragging = false;
        CallControlsBounds callControlsBounds = this.bounds;
        long jM1695limitForCaptionMKHz9U = m1695limitForCaptionMKHz9U(callControlsBounds.m1688constrainMKHz9U(AnonymousClass005.A0M(callControlsBounds.nearestSide(AnonymousClass001.A00(m1703getPositionF1C5BW0())), AnonymousClass001.A01(m1703getPositionF1C5BW0(), 4294967295L))));
        this.followsHeader = AnonymousClass002.A1M((jM1695limitForCaptionMKHz9U > m1694defaultPositionF1C5BW0() ? 1 : (jM1695limitForCaptionMKHz9U == m1694defaultPositionF1C5BW0() ? 0 : -1)));
        m1697savePositionk4lQ0M(jM1695limitForCaptionMKHz9U);
        m1699settle3MmeM6k(jM1695limitForCaptionMKHz9U, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void moveTo(com.facebook.aura.partners.voice.chrome.CallControlsCorner r6) {
        /*
            r5 = this;
            r4 = 0
            X.C7384Etj.A0Y(r6, r4)
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r0 = r5.bounds
            com.facebook.aura.partners.voice.chrome.CallControlsCorner r0 = r0.getDefaultCorner()
            boolean r0 = X.AnonymousClass002.A1Z(r6, r0)
            r5.followsHeader = r0
            com.facebook.aura.partners.voice.chrome.CallControlsCorner r3 = com.facebook.aura.partners.voice.chrome.CallControlsCorner.TOP_LEFT
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r3) goto L1c
            com.facebook.aura.partners.voice.chrome.CallControlsCorner r0 = com.facebook.aura.partners.voice.chrome.CallControlsCorner.BOTTOM_LEFT
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r0) goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r6 == r3) goto L23
            com.facebook.aura.partners.voice.chrome.CallControlsCorner r0 = com.facebook.aura.partners.voice.chrome.CallControlsCorner.TOP_RIGHT
            if (r6 != r0) goto L24
        L23:
            r2 = 0
        L24:
            long r0 = X.AnonymousClass005.A0J(r1, r2)
            r5.positionFraction = r0
            long r0 = r5.m1696positionInBoundsF1C5BW0()
            r5.m1697savePositionk4lQ0M(r0)
            r5.m1699settle3MmeM6k(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion.moveTo(com.facebook.aura.partners.voice.chrome.CallControlsCorner):void");
    }

    public final void updateBounds(CallControlsBounds callControlsBounds) {
        C7384Etj.A0Y(callControlsBounds, 0);
        if (C7384Etj.areEqual(this.layoutBounds, callControlsBounds)) {
            return;
        }
        this.layoutBounds = callControlsBounds;
        updateMeasuredBounds();
    }

    /* renamed from: constrain-MK-Hz9U, reason: not valid java name */
    private final long m1693constrainMKHz9U(long j) {
        return this.bounds.m1688constrainMKHz9U(j);
    }

    /* renamed from: defaultPosition-F1C5BW0, reason: not valid java name */
    private final long m1694defaultPositionF1C5BW0() {
        long jM1690getDefaultPositionF1C5BW0 = this.bounds.m1690getDefaultPositionF1C5BW0();
        Float f = this.heldDefaultY;
        if (f == null) {
            return jM1690getDefaultPositionF1C5BW0;
        }
        float fMax = Math.max(AnonymousClass001.A01(4294967295L, jM1690getDefaultPositionF1C5BW0), f.floatValue());
        float f2 = this.bounds.area.A00;
        if (fMax > f2) {
            fMax = f2;
        }
        return AnonymousClass007.A0A(AnonymousClass003.A03(jM1690getDefaultPositionF1C5BW0), fMax);
    }

    private final void keepUserPosition(CallControlsBounds callControlsBounds) {
        long jM1688constrainMKHz9U;
        if (C7384Etj.areEqual(callControlsBounds.area, this.bounds.area)) {
            jM1688constrainMKHz9U = this.bounds.m1688constrainMKHz9U(m1703getPositionF1C5BW0());
        } else {
            long jM1696positionInBoundsF1C5BW0 = m1696positionInBoundsF1C5BW0();
            CallControlsBounds callControlsBounds2 = this.bounds;
            float fA00 = AnonymousClass001.A00(jM1696positionInBoundsF1C5BW0);
            AaC aaC = callControlsBounds.area;
            float f = aaC.A02 - aaC.A01;
            AaC aaC2 = callControlsBounds2.area;
            if (f == aaC2.A02 - aaC2.A01) {
                jM1696positionInBoundsF1C5BW0 = m1703getPositionF1C5BW0();
            }
            jM1688constrainMKHz9U = callControlsBounds2.m1688constrainMKHz9U(AnonymousClass005.A0M(fA00, AnonymousClass001.A01(jM1696positionInBoundsF1C5BW0, 4294967295L)));
        }
        boolean z = true;
        if (jM1688constrainMKHz9U != m1703getPositionF1C5BW0()) {
            z = false;
            m1701snapTok4lQ0M(jM1688constrainMKHz9U);
        }
        if (C7384Etj.areEqual(callControlsBounds.area, this.bounds.area) && z) {
            return;
        }
        m1697savePositionk4lQ0M(jM1688constrainMKHz9U);
    }

    /* renamed from: limitForCaption-MK-Hz9U, reason: not valid java name */
    private final long m1695limitForCaptionMKHz9U(long j) {
        Float f = this.captionReservation;
        if (f == null) {
            return j;
        }
        return AnonymousClass007.A0A(AnonymousClass003.A03(j), Math.min(AnonymousClass001.A01(4294967295L, j), topLimitAbove(f.floatValue(), AnonymousClass003.A03(j))));
    }

    /* renamed from: positionInBounds-F1C5BW0, reason: not valid java name */
    private final long m1696positionInBoundsF1C5BW0() {
        if (this.followsHeader) {
            return m1694defaultPositionF1C5BW0();
        }
        CallControlsBounds callControlsBounds = this.bounds;
        AaC aaC = callControlsBounds.area;
        float f = aaC.A01;
        float f2 = aaC.A02 - f;
        long j = this.positionFraction;
        float fA00 = f + (f2 * AnonymousClass001.A00(j));
        float f3 = aaC.A03;
        return callControlsBounds.m1688constrainMKHz9U(AnonymousClass005.A0L(fA00, f3 + ((aaC.A00 - f3) * AnonymousClass001.A01(j, 4294967295L))));
    }

    /* renamed from: savePosition-k-4lQ0M, reason: not valid java name */
    private final void m1697savePositionk4lQ0M(long j) {
        AaC aaC = this.bounds.area;
        float f = aaC.A02;
        float f2 = aaC.A01;
        float f3 = f - f2;
        float fA00 = f3 > 0.0f ? (AnonymousClass001.A00(j) - f2) / f3 : AnonymousClass001.A00(this.positionFraction);
        float f4 = aaC.A00;
        float f5 = aaC.A03;
        float f6 = f4 - f5;
        long jA0M = AnonymousClass005.A0M(fA00, f6 > 0.0f ? (AnonymousClass001.A01(j, 4294967295L) - f5) / f6 : AnonymousClass001.A01(this.positionFraction, 4294967295L));
        this.positionFraction = jA0M;
        this.onPositionChanged.invoke(new AWx(jA0M), Boolean.valueOf(this.followsHeader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPosition-k-4lQ0M, reason: not valid java name */
    public final void m1698setPositionk4lQ0M(long j) {
        this.position$delegate.Af8(new AWx(j));
    }

    /* renamed from: snapTo-k-4lQ0M, reason: not valid java name */
    private final void m1701snapTok4lQ0M(long j) {
        AnonymousClass002.A1K(this.settling);
        m1698setPositionk4lQ0M(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateMeasuredBounds() {
        /*
            r4 = this;
            java.lang.Float r0 = r4.measuredHeight
            if (r0 == 0) goto L10
            float r1 = r0.floatValue()
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r0 = r4.layoutBounds
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r3 = r0.withControlHeight(r1)
            if (r3 != 0) goto L12
        L10:
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r3 = r4.layoutBounds
        L12:
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r0 = r4.bounds
            boolean r0 = X.C7384Etj.areEqual(r0, r3)
            if (r0 != 0) goto L2f
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r1 = r4.bounds
            r4.bounds = r3
            boolean r0 = r4.isDragging
            if (r0 == 0) goto L30
            long r1 = r4.m1703getPositionF1C5BW0()
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r0 = r4.bounds
            long r0 = r0.m1688constrainMKHz9U(r1)
            r4.m1698setPositionk4lQ0M(r0)
        L2f:
            return
        L30:
            boolean r0 = r4.followsHeader
            if (r0 == 0) goto L57
            X.AaC r0 = r1.area
            float r2 = r0.A02
            float r0 = r0.A01
            float r2 = r2 - r0
            X.AaC r0 = r3.area
            float r1 = r0.A02
            float r0 = r0.A01
            float r1 = r1 - r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L4f
            long r1 = r4.m1694defaultPositionF1C5BW0()
            r0 = 1
            r4.m1699settle3MmeM6k(r1, r0)
            return
        L4f:
            long r0 = r4.m1694defaultPositionF1C5BW0()
            r4.m1701snapTok4lQ0M(r0)
            return
        L57:
            r4.keepUserPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion.updateMeasuredBounds():void");
    }

    public final void cancel() {
        AnonymousClass002.A1K(this.settling);
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1703getPositionF1C5BW0() {
        return ((AWx) this.position$delegate.getValue()).A00;
    }

    public final void holdDefaultPosition(boolean z) {
        if (z != AnonymousClass002.A1X(this.heldDefaultY)) {
            this.heldDefaultY = z ? Float.valueOf(AnonymousClass004.A00(this.bounds.m1690getDefaultPositionF1C5BW0())) : null;
            if (z || !this.followsHeader || this.isDragging) {
                return;
            }
            m1699settle3MmeM6k(m1694defaultPositionF1C5BW0(), true);
        }
    }

    public final void reserveForCaption(Float f) {
        this.captionReservation = f;
    }

    public final void startDrag() {
        AnonymousClass002.A1K(this.settling);
        this.isDragging = true;
        this.followsHeader = false;
        m1698setPositionk4lQ0M(m1695limitForCaptionMKHz9U(m1703getPositionF1C5BW0()));
        m1697savePositionk4lQ0M(m1703getPositionF1C5BW0());
    }

    public final float topLimitAbove(float f, float f2) {
        CallControlsBounds callControlsBounds = this.bounds;
        float f3 = callControlsBounds.area.A00 - f;
        float f4 = callControlsBounds.topAlongPath(f2, f2);
        float f5 = this.bounds.area.A00;
        if (f4 > f5) {
            f4 = f5;
        }
        return f3 >= f4 ? f3 : f4;
    }

    public final void updateHeight(float f) {
        Float f2 = this.measuredHeight;
        if (f2 == null || f2.floatValue() != f) {
            this.measuredHeight = Float.valueOf(f);
            updateMeasuredBounds();
        }
    }

    /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
    public final void m1702dragByk4lQ0M(long j) {
        m1698setPositionk4lQ0M(m1695limitForCaptionMKHz9U(this.bounds.m1688constrainMKHz9U(AWx.A05(m1703getPositionF1C5BW0(), j))));
    }

    public /* synthetic */ HatchCallControlsMotion(C3UX c3ux, long j, boolean z, CallControlsBounds callControlsBounds, G0V g0v, C06H c06h) {
        this(c3ux, j, z, callControlsBounds, g0v);
    }
}
