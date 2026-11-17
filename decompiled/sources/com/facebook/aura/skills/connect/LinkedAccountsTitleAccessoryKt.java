package com.facebook.aura.skills.connect;

import X.AHD;
import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.components.reactions.AuraSingleTearKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.LinkedAccountsChipLabel;
import com.facebook.aura.skills.connect.LinkedAccountsTitle;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class LinkedAccountsTitleAccessoryKt {

    /* renamed from: com.facebook.aura.skills.connect.LinkedAccountsTitleAccessoryKt$AddAccountPill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            LinkedAccountsTitleAccessoryKt.AddAccountPill(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$2, reason: invalid class name and case insensitive filesystem */
    public final class C137892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LinkedAccountsTitle.Chip $chip;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ G0U<String, Unit> $onToggleAccount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137892(LinkedAccountsTitle.Chip chip, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$chip = chip;
            this.$enabled = z;
            this.$onToggleAccount = g0u;
            this.$onOpen = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            LinkedAccountsTitleAccessoryKt.LinkedAccountsChip(this.$chip, this.$enabled, this.$onToggleAccount, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.LinkedAccountsTitleAccessoryKt$LinkedAccountsTitleAccessory$2, reason: invalid class name and case insensitive filesystem */
    public final class C137902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddAccount;
        public final /* synthetic */ Function0<Unit> $onOpenAccounts;
        public final /* synthetic */ G0U<String, Unit> $onToggleAccount;
        public final /* synthetic */ LinkedAccountsTitle $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137902(LinkedAccountsTitle linkedAccountsTitle, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = linkedAccountsTitle;
            this.$enabled = z;
            this.$onAddAccount = function0;
            this.$onToggleAccount = g0u;
            this.$onOpenAccounts = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            LinkedAccountsTitleAccessoryKt.LinkedAccountsTitleAccessory(this.$title, this.$enabled, this.$onAddAccount, this.$onToggleAccount, this.$onOpenAccounts, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.LinkedAccountsTitleAccessoryKt$SelectedAccountsFacepile$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<String> $photoUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<String> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$photoUrls = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            LinkedAccountsTitleAccessoryKt.SelectedAccountsFacepile(this.$photoUrls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AddAccountPill(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(471532715);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            BRg bRgA03 = C11U.A03(bRg2, C1D8.A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA04 = C0v5.A04(C1b8.A01(bRgA03, C60R.A04(bfm, auraTheme)), C3cG.A0A(0), null, function0, true);
            float f = AuraDimensKt.SpacingMicroPlusNano;
            BRg bRgA0C = C3U4.A0C(bRgA04, f, f, AuraDimensKt.SpacingXsmall, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.circleplus_filled_24_wght400, 0), 14.0f, null, auraTheme.getColors(bfm, 6).link, null, bfm, AnonymousClass001.A03(), 41);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f89), null, auraTheme.getColors(bfm, 6).link, auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void LinkedAccountsChip(LinkedAccountsTitle.Chip chip, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0Y;
        BRg bRg2 = bRg;
        bfm.AgG(930810680);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(chip, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1C = AnonymousClass003.A1C(iA05);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C11U.A03(bs0, C1D8.A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA012 = C1b8.A01(bRgA03, C60R.A04(bfm, auraTheme));
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8a);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1Q = AnonymousClass002.A1Q(iA05 & 7168, 2048) | bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == C78N.A00) {
                objAaT2 = new LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA04 = C0v5.A04(bRgA012, c1ydA0A, strA01, (Function0) objAaT2, z);
            float f = AuraProfilePictureStyle.Small;
            float f2 = AuraDimensKt.SpacingMicroPlusNano;
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0U(bRgA04, f + (2.0f * f2)), chip.photoUrls.isEmpty() ? AuraDimensKt.SpacingXsmall : f2, f2, AuraDimensKt.SpacingXsmall, f2);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingMicro), bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            if (chip.photoUrls.isEmpty()) {
                bfm.AgE(-594340672);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-594407942);
                SelectedAccountsFacepile(chip.photoUrls, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, false);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingNano), bfm, c1ac, 48);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            LinkedAccountsChipLabel linkedAccountsChipLabel = chip.label;
            if (C7384Etj.areEqual(linkedAccountsChipLabel, LinkedAccountsChipLabel.ChooseAccounts.INSTANCE)) {
                bfm.AgE(-1644949159);
                strA0Y = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120f8a);
            } else if (linkedAccountsChipLabel instanceof LinkedAccountsChipLabel.AccountName) {
                bfm.AgE(-1644945430);
                BBI.A0R(bbi, false);
                strA0Y = ((LinkedAccountsChipLabel.AccountName) linkedAccountsChipLabel).name;
            } else {
                if (!(linkedAccountsChipLabel instanceof LinkedAccountsChipLabel.AccountCount)) {
                    throw AnonymousClass003.A0k(bfm, bbi, -1644952325);
                }
                bfm.AgE(-1644942423);
                strA0Y = AnonymousClass007.A0Y(((LinkedAccountsChipLabel.AccountCount) linkedAccountsChipLabel).count, bfm, R.plurals._name_removed__res_0x7f100039);
                BBI.A0R(bbi, false);
            }
            boolean z2 = true;
            String str = strA0Y;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, false), C3cH.A06(bfm, auraTheme), C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24, 0), AuraIconSize.X_TINY, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BRg bRgAQJ = c0z7.AQJ(bs0);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1K = AnonymousClass004.A1K(iA05);
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(chip))) {
                z2 = false;
            }
            boolean z3 = zA1K | z2;
            Object objAaT3 = bfm.AaT();
            if (z3 || objAaT3 == C78N.A00) {
                objAaT3 = new LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$3$1(g0u, chip);
                bfm.Ai0(objAaT3);
            }
            G0U g0u3 = (G0U) objAaT3;
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == C78N.A00) {
                objAaT4 = new LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$4$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u3, (Function0) objAaT4, zA0A, null, 0L, null, false, new LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$5(chip), false, null, null, null, false, bfm, 0, 0, 16112);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137892(chip, z, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void LinkedAccountsTitleAccessory(LinkedAccountsTitle linkedAccountsTitle, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(linkedAccountsTitle, function0, g0u, 0);
        C7384Etj.A0Y(function02, 4);
        bfm.AgG(-1894675647);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(linkedAccountsTitle, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (linkedAccountsTitle.equals(LinkedAccountsTitle.AddAccount.INSTANCE)) {
                bfm.AgE(282845852);
                AddAccountPill(function0, bRg2, bfm, ((iA05 >> 6) & 14) | ((iA05 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            } else if (linkedAccountsTitle.equals(LinkedAccountsTitle.Loading.INSTANCE)) {
                bfm.AgE(178396159);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d3b);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
                long jA07 = C3cH.A07(bfm, auraTheme);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = LinkedAccountsTitleAccessoryKt$LinkedAccountsTitleAccessory$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRg2, (G0U) objAaT, false), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else if (linkedAccountsTitle instanceof LinkedAccountsTitle.Chip) {
                bfm.AgE(282859980);
                int i4 = LinkedAccountsTitle.Chip.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                int i5 = iA05 >> 3;
                LinkedAccountsChip((LinkedAccountsTitle.Chip) linkedAccountsTitle, z, g0u, function02, bRg2, bfm, AnonymousClass003.A07(i5, i4 | (i5 & 896)), 0);
            } else {
                if (!linkedAccountsTitle.equals(LinkedAccountsTitle.None.INSTANCE)) {
                    throw AnonymousClass005.A0k(bfm, 282844829);
                }
                bfm.AgE(178952671);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137902(linkedAccountsTitle, z, function0, g0u, function02, bRg2, i, i2);
        }
    }

    public static final void SelectedAccountsFacepile(AHD<String> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(575458686);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = LinkedAccountsTitleAccessoryKt$SelectedAccountsFacepile$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = ARD.A00(bRg2, (G0U) objAaT);
            float f = AuraDimensKt.SpacingMicroPlusNano;
            float f2 = AuraProfilePictureStyle.Small;
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f - f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1985579456);
            while (itA0w.hasNext()) {
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(AnonymousClass005.A0j(itA0w), f2, null, null, null, null, null, null, null, null, 0.0f, bfm, 0, 6, AuraSingleTearKt.SINGLE_TEAR_TOTAL_MS);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(ahd, bRg2, i, i2);
        }
    }
}
