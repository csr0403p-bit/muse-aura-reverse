package com.facebook.aura.gateway;

import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C3cG;
import X.C9286GCn;
import X.HnJ;
import com.facebook.aura.model.HatchSubAgent;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchSubAgentsHandler {
    public static final int $stable = 0;
    public final BLG<List<HatchSubAgent>> _activeSubAgents;
    public final BLG<List<HatchSubAgent>> _completedSubAgents;
    public final C1BN<List<HatchSubAgent>> activeSubAgents;
    public final Map<String, String> agentToToolMap;
    public final C1BN<List<HatchSubAgent>> completedSubAgents;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleEvent(com.facebook.aura.model.HatchChatEvent r14) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchSubAgentsHandler.handleEvent(com.facebook.aura.model.HatchChatEvent):void");
    }

    public final void clearState() {
        this.agentToToolMap.clear();
        BLG<List<HatchSubAgent>> blg = this._activeSubAgents;
        C0881AGi c0881AGi = C0881AGi.A00;
        blg.Af8(c0881AGi);
        this._completedSubAgents.Af8(c0881AGi);
    }

    public final C1BN<List<HatchSubAgent>> getActiveSubAgents() {
        return this.activeSubAgents;
    }

    public final C1BN<List<HatchSubAgent>> getCompletedSubAgents() {
        return this.completedSubAgents;
    }

    public HatchSubAgentsHandler() {
        C0881AGi c0881AGi = C0881AGi.A00;
        C9286GCn c9286GCnA01 = HnJ.A01(c0881AGi);
        this._activeSubAgents = c9286GCnA01;
        this.activeSubAgents = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(c0881AGi);
        this._completedSubAgents = c9286GCnA012;
        this.completedSubAgents = C3cG.A11(c9286GCnA012);
        this.agentToToolMap = C3cG.A0j();
    }
}
