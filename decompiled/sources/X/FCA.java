package X;

import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.List;

/* loaded from: classes6.dex */
public final class FCA {
    public final int A00;
    public final F9N A01;
    public final FA0 A02;
    public final FCH A03;
    public final FCH A04;
    public final FCF A05;

    public static boolean A02(int i) {
        return i == 1 || i == 2 || i == 3 || i == 5 || i == 6;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLjava/lang/Object;TT;TT;)Z */
    public static final boolean A03(Object obj, long j, Object obj2, Object obj3) {
        FAU fau;
        char c;
        int i = (int) (j >>> 60);
        if (!A02(i)) {
            return obj2.equals(obj3);
        }
        try {
            if (i != 1) {
                if (i == 2) {
                    if (obj2 != obj3) {
                        return F8G.A00(((FCV) obj2).A00, ((FCV) obj3).A00);
                    }
                    return true;
                }
                if (i == 3) {
                    FCL fcl = (FCL) obj2;
                    FCL fcl2 = (FCL) obj3;
                    return fcl.A00 == fcl2.A00 && fcl.A01 == fcl2.A01;
                }
                if (i == 5) {
                    throw BV4.A0a(BrowserOperationCatalogKt.VALUE);
                }
                if (i == 6) {
                    return F8G.A00(((FCP) obj2).A01, ((FCP) obj3).A01);
                }
                throw BV5.A0T("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)});
            }
            if (obj2 == obj3) {
                return true;
            }
            if (!(obj instanceof FAU) || (fau = (FAU) obj) == null) {
                throw BV4.A0U();
            }
            int i2 = fau.A00;
            FDW fdw = fau.A01;
            FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
            C7384Etj.A0U(fap);
            int i3 = fdw.A05;
            int[] subNodes = fap.getSubNodes(i3);
            C7384Etj.A0X(subNodes);
            int length = subNodes.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    int[] pluralSubNodes = fap.getPluralSubNodes(i3);
                    C7384Etj.A0X(pluralSubNodes);
                    int length2 = pluralSubNodes.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            c = 0;
                            if (BFI.A0L(FA7.A02(i3), i2)) {
                                break;
                            }
                        } else {
                            if (pluralSubNodes[i5] == i2) {
                                break;
                            }
                            i5++;
                        }
                    }
                    c = 2;
                } else {
                    if (subNodes[i4] == i2) {
                        c = 1;
                        break;
                    }
                    i4++;
                }
            }
            FCV fcv = (FCV) obj2;
            FCV fcv2 = (FCV) obj3;
            if (c == 1) {
                return fcv.A00 == fcv2.A00;
            }
            Object obj4 = fcv.A00;
            if (c != 2) {
                return C7384Etj.areEqual(obj4, fcv2.A00);
            }
            if (!(obj4 instanceof List)) {
                obj4 = null;
            }
            Object obj5 = fcv2.A00;
            return F8G.A00(obj4, obj5 instanceof List ? obj5 : null);
        } catch (Exception unused) {
            return false;
        }
    }

    public final FCA A04(FCH fch) {
        if (fch == null || fch == this.A04) {
            return this;
        }
        int i = this.A00;
        FCH fch2 = this.A03;
        return new FCA(F9N.A01, this.A02.A02, fch, fch2, this.A05, i);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(JLjava/lang/Object;Ljava/lang/Exception;)TT; */
    public static final FCJ A00(Exception exc, Object obj, long j) throws Exception {
        FAU fau;
        int i = (int) (j >>> 60);
        if (!A02(i)) {
            throw exc;
        }
        if (i == 1) {
            if (!(obj instanceof FAU) || (fau = (FAU) obj) == null) {
                throw exc;
            }
            return new FCJ(null, null, fau.A01.A06.get(fau.A00), null);
        }
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            throw exc;
        }
        throw AnonymousClass005.A0c(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c A[Catch: all -> 0x0616, TryCatch #4 {all -> 0x0616, blocks: (B:141:0x0208, B:143:0x020c, B:146:0x0213, B:144:0x020f), top: B:409:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022c A[PHI: r5 r32
  0x022c: PHI (r5v3 X.FCM) = (r5v2 X.FCM), (r5v5 X.FCM) binds: [B:151:0x0223, B:154:0x022a] A[DONT_GENERATE, DONT_INLINE]
  0x022c: PHI (r32v1 boolean) = (r32v0 boolean), (r32v3 boolean) binds: [B:151:0x0223, B:154:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0424 A[PHI: r23
  0x0424: PHI (r23v2 int) = (r23v1 int), (r23v3 int) binds: [B:260:0x03f8, B:268:0x0422] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FCM A01(X.FCA r46, X.FCM r47, java.lang.Object r48, long r49) {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCA.A01(X.FCA, X.FCM, java.lang.Object, long):X.FCM");
    }

    public final boolean A05(long j) {
        FCM fcmA00;
        FCH fch = this.A04;
        if (fch == null || ((int) (j >>> 60)) == 4 || (fcmA00 = fch.A00(j)) == null) {
            return true;
        }
        FCM fcmA002 = this.A03.A00(j);
        if (fcmA002 == null) {
            fcmA002 = A01(this, fcmA00, fcmA00.A00, j);
        }
        return !A03(fcmA00.A00, j, fcmA002.A01, fcmA00.A01);
    }

    public FCA(F9N f9n, FA3 fa3, FCH fch, FCH fch2, FCF fcf, int i) {
        this.A00 = i;
        this.A04 = fch;
        this.A03 = fch2;
        this.A05 = fcf;
        this.A01 = f9n;
        this.A02 = new FA0(fa3, this);
    }
}
