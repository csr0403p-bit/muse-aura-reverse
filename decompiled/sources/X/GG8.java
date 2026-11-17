package X;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes6.dex */
public final class GG8 {
    /* JADX WARN: Incorrect types in method signature: (TB;LX/GGK;I)Z */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(GGK ggk, Object obj, int i) throws InvalidProtocolBufferException {
        long jA0O;
        GG7 gg7;
        int i2;
        Object objValueOf;
        int i3;
        GG7 gg72;
        AbstractC9320GEb abstractC9320GEbA0S;
        GG3 gg3 = (GG3) ggk;
        int i4 = gg3.A02;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            jA0O = GG3.A03(gg3, 0).A0O();
            gg7 = (GG7) obj;
            i2 = i5 << 3;
        } else {
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = (i5 << 3) | 2;
                    abstractC9320GEbA0S = GG3.A03(gg3, 2).A0S();
                    gg72 = (GG7) obj;
                } else {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            return false;
                        }
                        if (i6 != 5) {
                            throw InvalidProtocolBufferException.A00();
                        }
                        gg7 = (GG7) obj;
                        i2 = (i5 << 3) | 5;
                        objValueOf = Integer.valueOf(GG3.A03(gg3, 5).A0G());
                        gg7.A02(i2, objValueOf);
                        return true;
                    }
                    GG7 gg73 = new GG7();
                    int i7 = i5 << 3;
                    int i8 = i7 | 4;
                    int i9 = i + 1;
                    if (i9 >= 100) {
                        throw AbstractC7609F5w.A0U("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    do {
                        int iA0K = gg3.A01;
                        if (iA0K == 0) {
                            iA0K = gg3.A03.A0K();
                            gg3.A02 = iA0K;
                            if (iA0K == 0) {
                                break;
                            }
                        } else {
                            gg3.A02 = iA0K;
                            gg3.A01 = 0;
                        }
                        if (iA0K == gg3.A00) {
                            break;
                        }
                    } while (A00(ggk, gg73, i9));
                    if (i8 != gg3.A02) {
                        throw AbstractC7609F5w.A0U("Protocol message end-group tag did not match expected tag.");
                    }
                    if (gg73.A02) {
                        gg73.A02 = false;
                    }
                    i3 = i7 | 3;
                    abstractC9320GEbA0S = gg73;
                    gg72 = (GG7) obj;
                }
                gg72.A02(i3, abstractC9320GEbA0S);
                return true;
            }
            jA0O = GG3.A03(gg3, 1).A0N();
            gg7 = (GG7) obj;
            i2 = (i5 << 3) | 1;
        }
        objValueOf = Long.valueOf(jA0O);
        gg7.A02(i2, objValueOf);
        return true;
    }

    public GG8() {
    }

    public GG8(int i) {
    }
}
