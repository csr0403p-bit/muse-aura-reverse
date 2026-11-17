package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC0878AGe;
import X.C60P;
import com.facebook.aura.partners.voice.api.VoiceOption;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class VoiceOptionOrderingKt {
    public static final List<VoiceOption> sortedForVoiceSelection(List<VoiceOption> list, Locale locale) {
        boolean zA1Y = C60P.A1Y(list, locale);
        final Collator collator = Collator.getInstance(locale);
        collator.setStrength(zA1Y ? 1 : 0);
        collator.setDecomposition(zA1Y ? 1 : 0);
        return AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.partners.voice.viewmodel.VoiceOptionOrderingKt$sortedForVoiceSelection$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return collator.compare(((VoiceOption) t).name, ((VoiceOption) t2).name);
            }
        });
    }
}
