package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NotificationOptInStore$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<NotificationOptInStore> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOptInStore$Companion$getInstance$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NotificationOptInStore invoke() {
        return new NotificationOptInStore(AnonymousClass001.A0I(this.$context));
    }
}
