package X;

import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0mt, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0mt {
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;LX/BA2;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BRg bRg, BA2 ba2, Function0 function0, G0V g0v, int i, int i2) {
        BRg bRg2 = bRg;
        BA2 ba22 = ba2;
        bfm.AgG(-1922902937);
        int iA0T = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, ba2);
        }
        if ((i2 & 8) != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((iA0T & 1171) == 1170 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                ba22 = new BA2(true, true, true);
            }
            C0n6.A00(bfm, ba22, function0, B1V.A00(bfm, new C05503bw(0, bRg2, g0v), 905289008), (iA0T & 14) | 384 | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3cA(g0v, function0, ba22, bRg2, i, i2, 0);
        }
    }

    static {
        new C1DP(24.0f, 24.0f, 24.0f, 24.0f);
        new C1DP(0.0f, 0.0f, 0.0f, 16.0f);
        new C1DP(0.0f, 0.0f, 0.0f, 16.0f);
        new C1DP(0.0f, 0.0f, 0.0f, 24.0f);
    }

    /* JADX WARN: Incorrect types in method signature: (FFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(BFM bfm, G0V g0v, final float f, final float f2, int i) {
        bfm.AgG(586821353);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA04 & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            boolean zA1Q = AnonymousClass002.A1Q(iA04 & 14, 4) | AnonymousClass001.A1N(iA04);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: X.3TY
                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        F1E f1e = new F1E();
                        F1E f1e2 = new F1E();
                        ArrayList arrayList4 = new ArrayList();
                        F1E f1e3 = new F1E();
                        F1E f1e4 = new F1E();
                        float f3 = f;
                        float f4 = f2;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            AZE azeAQW = list.get(i2).AQW(j);
                            if (!arrayList4.isEmpty() && f1e3.element + axy.Abr(f3) + azeAQW.A01 > Constraints.A01(j)) {
                                A00(axy, arrayList, arrayList4, arrayList2, arrayList3, f1e2, f1e4, f1e, f1e3, f4);
                            }
                            if (!arrayList4.isEmpty()) {
                                f1e3.element += axy.Abr(f3);
                            }
                            arrayList4.add(azeAQW);
                            f1e3.element += azeAQW.A01;
                            f1e4.element = Math.max(f1e4.element, azeAQW.A00);
                        }
                        if (!arrayList4.isEmpty()) {
                            A00(axy, arrayList, arrayList4, arrayList2, arrayList3, f1e2, f1e4, f1e, f1e3, f4);
                        }
                        int iMax = Math.max(f1e.element, Constraints.A03(j));
                        return AnonymousClass002.A0X(axy, new C05233Th(axy, arrayList, arrayList3, f3, iMax), iMax, Math.max(f1e2.element, Constraints.A02(j)));
                    }

                    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/util/List<LX/AZE;>;>;LX/F1E;LX/AXY;FLjava/util/List<LX/AZE;>;Ljava/util/List<Ljava/lang/Integer;>;LX/F1E;Ljava/util/List<Ljava/lang/Integer;>;LX/F1E;LX/F1E;)V */
                    public static final void A00(AXY axy, List list, List list2, List list3, List list4, F1E f1e, F1E f1e2, F1E f1e3, F1E f1e4, float f3) {
                        if (!list.isEmpty()) {
                            f1e.element += axy.Abr(f3);
                        }
                        list.add(0, AbstractC0878AGe.A0X(list2));
                        list3.add(Integer.valueOf(f1e2.element));
                        list4.add(Integer.valueOf(f1e.element));
                        f1e.element += f1e2.element;
                        f1e3.element = Math.max(f1e3.element, f1e4.element);
                        list2.clear();
                        f1e4.element = 0;
                        f1e2.element = 0;
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i2) {
                        return AXQ.A00(c3tf, this, list, i2);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i2) {
                        return AXQ.A01(c3tf, this, list, i2);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i2) {
                        return AXQ.A02(c3tf, this, list, i2);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i2) {
                        return AXQ.A03(c3tf, this, list, i2);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BS0 bs0 = BRg.A00;
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            int i2 = ((((iA04 >> 6) & 14) << 6) & 896) | 6;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, objAaT, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D)) {
                AnonymousClass006.A1U(g0v2, bfm, iA0D);
            }
            AnonymousClass001.A16(bfm, bRgA01);
            AnonymousClass005.A0q(bbi, bfm, g0v, i2 >> 6);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C0mu(g0v, f, f2, i);
        }
    }
}
