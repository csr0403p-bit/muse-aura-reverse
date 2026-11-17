package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNodeClient$uiControlDispatcher$4 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchNodeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$uiControlDispatcher$4(HatchNodeClient hatchNodeClient) {
        super(0);
        this.this$0 = hatchNodeClient;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(UiControlActionSink.Companion.getInstance(this.this$0.userSession).isNavigationVisible());
    }
}
