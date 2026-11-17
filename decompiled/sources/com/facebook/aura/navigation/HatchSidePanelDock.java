package com.facebook.aura.navigation;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1DG;

/* loaded from: classes.dex */
public final class HatchSidePanelDock extends C06G {
    public static final int $stable = 0;
    public final float contentAlpha;
    public final float contentWidth;
    public final float fromWidth;
    public final boolean isDocked;
    public final float railWidth;
    public final float targetWidth;
    public final float width;

    public HatchSidePanelDock() {
        this(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: copy--i3xYJo$default, reason: not valid java name */
    public static /* synthetic */ HatchSidePanelDock m1454copyi3xYJo$default(HatchSidePanelDock hatchSidePanelDock, boolean z, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        boolean z2 = z;
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        float f11 = f5;
        float f12 = f6;
        if ((i & 1) != 0) {
            z2 = hatchSidePanelDock.isDocked;
        }
        if ((i & 2) != 0) {
            f7 = hatchSidePanelDock.width;
        }
        if ((i & 4) != 0) {
            f8 = hatchSidePanelDock.targetWidth;
        }
        if ((i & 8) != 0) {
            f9 = hatchSidePanelDock.railWidth;
        }
        if ((i & 16) != 0) {
            f10 = hatchSidePanelDock.fromWidth;
        }
        if ((i & 32) != 0) {
            f11 = hatchSidePanelDock.contentWidth;
        }
        if ((i & 64) != 0) {
            f12 = hatchSidePanelDock.contentAlpha;
        }
        return new HatchSidePanelDock(z2, f7, f8, f9, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSidePanelDock) {
                HatchSidePanelDock hatchSidePanelDock = (HatchSidePanelDock) obj;
                if (this.isDocked != hatchSidePanelDock.isDocked || !C1DG.A08(this.width, hatchSidePanelDock.width) || !C1DG.A08(this.targetWidth, hatchSidePanelDock.targetWidth) || !C1DG.A08(this.railWidth, hatchSidePanelDock.railWidth) || !C1DG.A08(this.fromWidth, hatchSidePanelDock.fromWidth) || !C1DG.A08(this.contentWidth, hatchSidePanelDock.contentWidth) || Float.compare(this.contentAlpha, hatchSidePanelDock.contentAlpha) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.isDocked;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m1455component2D9Ej5fM() {
        return this.width;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m1456component3D9Ej5fM() {
        return this.targetWidth;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m1457component4D9Ej5fM() {
        return this.railWidth;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m1458component5D9Ej5fM() {
        return this.fromWidth;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    public final float m1459component6D9Ej5fM() {
        return this.contentWidth;
    }

    public final float component7() {
        return this.contentAlpha;
    }

    /* renamed from: copy--i3xYJo, reason: not valid java name */
    public final HatchSidePanelDock m1460copyi3xYJo(boolean z, float f, float f2, float f3, float f4, float f5, float f6) {
        return new HatchSidePanelDock(z, f, f2, f3, f4, f5, f6);
    }

    public final float getContentAlpha() {
        return this.contentAlpha;
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m1461getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getFromWidth-D9Ej5fM, reason: not valid java name */
    public final float m1462getFromWidthD9Ej5fM() {
        return this.fromWidth;
    }

    public final float getPanelProgress() {
        return m1466panelProgressAt0680j_4(this.width);
    }

    /* renamed from: getRailWidth-D9Ej5fM, reason: not valid java name */
    public final float m1463getRailWidthD9Ej5fM() {
        return this.railWidth;
    }

    /* renamed from: getTargetWidth-D9Ej5fM, reason: not valid java name */
    public final float m1464getTargetWidthD9Ej5fM() {
        return this.targetWidth;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1465getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C0KA.A02(this.isDocked), this.width), this.targetWidth), this.railWidth), this.fromWidth), this.contentWidth) + Float.floatToIntBits(this.contentAlpha);
    }

    public final boolean isDocked() {
        return this.isDocked;
    }

    /* renamed from: panelProgressAt-0680j_4, reason: not valid java name */
    public final float m1466panelProgressAt0680j_4(float f) {
        float f2 = this.railWidth;
        return AnonymousClass003.A00((f - f2) / (SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH - f2));
    }

    public String toString() {
        return super.toString();
    }

    public HatchSidePanelDock(boolean z, float f, float f2, float f3, float f4, float f5, float f6) {
        this.isDocked = z;
        this.width = f;
        this.targetWidth = f2;
        this.railWidth = f3;
        this.fromWidth = f4;
        this.contentWidth = f5;
        this.contentAlpha = f6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HatchSidePanelDock(boolean z, float f, float f2, float f3, float f4, float f5, float f6, int i, C06H c06h) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        this(zA1P, f, f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? f2 : f4, (i & 32) != 0 ? f2 : f5, (i & 64) != 0 ? 1.0f : f6);
    }

    public /* synthetic */ HatchSidePanelDock(boolean z, float f, float f2, float f3, float f4, float f5, float f6, C06H c06h) {
        this(z, f, f2, f3, f4, f5, f6);
    }
}
