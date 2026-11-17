package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceLiveSession$attachmentLimit$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public static final VoiceLiveSession$attachmentLimit$2$1 INSTANCE = new VoiceLiveSession$attachmentLimit$2$1();

    public VoiceLiveSession$attachmentLimit$2$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(VoiceGating.INSTANCE.getAllowFilesDuringCall());
    }
}
