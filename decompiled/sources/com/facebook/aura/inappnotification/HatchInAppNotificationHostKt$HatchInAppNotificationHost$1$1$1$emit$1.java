package com.facebook.aura.inappnotification;

import X.HtJ;
import X.HzP;
import com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1;
import com.facebook.aura.inappnotification.api.InAppNotification;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1", f = "HatchInAppNotificationHost.kt", l = {78, 80}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1(HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((InAppNotification.NotificationArgs) null, (HtJ<? super Unit>) this);
    }
}
