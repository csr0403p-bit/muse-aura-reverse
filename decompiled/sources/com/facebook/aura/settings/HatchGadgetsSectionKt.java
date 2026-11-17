package com.facebook.aura.settings;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC2022Awb;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C08R;
import X.C0953AJg;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1YL;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchGadgetsSectionKt {

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$GadgetDeviceRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ GadgetRow $gadget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NodeListEntry nodeListEntry, GadgetRow gadgetRow) {
            super(2);
            this.$device = nodeListEntry;
            this.$gadget = gadgetRow;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchDeviceRowPartsKt.DeviceStatusLine(this.$device, this.$gadget.gadgetId, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$GadgetDeviceRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ GadgetRow $gadget;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(GadgetRow gadgetRow, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$gadget = gadgetRow;
            this.$onDeviceClick = g0u;
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
            HatchGadgetsSectionKt.GadgetDeviceRow(this.$gadget, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$GadgetsSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HomeLinkOffer $offer;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ ConnectedDeviceSections $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConnectedDeviceSections connectedDeviceSections, HomeLinkOffer homeLinkOffer, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = connectedDeviceSections;
            this.$offer = homeLinkOffer;
            this.$onDeviceClick = g0u;
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
            HatchGadgetsSectionKt.GadgetsSection(this.$sections, this.$offer, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$GadgetsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HomeLinkOffer $offer;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ ConnectedDeviceSections $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ConnectedDeviceSections connectedDeviceSections, HomeLinkOffer homeLinkOffer, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = connectedDeviceSections;
            this.$offer = homeLinkOffer;
            this.$onDeviceClick = g0u;
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
            HatchGadgetsSectionKt.GadgetsSection(this.$sections, this.$offer, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$HomeLinkOfferCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135312 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HomeLinkOffer $offer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135312(HomeLinkOffer homeLinkOffer) {
            super(2);
            this.$offer = homeLinkOffer;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            float fLineHeightsDp;
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$offer.subtitle == null) {
                    fLineHeightsDp = HatchDeviceRowPartsKt.lineHeightsDp(new C1822Arm[]{AnonymousClass006.A0k(bfm, 170500919).subheadlineMedium}, bfm, 0);
                } else {
                    bfm.AgE(170600801);
                    AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                    fLineHeightsDp = HatchDeviceRowPartsKt.lineHeightsDp(new C1822Arm[]{AnonymousClass001.A0g(bfm, akh).subheadlineMedium, C06G.A0a(bfm, akh)}, bfm, 0) + AuraDimensKt.SpacingMicro;
                }
                AnonymousClass001.A1D(bfm);
                AKH<AuraColors> akh2 = AuraColorsKt.LocalAuraColors;
                HatchDeviceRowPartsKt.m1951DeviceIconSquareWSOZc8o(R.drawable.house_wght400_outline_24, fLineHeightsDp, null, AnonymousClass001.A0f(bfm, akh2).elevated, AnonymousClass001.A0f(bfm, akh2).accent, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$HomeLinkOfferCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C135323 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onClaim;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135323(Function0<Unit> function0) {
            super(3);
            this.$onClaim = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            C7384Etj.A0Y(c08r, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207af);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchGadgetsSectionKt$HomeLinkOfferCard$3$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0X = AnonymousClass001.A0X(bs0, objAaT);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = HatchGadgetsSectionKt$HomeLinkOfferCard$3$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, AbstractC2022Awb.A00(bRgA0X, (G0U) objAaT2), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, this.$onClaim, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$HomeLinkOfferCard$4, reason: invalid class name and case insensitive filesystem */
    public final class C135334 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HomeLinkOffer $offer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135334(HomeLinkOffer homeLinkOffer, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = homeLinkOffer;
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
            HatchGadgetsSectionKt.HomeLinkOfferCard(this.$offer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$MetaDevicesSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C135341 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0U<NodeListEntry, Boolean> $canRemoveDevice;
        public final /* synthetic */ AHD<NodeListEntry> $devices;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135341(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, G0U<? super NodeListEntry, Unit> g0u2, G0U<? super NodeListEntry, Boolean> g0u3, BRg bRg, int i, int i2) {
            super(2);
            this.$devices = ahd;
            this.$onDeviceClick = g0u;
            this.$onRemoveDevice = g0u2;
            this.$canRemoveDevice = g0u3;
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
            HatchGadgetsSectionKt.MetaDevicesSection(this.$devices, this.$onDeviceClick, this.$onRemoveDevice, this.$canRemoveDevice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$MetaDevicesSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C135353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0U<NodeListEntry, Boolean> $canRemoveDevice;
        public final /* synthetic */ AHD<NodeListEntry> $devices;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135353(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, G0U<? super NodeListEntry, Unit> g0u2, G0U<? super NodeListEntry, Boolean> g0u3, BRg bRg, int i, int i2) {
            super(2);
            this.$devices = ahd;
            this.$onDeviceClick = g0u;
            this.$onRemoveDevice = g0u2;
            this.$canRemoveDevice = g0u3;
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
            HatchGadgetsSectionKt.MetaDevicesSection(this.$devices, this.$onDeviceClick, this.$onRemoveDevice, this.$canRemoveDevice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void MetaDevicesSection(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, G0U<? super NodeListEntry, Unit> g0u2, G0U<? super NodeListEntry, Boolean> g0u3, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c135353;
        C7384Etj.A0Y(ahd, 0);
        AnonymousClass005.A11(g0u, g0u2, g0u3, 1);
        bfm.AgG(-1282748742);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c135353 = new C135341(ahd, g0u, g0u2, g0u3, bRg, i, i2);
                    bBbAAc.A06 = c135353;
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f1207b5);
            boolean zA67 = bfm.A67(ahd) | AnonymousClass003.A1C(iA0T) | AnonymousClass003.A1E(iA0T) | AnonymousClass004.A1K(iA0T);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGadgetsSectionKt$MetaDevicesSection$2$1$1(ahd, g0u, g0u3, g0u2);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0o(c90l, bfm, objAaT);
            C01N.A03(bfm, bbi, BRg.A00, AuraDimensKt.SpacingMedium);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c135353 = new C135353(ahd, g0u, g0u2, g0u3, bRg, i, i2);
            bBbAAc.A06 = c135353;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GadgetsSection(com.facebook.aura.settings.ConnectedDeviceSections r18, com.facebook.aura.settings.HomeLinkOffer r19, X.G0U<? super com.facebook.aura.nodes.json.NodeListEntry, kotlin.Unit> r20, X.BRg r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchGadgetsSectionKt.GadgetsSection(com.facebook.aura.settings.ConnectedDeviceSections, com.facebook.aura.settings.HomeLinkOffer, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void HomeLinkOfferCard(HomeLinkOffer homeLinkOffer, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1546379316);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(homeLinkOffer, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(homeLinkOffer))) {
                z = true;
            }
            boolean z2 = zA67 | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchGadgetsSectionKt$HomeLinkOfferCard$onClaim$1$1(auraNavigatorA0b, homeLinkOffer);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyles auraCardStyles = AuraCardStyles.INSTANCE;
            C1AC c1ac = C2VU.A04;
            long jA0D = C06G.A0D(bfm);
            AuraCardStyle auraCardStyleM2500listoAWOtXo = auraCardStyles.m2500listoAWOtXo(c1ac, HxS.A04(HDi.A0O[(int) (jA0D & 63)], B6A.A03(jA0D), B6A.A02(jA0D), B6A.A01(jA0D), 0.1f), null, bfm, 3078, 4);
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            String str = homeLinkOffer.title;
            String str2 = homeLinkOffer.subtitle;
            ApQ apQA0X = str2 != null ? AnonymousClass005.A0X(str2) : null;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleM2500listoAWOtXo, new AuraCardContent(str, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, 1, 1, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null), clickable, B1V.A00(bfm, new C135312(homeLinkOffer), -1214049520), B1V.A00(bfm, new C135323(function0), -275643961), function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 224256, 0, 262016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135334(homeLinkOffer, bRg2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void GadgetDeviceRow(GadgetRow gadgetRow, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        ?? A1W;
        bfm.AgG(-1063815337);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(gadgetRow, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            NodeListEntry nodeListEntry = gadgetRow.device;
            int iDeviceIconRes = HatchDeviceRowPartsKt.deviceIconRes(nodeListEntry);
            if (gadgetRow.gadgetId == null) {
                bfm.AgE(-124313296);
                boolean zA1W = AnonymousClass001.A1W(bfm);
                strA01 = nodeListEntry.displayName;
                A1W = zA1W;
                if (strA01.length() == 0) {
                    strA01 = nodeListEntry.nodeId;
                    A1W = zA1W;
                }
            } else {
                bfm.AgE(-124311945);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207b6);
                A1W = AnonymousClass001.A1W(bfm);
            }
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass2(nodeListEntry, gadgetRow), 857644752);
            boolean zA67 = bfm.A67(nodeListEntry) | AnonymousClass001.A1O(iA05);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGadgetsSectionKt$GadgetDeviceRow$3$1(nodeListEntry, g0u);
                bfm.Ai0(objAaT);
            }
            HatchDeviceRowPartsKt.DeviceRowCard(iDeviceIconRes, strA01, b1uA00, AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRg, (Function0) objAaT, null, A1W, null), A1W, bfm, 384, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(gadgetRow, g0u, bRg, i, i2);
        }
    }
}
