package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes6.dex */
public final class GGX {
    /* JADX WARN: Incorrect types in method signature: (TB;LX/GGf;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(InterfaceC9369GGf interfaceC9369GGf, Object obj) throws InvalidProtocolBufferException {
        long jA0O;
        GGN ggn;
        int i;
        Object objValueOf;
        int i2;
        GGN ggn2;
        AbstractC9309GDl abstractC9309GDlA0S;
        GGQ ggq = (GGQ) interfaceC9369GGf;
        int i3 = ggq.A02;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            jA0O = GGQ.A01(ggq).A0O();
            ggn = (GGN) obj;
            i = i4 << 3;
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    GGQ.A08(ggq, 2);
                    i2 = (i4 << 3) | 2;
                    abstractC9309GDlA0S = ggq.A03.A0S();
                    ggn2 = (GGN) obj;
                } else {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            return false;
                        }
                        if (i5 != 5) {
                            throw AbstractC7608F5v.A0G();
                        }
                        GGQ.A08(ggq, 5);
                        ggn = (GGN) obj;
                        i = (i4 << 3) | 5;
                        objValueOf = Integer.valueOf(ggq.A03.A0G());
                        ggn.A01(i, objValueOf);
                        return true;
                    }
                    GGN ggn3 = new GGN();
                    int i6 = i4 << 3;
                    int i7 = i6 | 4;
                    while (interfaceC9369GGf.AFb() != Integer.MAX_VALUE && A00(interfaceC9369GGf, ggn3)) {
                    }
                    if (i7 != ggq.A02) {
                        throw AbstractC7607F5u.A0k("Protocol message end-group tag did not match expected tag.");
                    }
                    ggn3.A02 = false;
                    i2 = i6 | 3;
                    abstractC9309GDlA0S = ggn3;
                    ggn2 = (GGN) obj;
                }
                ggn2.A01(i2, abstractC9309GDlA0S);
                return true;
            }
            GGQ.A08(ggq, 1);
            jA0O = ggq.A03.A0N();
            ggn = (GGN) obj;
            i = (i4 << 3) | 1;
        }
        objValueOf = Long.valueOf(jA0O);
        ggn.A01(i, objValueOf);
        return true;
    }

    public GGX() {
    }

    public GGX(int i) {
    }
}
