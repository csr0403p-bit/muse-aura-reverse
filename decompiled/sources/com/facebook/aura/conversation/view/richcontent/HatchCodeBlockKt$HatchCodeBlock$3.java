package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCodeBlockKt$HatchCodeBlock$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $code;
    public final /* synthetic */ String $language;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onSeeMoreClick;
    public final /* synthetic */ float $outerVerticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCodeBlockKt$HatchCodeBlock$3(String str, String str2, BRg bRg, float f, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$language = str;
        this.$code = str2;
        this.$modifier = bRg;
        this.$outerVerticalPadding = f;
        this.$onSeeMoreClick = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchCodeBlockKt.m675HatchCodeBlockhGBTI10(this.$language, this.$code, this.$modifier, this.$outerVerticalPadding, this.$onSeeMoreClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
