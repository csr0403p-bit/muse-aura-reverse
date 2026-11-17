package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.messenger.skills.read.view.MessengerPinScreenKt;
import com.facebook.aura.navigation.key.MessengerPinScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$MessengerPinEntryProviderKt$lambda$-1437076244$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$MessengerPinEntryProviderKt$lambda$1437076244$1 extends AbstractC7559F3s implements G0W<MessengerPinScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MessengerPinEntryProviderKt$lambda$1437076244$1 INSTANCE = new ComposableSingletons$MessengerPinEntryProviderKt$lambda$1437076244$1();

    public ComposableSingletons$MessengerPinEntryProviderKt$lambda$1437076244$1() {
        super(3);
    }

    public final void invoke(MessengerPinScreenKey messengerPinScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(messengerPinScreenKey, 0);
        MessengerPinScreenKt.MessengerPinScreen(messengerPinScreenKey.connectorId, messengerPinScreenKey.origin, null, messengerPinScreenKey.iconUrl, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MessengerPinScreenKey messengerPinScreenKey, BFM bfm, Integer num) {
        invoke(messengerPinScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
