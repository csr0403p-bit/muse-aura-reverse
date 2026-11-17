package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PermissionsSettingsScreenKey;
import com.facebook.aura.settings.HatchPermissionsSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$-2024675411$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$2024675411$1 extends AbstractC7559F3s implements G0W<PermissionsSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$2024675411$1 INSTANCE = new ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$2024675411$1();

    public ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$2024675411$1() {
        super(3);
    }

    public final void invoke(PermissionsSettingsScreenKey permissionsSettingsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$PermissionsSettingsEntryProviderKt$lambda$2024675411$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchPermissionsSettingsScreenKt.HatchPermissionsSettingsScreen((Function0) objAaT, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PermissionsSettingsScreenKey permissionsSettingsScreenKey, BFM bfm, Integer num) {
        invoke(permissionsSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
