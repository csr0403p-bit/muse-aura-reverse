package com.facebook.aura.navigation;

import X.A6I;
import X.AIB;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.BJt;
import X.BQw;
import X.BRL;
import X.C06H;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class SharedViewModelStoreNavEntryDecorator<T> extends BQw<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String PARENT_CONTENT_KEY = "shared_decorator_parent_content_key";

    /* renamed from: com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Object, Unit> {
        public final /* synthetic */ BJt $viewModelStore;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            C7384Etj.A0Y(obj, 0);
            SharedViewModelStoreNavEntryDecoratorKt.getEntryViewModel(this.$viewModelStore).clearViewModelStoreOwnerForKey(obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BJt bJt) {
            super(1);
            this.$viewModelStore = bJt;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<BRL<T>, BFM, Integer, Unit> {
        public final /* synthetic */ BJt $viewModelStore;

        /* renamed from: com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ BRL<T> $entry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BRL<T> brl) {
                super(2);
                this.$entry = brl;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    this.$entry.A00(bfm, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BJt bJt) {
            super(3);
            this.$viewModelStore = bJt;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(BRL<T> brl, BFM bfm, int i) {
            if (AnonymousClass002.A0B(brl, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, brl);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            Object obj = brl.A02.get(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY);
            if (obj == null) {
                obj = brl.A00;
            }
            BJt bJtViewModelStoreForKey = SharedViewModelStoreNavEntryDecoratorKt.getEntryViewModel(this.$viewModelStore).viewModelStoreForKey(obj);
            A6I a6i = (A6I) bfm.A6v(AIB.A00);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new SharedViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1(a6i, bJtViewModelStoreForKey);
                bfm.Ai0(objAaT);
            }
            AnonymousClass006.A15(bfm, C5wL.A00.A04(objAaT), new AnonymousClass1(brl), 197401759);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, BFM bfm, Integer num) {
            invoke((BRL) obj, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedViewModelStoreNavEntryDecorator(BJt bJt) {
        super(new AnonymousClass1(bJt), AnonymousClass001.A0M(new AnonymousClass2(bJt), 1902246239));
        C7384Etj.A0Y(bJt, 0);
    }

    public final class Companion {
        public final Map<String, Object> parent(Object obj) {
            C7384Etj.A0Y(obj, 0);
            return AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, obj);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
