package X;

import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.sharesheet.HatchShareDestination;
import com.facebook.aura.sharesheet.HatchShareLogging;
import com.facebook.aura.sharesheet.HatchShareSheetViewModel;

/* renamed from: X.1BN, reason: invalid class name */
/* loaded from: classes.dex */
public interface C1BN<T> extends C22I<T> {
    T getValue();

    static HatchConversationState A00(HatchConversationViewModel hatchConversationViewModel) {
        return hatchConversationViewModel.repository.conversationState.getValue();
    }

    static void A01(HatchShareDestination hatchShareDestination, HatchShareSheetViewModel hatchShareSheetViewModel) {
        HatchShareLogging.INSTANCE.logDestination(hatchShareDestination, hatchShareSheetViewModel.logContext.getValue());
    }
}
