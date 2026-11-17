package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.WhatsAppCompanionSheetKey;
import com.facebook.aura.whatsapp.view.WhatsAppCompanionScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$WhatsAppCompanionEntryProviderKt$lambda$-1359912683$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$WhatsAppCompanionEntryProviderKt$lambda$1359912683$1 extends AbstractC7559F3s implements G0W<WhatsAppCompanionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WhatsAppCompanionEntryProviderKt$lambda$1359912683$1 INSTANCE = new ComposableSingletons$WhatsAppCompanionEntryProviderKt$lambda$1359912683$1();

    public ComposableSingletons$WhatsAppCompanionEntryProviderKt$lambda$1359912683$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WhatsAppCompanionSheetKey whatsAppCompanionSheetKey, BFM bfm, Integer num) {
        invoke(whatsAppCompanionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(WhatsAppCompanionSheetKey whatsAppCompanionSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(whatsAppCompanionSheetKey, 0);
        WhatsAppCompanionScreenKt.WhatsAppCompanionScreen(whatsAppCompanionSheetKey.skillId, whatsAppCompanionSheetKey.iconUrl, whatsAppCompanionSheetKey.origin, bfm, 0);
    }
}
