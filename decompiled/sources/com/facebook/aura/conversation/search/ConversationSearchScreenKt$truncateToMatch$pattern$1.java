package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$truncateToMatch$pattern$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final ConversationSearchScreenKt$truncateToMatch$pattern$1 INSTANCE = new ConversationSearchScreenKt$truncateToMatch$pattern$1();

    public ConversationSearchScreenKt$truncateToMatch$pattern$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        String str2 = str;
        C7384Etj.A0Y(str2, 0);
        String strQuote = Pattern.quote(str2);
        C7384Etj.A0U(strQuote);
        return strQuote;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        String strQuote = Pattern.quote(str);
        C7384Etj.A0U(strQuote);
        return strQuote;
    }
}
