package com.facebook.aura.confidentialvm.network;

import X.AbstractC7559F3s;
import X.C10371HCv;
import X.Hqz;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraVestaManagerProvider$manager$2 extends AbstractC7559F3s implements Function0<C10371HCv> {
    public static final AuraVestaManagerProvider$manager$2 INSTANCE = new AuraVestaManagerProvider$manager$2();

    public AuraVestaManagerProvider$manager$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C10371HCv invoke() {
        return new C10371HCv(AuraQuickPerformanceLogger.INSTANCE.getInstance(), new Hqz(new AuraVestaStefiTransport()), AuraExecutors.INSTANCE.getBackgroundThreadExecutor());
    }
}
