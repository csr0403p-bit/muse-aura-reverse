package com.facebook.aura.conversation.api;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.api.ConversationWidgetRequests;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests$find$observer$1", f = "ConversationWidgetRequests.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConversationWidgetRequests$find$observer$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConversationWidgetRequests.Observer>, Object> {
    public int label;
    public final /* synthetic */ ConversationWidgetRequests this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationWidgetRequests$find$observer$1(ConversationWidgetRequests conversationWidgetRequests, HtJ<? super ConversationWidgetRequests$find$observer$1> htJ) {
        super(2, htJ);
        this.this$0 = conversationWidgetRequests;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationWidgetRequests$find$observer$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConversationWidgetRequests conversationWidgetRequests = this.this$0;
            ConversationWidgetRequests$find$observer$1$invokeSuspend$$inlined$mapNotNull$1 conversationWidgetRequests$find$observer$1$invokeSuspend$$inlined$mapNotNull$1 = new ConversationWidgetRequests$find$observer$1$invokeSuspend$$inlined$mapNotNull$1(conversationWidgetRequests.observers, conversationWidgetRequests);
            this.label = 1;
            obj = AbstractC9777Gfy.A02(conversationWidgetRequests$find$observer$1$invokeSuspend$$inlined$mapNotNull$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConversationWidgetRequests.Observer> htJ) {
        return new ConversationWidgetRequests$find$observer$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
