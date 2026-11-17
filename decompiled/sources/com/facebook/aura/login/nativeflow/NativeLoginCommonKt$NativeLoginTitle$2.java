package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginTitle$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $medium;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginTitle$2(String str, BRg bRg, int i, boolean z, int i2, int i3) {
        super(2);
        this.$title = str;
        this.$modifier = bRg;
        this.$textAlign = i;
        this.$medium = z;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginCommonKt.m1284NativeLoginTitleoTYcxuw(this.$title, this.$modifier, this.$textAlign, this.$medium, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
