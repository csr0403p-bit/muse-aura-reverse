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
import com.facebook.aura.feed.repo.FeedRepository;
import com.facebook.aura.feed.repo.FeedStatus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$performFeedLoad$4$status$1", f = "FeedViewModel.kt", l = {371}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class FeedViewModel$performFeedLoad$4$status$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends FeedStatus>>, Object> {
    public int label;
    public final /* synthetic */ FeedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedViewModel$performFeedLoad$4$status$1(FeedViewModel feedViewModel, HtJ<? super FeedViewModel$performFeedLoad$4$status$1> htJ) {
        super(2, htJ);
        this.this$0 = feedViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedViewModel$performFeedLoad$4$status$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<FeedStatus>> htJ) {
        return new FeedViewModel$performFeedLoad$4$status$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM810getStatusIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            FeedRepository feedRepository = this.this$0.repository;
            this.label = 1;
            objM810getStatusIoAF18A = feedRepository.m810getStatusIoAF18A(this);
            if (objM810getStatusIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM810getStatusIoAF18A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM810getStatusIoAF18A);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends FeedStatus>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<FeedStatus>>) htJ);
    }
}
