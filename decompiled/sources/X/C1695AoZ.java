package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AoZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1695AoZ {
    public ApQ A00;
    public final MutableState A01 = AbstractC1798ArH.A06(null);
    public final SnapshotStateList<G0U<C1701Aog, Unit>> A02;
    public final ApQ A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1695AoZ(X.ApQ r33) {
        /*
            r32 = this;
            r6 = r32
            r6.<init>()
            r1 = r33
            r6.A03 = r1
            r15 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AbstractC1798ArH.A06(r15)
            r6.A01 = r0
            X.ApS r8 = X.AnonymousClass006.A0W()
            r8.A07(r1)
            java.util.List<X.ApT<? extends X.1OS>> r7 = r8.A01
            java.util.ArrayList r5 = X.C60Q.A0t(r7)
            int r4 = r7.size()
            r3 = 0
        L22:
            if (r3 >= r4) goto Lb4
            java.lang.Object r1 = r7.get(r3)
            X.ApT r1 = (X.C1732ApT) r1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.ApU r9 = r1.A01(r0)
            T r1 = r9.A02
            boolean r0 = r1 instanceof X.AbstractC1699Aoe
            if (r0 == 0) goto L53
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation"
            X.C7384Etj.A0Z(r1, r0)
            X.Aoe r1 = (X.AbstractC1699Aoe) r1
            X.Aoc r1 = r1.A01()
            if (r1 == 0) goto L53
            X.Aro r14 = r1.A03
            if (r14 != 0) goto L83
            X.Aro r0 = r1.A00
            if (r0 != 0) goto L83
            X.Aro r0 = r1.A01
            if (r0 != 0) goto L83
            X.Aro r0 = r1.A02
            if (r0 != 0) goto L83
        L53:
            X.ApU[] r0 = new X.C1733ApU[]{r9}
        L57:
            java.util.ArrayList r14 = X.AbstractC0885AGm.A0x(r0)
            java.util.ArrayList r13 = X.C60Q.A0t(r14)
            int r12 = r14.size()
            r11 = 0
        L64:
            if (r11 >= r12) goto L7d
            X.ApU r0 = X.C8j4.A0c(r14, r11)
            T r10 = r0.A02
            int r9 = r0.A01
            int r2 = r0.A00
            java.lang.String r1 = r0.A03
            X.ApT r0 = new X.ApT
            r0.<init>(r10, r1, r9, r2)
            r13.add(r0)
            int r11 = r11 + 1
            goto L64
        L7d:
            X.AbstractC0882AGj.A0r(r13, r5)
            int r3 = r3 + 1
            goto L22
        L83:
            if (r14 != 0) goto La6
            long r26 = X.B6A.A07
            long r28 = X.C1809ArT.A01
            X.Aro r14 = new X.Aro
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r15
            r30 = r28
            r32 = r26
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32)
        La6:
            int r2 = r9.A01
            int r1 = r9.A00
            X.ApU r0 = new X.ApU
            r0.<init>(r14, r2, r1)
            X.ApU[] r0 = new X.C1733ApU[]{r9, r0}
            goto L57
        Lb4:
            r7.clear()
            r7.addAll(r5)
            X.ApQ r0 = r8.A04()
            r6.A00 = r0
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = new androidx.compose.runtime.snapshots.SnapshotStateList
            r0.<init>()
            r6.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695AoZ.<init>(X.ApQ):void");
    }

    public static final C1733ApU<AbstractC1699Aoe> A00(C1733ApU<AbstractC1699Aoe> c1733ApU, C1958Aux c1958Aux) {
        int iA0A = c1958Aux.A03.A0A(r3.A02 - 1, false);
        int i = c1733ApU.A01;
        if (i >= iA0A) {
            return null;
        }
        return new C1733ApU<>(c1733ApU.A02, c1733ApU.A03, i, Math.min(c1733ApU.A00, iA0A));
    }

    public static final void A01(C1695AoZ c1695AoZ, BFM bfm, G0U g0u, Object[] objArr, int i) {
        bfm.AgG(-2083052099);
        int iA0U = (i & 48) == 0 ? AnonymousClass004.A0U(bfm, g0u) | i : i;
        if ((i & 384) == 0) {
            iA0U |= AnonymousClass004.A0V(bfm, c1695AoZ);
        }
        int length = objArr.length;
        bfm.Ag8(-358306546, Integer.valueOf(length));
        int i2 = iA0U | (bfm.A63(length) ? 4 : 0);
        for (Object obj : objArr) {
            int i3 = 0;
            if (bfm.A67(obj)) {
                i3 = 4;
            }
            i2 |= i3;
        }
        AnonymousClass002.A19(bfm);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i2 & 147, 146), bfm, i2)) {
            ArrayList arrayListA11 = C60O.A11(2);
            arrayListA11.add(g0u);
            C1f2.A00(objArr, arrayListA11);
            Object[] array = arrayListA11.toArray(new Object[arrayListA11.size()]);
            boolean zA67 = bfm.A67(c1695AoZ) | AnonymousClass001.A1N(i2);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = BTA.A00(bfm, g0u, c1695AoZ, 47);
            }
            C78e.A07(bfm, (G0U) objAaT, array);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(c1695AoZ, objArr, g0u, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(BFM bfm, int i) {
        bfm.AgG(1154651354);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, this) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            Object objA07 = AKO.A07(Am0.A0G, bbi);
            ApQ apQ = this.A00;
            List listA02 = apQ.A02(apQ.length());
            int size = listA02.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1733ApU c1733ApUA0c = C8j4.A0c(listA02, i2);
                if (c1733ApUA0c.A01 != c1733ApUA0c.A00) {
                    Object objA0p = AnonymousClass001.A0p(bfm, 725478935);
                    Object obj = C78N.A00;
                    if (objA0p == obj) {
                        objA0p = new C1qN();
                        BBI.A0O(bbi, objA0p);
                    }
                    InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) objA0p;
                    BRg bRgA00 = AbstractC1396AiR.A00(BRg.A00, BTA.A01(c1733ApUA0c, this, 46));
                    Object objAaT = bfm.AaT();
                    if (objAaT == obj) {
                        objAaT = new C2279BSf(19);
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgThen = ARD.A01(bRgA00, (G0U) objAaT, false).then(new AbG(new C1700Aof(this, c1733ApUA0c))).then(new C1696Aoa(interfaceC1072AWd)).then(new AnN(C1763AqG.A01));
                    boolean zA1S = AnonymousClass004.A1S(bfm, c1733ApUA0c, objA07, bfm.A67(this));
                    Object objAaT2 = bfm.AaT();
                    if (zA1S || objAaT2 == obj) {
                        objAaT2 = new BTN(objA07, this, c1733ApUA0c, 4);
                        bfm.Ai0(objAaT2);
                    }
                    C3Ue.A04(C0v5.A00(null, interfaceC1072AWd, bRgThen, null, null, null, null, (Function0) objAaT2, true), bfm, 0);
                    C1697Aoc c1697AocA01 = ((AbstractC1699Aoe) c1733ApUA0c.A02).A01();
                    if (c1697AocA01 == null || (c1697AocA01.A03 == null && c1697AocA01.A00 == null && c1697AocA01.A01 == null && c1697AocA01.A02 == null)) {
                        bfm.AgE(728331710);
                    } else {
                        Object objA0p2 = AnonymousClass001.A0p(bfm, 726303039);
                        if (objA0p2 == obj) {
                            objA0p2 = new AI4(interfaceC1072AWd);
                            BBI.A0O(bbi, objA0p2);
                        }
                        AI4 ai4 = (AI4) objA0p2;
                        Unit unit = Unit.INSTANCE;
                        Object objAaT3 = bfm.AaT();
                        if (objAaT3 == obj) {
                            objAaT3 = BU2.A0O(ai4, null, 32);
                            bfm.Ai0(objAaT3);
                        }
                        AnonymousClass001.A18(bfm, objAaT3, unit);
                        C00r c00r = ai4.A01;
                        Boolean boolValueOf = Boolean.valueOf(AnonymousClass002.A1L(c00r.AGd() & 2));
                        Boolean boolValueOf2 = Boolean.valueOf(AnonymousClass002.A1L(c00r.AGd() & 1));
                        Boolean boolValueOf3 = Boolean.valueOf(AnonymousClass002.A1L(c00r.AGd() & 4));
                        C1697Aoc c1697AocA012 = ((AbstractC1699Aoe) c1733ApUA0c.A02).A01();
                        C1824Aro c1824Aro = c1697AocA012 != null ? c1697AocA012.A03 : null;
                        C1697Aoc c1697AocA013 = ((AbstractC1699Aoe) c1733ApUA0c.A02).A01();
                        C1824Aro c1824Aro2 = c1697AocA013 != null ? c1697AocA013.A00 : null;
                        C1697Aoc c1697AocA014 = ((AbstractC1699Aoe) c1733ApUA0c.A02).A01();
                        C1824Aro c1824Aro3 = c1697AocA014 != null ? c1697AocA014.A01 : null;
                        C1697Aoc c1697AocA015 = ((AbstractC1699Aoe) c1733ApUA0c.A02).A01();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c1824Aro, c1824Aro2, c1824Aro3, c1697AocA015 != null ? c1697AocA015.A02 : null};
                        boolean zA1N = AnonymousClass003.A1N(bfm, this, c1733ApUA0c);
                        Object objAaT4 = bfm.AaT();
                        if (zA1N || objAaT4 == obj) {
                            objAaT4 = new BTL(ai4, this, c1733ApUA0c, 4);
                            bfm.Ai0(objAaT4);
                        }
                        A01(this, bfm, (G0U) objAaT4, objArr, (iA0T << 6) & 896);
                    }
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(728345598);
                }
                BBI.A0R(bbi, false);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(this, i, 8);
        }
    }
}
