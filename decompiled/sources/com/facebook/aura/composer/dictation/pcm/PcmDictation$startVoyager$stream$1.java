package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC7559F3s;
import X.C0881AGi;
import android.content.Context;
import com.facebook.aura.composer.dictation.DictationGating;
import com.facebook.aura.composer.dictation.DictationLanguages;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class PcmDictation$startVoyager$stream$1 extends AbstractC7559F3s implements Function0<List<? extends String>> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PcmDictation$startVoyager$stream$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return DictationGating.INSTANCE.isLanguageBiasEnabled() ? DictationLanguages.INSTANCE.preferred(this.$context) : C0881AGi.A00;
    }
}
