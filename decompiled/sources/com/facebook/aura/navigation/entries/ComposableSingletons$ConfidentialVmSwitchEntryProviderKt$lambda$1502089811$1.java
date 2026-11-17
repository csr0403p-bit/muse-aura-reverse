package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmMigrationDoneOverlayScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$1502089811$1 extends AbstractC7559F3s implements G0W<ConfidentialVmMigrationDoneOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$1502089811$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$1502089811$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$1502089811$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConfidentialVmMigrationDoneScreenKt.ConfidentialVmMigrationDoneScreen(null, null, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmMigrationDoneOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
