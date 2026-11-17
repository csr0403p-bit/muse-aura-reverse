package com.facebook.aura.notification.model;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchChatNotificationManager$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchChatNotificationManager> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchChatNotificationManager$Companion$getInstance$1(Context context, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$appContext = context;
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchChatNotificationManager invoke() {
        return new HatchChatNotificationManager(this.$appContext, this.$userSession);
    }
}
