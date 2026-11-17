package com.facebook.aura.activation.view;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1710Aot;
import X.C7384Etj;
import X.C8j5;
import X.EnumC1820Arj;
import X.G0W;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchInviteButtonTooltipKt$TooltipPointer$1 extends AbstractC7559F3s implements G0W<InterfaceC1068ATy, AWA, EnumC1820Arj, Unit> {
    public static final HatchInviteButtonTooltipKt$TooltipPointer$1 INSTANCE = new HatchInviteButtonTooltipKt$TooltipPointer$1();

    public HatchInviteButtonTooltipKt$TooltipPointer$1() {
        super(3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final void m137invoke12SF9DM(InterfaceC1068ATy interfaceC1068ATy, long j, EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(interfaceC1068ATy, 0);
        float fA03 = C8j5.A03(j);
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.moveTo(0.0f, fA03);
        float fA032 = AnonymousClass003.A03(j);
        path.lineTo(fA032 / 2.0f, 0.0f);
        path.lineTo(fA032, fA03);
        path.close();
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1068ATy interfaceC1068ATy, AWA awa, EnumC1820Arj enumC1820Arj) {
        m137invoke12SF9DM(interfaceC1068ATy, awa.A00, enumC1820Arj);
        return Unit.INSTANCE;
    }
}
