package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0M7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DM;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginTransparencySheetKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencyGuidance$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            NativeLoginTransparencySheetKt.NativeLoginTransparencyGuidance(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencyProfiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C125861 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ List<NativeLoginProfileUiModel> $profiles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125861(List<NativeLoginProfileUiModel> list, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
            super(3);
            this.$profiles = list;
            this.$account = nativeLoginAccountUiModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingMedium;
                BRg bRgA09 = C3U4.A09(c1062ATq, f);
                C9m9 c9m9A00 = AcQ.A00(f);
                List<NativeLoginProfileUiModel> list = this.$profiles;
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                BPg.A03(bfm, g0u);
                G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
                BPg.A02(bfm, bRgA01, g0v3);
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0v3);
                String str = nativeLoginAccountUiModel.displayName;
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d7), null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
                AuraDividerKt.AuraRowDivider(null, bfm, 0, 1);
                if (list.isEmpty()) {
                    bfm.AgE(-1812206831);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120503), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(-1811980748);
                }
                BBI.A0R(bbi, false);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingLarge, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0v3);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 2023974504);
                while (itA0w.hasNext()) {
                    NativeLoginProfileUiModel nativeLoginProfileUiModel = (NativeLoginProfileUiModel) itA0w.next();
                    InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
                    int iA0D3 = AnonymousClass001.A0D(bbi);
                    AKQ akqA044 = BBI.A04(bbi);
                    BRg bRgA014 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0K, g0v);
                    BPg.A02(bfm, akqA044, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                    BPg.A02(bfm, bRgA014, g0v3);
                    C90m c90m = C90m.A00;
                    NativeLoginProfilesSheetKt.m1304NativeLoginProfileAvatarKGdREcs(nativeLoginProfileUiModel.photoUrl, nativeLoginProfileUiModel.platform, C10G.A07(bs0, 32.0f), null, 32.0f, 16.0f, 2.0f, bfm, 1794432, 8);
                    BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
                    InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D4 = AnonymousClass001.A0D(bbi);
                    AKQ akqA045 = BBI.A04(bbi);
                    BRg bRgA015 = AxM.A01(bfm, bRgA0O);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                    BPg.A02(bfm, akqA045, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                    BPg.A02(bfm, bRgA015, g0v3);
                    String str2 = nativeLoginProfileUiModel.displayName;
                    if (str2 == null) {
                        str2 = nativeLoginAccountUiModel.displayName;
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                    Integer numProfileTypeLabelRes = NativeLoginProfilesSheetKt.profileTypeLabelRes(nativeLoginProfileUiModel.platform);
                    if (numProfileTypeLabelRes == null) {
                        bfm.AgE(70644836);
                        BBI.A0R(bbi, false);
                    } else {
                        AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass003.A0g(bfm, numProfileTypeLabelRes, 70644837), null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, true);
                    BBI.A0R(bbi, true);
                }
                AnonymousClass002.A10(bbi, false, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencyProfiles$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
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
            NativeLoginTransparencySheetKt.NativeLoginTransparencyProfiles(this.$account, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencySheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C125871 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125871(Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$onContinue = function0;
            this.$onUseAnotherAccount = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(c1062ATq, AuraDimensKt.SpacingLargePlusMicro, 0.0f);
                float f = AuraDimensKt.SpacingLarge;
                float f2 = AuraDimensKt.SpacingXsmall;
                BRg bRgA0C = C3U4.A0C(bRgA0B, 0.0f, f - f2, 0.0f, 0.0f);
                C3TH c3th = C2VU.A00;
                C9m9 c9m9A00 = AcQ.A00(f2);
                Function0<Unit> function0 = this.$onContinue;
                Function0<Unit> function02 = this.$onUseAnotherAccount;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12052a);
                float f3 = NativeLoginCommonKt.MIN_TOUCH_TARGET;
                AuraButtonKt.m2408AuraButtonnL3aKkM("lobster-native-auth-transparency-signup", strA01, null, C10G.A0A(c1062ATq, f3, Float.NaN), null, null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 6, 0, 0, 134201332);
                NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120544), function02, C10G.A0A(bs0, f3, Float.NaN), 0L, C06G.A0W(bfm), false, bfm, 0, 40);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencySheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125882 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125882(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
            super(3);
            this.$account = nativeLoginAccountUiModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strA0v;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLargePlusMicro);
                C3TH c3th = C2VU.A00;
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 48);
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
                if (nativeLoginAccountUiModel.getProfileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() == 0) {
                    bfm.AgE(-1660291873);
                    strA0v = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d7);
                } else {
                    bfm.AgE(-1660181141);
                    int profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow = nativeLoginAccountUiModel.getProfileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow();
                    int i2 = R.string._name_removed__res_0x7f12052c;
                    if (profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow == 1) {
                        i2 = R.string._name_removed__res_0x7f12052d;
                    }
                    strA0v = AnonymousClass006.A0v(bfm, i2);
                }
                BBI.A0R(bbi, false);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
                long jA0C = C06G.A0C(bfm);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginTransparencySheetKt$NativeLoginTransparencySheet$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                NativeLoginTransparencySheetKt.NativeLoginTransparencyGuidance(null, bfm, 0, 1);
                NativeLoginTransparencySheetKt.NativeLoginTransparencyProfiles(nativeLoginAccountUiModel, null, bfm, NativeLoginAccountUiModel.$stable, 2);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTransparencySheetKt$NativeLoginTransparencySheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onContinue = function0;
            this.$onUseAnotherAccount = function02;
            this.$onDismiss = function03;
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
            NativeLoginTransparencySheetKt.NativeLoginTransparencySheet(this.$account, this.$onContinue, this.$onUseAnotherAccount, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginTransparencyGuidance(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1854431640);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120529), AnonymousClass001.A0R(bRg2), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.AHD<com.facebook.aura.login.nativeflow.NativeLoginProfileUiModel>] */
    public static final void NativeLoginTransparencyProfiles(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, BFM bfm, int i, int i2) {
        ?? A0i;
        BRg bRg2 = bRg;
        bfm.AgG(-756277480);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (nativeLoginAccountUiModel.profiles.isEmpty()) {
                AHD<NativeLoginLinkedAccountUiModel> ahd = nativeLoginAccountUiModel.linkedAccounts;
                A0i = AnonymousClass003.A0i(ahd);
                for (NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel : ahd) {
                    A0i.add(new NativeLoginProfileUiModel(nativeLoginLinkedAccountUiModel.platform, nativeLoginLinkedAccountUiModel.photoUrl, null));
                }
            } else {
                A0i = nativeLoginAccountUiModel.profiles;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "lobster-native-auth-transparency-profiles");
            C1DM c1dmA0R = C06G.A0R(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(bRgA00, c1dmA0R, false, AnonymousClass001.A0f(bfm, akh).modal, null, 0L, C0M7.A00(1.0f, AnonymousClass001.A0f(bfm, akh).elevatedBorder), false, B1V.A00(bfm, new C125861(A0i, nativeLoginAccountUiModel), 537627704), bfm, 100663296, 180);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(nativeLoginAccountUiModel, bRg2, i, i2);
        }
    }

    public static final void NativeLoginTransparencySheet(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(-1468730631);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, bRg2.then(new C1062ATq(C79.A00, "fillMaxHeight", 0.85f)), function03, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, null, B1V.A00(bfm, new C125871(function0, function02), -1070228718), null, null, null, false, false, true, B1V.A00(bfm, new C125882(nativeLoginAccountUiModel), -1428445482), bfm, ((iA05 >> 3) & 896) | 1572864, 3456, 4017);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(nativeLoginAccountUiModel, function0, function02, function03, bRg2, i, i2);
        }
    }
}
