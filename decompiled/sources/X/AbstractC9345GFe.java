package X;

import androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException;

/* renamed from: X.GFe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9345GFe {
    public static void A01(GFE gfe, int i) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04((i << 3) | 2);
    }

    public static void A02(GFE gfe, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04((i << 3) | 5);
        gfe.A02(i2);
    }

    public static void A03(GFE gfe, int i, long j) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04((i << 3) | 1);
        gfe.A05(j);
    }

    public static void A04(GFE gfe, int i, long j) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04(i << 3);
        gfe.A06(j);
    }
}
