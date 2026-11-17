package com.facebook.aura.vds.compose.typegroup;

import X.BFM;
import X.C06G;

/* loaded from: classes.dex */
public final class AuraHeadlineAndBodyDefaults {
    public static final int $stable = 0;
    public static final AuraHeadlineAndBodyDefaults INSTANCE = new AuraHeadlineAndBodyDefaults();

    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final AuraHeadlineAndBodyColors m3095colorsdgg9oW8(long j, long j2, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = C06G.A0C(bfm);
        }
        if ((i2 & 2) != 0) {
            j2 = C06G.A08(bfm);
        }
        return new AuraHeadlineAndBodyColors(j, j2);
    }
}
