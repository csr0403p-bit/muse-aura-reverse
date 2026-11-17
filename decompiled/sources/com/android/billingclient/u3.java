package com.android.billingclient;

import X.C60O;
import X.C60P;
import X.FGI;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class u3 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public u3(IndexOutOfBoundsException indexOutOfBoundsException, int i, int i2, int i3) {
        StringBuilder sbA0z = C60O.A0z("Pos: ", i);
        sbA0z.append(", limit: ");
        sbA0z.append(i2);
        super(FGI.A0M("CodedOutputStream was writing to a flat byte array and ran out of space.: ", C60P.A1O(", len: ", sbA0z, i3)), indexOutOfBoundsException);
    }
}
