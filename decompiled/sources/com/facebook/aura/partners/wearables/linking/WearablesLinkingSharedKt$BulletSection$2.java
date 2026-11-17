package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingSharedKt$BulletSection$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $body;
    public final /* synthetic */ C1822Arm $bodyStyle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $extraContent;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ float $iconSize;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ String $linkText;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onLinkClick;
    public final /* synthetic */ String $title;
    public final /* synthetic */ C1822Arm $titleStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingSharedKt$BulletSection$2(int i, String str, BRg bRg, String str2, long j, float f, C1822Arm c1822Arm, C1822Arm c1822Arm2, String str3, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3, int i4) {
        super(2);
        this.$iconRes = i;
        this.$body = str;
        this.$modifier = bRg;
        this.$title = str2;
        this.$iconTint = j;
        this.$iconSize = f;
        this.$titleStyle = c1822Arm;
        this.$bodyStyle = c1822Arm2;
        this.$linkText = str3;
        this.$onLinkClick = function0;
        this.$extraContent = g0v;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public final void invoke(BFM bfm, int i) {
        WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(this.$iconRes, this.$body, this.$modifier, this.$title, this.$iconTint, this.$iconSize, this.$titleStyle, this.$bodyStyle, this.$linkText, this.$onLinkClick, this.$extraContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
