package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.BLU;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$3$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ MutableState<AaC> $scrollViewportBounds$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        BLU bluA03 = c2ld.A03();
        AaC aaC = new AaC(bluA03.A01, bluA03.A03, bluA03.A02, bluA03.A00);
        if (C7384Etj.areEqual(this.$scrollViewportBounds$delegate.getValue(), aaC)) {
            return;
        }
        this.$scrollViewportBounds$delegate.Af8(aaC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$2$3$1(MutableState<AaC> mutableState) {
        super(1);
        this.$scrollViewportBounds$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
