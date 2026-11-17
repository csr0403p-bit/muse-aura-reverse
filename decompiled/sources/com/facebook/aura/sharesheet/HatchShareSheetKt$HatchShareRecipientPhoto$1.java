package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareRecipientPhoto$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareRecipientPhoto$1(String str, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$uri = str;
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
        HatchShareSheetKt.m2000HatchShareRecipientPhotouFdPcIQ(this.$uri, this.$size, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
