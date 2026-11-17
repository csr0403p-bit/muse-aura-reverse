package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ String $xmdsIconUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$2(String str, long j, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$xmdsIconUrl = str;
        this.$iconTint = j;
        this.$size = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchDocumentCardKt.m1160ArtifactXmdsOrFallbackIconBazWgJc(this.$xmdsIconUrl, this.$iconTint, this.$size, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
