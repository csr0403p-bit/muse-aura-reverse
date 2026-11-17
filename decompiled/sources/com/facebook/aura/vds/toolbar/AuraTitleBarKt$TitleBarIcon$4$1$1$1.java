package com.facebook.aura.vds.toolbar;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTitleBarKt$TitleBarIcon$4$1$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ IconBadgeLocation $iconBadgeLocation;
    public final /* synthetic */ boolean $isRtl;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        c16z.A9O();
        c16z.A9N(null, C16a.A00, c16z.Ah4(this.$iconBadgeLocation.getBadgeSizeDp() + 4.0f) / 2.0f, 1.0f, 0, B6A.A06, AnonymousClass005.A0K(this.$isRtl ? c16z.Ah4(this.$iconBadgeLocation.getBadgeSizeDp()) / 2.0f : AnonymousClass001.A00(c16z.AKb()) - (c16z.Ah4(this.$iconBadgeLocation.getBadgeSizeDp()) / 2.0f), c16z.Ah4(this.$iconBadgeLocation.getBadgeSizeDp()) / 2.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTitleBarKt$TitleBarIcon$4$1$1$1(IconBadgeLocation iconBadgeLocation, boolean z) {
        super(1);
        this.$iconBadgeLocation = iconBadgeLocation;
        this.$isRtl = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
