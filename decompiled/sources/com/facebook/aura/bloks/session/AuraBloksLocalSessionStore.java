package com.facebook.aura.bloks.session;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.BV4;
import X.C06H;
import X.C5323DgH;
import X.CHA;
import X.F0C;
import X.InterfaceC7549F2g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class AuraBloksLocalSessionStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final F0C<AuraBloksLocalSessionStore> DEFAULT_SESSION_STORE$delegate = AbstractC5321DgF.A03(AuraBloksLocalSessionStore$Companion$DEFAULT_SESSION_STORE$2.INSTANCE);
    public final Map<Object, Object> map = BV4.A0u();

    public final class Companion {
        private final AuraBloksLocalSessionStore getDEFAULT_SESSION_STORE() {
            return AuraBloksLocalSessionStore.DEFAULT_SESSION_STORE$delegate.getValue();
        }

        public final AuraBloksLocalSessionStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            if (abstractC3358CGz == null) {
                return AuraBloksLocalSessionStore.DEFAULT_SESSION_STORE$delegate.getValue();
            }
            ConcurrentHashMap<Class<?>, F0C<InterfaceC7549F2g>> concurrentHashMap = CHA.A00;
            F0C<InterfaceC7549F2g> f0c = concurrentHashMap.get(AuraBloksLocalSessionStore.class);
            AuraBloksLocalSessionStore auraBloksLocalSessionStore = (AuraBloksLocalSessionStore) (f0c != null ? f0c.getValue() : null);
            if (auraBloksLocalSessionStore != null) {
                return auraBloksLocalSessionStore;
            }
            AuraBloksLocalSessionStore auraBloksLocalSessionStore2 = new AuraBloksLocalSessionStore();
            concurrentHashMap.put(AuraBloksLocalSessionStore.class, new C5323DgH(auraBloksLocalSessionStore2));
            return auraBloksLocalSessionStore2;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final AuraBloksLocalSessionStore getInstance() {
            return AuraBloksLocalSessionStore.DEFAULT_SESSION_STORE$delegate.getValue();
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.map.clear();
    }

    public final Map<Object, Object> getMap() {
        return this.map;
    }
}
