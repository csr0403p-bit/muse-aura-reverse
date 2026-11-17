package com.facebook.aura.partners.voice.impl;

import X.BQG;
import X.C7BY;
import X.C7LE;

/* loaded from: classes.dex */
public abstract class VoiceLiveTranscriptKt {
    public static final long PARTIAL_WORD_SETTLE_MS = 400;

    public static final String withoutPartialWord(String str) {
        Character chA14 = BQG.A14(str);
        if (chA14 != null && Character.isLetterOrDigit(chA14.charValue())) {
            int i = -1;
            int length = str.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (!C7LE.A00(str.charAt(length))) {
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    } else {
                        i = length;
                        break;
                    }
                }
            }
            if (i < 0) {
                i = 0;
            }
            String strSubstring = str.substring(0, i);
            if (!C7BY.A0j(strSubstring)) {
                return strSubstring;
            }
        }
        return null;
    }
}
