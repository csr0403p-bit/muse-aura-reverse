package com.facebook.aura.partners.voice.api;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C7BY;
import X.CFK;
import android.util.Base64;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes2.dex */
public abstract class TtsDeltaDecoderKt {
    public static final String TAG = "TtsDeltaDecoder";

    public static final byte[] decodeTtsDeltaLine(String str, TtsStreamStats ttsStreamStats) {
        boolean zA1b = AnonymousClass004.A1b(str, ttsStreamStats);
        String strA0l = AnonymousClass002.A0l(str);
        byte[] bArrDecode = null;
        if (AnonymousClass005.A1a(strA0l, HatchWebPageParserKt.DATA_URI_PREFIX)) {
            String strA0l2 = AnonymousClass002.A0l(C7BY.A0K(HatchWebPageParserKt.DATA_URI_PREFIX, strA0l));
            if (strA0l2.length() != 0) {
                if (!"[DONE]".equals(strA0l2)) {
                    try {
                        VoicePreviewStreamFrameJson voicePreviewStreamFrameJson = (VoicePreviewStreamFrameJson) HatchJsonKt.HatchJson.A00(strA0l2, VoicePreviewStreamFrameJson$$serializer.INSTANCE);
                        String str2 = voicePreviewStreamFrameJson.type;
                        if ("tts.delta".equals(str2)) {
                            String str3 = voicePreviewStreamFrameJson.audio;
                            if (str3 != null) {
                                try {
                                    bArrDecode = Base64.decode(str3, zA1b ? 1 : 0);
                                } catch (IllegalArgumentException e) {
                                    CFK.A0A(TAG, "bad base64 chunk", e);
                                }
                                if (bArrDecode != null && bArrDecode.length != 0) {
                                    ttsStreamStats.audioFrames++;
                                    return bArrDecode;
                                }
                            }
                            ttsStreamStats.invalidAudioFrames++;
                            return bArrDecode;
                        }
                        if (!"tts.done".equals(str2)) {
                            ttsStreamStats.otherFrames++;
                            return null;
                        }
                    } catch (Exception e2) {
                        CFK.A0A(TAG, "skipping malformed SSE frame", e2);
                        ttsStreamStats.malformedFrames++;
                        return null;
                    }
                }
                ttsStreamStats.doneFrames++;
            }
        }
        return null;
    }
}
