package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$ConversationSearchScreen$3$2$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $query$delegate;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState<String> mutableState = this.$query$delegate;
        float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
        mutableState.Af8(str);
        this.$searchViewModel.searchMessages(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$ConversationSearchScreen$3$2$1$1(HatchSearchViewModel hatchSearchViewModel, MutableState<String> mutableState) {
        super(1);
        this.$searchViewModel = hatchSearchViewModel;
        this.$query$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
