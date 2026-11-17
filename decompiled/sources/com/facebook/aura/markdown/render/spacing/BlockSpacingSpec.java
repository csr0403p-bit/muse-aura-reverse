package com.facebook.aura.markdown.render.spacing;

import X.C06H;
import X.C1DG;
import X.C8j4;
import X.FGI;

/* loaded from: classes4.dex */
public final class BlockSpacingSpec {
    public static final int $stable = 0;
    public final float marginAfter;
    public final float marginBefore;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BlockSpacingSpec) {
                BlockSpacingSpec blockSpacingSpec = (BlockSpacingSpec) obj;
                if (!C1DG.A08(this.marginBefore, blockSpacingSpec.marginBefore) || !C1DG.A08(this.marginAfter, blockSpacingSpec.marginAfter)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ BlockSpacingSpec m1433copyYgX7TsA$default(BlockSpacingSpec blockSpacingSpec, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = blockSpacingSpec.marginBefore;
        }
        if ((i & 2) != 0) {
            f2 = blockSpacingSpec.marginAfter;
        }
        return new BlockSpacingSpec(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m1434component1D9Ej5fM() {
        return this.marginBefore;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m1435component2D9Ej5fM() {
        return this.marginAfter;
    }

    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final BlockSpacingSpec m1436copyYgX7TsA(float f, float f2) {
        return new BlockSpacingSpec(f, f2);
    }

    /* renamed from: getMarginAfter-D9Ej5fM, reason: not valid java name */
    public final float m1437getMarginAfterD9Ej5fM() {
        return this.marginAfter;
    }

    /* renamed from: getMarginBefore-D9Ej5fM, reason: not valid java name */
    public final float m1438getMarginBeforeD9Ej5fM() {
        return this.marginBefore;
    }

    public int hashCode() {
        return C8j4.A06(C8j4.A04(this.marginBefore), this.marginAfter);
    }

    public String toString() {
        return FGI.A0h("BlockSpacingSpec(marginBefore=", C1DG.A05(this.marginBefore), ", marginAfter=", C1DG.A05(this.marginAfter), ")");
    }

    public /* synthetic */ BlockSpacingSpec(float f, float f2, C06H c06h) {
        this(f, f2);
    }

    public BlockSpacingSpec(float f, float f2) {
        this.marginBefore = f;
        this.marginAfter = f2;
    }
}
