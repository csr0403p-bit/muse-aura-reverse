package com.facebook.aura.notifications.push;

import X.C06H;
import X.DY5;
import X.Hzd;
import X.InterfaceC5182Dbb;
import com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutationImpl;

/* loaded from: classes5.dex */
public final class ABRAUnregisterPushTokenMutation {
    public static final Companion Companion = new Companion();

    public interface Builder extends BuilderForInput, InterfaceC5182Dbb<DY5<ABRAUnregisterPushTokenMutationResponse>, ABRAUnregisterPushTokenMutationResponse> {
        @Override // com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation.BuilderForInput
        Builder setInput(Hzd hzd);
    }

    public interface BuilderForInput {
        Builder setInput(Hzd hzd);
    }

    public final class Companion {
        public final BuilderForInput create() {
            return new ABRAUnregisterPushTokenMutationImpl.Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final BuilderForInput create() {
        return new ABRAUnregisterPushTokenMutationImpl.Builder();
    }
}
