package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkPublished$url$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ PublishSpaceSheetKey $navKey;
    public final /* synthetic */ SpaceShareLinkState $state;
    public final /* synthetic */ String $title;
    public final /* synthetic */ SpaceShareLinkViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceShareLinkSheetKt$SpaceShareLinkPublished$url$1(PublishSpaceSheetKey publishSpaceSheetKey, String str, SpaceShareLinkState spaceShareLinkState, SpaceShareLinkViewModel spaceShareLinkViewModel, BRg bRg, int i, int i2) {
        super(2);
        this.$navKey = publishSpaceSheetKey;
        this.$title = str;
        this.$state = spaceShareLinkState;
        this.$viewModel = spaceShareLinkViewModel;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceShareLinkSheetKt.SpaceShareLinkPublished(this.$navKey, this.$title, this.$state, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
