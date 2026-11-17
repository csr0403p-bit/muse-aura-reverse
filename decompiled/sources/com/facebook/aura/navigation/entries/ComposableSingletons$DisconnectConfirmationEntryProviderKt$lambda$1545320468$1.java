package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.DisconnectConfirmationSheetKey;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.skills.view.DisconnectConfirmationSheetKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$DisconnectConfirmationEntryProviderKt$lambda$1545320468$1 extends AbstractC7559F3s implements G0W<DisconnectConfirmationSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$DisconnectConfirmationEntryProviderKt$lambda$1545320468$1 INSTANCE = new ComposableSingletons$DisconnectConfirmationEntryProviderKt$lambda$1545320468$1();

    public ComposableSingletons$DisconnectConfirmationEntryProviderKt$lambda$1545320468$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, BFM bfm, Integer num) {
        invoke(disconnectConfirmationSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(disconnectConfirmationSheetKey, 0);
        String string = AuraExternalUriRegistry.INSTANCE.getResetHatchLearnMoreUri().uri.toString();
        C7384Etj.A0U(string);
        DisconnectConfirmationSheetKt.DisconnectConfirmationSheet(disconnectConfirmationSheetKey, string, null, bfm, i & 14, 4);
    }
}
