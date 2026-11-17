package com.facebook.aura.file.view;

import X.B6A;
import X.BFM;
import X.C06G;
import X.HDi;
import X.HxS;

/* loaded from: classes.dex */
public final class DiffColors {
    public static final int $stable = 0;
    public static final DiffColors INSTANCE = new DiffColors();

    public final long getContextText(BFM bfm, int i) {
        return C06G.A08(bfm);
    }

    public final long getHunkBackground(BFM bfm, int i) {
        long jA08 = C06G.A08(bfm);
        return HxS.A04(HDi.A0O[(int) (jA08 & 63)], B6A.A03(jA08), B6A.A02(jA08), B6A.A01(jA08), 0.05f);
    }

    public final long getHunkText(BFM bfm, int i) {
        return C06G.A08(bfm);
    }

    public final long getAddedBackground(BFM bfm, int i) {
        long j = 4281648985L << 32;
        return HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.15f);
    }

    public final long getAddedText(BFM bfm, int i) {
        long j = 4281648985L << 32;
        long j2 = B6A.A01;
        return j;
    }

    public final long getRemovedBackground(BFM bfm, int i) {
        long j = 4294916912L << 32;
        return HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.15f);
    }

    public final long getRemovedText(BFM bfm, int i) {
        long j = 4294916912L << 32;
        long j2 = B6A.A01;
        return j;
    }
}
