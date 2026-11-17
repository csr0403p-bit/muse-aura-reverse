package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VmRecoverySheetsKt$VmSheetSection$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $body;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $spacing;
    public final /* synthetic */ String $title;
    public final /* synthetic */ C1822Arm $titleStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoverySheetsKt$VmSheetSection$2(String str, String str2, C1822Arm c1822Arm, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$title = str;
        this.$body = str2;
        this.$titleStyle = c1822Arm;
        this.$modifier = bRg;
        this.$spacing = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VmRecoverySheetsKt.m3146VmSheetSectionFJfuzF0(this.$title, this.$body, this.$titleStyle, this.$modifier, this.$spacing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
