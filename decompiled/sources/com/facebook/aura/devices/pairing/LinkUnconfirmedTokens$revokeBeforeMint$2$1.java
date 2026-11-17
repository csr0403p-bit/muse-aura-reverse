package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$2$1", f = "LinkUnconfirmedTokens.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class LinkUnconfirmedTokens$revokeBeforeMint$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $revoke;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkUnconfirmedTokens$revokeBeforeMint$2$1(HoC hoC, HtJ<? super LinkUnconfirmedTokens$revokeBeforeMint$2$1> htJ) {
        super(2, htJ);
        this.$revoke = hoC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LinkUnconfirmedTokens$revokeBeforeMint$2$1(this.$revoke, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HoC hoC = this.$revoke;
            this.label = 1;
            if (hoC.APQ(this) == enumC10460Hji) {
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
        return new LinkUnconfirmedTokens$revokeBeforeMint$2$1(this.$revoke, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
