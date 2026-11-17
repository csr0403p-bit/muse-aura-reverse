package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$6$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $searchQuery$delegate;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState<String> mutableState = this.$searchQuery$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(str);
        this.$searchViewModel.searchMessages(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$9$6$1(HatchSearchViewModel hatchSearchViewModel, MutableState<String> mutableState) {
        super(1);
        this.$searchViewModel = hatchSearchViewModel;
        this.$searchQuery$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
