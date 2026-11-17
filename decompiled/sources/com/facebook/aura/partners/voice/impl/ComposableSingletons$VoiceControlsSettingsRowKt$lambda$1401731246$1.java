package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import kotlin.Unit;

/* renamed from: com.facebook.aura.partners.voice.impl.ComposableSingletons$VoiceControlsSettingsRowKt$lambda$-1401731246$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VoiceControlsSettingsRowKt$lambda$1401731246$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceControlsSettingsRowKt$lambda$1401731246$1 INSTANCE = new ComposableSingletons$VoiceControlsSettingsRowKt$lambda$1401731246$1();

    public ComposableSingletons$VoiceControlsSettingsRowKt$lambda$1401731246$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AnonymousClass007.A11(bfm, AuraCardDefaults.INSTANCE, R.drawable.voice_phone_handset_outline_24);
        } else {
            bfm.Afo();
        }
    }
}
