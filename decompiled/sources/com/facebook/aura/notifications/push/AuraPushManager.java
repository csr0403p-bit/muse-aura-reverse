package com.facebook.aura.notifications.push;

import X.C06H;
import X.C3939ChS;
import X.C3cG;
import X.C4JM;
import X.F0G;
import X.F18;
import X.F3u;
import android.content.Context;
import com.facebook.pushlite.PushTokenManager;

/* loaded from: classes5.dex */
public final class AuraPushManager {
    public static final Companion Companion;
    public static final C3939ChS instance;

    public final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public static final /* synthetic */ AuraPushManager$Companion$createPigeonDriver$1 access$createPigeonDriver(Companion companion) {
            return new AuraPushManager$Companion$createPigeonDriver$1();
        }

        public static final /* synthetic */ AuraPushManager$Companion$createRefresherConfig$1 access$createRefresherConfig(Companion companion, Context context) {
            return new AuraPushManager$Companion$createRefresherConfig$1(context);
        }

        private final F18 createDispatcher(Context context) {
            return new AuraPushManager$Companion$createDispatcher$1(context);
        }

        private final AuraPushManager$Companion$createPigeonDriver$1 createPigeonDriver() {
            return new AuraPushManager$Companion$createPigeonDriver$1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C3939ChS createPushManager(Context context) {
            return new C3939ChS(C4JM.A00(), AuraPushLoggerProvider.sessionAwareLogger, new F0G(), new AuraPushManager$Companion$createDispatcher$1(context), new AuraPushManager$Companion$createTokenManager$1(context), new AuraPushManager$Companion$createTokenStorageConfig$1(context));
        }

        private final AuraPushManager$Companion$createRefresherConfig$1 createRefresherConfig(Context context) {
            return new AuraPushManager$Companion$createRefresherConfig$1(context);
        }

        private final F18<PushTokenManager> createTokenManager(Context context) {
            return new AuraPushManager$Companion$createTokenManager$1(context);
        }

        private final F18<F3u> createTokenStorageConfig(Context context) {
            return new AuraPushManager$Companion$createTokenStorageConfig$1(context);
        }

        public final C3939ChS get() {
            return AuraPushManager.instance;
        }

        public final C3939ChS getInstance() {
            return AuraPushManager.instance;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion();
        Companion = companion;
        instance = companion.createPushManager(C3cG.A06());
    }

    public static final C3939ChS get() {
        return instance;
    }
}
