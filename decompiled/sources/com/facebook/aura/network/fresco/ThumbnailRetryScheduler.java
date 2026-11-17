package com.facebook.aura.network.fresco;

import X.A3q;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BGK;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GB9;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.executors.AuraDispatchers;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class ThumbnailRetryScheduler {
    public static final ThumbnailRetryScheduler INSTANCE = new ThumbnailRetryScheduler();
    public static final C3UX scope = C3cH.A0x(C3cG.A0v());
    public static final ConcurrentHashMap<String, Set<Function0<Unit>>> actions = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, HoC> jobs = new ConcurrentHashMap<>();

    @DebugMetadata(c = "com.facebook.aura.network.fresco.ThumbnailRetryScheduler$schedule$1", f = "ThumbnailRetryScheduler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, 48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.fresco.ThumbnailRetryScheduler$schedule$1, reason: invalid class name and case insensitive filesystem */
    public final class C127171 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $delayMs;
        public final /* synthetic */ String $key;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.network.fresco.ThumbnailRetryScheduler$schedule$1$1", f = "ThumbnailRetryScheduler.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.network.fresco.ThumbnailRetryScheduler$schedule$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02461 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $key;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02461(String str, HtJ<? super C02461> htJ) {
                super(2, htJ);
                this.$key = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02461(this.$key, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                Set<Function0<Unit>> set = ThumbnailRetryScheduler.actions.get(this.$key);
                if (set != null) {
                    Iterator<Function0<Unit>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C02461(this.$key, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127171(long j, String str, HtJ<? super C127171> htJ) {
            super(2, htJ);
            this.$delayMs = j;
            this.$key = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127171(this.$delayMs, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$delayMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            ThumbnailRetryScheduler.jobs.remove(this.$key);
            GB9 gb9 = AuraDispatchers.main;
            C02461 c02461 = new C02461(this.$key, null);
            this.label = 2;
            if (GAo.A00(this, gb9, c02461) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127171) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void cancel(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1K(jobs.remove(str));
    }

    public final void schedule(String str, long j) {
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<String, HoC> concurrentHashMap = jobs;
        HtJ htJA13 = AnonymousClass006.A13(concurrentHashMap.remove(str));
        concurrentHashMap.put(str, AnonymousClass001.A11(new C127171(j, str, htJA13), scope));
    }

    public final void addRetryAction(String str, final Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        actions.compute(str, new BiFunction() { // from class: com.facebook.aura.network.fresco.ThumbnailRetryScheduler.addRetryAction.1
            @Override // java.util.function.BiFunction
            public final Set<Function0<Unit>> apply(String str2, Set<? extends Function0<Unit>> set) {
                if (set == null) {
                    set = A3q.A00;
                }
                return BGK.A02(function0, set);
            }
        });
    }

    public final void removeRetryAction(String str, final Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        actions.computeIfPresent(str, new BiFunction() { // from class: com.facebook.aura.network.fresco.ThumbnailRetryScheduler.removeRetryAction.1
            @Override // java.util.function.BiFunction
            public final Set<Function0<Unit>> apply(String str2, Set<? extends Function0<Unit>> set) {
                C7384Etj.A0Y(set, 1);
                Set<Function0<Unit>> setA04 = BGK.A04(function0, set);
                if (setA04.isEmpty()) {
                    return null;
                }
                return setA04;
            }
        });
    }
}
