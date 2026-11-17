package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.AvatarSharePresentationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarShareWidgetKt$HatchAvatarShareWidget$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ AvatarSharePresentationData $data;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarShareWidgetKt$HatchAvatarShareWidget$2(AvatarSharePresentationData avatarSharePresentationData, C1D3 c1d3, long j, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$data = avatarSharePresentationData;
        this.$containerShape = c1d3;
        this.$backgroundColor = j;
        this.$onButtonClick = function0;
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
        HatchAvatarShareWidgetKt.m536HatchAvatarShareWidgetT042LqI(this.$data, this.$containerShape, this.$backgroundColor, this.$onButtonClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
