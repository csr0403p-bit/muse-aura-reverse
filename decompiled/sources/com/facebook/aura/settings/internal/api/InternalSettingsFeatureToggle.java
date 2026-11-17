package com.facebook.aura.settings.internal.api;

import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class InternalSettingsFeatureToggle {
    public final Function0<Boolean> isChecked;
    public final G0U<Boolean, Unit> onPersisted;
    public final G0U<Boolean, Boolean> persist;

    public final G0U<Boolean, Unit> getOnPersisted() {
        return this.onPersisted;
    }

    public final G0U<Boolean, Boolean> getPersist() {
        return this.persist;
    }

    public final Function0<Boolean> isChecked() {
        return this.isChecked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalSettingsFeatureToggle(Function0<Boolean> function0, G0U<? super Boolean, Boolean> g0u, G0U<? super Boolean, Unit> g0u2) {
        AnonymousClass005.A0x(function0, g0u, g0u2);
        this.isChecked = function0;
        this.persist = g0u;
        this.onPersisted = g0u2;
    }
}
