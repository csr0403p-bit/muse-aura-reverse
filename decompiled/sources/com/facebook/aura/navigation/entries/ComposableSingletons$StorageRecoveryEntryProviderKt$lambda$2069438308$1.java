package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.StorageRecoveryOverlayScreenKey;
import com.facebook.aura.storagerecovery.content.StorageRecoveryOverlayContentKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$StorageRecoveryEntryProviderKt$lambda$-2069438308$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$StorageRecoveryEntryProviderKt$lambda$2069438308$1 extends AbstractC7559F3s implements G0W<StorageRecoveryOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$StorageRecoveryEntryProviderKt$lambda$2069438308$1 INSTANCE = new ComposableSingletons$StorageRecoveryEntryProviderKt$lambda$2069438308$1();

    public ComposableSingletons$StorageRecoveryEntryProviderKt$lambda$2069438308$1() {
        super(3);
    }

    public final void invoke(StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            StorageRecoveryOverlayContentKt.StorageRecoveryOverlayContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey, BFM bfm, Integer num) {
        invoke(storageRecoveryOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
