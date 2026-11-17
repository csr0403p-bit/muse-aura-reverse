package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.EncryptionScreenKey;
import com.facebook.aura.settings.EncryptionSettingScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$EncryptionEntryProviderKt$lambda$-1019872209$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EncryptionEntryProviderKt$lambda$1019872209$1 extends AbstractC7559F3s implements G0W<EncryptionScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EncryptionEntryProviderKt$lambda$1019872209$1 INSTANCE = new ComposableSingletons$EncryptionEntryProviderKt$lambda$1019872209$1();

    public ComposableSingletons$EncryptionEntryProviderKt$lambda$1019872209$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EncryptionScreenKey encryptionScreenKey, BFM bfm, Integer num) {
        invoke(encryptionScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EncryptionScreenKey encryptionScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            EncryptionSettingScreenKt.EncryptionSettingScreen(null, null, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }
}
