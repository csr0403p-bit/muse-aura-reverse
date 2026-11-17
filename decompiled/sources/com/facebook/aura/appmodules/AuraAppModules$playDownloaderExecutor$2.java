package com.facebook.aura.appmodules;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAppModules$playDownloaderExecutor$2 extends AbstractC7559F3s implements Function0<ExecutorService> {
    public static final AuraAppModules$playDownloaderExecutor$2 INSTANCE = new AuraAppModules$playDownloaderExecutor$2();

    public AuraAppModules$playDownloaderExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newThreadPool(2, "AuraPlayDownloader");
    }
}
