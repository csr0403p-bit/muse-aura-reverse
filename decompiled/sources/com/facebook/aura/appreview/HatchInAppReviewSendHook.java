package com.facebook.aura.appreview;

import X.AbstractC3358CGz;
import android.content.Context;
import com.facebook.aura.devices.intf.ConversationSendHook;

/* loaded from: classes3.dex */
public final class HatchInAppReviewSendHook implements ConversationSendHook {
    public static final int $stable = 0;
    public static final HatchInAppReviewSendHook INSTANCE = new HatchInAppReviewSendHook();

    @Override // com.facebook.aura.devices.intf.ConversationSendHook
    public void onUserSentMessage(Context context, AbstractC3358CGz abstractC3358CGz) {
        HatchInAppReviewTrigger.INSTANCE.onUserMessageSent$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview();
    }
}
