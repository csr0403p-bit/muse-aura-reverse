package com.facebook.aura.ui.sharedelement;

import X.AOO;
import X.APL;
import X.AW6;
import X.AXN;
import X.AaC;
import X.AbstractC1555AlK;
import X.AbstractC1561Alb;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C1069ATz;
import X.C1097AYh;
import X.C1710Aot;
import X.C1DM;
import X.C2J7;
import X.C3cG;
import X.EnumC1820Arj;
import X.InterfaceC1068ATy;

/* loaded from: classes4.dex */
public final class TransitionShapeClip implements C1DM, AOO {
    public final SharedElementClipParticipant participant;
    public final InterfaceC1068ATy path;
    public final SharedElementClipRegistry registry;

    @Override // X.AOO
    public InterfaceC1068ATy getClipPath(APL apl, AaC aaC, EnumC1820Arj enumC1820Arj, AXN axn) {
        AnonymousClass005.A11(aaC, enumC1820Arj, axn, 1);
        this.registry.reportPlacedDestinationForInteractiveTransform(this.participant);
        ((C1710Aot) this.path).A03.reset();
        InterfaceC1068ATy interfaceC1068ATy = this.path;
        AbstractC1555AlK abstractC1555AlKMo2createOutlinePq9zytI = mo2createOutlinePq9zytI(aaC.A01(), enumC1820Arj, axn);
        if (abstractC1555AlKMo2createOutlinePq9zytI instanceof C1097AYh) {
            interfaceC1068ATy.A3r(((C1097AYh) abstractC1555AlKMo2createOutlinePq9zytI).A00);
        } else if (abstractC1555AlKMo2createOutlinePq9zytI instanceof AW6) {
            interfaceC1068ATy.A3t(((AW6) abstractC1555AlKMo2createOutlinePq9zytI).A00);
        } else {
            if (!(abstractC1555AlKMo2createOutlinePq9zytI instanceof C1069ATz)) {
                throw C3cG.A0q();
            }
            interfaceC1068ATy.A3k(((C1069ATz) abstractC1555AlKMo2createOutlinePq9zytI).A00, 0L);
        }
        this.path.AhM(AnonymousClass005.A0J(aaC.A01, aaC.A03));
        return this.path;
    }

    public TransitionShapeClip(SharedElementClipRegistry sharedElementClipRegistry, SharedElementClipParticipant sharedElementClipParticipant) {
        AnonymousClass003.A0u(sharedElementClipRegistry, sharedElementClipParticipant);
        this.registry = sharedElementClipRegistry;
        this.participant = sharedElementClipParticipant;
        this.path = AbstractC1561Alb.A00();
    }

    @Override // X.C1DM
    /* renamed from: createOutline-Pq9zytI */
    public AbstractC1555AlK mo2createOutlinePq9zytI(long j, EnumC1820Arj enumC1820Arj, AXN axn) {
        AnonymousClass003.A0x(enumC1820Arj, axn);
        return this.registry.outlineFor(this.participant, C2J7.A00(0L, j), enumC1820Arj, axn);
    }
}
