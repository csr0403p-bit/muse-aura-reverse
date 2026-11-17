package X;

import androidx.compose.animation.core.SeekableTransitionState;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AOR {
    public static final G0U<SeekableTransitionState<?>, Unit> A00 = C2278BSe.A00(3);

    /* JADX WARN: Incorrect inner types in method signature: <S:Ljava/lang/Object;T:Ljava/lang/Object;V:LX/AOd;>(LX/AOP<TS;>;LX/31w<TT;TV;>;Ljava/lang/String;LX/BFM;II)LX/AOP<TS;>.DeferredAnimation<TT;TV;>; */
    public static final AOS A00(AOP aop, C31w c31w, BFM bfm, int i) {
        AOT aot;
        boolean zA1S = C8j3.A1S(bfm.A65(aop) ? 1 : 0);
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = new AOS(aop, c31w);
            BBI.A0T(bfm, objAaT);
        }
        AOS aos = (AOS) objAaT;
        boolean zA67 = bfm.A67(aos) | (bfm.A65(aop));
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = BTA.A00(bfm, aos, aop, 7);
        }
        AnonymousClass001.A17(bfm, objAaT2, aos);
        if (aop.A0G() && (aot = (AOT) aos.A00.getValue()) != null) {
            AOP<S> aop2 = aos.A02;
            aot.A02.A04((AOe) aot.A01.invoke(aop2.A03()), aot.A00.invoke(aop2.A03().AGR()), aot.A00.invoke(aop2.A03().ALW()));
        }
        return aos;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AOQ A01(X.AOe r13, X.AOP r14, X.C31w r15, X.BFM r16, java.lang.Object r17, java.lang.Object r18, int r19) {
        /*
            r12 = r19 & 14
            r5 = r12 ^ 6
            r4 = 4
            r8 = r14
            r9 = r16
            if (r5 <= r4) goto L10
            boolean r0 = r9.A65(r14)
            if (r0 != 0) goto L15
        L10:
            r1 = r19 & 6
            r0 = 0
            if (r1 != r4) goto L16
        L15:
            r0 = 1
        L16:
            java.lang.Object r7 = r9.AaT()
            r10 = r17
            r11 = r18
            if (r0 != 0) goto L24
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L48
        L24:
            androidx.compose.runtime.snapshots.Snapshot r3 = androidx.compose.runtime.snapshots.Snapshot.A03()
            X.G0U r2 = X.C8j3.A1F(r3)
            androidx.compose.runtime.snapshots.Snapshot r1 = androidx.compose.runtime.snapshots.Snapshot.A04(r3)
            X.AOd r0 = X.AOl.A00(r15, r11)     // Catch: java.lang.Throwable -> L3d
            r0.A04()     // Catch: java.lang.Throwable -> L3d
            X.AOQ r7 = new X.AOQ     // Catch: java.lang.Throwable -> L3d
            r7.<init>(r0, r14, r15, r10)     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r3, r1, r2)
            throw r0
        L42:
            androidx.compose.runtime.snapshots.Snapshot.A07(r3, r1, r2)
            X.BBI.A0T(r9, r7)
        L48:
            X.AOQ r7 = (X.AOQ) r7
            r6 = r13
            A05(r6, r7, r8, r9, r10, r11, r12)
            if (r5 <= r4) goto L56
            boolean r0 = r9.A65(r14)
            if (r0 != 0) goto L5b
        L56:
            r1 = r19 & 6
            r0 = 0
            if (r1 != r4) goto L5c
        L5b:
            r0 = 1
        L5c:
            boolean r0 = X.C8j3.A1V(r9, r7, r0)
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L6a
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L70
        L6a:
            r0 = 9
            X.BTA r1 = X.BTA.A00(r9, r7, r14, r0)
        L70:
            X.AnonymousClass001.A17(r9, r1, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AOR.A01(X.AOe, X.AOP, X.31w, X.BFM, java.lang.Object, java.lang.Object, int):X.AOQ");
    }

    /* JADX WARN: Incorrect types in method signature: <S:Ljava/lang/Object;T:Ljava/lang/Object;>(LX/AOP<TS;>;TT;TT;Ljava/lang/String;LX/BFM;I)LX/AOP<TT;>; */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AOP A02(X.AOP r8, X.BFM r9, java.lang.Object r10, java.lang.Object r11, java.lang.String r12, int r13) {
        /*
            r0 = r13 & 14
            r7 = r0 ^ 6
            r6 = 1
            r3 = 0
            r5 = 4
            if (r7 <= r5) goto Lf
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L14
        Lf:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r5) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r2 = r9.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L34
        L1f:
            X.AOI r4 = new X.AOI
            r4.<init>(r10)
            java.lang.String r1 = r8.A0C
            java.lang.String r0 = " > "
            java.lang.String r0 = X.FGI.A0U(r1, r0, r12)
            X.AOP r2 = new X.AOP
            r2.<init>(r8, r4, r0)
            r9.Ai0(r2)
        L34:
            X.AOP r2 = (X.AOP) r2
            if (r7 <= r5) goto L3e
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L43
        L3e:
            r0 = r13 & 6
            if (r0 == r5) goto L43
            r6 = 0
        L43:
            boolean r0 = X.C8j3.A1V(r9, r2, r6)
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L51
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L56
        L51:
            r0 = 6
            X.BTA r1 = X.BTA.A00(r9, r2, r8, r0)
        L56:
            X.AnonymousClass001.A17(r9, r1, r2)
            boolean r0 = r8.A0G()
            if (r0 == 0) goto L65
            long r0 = r8.A00
            r2.A0D(r10, r0, r11)
            return r2
        L65:
            r2.A0C(r11)
            androidx.compose.runtime.MutableState r0 = r2.A05
            androidx.compose.runtime.MutableState.A09(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AOR.A02(X.AOP, X.BFM, java.lang.Object, java.lang.Object, java.lang.String, int):X.AOP");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AOH<TT;>;Ljava/lang/String;LX/BFM;II)LX/AOP<TT;>; */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AOP A03(X.AOH r11, X.BFM r12, java.lang.String r13, int r14, int r15) {
        /*
            r0 = r15 & 2
            r6 = 0
            if (r0 == 0) goto L6
            r13 = r6
        L6:
            r0 = r14 & 14
            r8 = r0 ^ 6
            r10 = 1
            r7 = 4
            r4 = 0
            if (r8 <= r7) goto L15
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L1a
        L15:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r7) goto L1b
        L1a:
            r0 = 1
        L1b:
            java.lang.Object r3 = r12.AaT()
            if (r0 != 0) goto L25
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L47
        L25:
            androidx.compose.runtime.snapshots.Snapshot r5 = androidx.compose.runtime.snapshots.Snapshot.A03()
            if (r5 == 0) goto L34
            X.G0U r2 = r5.A0D()
        L2f:
            androidx.compose.runtime.snapshots.Snapshot r1 = androidx.compose.runtime.snapshots.Snapshot.A04(r5)
            goto L36
        L34:
            r2 = r6
            goto L2f
        L36:
            X.AOP r3 = new X.AOP     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r6, r11, r13)     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r5, r1, r2)
            throw r0
        L41:
            androidx.compose.runtime.snapshots.Snapshot.A07(r5, r1, r2)
            r12.Ai0(r3)
        L47:
            X.AOP r3 = (X.AOP) r3
            boolean r0 = r11 instanceof androidx.compose.animation.core.SeekableTransitionState
            if (r0 == 0) goto Lc2
            r0 = -1357590553(0xffffffffaf14cfe7, float:-1.3534383E-10)
            java.lang.Object r0 = X.AnonymousClass001.A0p(r12, r0)
            java.lang.Object r5 = X.C78N.A00
            java.lang.Object r9 = X.AnonymousClass004.A15(r12, r0, r5)
            boolean r2 = r12.A67(r9)
            if (r8 <= r7) goto L66
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L6b
        L66:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r7) goto L6c
        L6b:
            r0 = 1
        L6c:
            r2 = r2 | r0
            java.lang.Object r0 = r12.AaT()
            if (r2 != 0) goto L75
            if (r0 != r5) goto L7a
        L75:
            r0 = 5
            X.BTA r0 = X.BTA.A00(r12, r9, r11, r0)
        L7a:
            X.AnonymousClass001.A17(r12, r0, r9)
            java.lang.Object r2 = r11.A09()
            java.lang.Object r1 = r11.A0A()
            if (r8 <= r7) goto L8d
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L92
        L8d:
            r0 = r14 & 6
            if (r0 == r7) goto L92
            r10 = 0
        L92:
            java.lang.Object r0 = r12.AaT()
            if (r10 != 0) goto L9a
            if (r0 != r5) goto La2
        L9a:
            X.BUC r0 = new X.BUC
            r0.<init>(r11, r6, r4)
            r12.Ai0(r0)
        La2:
            X.AnonymousClass001.A1A(r12, r0, r2, r1)
        La5:
            X.AnonymousClass001.A1D(r12)
            boolean r0 = r12.A65(r3)
            java.lang.Object r1 = r12.AaT()
            if (r0 != 0) goto Lb6
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lbe
        Lb6:
            r0 = 3
            X.BSv r1 = X.C2295BSv.A00(r3, r0)
            r12.Ai0(r1)
        Lbe:
            X.AnonymousClass001.A17(r12, r1, r3)
            return r3
        Lc2:
            r0 = -1356604288(0xffffffffaf23dc80, float:-1.4903101E-10)
            r12.AgE(r0)
            java.lang.Object r0 = r11.A0A()
            r3.A0B(r12, r0, r4)
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AOR.A03(X.AOH, X.BFM, java.lang.String, int, int):X.AOP");
    }

    public static final AOP A04(BFM bfm, Object obj, String str, int i) {
        Object objAaT = bfm.AaT();
        Object obj2 = C78N.A00;
        if (objAaT == obj2) {
            objAaT = new AOP(null, new AOI(obj), str);
            bfm.Ai0(objAaT);
        }
        AOP aop = (AOP) objAaT;
        aop.A0B(bfm, obj, (i & 8) | 48 | (i & 14));
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj2) {
            objAaT2 = new C2295BSv(aop, 4);
            bfm.Ai0(objAaT2);
        }
        C78e.A05(bfm, aop, (G0U) objAaT2);
        return aop;
    }

    /* JADX WARN: Incorrect inner types in method signature: <S:Ljava/lang/Object;T:Ljava/lang/Object;V:LX/AOd;>(LX/AOP<TS;>;LX/AOP<TS;>.TransitionAnimationState<TT;TV;>;TT;TT;LX/AOe<TT;>;LX/BFM;I)V */
    public static final void A05(AOe aOe, AOQ aoq, AOP aop, BFM bfm, Object obj, Object obj2, int i) {
        bfm.AgG(867041821);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aop) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, aoq);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(obj, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(obj2, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, aOe, 32768, i) ? 1 : 0);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            bfm.Afo();
        } else if (aop.A0G()) {
            aoq.A04(aOe, obj, obj2);
        } else {
            aoq.A03(aOe, obj2);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2302BTc(aOe, aoq, aop, obj, obj2, i, 0);
        }
    }
}
