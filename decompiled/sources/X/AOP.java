package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public final class AOP<S> {
    public long A00;
    public final AOP<?> A01;
    public final AOH<S> A02;
    public final C00s A03;
    public final C00s A04;
    public final MutableState A05;
    public final MutableState A06;
    public final MutableState A07;
    public final MutableState A08;
    public final C1BO A09;
    public final SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> A0A;
    public final SnapshotStateList<AOP<?>> A0B;
    public final String A0C;

    public static final long A00(AOP aop) {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = aop.A0A;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((AOQ) snapshotStateList.get(i)).A08.AHH());
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = aop.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, A00((AOP) snapshotStateList2.get(i2)));
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v6, types: [V extends X.AOd, X.AOd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AOP r10, long r11, boolean r13) {
        /*
            X.00s r6 = r10.A04
            long r3 = r6.AHH()
            r1 = -9223372036854775808
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L76
            r6.Adh(r11)
            X.AOH<S> r0 = r10.A02
            androidx.compose.runtime.MutableState r1 = r0.A00
        L14:
            androidx.compose.runtime.MutableState.A09(r5, r1)
        L17:
            r1 = 0
            androidx.compose.runtime.MutableState r0 = r10.A08
            androidx.compose.runtime.MutableState.A09(r1, r0)
            androidx.compose.runtime.snapshots.SnapshotStateList<X.AOP<S>$TransitionAnimationState<?, ?>> r6 = r10.A0A
            int r4 = r6.size()
            r3 = 0
        L24:
            if (r3 >= r4) goto L81
            java.lang.Object r7 = r6.get(r3)
            X.AOQ r7 = (X.AOQ) r7
            androidx.compose.runtime.MutableState r0 = r7.A0B
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != 0) goto L6a
            r0 = r11
            if (r13 == 0) goto L41
            androidx.compose.runtime.MutableState r0 = r7.A09
            X.AOa r0 = X.C8j3.A0d(r0)
            long r0 = r0.AEu()
        L41:
            androidx.compose.runtime.MutableState r9 = r7.A09
            X.AOa r2 = X.C8j3.A0d(r9)
            java.lang.Object r8 = r2.AMR(r0)
            androidx.compose.runtime.MutableState r2 = r7.A0D
            r2.Af8(r8)
            X.AOa r2 = X.C8j3.A0d(r9)
            X.AOd r2 = r2.AMb(r0)
            r7.A00 = r2
            X.AOa r2 = X.C8j3.A0d(r9)
            boolean r0 = r2.AOR(r0)
            if (r0 == 0) goto L6a
            r1 = 1
            androidx.compose.runtime.MutableState r0 = r7.A0B
            androidx.compose.runtime.MutableState.A09(r1, r0)
        L6a:
            androidx.compose.runtime.MutableState r0 = r7.A0B
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != 0) goto L73
            r5 = 0
        L73:
            int r3 = r3 + 1
            goto L24
        L76:
            X.AOH<S> r0 = r10.A02
            androidx.compose.runtime.MutableState r1 = r0.A00
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r1)
            if (r0 != 0) goto L17
            goto L14
        L81:
            androidx.compose.runtime.snapshots.SnapshotStateList<X.AOP<?>> r4 = r10.A0B
            int r3 = r4.size()
            r2 = 0
        L88:
            if (r2 >= r3) goto La3
            java.lang.Object r1 = r4.get(r2)
            X.AOP r1 = (X.AOP) r1
            boolean r0 = X.AOH.A00(r1)
            if (r0 != 0) goto L99
            A01(r1, r11, r13)
        L99:
            boolean r0 = X.AOH.A00(r1)
            if (r0 != 0) goto La0
            r5 = 0
        La0:
            int r2 = r2 + 1
            goto L88
        La3:
            if (r5 == 0) goto La8
            r10.A05()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AOP.A01(X.AOP, long, boolean):void");
    }

    public final long A02() {
        AOP<?> aop = this.A01;
        return aop != null ? aop.A02() : this.A03.AHH();
    }

    public final AOB<S> A03() {
        return (AOB) this.A06.getValue();
    }

    public final void A04() {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            AOQ aoq = (AOQ) snapshotStateList.get(i);
            aoq.A02 = null;
            aoq.A01 = null;
            aoq.A03 = false;
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AOP) snapshotStateList2.get(i2)).A04();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A05() {
        this.A04.Adh(Long.MIN_VALUE);
        AOH<S> aoh = this.A02;
        if (aoh instanceof AOI) {
            aoh.A08(this.A07.getValue());
        }
        A09(0L);
        MutableState.A09(false, ((AOH) aoh).A00);
        SnapshotStateList<AOP<?>> snapshotStateList = this.A0B;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((AOP) snapshotStateList.get(i)).A05();
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [V extends X.AOd, X.AOd] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object] */
    public final void A06() {
        ATV atv;
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            AOQ aoq = (AOQ) snapshotStateList.get(i);
            AOV aov = aoq.A01;
            if (aov != null && (atv = aoq.A02) != null) {
                long jA03 = Ab3.A03(aov.A02 * aov.A00);
                ?? AMR = atv.AMR(jA03);
                if (aoq.A03) {
                    C0997AOa c0997AOaA0d = C8j3.A0d(aoq.A09);
                    if (!C7384Etj.areEqual(c0997AOaA0d.A05, AMR)) {
                        c0997AOaA0d.A05 = AMR;
                        c0997AOaA0d.A03 = AOl.A00(c0997AOaA0d.A07, AMR);
                        c0997AOaA0d.A01 = null;
                        c0997AOaA0d.A00 = -1L;
                    }
                }
                MutableState mutableState = aoq.A09;
                C8j3.A0d(mutableState).A00(AMR);
                AOQ.A00(aoq, mutableState);
                if (aoq.A07.AFn() == -2.0f || aoq.A03) {
                    aoq.A0D.Af8(AMR);
                } else {
                    aoq.A02(aoq.A0F.A02());
                }
                if (jA03 >= aov.A02) {
                    aoq.A01 = null;
                    aoq.A02 = null;
                } else {
                    aov.A07 = false;
                }
            }
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AOP) snapshotStateList2.get(i2)).A06();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [V extends X.AOd, X.AOd] */
    public final void A07(float f) {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            AOQ aoq = (AOQ) snapshotStateList.get(i);
            if (f == -4.0f || f == -5.0f) {
                C0997AOa<T, V> c0997AOa = aoq.A02;
                if (c0997AOa != 0) {
                    C8j3.A0d(aoq.A09).A00(c0997AOa.A05);
                    aoq.A01 = null;
                    aoq.A02 = null;
                }
                MutableState mutableState = aoq.A09;
                C0997AOa c0997AOaA0d = C8j3.A0d(mutableState);
                T t = f == -4.0f ? c0997AOaA0d.A04 : c0997AOaA0d.A05;
                C8j3.A0d(mutableState).A00(t);
                C0997AOa c0997AOaA0d2 = C8j3.A0d(mutableState);
                if (!C7384Etj.areEqual(c0997AOaA0d2.A05, t)) {
                    c0997AOaA0d2.A05 = t;
                    c0997AOaA0d2.A03 = AOl.A00(c0997AOaA0d2.A07, t);
                    c0997AOaA0d2.A01 = null;
                    c0997AOaA0d2.A00 = -1L;
                }
                aoq.A0D.Af8(t);
                AOQ.A00(aoq, mutableState);
            } else {
                aoq.A07.AdS(f);
            }
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AOP) snapshotStateList2.get(i2)).A07(f);
        }
    }

    public final void A08(long j) {
        C00s c00s = this.A04;
        if (c00s.AHH() == Long.MIN_VALUE) {
            c00s.Adh(j);
        }
        A09(j);
        MutableState.A09(false, this.A08);
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((AOQ) snapshotStateList.get(i)).A02(j);
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AOP aop = (AOP) snapshotStateList2.get(i2);
            if (!AOH.A00(aop)) {
                aop.A08(j);
            }
        }
    }

    public final void A09(long j) {
        if (this.A01 == null) {
            this.A03.Adh(j);
        }
    }

    public final void A0A(AOV aov) {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            AOQ aoq = (AOQ) snapshotStateList.get(i);
            MutableState mutableState = aoq.A09;
            if (!C7384Etj.areEqual(C8j3.A0d(mutableState).A05, C8j3.A0d(mutableState).A04)) {
                aoq.A02 = C8j3.A0d(mutableState);
                aoq.A01 = aov;
            }
            AOc aOc = aoq.A05;
            C31w<T, V> c31w = aoq.A06;
            MutableState mutableState2 = aoq.A0D;
            mutableState.Af8(new C0997AOa(aOc, aoq.A00.A03(), c31w, mutableState2.getValue(), mutableState2.getValue()));
            AOQ.A00(aoq, mutableState);
            aoq.A03 = true;
        }
        SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AOP) snapshotStateList2.get(i2)).A0A(aov);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0C(S s) {
        MutableState mutableState = this.A07;
        if (C7384Etj.areEqual(mutableState.getValue(), s)) {
            return;
        }
        this.A06.Af8(new AOA(mutableState.getValue(), s));
        AOH<S> aoh = this.A02;
        if (!C7384Etj.areEqual(aoh.A09(), mutableState.getValue())) {
            aoh.A08(mutableState.getValue());
        }
        mutableState.Af8(s);
        if (!A0F()) {
            this.A08.Af8(true);
        }
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((AOQ) snapshotStateList.get(i)).A07.AdS(-2.0f);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TS;TS;J)V */
    public final void A0D(Object obj, long j, Object obj2) {
        this.A04.Adh(Long.MIN_VALUE);
        AOH<S> aoh = this.A02;
        MutableState.A09(false, aoh.A00);
        if (!A0G() || !C7384Etj.areEqual(aoh.A09(), obj) || !C7384Etj.areEqual(this.A07.getValue(), obj2)) {
            if (!C7384Etj.areEqual(aoh.A09(), obj) && (aoh instanceof AOI)) {
                aoh.A08(obj);
            }
            this.A07.Af8(obj2);
            MutableState.A09(true, this.A05);
            this.A06.Af8(new AOA(obj, obj2));
        }
        SnapshotStateList<AOP<?>> snapshotStateList = this.A0B;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            AOP aop = (AOP) snapshotStateList.get(i);
            C7384Etj.A0Z(aop, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (aop.A0G()) {
                aop.A0D(aop.A02.A09(), j, aop.A07.getValue());
            }
        }
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this.A0A;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AOQ) snapshotStateList2.get(i2)).A02(j);
        }
        this.A00 = j;
    }

    public final boolean A0E() {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                SnapshotStateList<AOP<?>> snapshotStateList2 = this.A0B;
                int size2 = snapshotStateList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!((AOP) snapshotStateList2.get(i2)).A0E()) {
                    }
                }
                return false;
            }
            if (((AOQ) snapshotStateList.get(i)).A01 != null) {
                break;
            }
            i++;
        }
        return true;
    }

    public final boolean A0F() {
        return this.A04.AHH() != Long.MIN_VALUE;
    }

    public final boolean A0G() {
        return ((Boolean) this.A05.getValue()).booleanValue();
    }

    public final String toString() {
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.A0A;
        int size = snapshotStateList.size();
        String strA0v = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            Object obj = snapshotStateList.get(i);
            StringBuilder sbA0g = C3cG.A0g(strA0v);
            sbA0g.append(obj);
            strA0v = AnonymousClass001.A0v(", ", sbA0g);
        }
        return strA0v;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AOH<TS;>;LX/AOP<*>;Ljava/lang/String;)V */
    public AOP(AOP aop, AOH aoh, String str) {
        this.A02 = aoh;
        this.A01 = aop;
        this.A0C = str;
        Object objA09 = aoh.A09();
        AGE age = AGE.A00;
        this.A07 = new ParcelableSnapshotMutableState(age, objA09);
        this.A06 = new ParcelableSnapshotMutableState(age, new AOA(this.A02.A09(), this.A02.A09()));
        this.A03 = new ParcelableSnapshotMutableLongState(0L);
        this.A04 = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        this.A08 = new ParcelableSnapshotMutableState(age, false);
        this.A0A = new SnapshotStateList();
        this.A0B = new SnapshotStateList();
        this.A05 = new ParcelableSnapshotMutableState(age, false);
        this.A09 = new BBP(null, new C2292BSs(this, 6));
        aoh.A0B(this);
    }

    /* JADX WARN: Incorrect types in method signature: (TS;LX/BFM;I)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(BFM bfm, Object obj, int i) {
        int i2;
        bfm.AgG(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bfm.A65(obj) : bfm.A67(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bfm.A65(this) ? 32 : 16;
        }
        if (bfm.AfS(i2 & 1, (i2 & 19) != 18)) {
            if (A0G()) {
                bfm.AgE(467722849);
            } else {
                bfm.AgE(466062241);
                A0C(obj);
                int i3 = i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean z = i3 == 32;
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new BBP(null, new C2292BSs(this, 5));
                    BBI.A0O((BBI) bfm, objAaT);
                }
                if (((Boolean) ((C1BO) objAaT).getValue()).booleanValue()) {
                    bfm.AgE(466470356);
                    Object objAaT2 = bfm.AaT();
                    Object obj2 = C78N.A00;
                    if (objAaT2 == obj2) {
                        objAaT2 = C78e.A00(bfm, C6ys.A00);
                        bfm.Ai0(objAaT2);
                    }
                    boolean zA67 = bfm.A67(objAaT2) | (i3 == 32);
                    Object objAaT3 = bfm.AaT();
                    if (zA67 || objAaT3 == obj2) {
                        objAaT3 = new BTA(4, this, objAaT2);
                        bfm.Ai0(objAaT3);
                    }
                    C78e.A03(bfm, objAaT2, this, (G0U) objAaT3);
                } else {
                    bfm.AgE(467712929);
                }
                BBI.A0R((BBI) bfm, false);
            }
            BBI.A0R((BBI) bfm, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTH(this, obj, i, 0);
        }
    }
}
