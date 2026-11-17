package com.facebook.aura.partners.voice.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.VoiceSelectionListScreenKey;
import com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$-526642263$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1 extends AbstractC7559F3s implements G0W<VoiceSelectionListScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1 INSTANCE = new ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1();

    public ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1() {
        super(3);
    }

    public final void invoke(VoiceSelectionListScreenKey voiceSelectionListScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(voiceSelectionListScreenKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        boolean zA67 = bfm.A67(auraNavigatorA05);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1$1$1(auraNavigatorA05);
            BBI.A0O(bbi, objAaT);
        }
        VoiceSelectionListScreenKt.VoiceSelectionListScreen((Function0) objAaT, voiceSelectionListScreenKey.entryPoint, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceSelectionListScreenKey voiceSelectionListScreenKey, BFM bfm, Integer num) {
        invoke(voiceSelectionListScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
