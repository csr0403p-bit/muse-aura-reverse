package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SettingsEntryProviderKt$lambda$-1939638829$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SettingsEntryProviderKt$lambda$1939638829$1 extends AbstractC7559F3s implements G0W<HatchSettingsPushScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SettingsEntryProviderKt$lambda$1939638829$1 INSTANCE = new ComposableSingletons$SettingsEntryProviderKt$lambda$1939638829$1();

    public ComposableSingletons$SettingsEntryProviderKt$lambda$1939638829$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchSettingsPushScreenKey hatchSettingsPushScreenKey, BFM bfm, Integer num) {
        invoke(hatchSettingsPushScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchSettingsPushScreenKey hatchSettingsPushScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchSettingsPushScreenKey, 0);
        SettingsEntryProviderKt.SettingsScreenContent(hatchSettingsPushScreenKey.subdestination, bfm, 0, 0);
    }
}
