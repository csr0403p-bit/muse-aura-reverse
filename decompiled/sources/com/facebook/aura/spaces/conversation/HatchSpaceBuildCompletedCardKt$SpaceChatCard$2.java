package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceBuildCompletedCardKt$SpaceChatCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1DM $cardShape;
    public final /* synthetic */ String $iconImageUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $name;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $overflow;
    public final /* synthetic */ String $previewImageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceBuildCompletedCardKt$SpaceChatCard$2(String str, String str2, String str3, long j, C1DM c1dm, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$name = str;
        this.$previewImageUrl = str2;
        this.$iconImageUrl = str3;
        this.$backgroundColor = j;
        this.$cardShape = c1dm;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$overflow = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSpaceBuildCompletedCardKt.m2173SpaceChatCard8r3B23s(this.$name, this.$previewImageUrl, this.$iconImageUrl, this.$backgroundColor, this.$cardShape, this.$onClick, this.$modifier, this.$overflow, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
