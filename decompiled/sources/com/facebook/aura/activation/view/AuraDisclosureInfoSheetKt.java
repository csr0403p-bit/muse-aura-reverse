package com.facebook.aura.activation.view;

import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraDisclosureInfoSheetKt {

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
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
            AuraDisclosureInfoSheetKt.AuraDisclosureInfoSheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraDisclosureViewModel.InfoBanner $banner;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraDisclosureViewModel.InfoBanner infoBanner, AuraNavigator auraNavigator) {
            super(2);
            this.$banner = infoBanner;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraDisclosureViewModel.InfoBanner infoBanner = this.$banner;
                AuraNavigator auraNavigator = this.$navigator;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                String str = infoBanner.closeText;
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                boolean zA67 = bfm.A67(auraNavigator);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$3$1$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, C3U4.A0B(C10G.A02, AuraDimensKt.SpacingLargePlusMicro, AuraDimensKt.SpacingSmall), null, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201301);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraDisclosureViewModel.InfoBanner $banner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AuraDisclosureViewModel.InfoBanner infoBanner) {
            super(3);
            this.$banner = infoBanner;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingLargePlusMicro + AuraDimensKt.SpacingMicro);
                BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingLarge);
                AuraDisclosureViewModel.InfoBanner infoBanner = this.$banner;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                bfm.AgE(-1852510930);
                Iterator it = infoBanner.sections.iterator();
                while (it.hasNext()) {
                    AuraDisclosureInfoSheetKt.InfoSheetSectionContent((AuraDisclosureViewModel.InfoSheetSection) it.next(), null, bfm, 0, 2);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
            super(2);
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
            AuraDisclosureInfoSheetKt.AuraDisclosureInfoSheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoSheetKt$InfoSheetSectionContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C107012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraDisclosureViewModel.InfoSheetSection $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107012(AuraDisclosureViewModel.InfoSheetSection infoSheetSection, BRg bRg, int i, int i2) {
            super(2);
            this.$section = infoSheetSection;
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
            AuraDisclosureInfoSheetKt.InfoSheetSectionContent(this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraDisclosureInfoSheet(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(1181342326);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            AuraDisclosureViewModel.Factory factory = new AuraDisclosureViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AuraDisclosureViewModel.InfoBanner infoBanner = ((AuraDisclosureViewModel.UiState) C1BO.A07(bfm, ((AuraDisclosureViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(AuraDisclosureViewModel.class))).uiState)).infoBanner;
            if (infoBanner == null) {
                bfm.AgE(407592271);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraDisclosureInfoSheetKt$AuraDisclosureInfoSheet$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 407712396);
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, B1V.A00(bfm, new AnonymousClass3(infoBanner, auraNavigatorA0b), 1779960751), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(infoBanner), -1923196813), bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 48, 2029);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    public static final void InfoSheetSectionContent(AuraDisclosureViewModel.InfoSheetSection infoSheetSection, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1590385732);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, infoSheetSection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicro);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String str = infoSheetSection.title;
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraDisclosureInfoSheetKt$InfoSheetSectionContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA0C, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraDisclosureViewModel.SubscriptionLegalText subscriptionLegalText = infoSheetSection.body;
            HatchLinkTextKt.m1188HatchLinkText10k_G_c(subscriptionLegalText.text, subscriptionLegalText.links, null, AnonymousClass002.A0f(bfm).getSubheadlineCompactRegular(), C06G.A08(bfm), null, null, false, bfm, HatchTextLink.$stable << 3, 228);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107012(infoSheetSection, bRg2, i, i2);
        }
    }
}
