package com.facebook.aura.composer.dictation;

import X.AnonymousClass002;
import X.BQG;
import X.C3cG;
import X.C7384Etj;
import X.C7LE;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes4.dex */
public final class VoiceDictationKeyboardMerger {
    public static final int $stable = 8;
    public String lastTranscription = "";

    public final String updateText(String str, String str2, boolean z) {
        StringBuilder sbA0g;
        Character chA14;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        String str3 = this.lastTranscription;
        C7384Etj.A0Y(str3, zA1a ? 1 : 0);
        boolean zStartsWith = str2.startsWith(str3);
        String str4 = this.lastTranscription;
        String str5 = InviteCodeScratcherKt.CODE_SEPARATOR;
        if (zStartsWith) {
            String strSubstring = str2.substring(str4.length());
            if (this.lastTranscription.length() != 0 || strSubstring.length() <= 0 || (chA14 = BQG.A14(str)) == null || C7LE.A00(chA14.charValue())) {
                str5 = "";
            }
            sbA0g = C3cG.A0g(str);
            sbA0g.append(str5);
            sbA0g.append(strSubstring);
        } else {
            int length = str4.length();
            if (length <= 0 || !str.endsWith(str4)) {
                if (str.length() <= 0 || str.endsWith(InviteCodeScratcherKt.CODE_SEPARATOR)) {
                    str5 = "";
                }
                sbA0g = C3cG.A0g(str);
                sbA0g.append(str5);
            } else {
                sbA0g = C3cG.A0g(str.substring(0, str.length() - length));
            }
            sbA0g.append(str2);
        }
        String string = sbA0g.toString();
        this.lastTranscription = str2;
        if (z) {
            this.lastTranscription = "";
        }
        return string;
    }
}
