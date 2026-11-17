package com.facebook.aura.mobileconfig.session;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMobileConfigSession$executorFactory$2 extends AbstractC7559F3s implements Function0<AndroidAsyncExecutorFactory> {
    public static final AuraMobileConfigSession$executorFactory$2 INSTANCE = new AuraMobileConfigSession$executorFactory$2();

    public AuraMobileConfigSession$executorFactory$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AndroidAsyncExecutorFactory invoke() {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor(AuraMobileConfigSessionKt.TAG, null);
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory();
        androidAsyncExecutorFactory2.mHybridData = AndroidAsyncExecutorFactory.initHybrid(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return androidAsyncExecutorFactory2;
    }
}
