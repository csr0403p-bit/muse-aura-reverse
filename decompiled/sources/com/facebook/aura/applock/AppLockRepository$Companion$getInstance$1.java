package com.facebook.aura.applock;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C78W;
import X.C8eO;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AppLockRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<AppLockRepository> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockRepository$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppLockRepository invoke() {
        return new AppLockRepository(AppLockDataStore.Companion.getInstance(this.$userSession), AppLockRepository.systemClock, C78W.A05(new C8eO(null), AuraDispatchers.mainImmediate));
    }
}
