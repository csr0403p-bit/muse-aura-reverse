package com.facebook.aura.feed.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$performFeedLoad$4$page$1", f = "FeedViewModel.kt", l = {370}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class FeedViewModel$performFeedLoad$4$page$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends InitialFeedPage>>, Object> {
    public final /* synthetic */ FeedPaginationMode $mode;
    public int label;
    public final /* synthetic */ FeedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedViewModel$performFeedLoad$4$page$1(FeedViewModel feedViewModel, FeedPaginationMode feedPaginationMode, HtJ<? super FeedViewModel$performFeedLoad$4$page$1> htJ) {
        super(2, htJ);
        this.this$0 = feedViewModel;
        this.$mode = feedPaginationMode;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedViewModel$performFeedLoad$4$page$1(this.this$0, this.$mode, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM799loadInitialFeedPagegIAlus;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            FeedViewModel feedViewModel = this.this$0;
            FeedPaginationMode feedPaginationMode = this.$mode;
            this.label = 1;
            objM799loadInitialFeedPagegIAlus = feedViewModel.m799loadInitialFeedPagegIAlus(feedPaginationMode, this);
            if (objM799loadInitialFeedPagegIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM799loadInitialFeedPagegIAlus = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM799loadInitialFeedPagegIAlus);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends InitialFeedPage>> htJ) {
        return ((FeedViewModel$performFeedLoad$4$page$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
