package com.facebook.aura.executors;

import X.CGH;

/* loaded from: classes5.dex */
public final class AuraWorkerFactoryHolder {
    public static final AuraWorkerFactoryHolder INSTANCE = new AuraWorkerFactoryHolder();
    public static final CGH workerFactory = new CGH();

    public final CGH getWorkerFactory() {
        return workerFactory;
    }
}
