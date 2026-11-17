package com.facebook.aura.spaces.preload;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C3cG;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import android.speech.tts.Voice;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class SpacesTtsBridge$pushVoices$json$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ Voice $voice;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("voiceURI", this.$voice.getName(), c2nw);
        C7qW.A06("name", this.$voice.getName(), c2nw);
        C7qW.A06("lang", this.$voice.getLocale().toLanguageTag(), c2nw);
        C7qW.A04(C3cG.A0P(this.$voice.isNetworkConnectionRequired()), "localService", c2nw);
        C7qW.A04(false, "default", c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesTtsBridge$pushVoices$json$1$1$1(Voice voice) {
        super(1);
        this.$voice = voice;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
