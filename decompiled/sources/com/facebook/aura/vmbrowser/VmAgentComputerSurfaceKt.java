package com.facebook.aura.vmbrowser;

import X.AKQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass441;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1BN;
import X.C1BO;
import X.C1SA;
import X.C2CK;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC2178B0w;
import com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome;
import com.facebook.aura.browsertask.view.AgentComputerText;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VmAgentComputerSurfaceKt {
    public static final void RevokedPreviewFrame(final AgentBrowserSurface agentBrowserSurface, BRg bRg, BFM bfm, final int i, final int i2) {
        boolean z;
        final BRg bRg2 = bRg;
        bfm.AgG(-725620257);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentBrowserSurface, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, agentBrowserSurface.thumbnailUri);
            InterfaceC2178B0w interfaceC2178B0w = (InterfaceC2178B0w) C1BO.A07(bfm, agentBrowserSurface.previewFrame);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (interfaceC2178B0w != null) {
                bfm.AgE(-490403882);
                z = true;
                C1SA.A01(bfm, null, C10G.A01, interfaceC2178B0w, B18.A02, null, 25008, 232);
                BBI.A0R(bbi, false);
            } else {
                z = true;
                bfm.AgE(-490231863);
                BBI.A0R(bbi, false);
            }
            String strA08 = C1BO.A08(c1boA02);
            if (strA08 == null) {
                bfm.AgE(-490204832);
            } else {
                bfm.AgE(-490204831);
                AuraImageKt.m2573AuraImageXRP3Ue8(strA08, C10G.A01, B18.A02, null, null, false, null, 0L, z, AnonymousClass002.A1Y(interfaceC2178B0w), false, null, null, null, null, bfm, 100666800, 0, 31984);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.VmAgentComputerSurfaceKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AgentBrowserSurface agentBrowserSurface2 = agentBrowserSurface;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    VmAgentComputerSurfaceKt.RevokedPreviewFrame(agentBrowserSurface2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C1BN<AgentComputerText> literal(C1BN<String> c1bn, C3UX c3ux) {
        VmAgentComputerSurfaceKt$literal$$inlined$map$1 vmAgentComputerSurfaceKt$literal$$inlined$map$1 = new VmAgentComputerSurfaceKt$literal$$inlined$map$1(c1bn);
        C3Ej c3Ej = C3Ek.A00;
        String value = c1bn.getValue();
        return AnonymousClass441.A00(value != null ? new AgentComputerText.Literal(value) : null, c3ux, vmAgentComputerSurfaceKt$literal$$inlined$map$1, c3Ej);
    }

    public static final Unit RevokedPreviewFrame$lambda$3(AgentBrowserSurface agentBrowserSurface, BRg bRg, int i, int i2, BFM bfm, int i3) {
        RevokedPreviewFrame(agentBrowserSurface, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final AgentComputerTerminalOutcome toTerminalOutcome(BrowserTaskPresentation browserTaskPresentation) {
        return new AgentComputerTerminalOutcome(browserTaskPresentation.getDisplayState(), browserTaskPresentation.displayStatus, browserTaskPresentation.activityTitle);
    }
}
