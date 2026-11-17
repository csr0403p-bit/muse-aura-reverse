package X;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FTR {
    public int A00;
    public int A01;
    public FTs A02;
    public AbstractC8110FUa A03;
    public ArrayList<FTV> A04;
    public final ArrayList<FTV> A05;
    public final ArrayList<FTV> A06;
    public final List<FTV> A07;
    public final /* synthetic */ RecyclerView A08;

    public FTR(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList<FTV> arrayListA0h = C3cG.A0h();
        this.A05 = arrayListA0h;
        this.A04 = null;
        this.A06 = C3cG.A0h();
        this.A07 = Collections.unmodifiableList(arrayListA0h);
        this.A00 = 2;
        this.A01 = 2;
    }

    public static void A00(AbstractC8091FSx abstractC8091FSx, FTR ftr, boolean z) {
        FTs fTs = ftr.A02;
        if (fTs == null) {
            return;
        }
        Set<AbstractC8091FSx<?>> set = fTs.A02;
        set.remove(abstractC8091FSx);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<FU1> sparseArray = fTs.A01;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList<FTV> arrayList = sparseArray.get(sparseArray.keyAt(i)).A02;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                BDV.A01(AbstractC7607F5u.A0n(arrayList, i2).A0I);
            }
            i++;
        }
    }

    public static void A01(FTR ftr) {
        if (ftr.A02 == null) {
            ftr.A02 = new FTs();
            A02(ftr);
        }
    }

    public static void A02(FTR ftr) {
        RecyclerView recyclerView;
        AbstractC8091FSx<?> abstractC8091FSx;
        FTs fTs = ftr.A02;
        if (fTs == null || (abstractC8091FSx = (recyclerView = ftr.A08).A0F) == null || !recyclerView.A0W) {
            return;
        }
        fTs.A02.add(abstractC8091FSx);
    }

    public static final void A03(FTR ftr) {
        ArrayList<FTV> arrayList = ftr.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                A04(ftr, size);
            }
        }
        arrayList.clear();
        float f = RecyclerView.A1J;
        C8095FTb c8095FTb = ftr.A08.A0D;
        int[] iArr = c8095FTb.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c8095FTb.A00 = 0;
    }

    public static final void A04(FTR ftr, int i) {
        if (RecyclerView.A1I) {
            Log.d("RecyclerView", FGI.A0H("Recycling cached view at index ", i));
        }
        ArrayList<FTV> arrayList = ftr.A06;
        FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, i);
        if (RecyclerView.A1I) {
            AbstractC7610F5x.A1L(ftvA0n, "CachedViewHolder to be recycled: ", "RecyclerView");
        }
        ftr.A0E(ftvA0n, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023f A[Catch: ParsingException -> 0x0250, all -> 0x03d8, TryCatch #1 {ParsingException -> 0x0250, blocks: (B:80:0x0230, B:85:0x0243, B:86:0x024d, B:84:0x023f), top: B:182:0x0230, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0296  */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A05(X.FTV r25, int r26, int r27, long r28) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTR.A05(X.FTV, int, int, long):boolean");
    }

    public final int A06(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            C8097FTd c8097FTd = recyclerView.A13;
            if (i < c8097FTd.A00()) {
                return c8097FTd.A08 ? FTZ.A01(recyclerView.A0B, i, 0) : i;
            }
        }
        RecyclerView recyclerView2 = this.A08;
        throw BV6.A0g(FGI.A0Y("invalid position ", ". State item count is ", recyclerView2.A0j(), i, recyclerView2.A13.A00()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x023e, code lost:
    
        if (r0 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0244, code lost:
    
        if (r5.A08 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r9.A00 |= 32;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0147, code lost:
    
        r9.A00 = r1 | r9.A00;
        r9 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0365 A[EDGE_INSN: B:302:0x0365->B:221:0x0365 BREAK  A[LOOP:5: B:191:0x02e2->B:305:?]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01d1 A[EDGE_INSN: B:307:0x01d1->B:123:0x01d1 BREAK  A[LOOP:6: B:105:0x0177->B:122:0x01ce], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.FTV A07(int r23, long r24) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTR.A07(int, long):X.FTV");
    }

    public final void A08() {
        FTN ftn = this.A08.A0H;
        this.A01 = this.A00 + (ftn != null ? ftn.A02 : 0);
        ArrayList<FTV> arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.A01) {
                return;
            } else {
                A04(this, size);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9 A[EDGE_INSN: B:73:0x00a9->B:49:0x00a9 BREAK  A[LOOP:1: B:40:0x008d->B:77:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.FTV r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTR.A0C(X.FTV):void");
    }

    public final void A0D(FTV ftv) {
        (ftv.A0G ? this.A04 : this.A05).remove(ftv);
        ftv.A09 = null;
        ftv.A0G = false;
        ftv.A00 &= -33;
    }

    public final void A09(View view) {
        FTV ftvA08 = RecyclerView.A08(view);
        if (AnonymousClass002.A1L(ftvA08.A00 & 256)) {
            this.A08.removeDetachedView(view, false);
        }
        FTR ftr = ftvA08.A09;
        if (ftr != null) {
            ftr.A0D(ftvA08);
        } else {
            int i = ftvA08.A00;
            if ((i & 32) != 0) {
                ftvA08.A00 = i & (-33);
            }
        }
        A0C(ftvA08);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0G != null) {
            if ((ftvA08.A00 & 16) != 0 || ftvA08.A0I.hasTransientState()) {
                recyclerView.A0G.A05(ftvA08);
            }
        }
    }

    public final void A0A(View view) {
        ArrayList<FTV> arrayListA0h;
        FTP ftp;
        FTV ftvA08 = RecyclerView.A08(view);
        int i = ftvA08.A00;
        if ((i & 12) != 0 || (i & 2) == 0 || (ftp = this.A08.A0G) == null || ftp.A09(ftvA08, ftvA08.A00())) {
            int i2 = ftvA08.A00;
            if ((i2 & 4) != 0 && !AnonymousClass002.A1L(i2 & 8)) {
                RecyclerView recyclerView = this.A08;
                if (!recyclerView.A0F.A00) {
                    throw C60Q.A0U("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.", recyclerView.A0j());
                }
            }
            ftvA08.A09 = this;
            ftvA08.A0G = false;
            arrayListA0h = this.A05;
        } else {
            arrayListA0h = this.A04;
            if (arrayListA0h == null) {
                arrayListA0h = C3cG.A0h();
                this.A04 = arrayListA0h;
            }
            ftvA08.A09 = this;
            ftvA08.A0G = true;
        }
        arrayListA0h.add(ftvA08);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(android.view.View r11, int r12) {
        /*
            r10 = this;
            X.FTV r8 = androidx.recyclerview.widget.RecyclerView.A08(r11)
            r7 = r10
            androidx.recyclerview.widget.RecyclerView r4 = r10.A08
            if (r8 == 0) goto L6c
            X.FTZ r1 = r4.A0B
            r0 = 0
            r5 = r12
            int r6 = X.FTZ.A01(r1, r12, r0)
            if (r6 < 0) goto L53
            X.FSx r0 = r4.A0F
            int r0 = r0.A03()
            if (r6 >= r0) goto L53
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r6
            r10 = r5
            r7.A05(r8, r9, r10, r11)
            android.view.View r3 = r8.A0I
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 != 0) goto L45
            android.view.ViewGroup$LayoutParams r2 = r4.generateDefaultLayoutParams()
        L31:
            X.FTf r2 = (X.FTf) r2
            r3.setLayoutParams(r2)
        L36:
            r1 = 1
            r2.A01 = r1
            r2.A00 = r8
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L42
            r1 = 0
        L42:
            r2.A02 = r1
            return
        L45:
            boolean r0 = r4.checkLayoutParams(r2)
            if (r0 != 0) goto L50
            android.view.ViewGroup$LayoutParams r2 = r4.generateLayoutParams(r2)
            goto L31
        L50:
            X.FTf r2 = (X.FTf) r2
            goto L36
        L53:
            java.lang.String r1 = "Inconsistency detected. Invalid item position "
            java.lang.String r2 = "(offset:"
            java.lang.String r3 = ").state:"
            X.FTd r0 = r4.A13
            int r7 = r0.A00()
            java.lang.String r4 = r4.A0j()
            java.lang.String r0 = X.FGI.A0f(r1, r2, r3, r4, r5, r6, r7)
            java.lang.IndexOutOfBoundsException r0 = X.BV6.A0g(r0)
            throw r0
        L6c:
            java.lang.String r1 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            java.lang.String r0 = r4.A0j()
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTR.A0B(android.view.View, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0E(FTV ftv, boolean z) {
        RecyclerView.A0P(ftv);
        View view = ftv.A0I;
        RecyclerView recyclerView = this.A08;
        C8058FRm c8058FRm = recyclerView.A0N;
        if (c8058FRm != null) {
            C8052FRf c8052FRf = c8058FRm.A01;
            AbstractC8060FRo.A06(view, c8052FRf != null ? c8052FRf.A00.remove(view) : null);
        }
        if (z) {
            List<InterfaceC8111FUb> list = recyclerView.A1B;
            if (0 < list.size()) {
                list.get(0);
                throw BV4.A0a("onViewRecycled");
            }
            AbstractC8091FSx abstractC8091FSx = recyclerView.A0F;
            if (abstractC8091FSx != null && (abstractC8091FSx instanceof FF9)) {
                FFD ffd = (FFD) ftv;
                FES fes = ((FF9) abstractC8091FSx).A01;
                if (fes != null) {
                    FFC ffc = (FFC) ffd;
                    C7384Etj.A0Y(ffc, 0);
                    fes.A00.A07(((C7782FEm) ((FFD) ffc).A00).A01.A04);
                    ffc.A02 = false;
                    ffc.A03 = false;
                    ffc.A01 = null;
                    ffc.A00 = null;
                    ((FFD) ffc).A00 = null;
                }
                ((FFE) ffd.A0I).setMountInput(null);
                ffd.A00 = null;
            }
            if (recyclerView.A13 != null) {
                recyclerView.A16.A01(ftv);
            }
            if (RecyclerView.A1I) {
                Log.d("RecyclerView", AnonymousClass007.A0a("dispatchViewRecycled: ", ftv));
            }
        }
        ftv.A08 = null;
        ftv.A0C = null;
        A01(this);
        FTs fTs = this.A02;
        int i = ftv.A01;
        ArrayList<FTV> arrayList = FTs.A00(fTs, i).A02;
        fTs.A01.get(i);
        if (5 <= arrayList.size()) {
            BDV.A01(view);
        } else {
            if (RecyclerView.A1H && arrayList.contains(ftv)) {
                throw C60O.A0i("this scrap item already exists");
            }
            ftv.A01();
            arrayList.add(ftv);
        }
    }
}
