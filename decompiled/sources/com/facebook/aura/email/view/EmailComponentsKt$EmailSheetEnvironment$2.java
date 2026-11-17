package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSheetEnvironment$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $allowReset;
    public final /* synthetic */ G2j<EmailViewModel, BRg, BFM, Integer, Unit> $content;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ boolean $fillHeight;
    public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $footer;
    public final /* synthetic */ float $horizontalPadding;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSheetEnvironment$2(String str, BRg bRg, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, boolean z, boolean z2, float f, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
        super(2);
        this.$environmentId = str;
        this.$modifier = bRg;
        this.$footer = g0w;
        this.$fillHeight = z;
        this.$allowReset = z2;
        this.$horizontalPadding = f;
        this.$content = g2j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailComponentsKt.m747EmailSheetEnvironmentPfoAEA0(this.$environmentId, this.$modifier, this.$footer, this.$fillHeight, this.$allowReset, this.$horizontalPadding, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
