package com.facebook.aura.nodes.datasource;

import X.AnonymousClass001;
import X.HtJ;

/* loaded from: classes3.dex */
public interface ProactiveConnectionGate {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final ProactiveConnectionGate AlwaysReady = new ProactiveConnectionGate() { // from class: com.facebook.aura.nodes.datasource.ProactiveConnectionGate$Companion$AlwaysReady$1
            @Override // com.facebook.aura.nodes.datasource.ProactiveConnectionGate
            public boolean isConnected() {
                return true;
            }

            @Override // com.facebook.aura.nodes.datasource.ProactiveConnectionGate
            public Object awaitConnected(long j, HtJ<? super Boolean> htJ) {
                return AnonymousClass001.A0i();
            }
        };

        public final ProactiveConnectionGate getAlwaysReady() {
            return AlwaysReady;
        }
    }

    Object awaitConnected(long j, HtJ<? super Boolean> htJ);

    boolean isConnected();
}
