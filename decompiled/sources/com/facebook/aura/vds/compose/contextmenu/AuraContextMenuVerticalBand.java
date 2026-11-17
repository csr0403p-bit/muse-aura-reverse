package com.facebook.aura.vds.compose.contextmenu;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1DG;

/* loaded from: classes.dex */
public final class AuraContextMenuVerticalBand extends C06G {
    public static final int $stable = 0;
    public final boolean alignToBottom;
    public final float bottomWindowY;
    public final float topWindowY;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraContextMenuVerticalBand) {
                AuraContextMenuVerticalBand auraContextMenuVerticalBand = (AuraContextMenuVerticalBand) obj;
                if (!C1DG.A08(this.topWindowY, auraContextMenuVerticalBand.topWindowY) || !C1DG.A08(this.bottomWindowY, auraContextMenuVerticalBand.bottomWindowY) || this.alignToBottom != auraContextMenuVerticalBand.alignToBottom) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-Md-fbLM$default, reason: not valid java name */
    public static /* synthetic */ AuraContextMenuVerticalBand m2522copyMdfbLM$default(AuraContextMenuVerticalBand auraContextMenuVerticalBand, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = auraContextMenuVerticalBand.topWindowY;
        }
        if ((i & 2) != 0) {
            f2 = auraContextMenuVerticalBand.bottomWindowY;
        }
        if ((i & 4) != 0) {
            z = auraContextMenuVerticalBand.alignToBottom;
        }
        return new AuraContextMenuVerticalBand(f, f2, z);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2523component1D9Ej5fM() {
        return this.topWindowY;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2524component2D9Ej5fM() {
        return this.bottomWindowY;
    }

    public final boolean component3() {
        return this.alignToBottom;
    }

    /* renamed from: copy-Md-fbLM, reason: not valid java name */
    public final AuraContextMenuVerticalBand m2525copyMdfbLM(float f, float f2, boolean z) {
        return new AuraContextMenuVerticalBand(f, f2, z);
    }

    public final boolean getAlignToBottom() {
        return this.alignToBottom;
    }

    /* renamed from: getBottomWindowY-D9Ej5fM, reason: not valid java name */
    public final float m2526getBottomWindowYD9Ej5fM() {
        return this.bottomWindowY;
    }

    /* renamed from: getTopWindowY-D9Ej5fM, reason: not valid java name */
    public final float m2527getTopWindowYD9Ej5fM() {
        return this.topWindowY;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(Float.floatToIntBits(this.topWindowY) * 31, this.bottomWindowY), this.alignToBottom);
    }

    public AuraContextMenuVerticalBand(float f, float f2, boolean z) {
        this.topWindowY = f;
        this.bottomWindowY = f2;
        this.alignToBottom = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraContextMenuVerticalBand(float f, float f2, boolean z, int i, C06H c06h) {
        this(f, f2, AnonymousClass005.A1O(i, z));
    }

    public /* synthetic */ AuraContextMenuVerticalBand(float f, float f2, boolean z, C06H c06h) {
        this(f, f2, z);
    }
}
