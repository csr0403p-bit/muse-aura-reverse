package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$1$1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
    public static final VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$1$1 INSTANCE = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$1$1();

    public VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return Boolean.valueOf(auraNavKey instanceof VoiceSelectionListSheetKey);
    }
}
