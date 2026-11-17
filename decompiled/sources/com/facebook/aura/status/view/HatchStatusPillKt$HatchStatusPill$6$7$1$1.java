package com.facebook.aura.status.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1DG;
import X.C2ae;
import X.C7384Etj;
import X.G0U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$7$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ float $avatarOffsetY;
    public final /* synthetic */ Function0<C1DG> $panelMediaOffset;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m2237invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return AnonymousClass005.A0N(axn.Abr(this.$avatarOffsetY + this.$panelMediaOffset.invoke().A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$7$1$1(float f, Function0<C1DG> function0) {
        super(1);
        this.$avatarOffsetY = f;
        this.$panelMediaOffset = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m2237invokeBjo55l4(axn));
    }
}
