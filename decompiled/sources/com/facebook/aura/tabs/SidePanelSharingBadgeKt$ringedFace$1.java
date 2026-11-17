package com.facebook.aura.tabs;

import X.AT3;
import X.AWA;
import X.AbstractC7559F3s;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SidePanelSharingBadgeKt$ringedFace$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $ringColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long j = this.$ringColor;
        at3.A9N(null, C16a.A00, (AWA.A01(at3.AKb()) / 2.0f) + at3.Ah4(2.0f), 1.0f, 3, j, at3.ADU());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SidePanelSharingBadgeKt$ringedFace$1(long j) {
        super(1);
        this.$ringColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
