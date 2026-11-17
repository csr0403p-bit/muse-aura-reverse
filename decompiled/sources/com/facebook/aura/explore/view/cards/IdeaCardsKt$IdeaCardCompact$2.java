package com.facebook.aura.explore.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0U;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdeaCardsKt$IdeaCardCompact$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ IdeaCardExecutionState $executionState;
    public final /* synthetic */ boolean $isPreparingShare;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Function0<Unit> $onExecuteClick;
    public final /* synthetic */ G0U<IdeaIcon, Unit> $onShareClick;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaCardsKt$IdeaCardCompact$2(IdeaCard ideaCard, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, long j, C1DM c1dm, IdeaCardExecutionState ideaCardExecutionState, G0U<? super IdeaIcon, Unit> g0u, boolean z, int i, int i2) {
        super(2);
        this.$card = ideaCard;
        this.$onClick = function0;
        this.$onExecuteClick = function02;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$shape = c1dm;
        this.$executionState = ideaCardExecutionState;
        this.$onShareClick = g0u;
        this.$isPreparingShare = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        IdeaCardsKt.m796IdeaCardCompactmxsUjTo(this.$card, this.$onClick, this.$onExecuteClick, this.$modifier, this.$backgroundColor, this.$shape, this.$executionState, this.$onShareClick, this.$isPreparingShare, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
