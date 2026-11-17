package com.facebook.aura.composer.dictation;

import X.AbstractC7559F3s;
import android.icu.text.Transliterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DictationLanguages$simplifiedToTraditional$2 extends AbstractC7559F3s implements Function0<Transliterator> {
    public static final DictationLanguages$simplifiedToTraditional$2 INSTANCE = new DictationLanguages$simplifiedToTraditional$2();

    public DictationLanguages$simplifiedToTraditional$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Transliterator invoke() {
        return Transliterator.getInstance("Hans-Hant");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Transliterator invoke() {
        return Transliterator.getInstance("Hans-Hant");
    }
}
