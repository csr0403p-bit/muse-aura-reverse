package com.facebook.aura.common.ble;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraBondHelperKt$ensureBonded$2$1$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraBondHelperKt$ensureBonded$2$1$receiver$1 $receiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBondHelperKt$ensureBonded$2$1$1(Context context, AuraBondHelperKt$ensureBonded$2$1$receiver$1 auraBondHelperKt$ensureBonded$2$1$receiver$1) {
        super(1);
        this.$context = context;
        this.$receiver = auraBondHelperKt$ensureBonded$2$1$receiver$1;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        try {
            this.$context.unregisterReceiver(this.$receiver);
        } catch (IllegalArgumentException unused) {
        }
    }
}
