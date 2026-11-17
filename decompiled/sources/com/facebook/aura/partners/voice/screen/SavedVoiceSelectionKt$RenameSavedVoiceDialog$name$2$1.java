package com.facebook.aura.partners.voice.screen;

import X.AbstractC1815ArZ;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1805ArO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$RenameSavedVoiceDialog$name$2$1 extends AbstractC7559F3s implements Function0<MutableState<C1805ArO>> {
    public final /* synthetic */ SavedVoiceOption $savedVoice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$RenameSavedVoiceDialog$name$2$1(SavedVoiceOption savedVoiceOption) {
        super(0);
        this.$savedVoice = savedVoiceOption;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<C1805ArO> invoke() {
        String str = this.$savedVoice.voice.name;
        return AnonymousClass002.A0P(new C1805ArO(str, AbstractC1815ArZ.A00(0, str.length())));
    }
}
