package com.facebook.aura.notifications.push;

import X.C7384Etj;
import X.C7603F5q;
import X.C7cU;
import X.F18;
import X.F37;
import X.F3u;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class AuraPushManager$Companion$createTokenStorageConfig$1<T> implements F18 {
    public final /* synthetic */ Context $context;

    public AuraPushManager$Companion$createTokenStorageConfig$1(Context context) {
        this.$context = context;
    }

    @Override // X.F18
    /* renamed from: get */
    public final F3u AMN() {
        F37 f37 = new F37(this.$context);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C7384Etj.A0U(executorServiceNewSingleThreadExecutor);
        return new F3u(new C7cU(f37.A00, executorServiceNewSingleThreadExecutor, new C7603F5q(f37, 1)));
    }
}
