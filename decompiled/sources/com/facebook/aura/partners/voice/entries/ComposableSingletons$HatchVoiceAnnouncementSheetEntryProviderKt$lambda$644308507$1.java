package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt$lambda$-644308507$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt$lambda$644308507$1 extends AbstractC7559F3s implements G0W<HatchVoiceAnnouncementSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt$lambda$644308507$1 INSTANCE = new ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt$lambda$644308507$1();

    public ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt$lambda$644308507$1() {
        super(3);
    }

    public final void invoke(HatchVoiceAnnouncementSheetKey hatchVoiceAnnouncementSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchVoiceAnnouncementSheetKt.HatchVoiceAnnouncementSheet(null, null, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchVoiceAnnouncementSheetKey hatchVoiceAnnouncementSheetKey, BFM bfm, Integer num) {
        invoke(hatchVoiceAnnouncementSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
