package com.facebook.aura.explore.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$deferred$1$1", f = "IdeaCardsDataSource.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaCardsDataSource$loadNext$deferred$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $cursor;
    public int label;
    public final /* synthetic */ IdeaCardsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsDataSource$loadNext$deferred$1$1(IdeaCardsDataSource ideaCardsDataSource, String str, HtJ<? super IdeaCardsDataSource$loadNext$deferred$1$1> htJ) {
        super(2, htJ);
        this.this$0 = ideaCardsDataSource;
        this.$cursor = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaCardsDataSource$loadNext$deferred$1$1(this.this$0, this.$cursor, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            IdeaCardsDataSource ideaCardsDataSource = this.this$0;
            String str = this.$cursor;
            this.label = 1;
            obj = ideaCardsDataSource.performLoadNext(str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((IdeaCardsDataSource$loadNext$deferred$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
