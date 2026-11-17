package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore$load$2$hub$1", f = "ConnectionsTabStore.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 78}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsTabStore$load$2$hub$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PairsHubSnapshot>, Object> {
    public final /* synthetic */ PairsRepository $repository;
    public int label;
    public final /* synthetic */ ConnectionsTabStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabStore$load$2$hub$1(ConnectionsTabStore connectionsTabStore, PairsRepository pairsRepository, HtJ<? super ConnectionsTabStore$load$2$hub$1> htJ) {
        super(2, htJ);
        this.this$0 = connectionsTabStore;
        this.$repository = pairsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsTabStore$load$2$hub$1(this.this$0, this.$repository, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsInviteMailbox companion = PairsInviteMailbox.Companion.getInstance(this.this$0.userSession);
            this.label = 1;
            if (companion.pull(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        PairsRepository pairsRepository = this.$repository;
        this.label = 2;
        obj = pairsRepository.loadHub(this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PairsHubSnapshot> htJ) {
        return ((ConnectionsTabStore$load$2$hub$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
