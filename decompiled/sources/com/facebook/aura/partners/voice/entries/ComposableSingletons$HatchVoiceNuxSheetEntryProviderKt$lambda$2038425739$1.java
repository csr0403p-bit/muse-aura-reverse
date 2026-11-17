package com.facebook.aura.partners.voice.entries;

import X.AGI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt$lambda$-2038425739$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt$lambda$2038425739$1 extends AbstractC7559F3s implements G0W<HatchVoiceNuxSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt$lambda$2038425739$1 INSTANCE = new ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt$lambda$2038425739$1();

    public ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt$lambda$2038425739$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey, BFM bfm, Integer num) {
        invoke(hatchVoiceNuxSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchVoiceNuxSheetKey, 0);
        HatchVoiceNuxSheetKt.HatchVoiceNuxSheet(hatchVoiceNuxSheetKey.threadId, hatchVoiceNuxSheetKey.callEntryPoint, AGI.A08(hatchVoiceNuxSheetKey.callAttribution), null, bfm, 0, 8);
    }
}
