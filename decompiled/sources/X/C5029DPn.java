package X;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.RegularImmutableMultiset;

/* renamed from: X.DPn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5029DPn<E> extends DOJ<E> {
    public C5034DPt<E> A00;
    public boolean A01 = false;

    public C5029DPn() {
        C5034DPt<E> c5034DPt = new C5034DPt<>();
        c5034DPt.A09(4, 1.0f);
        this.A00 = c5034DPt;
    }

    @Override // X.DOJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ImmutableMultiset<E> build() {
        if (this instanceof C5035DPu) {
            return ((C5035DPu) this).build();
        }
        this.A00.getClass();
        C5034DPt<E> c5034DPt = this.A00;
        if (c5034DPt.A02 == 0) {
            return RegularImmutableMultiset.A03;
        }
        this.A01 = true;
        return new RegularImmutableMultiset(c5034DPt);
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;I)LX/DPn<TE;>; */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[PHI: r2
  PHI (r2v2 int) = (r2v1 int), (r2v5 int) binds: [B:22:0x004e, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C5035DPu
            if (r0 == 0) goto La
            X.DPu r6 = (X.C5035DPu) r6
            r6.A05(r7, r8)
        L9:
            return
        La:
            X.DPt<E> r0 = r6.A00
            r0.getClass()
            if (r8 == 0) goto L9
            boolean r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L32
            X.DPt<E> r4 = r6.A00
            X.DPt r3 = new X.DPt
            r3.<init>()
            int r1 = r4.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A09(r1, r0)
            boolean r0 = r4 instanceof X.DQ3
            if (r0 == 0) goto L4b
            r0 = r4
            X.DQ3 r0 = (X.DQ3) r0
            int r2 = r0.A00
            r0 = -2
            if (r2 != r0) goto L51
        L30:
            r6.A00 = r3
        L32:
            r6.A01 = r5
            r7.getClass()
            X.DPt<E> r2 = r6.A00
            int r1 = r2.A04(r7)
            r0 = -1
            if (r1 != r0) goto L46
            r0 = 0
        L41:
            int r8 = r8 + r0
            r2.A05(r7, r8)
            return
        L46:
            int[] r0 = r2.A05
            r0 = r0[r1]
            goto L41
        L4b:
            int r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto L51
            goto L30
        L51:
            r0 = -1
            if (r2 == r0) goto L30
            int r0 = r4.A02
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            java.lang.Object[] r0 = r4.A07
            r1 = r0[r2]
            int r0 = r4.A02
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            int[] r0 = r4.A05
            r0 = r0[r2]
            r3.A05(r1, r0)
            int r2 = r4.A02(r2)
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5029DPn.A02(java.lang.Object, int):void");
    }

    /* JADX WARN: Incorrect return type in method signature: ([TE;)LX/DPn<TE;>; */
    public final void A03(Object... elements) {
        if (!(this instanceof C5035DPu)) {
            super.add(elements);
            return;
        }
        C5035DPu c5035DPu = (C5035DPu) this;
        for (Object obj : elements) {
            c5035DPu.A05(obj, 1);
        }
    }

    @Override // X.DOJ
    public /* bridge */ /* synthetic */ DOJ add(Object element) {
        if (this instanceof C5035DPu) {
            ((C5035DPu) this).A05(element, 1);
            return this;
        }
        A02(element, 1);
        return this;
    }

    @Override // X.DOJ
    public /* bridge */ /* synthetic */ DOJ add(Object[] elements) {
        A03(elements);
        return this;
    }
}
