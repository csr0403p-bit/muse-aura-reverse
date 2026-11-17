package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78W;
import X.EnumC10460Hji;
import X.G0V;
import X.GAt;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.os.SystemClock;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelReadCache<K, V> {
    public static final int $stable = 8;
    public final Function0<Boolean> canUse;
    public boolean closed;
    public final Map<K, Ticket<V>> currentTickets;
    public final SingleFlight flights;
    public final G0V<K, HtJ<? super HsJ<? extends V>>, Object> load;
    public final Object lock;
    public final LinkedHashSet<K> pending;
    public final C3UX scope;
    public final LinkedHashMap<K, Entry<V>> values;
    public int workers;

    public final class Entry<V> {
        public final long completedAt;
        public final V value;

        public final long getCompletedAt() {
            return this.completedAt;
        }

        public final V getValue() {
            return this.value;
        }

        public Entry(V v, long j) {
            this.value = v;
            this.completedAt = j;
        }
    }

    /* loaded from: classes5.dex */
    public final class Ticket<V> {
        public HsJ<? extends V> completed;

        /* renamed from: getCompleted-xLWZpok, reason: not valid java name */
        public final HsJ<V> m1070getCompletedxLWZpok() {
            return this.completed;
        }

        public final void setCompleted(HsJ<? extends V> hsJ) {
            this.completed = hsJ;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelReadCache$acquire$2", f = "HotelReadCache.kt", l = {130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelReadCache$acquire$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends V>>, Object> {
        public final /* synthetic */ K $key;
        public final /* synthetic */ Ticket<V> $ticket;
        public int label;
        public final /* synthetic */ HotelReadCache<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HotelReadCache<K, V> hotelReadCache, Ticket<V> ticket, K k, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.this$0 = hotelReadCache;
            this.$ticket = ticket;
            this.$key = k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.this$0, this.$ticket, this.$key, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0s;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HotelReadCache<K, V> hotelReadCache = this.this$0;
                SingleFlight singleFlight = hotelReadCache.flights;
                Ticket<V> ticket = this.$ticket;
                HotelReadCache$acquire$2$flight$1 hotelReadCache$acquire$2$flight$1 = new HotelReadCache$acquire$2$flight$1(hotelReadCache, this.$key, ticket, null);
                this.label = 1;
                obj = singleFlight.invoke(ticket, hotelReadCache$acquire$2$flight$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
            if (singleFlightResult instanceof SingleFlightResult.Result) {
                objA0s = ((HsJ) ((SingleFlightResult.Result) singleFlightResult).value).value;
            } else {
                if (!C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                    throw C3cG.A0q();
                }
                objA0s = C3cG.A0s(C3cG.A0Q("Hotel read was skipped"));
            }
            return C3cG.A0t(objA0s);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends V>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void prefetch(List<? extends K> list) {
        C7384Etj.A0Y(list, 0);
        synchronized (this.lock) {
            if (!this.closed && AnonymousClass003.A1Y(this.canUse)) {
                for (K k : list) {
                    if (this.pending.size() < 64 && fresh(k) == null && !this.currentTickets.containsKey(k)) {
                        this.pending.add(k);
                    }
                }
                while (this.workers < 2 && !this.pending.isEmpty()) {
                    this.workers++;
                    AnonymousClass001.A1J(new HotelReadCache$prefetch$1$2(this, null), this.scope);
                }
            }
        }
    }

    private final void checkActive() {
        if (this.closed || !AnonymousClass003.A1Y(this.canUse)) {
            throw new CancellationException("Hotel read owner was cleared");
        }
    }

    private final V fresh(K k) {
        Entry<V> entry = this.values.get(k);
        if (entry != null) {
            if (SystemClock.elapsedRealtime() - entry.completedAt < 300000) {
                return entry.value;
            }
            this.values.remove(k);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: read-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1068read0E7RQCE(K r8, com.facebook.aura.hotels.HotelReadCache.Ticket<V> r9, X.HtJ<? super X.HsJ<? extends V>> r10) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelReadCache.m1068read0E7RQCE(java.lang.Object, com.facebook.aura.hotels.HotelReadCache$Ticket, X.HtJ):java.lang.Object");
    }

    public final void close() {
        synchronized (this.lock) {
            this.closed = true;
            this.values.clear();
            this.pending.clear();
            this.currentTickets.clear();
        }
        Hxb.A03(null, this.scope);
        this.flights.clearAndCancelAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: get-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1069get0E7RQCE(K r7, boolean r8, X.HtJ<? super X.HsJ<? extends V>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.hotels.HotelReadCache$get$1
            if (r0 == 0) goto L1e
            r4 = r9
            com.facebook.aura.hotels.HotelReadCache$get$1 r4 = (com.facebook.aura.hotels.HotelReadCache$get$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 != r3) goto L24
            goto L56
        L1e:
            com.facebook.aura.hotels.HotelReadCache$get$1 r4 = new com.facebook.aura.hotels.HotelReadCache$get$1
            r4.<init>(r6, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            java.lang.Object r2 = r6.lock     // Catch: java.util.concurrent.CancellationException -> L61
            monitor-enter(r2)     // Catch: java.util.concurrent.CancellationException -> L61
            r6.checkActive()     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashSet<K> r0 = r6.pending     // Catch: java.lang.Throwable -> L5e
            r0.remove(r7)     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto L43
            java.util.LinkedHashMap<K, com.facebook.aura.hotels.HotelReadCache$Entry<V>> r0 = r6.values     // Catch: java.lang.Throwable -> L5e
            r0.remove(r7)     // Catch: java.lang.Throwable -> L5e
            java.util.Map<K, com.facebook.aura.hotels.HotelReadCache$Ticket<V>> r0 = r6.currentTickets     // Catch: java.lang.Throwable -> L5e
            r0.remove(r7)     // Catch: java.lang.Throwable -> L5e
        L43:
            X.27k r1 = r6.acquire(r7)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)     // Catch: java.util.concurrent.CancellationException -> L61
            r0 = 0
            r4.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L61
            r4.Z$0 = r8     // Catch: java.util.concurrent.CancellationException -> L61
            r4.label = r3     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r0 = X.C3cG.A0W(r1, r4)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r0 != r5) goto L59
            return r5
        L56:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L61
        L59:
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r5 = r0.value     // Catch: java.util.concurrent.CancellationException -> L61
            return r5
        L5e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.util.concurrent.CancellationException -> L61
            throw r0     // Catch: java.util.concurrent.CancellationException -> L61
        L61:
            r2 = move-exception
            X.C3cG.A1H(r4)
            java.lang.String r1 = "Hotel read owner was cleared"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelReadCache.m1069get0E7RQCE(java.lang.Object, boolean, X.HtJ):java.lang.Object");
    }

    public final void invalidate(K k) {
        synchronized (this.lock) {
            this.values.remove(k);
            this.pending.remove(k);
            this.currentTickets.remove(k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelReadCache(AbstractC3358CGz abstractC3358CGz, Function0<Boolean> function0, G0V<? super K, ? super HtJ<? super HsJ<? extends V>>, ? extends Object> g0v) {
        boolean zA1Z = AnonymousClass005.A1Z(abstractC3358CGz, function0, g0v);
        this.canUse = function0;
        this.load = g0v;
        this.scope = C78W.A03();
        this.lock = C3cG.A0T();
        this.values = new LinkedHashMap<>(16, 0.75f, zA1Z);
        this.flights = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, zA1Z);
        this.currentTickets = C3cG.A0j();
        this.pending = C3cG.A0k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C27k<HsJ<V>> acquire(K k) {
        V vFresh = fresh(k);
        if (vFresh != null) {
            HsJ hsJA0t = C3cG.A0t(vFresh);
            GAt gAt = new GAt(null);
            gAt.A0R(hsJA0t);
            return gAt;
        }
        Map<K, Ticket<V>> map = this.currentTickets;
        Ticket<V> ticket = map.get(k);
        if (ticket == null) {
            ticket = new Ticket<>();
            map.put(k, ticket);
        }
        return AnonymousClass001.A10(new AnonymousClass2(this, ticket, k, null), this.scope);
    }
}
