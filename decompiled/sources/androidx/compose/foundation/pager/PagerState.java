package androidx.compose.foundation.pager;

import X.A4A;
import X.AGE;
import X.AGG;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AYL;
import X.AZ1;
import X.Ab2;
import X.AbZ;
import X.AbstractC1061ATk;
import X.AbstractC1798ArH;
import X.Abu;
import X.Ac0;
import X.Ac2;
import X.Ac3;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.Av9;
import X.C00r;
import X.C1088AXy;
import X.C1133Abh;
import X.C1135Abl;
import X.C1138Abq;
import X.C1140Abs;
import X.C1141Abt;
import X.C1145Aby;
import X.C1229Af7;
import X.C1BO;
import X.C1qN;
import X.C2289BSp;
import X.C2292BSs;
import X.C2295BSv;
import X.C3UY;
import X.C3cG;
import X.C6XV;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9kj;
import X.EnumC10460Hji;
import X.EnumC1108AYu;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1134Abi;
import X.InterfaceC1147Ac5;
import X.InterfaceC1180Adj;
import X.InterfaceC1195AeC;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class PagerState implements InterfaceC1180Adj {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C1133Abh A09;
    public MutableState<C1133Abh> A0A;
    public AXN A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceC1180Adj A0E;
    public final InterfaceC1072AWd A0F;
    public final Av9 A0G;
    public final C1145Aby A0H;
    public final A4A A0I;
    public final C1229Af7 A0J;
    public final C1141Abt A0K;
    public final C1138Abq A0L;
    public final C00r A0M;
    public final C00r A0N;
    public final MutableState A0O;
    public final MutableState A0P;
    public final MutableState<Boolean> A0Q;
    public final MutableState<Boolean> A0R;
    public final MutableState<Unit> A0S;
    public final MutableState<Unit> A0T;
    public final MutableState A0U;
    public final MutableState A0V;
    public final C1BO A0W;
    public final InterfaceC1195AeC A0X;
    public final Ac2 A0Y;
    public final Ac0 A0Z;
    public final C1BO A0a;

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/pager/PagerState;LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(X.C3UY r7, androidx.compose.foundation.pager.PagerState r8, X.HtJ r9, X.G0V r10) {
        /*
            r6 = 1
            boolean r0 = r9 instanceof X.C2318BTs
            if (r0 == 0) goto L7a
            r5 = r9
            X.BTs r5 = (X.C2318BTs) r5
            int r0 = r5.$t
            if (r0 != r6) goto L7a
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 2
            if (r0 == 0) goto L34
            if (r0 == r6) goto L46
            if (r0 != r3) goto L80
            java.lang.Object r8 = r5.A01
            androidx.compose.foundation.pager.PagerState r8 = (androidx.compose.foundation.pager.PagerState) r8
            X.Hwg.A00(r1)
        L2b:
            r1 = -1
            X.00r r0 = r8.A0M
            r0.AdX(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L34:
            X.Hwg.A00(r1)
            r5.A01 = r8
            r5.A02 = r7
            r5.A03 = r10
            r5.A00 = r6
            java.lang.Object r0 = A02(r8, r5)
            if (r0 != r4) goto L55
            return r4
        L46:
            java.lang.Object r10 = r5.A03
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r7 = r5.A02
            X.3UY r7 = (X.C3UY) r7
            java.lang.Object r8 = r5.A01
            androidx.compose.foundation.pager.PagerState r8 = (androidx.compose.foundation.pager.PagerState) r8
            X.Hwg.A00(r1)
        L55:
            X.Adj r2 = r8.A0E
            boolean r0 = r2.AOz()
            if (r0 != 0) goto L6a
            X.Abq r0 = r8.A0L
            X.00r r0 = r0.A05
            int r1 = r0.AGd()
            X.00r r0 = r8.A0N
            r0.AdX(r1)
        L6a:
            r5.A01 = r8
            r0 = 0
            r5.A02 = r0
            r5.A03 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.AcF(r7, r5, r10)
            if (r0 != r4) goto L2b
            return r4
        L7a:
            X.BTs r5 = new X.BTs
            r5.<init>(r8, r9, r6)
            goto L17
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.A01(X.3UY, androidx.compose.foundation.pager.PagerState, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (IFLX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A03(PagerState pagerState, HtJ htJ, int i) {
        Object objA01 = A01(C3UY.A02, pagerState, htJ, new PagerState$scrollToPage$2(pagerState, null, 0.0f, i));
        return objA01 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.AOc r12, X.HtJ r13, int r14) {
        /*
            r11 = this;
            r8 = r14
            r9 = r12
            r12 = 0
            boolean r0 = r13 instanceof X.C1137Abp
            r10 = r11
            if (r0 == 0) goto L8c
            r4 = r13
            X.Abp r4 = (X.C1137Abp) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L57
            if (r0 != r7) goto L92
            X.Hwg.A00(r1)
        L27:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L2a:
            X.Hwg.A00(r1)
            X.Abq r1 = r11.A0L
            X.00r r0 = r1.A05
            int r0 = r0.AGd()
            if (r14 != r0) goto L42
            X.00q r0 = r1.A04
            float r0 = r0.AFn()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L42
            goto L27
        L42:
            int r0 = r11.A06()
            if (r0 == 0) goto L27
            r4.L$0 = r9
            r4.I$0 = r14
            r4.F$0 = r12
            r4.label = r2
            java.lang.Object r0 = A02(r11, r4)
            if (r0 != r3) goto L6f
            return r3
        L57:
            float r12 = r4.F$0
            int r8 = r4.I$0
            java.lang.Object r9 = r4.L$0
            X.AOc r9 = (X.AOc) r9
            X.Hwg.A00(r1)
            double r1 = (double) r12
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L97
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L97
        L6f:
            int r13 = A00(r11, r8)
            int r0 = r11.A08()
            float r0 = (float) r0
            float r12 = r12 * r0
            r11 = 0
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r8 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r8.<init>(r9, r10, r11, r12, r13)
            r4.L$0 = r11
            r4.label = r7
            X.3UY r0 = X.C3UY.A02
            java.lang.Object r0 = A01(r0, r10, r4, r8)
            if (r0 != r3) goto L27
            return r3
        L8c:
            X.Abp r4 = new X.Abp
            r4.<init>(r11, r13)
            goto L16
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L97:
            java.lang.String r1 = "pageOffsetFraction "
            java.lang.String r0 = " is not within the range -0.5 to 0.5"
            java.lang.String r0 = X.FGI.A0R(r1, r0, r12)
            X.AbstractC1061ATk.A00(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.A09(X.AOc, X.HtJ, int):java.lang.Object");
    }

    public static final Object A02(PagerState pagerState, HtJ htJ) {
        Object objA00;
        return (pagerState.A0A.getValue() == AZ1.A00 && (objA00 = pagerState.A0G.A00(htJ)) == EnumC10460Hji.A02) ? objA00 : Unit.INSTANCE;
    }

    public static final void A04(C1133Abh c1133Abh, PagerState pagerState, boolean z, boolean z2) {
        List<AbZ> list;
        int i;
        AbZ abZ;
        List<AbZ> list2;
        int i2;
        AbZ abZ2;
        int iA01;
        int iA0I;
        C1229Af7 c1229Af7 = pagerState.A0J;
        List<AbZ> list3 = c1133Abh.A0H;
        c1229Af7.A00 = list3.size();
        int i3 = c1133Abh.A04;
        pagerState.A04 = c1133Abh.A05 + i3;
        if (z) {
            pagerState.A0C = true;
        } else if (pagerState.A0C) {
            pagerState.A09 = c1133Abh;
            return;
        }
        C1138Abq c1138Abq = pagerState.A0L;
        if (z2) {
            c1138Abq.A04.AdS(c1133Abh.A00);
        } else {
            AbZ abZ3 = c1133Abh.A0B;
            c1138Abq.A00 = abZ3 != null ? abZ3.A06 : null;
            if (c1138Abq.A01 || !list3.isEmpty()) {
                c1138Abq.A01 = true;
                int i4 = abZ3 != null ? abZ3.A03 : 0;
                float f = c1133Abh.A00;
                c1138Abq.A05.AdX(i4);
                c1138Abq.A02.A00(i4);
                c1138Abq.A04.AdS(f);
            }
            if (pagerState.A0D) {
                C1141Abt c1141Abt = pagerState.A0K;
                C1135Abl c1135Abl = c1141Abt.A01;
                c1135Abl.A01 = c1133Abh;
                c1135Abl.A00 = c1141Abt.A00;
                int i5 = c1141Abt.A06;
                if (i5 != -1) {
                    if (i5 != C8j4.A0I(c1135Abl.A02)) {
                        c1141Abt.A07 = true;
                        if (!C1133Abh.A00(c1135Abl)) {
                            int i6 = c1141Abt.A05;
                            int iA02 = 0;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            c1141Abt.A05 = i6;
                            if (!C1133Abh.A00(c1135Abl) && C8j4.A0I(r8) - 1 != -1) {
                                int i7 = ((Abu) c1141Abt).A03;
                                if (i7 <= iA0I) {
                                    iA0I = i7;
                                }
                                ((Abu) c1141Abt).A03 = iA0I;
                            }
                            if (((Abu) c1141Abt).A00 <= 0.0f) {
                                iA02 = c1135Abl.A02();
                                iA01 = ((Abu) c1141Abt).A01 - 1;
                            } else {
                                iA01 = c1135Abl.A01();
                            }
                            Abu.A02(c1141Abt, iA02, iA01);
                        }
                    }
                }
                Function0<Integer> function0 = c1135Abl.A02;
                ((Abu) c1141Abt).A01 = C8j4.A0I(function0);
                if (!C1133Abh.A00(c1135Abl)) {
                    int iA0L = C8j3.A0L(C1135Abl.A00(c1135Abl).A0F, C8j3.A0L(C1135Abl.A00(c1135Abl).A0H, C1135Abl.A00(c1135Abl).A0G.size()));
                    for (int i8 = 0; i8 < iA0L; i8++) {
                        int size = C1135Abl.A00(c1135Abl).A0G.size();
                        int size2 = C1135Abl.A00(c1135Abl).A0H.size();
                        if (i8 < size) {
                            abZ = C1135Abl.A00(c1135Abl).A0G.get(i8);
                        } else {
                            if (i8 < size + size2) {
                                list = C1135Abl.A00(c1135Abl).A0H;
                                i = i8 - size;
                            } else {
                                list = C1135Abl.A00(c1135Abl).A0F;
                                i = (i8 - size) - size2;
                            }
                            abZ = list.get(i);
                        }
                        int i9 = abZ.A03;
                        int size3 = C1135Abl.A00(c1135Abl).A0G.size();
                        int size4 = C1135Abl.A00(c1135Abl).A0H.size();
                        if (i8 < size3) {
                            abZ2 = C1135Abl.A00(c1135Abl).A0G.get(i8);
                        } else {
                            if (i8 < size3 + size4) {
                                list2 = C1135Abl.A00(c1135Abl).A0H;
                                i2 = i8 - size3;
                            } else {
                                list2 = C1135Abl.A00(c1135Abl).A0F;
                                i2 = (i8 - size3) - size4;
                            }
                            abZ2 = list2.get(i2);
                        }
                        Object obj = abZ2.A06;
                        int i10 = C1135Abl.A00(c1135Abl).A04;
                        if (i9 != -1) {
                            Ab2<C1140Abs> ab2 = c1141Abt.A0A;
                            if (ab2.A05(i9)) {
                                C1140Abs c1140AbsA04 = ab2.A04(i9);
                                C7384Etj.A0X(c1140AbsA04);
                                int i11 = c1140AbsA04.A00;
                                C1140Abs c1140AbsA042 = ab2.A04(i9);
                                C7384Etj.A0X(c1140AbsA042);
                                Object obj2 = c1140AbsA042.A01;
                                if (i11 != i10 || !C7384Etj.areEqual(obj2, obj)) {
                                    c1141Abt.A07 = true;
                                }
                            }
                            C1140Abs c1140AbsA043 = ab2.A04(i9);
                            if (c1140AbsA043 != null) {
                                c1140AbsA043.A00 = i10;
                                c1140AbsA043.A01 = obj;
                            } else {
                                c1140AbsA043 = new C1140Abs();
                                c1140AbsA043.A01 = obj;
                                c1140AbsA043.A00 = i10;
                            }
                            ab2.A0B(i9, c1140AbsA043);
                            c1141Abt.A05 = Math.min(c1141Abt.A05, i9);
                            ((Abu) c1141Abt).A03 = Math.max(((Abu) c1141Abt).A03, i9);
                            List<Ac3> listA07 = c1141Abt.A09.A07(i9);
                            if (listA07 != null) {
                                int size5 = listA07.size();
                                for (int i12 = 0; i12 < size5; i12++) {
                                    listA07.get(i12).cancel();
                                }
                            }
                        }
                    }
                    if (c1141Abt.A07) {
                        boolean z3 = ((Abu) c1141Abt).A00 <= 0.0f;
                        if (!C1133Abh.A00(c1135Abl)) {
                            C1135Abl.A00(c1135Abl);
                            Abu.A03(c1141Abt, c1135Abl, 0.0f, c1135Abl.A01(), c1135Abl.A02(), C1135Abl.A00(c1135Abl).A0E != null ? ((Ac0) c1141Abt.A0B).A00.A04 : 0, c1135Abl.A03(), c1135Abl.A04(), z3);
                        }
                        c1141Abt.A07 = false;
                    }
                } else {
                    c1141Abt.A04();
                }
                c1141Abt.A06 = C8j4.A0I(function0);
            }
        }
        MutableState<C1133Abh> mutableState = pagerState.A0A;
        mutableState.Af8(c1133Abh);
        MutableState.A09(c1133Abh.A0J, pagerState.A0P);
        AbZ abZ4 = c1133Abh.A0C;
        MutableState.A09(((abZ4 == null || abZ4.A03 == 0) && c1133Abh.A03 == 0) ? false : true, pagerState.A0O);
        if (abZ4 != null) {
            pagerState.A02 = abZ4.A03;
        }
        pagerState.A03 = c1133Abh.A03;
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            if (pagerState.A0D && c1133Abh.A02 < pagerState.A06()) {
                float f2 = pagerState.A01;
                if (Math.abs(f2) > 0.5f) {
                    EnumC1108AYu enumC1108AYu = C8j4.A0V(mutableState).A09;
                    EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
                    float fSignum = Math.signum(f2);
                    MutableState mutableState2 = pagerState.A0V;
                    if (fSignum == Math.signum(-C8j3.A05(C8j5.A0F(AWx.A07(mutableState2), enumC1108AYu, enumC1108AYu2))) || (((int) AnonymousClass003.A03(AWx.A07(mutableState2))) == 0 && ((int) AnonymousClass004.A00(AWx.A07(mutableState2))) == 0)) {
                        C1141Abt c1141Abt2 = pagerState.A0K;
                        float f3 = pagerState.A01;
                        C1135Abl c1135Abl2 = c1141Abt2.A01;
                        c1135Abl2.A01 = c1133Abh;
                        c1135Abl2.A00 = c1141Abt2.A00;
                        float f4 = -f3;
                        Abu.A01(c1141Abt2);
                        if (!C1133Abh.A00(c1135Abl2)) {
                            C1135Abl.A00(c1135Abl2);
                            C1135Abl.A00(c1135Abl2);
                            Function0<Integer> function02 = c1135Abl2.A02;
                            ((Abu) c1141Abt2).A01 = C8j4.A0I(function02);
                            int iA012 = c1135Abl2.A01();
                            int iA022 = c1135Abl2.A02();
                            int iA0I2 = C8j4.A0I(function02);
                            int iA04 = c1135Abl2.A04();
                            int iA03 = c1135Abl2.A03();
                            if (f4 <= 0.0f) {
                                int i13 = -iA04;
                                c1141Abt2.A04 = i13;
                                c1141Abt2.A05 = iA012;
                                while (i13 > 0 && iA012 > 0) {
                                    Ab2<C1140Abs> ab22 = c1141Abt2.A0A;
                                    if (!ab22.A05(iA012 - 1)) {
                                        break;
                                    }
                                    C1140Abs c1140AbsA044 = ab22.A04(iA012 - 1);
                                    C7384Etj.A0X(c1140AbsA044);
                                    int i14 = c1140AbsA044.A00;
                                    iA012 = c1141Abt2.A05 - 1;
                                    c1141Abt2.A05 = iA012;
                                    i13 = c1141Abt2.A04 - i14;
                                    c1141Abt2.A04 = i13;
                                }
                                Abu.A02(c1141Abt2, 0, iA012 - 1);
                            } else {
                                int i15 = -iA03;
                                ((Abu) c1141Abt2).A02 = i15;
                                ((Abu) c1141Abt2).A03 = iA022;
                                while (i15 > 0 && iA022 < iA0I2 - 1) {
                                    Ab2<C1140Abs> ab23 = c1141Abt2.A0A;
                                    if (!ab23.A05(iA022 + 1)) {
                                        break;
                                    }
                                    C1140Abs c1140AbsA045 = ab23.A04(iA022 + 1);
                                    C7384Etj.A0X(c1140AbsA045);
                                    int i16 = c1140AbsA045.A00;
                                    iA022 = ((Abu) c1141Abt2).A03 + 1;
                                    ((Abu) c1141Abt2).A03 = iA022;
                                    i15 = ((Abu) c1141Abt2).A02 - i16;
                                    ((Abu) c1141Abt2).A02 = i15;
                                }
                                Abu.A02(c1141Abt2, iA022 + 1, iA0I2 - 1);
                            }
                        }
                        if (!C1133Abh.A00(c1135Abl2)) {
                            C1135Abl.A00(c1135Abl2);
                            Abu.A03(c1141Abt2, c1135Abl2, f4, c1135Abl2.A01(), c1135Abl2.A02(), C1135Abl.A00(c1135Abl2).A0E != null ? ((Ac0) c1141Abt2.A0B).A00.A04 : 0, c1135Abl2.A03(), c1135Abl2.A04(), f4 <= 0.0f);
                        }
                        ((Abu) c1141Abt2).A00 = f4;
                        Abu.A01(c1141Abt2);
                    }
                }
            }
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            pagerState.A07 = AZ1.A00(c1133Abh, pagerState.A06());
            pagerState.A06();
            EnumC1108AYu enumC1108AYu3 = c1133Abh.A09;
            EnumC1108AYu enumC1108AYu4 = EnumC1108AYu.A02;
            InterfaceC1134Abi interfaceC1134Abi = c1133Abh.A0D;
            int iA0E = (int) C8j5.A0E(C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight()), enumC1108AYu3, enumC1108AYu4);
            long jA04 = ATD.A04(c1133Abh.A0A.AY9(iA0E, i3, -c1133Abh.A07, c1133Abh.A01), 0, iA0E);
            long j = pagerState.A07;
            if (jA04 > j) {
                jA04 = j;
            }
            pagerState.A08 = jA04;
        } catch (Throwable th) {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            throw th;
        }
    }

    public final float A05() {
        AXN axn = this.A0B;
        C1088AXy c1088AXy = AZ1.A01;
        float fAh4 = axn.Ah4(56.0f);
        MutableState<C1133Abh> mutableState = this.A0A;
        return Math.min(fAh4, mutableState.getValue().A04 / 2.0f) / mutableState.getValue().A04;
    }

    public final int A06() {
        return C8j4.A0I(((C9kj) this).A00.getValue());
    }

    public final int A07() {
        return this.A0L.A05.AGd();
    }

    public final int A08() {
        MutableState<C1133Abh> mutableState = this.A0A;
        return mutableState.getValue().A04 + mutableState.getValue().A05;
    }

    public final void A0A(int i, float f, boolean z) {
        C1138Abq c1138Abq = this.A0L;
        C00r c00r = c1138Abq.A05;
        if (c00r.AGd() != i || c1138Abq.A04.AFn() != f) {
            this.A0K.A04();
        }
        c00r.AdX(i);
        c1138Abq.A02.A00(i);
        c1138Abq.A04.AdS(f);
        c1138Abq.A00 = null;
        if (!z) {
            this.A0S.Af8(Unit.INSTANCE);
            return;
        }
        InterfaceC1147Ac5 interfaceC1147Ac5 = (InterfaceC1147Ac5) this.A0U.getValue();
        if (interfaceC1147Ac5 != null) {
            interfaceC1147Ac5.ABn();
        }
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A0E.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return MutableState.A0A(this.A0O);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return MutableState.A0A(this.A0P);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A0E.AOz();
    }

    public PagerState(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            AbstractC1061ATk.A00(FGI.A0R("currentPageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
            throw F60.createAndThrow();
        }
        AWx aWxA0B = AWx.A0B(0L);
        AGE age = AGE.A00;
        this.A0V = C3cG.A08(age, aWxA0B);
        this.A0L = new C1138Abq(this, f, i);
        this.A02 = i;
        this.A07 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        this.A0E = new C6XV(C2295BSv.A00(this, 44));
        this.A0D = true;
        C1133Abh c1133Abh = AZ1.A00;
        AGG agg = AGG.A00;
        this.A0A = C3cG.A08(agg, c1133Abh);
        this.A0B = AZ1.A01;
        this.A0F = new C1qN();
        this.A0M = new ParcelableSnapshotMutableIntState(-1);
        this.A0N = new ParcelableSnapshotMutableIntState(i);
        this.A0W = AbstractC1798ArH.A01(age, this, 38);
        this.A0a = AbstractC1798ArH.A01(age, this, 39);
        C2295BSv c2295BSvA00 = C2295BSv.A00(this, 45);
        C1229Af7 c1229Af7 = new C1229Af7();
        c1229Af7.A04 = c2295BSvA00;
        this.A0J = c1229Af7;
        Ac0 ac0 = new Ac0(this);
        this.A0Z = ac0;
        this.A0Y = new Ac2(this);
        this.A0K = new C1141Abt(ac0, c1229Af7, C2292BSs.A00(this, 40));
        this.A0H = new C1145Aby();
        this.A0G = new Av9();
        this.A0U = C3cG.A08(age, null);
        this.A0X = new C2289BSp(this, 3);
        AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0I = new A4A();
        Unit unit = Unit.INSTANCE;
        this.A0T = C3cG.A08(agg, unit);
        this.A0S = C3cG.A08(agg, unit);
        this.A0P = C3cG.A08(age, false);
        this.A0O = C3cG.A08(age, false);
        this.A0R = C3cG.A08(age, false);
        this.A0Q = C3cG.A08(age, false);
    }

    public static final int A00(PagerState pagerState, int i) {
        if (pagerState.A06() > 0) {
            return ATD.A04(i, 0, pagerState.A06() - 1);
        }
        return 0;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC1180Adj
    public final Object AcF(C3UY c3uy, HtJ htJ, G0V g0v) {
        return A01(c3uy, this, htJ, g0v);
    }

    public PagerState() {
        this(0.0f, 0);
    }
}
