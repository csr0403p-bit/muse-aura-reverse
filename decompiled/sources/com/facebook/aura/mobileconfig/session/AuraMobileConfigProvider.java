package com.facebook.aura.mobileconfig.session;

import X.DRZ;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes5.dex */
public interface AuraMobileConfigProvider {
    Object afterLogin(HtJ<? super Boolean> htJ);

    void afterLogout();

    void fetchConfigs();

    Object fetchConfigsSynchronously(HtJ<? super Boolean> htJ);

    Object forceEmergencyPushFetch(HtJ<? super Unit> htJ);

    DRZ getMCFactory();
}
