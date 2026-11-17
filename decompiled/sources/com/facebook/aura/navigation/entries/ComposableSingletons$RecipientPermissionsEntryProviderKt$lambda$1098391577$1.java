package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.RecipientPermissionsScreenKey;
import com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$RecipientPermissionsEntryProviderKt$lambda$-1098391577$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RecipientPermissionsEntryProviderKt$lambda$1098391577$1 extends AbstractC7559F3s implements G0W<RecipientPermissionsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RecipientPermissionsEntryProviderKt$lambda$1098391577$1 INSTANCE = new ComposableSingletons$RecipientPermissionsEntryProviderKt$lambda$1098391577$1();

    public ComposableSingletons$RecipientPermissionsEntryProviderKt$lambda$1098391577$1() {
        super(3);
    }

    public final void invoke(RecipientPermissionsScreenKey recipientPermissionsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(recipientPermissionsScreenKey, 0);
        HatchRecipientPermissionsScreenKt.HatchRecipientPermissionsScreen(recipientPermissionsScreenKey.connectorId, recipientPermissionsScreenKey.connectorName, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RecipientPermissionsScreenKey recipientPermissionsScreenKey, BFM bfm, Integer num) {
        invoke(recipientPermissionsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
