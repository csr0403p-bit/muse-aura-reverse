package com.facebook.aura.mobileconfig;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.BV5;
import X.CFK;
import X.CH0;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.mobileconfig.session.AuraUserSession;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMobileConfig$sessionedMC$2 extends AbstractC7559F3s implements Function0<AuraUserSession> {
    public static final AuraMobileConfig$sessionedMC$2 INSTANCE = new AuraMobileConfig$sessionedMC$2();

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$sessionedMC$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
            if (currentUserSession != null) {
                return ((CH0) currentUserSession).A01;
            }
            return null;
        }
    }

    public AuraMobileConfig$sessionedMC$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraUserSession invoke() {
        CFK.A05(AuraMobileConfig.TAG, "Creating sessioned MC with AuraMobileConfigFetcher (ABRA STEFI)");
        return new AuraUserSession(AuraMobileConfigFetcher.INSTANCE, ((AuraMobileConfigParams) BV5.A0Z(65538)).provider, AnonymousClass1.INSTANCE, AuraMobileConfig.INSTANCE.getDeviceId());
    }
}
