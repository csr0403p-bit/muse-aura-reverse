package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.model.HatchMessage;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sentTurn$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$sentTurn$1 extends AbstractC07127nr implements G0W<HatchConversationState, String, HtJ<? super HatchSentTurn>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchConversationViewModel$sentTurn$1(HtJ<? super HatchConversationViewModel$sentTurn$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchMessage hatchMessagePrevious;
        HatchConversationState hatchConversationState = (HatchConversationState) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (str == null) {
            return null;
        }
        List<HatchMessage> list = hatchConversationState.messages;
        ListIterator<HatchMessage> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                hatchMessagePrevious = null;
                break;
            }
            hatchMessagePrevious = listIterator.previous();
            if (str.equals(hatchMessagePrevious.requestId)) {
                break;
            }
        }
        HatchMessage hatchMessage = hatchMessagePrevious;
        if (hatchMessage != null) {
            return new HatchSentTurn(str, hatchMessage.id);
        }
        return null;
    }

    @Override // X.G0W
    public final Object invoke(HatchConversationState hatchConversationState, String str, HtJ<? super HatchSentTurn> htJ) {
        HatchConversationViewModel$sentTurn$1 hatchConversationViewModel$sentTurn$1 = new HatchConversationViewModel$sentTurn$1(htJ);
        hatchConversationViewModel$sentTurn$1.L$0 = hatchConversationState;
        hatchConversationViewModel$sentTurn$1.L$1 = str;
        return hatchConversationViewModel$sentTurn$1.invokeSuspend(Unit.INSTANCE);
    }
}
