package com.facebook.aura.appreview;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.conversation.api.ConversationReplyHook;
import com.facebook.aura.conversation.api.ConversationReplyOutcome;

/* loaded from: classes3.dex */
public final class HatchInAppReviewReplyHook implements ConversationReplyHook {
    public static final int $stable = 0;
    public static final HatchInAppReviewReplyHook INSTANCE = new HatchInAppReviewReplyHook();

    @Override // com.facebook.aura.conversation.api.ConversationReplyHook
    public void onReplyOutcome(AbstractC3358CGz abstractC3358CGz, ConversationReplyOutcome conversationReplyOutcome) {
        int iA0E = AnonymousClass001.A0E(conversationReplyOutcome, 1);
        if (iA0E == 0) {
            HatchInAppReviewTrigger.INSTANCE.onSuccessfulAgentResponse$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview();
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            HatchInAppReviewTrigger.INSTANCE.onReplyFailed$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationReplyOutcome.values().length];
            try {
                AnonymousClass002.A13(ConversationReplyOutcome.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConversationReplyOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
