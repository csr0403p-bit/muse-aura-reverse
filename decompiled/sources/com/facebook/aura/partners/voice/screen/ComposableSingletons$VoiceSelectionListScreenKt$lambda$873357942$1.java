package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$VoiceSelectionListScreenKt$lambda$873357942$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceSelectionListScreenKt$lambda$873357942$1 INSTANCE = new ComposableSingletons$VoiceSelectionListScreenKt$lambda$873357942$1();

    public ComposableSingletons$VoiceSelectionListScreenKt$lambda$873357942$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            SavedVoiceSelectionKt.AppVoicesHeader(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
