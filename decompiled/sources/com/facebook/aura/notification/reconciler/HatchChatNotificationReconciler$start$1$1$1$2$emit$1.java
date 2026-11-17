package com.facebook.aura.notification.reconciler;

import X.HtJ;
import X.HzP;
import com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2", f = "HatchChatNotificationReconciler.kt", l = {48}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class HatchChatNotificationReconciler$start$1$1$1$2$emit$1 extends HzP {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchChatNotificationReconciler.AnonymousClass1.C02521.C02531.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchChatNotificationReconciler$start$1$1$1$2$emit$1(HatchChatNotificationReconciler.AnonymousClass1.C02521.C02531.AnonymousClass2<? super T> anonymousClass2, HtJ<? super HatchChatNotificationReconciler$start$1$1$1$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (HtJ<? super Unit>) this);
    }
}
