package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class LocalBrowserSettingsScreenKt$BrowserEnabledSetting$1$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public LocalBrowserSettingsScreenKt$BrowserEnabledSetting$1$1(Object obj) {
        super(1, obj, LocalBrowserSettingsViewModel.class, "setBrowserEnabled", "setBrowserEnabled(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((LocalBrowserSettingsViewModel) this.receiver).setBrowserEnabled(z);
    }
}
