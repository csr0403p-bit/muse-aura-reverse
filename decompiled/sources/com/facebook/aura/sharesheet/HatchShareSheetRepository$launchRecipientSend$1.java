package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$launchRecipientSend$1", f = "HatchShareSheetRepository.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetRepository$launchRecipientSend$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $send;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetRepository$launchRecipientSend$1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super HatchShareSheetRepository$launchRecipientSend$1> htJ) {
        super(2, htJ);
        this.$send = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetRepository$launchRecipientSend$1(this.$send, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G0U<HtJ<? super Unit>, Object> g0u = this.$send;
            this.label = 1;
            if (g0u.invoke(this) == enumC10460Hji) {
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
        return new HatchShareSheetRepository$launchRecipientSend$1(this.$send, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
