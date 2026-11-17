package X;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0n6, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0n6 {
    public static final void A01(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1090521195);
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
                objAaT = new InterfaceC1380AiA() { // from class: X.3Td
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
                        int iA03 = 0;
                        int iA02 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            AZE azeAQW = list.get(i4).AQW(j);
                            iA03 = Math.max(iA03, azeAQW.A01);
                            iA02 = Math.max(iA02, azeAQW.A00);
                            arrayList.add(azeAQW);
                        }
                        if (list.isEmpty()) {
                            iA03 = Constraints.A03(j);
                            iA02 = Constraints.A02(j);
                        }
                        return AnonymousClass002.A0X(axy, new C05463bs(arrayList, 22), iA03, iA02);
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
            bBbAAc.A06 = new C3c2(bRg2, i, g0v, i2, 2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA2;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BA2 ba2, Function0 function0, G0V g0v, int i, int i2) {
        boolean z;
        Object obj;
        BA2 ba22 = ba2;
        bfm.AgG(826668973);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, ba22);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                ba22 = new BA2(true, true, true);
            }
            View viewA0J = AnonymousClass001.A0J(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) bfm.A6v(Am0.A0A);
            BBM bbmA5U = bfm.A5U();
            MutableState mutableStateA00 = C1er.A00(bfm, g0v);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj2 = C78N.A00;
            if (objAaT == obj2) {
                objAaT = new C05443bq(14);
                bfm.Ai0(objAaT);
            }
            UUID uuid = (UUID) AFz.A03(bfm, (Function0) objAaT, objArr);
            boolean zA1W = AnonymousClass002.A1W(bfm, null, bfm.A63(2), AnonymousClass003.A1K(bfm, viewA0J, axnA0Y));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj2) {
                BA0 ba0 = new BA0(viewA0J, axnA0Y, enumC1820Arj, ba22, uuid, function0);
                z = true;
                B1U b1uA01 = B1V.A01(new C05473bt(mutableStateA00, 13), -1338939603, true);
                B1N b1n = ba0.A04;
                b1n.setParentCompositionContext(bbmA5U);
                b1n.A05.Af8(b1uA01);
                b1n.A02 = true;
                b1n.A0B();
                bfm.Ai0(ba0);
                obj = ba0;
            } else {
                z = true;
                obj = objAaT2;
            }
            boolean zA67 = bfm.A67(obj);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj2) {
                objAaT3 = new C2326BUa(obj, 9);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, obj);
            boolean zA672 = bfm.A67(obj) | AnonymousClass004.A1F(iA0T);
            if ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32) {
                z = false;
            }
            boolean zA1H = AnonymousClass003.A1H(bfm, enumC1820Arj, zA672 | z);
            Object objAaT4 = bfm.AaT();
            if (zA1H || objAaT4 == obj2) {
                objAaT4 = new C3c9(enumC1820Arj, ba22, obj, function0, 3);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A15(bfm, objAaT4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c7(function0, g0v, ba22, i, i2, 1);
        }
    }
}
