package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$4$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ MutableState<AaC> $targetBounds$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.$targetBounds$delegate.Af8(aaC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$4$1(MutableState<AaC> mutableState) {
        super(1);
        this.$targetBounds$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
