package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.VoiceCatalogFilterSheetKey;
import com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$538785592$1 extends AbstractC7559F3s implements G0W<VoiceCatalogFilterSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$538785592$1 INSTANCE = new ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$538785592$1();

    public ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$538785592$1() {
        super(3);
    }

    public final void invoke(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(voiceCatalogFilterSheetKey, 0);
        VoiceSelectionListScreenKt.VoiceCatalogFilterSheet(voiceCatalogFilterSheetKey.kind, voiceCatalogFilterSheetKey.entryPoint, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey, BFM bfm, Integer num) {
        invoke(voiceCatalogFilterSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
