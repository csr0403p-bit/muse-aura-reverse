package androidx.recyclerview.widget;

import X.AbstractC8085FSq;
import X.AbstractC8091FSx;
import X.BV5;
import X.BV7;
import X.C10638I0i;
import X.C2197BAc;
import X.C2203BAi;
import X.C8097FTd;
import X.FSN;
import X.FSP;
import X.FTL;
import X.FTN;
import X.FTR;
import X.FTh;
import X.FTm;
import X.FUC;
import X.FUV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes6.dex */
public class LinearLayoutManager extends FTN implements FSN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FTL A04;
    public SavedState A05;
    public AbstractC8085FSq A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public final FTh A0D;
    public final FUC A0E;

    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10638I0i(21);
        public int A00;
        public int A01;
        public boolean A02;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0B = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0D = new FTh();
        this.A0E = new FUC();
        this.A00 = 2;
        this.A0C = new int[2];
        A0P(i);
        A1O(null);
        if (false != this.A08) {
            this.A08 = false;
            A10();
        }
    }

    public static int A0J(LinearLayoutManager linearLayoutManager, C8097FTd c8097FTd) {
        if (linearLayoutManager.A0h() == 0) {
            return 0;
        }
        linearLayoutManager.A1b();
        AbstractC8085FSq abstractC8085FSq = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0B;
        boolean z2 = !z;
        return FTm.A00(linearLayoutManager.A1a(z2), linearLayoutManager.A1Z(z2), abstractC8085FSq, linearLayoutManager, c8097FTd, z);
    }

    public static int A0K(LinearLayoutManager linearLayoutManager, C8097FTd c8097FTd) {
        if (linearLayoutManager.A0h() == 0) {
            return 0;
        }
        linearLayoutManager.A1b();
        AbstractC8085FSq abstractC8085FSq = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0B;
        boolean z2 = !z;
        return FTm.A02(linearLayoutManager.A1a(z2), linearLayoutManager.A1Z(z2), abstractC8085FSq, linearLayoutManager, c8097FTd, z, linearLayoutManager.A09);
    }

    public static int A0L(LinearLayoutManager linearLayoutManager, C8097FTd c8097FTd) {
        if (linearLayoutManager.A0h() == 0) {
            return 0;
        }
        linearLayoutManager.A1b();
        AbstractC8085FSq abstractC8085FSq = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0B;
        boolean z2 = !z;
        return FTm.A01(linearLayoutManager.A1a(z2), linearLayoutManager.A1Z(z2), abstractC8085FSq, linearLayoutManager, c8097FTd, z);
    }

    private final View A1Z(boolean z) {
        int iA0h;
        int iA0h2;
        if (this.A09) {
            iA0h = 0;
            iA0h2 = A0h();
        } else {
            iA0h = A0h() - 1;
            iA0h2 = -1;
        }
        return A0O(this, iA0h, iA0h2, z, true);
    }

    private final View A1a(boolean z) {
        int iA0h;
        int iA0h2;
        if (this.A09) {
            iA0h = A0h() - 1;
            iA0h2 = -1;
        } else {
            iA0h = 0;
            iA0h2 = A0h();
        }
        return A0O(this, iA0h, iA0h2, z, true);
    }

    @Override // X.FTN
    public void A1L(C8097FTd c8097FTd) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A0D.A00();
    }

    public final int A1Y(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130 || this.A01 != 1) {
                            }
                        } else if (this.A01 == 0) {
                            return 1;
                        }
                    } else if (this.A01 == 1) {
                        return -1;
                    }
                } else if (this.A01 == 0) {
                }
                return Integer.MIN_VALUE;
            }
            if (this.A01 != 1 && A1f()) {
                return -1;
            }
            return 1;
        }
        if (this.A01 != 1 && A1f()) {
            return 1;
        }
        return -1;
    }

    public void A1e(boolean z) {
        A1O(null);
        if (this.A0A != z) {
            this.A0A = z;
            A10();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0I(X.FTL r25, X.FTR r26, X.C8097FTd r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0I(X.FTL, X.FTR, X.FTd, boolean):int");
    }

    private final void A0P(int i) {
        if (i != 0 && i != 1) {
            throw BV5.A0Q("invalid orientation:", i);
        }
        A1O(null);
        if (i != this.A01 || this.A06 == null) {
            AbstractC8085FSq abstractC8085FSqA00 = AbstractC8085FSq.A00(this, i);
            this.A06 = abstractC8085FSqA00;
            this.A0D.A02 = abstractC8085FSqA00;
            this.A01 = i;
            A10();
        }
    }

    private void A0Q(int i, int i2) {
        this.A04.A00 = this.A06.A02() - i2;
        FTL ftl = this.A04;
        ftl.A03 = this.A09 ? -1 : 1;
        ftl.A01 = i;
        ftl.A05 = 1;
        ftl.A07 = i2;
        ftl.A08 = Integer.MIN_VALUE;
    }

    private void A0R(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A04();
        FTL ftl = this.A04;
        ftl.A01 = i;
        ftl.A03 = this.A09 ? 1 : -1;
        ftl.A05 = -1;
        ftl.A07 = i2;
        ftl.A08 = Integer.MIN_VALUE;
    }

    private void A0S(FTL ftl, FTR ftr) {
        int i;
        int i2;
        if (!ftl.A0B || ftl.A0A) {
            return;
        }
        int i3 = ftl.A08;
        int i4 = ftl.A06;
        if (ftl.A05 == -1) {
            int iA0h = A0h();
            if (i3 >= 0) {
                int iA01 = (this.A06.A01() - i3) + i4;
                if (this.A09) {
                    i = 0;
                    i2 = 0;
                    while (i2 < iA0h) {
                        View viewA0x = A0x(i2);
                        if (this.A06.A09(viewA0x) >= iA01 && this.A06.A0B(viewA0x) >= iA01) {
                            i2++;
                        }
                    }
                    return;
                }
                i = iA0h - 1;
                i2 = i;
                while (i2 >= 0) {
                    View viewA0x2 = A0x(i2);
                    if (this.A06.A09(viewA0x2) >= iA01 && this.A06.A0B(viewA0x2) >= iA01) {
                        i2--;
                    }
                }
                return;
            }
            return;
        }
        if (i3 >= 0) {
            int i5 = i3 - i4;
            int iA0h2 = A0h();
            if (this.A09) {
                i = iA0h2 - 1;
                i2 = i;
                while (i2 >= 0) {
                    View viewA0x3 = A0x(i2);
                    if (this.A06.A06(viewA0x3) <= i5 && this.A06.A0A(viewA0x3) <= i5) {
                        i2--;
                    }
                }
                return;
            }
            i = 0;
            i2 = 0;
            while (i2 < iA0h2) {
                View viewA0x4 = A0x(i2);
                if (this.A06.A06(viewA0x4) <= i5 && this.A06.A0A(viewA0x4) <= i5) {
                    i2++;
                }
            }
            return;
        }
        return;
        A0V(ftr, i, i2);
    }

    public static void A0T(LinearLayoutManager linearLayoutManager) {
        linearLayoutManager.A09 = (linearLayoutManager.A01 == 1 || !linearLayoutManager.A1f()) ? linearLayoutManager.A08 : !linearLayoutManager.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0U(androidx.recyclerview.widget.LinearLayoutManager r6, X.C8097FTd r7, int r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0U(androidx.recyclerview.widget.LinearLayoutManager, X.FTd, int, int, boolean):void");
    }

    private void A0V(FTR ftr, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewA0x = A0x(i);
                FTN.A0e(this, i);
                ftr.A09(viewA0x);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            View viewA0x2 = A0x(i2);
            FTN.A0e(this, i2);
            ftr.A09(viewA0x2);
        }
    }

    private final void A1d(C8097FTd c8097FTd, int[] iArr) {
        int height;
        if (!(this instanceof FSP)) {
            int iA05 = c8097FTd.A06 != -1 ? this.A06.A05() : 0;
            int i = 0;
            if (this.A04.A05 != -1) {
                i = iA05;
                iA05 = 0;
            }
            iArr[0] = iA05;
            iArr[1] = i;
            return;
        }
        FSP fsp = (FSP) this;
        int i2 = fsp.A00;
        MaterialCalendar materialCalendar = fsp.A01;
        RecyclerView recyclerView = materialCalendar.A02;
        if (i2 == 0) {
            iArr[0] = recyclerView.getWidth();
            height = materialCalendar.A02.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            height = materialCalendar.A02.getHeight();
        }
        iArr[1] = height;
    }

    @Override // X.FTN
    public int A0p(FTR ftr, C8097FTd c8097FTd, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A0M(ftr, c8097FTd, i);
    }

    @Override // X.FTN
    public int A0q(FTR ftr, C8097FTd c8097FTd, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A0M(ftr, c8097FTd, i);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // X.FTN
    public android.os.Parcelable A0v() {
        /*
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r4.A05
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r2 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            if (r1 == 0) goto L16
            r2.<init>()
            int r0 = r1.A01
            r2.A01 = r0
            int r0 = r1.A00
            r2.A00 = r0
            boolean r0 = r1.A02
            r2.A02 = r0
            return r2
        L16:
            r2.<init>()
            int r0 = r4.A0h()
            if (r0 <= 0) goto L4f
            r4.A1b()
            boolean r1 = r4.A07
            boolean r0 = r4.A09
            r1 = r1 ^ r0
            r2.A02 = r1
            if (r1 == 0) goto L51
            if (r0 == 0) goto L48
            r0 = 0
        L2e:
            android.view.View r3 = r4.A0x(r0)
            X.FSq r0 = r4.A06
            int r1 = r0.A02()
            X.FSq r0 = r4.A06
            int r0 = r0.A06(r3)
            int r1 = r1 - r0
            r2.A00 = r1
            int r0 = X.FTN.A0Y(r3)
        L45:
            r2.A01 = r0
            return r2
        L48:
            int r0 = r4.A0h()
            int r0 = r0 + (-1)
            goto L2e
        L4f:
            r0 = -1
            goto L45
        L51:
            if (r0 == 0) goto L73
            int r0 = r4.A0h()
            int r0 = r0 + (-1)
        L59:
            android.view.View r1 = r4.A0x(r0)
            int r0 = X.FTN.A0Y(r1)
            r2.A01 = r0
            X.FSq r0 = r4.A06
            int r1 = r0.A09(r1)
            X.FSq r0 = r4.A06
            int r0 = r0.A04()
            int r1 = r1 - r0
            r2.A00 = r1
            return r2
        L73:
            r0 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0v():android.os.Parcelable");
    }

    @Override // X.FTN
    public void A18(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A05 = savedState;
            if (this.A02 != -1) {
                savedState.A01 = -1;
            }
            A10();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x047e A[PHI: r0 r2 r3
  0x047e: PHI (r0v171 int) = (r0v164 int), (r0v178 int) binds: [B:301:0x0503, B:271:0x047c] A[DONT_GENERATE, DONT_INLINE]
  0x047e: PHI (r2v17 int) = (r2v13 int), (r2v18 int) binds: [B:301:0x0503, B:271:0x047c] A[DONT_GENERATE, DONT_INLINE]
  0x047e: PHI (r3v34 int) = (r3v30 int), (r3v35 int) binds: [B:301:0x0503, B:271:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0508 A[PHI: r2 r3
  0x0508: PHI (r2v14 int) = (r2v13 int), (r2v18 int) binds: [B:300:0x0501, B:271:0x047c] A[DONT_GENERATE, DONT_INLINE]
  0x0508: PHI (r3v31 int) = (r3v30 int), (r3v35 int) binds: [B:300:0x0501, B:271:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1J(X.FTR r22, X.C8097FTd r23) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1J(X.FTR, X.FTd):void");
    }

    @Override // X.FTN
    public final void A1O(String str) {
        if (this.A05 == null) {
            super.A1O(str);
        }
    }

    public final void A1b() {
        if (this.A04 == null) {
            this.A04 = new FTL();
        }
    }

    public void A1c(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A10();
    }

    public final boolean A1f() {
        return BV7.A1Q(super.A07.getLayoutDirection());
    }

    private final int A0M(FTR ftr, C8097FTd c8097FTd, int i) {
        if (A0h() != 0 && i != 0) {
            A1b();
            this.A04.A0B = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            A0U(this, c8097FTd, i2, iAbs, true);
            FTL ftl = this.A04;
            int iA0I = ftl.A08 + A0I(ftl, ftr, c8097FTd, false);
            if (iA0I >= 0) {
                if (iAbs > iA0I) {
                    i = i2 * iA0I;
                }
                this.A06.A0C(-i);
                this.A04.A04 = i;
                return i;
            }
        }
        return 0;
    }

    private final View A0N(int i, int i2) {
        A1b();
        if (i2 <= i && i2 >= i) {
            return A0x(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A09(A0x(i)) < this.A06.A04()) {
            i3 = 16644;
            i4 = 16388;
        }
        return (this.A01 == 0 ? super.A08 : super.A09).A00(i, i2, i3, i4);
    }

    public static final View A0O(LinearLayoutManager linearLayoutManager, int i, int i2, boolean z, boolean z2) {
        linearLayoutManager.A1b();
        int i3 = HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH;
        int i4 = HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        return (linearLayoutManager.A01 == 0 ? ((FTN) linearLayoutManager).A08 : ((FTN) linearLayoutManager).A09).A00(i, i2, i4, i3);
    }

    @Override // X.FTN
    public final View A0w(int i) {
        int iA0h = A0h();
        if (iA0h == 0) {
            return null;
        }
        int iA0Z = i - FTN.A0Z(this, 0);
        if (iA0Z >= 0 && iA0Z < iA0h) {
            View viewA0x = A0x(iA0Z);
            if (FTN.A0Y(viewA0x) == i) {
                return viewA0x;
            }
        }
        return super.A0w(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[PHI: r2
  0x0045: PHI (r2v4 android.view.View) = (r2v1 android.view.View), (r2v5 android.view.View) binds: [B:21:0x006b, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[PHI: r2
  0x006d: PHI (r2v2 android.view.View) = (r2v1 android.view.View), (r2v5 android.view.View) binds: [B:21:0x006b, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View A0y(android.view.View r6, X.FTR r7, X.C8097FTd r8, int r9) {
        /*
            r5 = this;
            A0T(r5)
            int r0 = r5.A0h()
            r4 = 0
            if (r0 == 0) goto L78
            int r3 = r5.A1Y(r9)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r2) goto L78
            r5.A1b()
            X.FSq r0 = r5.A06
            int r0 = r0.A05()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 0
            A0U(r5, r8, r3, r1, r0)
            X.FTL r1 = r5.A04
            r1.A08 = r2
            r1.A0B = r0
            r0 = 1
            r5.A0I(r1, r7, r8, r0)
            r1 = -1
            boolean r0 = r5.A09
            if (r3 != r1) goto L5e
            if (r0 == 0) goto L58
            int r0 = r5.A0h()
            int r1 = r0 + (-1)
            r0 = -1
        L3d:
            android.view.View r2 = r5.A0N(r1, r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L6d
        L45:
            int r0 = r5.A0h()
            int r0 = r0 + (-1)
        L4b:
            android.view.View r1 = r5.A0x(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L77
            if (r2 == 0) goto L78
            return r1
        L58:
            r1 = 0
            int r0 = r5.A0h()
            goto L3d
        L5e:
            if (r0 == 0) goto L6f
            r1 = 0
            int r0 = r5.A0h()
        L65:
            android.view.View r2 = r5.A0N(r1, r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L45
        L6d:
            r0 = 0
            goto L4b
        L6f:
            int r0 = r5.A0h()
            int r1 = r0 + (-1)
            r0 = -1
            goto L65
        L77:
            return r2
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0y(android.view.View, X.FTR, X.FTd, int):android.view.View");
    }

    @Override // X.FTN
    public final void A1E(AccessibilityEvent accessibilityEvent) {
        super.A1E(accessibilityEvent);
        if (A0h() > 0) {
            accessibilityEvent.setFromIndex(A1W());
            accessibilityEvent.setToIndex(A1X());
        }
    }

    @Override // X.FTN
    public void A1F(C2197BAc c2197BAc, FTR ftr, C8097FTd c8097FTd) {
        super.A1F(c2197BAc, ftr, c8097FTd);
        AbstractC8091FSx abstractC8091FSx = super.A07.A0F;
        if (abstractC8091FSx == null || abstractC8091FSx.A03() <= 0) {
            return;
        }
        c2197BAc.A05(C2203BAi.A0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A1S(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            boolean r0 = super.A1S(r6, r7)
            r4 = 1
            if (r0 != 0) goto L2f
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            r3 = 0
            if (r6 != r0) goto L43
            if (r7 == 0) goto L43
            int r0 = r5.A01
            r1 = -1
            if (r0 != r4) goto L30
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r2 = r7.getInt(r0, r1)
            if (r2 < 0) goto L43
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07
            X.FTR r1 = r0.A11
            X.FTd r0 = r0.A13
            int r0 = r5.A0o(r1, r0)
        L26:
            int r0 = X.C8j3.A0F(r0, r4, r2)
            if (r0 < 0) goto L43
            r5.A1c(r0, r3)
        L2f:
            return r4
        L30:
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r2 = r7.getInt(r0, r1)
            if (r2 < 0) goto L43
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07
            X.FTR r1 = r0.A11
            X.FTd r0 = r0.A13
            int r0 = r5.A0n(r1, r0)
            goto L26
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1S(int, android.os.Bundle):boolean");
    }

    public final int A1W() {
        View viewA0O = A0O(this, 0, A0h(), false, true);
        if (viewA0O == null) {
            return -1;
        }
        return FTN.A0Y(viewA0O);
    }

    public final int A1X() {
        View viewA0O = A0O(this, A0h() - 1, -1, false, true);
        if (viewA0O != null) {
            return FTN.A0Y(viewA0O);
        }
        return -1;
    }

    @Override // X.FSN
    public PointF A6k(int i) {
        if (A0h() == 0) {
            return null;
        }
        float f = (i < FTN.A0Z(this, 0)) != this.A09 ? -1 : 1;
        return this.A01 == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0B = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0D = new FTh();
        this.A0E = new FUC();
        this.A00 = 2;
        this.A0C = new int[2];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FUV.A00, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.getInt(10, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        A0P(i3);
        A1O(null);
        if (z != this.A08) {
            this.A08 = z;
            A10();
        }
        A1e(z2);
    }
}
