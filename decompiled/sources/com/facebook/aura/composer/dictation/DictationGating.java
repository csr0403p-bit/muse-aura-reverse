package com.facebook.aura.composer.dictation;

import X.BV5;
import X.C31u;
import X.C3cG;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import com.facebook.aura.composer.dictation.MC;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes5.dex */
public final class DictationGating {
    public static final int $stable = 0;
    public static final long END_OF_TURN_SILENCE_MS = 1500;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(DictationGating.class, "voyagerModelName", "getVoyagerModelName()Ljava/lang/String;"), C3cG.A0y(DictationGating.class, "isCvmDictationEnabled", "isCvmDictationEnabled$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation()Z"), C3cG.A0y(DictationGating.class, "isAppendEnabled", "isAppendEnabled()Z"), C3cG.A0y(DictationGating.class, "isLanguageBiasEnabled", "isLanguageBiasEnabled()Z")};
    public static final DictationGating INSTANCE = new DictationGating();
    public static final C31u voyagerModelName$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.android_lobster_voice_abra.voyager_dictation_model_name);
    public static final C31u isCvmDictationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_cvm_dictation);
    public static final C31u isAppendEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_dictation_append);
    public static final C31u isLanguageBiasEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_dictation_language_bias);

    public final boolean isAvailable$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(DictationMode dictationMode, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(dictationMode, 0);
        if (z3) {
            return true;
        }
        return z ? isVmDictationAllowed$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(dictationMode) : !z2;
    }

    public final boolean isVmDictationAllowed$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(DictationMode dictationMode) {
        C7384Etj.A0Y(dictationMode, 0);
        return dictationMode == DictationMode.MANUAL && isCvmDictationEnabled$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation();
    }

    public final String getVoyagerModelName() {
        return BV5.A0m(this, voyagerModelName$delegate, $$delegatedProperties, 0);
    }

    public final boolean isAppendEnabled() {
        return C31u.A01(this, isAppendEnabled$delegate, $$delegatedProperties, 2);
    }

    public final boolean isCvmDictationEnabled$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return C31u.A01(this, isCvmDictationEnabled$delegate, $$delegatedProperties, 1);
    }

    public final boolean isLanguageBiasEnabled() {
        return C31u.A01(this, isLanguageBiasEnabled$delegate, $$delegatedProperties, 3);
    }
}
