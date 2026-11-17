package com.facebook.aura.crashreporting;

import X.AbstractC3287C9e;
import X.AbstractC3358CGz;
import X.C3357CGy;
import X.C7384Etj;
import X.CH0;
import com.facebook.aura.appid.AuraClientToken;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraLacrimaUserSessionManagerProvider {
    public final Function0<AbstractC3358CGz> userSessionProvider;

    /* renamed from: com.facebook.aura.crashreporting.AuraLacrimaUserSessionManagerProvider$get$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC3287C9e {
        public AnonymousClass1() {
        }

        @Override // X.AbstractC3287C9e
        public String provideAccessToken() {
            String strA0z;
            AbstractC3358CGz abstractC3358CGzInvoke = AuraLacrimaUserSessionManagerProvider.this.userSessionProvider.invoke();
            return (abstractC3358CGzInvoke == null || (strA0z = C3357CGy.A0z(abstractC3358CGzInvoke)) == null) ? AuraClientToken.loggedOutARAccessToken : strA0z;
        }

        @Override // X.AbstractC3287C9e
        public String provideUserID() {
            AbstractC3358CGz abstractC3358CGzInvoke = AuraLacrimaUserSessionManagerProvider.this.userSessionProvider.invoke();
            if (abstractC3358CGzInvoke != null) {
                return ((CH0) abstractC3358CGzInvoke).A01;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraLacrimaUserSessionManagerProvider(Function0<? extends AbstractC3358CGz> function0) {
        C7384Etj.A0Y(function0, 0);
        this.userSessionProvider = function0;
    }

    public final AbstractC3287C9e get() {
        return new AnonymousClass1();
    }
}
