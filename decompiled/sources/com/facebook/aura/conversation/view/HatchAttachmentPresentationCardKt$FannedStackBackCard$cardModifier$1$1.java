package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1390AiL;
import X.C15k;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ int $depth;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        double dFannedStackTiltRadians = HatchAttachmentPresentationCardKt.fannedStackTiltRadians(this.$depth);
        c2av.AeW(-((float) Math.toDegrees(dFannedStackTiltRadians)));
        c2av.AeX(HatchAttachmentPresentationCardKt.fannedStackScale(dFannedStackTiltRadians));
        c2av.AeY(((C1390AiL) c2av).A04);
        long jA0J = AnonymousClass005.A0J(0.0f, 1.0f);
        long j = C15k.A01;
        c2av.Af4(jA0J);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$1$1(int i) {
        super(1);
        this.$depth = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
