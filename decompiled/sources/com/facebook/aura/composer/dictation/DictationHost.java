package com.facebook.aura.composer.dictation;

/* loaded from: classes5.dex */
public interface DictationHost {
    void clearDraft();

    String getComposerText();

    String getPendingMessageText();

    void onCaptureStarted();

    void onDictatedTextKept();

    void onDictatedTextLanded();

    void onDictationFailed(boolean z);

    void onMicSilenced();

    void onNoSpeech();

    boolean send();

    void setComposerText(String str);
}
