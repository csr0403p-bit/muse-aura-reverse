package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.F0C;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NativeLoginAccountResolverKt$whatsAppReadExecutor$2 extends AbstractC7559F3s implements Function0<Executor> {
    public static final NativeLoginAccountResolverKt$whatsAppReadExecutor$2 INSTANCE = new NativeLoginAccountResolverKt$whatsAppReadExecutor$2();

    public NativeLoginAccountResolverKt$whatsAppReadExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Executor invoke() {
        int i = AuraExecutors.CORE_POOL_SIZE;
        return new AuraExecutors.SerialExecutor(F0C.A05());
    }

    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        int i = AuraExecutors.CORE_POOL_SIZE;
        return new AuraExecutors.SerialExecutor(F0C.A05());
    }
}
