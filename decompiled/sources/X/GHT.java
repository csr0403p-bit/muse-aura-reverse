package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes6.dex */
public final class GHT {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(GHN ghn, Object obj, int i) throws InvalidProtocolBufferException {
        long jA0O;
        GHQ ghq;
        int i2;
        Object objValueOf;
        int i3;
        GHQ ghq2;
        AbstractC9321GEc abstractC9321GEcA0S;
        int i4 = ghn.A02;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            GHN.A06(ghn, 0);
            jA0O = ghn.A03.A0O();
            ghq = (GHQ) obj;
            i2 = i5 << 3;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        GHQ ghq3 = new GHQ();
                        int i7 = i5 << 3;
                        int i8 = i7 | 4;
                        int i9 = i + 1;
                        if (i9 >= 100) {
                            throw AbstractC7609F5w.A0c("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
                        do {
                            int iA0K = ghn.A01;
                            if (iA0K == 0) {
                                iA0K = ghn.A03.A0K();
                                ghn.A02 = iA0K;
                                if (iA0K == 0) {
                                    break;
                                }
                            } else {
                                ghn.A02 = iA0K;
                                ghn.A01 = 0;
                            }
                            if (iA0K == ghn.A00) {
                                break;
                            }
                        } while (A00(ghn, ghq3, i9));
                        if (i8 == ghn.A02) {
                            if (ghq3.A02) {
                                ghq3.A02 = false;
                            }
                            i3 = i7 | 3;
                            abstractC9321GEcA0S = ghq3;
                            ghq2 = (GHQ) obj;
                        }
                    } else {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                throw InvalidProtocolBufferException.A00();
                            }
                            GHN.A06(ghn, 5);
                            ghq = (GHQ) obj;
                            i2 = (i5 << 3) | 5;
                            objValueOf = Integer.valueOf(ghn.A03.A0G());
                            ghq.A02(i2, objValueOf);
                            return true;
                        }
                        if (i != 0) {
                            return false;
                        }
                    }
                    throw AbstractC7609F5w.A0c("Protocol message end-group tag did not match expected tag.");
                }
                GHN.A06(ghn, 2);
                i3 = (i5 << 3) | 2;
                abstractC9321GEcA0S = ghn.A03.A0S();
                ghq2 = (GHQ) obj;
                ghq2.A02(i3, abstractC9321GEcA0S);
                return true;
            }
            GHN.A06(ghn, 1);
            jA0O = ghn.A03.A0N();
            ghq = (GHQ) obj;
            i2 = (i5 << 3) | 1;
        }
        objValueOf = Long.valueOf(jA0O);
        ghq.A02(i2, objValueOf);
        return true;
    }

    public GHT() {
    }

    public GHT(int i) {
    }
}
