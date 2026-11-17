package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSystemPipController$callEndDismissHandler$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSystemPipController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSystemPipController$callEndDismissHandler$1(HatchSystemPipController hatchSystemPipController) {
        super(0);
        this.this$0 = hatchSystemPipController;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final HatchSystemPipController hatchSystemPipController = this.this$0;
        hatchSystemPipController.activity.runOnUiThread(new Runnable() { // from class: com.facebook.aura.partners.voice.screen.HatchSystemPipController$callEndDismissHandler$1.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!hatchSystemPipController.activity.isInPictureInPictureMode() || hatchSystemPipController.activity.isFinishing()) {
                    return;
                }
                hatchSystemPipController.disable();
                hatchSystemPipController.activity.finish();
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
