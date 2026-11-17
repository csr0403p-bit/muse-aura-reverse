package com.facebook.aura.conversation.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.api.ConversationCardRequests;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$accept$job$1$1", f = "ConversationCardRequests.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConversationCardRequests$accept$job$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConversationCardRequests.Entry $entry;
    public int label;
    public final /* synthetic */ ConversationCardRequests this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCardRequests$accept$job$1$1(ConversationCardRequests conversationCardRequests, ConversationCardRequests.Entry entry, HtJ<? super ConversationCardRequests$accept$job$1$1> htJ) {
        super(2, htJ);
        this.this$0 = conversationCardRequests;
        this.$entry = entry;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationCardRequests$accept$job$1$1(this.this$0, this.$entry, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConversationCardRequests conversationCardRequests = this.this$0;
            ConversationCardRequests.Entry entry = this.$entry;
            this.label = 1;
            obj = conversationCardRequests.runAccepted(entry, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        ConversationCardRequests conversationCardRequests2 = this.this$0;
        Object obj2 = conversationCardRequests2.lock;
        ConversationCardRequests.Entry entry2 = this.$entry;
        synchronized (obj2) {
            if (conversationCardRequests2.entries.remove(entry2)) {
                conversationCardRequests2.publishLocked();
            }
            unit = Unit.INSTANCE;
        }
        C3cG.A1F(this.$entry.outcome, obj);
        return unit;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConversationCardRequests$accept$job$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
