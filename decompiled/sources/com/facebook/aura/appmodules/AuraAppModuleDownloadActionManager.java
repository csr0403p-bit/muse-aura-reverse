package com.facebook.aura.appmodules;

import X.AnonymousClass005;
import X.C7cU;
import X.CDv;
import X.EnumC7441Ew4;
import X.InterfaceC3307CDg;
import android.content.Context;

/* loaded from: classes5.dex */
public final class AuraAppModuleDownloadActionManager extends CDv {
    public final InterfaceC3307CDg voltronDownloadManager;

    @Override // X.CDv
    public boolean areDownloadsEnabled() {
        return true;
    }

    @Override // X.CDv
    public InterfaceC3307CDg getVoltronDownloadManager() {
        return this.voltronDownloadManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraAppModuleDownloadActionManager(Context context, C7cU c7cU, InterfaceC3307CDg interfaceC3307CDg) {
        super(context, c7cU);
        AnonymousClass005.A0x(context, c7cU, interfaceC3307CDg);
        this.voltronDownloadManager = interfaceC3307CDg;
    }

    @Override // X.CDv
    public EnumC7441Ew4 getPackagingPreference(String str) {
        return EnumC7441Ew4.A02;
    }

    @Override // X.CDv
    public boolean isSystemPrefetchEnabled(String str) {
        return false;
    }
}
