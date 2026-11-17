package com.facebook.aura.explore.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class IdeaCardsKt$IdeaIconThumbnail$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $containerSize;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ IdeaIcon $icon;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsKt$IdeaIconThumbnail$1(IdeaIcon ideaIcon, String str, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$icon = ideaIcon;
        this.$contentDescription = str;
        this.$containerSize = f;
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
        IdeaCardsKt.m797IdeaIconThumbnail942rkJo(this.$icon, this.$contentDescription, this.$containerSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
