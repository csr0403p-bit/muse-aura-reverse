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
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt;
import com.facebook.aura.settings.HatchWhatsAppUiState;
import com.facebook.aura.settings.HatchWhatsAppViewModel;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;
import com.facebook.aura.settings.WhatsAppConnectPhase;
import com.facebook.aura.settings.WhatsAppSheetState;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1 extends AbstractC7559F3s implements G0W<WhatsAppSheetState, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;
    public final /* synthetic */ C1BO<HatchWhatsAppUiState> $uiState$delegate;
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WhatsAppSheetState.values().length];
            try {
                AnonymousClass002.A13(WhatsAppSheetState.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WhatsAppSheetState.CONNECT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WhatsAppSheetState.CONNECTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(WhatsAppSheetState.REPLACE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(WhatsAppSheetState.SWITCHING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1(HatchWhatsAppViewModel hatchWhatsAppViewModel, Function0<Unit> function0, Function0<Unit> function02, C1BO<HatchWhatsAppUiState> c1bo) {
        super(3);
        this.$viewModel = hatchWhatsAppViewModel;
        this.$onUpdateNoteShown = function0;
        this.$onDismiss = function02;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WhatsAppSheetState whatsAppSheetState, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(whatsAppSheetState, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(WhatsAppSheetState whatsAppSheetState, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int iA08;
        C7384Etj.A0Y(whatsAppSheetState, 0);
        if ((i & 6) == 0) {
            iA08 = AnonymousClass005.A08(bfm, whatsAppSheetState) | i;
        } else {
            iA08 = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            int iOrdinal = whatsAppSheetState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3 && iOrdinal != 4) {
                            throw AnonymousClass005.A0k(bfm, -828388626);
                        }
                        bfm.AgE(90664207);
                        Unit unit = Unit.INSTANCE;
                        boolean zA67 = bfm.A67(this.$viewModel);
                        HatchWhatsAppViewModel hatchWhatsAppViewModel = this.$viewModel;
                        Object objAaT = bfm.AaT();
                        if (zA67 || objAaT == C78N.A00) {
                            objAaT = new ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1$4$1(hatchWhatsAppViewModel);
                            bfm.Ai0(objAaT);
                        }
                        AnonymousClass001.A17(bfm, objAaT, unit);
                        boolean zA1Z = AnonymousClass002.A1Z(whatsAppSheetState, WhatsAppSheetState.SWITCHING);
                        WhatsAppConnectDisclosure whatsAppConnectDisclosure = this.$uiState$delegate.getValue().disclosure;
                        boolean zA672 = bfm.A67(this.$viewModel);
                        HatchWhatsAppViewModel hatchWhatsAppViewModel2 = this.$viewModel;
                        Object objAaT2 = bfm.AaT();
                        if (zA672 || objAaT2 == C78N.A00) {
                            objAaT2 = new ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1$5$1(hatchWhatsAppViewModel2);
                            bfm.Ai0(objAaT2);
                        }
                        HatchWhatsAppSettingsScreenKt.WhatsAppReplaceContent(zA1Z, whatsAppConnectDisclosure, (Function0) objAaT2, this.$onDismiss, this.$onUpdateNoteShown, null, bfm, 0, 32);
                    } else {
                        bfm.AgE(90518569);
                        HatchWhatsAppSettingsScreenKt.WhatsAppConnectedContent(bfm, 0);
                    }
                } else {
                    bfm.AgE(90058188);
                    Unit unit2 = Unit.INSTANCE;
                    boolean zA673 = bfm.A67(this.$viewModel);
                    HatchWhatsAppViewModel hatchWhatsAppViewModel3 = this.$viewModel;
                    Object objAaT3 = bfm.AaT();
                    if (zA673 || objAaT3 == C78N.A00) {
                        objAaT3 = new ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1$2$1(hatchWhatsAppViewModel3);
                        bfm.Ai0(objAaT3);
                    }
                    AnonymousClass001.A17(bfm, objAaT3, unit2);
                    WhatsAppConnectPhase whatsAppConnectPhase = this.$uiState$delegate.getValue().connectPhase;
                    WhatsAppConnectDisclosure whatsAppConnectDisclosure2 = this.$uiState$delegate.getValue().disclosure;
                    boolean zA674 = bfm.A67(this.$viewModel);
                    HatchWhatsAppViewModel hatchWhatsAppViewModel4 = this.$viewModel;
                    Object objAaT4 = bfm.AaT();
                    if (zA674 || objAaT4 == C78N.A00) {
                        objAaT4 = new ChannelConnectOverlayKt$WhatsAppConnectContent$5$1$1$3$1(hatchWhatsAppViewModel4);
                        bfm.Ai0(objAaT4);
                    }
                    HatchWhatsAppSettingsScreenKt.WhatsAppOnboardingContent(whatsAppConnectPhase, whatsAppConnectDisclosure2, (Function0) objAaT4, this.$onUpdateNoteShown, null, bfm, 0, 16);
                }
            } else {
                bfm.AgE(89773453);
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
