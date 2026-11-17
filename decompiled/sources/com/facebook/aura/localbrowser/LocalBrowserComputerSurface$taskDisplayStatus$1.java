package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.C7BY;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.view.AgentComputerText;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$taskDisplayStatus$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface$taskDisplayStatus$1 extends AbstractC07127nr implements G2k<LocalBrowserFacts, LocalBrowserPageState, Long, BrowserTaskPresentation, HtJ<? super AgentComputerText>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ LocalBrowserComputerSurface this$0;

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(LocalBrowserFacts localBrowserFacts, LocalBrowserPageState localBrowserPageState, Long l, BrowserTaskPresentation browserTaskPresentation, HtJ<? super AgentComputerText> htJ) {
        return invoke(localBrowserFacts, localBrowserPageState, C3cG.A05(l), browserTaskPresentation, htJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserComputerSurface$taskDisplayStatus$1(LocalBrowserComputerSurface localBrowserComputerSurface, HtJ<? super LocalBrowserComputerSurface$taskDisplayStatus$1> htJ) {
        super(5, htJ);
        this.this$0 = localBrowserComputerSurface;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int iLocalBrowserStatusRes;
        LocalBrowserFacts localBrowserFacts = (LocalBrowserFacts) this.L$0;
        LocalBrowserPageState localBrowserPageState = (LocalBrowserPageState) this.L$1;
        BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (localBrowserFacts.userActionRequired == null || localBrowserFacts.control != LocalBrowserControl.AGENT) {
            if (browserTaskPresentation != null) {
            }
            iLocalBrowserStatusRes = LocalBrowserScreenKt.localBrowserStatusRes(localBrowserFacts, localBrowserPageState, this.this$0.session.dialogs.getHasPending());
            return new AgentComputerText.Resource(iLocalBrowserStatusRes);
        }
        if (browserTaskPresentation == null || !browserTaskPresentation.isTombstone()) {
            iLocalBrowserStatusRes = R.string._name_removed__res_0x7f120caa;
            return new AgentComputerText.Resource(iLocalBrowserStatusRes);
        }
        String str = browserTaskPresentation.displayStatus;
        if (str != null && !C7BY.A0j(str)) {
            return new AgentComputerText.Literal(str);
        }
        iLocalBrowserStatusRes = LocalBrowserScreenKt.localBrowserStatusRes(localBrowserFacts, localBrowserPageState, this.this$0.session.dialogs.getHasPending());
        return new AgentComputerText.Resource(iLocalBrowserStatusRes);
    }

    public final Object invoke(LocalBrowserFacts localBrowserFacts, LocalBrowserPageState localBrowserPageState, long j, BrowserTaskPresentation browserTaskPresentation, HtJ<? super AgentComputerText> htJ) {
        LocalBrowserComputerSurface$taskDisplayStatus$1 localBrowserComputerSurface$taskDisplayStatus$1 = new LocalBrowserComputerSurface$taskDisplayStatus$1(this.this$0, htJ);
        localBrowserComputerSurface$taskDisplayStatus$1.L$0 = localBrowserFacts;
        localBrowserComputerSurface$taskDisplayStatus$1.L$1 = localBrowserPageState;
        localBrowserComputerSurface$taskDisplayStatus$1.L$2 = browserTaskPresentation;
        return localBrowserComputerSurface$taskDisplayStatus$1.invokeSuspend(Unit.INSTANCE);
    }
}
