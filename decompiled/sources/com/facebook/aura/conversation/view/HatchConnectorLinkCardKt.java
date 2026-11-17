package com.facebook.aura.conversation.view;

import X.AOe;
import X.ARD;
import X.ASk;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C1D3;
import X.C1Dt;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorLinkCardKt {
    public static final int SettleDurationMs = 300;

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorLinkCardKt$ConnectorCardButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ String $connectLabel;
        public final /* synthetic */ String $connectUrl;
        public final /* synthetic */ String $connectedLabel;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isReconnect;
        public final /* synthetic */ C1BO<Boolean> $isReconnecting$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $sourceSessionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ HatchConnectorLinkCardViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, String str2, boolean z, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, String str3, Context context, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str4, C1BO<Boolean> c1bo) {
            super(3);
            this.$card = internalLinkActionCardPresentation;
            this.$connectedLabel = str;
            this.$connectLabel = str2;
            this.$isReconnect = z;
            this.$viewModel = hatchConnectorLinkCardViewModel;
            this.$sourceSessionId = str3;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
            this.$connectUrl = str4;
            this.$isReconnecting$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, BFM bfm, int i) {
            String str;
            int iA0n = i;
            if ((i & 6) == 0) {
                iA0n = i | AnonymousClass004.A0n(bfm, z);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
                String str2 = this.$card.type;
                if (z) {
                    str = this.$connectedLabel;
                } else {
                    str = this.$connectLabel;
                }
                boolean z2 = !C1BO.A0F(this.$isReconnecting$delegate);
                BS0 bs0 = BRg.A00;
                boolean zA1B = AnonymousClass003.A1B(iA0n);
                Object objAaT = bfm.AaT();
                if (zA1B || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorLinkCardKt$ConnectorCardButton$1$1$1(z);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA01 = ARD.A01(bs0, (G0U) objAaT, false);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$connectUrl, AnonymousClass001.A1T(bfm, this.$userSession, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1R(bfm, this.$sourceSessionId, AnonymousClass001.A1T(bfm, this.$card, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A66(this.$isReconnect))))))));
                boolean z3 = this.$isReconnect;
                HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel = this.$viewModel;
                InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
                String str3 = this.$sourceSessionId;
                AuraNavigator auraNavigator = this.$navigator;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str4 = this.$connectUrl;
                Context context = this.$context;
                Object objAaT2 = bfm.AaT();
                if (zA1R || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorLinkCardKt$ConnectorCardButton$1$2$1(z3, hatchConnectorLinkCardViewModel, internalLinkActionCardPresentation, str3, auraNavigator, abstractC3358CGz, str4, context);
                    bfm.Ai0(objAaT2);
                }
                HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(str2, str, (Function0) objAaT2, bRgA01, z2, null, null, bfm, 0, 96);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorLinkCardKt$ConnectorCardButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ boolean $connected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AOe<Float> $settleSpec;
        public final /* synthetic */ String $sourceSessionId;
        public final /* synthetic */ HatchConnectorLinkCardViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, boolean z, AOe<Float> aOe, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$card = internalLinkActionCardPresentation;
            this.$viewModel = hatchConnectorLinkCardViewModel;
            this.$connected = z;
            this.$settleSpec = aOe;
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
            HatchConnectorLinkCardKt.ConnectorCardButton(this.$card, this.$viewModel, this.$connected, this.$settleSpec, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConnectorCardButton(InternalLinkActionCardPresentation internalLinkActionCardPresentation, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, boolean z, AOe<Float> aOe, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1122441030);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(internalLinkActionCardPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchConnectorLinkCardViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(aOe, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zEquals = InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR_RECONNECT.equals(internalLinkActionCardPresentation.type);
            boolean z2 = false;
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorLinkCardViewModel.isReconnecting);
            if (zEquals) {
                i3 = R.string._name_removed__res_0x7f120f8d;
            } else {
                boolean z3 = internalLinkActionCardPresentation.walletSetup;
                i3 = R.string._name_removed__res_0x7f120c3a;
                if (z3) {
                    i3 = R.string._name_removed__res_0x7f120c38;
                }
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            String str2 = internalLinkActionCardPresentation.actionLabel;
            if (str2 != null) {
                strA01 = str2;
            }
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c3b);
            String str3 = internalLinkActionCardPresentation.url;
            if (str3 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new HatchConnectorLinkCardKt$ConnectorCardButton$connectUrl$1(internalLinkActionCardPresentation, hatchConnectorLinkCardViewModel, z, aOe, str, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            if (z && !zEquals) {
                z2 = true;
            }
            C1Dt.A01(aOe, bfm, bRg2, Boolean.valueOf(z2), "connectorCardCta", B1V.A00(bfm, new AnonymousClass1(internalLinkActionCardPresentation, strA012, strA01, zEquals, hatchConnectorLinkCardViewModel, str, contextA0H, auraNavigatorA0b, abstractC3358CGzA0g, str3, c1boA02), 411232999), ((iA05 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 27648 | ((iA05 >> 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(internalLinkActionCardPresentation, hatchConnectorLinkCardViewModel, z, aOe, str, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }

    /* renamed from: HatchConnectorLinkCard-8V94_ZQ, reason: not valid java name */
    public static final void m544HatchConnectorLinkCard8V94_ZQ(InternalLinkActionCardPresentation internalLinkActionCardPresentation, long j, C1D3 c1d3, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        bfm.AgG(-51866239);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(internalLinkActionCardPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
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
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str2 = internalLinkActionCardPresentation.connectorId;
            String str3 = internalLinkActionCardPresentation.url;
            String strA0d = FGI.A0d("connectorCard:", str2, ":", str3);
            List<WalletSetupOption> list = internalLinkActionCardPresentation.walletSetupOptions;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<WalletSetupOption> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().connectorId);
            }
            HatchConnectorLinkCardViewModel.Factory factory = new HatchConnectorLinkCardViewModel.Factory(abstractC3358CGzA0h, str2, str3, arrayListA0i);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel = (HatchConnectorLinkCardViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorLinkCardViewModel.class, strA0d);
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorLinkCardViewModel.uiState);
            boolean zA1Z = AnonymousClass002.A1Z(c1boA02.getValue(), ConnectorCardState.Connected);
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(internalLinkActionCardPresentation));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object value = c1boA02.getValue();
            boolean zA1K = AnonymousClass003.A1K(bfm, c1boA02, mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConnectorLinkCardKt$HatchConnectorLinkCard$1$1(c1boA02, mutableState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, value);
            int i4 = iA05 >> 3;
            HatchInternalLinkActionCardKt.m629InternalLinkCardContainereuL9pac(j, c1d3, bRg2, B1V.A00(bfm, new HatchConnectorLinkCardKt$HatchConnectorLinkCard$2(internalLinkActionCardPresentation, hatchConnectorLinkCardViewModel, zA1Z, MutableState.A0A(mutableState) ? AnonymousClass001.A0K(300, 0) : new ASk(), str), 1977076197), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 3072 | ((iA05 >> 6) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorLinkCardKt$HatchConnectorLinkCard$3(internalLinkActionCardPresentation, j, c1d3, str, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConnectorCardState access$HatchConnectorLinkCard_8V94_ZQ$lambda$1(C1BO c1bo) {
        return (ConnectorCardState) c1bo.getValue();
    }
}
