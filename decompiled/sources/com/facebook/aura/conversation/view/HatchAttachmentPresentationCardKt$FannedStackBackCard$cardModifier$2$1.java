package com.facebook.aura.conversation.view;

import X.AaD;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C1541Al4;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC2269BPv;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$2$1 extends AbstractC7559F3s implements G0U<InterfaceC2269BPv, Unit> {
    public final /* synthetic */ long $shadowColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC2269BPv interfaceC2269BPv) {
        C7384Etj.A0Y(interfaceC2269BPv, 0);
        interfaceC2269BPv.Ad4(this.$shadowColor);
        interfaceC2269BPv.AeL(interfaceC2269BPv.Ah4(30.0f));
        long jA0A = AnonymousClass007.A0A(0.0f, interfaceC2269BPv.Ah4(1.0f));
        C1541Al4 c1541Al4 = (C1541Al4) interfaceC2269BPv;
        if (c1541Al4.A04 != jA0A) {
            c1541Al4.A04 = jA0A;
            AaD.A00(c1541Al4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$2$1(long j) {
        super(1);
        this.$shadowColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2269BPv interfaceC2269BPv) {
        invoke2(interfaceC2269BPv);
        return Unit.INSTANCE;
    }
}
