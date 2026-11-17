package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ApiKeyAuthSheetKey;
import com.facebook.aura.skills.connect.ApiKeyAuthScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ApiKeyAuthEntryProviderKt$lambda$-235858608$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ApiKeyAuthEntryProviderKt$lambda$235858608$1 extends AbstractC7559F3s implements G0W<ApiKeyAuthSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ApiKeyAuthEntryProviderKt$lambda$235858608$1 INSTANCE = new ComposableSingletons$ApiKeyAuthEntryProviderKt$lambda$235858608$1();

    public ComposableSingletons$ApiKeyAuthEntryProviderKt$lambda$235858608$1() {
        super(3);
    }

    public final void invoke(ApiKeyAuthSheetKey apiKeyAuthSheetKey, BFM bfm, int i) {
        ApiKeyAuthScreenKt.ApiKeyAuthScreen(apiKeyAuthSheetKey, bfm, AnonymousClass006.A0E(apiKeyAuthSheetKey, i));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ApiKeyAuthSheetKey apiKeyAuthSheetKey, BFM bfm, Integer num) {
        invoke(apiKeyAuthSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
