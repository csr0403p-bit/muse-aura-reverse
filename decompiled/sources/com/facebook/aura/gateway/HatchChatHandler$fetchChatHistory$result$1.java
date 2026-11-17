package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.data.ChatHistoryFetchResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$result$1", f = "HatchChatHandler.kt", l = {161}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchChatHandler$fetchChatHistory$result$1 extends AbstractC07127nr implements G0U<HtJ<? super ChatHistoryFetchResult>, Object> {
    public final /* synthetic */ Long $beforeSeq;
    public final /* synthetic */ int $limit;
    public final /* synthetic */ String $sessionId;
    public int label;
    public final /* synthetic */ HatchChatHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchChatHandler$fetchChatHistory$result$1(HatchChatHandler hatchChatHandler, int i, Long l, String str, HtJ<? super HatchChatHandler$fetchChatHistory$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchChatHandler;
        this.$limit = i;
        this.$beforeSeq = l;
        this.$sessionId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchChatHandler$fetchChatHistory$result$1(this.this$0, this.$limit, this.$beforeSeq, this.$sessionId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchChatHandler hatchChatHandler = this.this$0;
            int i2 = this.$limit;
            Long l = this.$beforeSeq;
            String str = this.$sessionId;
            this.label = 1;
            obj = hatchChatHandler.fetchChatHistoryInternal(i2, l, str, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super ChatHistoryFetchResult> htJ) {
        return ((HatchChatHandler$fetchChatHistory$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
