package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C00r;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.model.HatchMessageRole;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$requestBottomFollow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ MutableState<String> $bottomFollowBaselineUserKey$delegate;
    public final /* synthetic */ C00r $bottomRevealRequestGeneration$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ MutableState<Boolean> $keepBottomUntilNextUserTurn$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$requestBottomFollow$1$1(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, C00r c00r) {
        super(0);
        this.$currentItems$delegate = c1bo;
        this.$bottomFollowBaselineUserKey$delegate = mutableState;
        this.$keepBottomUntilNextUserTurn$delegate = mutableState2;
        this.$autoFollowEnabled$delegate = mutableState3;
        this.$bottomRevealRequestGeneration$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object objPrevious;
        MutableState<String> mutableState = this.$bottomFollowBaselineUserKey$delegate;
        AHD<HatchConversationListItem> value = this.$currentItems$delegate.getValue();
        ListIterator listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) objPrevious;
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && ((HatchConversationListItem.Message) hatchConversationListItem).message.role == HatchMessageRole.USER) {
                break;
            }
        }
        HatchConversationListItem hatchConversationListItem2 = (HatchConversationListItem) objPrevious;
        mutableState.Af8(hatchConversationListItem2 != null ? hatchConversationListItem2.getKey() : null);
        MutableState.A09(true, this.$keepBottomUntilNextUserTurn$delegate);
        MutableState.A09(true, this.$autoFollowEnabled$delegate);
        this.$bottomRevealRequestGeneration$delegate.AdX(this.$bottomRevealRequestGeneration$delegate.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
