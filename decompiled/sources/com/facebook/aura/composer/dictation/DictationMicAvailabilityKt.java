package com.facebook.aura.composer.dictation;

import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import com.facebook.aura.composer.dictation.engine.DictationMode;

/* loaded from: classes.dex */
public abstract class DictationMicAvailabilityKt {
    public static final boolean isAutoSubmitMicAvailable(ComposerDictationController composerDictationController, BFM bfm, int i) {
        C7384Etj.A0Y(composerDictationController, 0);
        return isMicAvailable(composerDictationController, DictationMode.AUTO_SUBMIT, bfm, (i & 14) | ComposerDictationController.$stable | 48);
    }

    public static final boolean isMicAvailable(ComposerDictationController composerDictationController, BFM bfm, int i) {
        C7384Etj.A0Y(composerDictationController, 0);
        return isMicAvailable(composerDictationController, DictationMode.MANUAL, bfm, (i & 14) | ComposerDictationController.$stable | 48);
    }

    public static final boolean isMicAvailable(ComposerDictationController composerDictationController, DictationMode dictationMode, BFM bfm, int i) {
        return composerDictationController.isAvailable$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(dictationMode, C1BO.A0F(C2CK.A02(bfm, composerDictationController.isConfidentialVm)));
    }
}
