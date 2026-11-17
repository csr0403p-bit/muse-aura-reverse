package com.facebook.aura.activation.repo;

import X.C06H;
import X.DY5;
import X.InterfaceC5182Dbb;
import com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationImpl;

/* loaded from: classes5.dex */
public final class AuraDebugSetHatchWaitlistStatusMutation {
    public static final Companion Companion = new Companion();

    public interface Builder extends BuilderForStatus, InterfaceC5182Dbb<DY5<AuraDebugSetHatchWaitlistStatusMutationResponse>, AuraDebugSetHatchWaitlistStatusMutationResponse> {
        @Override // com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation.BuilderForStatus
        Builder setStatus(String str);
    }

    public interface BuilderForStatus {
        Builder setStatus(String str);
    }

    public final class Companion {
        public final BuilderForStatus create() {
            return new AuraDebugSetHatchWaitlistStatusMutationImpl.Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final BuilderForStatus create() {
        return new AuraDebugSetHatchWaitlistStatusMutationImpl.Builder();
    }
}
