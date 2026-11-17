package com.facebook.aura.explore.repo;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C27k;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2261BLa;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class IdeaCardsDataSource$loadFeed$deferred$1$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ C27k<Boolean> $newDeferred;
    public final /* synthetic */ IdeaCardsDataSource this$0;

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$loadFeed$deferred$1$2$1$1", f = "IdeaCardsDataSource.kt", l = {535}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$loadFeed$deferred$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C27k<Boolean> $newDeferred;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ IdeaCardsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IdeaCardsDataSource ideaCardsDataSource, C27k<Boolean> c27k, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = ideaCardsDataSource;
            this.$newDeferred = c27k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$newDeferred, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            IdeaCardsDataSource ideaCardsDataSource;
            InterfaceC2261BLa interfaceC2261BLa;
            Object obj2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ideaCardsDataSource = this.this$0;
                interfaceC2261BLa = ideaCardsDataSource.inFlightMutex;
                obj2 = this.$newDeferred;
                this.L$0 = interfaceC2261BLa;
                this.L$1 = ideaCardsDataSource;
                this.L$2 = obj2;
                this.label = 1;
                if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                obj2 = this.L$2;
                ideaCardsDataSource = (IdeaCardsDataSource) this.L$1;
                interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                Hwg.A00(obj);
            }
            try {
                if (ideaCardsDataSource.inFlight == obj2) {
                    ideaCardsDataSource.inFlight = null;
                }
                return Unit.INSTANCE;
            } finally {
                interfaceC2261BLa.Ahe(null);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsDataSource$loadFeed$deferred$1$2$1(IdeaCardsDataSource ideaCardsDataSource, C27k<Boolean> c27k) {
        super(1);
        this.this$0 = ideaCardsDataSource;
        this.$newDeferred = c27k;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        IdeaCardsDataSource ideaCardsDataSource = this.this$0;
        AnonymousClass001.A1J(new AnonymousClass1(ideaCardsDataSource, this.$newDeferred, null), ideaCardsDataSource.scope);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
