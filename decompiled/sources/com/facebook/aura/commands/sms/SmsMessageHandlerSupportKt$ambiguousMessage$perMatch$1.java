package com.facebook.aura.commands.sms;

import X.AbstractC06907md;
import X.AbstractC7559F3s;
import X.C3cI;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1 extends AbstractC7559F3s implements G0U<AmbiguousNameMatch, CharSequence> {
    public static final SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1 INSTANCE = new SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1();

    public SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(AmbiguousNameMatch ambiguousNameMatch) {
        StringBuilder sbA0x;
        String str;
        C7384Etj.A0Y(ambiguousNameMatch, 0);
        String strA01 = AbstractC06907md.A01("; ", ambiguousNameMatch.candidates, SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1$options$1.INSTANCE);
        int size = ambiguousNameMatch.candidates.size();
        String str2 = ambiguousNameMatch.query;
        if (size == 1) {
            sbA0x = C3cI.A0x("\"", str2);
            sbA0x.append("\" matched one contact: ");
            sbA0x.append(strA01);
            str = ". Tell the user who you are about to message and get their confirmation.";
        } else {
            int size2 = ambiguousNameMatch.candidates.size();
            sbA0x = C3cI.A0x("\"", str2);
            sbA0x.append("\" matched ");
            sbA0x.append(size2);
            sbA0x.append(" contacts: ");
            sbA0x.append(strA01);
            str = ". Show the user these and have them pick one.";
        }
        sbA0x.append(str);
        return sbA0x.toString();
    }
}
