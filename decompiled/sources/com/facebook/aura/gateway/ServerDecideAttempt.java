package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class ServerDecideAttempt {
    public final boolean outcomeUnknown;
    public final HatchAgentPermissionsRepository.DecideResult result;

    public ServerDecideAttempt(HatchAgentPermissionsRepository.DecideResult decideResult, boolean z) {
        C7384Etj.A0Y(decideResult, 0);
        this.result = decideResult;
        this.outcomeUnknown = z;
    }

    public final boolean getOutcomeUnknown() {
        return this.outcomeUnknown;
    }

    public final HatchAgentPermissionsRepository.DecideResult getResult() {
        return this.result;
    }

    public /* synthetic */ ServerDecideAttempt(HatchAgentPermissionsRepository.DecideResult decideResult, boolean z, int i, C06H c06h) {
        this(decideResult, AnonymousClass001.A1Q(i, z));
    }
}
