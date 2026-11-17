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

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore$load$2$firstPage$1", f = "ConnectionsTabStore.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsTabStore$load$2$firstPage$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConnectionsActivityPage>, Object> {
    public final /* synthetic */ PairsRepository $repository;
    public int label;
    public final /* synthetic */ ConnectionsTabStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabStore$load$2$firstPage$1(ConnectionsTabStore connectionsTabStore, PairsRepository pairsRepository, HtJ<? super ConnectionsTabStore$load$2$firstPage$1> htJ) {
        super(2, htJ);
        this.this$0 = connectionsTabStore;
        this.$repository = pairsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsTabStore$load$2$firstPage$1(this.this$0, this.$repository, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConnectionsTabStore connectionsTabStore = this.this$0;
            PairsRepository pairsRepository = this.$repository;
            this.label = 1;
            obj = connectionsTabStore.firstActivityPage(pairsRepository, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super ConnectionsActivityPage> htJ) {
        return ((ConnectionsTabStore$load$2$firstPage$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
