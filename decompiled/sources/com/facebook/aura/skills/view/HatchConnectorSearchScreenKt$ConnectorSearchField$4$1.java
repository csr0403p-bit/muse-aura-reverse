package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C0Ou;
import X.C1C3;
import X.G0U;
import com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorSearchScreenKt$ConnectorSearchField$4$1 extends AbstractC7559F3s implements G0U<C0Ou, Unit> {
    public final /* synthetic */ C1C3 $keyboard;
    public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchScreenKt$ConnectorSearchField$4$1(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, C1C3 c1c3) {
        super(1);
        this.$viewModel = hatchConnectorSearchViewModel;
        this.$keyboard = c1c3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0Ou c0Ou) {
        this.$viewModel.refresh();
        C1C3 c1c3 = this.$keyboard;
        if (c1c3 != null) {
            c1c3.hide();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0Ou c0Ou) {
        invoke2(c0Ou);
        return Unit.INSTANCE;
    }
}
