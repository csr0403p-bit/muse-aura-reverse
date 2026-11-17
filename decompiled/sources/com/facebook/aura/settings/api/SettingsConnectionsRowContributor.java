package com.facebook.aura.settings.api;

import X.BFM;
import X.BRg;

/* loaded from: classes.dex */
public interface SettingsConnectionsRowContributor {
    void Row(BRg bRg, BFM bfm, int i);

    boolean rememberIsVisible(BFM bfm, int i);
}
