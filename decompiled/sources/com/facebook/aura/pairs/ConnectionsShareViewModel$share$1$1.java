package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel$share$1$1", f = "ConnectionsShareViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsShareViewModel$share$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $connectionId;
    public int label;
    public final /* synthetic */ ConnectionsShareViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareViewModel$share$1$1(ConnectionsShareViewModel connectionsShareViewModel, String str, HtJ<? super ConnectionsShareViewModel$share$1$1> htJ) {
        super(2, htJ);
        this.this$0 = connectionsShareViewModel;
        this.$connectionId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsShareViewModel$share$1$1(this.this$0, this.$connectionId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConnectionsShareViewModel connectionsShareViewModel = this.this$0;
            String str = this.$connectionId;
            this.label = 1;
            if (connectionsShareViewModel.send(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConnectionsShareViewModel$share$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
