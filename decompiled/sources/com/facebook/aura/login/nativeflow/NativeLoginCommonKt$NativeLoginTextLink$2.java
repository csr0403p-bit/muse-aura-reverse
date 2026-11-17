package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginTextLink$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginTextLink$2(String str, Function0<Unit> function0, BRg bRg, long j, C1822Arm c1822Arm, boolean z, int i, int i2) {
        super(2);
        this.$text = str;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$color = j;
        this.$style = c1822Arm;
        this.$enabled = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(this.$text, this.$onClick, this.$modifier, this.$color, this.$style, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
