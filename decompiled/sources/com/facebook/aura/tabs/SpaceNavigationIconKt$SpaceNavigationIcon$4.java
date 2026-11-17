package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceNavigationIconKt$SpaceNavigationIcon$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ float $glyphSize;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isSaved;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ String $xmdsIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceNavigationIconKt$SpaceNavigationIcon$4(String str, String str2, long j, float f, boolean z, int i, float f2, BRg bRg, int i2, int i3) {
        super(2);
        this.$iconUrl = str;
        this.$xmdsIcon = str2;
        this.$iconTint = j;
        this.$size = f;
        this.$isSaved = z;
        this.$fallbackIconRes = i;
        this.$glyphSize = f2;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceNavigationIconKt.m2306SpaceNavigationIconOv4TPBQ(this.$iconUrl, this.$xmdsIcon, this.$iconTint, this.$size, this.$isSaved, this.$fallbackIconRes, this.$glyphSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
