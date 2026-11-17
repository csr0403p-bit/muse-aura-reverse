package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchScrollFades$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $surface;
    public final /* synthetic */ float $topInset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$SearchScrollFades$2(LazyListState lazyListState, long j, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$listState = lazyListState;
        this.$surface = j;
        this.$topInset = f;
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
        ConversationSearchScreenKt.m503SearchScrollFadesBazWgJc(this.$listState, this.$surface, this.$topInset, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
