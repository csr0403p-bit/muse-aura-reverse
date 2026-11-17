package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.CancelEncryptionScreenKey;
import com.facebook.aura.settings.CancelEncryptionScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$CancelEncryptionEntryProviderKt$lambda$2072546877$1 extends AbstractC7559F3s implements G0W<CancelEncryptionScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$CancelEncryptionEntryProviderKt$lambda$2072546877$1 INSTANCE = new ComposableSingletons$CancelEncryptionEntryProviderKt$lambda$2072546877$1();

    public ComposableSingletons$CancelEncryptionEntryProviderKt$lambda$2072546877$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CancelEncryptionScreenKey cancelEncryptionScreenKey, BFM bfm, Integer num) {
        invoke(cancelEncryptionScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(CancelEncryptionScreenKey cancelEncryptionScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            CancelEncryptionScreenKt.CancelEncryptionScreen(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
