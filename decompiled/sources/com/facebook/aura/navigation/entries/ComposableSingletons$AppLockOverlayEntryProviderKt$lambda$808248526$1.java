package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.applock.AppBiometricLockScreenKt;
import com.facebook.aura.navigation.key.AppLockOverlayScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AppLockOverlayEntryProviderKt$lambda$-808248526$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AppLockOverlayEntryProviderKt$lambda$808248526$1 extends AbstractC7559F3s implements G0W<AppLockOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AppLockOverlayEntryProviderKt$lambda$808248526$1 INSTANCE = new ComposableSingletons$AppLockOverlayEntryProviderKt$lambda$808248526$1();

    public ComposableSingletons$AppLockOverlayEntryProviderKt$lambda$808248526$1() {
        super(3);
    }

    public final void invoke(AppLockOverlayScreenKey appLockOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AppBiometricLockScreenKt.AppBiometricLockScreen(bfm, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AppLockOverlayScreenKey appLockOverlayScreenKey, BFM bfm, Integer num) {
        invoke(appLockOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
