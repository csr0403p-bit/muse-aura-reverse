package com.facebook.aura.feed.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2$page$1", f = "FeedRepository.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class FeedRepository$prefetchInitialFeed$2$page$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends FeedPageJson>>, Object> {
    public int label;
    public final /* synthetic */ FeedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedRepository$prefetchInitialFeed$2$page$1(FeedRepository feedRepository, HtJ<? super FeedRepository$prefetchInitialFeed$2$page$1> htJ) {
        super(2, htJ);
        this.this$0 = feedRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedRepository$prefetchInitialFeed$2$page$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<FeedPageJson>> htJ) {
        return new FeedRepository$prefetchInitialFeed$2$page$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM802fetchFeedPagegIAlus$default;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            FeedRepository feedRepository = this.this$0;
            this.label = 1;
            objM802fetchFeedPagegIAlus$default = FeedRepository.m802fetchFeedPagegIAlus$default(feedRepository, null, this, 1, null);
            if (objM802fetchFeedPagegIAlus$default == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM802fetchFeedPagegIAlus$default = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM802fetchFeedPagegIAlus$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends FeedPageJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<FeedPageJson>>) htJ);
    }
}
