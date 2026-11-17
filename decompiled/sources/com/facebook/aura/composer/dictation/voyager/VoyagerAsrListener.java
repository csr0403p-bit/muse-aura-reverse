package com.facebook.aura.composer.dictation.voyager;

/* loaded from: classes5.dex */
public interface VoyagerAsrListener {
    void onAudioDropped(long j, boolean z);

    void onCompleted(VoyagerAsrCompletion voyagerAsrCompletion);

    void onError(String str, String str2, VoyagerAsrServerError voyagerAsrServerError);

    void onFinal(String str);

    void onHandshakeAcknowledged();

    void onPartial(String str, Long l);

    void onSpeechEnd();

    void onSpeechStart();
}
