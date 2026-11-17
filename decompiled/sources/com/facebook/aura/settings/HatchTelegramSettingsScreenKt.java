package com.facebook.aura.settings;

import X.AFs;
import X.AFz;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AWx;
import X.AaM;
import X.AbstractC1754Apr;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0Hi;
import X.C0fG;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1805ArO;
import X.C1809ArT;
import X.C1824Aro;
import X.C1847AsK;
import X.C1BO;
import X.C1DG;
import X.C1OR;
import X.C1SA;
import X.C1YL;
import X.C1YP;
import X.C2257BGr;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchTelegramSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ boolean $isConnecting;
        public final /* synthetic */ MutableState<C1805ArO> $tokenValue$delegate;
        public final /* synthetic */ HatchTelegramUiState $uiState;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0Hi c0Hi, MutableState<C1805ArO> mutableState, HatchTelegramUiState hatchTelegramUiState, boolean z, HatchTelegramViewModel hatchTelegramViewModel) {
            super(4);
            this.$focusManager = c0Hi;
            this.$tokenValue$delegate = mutableState;
            this.$uiState = hatchTelegramUiState;
            this.$isConnecting = z;
            this.$viewModel = hatchTelegramViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1965invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1965invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int i2;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgA00 = AbstractC1754Apr.A00(HatchImpressionModifierKt.hatchImpression(c1062ATq, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.SETTINGS_GENERAL, HatchScreen.SETTINGS_CHANNELS_TELEGRAM, HatchComponent.SETTINGS_SCREEN_VIEW, null, AnonymousClass006.A10("channel", "telegram"), null, 500L, 0.0f, null, null, null));
            final C0Hi c0Hi = this.$focusManager;
            MutableState<C1805ArO> mutableState = this.$tokenValue$delegate;
            HatchTelegramUiState hatchTelegramUiState = this.$uiState;
            boolean z = this.$isConnecting;
            HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i3 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(c0Hi);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectScreen$1$1$1$1

                    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectScreen$1$1$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ C0Hi $focusManager;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C0Hi c0Hi) {
                            super(1);
                            this.$focusManager = c0Hi;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m1966invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m1966invokek4lQ0M(long j) {
                            this.$focusManager.A6G(false);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(c0Hi));
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA0T = AnonymousClass005.A0T(bfm, AaM.A00(c1062ATq, (PointerInputEventHandler) objAaT, unit));
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0T, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0J, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            C1805ArO value = mutableState.getValue();
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchTelegramSettingsScreenKt$ConnectScreen$1$1$2$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            HatchTelegramSettingsScreenKt.TelegramOnboardingFields(value, (G0U) objAaT2, hatchTelegramUiState.connectPhase, bfm, 0);
            C01N.A08(bfm, bs0, 80.0f);
            C01N.A04(bfm, bbi, bs0, f2, true);
            BRg bRgA0C2 = C3U4.A0C(AnonymousClass007.A0G(c0z7, bs0), C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh) + f2);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (z) {
                bfm.AgE(-383264087);
                i2 = R.string._name_removed__res_0x7f1210e9;
            } else {
                bfm.AgE(-383171955);
                i2 = R.string._name_removed__res_0x7f1206cb;
            }
            String strA0s = AnonymousClass001.A0s(bfm, bbi, i2);
            boolean zA1X = AnonymousClass005.A1X(bfm, strA0s, hatchTelegramViewModel, bfm.A65(mutableState), bfm.A66(z));
            Object objAaT3 = bfm.AaT();
            if (zA1X || objAaT3 == C78N.A00) {
                objAaT3 = new HatchTelegramSettingsScreenKt$ConnectScreen$1$1$3$1$1(z, strA0s, mutableState, hatchTelegramViewModel);
                bfm.Ai0(objAaT3);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, true, (G0U) objAaT3, bfm, 12582912, 127);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchTelegramUiState $uiState;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, HatchTelegramViewModel hatchTelegramViewModel, HatchTelegramUiState hatchTelegramUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchTelegramViewModel;
            this.$uiState = hatchTelegramUiState;
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
            HatchTelegramSettingsScreenKt.ConnectScreen(this.$onBack, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectedScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C135901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135901(MutableState<Boolean> mutableState, HatchTelegramViewModel hatchTelegramViewModel) {
            super(2);
            this.$showContextMenu$delegate = mutableState;
            this.$viewModel = hatchTelegramViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchScreen hatchScreen = HatchScreen.CHANNELS_TELEGRAM;
                boolean zA0A = MutableState.A0A((MutableState) this.$showContextMenu$delegate);
                boolean zA65 = bfm.A65(this.$showContextMenu$delegate);
                MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchTelegramSettingsScreenKt$ConnectedScreen$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA652 = bfm.A65(this.$showContextMenu$delegate);
                MutableState<Boolean> mutableState2 = this.$showContextMenu$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchTelegramSettingsScreenKt$ConnectedScreen$1$2$1(mutableState2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA67 = bfm.A67(this.$viewModel);
                HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchTelegramSettingsScreenKt$ConnectedScreen$1$3$1(hatchTelegramViewModel);
                    bfm.Ai0(objAaT3);
                }
                ChannelDisconnectActionButtonKt.ChannelDisconnectActionButton(hatchScreen, zA0A, function0, function02, (Function0) objAaT3, bfm, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectedScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135912 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchTelegramUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135912(HatchTelegramUiState hatchTelegramUiState, Context context) {
            super(4);
            this.$uiState = hatchTelegramUiState;
            this.$context = context;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1967invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1967invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(c1062ATq, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.SETTINGS_GENERAL, HatchScreen.SETTINGS_CHANNELS_TELEGRAM, HatchComponent.SETTINGS_SCREEN_VIEW, null, AnonymousClass006.A10("channel", "telegram"), null, 500L, 0.0f, null, null, null);
            HatchTelegramUiState hatchTelegramUiState = this.$uiState;
            Context context = this.$context;
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BRg bRgA0B = C3U4.A0B(AnonymousClass005.A0T(bfm, c1062ATq), C06G.A00(bfm), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0J, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C01N.A08(bfm, bs0, f + 12.0f);
            C1SA.A00(bfm, null, C10G.A07(bs0, 60.0f), null, AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_telegram), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A06(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee0), null, C06G.A0C(bfm), C06G.A0U(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A05(bfm, bs0);
            HatchTelegramSettingsScreenKt.StatusIndicator(true, null, false, bfm, 6, 6);
            C01N.A08(bfm, bs0, 80.0f);
            C01N.A04(bfm, bbi, bs0, f2, true);
            BRg bRgA0G = AnonymousClass007.A0G(c0z7, bs0);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0G, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh) + f2);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210e6);
            boolean zA1T = AnonymousClass004.A1T(bfm, hatchTelegramUiState, context, bfm.A65(strA01));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchTelegramSettingsScreenKt$ConnectedScreen$2$1$2$1$1(strA01, hatchTelegramUiState, context);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 127);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectedScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $disconnectText;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, HatchTelegramViewModel hatchTelegramViewModel, String str2) {
            super(2);
            this.$disconnectText = str;
            this.$viewModel = hatchTelegramViewModel;
            this.$cancelText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$disconnectText)));
                String str = this.$disconnectText;
                String str2 = this.$cancelText;
                HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchTelegramSettingsScreenKt$ConnectedScreen$3$1$1(str, str2, hatchTelegramViewModel);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectedScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchTelegramUiState $uiState;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Function0<Unit> function0, HatchTelegramViewModel hatchTelegramViewModel, HatchTelegramUiState hatchTelegramUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchTelegramViewModel;
            this.$uiState = hatchTelegramUiState;
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
            HatchTelegramSettingsScreenKt.ConnectedScreen(this.$onBack, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$HatchTelegramSettingsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $initialIsLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, boolean z, BRg bRg, HatchTelegramViewModel hatchTelegramViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$initialIsLinked = z;
            this.$modifier = bRg;
            this.$viewModel = hatchTelegramViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTelegramSettingsScreenKt.HatchTelegramSettingsScreen(this.$onBack, this.$initialIsLinked, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$StatusIndicator$2, reason: invalid class name and case insensitive filesystem */
    public final class C135922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135922(boolean z, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$isLinked = z;
            this.$modifier = bRg;
            this.$needsAttention = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTelegramSettingsScreenKt.StatusIndicator(this.$isLinked, this.$modifier, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramConnectedContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C135933 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isDisconnectMode;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onDisconnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135933(boolean z, Function0<Unit> function0, boolean z2, int i, int i2) {
            super(2);
            this.$isDisconnectMode = z;
            this.$onDisconnect = function0;
            this.$isLoading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTelegramSettingsScreenKt.TelegramConnectedContent(this.$isDisconnectMode, this.$onDisconnect, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C135943 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TelegramConnectPhase $connectPhase;
        public final /* synthetic */ G0U<String, Unit> $onConnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135943(TelegramConnectPhase telegramConnectPhase, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$connectPhase = telegramConnectPhase;
            this.$onConnect = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTelegramSettingsScreenKt.TelegramOnboardingContent(this.$connectPhase, this.$onConnect, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingFields$3, reason: invalid class name and case insensitive filesystem */
    public final class C135953 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $linkColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135953(long j, Context context) {
            super(2);
            this.$linkColor = j;
            this.$context = context;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210e2);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210e3);
                String strA0w = AnonymousClass006.A0w(bfm, strA01, strA012, R.string._name_removed__res_0x7f1210e1);
                boolean zA65 = bfm.A65(strA0w) | bfm.A64(this.$linkColor);
                long j = this.$linkColor;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    int iA0B = C7BY.A0B(strA0w, strA01, 0, false);
                    int iA0B2 = C7BY.A0B(strA0w, strA012, 0, false);
                    C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0w);
                    if (iA0B >= 0) {
                        C1OR c1or = new C1OR("https://t.me/BotFather");
                        int length = strA01.length() + iA0B;
                        c1731ApSA0X.A0B(c1or, iA0B, length);
                        C1736ApY c1736ApY = C1736ApY.A01;
                        long j2 = C1809ArT.A01;
                        c1731ApSA0X.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07), iA0B, length);
                    }
                    if (iA0B2 >= 0) {
                        C1847AsK c1847AsK = AbstractC1996Aw5.A01;
                        long j3 = B6A.A07;
                        long j4 = C1809ArT.A01;
                        c1731ApSA0X.A0A(new C1824Aro(null, null, c1847AsK, null, null, null, null, null, null, null, null, j3, j4, j4, j3), iA0B2, strA012.length() + iA0B2);
                    }
                    objAaT = c1731ApSA0X.A04();
                    bfm.Ai0(objAaT);
                }
                ApQ apQ = (ApQ) objAaT;
                long jA08 = C06G.A08(bfm);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A65(apQ));
                Context context = this.$context;
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchTelegramSettingsScreenKt$TelegramOnboardingFields$3$1$1(apQ, context);
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, null, (G0U) objAaT2, null, null, null, false, jA08, null, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 1048442);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingFields$4, reason: invalid class name and case insensitive filesystem */
    public final class C135964 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $tokenPlaceholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135964(String str) {
            super(2);
            this.$tokenPlaceholder = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraTextInputDefaults.INSTANCE.m2587PlaceholderTextqdpcsU(this.$tokenPlaceholder, 0, null, bfm, 3078, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingFields$5, reason: invalid class name and case insensitive filesystem */
    public final class C135975 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onTokenChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135975(C0fG c0fG, G0U<? super C1805ArO, Unit> g0u) {
            super(2);
            this.$clipboardManager = c0fG;
            this.$onTokenChange = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210e4);
                long jA0C = C06G.A0C(bfm);
                C1736ApY c1736ApY = C1736ApY.A01;
                BRg bRgA0C = C3U4.A0C(BRg.A00, 0.0f, 0.0f, AuraDimensKt.SpacingSmall, 0.0f);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onTokenChange, bfm.A67(this.$clipboardManager));
                C0fG c0fG = this.$clipboardManager;
                G0U<C1805ArO, Unit> g0u = this.$onTokenChange;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchTelegramSettingsScreenKt$TelegramOnboardingFields$5$1$1(c0fG, g0u);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C0v5.A04(bRgA0C, null, null, (Function0) objAaT, true), jA0C, null, null, c1736ApY, null, false, 0, 0, 0, null, null, null, bfm, 196608, 0, 16344);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingFields$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TelegramConnectPhase $connectPhase;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onTokenChange;
        public final /* synthetic */ C1805ArO $tokenValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, TelegramConnectPhase telegramConnectPhase, int i) {
            super(2);
            this.$tokenValue = c1805ArO;
            this.$onTokenChange = g0u;
            this.$connectPhase = telegramConnectPhase;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTelegramSettingsScreenKt.TelegramOnboardingFields(this.$tokenValue, this.$onTokenChange, this.$connectPhase, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchTelegramSettingsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r14, boolean r15, X.BRg r16, com.facebook.aura.settings.HatchTelegramViewModel r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramSettingsScreenKt.HatchTelegramSettingsScreen(kotlin.jvm.functions.Function0, boolean, X.BRg, com.facebook.aura.settings.HatchTelegramViewModel, X.BFM, int, int):void");
    }

    public static final void TelegramOnboardingContent(TelegramConnectPhase telegramConnectPhase, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        int i2;
        boolean zA1a = AnonymousClass002.A1a(telegramConnectPhase, g0u);
        bfm.AgG(508554135);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, telegramConnectPhase) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            Object[] objArr = new Object[0];
            AFs<C1805ArO, Object> aFs = C1805ArO.A03;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchTelegramSettingsScreenKt$TelegramOnboardingContent$tokenValue$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA00 = AFz.A00(bfm, aFs, (Function0) objAaT, objArr);
            boolean zA1Z = AnonymousClass002.A1Z(telegramConnectPhase, TelegramConnectPhase.CONNECTING);
            final C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(c0HiA0Z);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$1$1

                    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ C0Hi $focusManager;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C0Hi c0Hi) {
                            super(1);
                            this.$focusManager = c0Hi;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m1968invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m1968invokek4lQ0M(long j) {
                            this.$focusManager.A6G(false);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(c0HiA0Z));
                    }
                };
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0M = C06G.A0M(bfm, AaM.A00(c1062ATq, (PointerInputEventHandler) objAaT2, unit));
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i3 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0M);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, i3);
            C1805ArO c1805ArO = (C1805ArO) mutableStateA00.getValue();
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$1$1(mutableStateA00);
                bfm.Ai0(objAaT3);
            }
            TelegramOnboardingFields(c1805ArO, (G0U) objAaT3, telegramConnectPhase, bfm, (iA08 << 6) & 896);
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            if (zA1Z) {
                bfm.AgE(727734322);
                i2 = R.string._name_removed__res_0x7f1210e9;
            } else {
                bfm.AgE(727818518);
                i2 = R.string._name_removed__res_0x7f1206cb;
            }
            String strA0s = AnonymousClass001.A0s(bfm, bbi, i2);
            boolean zA1W = AnonymousClass004.A1W(bfm, strA0s, zA1Z, bfm.A65(mutableStateA00)) | AnonymousClass003.A1C(iA08);
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1(zA1Z, strA0s, mutableStateA00, g0u);
                bfm.Ai0(objAaT4);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, zA1a, (G0U) objAaT4, bfm, 12582912, 127);
            C01N.A04(bfm, bbi, bs0, f, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135943(telegramConnectPhase, g0u, i);
        }
    }

    public static final void ConnectScreen(Function0<Unit> function0, HatchTelegramViewModel hatchTelegramViewModel, HatchTelegramUiState hatchTelegramUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1035774479);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchTelegramViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchTelegramUiState, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            AFs<C1805ArO, Object> aFs = C1805ArO.A03;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchTelegramSettingsScreenKt$ConnectScreen$tokenValue$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA00 = AFz.A00(bfm, aFs, (Function0) objAaT, objArr);
            boolean zA1Z = AnonymousClass002.A1Z(hatchTelegramUiState.connectPhase, TelegramConnectPhase.CONNECTING);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, AuraContentRole.Focused, 0L, "", null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(AnonymousClass001.A0Z(bfm), mutableStateA00, hatchTelegramUiState, zA1Z, hatchTelegramViewModel), 509339382), bfm, AnonymousClass001.A05(iA0T << 18, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24966), 0, 805306368, 536870824);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, hatchTelegramViewModel, hatchTelegramUiState, bRg2, i, i2);
        }
    }

    public static final void ConnectedScreen(Function0<Unit> function0, HatchTelegramViewModel hatchTelegramViewModel, HatchTelegramUiState hatchTelegramUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(816857778);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchTelegramViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchTelegramUiState, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchTelegramSettingsScreenKt$ConnectedScreen$showContextMenu$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            boolean z = false;
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, "", null, function0, null, false, false, 0, null, null, null, null, null, B1V.A00(bfm, new C135901(AnonymousClass002.A0N(bfm, objAaT, objArr), hatchTelegramViewModel), -1049466369), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C135912(hatchTelegramUiState, AnonymousClass002.A0H(bfm)), -387406217), bfm, AnonymousClass001.A05(iA0T << 18, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24582), 1572864, 805306368, 536805292);
            if (hatchTelegramUiState.showDisconnectDialog) {
                bfm.AgE(-271202478);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206cd);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210eb);
                String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210ea);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass3(strA01, hatchTelegramViewModel, strA012), 2015933318);
                if ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchTelegramViewModel))) {
                    z = true;
                }
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == obj) {
                    objAaT2 = new HatchTelegramSettingsScreenKt$ConnectedScreen$4$1(hatchTelegramViewModel);
                    bfm.Ai0(objAaT2);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, strA014, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT2, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
            } else {
                bfm.AgE(-270527856);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(function0, hatchTelegramViewModel, hatchTelegramUiState, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[PHI: r33
  0x0082: PHI (r33v4 boolean) = (r33v3 boolean), (r33v6 boolean) binds: [B:16:0x003b, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StatusIndicator(boolean r30, X.BRg r31, boolean r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramSettingsScreenKt.StatusIndicator(boolean, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final void TelegramConnectedContent(boolean z, Function0<Unit> function0, boolean z2, BFM bfm, int i, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        Function0<Unit> function02 = function0;
        bfm.AgG(-1131292218);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z3) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function02);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchTelegramSettingsScreenKt$TelegramConnectedContent$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            if (i5 != 0) {
                z4 = false;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C10G.A02, C06G.A00(bfm), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, 60.0f), null, AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_telegram), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee0), null, C06G.A0C(bfm), C06G.A0U(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A05(bfm, bs0);
            StatusIndicator(true, null, false, bfm, 6, 6);
            if (z3) {
                bfm.AgE(-1348752063);
                C01N.A06(bfm, bs0);
                Object[] objArr = new Object[0];
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$showConfirmDialog$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206cd);
                boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA0N, bfm.A65(strA01), AnonymousClass006.A1W(iA0n));
                Object objAaT3 = bfm.AaT();
                if (zA1W || objAaT3 == obj) {
                    objAaT3 = new HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$1$1(z4, strA01, mutableStateA0N);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT3, bfm, 0, 255);
                if (MutableState.A0A(mutableStateA0N)) {
                    bfm.AgE(-1348022850);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                    String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210eb);
                    String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210ea);
                    B1U b1uA00 = B1V.A00(bfm, new HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$2(function02, strA01, mutableStateA0N, strA012), -285316247);
                    boolean zA65 = bfm.A65(mutableStateA0N);
                    Object objAaT4 = bfm.AaT();
                    if (zA65 || objAaT4 == obj) {
                        objAaT4 = new HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$3$1(mutableStateA0N);
                        bfm.Ai0(objAaT4);
                    }
                    AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, strA014, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT4, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
                } else {
                    bfm.AgE(-1347204078);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1347198126);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135933(z3, function02, z4, i, i2);
        }
    }

    public static final void TelegramOnboardingFields(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, TelegramConnectPhase telegramConnectPhase, BFM bfm, int i) {
        bfm.AgG(-1410882873);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1805ArO) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, telegramConnectPhase);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            boolean zA1Z = AnonymousClass002.A1Z(telegramConnectPhase, TelegramConnectPhase.CONNECTING);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C0fG c0fG = (C0fG) bfm.A6v(Am0.A02);
            String selectedAssistantNameOrNull = JarvisUtils.INSTANCE.getSelectedAssistantNameOrNull(AnonymousClass002.A0h(bfm));
            if (selectedAssistantNameOrNull == null) {
                bfm.AgE(1351239206);
                selectedAssistantNameOrNull = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121199);
            } else {
                bfm.AgE(1351237067);
            }
            AnonymousClass001.A1D(bfm);
            long jA07 = C06G.A07(bfm);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, 60.0f), null, AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_telegram), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee0), null, C06G.A0C(bfm), C06G.A0U(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, selectedAssistantNameOrNull, R.string._name_removed__res_0x7f1210e0), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A06(bfm, bs0);
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210e5);
            AuraTextInputHeaderStyle.Secondary secondary2 = AuraTextInputHeaderStyle.Secondary.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchTelegramSettingsScreenKt$TelegramOnboardingFields$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT, false);
            boolean z = !zA1Z;
            C1YP c1yp = new C1YP();
            AuJ auJ = new AuJ(null, -1, 7, 7);
            boolean zA67 = bfm.A67(c0HiA0Z);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchTelegramSettingsScreenKt$TelegramOnboardingFields$2$1(c0HiA0Z);
                bfm.Ai0(objAaT2);
            }
            AuraTextInputWithHeaderKt.AuraTextInputWithHeader(c1805ArO, bRgA0Y, strA01, secondary2, B1V.A00(bfm, new C135953(jA07, contextA0H), 1949097897), B1V.A00(bfm, new C135964("123456:ABC-DEF1234g..."), -1546294870), auJ, new C2257BGr((G0U) objAaT2, null, null, null), null, c1yp, null, true, 0, null, B1V.A00(bfm, new C135975(c0fG, g0u), 983352832), null, null, z, false, false, null, g0u, bfm, (iA0d & 14) | 1797120, 24624, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 1946880);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(c1805ArO, g0u, telegramConnectPhase, i);
        }
    }

    public static final /* synthetic */ C1805ArO access$ConnectScreen$lambda$1(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }

    public static final /* synthetic */ HatchTelegramUiState access$HatchTelegramSettingsScreen$lambda$0(C1BO c1bo) {
        return (HatchTelegramUiState) c1bo.getValue();
    }

    public static final /* synthetic */ C1805ArO access$TelegramOnboardingContent$lambda$1(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }
}
