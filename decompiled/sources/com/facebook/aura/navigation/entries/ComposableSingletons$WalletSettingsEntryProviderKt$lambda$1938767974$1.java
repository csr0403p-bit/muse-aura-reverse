package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.WalletSettingsScreenKey;
import com.facebook.aura.settings.HatchWalletScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$WalletSettingsEntryProviderKt$lambda$-1938767974$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$WalletSettingsEntryProviderKt$lambda$1938767974$1 extends AbstractC7559F3s implements G0W<WalletSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WalletSettingsEntryProviderKt$lambda$1938767974$1 INSTANCE = new ComposableSingletons$WalletSettingsEntryProviderKt$lambda$1938767974$1();

    public ComposableSingletons$WalletSettingsEntryProviderKt$lambda$1938767974$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WalletSettingsScreenKey walletSettingsScreenKey, BFM bfm, Integer num) {
        invoke(walletSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(WalletSettingsScreenKey walletSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchWalletScreenKt.HatchWalletScreen(null, null, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }
}
