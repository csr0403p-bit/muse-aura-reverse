package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQw;
import X.BRL;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ResultEventBusNavEntryDecorator<T> extends BQw<T> {
    public static final int $stable = 0;
    public final ResultEventBus bus;

    /* renamed from: com.facebook.aura.navigation.ResultEventBusNavEntryDecorator$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Object, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* renamed from: com.facebook.aura.navigation.ResultEventBusNavEntryDecorator$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<BRL<T>, BFM, Integer, Unit> {
        public final /* synthetic */ ResultEventBus $bus;

        /* renamed from: com.facebook.aura.navigation.ResultEventBusNavEntryDecorator$2$1, reason: invalid class name */
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
        public AnonymousClass2(ResultEventBus resultEventBus) {
            super(3);
            this.$bus = resultEventBus;
        }

        public final void invoke(BRL<T> brl, BFM bfm, int i) {
            if (AnonymousClass002.A0B(brl, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, brl);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                AnonymousClass003.A0m(bfm, LocalResultEventBus.INSTANCE.provides(this.$bus), new AnonymousClass1(brl), -639029567);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, BFM bfm, Integer num) {
            invoke((BRL) obj, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ResultEventBusNavEntryDecorator(ResultEventBus resultEventBus, int i, C06H c06h) {
        this((i & 1) != 0 ? new ResultEventBus() : resultEventBus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultEventBusNavEntryDecorator(ResultEventBus resultEventBus) {
        super(AnonymousClass1.INSTANCE, AnonymousClass001.A0M(new AnonymousClass2(resultEventBus), -134079999));
        C7384Etj.A0Y(resultEventBus, 0);
        this.bus = resultEventBus;
    }

    public ResultEventBusNavEntryDecorator() {
        this(new ResultEventBus());
    }
}
