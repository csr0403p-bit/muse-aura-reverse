package com.facebook.aura.shopping.view;

import X.AKH;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.shopping.model.PdpAttribute;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchProductDetailsDetailsSectionKt {

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsDetailsSectionKt$HatchProductDetailsDetailsSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<PdpAttribute> $attributes;
        public final /* synthetic */ String $categoryName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<PdpAttribute> list, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$attributes = list;
            this.$categoryName = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductDetailsDetailsSectionKt.HatchProductDetailsDetailsSection(this.$attributes, this.$categoryName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsDetailsSectionKt$HatchProductDetailsDetailsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<PdpAttribute> $attributes;
        public final /* synthetic */ String $categoryName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<PdpAttribute> list, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$attributes = list;
            this.$categoryName = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductDetailsDetailsSectionKt.HatchProductDetailsDetailsSection(this.$attributes, this.$categoryName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchProductDetailsDetailsSection(List<PdpAttribute> list, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BBI bbiA0M;
        PdpAttribute pdpAttribute;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(list, 0);
        bfm.AgG(768387255);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (str == null || C7BY.A0j(str)) {
                bbiA0M = AnonymousClass002.A0M(bfm, -1150745287);
                pdpAttribute = null;
            } else {
                bfm.AgE(-1150745286);
                pdpAttribute = new PdpAttribute(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc1), str);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            List listA0z = AbstractC0885AGm.A0z(pdpAttribute);
            ArrayList arrayList = new ArrayList();
            for (PdpAttribute pdpAttribute2 : list) {
                PdpAttribute pdpAttribute3 = pdpAttribute2;
                if (!C7BY.A0j(pdpAttribute3.label)) {
                    AnonymousClass006.A1F(pdpAttribute3.value, pdpAttribute2, arrayList);
                }
            }
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayList, listA0z);
            if (arrayListA0P.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(list, str, bRgA0Q, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            long j = bbiA0M.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc2);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchProductDetailsDetailsSectionKt$HatchProductDetailsDetailsSection$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0Y, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            bfm.AgE(-823028511);
            Iterator it = arrayListA0P.iterator();
            while (it.hasNext()) {
                PdpAttribute pdpAttribute4 = (PdpAttribute) it.next();
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
                int iA0D = AnonymousClass001.A0D(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbiA0M, function0);
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(pdpAttribute4.label, null, auraColorsA0c.secondaryText, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
                AuraTextKt.m2639AuraTextUY9GdpU(pdpAttribute4.value, null, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbiA0M, true);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA0M, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(list, str, bRgA0Q, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
