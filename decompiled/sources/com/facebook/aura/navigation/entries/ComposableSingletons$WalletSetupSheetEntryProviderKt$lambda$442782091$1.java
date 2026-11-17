package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.conversation.view.WalletSetupSheetKt;
import com.facebook.aura.navigation.key.WalletSetupSheetKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$WalletSetupSheetEntryProviderKt$lambda$442782091$1 extends AbstractC7559F3s implements G0W<WalletSetupSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WalletSetupSheetEntryProviderKt$lambda$442782091$1 INSTANCE = new ComposableSingletons$WalletSetupSheetEntryProviderKt$lambda$442782091$1();

    public ComposableSingletons$WalletSetupSheetEntryProviderKt$lambda$442782091$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WalletSetupSheetKey walletSetupSheetKey, BFM bfm, Integer num) {
        invoke(walletSetupSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(WalletSetupSheetKey walletSetupSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(walletSetupSheetKey, 0);
        WalletSetupSheetKt.WalletSetupSheet(walletSetupSheetKey.options, walletSetupSheetKey.sourceSessionId, null, bfm, 0, 4);
    }
}
