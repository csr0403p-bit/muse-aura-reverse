package com.facebook.aura.main.api;

import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public interface TimeSpentModuleProvider {
    HatchModule moduleFor(AuraNavKey auraNavKey);
}
