package com.facebook.aura.channels.connect;

import X.AKQ;
import X.AbstractC7559F3s;
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
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.settings.HatchTelegramSettingsScreenKt;
import com.facebook.aura.settings.HatchTelegramUiState;
import com.facebook.aura.settings.HatchTelegramViewModel;
import com.facebook.aura.settings.TelegramConnectPhase;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$TelegramConnectContent$6$2$1 extends AbstractC7559F3s implements G0W<TelegramSheetState, BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<HatchTelegramUiState> $uiState$delegate;
    public final /* synthetic */ HatchTelegramViewModel $viewModel;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TelegramSheetState.values().length];
            try {
                AnonymousClass002.A13(TelegramSheetState.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(TelegramSheetState.CONNECT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(TelegramSheetState.CONNECTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(TelegramSheetState.DISCONNECT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$TelegramConnectContent$6$2$1(HatchTelegramViewModel hatchTelegramViewModel, C1BO<HatchTelegramUiState> c1bo) {
        super(3);
        this.$viewModel = hatchTelegramViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(TelegramSheetState telegramSheetState, BFM bfm, Integer num) {
        invoke(telegramSheetState, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(TelegramSheetState telegramSheetState, BFM bfm, int i) {
        int iA08;
        C7384Etj.A0Y(telegramSheetState, 0);
        if ((i & 6) == 0) {
            iA08 = AnonymousClass005.A08(bfm, telegramSheetState) | i;
        } else {
            iA08 = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            int iOrdinal = telegramSheetState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            bfm.AgE(-649013689);
                            boolean zA67 = bfm.A67(this.$viewModel);
                            HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
                            Object objAaT = bfm.AaT();
                            if (zA67 || objAaT == C78N.A00) {
                                objAaT = new ChannelConnectOverlayKt$TelegramConnectContent$6$2$1$3$1(hatchTelegramViewModel);
                                bfm.Ai0(objAaT);
                            }
                            HatchTelegramSettingsScreenKt.TelegramConnectedContent(true, (Function0) objAaT, this.$uiState$delegate.getValue().isLoading, bfm, 6, 0);
                        } else {
                            throw AnonymousClass005.A0k(bfm, 533232922);
                        }
                    } else {
                        bfm.AgE(-649113881);
                        HatchTelegramSettingsScreenKt.TelegramConnectedContent(false, null, false, bfm, 0, 7);
                    }
                } else {
                    bfm.AgE(-649336895);
                    TelegramConnectPhase telegramConnectPhase = this.$uiState$delegate.getValue().connectPhase;
                    boolean zA672 = bfm.A67(this.$viewModel);
                    HatchTelegramViewModel hatchTelegramViewModel2 = this.$viewModel;
                    Object objAaT2 = bfm.AaT();
                    if (zA672 || objAaT2 == C78N.A00) {
                        objAaT2 = new ChannelConnectOverlayKt$TelegramConnectContent$6$2$1$2$1(hatchTelegramViewModel2);
                        bfm.Ai0(objAaT2);
                    }
                    HatchTelegramSettingsScreenKt.TelegramOnboardingContent(telegramConnectPhase, (G0U) objAaT2, bfm, 0);
                }
            } else {
                bfm.AgE(-649613973);
                BRg bRgA04 = C10G.A04(C10G.A02, 200.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA04);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                C06G.A0g(bfm, bbi, AuraSpinnerStyle.Companion);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
