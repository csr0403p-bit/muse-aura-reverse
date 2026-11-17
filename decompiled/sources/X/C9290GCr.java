package X;

import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* renamed from: X.GCr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9290GCr extends AbstractC9289GCq implements C20Q, C3Em, C3pV {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object[] A04;
    public final int A05;
    public final int A06;
    public final Integer A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.HtJ<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    private final HtJ<Unit>[] A07(HtJ<Unit>[] htJArr) {
        Object[] objArr;
        GCu gCu;
        HtJ<? super Unit> htJ;
        int length = htJArr.length;
        if (super.A00 != 0 && (objArr = super.A01) != null) {
            int length2 = objArr.length;
            int i = 0;
            htJArr = htJArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (htJ = (gCu = (GCu) obj).A01) != null && A00(gCu) >= 0) {
                    int length3 = htJArr.length;
                    htJArr = htJArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) htJArr, Math.max(2, htJArr.length * 2));
                        C7384Etj.A0U(objArrCopyOf);
                        htJArr = objArrCopyOf;
                    }
                    htJArr[length] = htJ;
                    gCu.A01 = null;
                    length++;
                }
                i++;
                htJArr = htJArr;
            }
        }
        return (HtJ[]) htJArr;
    }

    @Override // X.C3Em
    public final void AbQ() {
        synchronized (this) {
            long j = this.A02;
            long jMin = Math.min(j, this.A03) + this.A00;
            A03(jMin, j, jMin, jMin + this.A01);
        }
    }

    @Override // X.C3Em, X.C20Z
    public final Object emit(T t, HtJ<? super Unit> htJ) {
        C9291GCs c9291GCs;
        if (!AhV(t)) {
            GBL gblA03 = C7Bm.A03(htJ);
            HtJ<Unit>[] htJArrA07 = AbstractC9288GCp.A00;
            synchronized (this) {
                if (A06(t)) {
                    gblA03.resumeWith(Unit.INSTANCE);
                    htJArrA07 = A07(htJArrA07);
                    c9291GCs = null;
                } else {
                    long jMin = Math.min(this.A02, this.A03);
                    int i = this.A00;
                    int i2 = this.A01;
                    c9291GCs = new C9291GCs(t, gblA03, this, jMin + i + i2);
                    A04(c9291GCs);
                    this.A01 = i2 + 1;
                    if (this.A05 == 0) {
                        htJArrA07 = A07(htJArrA07);
                    }
                }
            }
            if (c9291GCs != null) {
                GBO.A01(new GB8(c9291GCs), gblA03);
            }
            for (HtJ<Unit> htJ2 : htJArrA07) {
                if (htJ2 != null) {
                    htJ2.resumeWith(Unit.INSTANCE);
                }
            }
            Object objA0F = gblA03.A0F();
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (objA0F != enumC10460Hji) {
                objA0F = Unit.INSTANCE;
            }
            if (objA0F == enumC10460Hji) {
                return objA0F;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.AGi] */
    @Override // X.C22I
    public final List<T> getReplayCache() {
        ?? A11;
        synchronized (this) {
            long j = this.A02;
            long j2 = this.A03;
            int iMin = (int) ((Math.min(j, j2) + this.A00) - j2);
            if (iMin == 0) {
                A11 = C0881AGi.A00;
            } else {
                A11 = C60O.A11(iMin);
                Object[] objArr = this.A04;
                C7384Etj.A0X(objArr);
                for (int i = 0; i < iMin; i++) {
                    A11.add(objArr[(objArr.length - 1) & ((int) (this.A03 + i))]);
                }
            }
        }
        return A11;
    }

    private final long A00(GCu gCu) {
        long j = gCu.A00;
        long jMin = Math.min(this.A02, this.A03);
        if (j < jMin + this.A00 || (this.A05 <= 0 && j <= jMin && this.A01 != 0)) {
            return j;
        }
        return -1L;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/GCr<TT;>;LX/20Z<-TT;>;LX/HtJ<*>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ X.EnumC10460Hji A01(X.HtJ r15, X.C20Z r16, X.C9290GCr r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9290GCr.A01(X.HtJ, X.20Z, X.GCr):X.Hji");
    }

    private final void A02() {
        Object[] objArr;
        Object[] objArr2 = this.A04;
        C7384Etj.A0X(objArr2);
        long j = this.A02;
        long j2 = this.A03;
        long jMin = Math.min(j, j2);
        objArr2[(objArr2.length - 1) & ((int) jMin)] = null;
        this.A00--;
        long j3 = jMin + 1;
        if (j2 < j3) {
            this.A03 = j3;
        }
        if (j < j3) {
            if (super.A00 != 0 && (objArr = super.A01) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        GCu gCu = (GCu) obj;
                        long j4 = gCu.A00;
                        if (0 <= j4 && j4 < j3) {
                            gCu.A00 = j3;
                        }
                    }
                }
            }
            this.A02 = j3;
        }
    }

    private final void A04(Object obj) {
        Object[] objArr;
        int i = this.A00 + this.A01;
        Object[] objArr2 = this.A04;
        if (objArr2 != null) {
            int length = objArr2.length;
            if (i >= length) {
                int i2 = length * 2;
                if (i2 <= 0) {
                    throw new IllegalStateException("Buffer size overflow");
                }
                objArr = new Object[i2];
                this.A04 = objArr;
                long jMin = Math.min(this.A02, this.A03);
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = (int) (i3 + jMin);
                    objArr[(i2 - 1) & i4] = objArr2[(objArr2.length - 1) & i4];
                }
            }
            objArr2[(objArr2.length - 1) & ((int) (Math.min(this.A02, this.A03) + i))] = obj;
        }
        objArr = new Object[2];
        this.A04 = objArr;
        objArr2 = objArr;
        objArr2[(objArr2.length - 1) & ((int) (Math.min(this.A02, this.A03) + i))] = obj;
    }

    public static final void A05(C9290GCr c9290GCr) {
        if (c9290GCr.A05 == 0 && c9290GCr.A01 <= 1) {
            return;
        }
        Object[] objArr = c9290GCr.A04;
        C7384Etj.A0X(objArr);
        while (true) {
            int i = c9290GCr.A01;
            if (i <= 0) {
                return;
            }
            long jMin = Math.min(c9290GCr.A02, c9290GCr.A03);
            int i2 = c9290GCr.A00;
            int i3 = (int) ((jMin + (i2 + i)) - 1);
            int length = objArr.length - 1;
            if (objArr[length & i3] != AbstractC9294GCw.A00) {
                return;
            }
            c9290GCr.A01 = i - 1;
            objArr[length & ((int) (jMin + i2 + r0))] = null;
        }
    }

    private final boolean A06(T t) {
        if (super.A00 == 0) {
            int i = this.A06;
            if (i != 0) {
                A04(t);
                int i2 = this.A00 + 1;
                this.A00 = i2;
                if (i2 > i) {
                    A02();
                }
                this.A02 = Math.min(this.A02, this.A03) + this.A00;
            }
            return true;
        }
        int i3 = this.A00;
        int i4 = this.A05;
        if (i3 >= i4 && this.A02 <= this.A03) {
            int iIntValue = this.A07.intValue();
            if (iIntValue == 0) {
                return false;
            }
            if (iIntValue == 2) {
                return true;
            }
            if (iIntValue != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        A04(t);
        int i5 = i3 + 1;
        this.A00 = i5;
        if (i5 > i4) {
            A02();
        }
        long j = this.A02;
        long j2 = this.A03;
        long jMin = Math.min(j, j2) + this.A00;
        if (((int) (jMin - j2)) <= this.A06) {
            return true;
        }
        A03(j2 + 1, j, jMin, jMin + this.A01);
        return true;
    }

    @Override // X.AbstractC9289GCq
    public final /* bridge */ /* synthetic */ AbstractC9293GCv A0A() {
        return new GCu();
    }

    @Override // X.AbstractC9289GCq
    public final /* bridge */ /* synthetic */ AbstractC9293GCv[] A0B(int i) {
        return new GCu[i];
    }

    public final HtJ<Unit>[] A0C(long j) {
        long j2;
        Object[] objArr;
        long j3 = this.A02;
        if (j <= j3) {
            long jMin = Math.min(j3, this.A03);
            long j4 = this.A00 + jMin;
            long j5 = j4;
            int i = this.A05;
            if (i == 0 && this.A01 > 0) {
                j4++;
            }
            int i2 = super.A00;
            if (i2 != 0 && (objArr = super.A01) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        GCu gCu = (GCu) obj;
                        long j6 = gCu.A00;
                        if (0 <= j6 && j6 < j4) {
                            j4 = gCu.A00;
                        }
                    }
                }
            }
            if (j4 > j3) {
                int iMin = this.A01;
                if (i2 > 0) {
                    iMin = Math.min(iMin, i - ((int) (j5 - j4)));
                }
                HtJ<Unit>[] htJArr = AbstractC9288GCp.A00;
                long j7 = iMin + j5;
                if (iMin > 0) {
                    htJArr = new HtJ[iMin];
                    Object[] objArr2 = this.A04;
                    C7384Etj.A0X(objArr2);
                    j2 = 1;
                    long j8 = j5;
                    int i3 = 0;
                    while (j5 < j7) {
                        int length = objArr2.length - 1;
                        int i4 = length & ((int) j5);
                        Object obj2 = objArr2[i4];
                        HrH hrH = AbstractC9294GCw.A00;
                        if (obj2 != hrH) {
                            C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C9291GCs c9291GCs = (C9291GCs) obj2;
                            int i5 = i3 + 1;
                            htJArr[i3] = c9291GCs.A02;
                            objArr2[i4] = hrH;
                            objArr2[length & ((int) j8)] = c9291GCs.A01;
                            j8++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        }
                        j5++;
                    }
                    j5 = j8;
                } else {
                    j2 = 1;
                }
                long jMax = Math.max(this.A03, Math.max(jMin, j5 - this.A06));
                if (i == 0 && jMax < j7) {
                    Object[] objArr3 = this.A04;
                    C7384Etj.A0X(objArr3);
                    if (C7384Etj.areEqual(objArr3[(objArr3.length - 1) & ((int) jMax)], AbstractC9294GCw.A00)) {
                        j5 += j2;
                        jMax += j2;
                    }
                }
                if (super.A00 == 0) {
                    j4 = j5;
                }
                A03(jMax, j4, j5, j7);
                A05(this);
                return htJArr.length == 0 ? htJArr : A07(htJArr);
            }
        }
        return AbstractC9288GCp.A00;
    }

    @Override // X.C3pV
    public final C20Q ABr(Integer num, C78T c78t, int i) {
        return ((i == 0 || i == -3) && num == C79.A00) ? this : new C3pT(num, c78t, this, i);
    }

    @Override // X.C3Em
    public final boolean AhV(T t) {
        int i;
        boolean z;
        HtJ<Unit>[] htJArrA07 = AbstractC9288GCp.A00;
        synchronized (this) {
            if (A06(t)) {
                htJArrA07 = A07(htJArrA07);
                z = true;
            } else {
                z = false;
            }
        }
        for (HtJ<Unit> htJ : htJArrA07) {
            if (htJ != null) {
                htJ.resumeWith(Unit.INSTANCE);
            }
        }
        return z;
    }

    public C9290GCr(Integer num, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = num;
    }

    private final void A03(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jMin2 = Math.min(this.A02, this.A03); jMin2 < jMin; jMin2++) {
            Object[] objArr = this.A04;
            C7384Etj.A0X(objArr);
            objArr[(objArr.length - 1) & ((int) jMin2)] = null;
        }
        this.A03 = j;
        this.A02 = j2;
        this.A00 = (int) (j3 - jMin);
        this.A01 = (int) (j4 - j3);
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<?> htJ) {
        return A01(htJ, c20z, this);
    }
}
