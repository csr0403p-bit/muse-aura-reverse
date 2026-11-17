package com.facebook.aura.email.viewmodel;

import X.AnonymousClass002;
import X.C06827l3;
import X.C7384Etj;
import X.DCl;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.text.Normalizer;

/* loaded from: classes.dex */
public abstract class EmailSenderNameKt {
    public static final EmailSenderNameError emailSenderNameError(String str) {
        C7384Etj.A0Y(str, 0);
        if (new C06827l3("[\\x{0000}-\\x{001F}\\x{007F}-\\x{009F}\\x{00AD}\\x{061C}\\x{200B}\\x{200E}-\\x{200F}\\x{2028}-\\x{202E}\\x{2060}-\\x{2064}\\x{2066}-\\x{2069}\\x{FEFF}]").A07(str)) {
            return EmailSenderNameError.CHARACTERS;
        }
        if (normalizedEmailSenderName(str).getBytes(DCl.A05).length > 120) {
            return EmailSenderNameError.LENGTH;
        }
        return null;
    }

    public static final boolean hasVisibleEmailSenderName(String str) {
        C7384Etj.A0Y(str, 0);
        return new C06827l3("[\\p{L}\\p{M}\\p{N}\\p{P}\\p{S}]").A07(str);
    }

    public static final String normalizedEmailSenderName(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        C7384Etj.A0U(strNormalize);
        return AnonymousClass002.A0l(new C06827l3("\\p{Z}+").A03(strNormalize, InviteCodeScratcherKt.CODE_SEPARATOR));
    }
}
