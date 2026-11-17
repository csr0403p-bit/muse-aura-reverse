package com.facebook.aura.partners.voice.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BOD;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;
import com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$VoiceSelectionListSheetEntryProviderKt$lambda$-80042330$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceSelectionListSheetEntryProviderKt$lambda$80042330$1 extends AbstractC7559F3s implements G0W<VoiceSelectionListSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceSelectionListSheetEntryProviderKt$lambda$80042330$1 INSTANCE = new ComposableSingletons$VoiceSelectionListSheetEntryProviderKt$lambda$80042330$1();

    public ComposableSingletons$VoiceSelectionListSheetEntryProviderKt$lambda$80042330$1() {
        super(3);
    }

    public final void invoke(VoiceSelectionListSheetKey voiceSelectionListSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(voiceSelectionListSheetKey, 0);
        VoiceControlsViewModel.Factory factory = new VoiceControlsViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, (BBI) bfm), voiceSelectionListSheetKey.suggestedVoiceIds, false, false, null, null);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        VoiceSelectionListScreenKt.VoiceSelectionListSheet((VoiceControlsViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), VoiceControlsViewModel.class), voiceSelectionListSheetKey.origin, voiceSelectionListSheetKey.threadId, voiceSelectionListSheetKey.replyToMessageId, voiceSelectionListSheetKey.sourceWidgetId, voiceSelectionListSheetKey.sourceHostMessageId, voiceSelectionListSheetKey.entryPoint, null, bfm, VoiceControlsViewModel.$stable, 128);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceSelectionListSheetKey voiceSelectionListSheetKey, BFM bfm, Integer num) {
        invoke(voiceSelectionListSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
