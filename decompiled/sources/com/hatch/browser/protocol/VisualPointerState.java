package com.hatch.browser.protocol;

import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class VisualPointerState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int buttons;
    public Point position;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualPointerState) {
                VisualPointerState visualPointerState = (VisualPointerState) obj;
                if (!C7384Etj.areEqual(this.position, visualPointerState.position) || this.buttons != visualPointerState.buttons) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
    public static /* synthetic */ VisualPointerState m3856copyQn1smSk$default(VisualPointerState visualPointerState, Point point, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            point = visualPointerState.position;
        }
        if ((i2 & 2) != 0) {
            i = visualPointerState.buttons;
        }
        return new VisualPointerState(point, i);
    }

    public final Point component1() {
        return this.position;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3857component2pVg5ArA() {
        return this.buttons;
    }

    /* renamed from: copy-Qn1smSk, reason: not valid java name */
    public final VisualPointerState m3858copyQn1smSk(Point point, int i) {
        return new VisualPointerState(point, i);
    }

    /* renamed from: getButtons-pVg5ArA, reason: not valid java name */
    public final int m3859getButtonspVg5ArA() {
        return this.buttons;
    }

    public final Point getPosition() {
        return this.position;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.position) * 31) + this.buttons;
    }

    /* renamed from: setButtons-WZ4Q5Ns, reason: not valid java name */
    public final void m3860setButtonsWZ4Q5Ns(int i) {
        this.buttons = i;
    }

    public final void setPosition(Point point) {
        this.position = point;
    }

    public String toString() {
        return C3cJ.A0N(", buttons=", String.valueOf(BV4.A03(this.buttons)), C3cG.A0f(this.position, "VisualPointerState(position="));
    }

    public VisualPointerState(Point point, int i) {
        this.position = point;
        this.buttons = i;
    }

    public /* synthetic */ VisualPointerState(Point point, int i, C06H c06h) {
        this(point, i);
    }
}
