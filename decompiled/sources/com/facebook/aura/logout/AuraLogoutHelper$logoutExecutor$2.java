package com.facebook.aura.logout;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraLogoutHelper$logoutExecutor$2 extends AbstractC7559F3s implements Function0<ExecutorService> {
    public static final AuraLogoutHelper$logoutExecutor$2 INSTANCE = new AuraLogoutHelper$logoutExecutor$2();

    public AuraLogoutHelper$logoutExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor(AuraLogoutHelper.LOGOUT_THREAD_NAME);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor(AuraLogoutHelper.LOGOUT_THREAD_NAME);
    }
}
