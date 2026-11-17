package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchNodeClient$uiControlDispatcher$7 extends AbstractC7559F3s implements G0U<UiAction, Unit> {
    public final /* synthetic */ HatchNodeClient this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiAction uiAction) {
        C7384Etj.A0Y(uiAction, 0);
        UiControlActionSink.Companion.getInstance(this.this$0.userSession).publishTabLightup(uiAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$uiControlDispatcher$7(HatchNodeClient hatchNodeClient) {
        super(1);
        this.this$0 = hatchNodeClient;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(UiAction uiAction) {
        invoke2(uiAction);
        return Unit.INSTANCE;
    }
}
