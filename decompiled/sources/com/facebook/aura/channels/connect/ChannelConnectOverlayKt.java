package com.facebook.aura.channels.connect;

import X.AKQ;
import X.AWx;
import X.AaM;
import X.AbstractC1754Apr;
import X.AbstractC7559F3s;
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
import X.BOD;
import X.BQN;
import X.BRg;
import X.BRr;
import X.C00x;
import X.C07C;
import X.C0861A6i;
import X.C0Hi;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1Dt;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.settings.HatchMessengerUiState;
import com.facebook.aura.settings.HatchMessengerViewModel;
import com.facebook.aura.settings.HatchTelegramUiState;
import com.facebook.aura.settings.HatchTelegramViewModel;
import com.facebook.aura.settings.HatchWhatsAppUiState;
import com.facebook.aura.settings.HatchWhatsAppViewModel;
import com.facebook.aura.settings.MessengerConnectPhase;
import com.facebook.aura.settings.TelegramConnectPhase;
import com.facebook.aura.settings.WhatsAppConnectPhase;
import com.facebook.aura.settings.WhatsAppSheetState;
import com.facebook.aura.settings.WhatsAppUpdateNoteKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ChannelConnectOverlayKt {

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$MessengerConnectContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MessengerSheetState $sheetContentState;
        public final /* synthetic */ C1BO<HatchMessengerUiState> $uiState$delegate;
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MessengerSheetState messengerSheetState, HatchMessengerViewModel hatchMessengerViewModel, C1BO<HatchMessengerUiState> c1bo) {
            super(3);
            this.$sheetContentState = messengerSheetState;
            this.$viewModel = hatchMessengerViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA01 = AbstractC1754Apr.A01(C1b8.A01(C10G.A02, AnonymousClass002.A0c(bfm).modal));
                MessengerSheetState messengerSheetState = this.$sheetContentState;
                HatchMessengerViewModel hatchMessengerViewModel = this.$viewModel;
                C1BO<HatchMessengerUiState> c1bo = this.$uiState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                C1Dt.A01(null, bfm, null, messengerSheetState, "messenger-sheet-content", B1V.A00(bfm, new ChannelConnectOverlayKt$MessengerConnectContent$5$1$1(hatchMessengerViewModel, c1bo), -719232053), 27648, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$MessengerConnectContent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $intent;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$intent = str;
            this.$onDismiss = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ChannelConnectOverlayKt.MessengerConnectContent(this.$intent, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$6, reason: invalid class name and case insensitive filesystem */
    public final class C110416 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ TelegramSheetState $sheetContentState;
        public final /* synthetic */ C1BO<HatchTelegramUiState> $uiState$delegate;
        public final /* synthetic */ HatchTelegramViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110416(C0Hi c0Hi, TelegramSheetState telegramSheetState, HatchTelegramViewModel hatchTelegramViewModel, C1BO<HatchTelegramUiState> c1bo) {
            super(3);
            this.$focusManager = c0Hi;
            this.$sheetContentState = telegramSheetState;
            this.$viewModel = hatchTelegramViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA01 = C1b8.A01(C10G.A02, AnonymousClass002.A0c(bfm).modal);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(this.$focusManager);
                final C0Hi c0Hi = this.$focusManager;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$6$1$1

                        /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$6$1$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                            public final /* synthetic */ C0Hi $focusManager;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(C0Hi c0Hi) {
                                super(1);
                                this.$focusManager = c0Hi;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                                m337invokek4lQ0M(aWx.A00);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m337invokek4lQ0M(long j) {
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
                BRg bRgA012 = AbstractC1754Apr.A01(AbstractC1754Apr.A00(AaM.A00(bRgA01, (PointerInputEventHandler) objAaT, unit)));
                TelegramSheetState telegramSheetState = this.$sheetContentState;
                HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
                C1BO<HatchTelegramUiState> c1bo = this.$uiState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA012);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA013, iA0J);
                C1Dt.A01(null, bfm, null, telegramSheetState, "telegram-sheet-content", B1V.A00(bfm, new ChannelConnectOverlayKt$TelegramConnectContent$6$2$1(hatchTelegramViewModel, c1bo), 1077648647), 27648, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $intent;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$intent = str;
            this.$onDismiss = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ChannelConnectOverlayKt.TelegramConnectContent(this.$intent, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$WhatsAppConnectContent$5, reason: invalid class name and case insensitive filesystem */
    public final class C110425 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;
        public final /* synthetic */ C1BO<WhatsAppSheetState> $sheetContentState$delegate;
        public final /* synthetic */ C1BO<HatchWhatsAppUiState> $uiState$delegate;
        public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110425(C1BO<? extends WhatsAppSheetState> c1bo, HatchWhatsAppViewModel hatchWhatsAppViewModel, Function0<Unit> function0, Function0<Unit> function02, C1BO<HatchWhatsAppUiState> c1bo2) {
            super(3);
            this.$sheetContentState$delegate = c1bo;
            this.$viewModel = hatchWhatsAppViewModel;
            this.$onUpdateNoteShown = function0;
            this.$onDismiss = function02;
            this.$uiState$delegate = c1bo2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA01 = AbstractC1754Apr.A01(C1b8.A01(C10G.A02, AnonymousClass002.A0c(bfm).modal));
                C1BO<WhatsAppSheetState> c1bo = this.$sheetContentState$delegate;
                HatchWhatsAppViewModel hatchWhatsAppViewModel = this.$viewModel;
                Function0<Unit> function0 = this.$onUpdateNoteShown;
                Function0<Unit> function02 = this.$onDismiss;
                C1BO<HatchWhatsAppUiState> c1bo2 = this.$uiState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                C1Dt.A01(null, bfm, null, c1bo.getValue(), "whatsapp-sheet-content", B1V.A00(bfm, new ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1(hatchWhatsAppViewModel, function0, function02, c1bo2), -586336219), 27648, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$WhatsAppConnectContent$6, reason: invalid class name and case insensitive filesystem */
    public final class C110436 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $utmSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110436(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$utmSource = str;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ChannelConnectOverlayKt.WhatsAppConnectContent(this.$utmSource, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void WhatsAppConnectContent(String str, Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1936098843);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            HatchWhatsAppViewModel.Factory factory = new HatchWhatsAppViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchWhatsAppViewModel hatchWhatsAppViewModel = (HatchWhatsAppViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchWhatsAppViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchWhatsAppViewModel.uiState);
            C1BO c1boA022 = C2CK.A02(bfm, hatchWhatsAppViewModel.sheetState);
            Function0<Unit> function0RememberWhatsAppUpdateNoteViewLogger = WhatsAppUpdateNoteKt.rememberWhatsAppUpdateNoteViewLogger(bfm, 0);
            Unit unit = Unit.INSTANCE;
            boolean zA1B = AnonymousClass003.A1B(iA0d) | bfm.A67(hatchWhatsAppViewModel);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ChannelConnectOverlayKt$WhatsAppConnectContent$1$1(hatchWhatsAppViewModel, str);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            boolean zA1M = AnonymousClass003.A1M(bfm, hatchWhatsAppViewModel, contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new ChannelConnectOverlayKt$WhatsAppConnectContent$2$1(hatchWhatsAppViewModel, contextA0H, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, hatchWhatsAppViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == C78N.A00) {
                objAaT3 = new ChannelConnectOverlayKt$WhatsAppConnectContent$3$1(hatchWhatsAppViewModel, c1boA02);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass006.A16(bfm, objAaT3, unit, 6);
            MutableState mutableStateA00 = C1er.A00(bfm, ((HatchWhatsAppUiState) c1boA02.getValue()).connectPhase);
            MutableState mutableStateA002 = C1er.A00(bfm, c1boA022.getValue());
            boolean zA1K = AnonymousClass003.A1K(bfm, mutableStateA00, mutableStateA002);
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == C78N.A00) {
                objAaT4 = new ChannelConnectOverlayKt$WhatsAppConnectContent$sheetState$1$1(mutableStateA00, mutableStateA002);
                bfm.Ai0(objAaT4);
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, (G0U) objAaT4, false, bfm, 0, 5);
            boolean zA1I = AnonymousClass004.A1I(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1I || objAaT5 == C78N.A00) {
                objAaT5 = new ChannelConnectOverlayKt$WhatsAppConnectContent$4$1(function0);
                bfm.Ai0(objAaT5);
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, (Function0) objAaT5, null, auraSheetStateRememberAuraBottomSheetState, 0L, false, false, B1V.A00(bfm, new C110425(c1boA022, hatchWhatsAppViewModel, function0RememberWhatsAppUpdateNoteViewLogger, function0, c1boA02), -666475156), bfm, 12582912, 117);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110436(str, function0, i);
        }
    }

    public static final void MessengerConnectContent(String str, Function0<Unit> function0, BFM bfm, int i, int i2) {
        String str2 = str;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(1967734144);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                str2 = null;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zEquals = "disconnect".equals(str2);
            HatchMessengerViewModel.Factory factory = new HatchMessengerViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchMessengerViewModel hatchMessengerViewModel = (HatchMessengerViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchMessengerViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchMessengerViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            if (((HatchMessengerUiState) c1boA02.getValue()).isLoading) {
                MutableState.A09(true, mutableState);
            }
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(hatchMessengerViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new ChannelConnectOverlayKt$MessengerConnectContent$1$1(hatchMessengerViewModel);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            boolean zA1M = AnonymousClass003.A1M(bfm, hatchMessengerViewModel, contextA0H);
            int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = zA1M | AnonymousClass002.A1Q(i4, 32);
            Object objAaT3 = bfm.AaT();
            if (zA1Q || objAaT3 == obj) {
                objAaT3 = new ChannelConnectOverlayKt$MessengerConnectContent$2$1(hatchMessengerViewModel, contextA0H, function0, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, unit);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, hatchMessengerViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA1J || objAaT4 == obj) {
                objAaT4 = new ChannelConnectOverlayKt$MessengerConnectContent$3$1(hatchMessengerViewModel, c1boA02);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass006.A16(bfm, objAaT4, unit, 6);
            MutableState mutableStateA00 = C1er.A00(bfm, ((HatchMessengerUiState) c1boA02.getValue()).connectPhase);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new ChannelConnectOverlayKt$MessengerConnectContent$sheetState$1$1(mutableStateA00);
                bfm.Ai0(objAaT5);
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, (G0U) objAaT5, false, bfm, 0, 5);
            MessengerSheetState messengerSheetState = (!MutableState.A0A(mutableState) || ((HatchMessengerUiState) c1boA02.getValue()).isLoading) ? MessengerSheetState.LOADING : (((HatchMessengerUiState) c1boA02.getValue()).isLinked && zEquals) ? MessengerSheetState.DISCONNECT : ((HatchMessengerUiState) c1boA02.getValue()).isLinked ? MessengerSheetState.CONNECTED : MessengerSheetState.CONNECT;
            boolean z = i4 == 32;
            Object objAaT6 = bfm.AaT();
            if (z || objAaT6 == obj) {
                objAaT6 = new ChannelConnectOverlayKt$MessengerConnectContent$4$1(function0);
                bfm.Ai0(objAaT6);
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, (Function0) objAaT6, null, auraSheetStateRememberAuraBottomSheetState, 0L, false, false, B1V.A00(bfm, new AnonymousClass5(messengerSheetState, hatchMessengerViewModel, c1boA02), -1623604519), bfm, 12582912, 117);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(str2, function0, i, i2);
        }
    }

    public static final void TelegramConnectContent(String str, Function0<Unit> function0, BFM bfm, int i, int i2) {
        String str2 = str;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1946548426);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                str2 = null;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zEquals = "disconnect".equals(str2);
            HatchTelegramViewModel.Factory factory = new HatchTelegramViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchTelegramViewModel hatchTelegramViewModel = (HatchTelegramViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchTelegramViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchTelegramViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            if (((HatchTelegramUiState) c1boA02.getValue()).isLoading) {
                MutableState.A09(true, mutableState);
            }
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(hatchTelegramViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new ChannelConnectOverlayKt$TelegramConnectContent$1$1(hatchTelegramViewModel);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            Boolean boolValueOf = Boolean.valueOf(((HatchTelegramUiState) c1boA02.getValue()).isLoading);
            Boolean boolValueOf2 = Boolean.valueOf(((HatchTelegramUiState) c1boA02.getValue()).isLinked);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, hatchTelegramViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new ChannelConnectOverlayKt$TelegramConnectContent$2$1(hatchTelegramViewModel, mutableState, c1boA02);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A19(bfm, objAaT3, boolValueOf, boolValueOf2);
            boolean zA1M = AnonymousClass003.A1M(bfm, hatchTelegramViewModel, contextA0H);
            int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = zA1M | AnonymousClass002.A1Q(i4, 32);
            Object objAaT4 = bfm.AaT();
            if (zA1Q || objAaT4 == obj) {
                objAaT4 = new ChannelConnectOverlayKt$TelegramConnectContent$3$1(hatchTelegramViewModel, contextA0H, function0, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, unit);
            boolean zA1J2 = AnonymousClass003.A1J(bfm, c1boA02, hatchTelegramViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA1J2 || objAaT5 == obj) {
                objAaT5 = new ChannelConnectOverlayKt$TelegramConnectContent$4$1(hatchTelegramViewModel, c1boA02);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass006.A16(bfm, objAaT5, unit, 6);
            MutableState mutableStateA00 = C1er.A00(bfm, ((HatchTelegramUiState) c1boA02.getValue()).connectPhase);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == obj) {
                objAaT6 = new ChannelConnectOverlayKt$TelegramConnectContent$sheetState$1$1(mutableStateA00);
                bfm.Ai0(objAaT6);
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, (G0U) objAaT6, false, bfm, 0, 5);
            TelegramSheetState telegramSheetState = (!MutableState.A0A(mutableState) || ((HatchTelegramUiState) c1boA02.getValue()).isLoading) ? TelegramSheetState.LOADING : (((HatchTelegramUiState) c1boA02.getValue()).isLinked && zEquals) ? TelegramSheetState.DISCONNECT : ((HatchTelegramUiState) c1boA02.getValue()).isLinked ? TelegramSheetState.CONNECTED : TelegramSheetState.CONNECT;
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            boolean zA672 = bfm.A67(hatchTelegramViewModel) | AnonymousClass002.A1Q(i4, 32);
            Object objAaT7 = bfm.AaT();
            if (zA672 || objAaT7 == obj) {
                objAaT7 = new ChannelConnectOverlayKt$TelegramConnectContent$5$1(hatchTelegramViewModel, function0);
                bfm.Ai0(objAaT7);
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, (Function0) objAaT7, null, auraSheetStateRememberAuraBottomSheetState, 0L, false, false, B1V.A00(bfm, new C110416(c0HiA0Z, telegramSheetState, hatchTelegramViewModel, c1boA02), -676924739), bfm, 12582912, 117);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(str2, function0, i, i2);
        }
    }

    public static final /* synthetic */ HatchMessengerUiState access$MessengerConnectContent$lambda$0(C1BO c1bo) {
        return (HatchMessengerUiState) c1bo.getValue();
    }

    public static final /* synthetic */ MessengerConnectPhase access$MessengerConnectContent$lambda$7(C1BO c1bo) {
        return (MessengerConnectPhase) c1bo.getValue();
    }

    public static final /* synthetic */ HatchTelegramUiState access$TelegramConnectContent$lambda$0(C1BO c1bo) {
        return (HatchTelegramUiState) c1bo.getValue();
    }

    public static final /* synthetic */ TelegramConnectPhase access$TelegramConnectContent$lambda$8(C1BO c1bo) {
        return (TelegramConnectPhase) c1bo.getValue();
    }

    public static final /* synthetic */ HatchWhatsAppUiState access$WhatsAppConnectContent$lambda$0(C1BO c1bo) {
        return (HatchWhatsAppUiState) c1bo.getValue();
    }

    public static final /* synthetic */ WhatsAppSheetState access$WhatsAppConnectContent$lambda$1(C1BO c1bo) {
        return (WhatsAppSheetState) c1bo.getValue();
    }

    public static final /* synthetic */ WhatsAppConnectPhase access$WhatsAppConnectContent$lambda$5(C1BO c1bo) {
        return (WhatsAppConnectPhase) c1bo.getValue();
    }

    public static final /* synthetic */ WhatsAppSheetState access$WhatsAppConnectContent$lambda$6(C1BO c1bo) {
        return (WhatsAppSheetState) c1bo.getValue();
    }
}
