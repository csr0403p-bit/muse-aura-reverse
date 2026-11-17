package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchNodeClient$uiControlDispatcher$3 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchNodeClient this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        UiControlActionSink.Companion.getInstance(this.this$0.userSession).publishNavigation(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$uiControlDispatcher$3(HatchNodeClient hatchNodeClient) {
        super(1);
        this.this$0 = hatchNodeClient;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
