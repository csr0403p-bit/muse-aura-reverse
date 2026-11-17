package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.screen.ComposableSingletons$HatchVoiceEmbodimentHostKt$lambda$-1059510008$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HatchVoiceEmbodimentHostKt$lambda$1059510008$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchVoiceEmbodimentHostKt$lambda$1059510008$1 INSTANCE = new ComposableSingletons$HatchVoiceEmbodimentHostKt$lambda$1059510008$1();

    public ComposableSingletons$HatchVoiceEmbodimentHostKt$lambda$1059510008$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            VoiceEmbodimentFullScreenKt.VoiceEmbodimentFullScreen(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
