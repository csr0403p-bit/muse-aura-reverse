package com.facebook.aura.notifications.push;

import X.C06H;
import X.DY5;
import X.Hzd;
import X.InterfaceC5182Dbb;
import com.facebook.aura.notifications.push.ABRARegisterPushTokenMutationImpl;

/* loaded from: classes5.dex */
public final class ABRARegisterPushTokenMutation {
    public static final Companion Companion = new Companion();

    public interface Builder extends BuilderForInput, InterfaceC5182Dbb<DY5<ABRARegisterPushTokenMutationResponse>, ABRARegisterPushTokenMutationResponse> {
        @Override // com.facebook.aura.notifications.push.ABRARegisterPushTokenMutation.BuilderForInput
        Builder setInput(Hzd hzd);
    }

    public interface BuilderForInput {
        Builder setInput(Hzd hzd);
    }

    public final class Companion {
        public final BuilderForInput create() {
            return new ABRARegisterPushTokenMutationImpl.Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final BuilderForInput create() {
        return new ABRARegisterPushTokenMutationImpl.Builder();
    }
}
