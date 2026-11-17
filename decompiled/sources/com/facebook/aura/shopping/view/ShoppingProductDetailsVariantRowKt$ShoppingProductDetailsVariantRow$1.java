package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0A8;
import X.C0Ig;
import X.C1110AYw;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantOptionState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantRow$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ float $contentInset;
    public final /* synthetic */ ShoppingProductDetailsVariantGroupState $group;
    public final /* synthetic */ G0V<String, String, Unit> $onSelect;
    public final /* synthetic */ int $optionCount;
    public final /* synthetic */ List<C1DG> $ownWidths;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ int $selectedIndex;
    public final /* synthetic */ float $totalOwnWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantRow$1(float f, int i, float f2, List<C1DG> list, C1110AYw c1110AYw, int i2, ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, G0V<? super String, ? super String, Unit> g0v) {
        super(3);
        this.$contentInset = f;
        this.$optionCount = i;
        this.$totalOwnWidth = f2;
        this.$ownWidths = list;
        this.$scrollState = c1110AYw;
        this.$selectedIndex = i2;
        this.$group = shoppingProductDetailsVariantGroupState;
        this.$onSelect = g0v;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        float fAHT = c0Ig.AHT() - (this.$contentInset * 2.0f);
        float f = ShoppingProductDetailsVariantRowKt.OptionSpacing;
        float f2 = fAHT - ((this.$optionCount - 1) * f);
        boolean zA1N = AnonymousClass002.A1N(C1DG.A01(this.$totalOwnWidth, f2));
        boolean zA65 = bfm.A65(this.$ownWidths) | bfm.A62(this.$totalOwnWidth) | bfm.A62(f2);
        List<C1DG> list = this.$ownWidths;
        float f3 = this.$totalOwnWidth;
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = ShoppingProductDetailsVariantRowKt.m2085rowFillingWidthsVpY3zN4(list, f3, f2);
            bfm.Ai0(objAaT);
        }
        List list2 = (List) objAaT;
        C1110AYw c1110AYw = this.$scrollState;
        Integer numValueOf = Integer.valueOf(this.$selectedIndex);
        if (!zA1N) {
            numValueOf = null;
        }
        ShoppingProductDetailsVariantRowKt.m2076CentreOnSelectionCGg2A0w(c1110AYw, list2, f, numValueOf, c0Ig.AHT(), this.$contentInset, this.$group.options, bfm, 384);
        BRg bRgA01 = BRg.A00;
        if (zA1N) {
            bRgA01 = AbstractC1103AYp.A01(this.$scrollState, bRgA01, true);
        }
        BRg bRgA07 = C3U4.A07(bRgA01, this.$contentInset);
        C9m9 c9m9A00 = AcQ.A00(f);
        ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState = this.$group;
        int i2 = this.$selectedIndex;
        G0V<String, String, Unit> g0v = this.$onSelect;
        InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, C2VU.A05, 6);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA012 = AxM.A01(bfm, bRgA07);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V != null) {
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            bfm.AgE(-2024679615);
            int i3 = 0;
            for (Object obj : shoppingProductDetailsVariantGroupState.options) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC0885AGm.A14();
                } else {
                    ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState = (ShoppingProductDetailsVariantOptionState) obj;
                    boolean zA1Q = AnonymousClass002.A1Q(i3, i2);
                    boolean zContains = shoppingProductDetailsVariantGroupState.availableOptionIds.contains(shoppingProductDetailsVariantOptionState.id);
                    String str = shoppingProductDetailsVariantOptionState.label;
                    float f4 = ((C1DG) list2.get(i3)).A00;
                    String strOptionDescription = ShoppingProductDetailsVariantRowKt.optionDescription(shoppingProductDetailsVariantGroupState, shoppingProductDetailsVariantOptionState, zA1Q, bfm, 0);
                    boolean zA1R = AnonymousClass005.A1R(bfm, g0v, shoppingProductDetailsVariantGroupState, shoppingProductDetailsVariantOptionState);
                    Object objAaT2 = bfm.AaT();
                    if (zA1R || objAaT2 == C78N.A00) {
                        objAaT2 = new ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantRow$1$2$1$1$1(g0v, shoppingProductDetailsVariantGroupState, shoppingProductDetailsVariantOptionState);
                        BBI.A0O(bbi, objAaT2);
                    }
                    ShoppingProductDetailsVariantRowKt.m2079VariantOptionChipEUb7tLY(str, f4, zA1Q, zContains, ShoppingProductDetailsVariantRowKt.variantOption(bRgA01, strOptionDescription, zA1Q, zContains, (Function0) objAaT2), bfm, 0, 0);
                    i3 = i4;
                }
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            return;
        }
        C00x.A00();
        throw F60.createAndThrow();
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
