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

@DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCard$response$1$1", f = "IdeaCardsDataSource.kt", l = {305}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaCardsDataSource$shareCard$response$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $ideaCardId;
    public int label;
    public final /* synthetic */ IdeaCardsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsDataSource$shareCard$response$1$1(IdeaCardsDataSource ideaCardsDataSource, String str, HtJ<? super IdeaCardsDataSource$shareCard$response$1$1> htJ) {
        super(2, htJ);
        this.this$0 = ideaCardsDataSource;
        this.$ideaCardId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaCardsDataSource$shareCard$response$1$1(this.this$0, this.$ideaCardId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            IdeaCardsDataSource ideaCardsDataSource = this.this$0;
            String str = this.$ideaCardId;
            this.label = 1;
            if (ideaCardsDataSource.fetchCardDetail(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((IdeaCardsDataSource$shareCard$response$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
