package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.pager.PagerState;
import java.util.HashSet;

/* renamed from: X.AfU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1238AfU extends AbstractC1439Aj8 implements C1DO, InterfaceC1348AhZ, InterfaceC1356Ahh, InterfaceC1476Ajj, InterfaceC1448AjH, InterfaceC1219Aex, InterfaceC1403AiY, InterfaceC1449AjI, InterfaceC1332AhJ, InterfaceC1487Aju, AnW, InterfaceC1411Aig, ASY {
    public AbB A00;
    public HashSet<ARR<?>> A01;
    public InterfaceC1497Ak4 A02;

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final void AVH(long j) {
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        A00(this, true);
    }

    public static final void A00(C1238AfU c1238AfU, boolean z) {
        if (!c1238AfU.isAttached) {
            ASP.A01("initializeModifier called on unattached node");
            throw F60.createAndThrow();
        }
        AbB abB = c1238AfU.A00;
        if ((c1238AfU.kindSet & 4) != 0 && !z) {
            AbstractC1414Aij.A06(c1238AfU, 2).A0n();
        }
        if ((c1238AfU.kindSet & 2) != 0) {
            AbstractC1439Aj8 abstractC1439Aj8 = AbstractC1414Aij.A04(c1238AfU).A0f.A06;
            C7384Etj.A0Z(abstractC1439Aj8, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (((C1241AfX) abstractC1439Aj8).A00) {
                AbstractC1387AiH abstractC1387AiH = c1238AfU.coordinator;
                C7384Etj.A0X(abstractC1387AiH);
                ((C1354Ahf) abstractC1387AiH).A11(c1238AfU);
                InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH.A0A;
                if (interfaceC1402AiX != null) {
                    interfaceC1402AiX.invalidate();
                }
            }
            if (!z) {
                AbstractC1414Aij.A06(c1238AfU, 2).A0n();
                AbstractC1414Aij.A04(c1238AfU).A0K();
            }
        }
        if (abB instanceof InterfaceC1195AeC) {
            C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1238AfU);
            C2289BSp c2289BSp = (C2289BSp) ((InterfaceC1195AeC) abB);
            switch (c2289BSp.$t) {
                case 0:
                    LazyListState lazyListState = (LazyListState) c2289BSp.A00;
                    AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                    lazyListState.A02 = c1453AjMA04;
                    break;
                case 1:
                    LazyGridState lazyGridState = (LazyGridState) c2289BSp.A00;
                    AFs<LazyGridState, ?> aFs2 = LazyGridState.A0O;
                    lazyGridState.A02 = c1453AjMA04;
                    break;
                case 2:
                    LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) c2289BSp.A00;
                    AFs<LazyStaggeredGridState, Object> aFs3 = LazyStaggeredGridState.A0N;
                    lazyStaggeredGridState.A03 = c1453AjMA04;
                    break;
                default:
                    ((PagerState) c2289BSp.A00).A0U.Af8(c1453AjMA04);
                    break;
            }
        }
        if ((256 & c1238AfU.kindSet) != 0 && (abB instanceof AbF)) {
            AbstractC1439Aj8 abstractC1439Aj82 = AbstractC1414Aij.A04(c1238AfU).A0f.A06;
            C7384Etj.A0Z(abstractC1439Aj82, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (((C1241AfX) abstractC1439Aj82).A00) {
                AbstractC1414Aij.A04(c1238AfU).A0K();
            }
        }
        int i = c1238AfU.kindSet;
        if ((i & 16) != 0 && (abB instanceof InterfaceC1243Afa)) {
            ((C1244Afb) ((InterfaceC1243Afa) abB)).A03.A01 = c1238AfU.coordinator;
        }
        if ((i & 8) != 0) {
            AbstractC1414Aij.A07(c1238AfU).AVj();
        }
    }

    @Override // X.InterfaceC1449AjI
    public final void A4V(AkZ akZ) {
        ASP.A01("applyFocusProperties called on wrong node");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        char c;
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C0919AHv c0919AHvAKL = ((AbD) abB).AKL();
        C7384Etj.A0Z(interfaceC0857A6e, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C0919AHv c0919AHv = (C0919AHv) interfaceC0857A6e;
        if (c0919AHvAKL.A01) {
            c0919AHv.A01 = true;
        }
        if (c0919AHvAKL.A00) {
            c0919AHv.A00 = true;
        }
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHvAKL.A03;
        Object[] objArr = c0918AHu.A04;
        Object[] objArr2 = c0918AHu.A05;
        long[] jArr = c0918AHu.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA07 = C8j4.A07(i, length);
                for (int i2 = 0; i2 < iA07; i2++) {
                    if ((255 & j) < 128) {
                        int i3 = (i << 3) + i2;
                        Object obj = objArr[i3];
                        Object obj2 = objArr2[i3];
                        C0918AHu<C0920AHw<?>, Object> c0918AHu2 = c0919AHv.A03;
                        if (!c0918AHu2.A06(obj)) {
                            c0918AHu2.A0E(obj, obj2);
                        } else if (obj2 instanceof C0864A6l) {
                            Object objA05 = c0918AHu2.A05(obj);
                            C7384Etj.A0Z(objA05, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C0864A6l c0864A6l = (C0864A6l) objA05;
                            String str = c0864A6l.A00;
                            if (str == null) {
                                str = ((C0864A6l) obj2).A00;
                            }
                            c = '\b';
                            Ht9 ht9 = c0864A6l.A01;
                            if (ht9 == null) {
                                ht9 = ((C0864A6l) obj2).A01;
                            }
                            c0918AHu2.A0E(obj, new C0864A6l(str, ht9));
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                    }
                    j >>= c;
                }
                if (iA07 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // X.InterfaceC1219Aex
    public final <T> T AEO(ARR<T> arr) {
        this.A01.add(arr);
        AbstractC1439Aj8 abstractC1439Aj8 = this.node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitAncestors called on an unattached node");
            throw F60.createAndThrow();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(this);
        if (c1453AjMA04 != null) {
            while (true) {
                if ((c1453AjMA04.A0f.A02.aggregateChildKindSet & 32) != 0) {
                    while (abstractC1439Aj82 != null) {
                        if ((abstractC1439Aj82.kindSet & 32) != 0) {
                            AbstractC1437Aj6 abstractC1437Aj6A0X = abstractC1439Aj82;
                            C0910AHm c0910AHmA0K = null;
                            do {
                                if (abstractC1437Aj6A0X instanceof InterfaceC1219Aex) {
                                    ARP arpAJE = ((InterfaceC1219Aex) abstractC1437Aj6A0X).AJE();
                                    if (arpAJE.A02(arr)) {
                                        return (T) arpAJE.A00(arr);
                                    }
                                } else if ((abstractC1437Aj6A0X.kindSet & 32) != 0 && (abstractC1437Aj6A0X instanceof AbstractC1437Aj6)) {
                                    AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A0X.A00;
                                    int i = 0;
                                    abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                    while (abstractC1439Aj83 != null) {
                                        if ((abstractC1439Aj83.kindSet & 32) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC1437Aj6A0X = abstractC1439Aj83;
                                            } else {
                                                c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                                abstractC1437Aj6A0X = C8j4.A0X(c0910AHmA0K, abstractC1437Aj6A0X);
                                                c0910AHmA0K.A0G(abstractC1439Aj83);
                                            }
                                        }
                                        abstractC1439Aj83 = abstractC1439Aj83.child;
                                        abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC1437Aj6A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                            } while (abstractC1437Aj6A0X != 0);
                        }
                        abstractC1439Aj82 = abstractC1439Aj82.parent;
                    }
                }
                c1453AjMA04 = c1453AjMA04.A0E();
                if (c1453AjMA04 == null) {
                    break;
                }
                C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
                abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
            }
        }
        return arr.A00.invoke();
    }

    @Override // X.InterfaceC1219Aex
    public final ARP AJE() {
        return ARN.A00;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.C1DO
    public final long AKb() {
        return AQY.A01(((AZE) AbstractC1414Aij.A06(this, 128)).A03);
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.AnW
    public final boolean APE() {
        return this.isAttached;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        Integer num = C79.A01;
        return ((InterfaceC1240AfW) abB).AQV(AXP.A00(c3tf), new AXT(c3Tr, num, num), AYL.A04(i)).getHeight();
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1240AfW) abB).AQV(AXP.A00(c3tf), new AXT(c3Tr, C79.A01, C79.A00), AYL.A03(i)).getWidth();
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1240AfW) abB).AQV(axy, c3tg, j);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1240AfW) abB).AQV(AXP.A00(c3tf), new AXT(c3Tr, C79.A00, C79.A01), AYL.A04(i)).getHeight();
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        Integer num = C79.A00;
        return ((InterfaceC1240AfW) abB).AQV(AXP.A00(c3tf), new AXT(c3Tr, num, num), AYL.A03(i)).getWidth();
    }

    @Override // X.InterfaceC1411Aig
    public final Object AQs(Object obj) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return abB;
    }

    @Override // X.InterfaceC1448AjH
    public final void ATP(C2Um c2Um) {
        ASP.A01("onFocusEvent called on wrong node");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((AVg) ((AbF) abB)).A06.ATW(interfaceC1497Ak4);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C1239AfV) ((InterfaceC1242AfZ) abB)).A00.A9V(c16z);
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final boolean interceptOutOfBoundsChildEvents() {
        C7384Etj.A0Z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        AbB abB = this.A00;
        C7384Etj.A0Z(abB, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C1245Afc c1245Afc = ((C1244Afb) ((InterfaceC1243Afa) abB)).A03;
        if (c1245Afc.A02 == C79.A01) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1244Afb c1244Afb = c1245Afc.A03;
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            G0U<? super MotionEvent, Boolean> g0u = c1244Afb.A01;
            if (g0u == null) {
                C7384Etj.A0b("onTouchEvent");
                throw F60.createAndThrow();
            }
            g0u.invoke(motionEventObtain);
            motionEventObtain.recycle();
            c1245Afc.A02 = C79.A00;
            c1244Afb.A02 = false;
            c1245Afc.A00 = null;
        }
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        if (this.A00 instanceof InterfaceC1243Afa) {
            onViewConfigurationChange();
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        if (!this.isAttached) {
            ASP.A01("unInitializeModifier called on unattached node");
            throw F60.createAndThrow();
        }
        if ((this.kindSet & 8) != 0) {
            AbstractC1414Aij.A07(this).AVj();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13onPointerEventH0pRuoY(X.C1247Afe r11, X.EnumC1080AXj r12, long r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1238AfU.mo13onPointerEventH0pRuoY(X.Afe, X.AXj, long):void");
    }

    @Override // X.InterfaceC1348AhZ
    public final boolean sharePointerInputWithSiblings() {
        C7384Etj.A0Z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return true;
    }

    public final String toString() {
        return this.A00.toString();
    }

    @Override // X.C1DO
    public final AXN getDensity() {
        return AbstractC1414Aij.A08(this);
    }

    @Override // X.C1DO
    public final EnumC1820Arj getLayoutDirection() {
        return AbstractC1414Aij.A04(this).A0G;
    }

    @Override // X.InterfaceC1332AhJ
    public final void onMeasureResultChanged() {
        AaD.A00(this);
    }

    @Override // X.InterfaceC1403AiY
    public final void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A02 = interfaceC1497Ak4;
    }
}
