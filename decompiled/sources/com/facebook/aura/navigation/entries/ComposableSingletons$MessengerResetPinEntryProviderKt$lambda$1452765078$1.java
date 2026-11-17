package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.messenger.skills.read.view.MessengerResetPinSheetKt;
import com.facebook.aura.navigation.key.MessengerResetPinSheetKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$MessengerResetPinEntryProviderKt$lambda$1452765078$1 extends AbstractC7559F3s implements G0W<MessengerResetPinSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MessengerResetPinEntryProviderKt$lambda$1452765078$1 INSTANCE = new ComposableSingletons$MessengerResetPinEntryProviderKt$lambda$1452765078$1();

    public ComposableSingletons$MessengerResetPinEntryProviderKt$lambda$1452765078$1() {
        super(3);
    }

    public final void invoke(MessengerResetPinSheetKey messengerResetPinSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(messengerResetPinSheetKey, 0);
        MessengerResetPinSheetKt.MessengerResetPinSheet(messengerResetPinSheetKey.origin, messengerResetPinSheetKey.iconUrl, messengerResetPinSheetKey.reason, bfm, 0, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MessengerResetPinSheetKey messengerResetPinSheetKey, BFM bfm, Integer num) {
        invoke(messengerResetPinSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
