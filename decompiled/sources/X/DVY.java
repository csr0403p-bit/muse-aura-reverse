package X;

import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;
import com.facebook.thrift.TException;
import com.facebook.thrift.protocol.TProtocolException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DVY {
    public final DKJ A00;
    public final DVX A01;
    public final GeneratedHyperThriftClassLookup A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:5:0x001d, B:8:0x0023, B:10:0x002a, B:11:0x0031, B:14:0x0057), top: B:250:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.hyperthrift.HyperThriftBase A00(X.DVY r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVY.A00(X.DVY, java.lang.String):com.facebook.hyperthrift.HyperThriftBase");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        if (r9 == 8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
    
        if (r9 != 11) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object A01(X.C5084DVd r8, byte r9) throws com.facebook.hyperthrift.HyperThriftReader$TypeMismatchException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVY.A01(X.DVd, byte):java.lang.Object");
    }

    public static void A02(DVX dvx, byte b, int i) throws IOException {
        DVX dvx2;
        C5090DVl c5090DVl;
        byte[] bArr;
        int i2;
        if (i <= 0) {
            throw new TException("Maximum skip depth exceeded");
        }
        if (b != 2) {
            dvx2 = dvx;
            if (b != 3) {
                if (b == 4) {
                    if (dvx instanceof DVZ) {
                        DVZ dvz = (DVZ) dvx;
                        c5090DVl = ((DVX) dvz).A00;
                        bArr = dvz.A04;
                        i2 = 8;
                        c5090DVl.A00(bArr, i2);
                        return;
                    }
                    dvx.A0F();
                    return;
                }
                if (b == 6) {
                    dvx.A0D();
                    return;
                }
                if (b != 8) {
                    if (b != 19) {
                        int i3 = 0;
                        switch (b) {
                            case 10:
                                dvx.A0F();
                                return;
                            case 11:
                                dvx.A0A();
                                return;
                            case 12:
                                dvx.A0M();
                                while (true) {
                                    byte b2 = dvx.A0G().A00;
                                    if (b2 == 0) {
                                        dvx.A0N();
                                        return;
                                    }
                                    A02(dvx, b2, i - 1);
                                }
                            case 13:
                                C5085DVe c5085DVeA0C = dvx.A0C();
                                while (true) {
                                    int i4 = c5085DVeA0C.A02;
                                    if (i4 < 0) {
                                        throw new TException("Peeking into a map not supported, likely because it's sized");
                                    }
                                    if (i3 >= i4) {
                                        return;
                                    }
                                    int i5 = i - 1;
                                    A02(dvx, c5085DVeA0C.A00, i5);
                                    A02(dvx, c5085DVeA0C.A01, i5);
                                    i3++;
                                }
                            case 14:
                                C5087DVh c5087DVhA06 = dvx.A06();
                                while (true) {
                                    int i6 = c5087DVhA06.A01;
                                    if (i6 < 0) {
                                        throw new TException("Peeking into a set not supported, likely because it's sized");
                                    }
                                    if (i3 >= i6) {
                                        return;
                                    }
                                    A02(dvx, c5087DVhA06.A00, i - 1);
                                    i3++;
                                }
                            case 15:
                                C5086DVg c5086DVgA0H = dvx.A0H();
                                while (true) {
                                    int i7 = c5086DVgA0H.A01;
                                    if (i7 < 0) {
                                        throw new TException("Peeking into a list not supported, likely because it's sized");
                                    }
                                    if (i3 >= i7) {
                                        return;
                                    }
                                    A02(dvx, c5086DVgA0H.A00, i - 1);
                                    i3++;
                                }
                            default:
                                TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Invalid type encountered during skipping: ", b));
                                tProtocolException.type_ = 1;
                                throw tProtocolException;
                        }
                    } else if (dvx instanceof DVZ) {
                        DVZ dvz2 = (DVZ) dvx;
                        c5090DVl = ((DVX) dvz2).A00;
                        bArr = dvz2.A04;
                        i2 = 4;
                        c5090DVl.A00(bArr, i2);
                        return;
                    }
                }
                dvx.A0B();
                return;
            }
        } else {
            boolean z = dvx instanceof DVZ;
            dvx2 = dvx;
            if (z) {
                DVZ dvz3 = (DVZ) dvx;
                Boolean bool = dvz3.A01;
                dvx2 = dvz3;
                if (bool != null) {
                    dvz3.A01 = null;
                    return;
                }
            }
        }
        dvx2.A0E();
    }

    public DVY(DKJ dkj, GeneratedHyperThriftClassLookup generatedHyperThriftClassLookup, DVX dvx) {
        this.A02 = generatedHyperThriftClassLookup;
        this.A00 = dkj;
        this.A01 = dvx;
    }
}
