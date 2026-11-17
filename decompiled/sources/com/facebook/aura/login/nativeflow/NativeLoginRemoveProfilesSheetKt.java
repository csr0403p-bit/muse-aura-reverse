package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginRemoveProfilesSheetKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfileRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onRemove = function0;
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
            NativeLoginRemoveProfilesSheetKt.NativeLoginRemoveProfileRow(this.$account, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<NativeLoginAccountUiModel> $accountToRemove$delegate;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ Function0<Unit> $hideThenReportChoice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<NativeLoginAccountUiModel> ahd, Function0<Unit> function0, MutableState<NativeLoginAccountUiModel> mutableState) {
            super(3);
            this.$accounts = ahd;
            this.$hideThenReportChoice = function0;
            this.$accountToRemove$delegate = mutableState;
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
                float f = AuraDimensKt.SpacingMedium;
                BRg bRgA0B = C3U4.A0B(c1062ATq, f, 0.0f);
                AHD<NativeLoginAccountUiModel> ahd = this.$accounts;
                Function0<Unit> function0 = this.$hideThenReportChoice;
                MutableState<NativeLoginAccountUiModel> mutableState = this.$accountToRemove$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                } else {
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120516);
                    C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                    AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(c1062ATq, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall), C06G.A08(bfm), c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1365857168);
                    int i2 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            NativeLoginAccountUiModel nativeLoginAccountUiModel = (NativeLoginAccountUiModel) next;
                            if (i2 > 0) {
                                bfm.AgE(-1671023675);
                                AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0, NativeLoginProfilesSheetKt.PROFILE_AVATAR_STYLE + f, 0.0f, 0.0f, 0.0f), bfm, 0, 0);
                                BBI.A0R(bbi, false);
                            } else {
                                bfm.AgE(-1670886252);
                                BBI.A0R(bbi, false);
                            }
                            boolean zA1N = AnonymousClass003.A1N(bfm, nativeLoginAccountUiModel, function0);
                            Object objAaT = bfm.AaT();
                            if (zA1N || objAaT == C78N.A00) {
                                objAaT = new NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$1$1$1$1$1(nativeLoginAccountUiModel, function0, mutableState);
                                bfm.Ai0(objAaT);
                            }
                            NativeLoginRemoveProfilesSheetKt.NativeLoginRemoveProfileRow(nativeLoginAccountUiModel, (Function0) objAaT, null, bfm, NativeLoginAccountUiModel.$stable, 4);
                            i2 = i3;
                        }
                    }
                    AnonymousClass003.A0q(bbi);
                    return;
                }
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125652(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$accounts = ahd;
            this.$onRemove = g0u;
            this.$onDismiss = function0;
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
            NativeLoginRemoveProfilesSheetKt.NativeLoginRemoveProfilesSheet(this.$accounts, this.$onRemove, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginRemoveProfileRow(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(693467789);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0t = AnonymousClass001.A0t(bfm, nativeLoginAccountUiModel.displayName, R.string._name_removed__res_0x7f120515);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0R, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            NativeLoginProfilesSheetKt.m1304NativeLoginProfileAvatarKGdREcs(nativeLoginAccountUiModel.photoUrl, null, null, NativeLoginAccountRowKt.linkedAccountBadge(nativeLoginAccountUiModel.fallbackGlyphPlatform), 0.0f, 0.0f, 0.0f, bfm, 48, 116);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(nativeLoginAccountUiModel.displayName, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d7), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bs0, f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120514);
            C1822Arm c1822ArmA0X = C06G.A0X(bfm);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfileRow$1$2$1(strA0t);
                bfm.Ai0(objAaT);
            }
            NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(strA01, function0, AnonymousClass001.A0Y(bs0, objAaT, false), 0L, c1822ArmA0X, false, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 40);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(nativeLoginAccountUiModel, function0, bRg2, i, i2);
        }
    }

    public static final void NativeLoginRemoveProfilesSheet(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(ahd, g0u, function0);
        bfm.AgG(-1322418572);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            MutableState mutableState = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            boolean zA1C = AnonymousClass003.A1C(iA05) | AnonymousClass003.A1D(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$reportChoice$1$1(g0u, function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean zA1P = AnonymousClass003.A1P(bfm, auraSheetStateRememberAuraBottomSheetState, function02, bfm.A67(c3ux));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == obj) {
                objAaT3 = new NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$hideThenReportChoice$1$1(c3ux, auraSheetStateRememberAuraBottomSheetState, function02);
                bfm.Ai0(objAaT3);
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, bRg2, function02, auraSheetStateRememberAuraBottomSheetState, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120517), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(ahd, (Function0) objAaT3, mutableState), 622682001), bfm, (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 3072, 8145);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125652(ahd, g0u, function0, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ NativeLoginAccountUiModel access$NativeLoginRemoveProfilesSheet$lambda$1(MutableState mutableState) {
        return (NativeLoginAccountUiModel) mutableState.getValue();
    }
}
