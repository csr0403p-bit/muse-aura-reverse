package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.07w, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C07w {
    public static final void A00(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1854833411);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: X.3Te
                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i4) {
                        return AXQ.A00(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i4) {
                        return AXQ.A01(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int iMax = 0;
                        int iMax2 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            AZE azeAQW = list.get(i4).AQW(j);
                            iMax = Math.max(iMax, azeAQW.A01);
                            iMax2 = Math.max(iMax2, azeAQW.A00);
                            arrayList.add(azeAQW);
                        }
                        return AnonymousClass002.A0X(axy, new C3bS(arrayList, 10), iMax, iMax2);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i4) {
                        return AXQ.A02(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i4) {
                        return AXQ.A03(c3tf, this, list, i4);
                    }
                };
                bfm.Ai0(objAaT);
            }
            int i4 = ((iA0d >> 3) & 14) | 384 | ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            int i5 = ((i4 << 6) & 896) | 6;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, i5 >> 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3ba(bRg2, g0v, i, i2, 1);
        }
    }
}
