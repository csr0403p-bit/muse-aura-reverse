package com.facebook.aura.notifications.push;

import X.AbstractC5176DbJ;
import X.C06H;
import X.C3cG;
import X.C5175DbI;
import X.C7384Etj;
import X.DY2;
import X.Hzd;
import com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public final class ABRAUnregisterPushTokenMutationImpl {
    public static final Companion Companion = new Companion();
    public static final String QUERY_NAME = "ABRAUnregisterPushTokenMutation";

    public final class Builder implements ABRAUnregisterPushTokenMutation.Builder {
        public boolean isInputSet;
        public final C5175DbI params = new C5175DbI();
        public final C5175DbI transientParams = new C5175DbI();

        @Override // com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation.Builder, com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation.BuilderForInput
        public Builder setInput(Hzd hzd) {
            C7384Etj.A0Y(hzd, 0);
            this.params.A01(hzd, "input");
            this.isInputSet = true;
            return this;
        }

        @Override // X.InterfaceC5183Dbc
        public PandoGraphQLRequest build() {
            Preconditions.checkArgument(this.isInputSet);
            return DY2.A00(AbstractC5176DbJ.A00(), ABRAUnregisterPushTokenMutationImpl.QUERY_NAME, null, "abra_unregister_push_token", C3cG.A0h(), C5175DbI.A00(this.params), C5175DbI.A00(this.transientParams), ABRAUnregisterPushTokenMutationImpl$Builder$build$1.INSTANCE, 0, true);
        }

        @Override // com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation.Builder, com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutation.BuilderForInput
        public /* bridge */ /* synthetic */ ABRAUnregisterPushTokenMutation.Builder setInput(Hzd hzd) {
            setInput(hzd);
            return this;
        }
    }

    public final class Companion {
        public final ABRAUnregisterPushTokenMutation.BuilderForInput create() {
            return new Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final ABRAUnregisterPushTokenMutation.BuilderForInput create() {
        return new Builder();
    }
}
