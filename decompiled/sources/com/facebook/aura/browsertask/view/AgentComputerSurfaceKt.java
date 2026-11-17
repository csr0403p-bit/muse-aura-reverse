package com.facebook.aura.browsertask.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.C7384Etj;
import com.facebook.aura.browsertask.view.AgentComputerText;

/* loaded from: classes2.dex */
public abstract class AgentComputerSurfaceKt {
    public static final String resolve(AgentComputerText agentComputerText, BFM bfm, int i) {
        C7384Etj.A0Y(agentComputerText, 0);
        if (agentComputerText instanceof AgentComputerText.Literal) {
            AnonymousClass003.A0l(bfm, -15238570);
            return ((AgentComputerText.Literal) agentComputerText).value;
        }
        if (!(agentComputerText instanceof AgentComputerText.Resource)) {
            throw AnonymousClass005.A0k(bfm, -15240114);
        }
        bfm.AgE(-15237113);
        return AnonymousClass003.A0e(bfm, ((AgentComputerText.Resource) agentComputerText).id);
    }
}
