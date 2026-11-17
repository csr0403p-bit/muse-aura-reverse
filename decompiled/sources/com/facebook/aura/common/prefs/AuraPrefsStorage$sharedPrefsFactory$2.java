package com.facebook.aura.common.prefs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.C7603F5q;
import X.C7cU;
import X.F37;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraPrefsStorage$sharedPrefsFactory$2 extends AbstractC7559F3s implements Function0<C7cU> {
    public static final AuraPrefsStorage$sharedPrefsFactory$2 INSTANCE = new AuraPrefsStorage$sharedPrefsFactory$2();

    public AuraPrefsStorage$sharedPrefsFactory$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C7cU invoke() {
        F37 f37 = new F37(C3cG.A06());
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C7384Etj.A0U(executorServiceNewSingleThreadExecutor);
        return new C7cU(f37.A00, executorServiceNewSingleThreadExecutor, new C7603F5q(f37, 1));
    }
}
