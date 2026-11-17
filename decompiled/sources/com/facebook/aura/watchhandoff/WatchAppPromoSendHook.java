package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import android.content.Context;
import com.facebook.aura.devices.intf.ConversationSendHook;
import com.facebook.aura.utils.HatchWatchAppPromoUtils;

/* loaded from: classes3.dex */
public final class WatchAppPromoSendHook implements ConversationSendHook {
    public static final int $stable = 0;
    public static final WatchAppPromoSendHook INSTANCE = new WatchAppPromoSendHook();

    @Override // com.facebook.aura.devices.intf.ConversationSendHook
    public void onUserSentMessage(Context context, AbstractC3358CGz abstractC3358CGz) {
        HatchWatchAppPromoUtils.INSTANCE.onUserMessageSent();
    }
}
