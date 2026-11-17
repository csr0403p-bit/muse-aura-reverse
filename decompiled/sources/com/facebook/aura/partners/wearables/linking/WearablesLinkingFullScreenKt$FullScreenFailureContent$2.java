package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$FullScreenFailureContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onTryAgain;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$FullScreenFailureContent$2(boolean z, float f, float f2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
        super(2);
        this.$isLoading = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onTryAgain = function0;
        this.$onCancel = function02;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        WearablesLinkingFullScreenKt.m1826FullScreenFailureContentZUYZQmM(this.$isLoading, this.$topPadding, this.$bottomPadding, this.$onTryAgain, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
