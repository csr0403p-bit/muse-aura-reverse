package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C1518AkS;
import com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorSearchScreenKt$ConnectorSearchField$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchScreenKt$ConnectorSearchField$3$1$1(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, C1518AkS c1518AkS) {
        super(0);
        this.$viewModel = hatchConnectorSearchViewModel;
        this.$focusRequester = c1518AkS;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorSearchScreenKt.logSearchClearClick();
        this.$viewModel.onQueryChanged("");
        C1518AkS.A00(this.$focusRequester);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
