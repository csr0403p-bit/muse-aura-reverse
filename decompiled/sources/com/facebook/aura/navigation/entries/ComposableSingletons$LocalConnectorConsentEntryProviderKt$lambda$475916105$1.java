package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.LocalConnectorConsentSheetKt;
import com.facebook.aura.navigation.key.LocalConnectorConsentSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LocalConnectorConsentEntryProviderKt$lambda$-475916105$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$LocalConnectorConsentEntryProviderKt$lambda$475916105$1 extends AbstractC7559F3s implements G0W<LocalConnectorConsentSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LocalConnectorConsentEntryProviderKt$lambda$475916105$1 INSTANCE = new ComposableSingletons$LocalConnectorConsentEntryProviderKt$lambda$475916105$1();

    public ComposableSingletons$LocalConnectorConsentEntryProviderKt$lambda$475916105$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LocalConnectorConsentSheetKey localConnectorConsentSheetKey, BFM bfm, Integer num) {
        invoke(localConnectorConsentSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(LocalConnectorConsentSheetKey localConnectorConsentSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(localConnectorConsentSheetKey, 0);
        LocalConnectorConsentSheetKt.LocalConnectorConsentSheet(localConnectorConsentSheetKey.destination, bfm, 0);
    }
}
