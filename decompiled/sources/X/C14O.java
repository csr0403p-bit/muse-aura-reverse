package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.14O, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C14O {
    public static final HxE<List<C1733ApU<C1821Arl>>, List<C1733ApU<G0W<String, BFM, Integer, Unit>>>> A00;

    static {
        C0881AGi c0881AGi = C0881AGi.A00;
        A00 = new HxE<>(c0881AGi, c0881AGi);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;Ljava/util/List<LX/ApU<LX/G0W<Ljava/lang/String;LX/BFM;Ljava/lang/Integer;Lkotlin/Unit;>;>;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, ApQ apQ, List list, int i) {
        bfm.AgG(-1794596951);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, list);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1733ApU c1733ApU = (C1733ApU) list.get(i2);
                G0W g0w = (G0W) c1733ApU.A02;
                int i3 = c1733ApU.A01;
                int i4 = c1733ApU.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new InterfaceC1380AiA() { // from class: X.3Tf
                        @Override // X.InterfaceC1380AiA
                        public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list2, int i5) {
                            return AXQ.A00(c3tf, this, list2, i5);
                        }

                        @Override // X.InterfaceC1380AiA
                        public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list2, int i5) {
                            return AXQ.A01(c3tf, this, list2, i5);
                        }

                        @Override // X.InterfaceC1380AiA
                        /* renamed from: measure-3p2s80s */
                        public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list2, long j) {
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                arrayList.add(list2.get(i5).AQW(j));
                            }
                            return AnonymousClass002.A0X(axy, new C3bS(arrayList, 6), Constraints.A01(j), Constraints.A00(j));
                        }

                        @Override // X.InterfaceC1380AiA
                        public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list2, int i5) {
                            return AXQ.A02(c3tf, this, list2, i5);
                        }

                        @Override // X.InterfaceC1380AiA
                        public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list2, int i5) {
                            return AXQ.A03(c3tf, this, list2, i5);
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                BS0 bs0 = BRg.A00;
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, apQ.subSequence(i3, i4).A00, bfm, g0w, 0);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3bZ(apQ, list, i, 1);
        }
    }
}
