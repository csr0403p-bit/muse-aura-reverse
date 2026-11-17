package com.facebook.aura.activation.repo;

import X.AbstractC5176DbJ;
import X.C06H;
import X.C3cG;
import X.C5175DbI;
import X.C7384Etj;
import X.DY2;
import com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public final class AuraDebugSetHatchWaitlistStatusMutationImpl {
    public static final Companion Companion = new Companion();
    public static final String QUERY_NAME = "AuraDebugSetHatchWaitlistStatusMutation";

    public final class Builder implements AuraDebugSetHatchWaitlistStatusMutation.Builder {
        public boolean isStatusSet;
        public final C5175DbI params = new C5175DbI();
        public final C5175DbI transientParams = new C5175DbI();

        @Override // com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation.Builder, com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation.BuilderForStatus
        public Builder setStatus(String str) {
            C7384Etj.A0Y(str, 0);
            this.params.A00.A08(AuraDeeplinkRouteMapper.STATUS_ROUTE, str);
            this.isStatusSet = true;
            return this;
        }

        @Override // X.InterfaceC5183Dbc
        public PandoGraphQLRequest build() {
            Preconditions.checkArgument(this.isStatusSet);
            return DY2.A00(AbstractC5176DbJ.A00(), AuraDebugSetHatchWaitlistStatusMutationImpl.QUERY_NAME, null, "xab_debug_set_hatch_waitlist_status", C3cG.A0h(), C5175DbI.A00(this.params), C5175DbI.A00(this.transientParams), AuraDebugSetHatchWaitlistStatusMutationImpl$Builder$build$1.INSTANCE, 0, true);
        }

        @Override // com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation.Builder, com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation.BuilderForStatus
        public /* bridge */ /* synthetic */ AuraDebugSetHatchWaitlistStatusMutation.Builder setStatus(String str) {
            setStatus(str);
            return this;
        }
    }

    public final class Companion {
        public final AuraDebugSetHatchWaitlistStatusMutation.BuilderForStatus create() {
            return new Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final AuraDebugSetHatchWaitlistStatusMutation.BuilderForStatus create() {
        return new Builder();
    }
}
