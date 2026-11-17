package com.facebook.aura.tabs;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1DG;

/* loaded from: classes.dex */
public final class AuraTabPageDock extends C06G {
    public static final int $stable = 0;
    public final float contentAlpha;
    public final float contentInset;
    public final boolean coversDock;
    public final boolean docksPanel;
    public final float inset;
    public final boolean isResizing;
    public final boolean showsRail;
    public final float targetInset;

    public AuraTabPageDock() {
        this(0.0f, 0.0f, 0.0f, 1.0f, false, false, false, false);
    }

    /* renamed from: copy-OicGDw4$default, reason: not valid java name */
    public static /* synthetic */ AuraTabPageDock m2291copyOicGDw4$default(AuraTabPageDock auraTabPageDock, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        if ((i & 1) != 0) {
            f5 = auraTabPageDock.inset;
        }
        if ((i & 2) != 0) {
            f6 = auraTabPageDock.targetInset;
        }
        if ((i & 4) != 0) {
            f7 = auraTabPageDock.contentInset;
        }
        if ((i & 8) != 0) {
            f8 = auraTabPageDock.contentAlpha;
        }
        if ((i & 16) != 0) {
            z5 = auraTabPageDock.isResizing;
        }
        if ((i & 32) != 0) {
            z6 = auraTabPageDock.docksPanel;
        }
        if ((i & 64) != 0) {
            z7 = auraTabPageDock.showsRail;
        }
        if ((i & 128) != 0) {
            z8 = auraTabPageDock.coversDock;
        }
        return new AuraTabPageDock(f5, f6, f7, f8, z5, z6, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraTabPageDock) {
                AuraTabPageDock auraTabPageDock = (AuraTabPageDock) obj;
                if (!C1DG.A08(this.inset, auraTabPageDock.inset) || !C1DG.A08(this.targetInset, auraTabPageDock.targetInset) || !C1DG.A08(this.contentInset, auraTabPageDock.contentInset) || Float.compare(this.contentAlpha, auraTabPageDock.contentAlpha) != 0 || this.isResizing != auraTabPageDock.isResizing || this.docksPanel != auraTabPageDock.docksPanel || this.showsRail != auraTabPageDock.showsRail || this.coversDock != auraTabPageDock.coversDock) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2292component1D9Ej5fM() {
        return this.inset;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2293component2D9Ej5fM() {
        return this.targetInset;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m2294component3D9Ej5fM() {
        return this.contentInset;
    }

    public final float component4() {
        return this.contentAlpha;
    }

    public final boolean component5() {
        return this.isResizing;
    }

    public final boolean component6() {
        return this.docksPanel;
    }

    public final boolean component7() {
        return this.showsRail;
    }

    public final boolean component8() {
        return this.coversDock;
    }

    /* renamed from: copy-OicGDw4, reason: not valid java name */
    public final AuraTabPageDock m2295copyOicGDw4(float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4) {
        return new AuraTabPageDock(f, f2, f3, f4, z, z2, z3, z4);
    }

    public final float getContentAlpha() {
        return this.contentAlpha;
    }

    /* renamed from: getContentInset-D9Ej5fM, reason: not valid java name */
    public final float m2296getContentInsetD9Ej5fM() {
        return this.contentInset;
    }

    public final boolean getCoversDock() {
        return this.coversDock;
    }

    public final boolean getDocksPanel() {
        return this.docksPanel;
    }

    /* renamed from: getInset-D9Ej5fM, reason: not valid java name */
    public final float m2297getInsetD9Ej5fM() {
        return this.inset;
    }

    public final boolean getShowsRail() {
        return this.showsRail;
    }

    /* renamed from: getTargetInset-D9Ej5fM, reason: not valid java name */
    public final float m2298getTargetInsetD9Ej5fM() {
        return this.targetInset;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.inset) * 31, this.targetInset), this.contentInset), this.contentAlpha), this.isResizing), this.docksPanel), this.showsRail), this.coversDock);
    }

    public final boolean isResizing() {
        return this.isResizing;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraTabPageDock(float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, C06H c06h) {
        this(f, f2, f3, f4, z, z2, z3, z4);
    }

    public /* synthetic */ AuraTabPageDock(float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 1.0f : f4, (i & 16) != 0 ? false : z, AnonymousClass002.A1R(i, z2), (i & 64) != 0 ? false : z3, (i & 128) == 0 ? z4 : false);
    }

    public AuraTabPageDock(float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.inset = f;
        this.targetInset = f2;
        this.contentInset = f3;
        this.contentAlpha = f4;
        this.isResizing = z;
        this.docksPanel = z2;
        this.showsRail = z3;
        this.coversDock = z4;
    }
}
