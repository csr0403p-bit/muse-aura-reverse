package com.facebook.aura.vmbrowser;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.browsertask.view.AgentComputerScreenScope;
import com.facebook.aura.browsertask.view.AgentComputerTakeoverControls;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VmAgentComputerSurface$takeoverControls$1 implements AgentComputerTakeoverControls {
    public final /* synthetic */ VmAgentComputerSurface this$0;

    @Override // com.facebook.aura.browsertask.view.AgentComputerTakeoverControls
    public final void Content(final AgentComputerScreenScope agentComputerScreenScope, final boolean z, final boolean z2, final BRg bRg, BFM bfm, final int i) {
        AnonymousClass002.A1B(agentComputerScreenScope, 0, bRg);
        bfm.AgG(-34218624);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentComputerScreenScope, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            BrowserTakeoverBottomBarKt.BrowserTakeoverBottomBar(this.this$0.surface.takeoverControls, agentComputerScreenScope, z, bRg, z2, bfm, AnonymousClass002.A07(iA05 << 3, AgentComputerScreenScope.$stable << 3) | (iA05 & 7168) | ((iA05 << 6) & 57344), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.VmAgentComputerSurface$takeoverControls$1$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Content(agentComputerScreenScope, z, z2, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public VmAgentComputerSurface$takeoverControls$1(VmAgentComputerSurface vmAgentComputerSurface) {
        this.this$0 = vmAgentComputerSurface;
    }

    public static final Unit Content$lambda$0(VmAgentComputerSurface$takeoverControls$1 vmAgentComputerSurface$takeoverControls$1, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, BRg bRg, int i, BFM bfm, int i2) {
        vmAgentComputerSurface$takeoverControls$1.Content(agentComputerScreenScope, z, z2, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
