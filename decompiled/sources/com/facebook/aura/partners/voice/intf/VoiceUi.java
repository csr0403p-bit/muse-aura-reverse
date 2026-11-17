package com.facebook.aura.partners.voice.intf;

import X.BFM;
import X.BRg;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface VoiceUi {
    void CallLifecycleEffect(BFM bfm, int i);

    void CallNuxContent(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i);

    void CompactCallCaption(BRg bRg, BFM bfm, int i);

    void CompactCallCaptionToggle(BRg bRg, BFM bfm, int i);

    void CompactCallEndButton(BRg bRg, BFM bfm, int i);

    void CompactCallMuteButton(BRg bRg, BFM bfm, int i);

    void ComposerCallButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    void EmbodimentHost(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i);
}
