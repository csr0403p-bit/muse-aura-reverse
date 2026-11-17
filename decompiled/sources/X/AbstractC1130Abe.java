package X;

/* renamed from: X.Abe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1130Abe {
    public static final void A00(InterfaceC1129Abd interfaceC1129Abd, BFM bfm, Object obj, Object obj2, int i, int i2) {
        bfm.AgG(1439843069);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC1129Abd) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, obj);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, obj2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            ((BN2) obj).A2e(obj2, B1V.A00(bfm, new BTH(interfaceC1129Abd, obj2, i, 1), 980966366), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTU(interfaceC1129Abd, obj, obj2, i, i2, 0);
        }
    }
}
