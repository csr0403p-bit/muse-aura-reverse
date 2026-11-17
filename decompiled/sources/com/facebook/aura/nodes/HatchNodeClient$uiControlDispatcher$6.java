package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.uicontrol.UiControlActionSink;
import com.facebook.aura.uicontrol.UiSuggestion;

/* loaded from: classes3.dex */
public final class HatchNodeClient$uiControlDispatcher$6 extends AbstractC7559F3s implements G0U<UiSuggestion, Boolean> {
    public final /* synthetic */ HatchNodeClient this$0;

    @Override // X.G0U
    public final Boolean invoke(UiSuggestion uiSuggestion) {
        C7384Etj.A0Y(uiSuggestion, 0);
        return Boolean.valueOf(UiControlActionSink.Companion.getInstance(this.this$0.userSession).publishSuggestion(uiSuggestion));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$uiControlDispatcher$6(HatchNodeClient hatchNodeClient) {
        super(1);
        this.this$0 = hatchNodeClient;
    }
}
