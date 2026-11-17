package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.CustomConnectorAuthSheetKey;
import com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$CustomConnectorAuthEntryProviderKt$lambda$-1301535445$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$CustomConnectorAuthEntryProviderKt$lambda$1301535445$1 extends AbstractC7559F3s implements G0W<CustomConnectorAuthSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$CustomConnectorAuthEntryProviderKt$lambda$1301535445$1 INSTANCE = new ComposableSingletons$CustomConnectorAuthEntryProviderKt$lambda$1301535445$1();

    public ComposableSingletons$CustomConnectorAuthEntryProviderKt$lambda$1301535445$1() {
        super(3);
    }

    public final void invoke(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, BFM bfm, int i) {
        CustomConnectorAuthScreenKt.CustomConnectorAuthScreen(customConnectorAuthSheetKey, bfm, AnonymousClass006.A0E(customConnectorAuthSheetKey, i));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, BFM bfm, Integer num) {
        invoke(customConnectorAuthSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
