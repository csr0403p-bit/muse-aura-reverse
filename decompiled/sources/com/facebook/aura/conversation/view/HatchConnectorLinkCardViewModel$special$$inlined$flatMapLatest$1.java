package com.facebook.aura.conversation.view;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C3pS;
import X.C3pU;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1", f = "HatchConnectorLinkCardViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super ConnectorCardState>, String, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchConnectorLinkCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1(HtJ htJ, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel) {
        super(3, htJ);
        this.this$0 = hatchConnectorLinkCardViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = (String) obj2;
            C3pS c3pSA00 = AbstractC05633ui.A00(new HatchConnectorLinkCardViewModel$uiState$1$2(this.this$0, str, null), GDB.A01(C3rb.A03(new HatchConnectorLinkCardViewModel$uiState$1$1(null), this.this$0.repository.observeConnector(str), this.this$0.gateway.connectionState)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c3pSA00, c20z) == enumC10460Hji) {
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

    @Override // X.G0W
    public final Object invoke(C20Z<? super ConnectorCardState> c20z, String str, HtJ<? super Unit> htJ) {
        HatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1 hatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1 = new HatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1(htJ, this.this$0);
        hatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1.L$0 = c20z;
        hatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return hatchConnectorLinkCardViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
