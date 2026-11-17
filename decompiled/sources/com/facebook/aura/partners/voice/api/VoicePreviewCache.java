package com.facebook.aura.partners.voice.api;

import X.A3W;
import X.A3q;
import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass604;
import X.BGK;
import X.C06H;
import X.C10550Hrx;
import X.C27i;
import X.C27k;
import X.C3UX;
import X.C3b6;
import X.C3cG;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7AG;
import X.C7BY;
import X.C8eM;
import X.C8iN;
import X.G0U;
import X.GAo;
import X.GCQ;
import X.GCV;
import X.HtJ;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.HzR;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.state.Transport;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class VoicePreviewCache implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_DOWNLOADS = 2;
    public static final int MAX_PREVIEW_TEXT_LENGTH = 2000;
    public static final int MAX_VOICES_PER_WIDGET = 5;
    public static final long MAX_WARMED_AUDIO_BYTES = 131072;
    public static final int MAX_WIDGETS = 3;
    public static final long PLAYBACK_CACHE_BYTES = 1048664;
    public static final int PREFETCH_WORKERS = 1;
    public static final String TAG = "VoicePreviewCache";
    public static final long WIDGET_CACHE_BYTES = 2097152;
    public final Set<HxE<String, String>> attemptedKeys;
    public boolean closed;
    public final C8eM downloadSlots;
    public final Map<HxE<String, String>, Flight> flights;
    public long generation;
    public final Object lock;
    public final LinkedHashSet<HxE<String, String>> pendingKeys;
    public final AuraByteLruCache<HxE<String, String>, byte[]> playbackCache;
    public final Set<HxE<String, String>> playedWidgetKeys;
    public final VoiceCatalogRepository repository;
    public Set<HxE<String, String>> retainedKeys;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final HzR<Unit> wakeups;
    public final AuraByteLruCache<HxE<String, String>, byte[]> widgetCache;
    public final List<Widget> widgets;

    public final class Companion {
        public final VoicePreviewCache getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoicePreviewCache) abstractC3358CGz.A03(VoicePreviewCache.class, new VoicePreviewCache$Companion$getInstance$1(abstractC3358CGz));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isUnmeteredWifi(AuraNetworkState auraNetworkState) {
            if (auraNetworkState instanceof AuraNetworkState.Online) {
                AuraNetworkState.Online online = (AuraNetworkState.Online) auraNetworkState;
                if (online.transport == Transport.WIFI && !online.isMetered && online.isValidated) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Flight {
        public final C27k<byte[]> result;
        public final AtomicBoolean userRequested;

        public final C27k<byte[]> getResult() {
            return this.result;
        }

        public final AtomicBoolean getUserRequested() {
            return this.userRequested;
        }

        public Flight(AtomicBoolean atomicBoolean, C27k<byte[]> c27k) {
            AnonymousClass003.A0u(atomicBoolean, c27k);
            this.userRequested = atomicBoolean;
            this.result = c27k;
        }
    }

    public final class Widget {
        public final HxE<String, String> id;
        public final List<HxE<String, String>> keys;

        public final HxE<String, String> getId() {
            return this.id;
        }

        public final List<HxE<String, String>> getKeys() {
            return this.keys;
        }

        public Widget(HxE<String, String> hxE, List<HxE<String, String>> list) {
            AnonymousClass003.A0u(hxE, list);
            this.id = hxE;
            this.keys = list;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.api.VoicePreviewCache$createFlight$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ Flight $flight;
        public final /* synthetic */ HxE<String, String> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HxE<String, String> hxE, Flight flight) {
            super(1);
            this.$key = hxE;
            this.$flight = flight;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            VoicePreviewCache voicePreviewCache = VoicePreviewCache.this;
            Object obj = voicePreviewCache.lock;
            HxE<String, String> hxE = this.$key;
            Flight flight = this.$flight;
            synchronized (obj) {
                if (voicePreviewCache.flights.get(hxE) == flight) {
                    voicePreviewCache.flights.remove(hxE);
                }
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoicePreviewCache", f = "VoicePreviewCache.kt", l = {171}, m = "fetch", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoicePreviewCache$fetch$1, reason: invalid class name and case insensitive filesystem */
    public final class C130471 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C130471(HtJ<? super C130471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewCache.this.fetch(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoicePreviewCache", f = "VoicePreviewCache.kt", l = {209}, m = "lookup", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoicePreviewCache$lookup$1, reason: invalid class name and case insensitive filesystem */
    public final class C130481 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C130481(HtJ<? super C130481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewCache.this.lookup(null, null, this);
        }
    }

    public static final /* synthetic */ boolean access$isCurrent(VoicePreviewCache voicePreviewCache) {
        return !voicePreviewCache.closed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cacheAudio(X.HxE<java.lang.String, java.lang.String> r6, byte[] r7, boolean r8) {
        /*
            r5 = this;
            java.util.Set<X.HxE<java.lang.String, java.lang.String>> r0 = r5.retainedKeys
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L37
            int r0 = r7.length
            long r1 = (long) r0
            r3 = 131072(0x20000, double:6.47582E-319)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L37
            if (r8 != 0) goto L1c
            com.facebook.aura.memory.AuraByteLruCache<X.HxE<java.lang.String, java.lang.String>, byte[]> r0 = r5.playbackCache
            boolean r0 = r0.containsKey(r6)
            r1 = 0
            if (r0 == 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            com.facebook.aura.memory.AuraByteLruCache<X.HxE<java.lang.String, java.lang.String>, byte[]> r0 = r5.widgetCache
            r0.put(r6, r7)
            com.facebook.aura.memory.AuraByteLruCache<X.HxE<java.lang.String, java.lang.String>, byte[]> r0 = r5.widgetCache
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L37
            if (r1 == 0) goto L31
            java.util.Set<X.HxE<java.lang.String, java.lang.String>> r0 = r5.playedWidgetKeys
            r0.add(r6)
        L31:
            com.facebook.aura.memory.AuraByteLruCache<X.HxE<java.lang.String, java.lang.String>, byte[]> r0 = r5.playbackCache
            r0.remove(r6)
        L36:
            return
        L37:
            if (r8 == 0) goto L36
            com.facebook.aura.memory.AuraByteLruCache<X.HxE<java.lang.String, java.lang.String>, byte[]> r0 = r5.playbackCache
            r0.put(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoicePreviewCache.cacheAudio(X.HxE, byte[], boolean):void");
    }

    private final byte[] cachedAudio(HxE<String, String> hxE) {
        byte[] bArr = this.widgetCache.get(hxE);
        return bArr == null ? this.playbackCache.get(hxE) : bArr;
    }

    private final Flight createFlight(HxE<String, String> hxE, boolean z, long j) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
        C10550Hrx c10550HrxA01 = GAo.A01(C79.A01, C6ys.A00, new VoicePreviewCache$createFlight$result$1(this, hxE, j, atomicBoolean, null), this.scope);
        Flight flight = new Flight(atomicBoolean, c10550HrxA01);
        this.flights.put(hxE, flight);
        c10550HrxA01.AO5(new AnonymousClass1(hxE, flight));
        return flight;
    }

    private final boolean isCurrent() {
        return !this.closed;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            invalidate();
            this.wakeups.A5w(null);
            Hxb.A03(null, this.scope);
            this.widgetCache.close();
            this.playbackCache.close();
        }
    }

    public final long currentGeneration() {
        long j;
        synchronized (this.lock) {
            j = this.generation;
        }
        return j;
    }

    /* JADX WARN: Path cross not found for [B:35:0x0094, B:32:0x008b], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: all -> 0x0118, TryCatch #1 {, blocks: (B:19:0x0058, B:22:0x0060, B:24:0x0068, B:27:0x0072, B:29:0x0078, B:30:0x0081, B:32:0x008b, B:40:0x00a2, B:41:0x00a7, B:35:0x0094, B:73:0x010b, B:75:0x0111), top: B:84:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d3 -> B:47:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(java.lang.String r16, java.lang.String r17, boolean r18, X.HtJ<? super byte[]> r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoicePreviewCache.fetch(java.lang.String, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.generation++;
            this.widgets.clear();
            this.retainedKeys = A3q.A00;
            this.playedWidgetKeys.clear();
            this.attemptedKeys.clear();
            this.pendingKeys.clear();
            this.widgetCache.clear();
            this.playbackCache.clear();
            List listA0X = AbstractC0878AGe.A0X(this.flights.values());
            this.flights.clear();
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                ((Flight) it.next()).result.A5w(null);
            }
            this.singleFlight.clearAndCancelAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lookup(java.lang.String r13, java.lang.String r14, X.HtJ<? super com.facebook.aura.partners.voice.api.VoiceCatalogRepository.PreviewLookup> r15) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoicePreviewCache.lookup(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public VoicePreviewCache(AbstractC3358CGz abstractC3358CGz) {
        this.lock = C3cG.A0T();
        HzC hzCA03 = C78W.A03();
        this.scope = hzCA03;
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        int i = GCQ.A00;
        this.downloadSlots = new C27i(2);
        Integer num = C79.A00;
        this.wakeups = new GCV(1, null);
        this.repository = new VoiceCatalogRepository();
        this.widgets = C3cG.A0h();
        this.flights = C3cG.A0j();
        this.retainedKeys = A3q.A00;
        this.playedWidgetKeys = C3cG.A0k();
        this.attemptedKeys = C3cG.A0k();
        this.pendingKeys = C3cG.A0k();
        this.widgetCache = new AuraByteLruCache<>(15, 2097152L, 1048576L, false, MAX_WARMED_AUDIO_BYTES, VoicePreviewCache$widgetCache$1.INSTANCE);
        this.playbackCache = new AuraByteLruCache<>(32, PLAYBACK_CACHE_BYTES, 0L, false, 0L, VoicePreviewCache$playbackCache$1.INSTANCE, 28, null);
        GAo.A02(num, C6ys.A00, new VoicePreviewCache$1$1(this, null), hzCA03);
    }

    public final void putStreamed(String str, String str2, byte[] bArr, long j) {
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, bArr);
        HxE<String, String> hxEA0r = C3cG.A0r(str, str2);
        synchronized (this.lock) {
            if ((!this.closed) && this.generation == j && cachedAudio(hxEA0r) == null) {
                cacheAudio(hxEA0r, bArr, zA1Z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    public final void registerWidget(HxE<String, String> hxE, List<String> list, String str) {
        Widget next;
        ?? A0i;
        AnonymousClass005.A0x(hxE, list, str);
        if (C7BY.A0j(str) || str.length() > 2000 || !VoiceGating.INSTANCE.isWidgetPreviewPrefetchEnabled()) {
            return;
        }
        C3b6 c3b6A07 = A6B.A07(new A3W(new AnonymousClass604(3), A6B.A03(VoicePreviewCache$registerWidget$keys$1.INSTANCE, new C8iN(list, 0))), 5);
        VoicePreviewCache$registerWidget$keys$2 voicePreviewCache$registerWidget$keys$2 = new VoicePreviewCache$registerWidget$keys$2(str);
        AnonymousClass003.A0u(c3b6A07, voicePreviewCache$registerWidget$keys$2);
        List listA02 = A6B.A02(new C7AG(voicePreviewCache$registerWidget$keys$2, c3b6A07));
        if (listA02.isEmpty()) {
            return;
        }
        synchronized (this.lock) {
            if (!this.closed) {
                Iterator<Widget> it = this.widgets.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (C7384Etj.areEqual(next.id, hxE)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Widget widget = next;
                if (!C7384Etj.areEqual(widget != null ? widget.keys : null, listA02)) {
                    Widget widget2 = new Widget(hxE, listA02);
                    if (widget == null) {
                        A0i = AbstractC0878AGe.A0a(AbstractC0878AGe.A0P(this.widgets, Collections.singletonList(widget2)), 3);
                    } else {
                        List<Widget> list2 = this.widgets;
                        A0i = AnonymousClass003.A0i(list2);
                        for (Widget widget3 : list2) {
                            if (C7384Etj.areEqual(widget3.id, hxE)) {
                                widget3 = widget2;
                            }
                            A0i.add(widget3);
                        }
                    }
                    this.widgets.clear();
                    this.widgets.addAll(A0i);
                    Set<HxE<String, String>> set = this.retainedKeys;
                    List<Widget> list3 = this.widgets;
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator<Widget> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        AbstractC0882AGj.A0r(it2.next().keys, arrayListA0h);
                    }
                    Set<HxE<String, String>> setA0g = AbstractC0878AGe.A0g(arrayListA0h);
                    this.retainedKeys = setA0g;
                    Iterator it3 = BGK.A03(setA0g, set).iterator();
                    while (it3.hasNext()) {
                        HxE<String, String> hxEA10 = C60Q.A10(it3);
                        byte[] bArrRemove = this.widgetCache.remove(hxEA10);
                        if (bArrRemove != null && this.playedWidgetKeys.contains(hxEA10)) {
                            this.playbackCache.put(hxEA10, bArrRemove);
                        }
                    }
                    this.playedWidgetKeys.retainAll(this.retainedKeys);
                    this.attemptedKeys.retainAll(this.retainedKeys);
                    this.pendingKeys.clear();
                    Iterator<Widget> it4 = this.widgets.iterator();
                    while (it4.hasNext()) {
                        Iterator<HxE<String, String>> it5 = it4.next().keys.iterator();
                        while (it5.hasNext()) {
                            HxE<String, String> hxEA102 = C60Q.A10(it5);
                            if (!this.attemptedKeys.contains(hxEA102)) {
                                this.pendingKeys.add(hxEA102);
                            }
                        }
                    }
                    this.widgets.size();
                    this.retainedKeys.size();
                    this.wakeups.AhZ(Unit.INSTANCE);
                }
            }
        }
    }

    private final void logResult(boolean z, String str, long j, int i) {
        SystemClock.elapsedRealtime();
    }

    public /* synthetic */ VoicePreviewCache(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
