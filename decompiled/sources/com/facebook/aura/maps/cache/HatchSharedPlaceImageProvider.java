package com.facebook.aura.maps.cache;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.HxE;
import android.graphics.Bitmap;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.maps.cache.HatchPlaceImageState;
import com.facebook.aura.maps.model.HatchMapMarker;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchSharedPlaceImageProvider {
    public final ConcurrentHashMap<String, Entry> entries;
    public final HatchPlaceBitmapLoader imageLoader;
    public final SingleFlight imageSingleFlight;
    public final LinkedHashMap<String, Bitmap> loadedImages;
    public final int maxRetainedImages;
    public final C3UX scope;

    public final class Entry {
        public int generation;
        public String imageUrl;
        public Integer loadingGeneration;
        public boolean requested;
        public final BLG<HatchPlaceImageState> state;

        public Entry(String str, int i, Integer num, boolean z, BLG<HatchPlaceImageState> blg) {
            C7384Etj.A0Y(blg, 4);
            this.imageUrl = str;
            this.generation = i;
            this.loadingGeneration = num;
            this.requested = z;
            this.state = blg;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final Integer getLoadingGeneration() {
            return this.loadingGeneration;
        }

        public final boolean getRequested() {
            return this.requested;
        }

        public final BLG<HatchPlaceImageState> getState() {
            return this.state;
        }

        public final void setGeneration(int i) {
            this.generation = i;
        }

        public final void setImageUrl(String str) {
            this.imageUrl = str;
        }

        public final void setLoadingGeneration(Integer num) {
            this.loadingGeneration = num;
        }

        public final void setRequested(boolean z) {
            this.requested = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$startImageLoadIfPossible$1", f = "HatchMapAgenticSceneFlowCache.kt", l = {237}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$startImageLoadIfPossible$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Entry $entry;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ String $key;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, Entry entry, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$key = str;
            this.$generation = i;
            this.$entry = entry;
            this.$imageUrl = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSharedPlaceImageProvider.this.new AnonymousClass1(this.$key, this.$generation, this.$entry, this.$imageUrl, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:57:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r1 = r8.label
                r6 = 1
                r0 = 0
                if (r1 == 0) goto L10
                if (r1 != r6) goto Lb
                goto L31
            Lb:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L10:
                X.Hwg.A00(r9)
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider r5 = com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.this     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                com.facebook.aura.common.coroutines.SingleFlight r4 = r5.imageSingleFlight     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                java.lang.String r3 = r8.$key     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                int r2 = r8.$generation     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                java.lang.String r1 = ":"
                java.lang.String r3 = X.FGI.A0S(r3, r1, r2)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                java.lang.String r2 = r8.$imageUrl     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1 r1 = new com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                r1.<init>(r5, r2, r0)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                r8.label = r6     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                java.lang.Object r9 = r4.invoke(r3, r1, r8)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                if (r9 != r7) goto L34
                return r7
            L31:
                X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
            L34:
                com.facebook.aura.common.coroutines.SingleFlightResult r9 = (com.facebook.aura.common.coroutines.SingleFlightResult) r9     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                boolean r1 = r9 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                if (r1 == 0) goto L41
                com.facebook.aura.common.coroutines.SingleFlightResult$Result r9 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r9     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                T r7 = r9.value     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                goto L4f
            L41:
                com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r1 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                boolean r1 = X.C7384Etj.areEqual(r9, r1)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                if (r1 != 0) goto L4e
                kotlin.NoWhenBranchMatchedException r1 = X.C3cG.A0q()     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
                throw r1     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lb2
            L4e:
                r7 = r0
            L4f:
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$Entry r4 = r8.$entry
                int r6 = r8.$generation
                java.lang.String r2 = r8.$imageUrl
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider r5 = com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.this
                java.lang.String r3 = r8.$key
                monitor-enter(r4)
                java.lang.Integer r1 = r4.loadingGeneration     // Catch: java.lang.Throwable -> Laf
                if (r1 == 0) goto L66
                int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Laf
                if (r1 != r6) goto L66
                r4.loadingGeneration = r0     // Catch: java.lang.Throwable -> Laf
            L66:
                int r1 = r4.generation     // Catch: java.lang.Throwable -> Laf
                if (r1 != r6) goto L97
                java.lang.String r1 = r4.imageUrl     // Catch: java.lang.Throwable -> Laf
                boolean r1 = X.C7384Etj.areEqual(r1, r2)     // Catch: java.lang.Throwable -> Laf
                if (r1 == 0) goto L97
                if (r7 != 0) goto L88
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r5.loadedImages     // Catch: java.lang.Throwable -> Laf
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Laf
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r1 = r5.loadedImages     // Catch: java.lang.Throwable -> L85
                r1.remove(r3)     // Catch: java.lang.Throwable -> L85
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                X.BLG<com.facebook.aura.maps.cache.HatchPlaceImageState> r2 = r4.state     // Catch: java.lang.Throwable -> Laf
                com.facebook.aura.maps.cache.HatchPlaceImageState$Unavailable r1 = com.facebook.aura.maps.cache.HatchPlaceImageState.Unavailable.INSTANCE     // Catch: java.lang.Throwable -> Laf
                r2.Af8(r1)     // Catch: java.lang.Throwable -> Laf
                goto L9c
            L85:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                throw r0     // Catch: java.lang.Throwable -> Laf
            L88:
                X.BLG<com.facebook.aura.maps.cache.HatchPlaceImageState> r2 = r4.state     // Catch: java.lang.Throwable -> Laf
                com.facebook.aura.maps.cache.HatchPlaceImageState$Loaded r1 = new com.facebook.aura.maps.cache.HatchPlaceImageState$Loaded     // Catch: java.lang.Throwable -> Laf
                r1.<init>(r7)     // Catch: java.lang.Throwable -> Laf
                X.AnonymousClass001.A1E(r2, r0, r1)     // Catch: java.lang.Throwable -> Laf
                X.HxE r0 = com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.access$retainLoadedImage(r5, r3, r7)     // Catch: java.lang.Throwable -> Laf
                goto L9c
            L97:
                if (r7 == 0) goto L9c
                r7.recycle()     // Catch: java.lang.Throwable -> Laf
            L9c:
                monitor-exit(r4)
                if (r0 == 0) goto Lac
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider r2 = com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.this
                A r1 = r0.first
                java.lang.String r1 = (java.lang.String) r1
                B r0 = r0.second
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.access$markImageUnavailableIfCurrent(r2, r1, r0)
            Lac:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            Laf:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            Lb2:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchSharedPlaceImageProvider(HatchPlaceBitmapLoader hatchPlaceBitmapLoader, SingleFlight singleFlight, C3UX c3ux, HatchMapScene hatchMapScene, int i) {
        C7384Etj.A0Y(hatchPlaceBitmapLoader, 0);
        AnonymousClass005.A11(singleFlight, c3ux, hatchMapScene, 1);
        this.imageLoader = hatchPlaceBitmapLoader;
        this.imageSingleFlight = singleFlight;
        this.scope = c3ux;
        this.maxRetainedImages = i;
        this.entries = C60O.A1C();
        this.loadedImages = C3cG.A0j();
        for (HatchMapPlace hatchMapPlace : hatchMapScene.getPlaces()) {
            this.entries.put(hatchMapPlace.placeId, new Entry(hatchMapPlace.photoUrl, 0, null, false, HnJ.A01(HatchPlaceImageState.Loading.INSTANCE)));
        }
        for (HatchMapMarker hatchMapMarker : hatchMapScene.getMarkers()) {
            ConcurrentHashMap<String, Entry> concurrentHashMap = this.entries;
            String artifactId = hatchMapMarker.getArtifactId();
            String str = hatchMapMarker.backgroundImageUrl;
            concurrentHashMap.put(artifactId, new Entry(str, 0, null, false, HnJ.A01(str == null ? HatchPlaceImageState.Unavailable.INSTANCE : HatchPlaceImageState.Loading.INSTANCE)));
        }
    }

    private final void startImageLoadIfPossible(String str, Entry entry) {
        String str2 = entry.imageUrl;
        if (str2 == null || !entry.requested || (entry.state.getValue() instanceof HatchPlaceImageState.Loaded)) {
            return;
        }
        int i = entry.generation;
        Integer num = entry.loadingGeneration;
        if (num == null || num.intValue() != i) {
            entry.loadingGeneration = Integer.valueOf(i);
            AnonymousClass001.A1J(new AnonymousClass1(str, i, entry, str2, null), this.scope);
        }
    }

    public final void finishImageUrlResolutionWithoutImage(String str) {
        C7384Etj.A0Y(str, 0);
        Entry entry = this.entries.get(str);
        if (entry != null) {
            synchronized (entry) {
                if (entry.imageUrl == null) {
                    entry.state.Af8(HatchPlaceImageState.Unavailable.INSTANCE);
                }
            }
        }
    }

    public final C1BN<HatchPlaceImageState> observeImage(String str) {
        C7384Etj.A0Y(str, 0);
        Entry entry = this.entries.get(str);
        if (entry == null) {
            return null;
        }
        synchronized (entry) {
            entry.requested = true;
            startImageLoadIfPossible(str, entry);
        }
        return entry.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markImageUnavailableIfCurrent(String str, Bitmap bitmap) {
        Entry entry = this.entries.get(str);
        if (entry != null) {
            synchronized (entry) {
                HatchPlaceImageState value = entry.state.getValue();
                if ((value instanceof HatchPlaceImageState.Loaded) && ((HatchPlaceImageState.Loaded) value).bitmap == bitmap) {
                    entry.state.Af8(HatchPlaceImageState.Unavailable.INSTANCE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HxE<String, Bitmap> retainLoadedImage(String str, Bitmap bitmap) {
        HxE<String, Bitmap> hxEA0r;
        synchronized (this.loadedImages) {
            this.loadedImages.put(str, bitmap);
            LinkedHashMap<String, Bitmap> linkedHashMap = this.loadedImages;
            if (linkedHashMap.size() <= this.maxRetainedImages) {
                hxEA0r = null;
            } else {
                Iterator itA0i = C3cG.A0i(linkedHashMap);
                Object next = itA0i.next();
                Map.Entry entry = (Map.Entry) next;
                itA0i.remove();
                C7384Etj.A0U(next);
                hxEA0r = C3cG.A0r(entry.getKey(), entry.getValue());
            }
        }
        return hxEA0r;
    }

    public final void close() {
        this.imageSingleFlight.clearAndCancelAll();
        synchronized (this.loadedImages) {
            this.loadedImages.clear();
        }
        this.entries.clear();
    }

    public final void registerImageUrl(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        Entry entry = this.entries.get(str);
        if (entry != null) {
            synchronized (entry) {
                if (!str2.equals(entry.imageUrl)) {
                    synchronized (this.loadedImages) {
                        this.loadedImages.remove(str);
                    }
                    entry.imageUrl = str2;
                    entry.generation++;
                    entry.state.Af8(HatchPlaceImageState.Loading.INSTANCE);
                }
                startImageLoadIfPossible(str, entry);
            }
        }
    }
}
