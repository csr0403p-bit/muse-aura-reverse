package com.facebook.aura.conversation.view;

import X.AKH;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YD;
import X.C1b8;
import X.C20Q;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UV;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WalletSetupSheetKt {

    /* renamed from: com.facebook.aura.conversation.view.WalletSetupSheetKt$WalletSetupOptionRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WalletSetupOption $option;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WalletSetupOption walletSetupOption, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$option = walletSetupOption;
            this.$sourceSessionId = str;
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
            WalletSetupSheetKt.WalletSetupOptionRow(this.$option, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.WalletSetupSheetKt$WalletSetupSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ List<WalletSetupOption> $options;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<WalletSetupOption> list, String str) {
            super(3);
            this.$options = list;
            this.$sourceSessionId = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                List<WalletSetupOption> list = this.$options;
                String str = this.$sourceSessionId;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                } else {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                    G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12114d);
                    C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                    AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                    AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bs0, 24.0f, 0.0f, 24.0f, 8.0f), C06G.A0I(bfm, akh), c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                    BRg bRgA012 = C1b8.A01(C11U.A01(C3U4.A0C(c1062ATq, 16.0f, 0.0f, 16.0f, 16.0f), 20.0f), AnonymousClass001.A0f(bfm, akh).card);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA013 = AxM.A01(bfm, bRgA012);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA013, g0vA0u);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, 593025813);
                    int i3 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            WalletSetupOption walletSetupOption = (WalletSetupOption) next;
                            if (i3 > 0) {
                                bfm.AgE(-1407841361);
                                AuraDividerKt.AuraDivider(C3U4.A0C(bs0, 56.0f, 0.0f, 0.0f, 0.0f), null, false, bfm, 6, 6);
                            } else {
                                bfm.AgE(-693366945);
                            }
                            BBI.A0R(bbi, false);
                            WalletSetupSheetKt.WalletSetupOptionRow(walletSetupOption, str, null, bfm, WalletSetupOption.$stable, 4);
                            i3 = i4;
                        }
                    }
                    BBI.A0R(bbi, false);
                    AnonymousClass002.A0y(bbi);
                    return;
                }
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.WalletSetupSheetKt$WalletSetupSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<WalletSetupOption> $options;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<WalletSetupOption> list, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$options = list;
            this.$sourceSessionId = str;
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
            WalletSetupSheetKt.WalletSetupSheet(this.$options, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void WalletSetupOptionRow(WalletSetupOption walletSetupOption, String str, BRg bRg, BFM bfm, int i, int i2) {
        String str2;
        BRg bRg2 = bRg;
        bfm.AgG(-1007641309);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(walletSetupOption, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = (HatchConnectorCatalogRepository) objAaT;
            boolean zA1L = AnonymousClass003.A1L(bfm, hatchConnectorCatalogRepository, walletSetupOption.connectorId);
            Object objAaT2 = bfm.AaT();
            if (zA1L || objAaT2 == C78N.A00) {
                objAaT2 = hatchConnectorCatalogRepository.observeConnector(walletSetupOption.connectorId);
                bfm.Ai0(objAaT2);
            }
            C1BO c1boA01 = C2CK.A01(bfm, null, hatchConnectorCatalogRepository.getCachedConnector(walletSetupOption.connectorId), (C20Q) objAaT2, 0, 14);
            String str3 = walletSetupOption.connectorId;
            int i4 = iA05 & 14;
            boolean zA67 = bfm.A67(hatchConnectorCatalogRepository) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(walletSetupOption)));
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1(hatchConnectorCatalogRepository, walletSetupOption, null);
                bfm.Ai0(objAaT3);
            }
            String str4 = null;
            MutableState mutableStateA00 = C3UV.A00(bfm, null, hatchConnectorCatalogRepository, str3, (G0V) objAaT3);
            Skill skill = (Skill) c1boA01.getValue();
            if ((skill == null && (skill = (Skill) mutableStateA00.getValue()) == null) || (str2 = skill.displayName) == null || C7BY.A0j(str2)) {
                str2 = walletSetupOption.connectorId;
            }
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 52.0f);
            C1YD c1yd = new C1YD(0);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, contextA0H, auraNavigatorA0b, bfm.A67(abstractC3358CGzA0h), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(walletSetupOption))) | AnonymousClass002.A1Q(iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 32);
            Object objAaT4 = bfm.AaT();
            if (zA1Y || objAaT4 == C78N.A00) {
                objAaT4 = new WalletSetupSheetKt$WalletSetupOptionRow$1$1(walletSetupOption, abstractC3358CGzA0h, contextA0H, auraNavigatorA0b, str);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0B = C3U4.A0B(C0v5.A04(bRgA0U, c1yd, null, (Function0) objAaT4, true), 12.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0D);
            C90m c90m = C90m.A00;
            if (skill != null) {
                str4 = skill.iconUrl;
            }
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(str4, null, null, 32.0f, 0.0f, 0, 0.0f, null, null, bfm, 3120, 500);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0O(c90m, BRg.A00, true), C06G.A0L(bfm, akh), c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.SMALL, null, C06G.A0H(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(walletSetupOption, str, bRg2, i, i2);
        }
    }

    public static final void WalletSetupSheet(List<WalletSetupOption> list, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(list, 0);
        bfm.AgG(-1605025344);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12114e), null, null, null, null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(list, str), -414597187), bfm, ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2036);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(list, str, bRg2, i, i2);
        }
    }
}
