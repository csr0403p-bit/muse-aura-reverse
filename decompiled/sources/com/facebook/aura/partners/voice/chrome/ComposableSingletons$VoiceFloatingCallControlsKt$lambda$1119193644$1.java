package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.chrome.ComposableSingletons$VoiceFloatingCallControlsKt$lambda$-1119193644$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VoiceFloatingCallControlsKt$lambda$1119193644$1 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceFloatingCallControlsKt$lambda$1119193644$1 INSTANCE = new ComposableSingletons$VoiceFloatingCallControlsKt$lambda$1119193644$1();

    public ComposableSingletons$VoiceFloatingCallControlsKt$lambda$1119193644$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        if (AnonymousClass002.A0B(g0v, i) == 0) {
            i |= AnonymousClass004.A0T(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AnonymousClass003.A13(bfm, g0v, i);
        } else {
            bfm.Afo();
        }
    }
}
