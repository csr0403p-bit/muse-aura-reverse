package com.facebook.aura.activation.view;

import X.AEk;
import X.BRg;
import X.C7384Etj;
import X.C8j3;

/* loaded from: classes4.dex */
public abstract class AuraGridBackgroundKt {
    public static final float GRID_CELL_SIZE = 50.0f;
    public static final float GRID_LINE_ALPHA = 0.15f;
    public static final long GRID_LINE_COLOR = C8j3.A0U(4278239487L);
    public static final float GRID_LINE_WIDTH = 1.0f;

    /* renamed from: auraGridBackground-4WTKRHQ, reason: not valid java name */
    public static final BRg m123auraGridBackground4WTKRHQ(BRg bRg, long j) {
        C7384Etj.A0Y(bRg, 0);
        return AEk.A02(bRg, new AuraGridBackgroundKt$auraGridBackground$1(j));
    }
}
