package com.facebook.aura.bloks.plugins.core.cdsopendatetimepickerv2;

import X.AnonymousClass003;
import X.C3cG;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions;

/* loaded from: classes6.dex */
public final class MWABloksCdsOpenDateTimePickerV2Implementation {
    public static final MWABloksCdsOpenDateTimePickerV2Implementation INSTANCE = new MWABloksCdsOpenDateTimePickerV2Implementation();

    public final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraNavigationExtensions.INSTANCE.openDateTimePicker(f6d, hj6);
        return C3cG.A0T();
    }
}
