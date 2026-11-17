package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<LatestAppVersionResponseJson>> {
    public static final AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequestbMdYcbs$default$1();

    public AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<LatestAppVersionResponseJson> invoke() {
        return LatestAppVersionResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<LatestAppVersionResponseJson> invoke() {
        return LatestAppVersionResponseJson$$serializer.INSTANCE;
    }
}
