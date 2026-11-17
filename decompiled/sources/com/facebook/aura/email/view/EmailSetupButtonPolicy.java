package com.facebook.aura.email.view;

import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.conversation.widget.api.ConversationPresentationButtonPolicy;
import com.facebook.aura.conversation.widget.api.ConversationPresentationButtonState;
import com.facebook.aura.navigation.EmailSetupDeeplink;

/* loaded from: classes3.dex */
public final class EmailSetupButtonPolicy implements ConversationPresentationButtonPolicy {
    public static final EmailSetupButtonPolicy INSTANCE = new EmailSetupButtonPolicy();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationButtonPolicy
    public ConversationPresentationButtonState state(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgE(851401415);
        Uri uri = Uri.parse(str);
        EmailSetupDeeplink emailSetupDeeplink = EmailSetupDeeplink.INSTANCE;
        C7384Etj.A0X(uri);
        if (!emailSetupDeeplink.isCandidate(uri)) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        ConversationPresentationButtonState conversationPresentationButtonState = emailSetupDeeplink.matches(uri) ? ConversationPresentationButtonState.ENABLED : ConversationPresentationButtonState.HIDDEN;
        AnonymousClass001.A1D(bfm);
        return conversationPresentationButtonState;
    }
}
