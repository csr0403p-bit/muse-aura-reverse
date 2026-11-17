package com.facebook.aura.maps;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.graphics.Bitmap;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.maps.cache.HatchPlaceImageState;
import com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider;
import com.meta.maps.display.Image;
import com.meta.maps.display.ImageProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchMapMarkerImageProvider implements ImageProvider {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String PREFIX = "hatch-pin:";

    @Deprecated
    public static final String TAG = "HatchMapMarkerImageProvider";
    public final ConcurrentHashMap<String, Set<ImageProvider.ImageCallback>> callbacks;
    public final ConcurrentHashMap<String, Image> fallbackImages;
    public final ConcurrentHashMap<String, Bitmap> imageSources;
    public final ConcurrentHashMap<String, Image> images;
    public final ConcurrentHashMap.KeySetView<String, Boolean> observingIdentifiers;
    public final HatchSharedPlaceImageProvider placeImageProvider;
    public final Map<HatchMapDisplayMode, HatchMapMarkerRenderer> renderers;
    public final C3UX scope;

    public final class Request {
        public final String imageKey;
        public final boolean isDarkMode;
        public final boolean isSelected;
        public final HatchMapMarkerRenderer renderer;

        public final String getImageKey() {
            return this.imageKey;
        }

        public final HatchMapMarkerRenderer getRenderer() {
            return this.renderer;
        }

        public final boolean isDarkMode() {
            return this.isDarkMode;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public Request(String str, boolean z, boolean z2, HatchMapMarkerRenderer hatchMapMarkerRenderer) {
            AnonymousClass003.A0w(str, hatchMapMarkerRenderer);
            this.imageKey = str;
            this.isDarkMode = z;
            this.isSelected = z2;
            this.renderer = hatchMapMarkerRenderer;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4", f = "HatchMapMarkerImageProvider.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $identifier;
        public final /* synthetic */ C1BN<HatchPlaceImageState> $imageState;
        public final /* synthetic */ Request $request;
        public int label;
        public final /* synthetic */ HatchMapMarkerImageProvider this$0;

        /* renamed from: com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ String $identifier;
            public final /* synthetic */ Request $request;
            public final /* synthetic */ HatchMapMarkerImageProvider this$0;

            public AnonymousClass1(HatchMapMarkerImageProvider hatchMapMarkerImageProvider, String str, Request request) {
                this.this$0 = hatchMapMarkerImageProvider;
                this.$identifier = str;
                this.$request = request;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.maps.cache.HatchPlaceImageState r9, X.HtJ<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$emit$1
                    if (r0 == 0) goto L22
                    r6 = r10
                    com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$emit$1 r6 = (com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L22
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r3 = r6.result
                    X.Hji r7 = X.EnumC10460Hji.A02
                    int r0 = r6.label
                    r5 = 1
                    if (r0 == 0) goto L2d
                    if (r0 != r5) goto L28
                    java.lang.Object r9 = r6.L$0
                    com.facebook.aura.maps.cache.HatchPlaceImageState r9 = (com.facebook.aura.maps.cache.HatchPlaceImageState) r9
                    goto L5e
                L22:
                    com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$emit$1 r6 = new com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$emit$1
                    r6.<init>(r8, r10)
                    goto L12
                L28:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L2d:
                    X.Hwg.A00(r3)
                    boolean r0 = r9 instanceof com.facebook.aura.maps.cache.HatchPlaceImageState.Loaded
                    if (r0 == 0) goto Lae
                    com.facebook.aura.maps.HatchMapMarkerImageProvider r0 = r8.this$0
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, android.graphics.Bitmap> r1 = r0.imageSources
                    java.lang.String r0 = r8.$identifier
                    java.lang.Object r1 = r1.get(r0)
                    r0 = r9
                    com.facebook.aura.maps.cache.HatchPlaceImageState$Loaded r0 = (com.facebook.aura.maps.cache.HatchPlaceImageState.Loaded) r0
                    android.graphics.Bitmap r0 = r0.bitmap
                    if (r1 == r0) goto Lae
                    X.78T r4 = X.C3cG.A0v()     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    com.facebook.aura.maps.HatchMapMarkerImageProvider r3 = r8.this$0     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    com.facebook.aura.maps.HatchMapMarkerImageProvider$Request r2 = r8.$request     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    r1 = 0
                    com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$image$1 r0 = new com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$image$1     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    r0.<init>(r3, r2, r9, r1)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    r6.L$0 = r9     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    r6.label = r5     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    java.lang.Object r3 = X.GAo.A00(r6, r4, r0)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    if (r3 != r7) goto L61
                    return r7
                L5e:
                    X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                L61:
                    com.meta.maps.display.Image r3 = (com.meta.maps.display.Image) r3     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> Lac
                    com.facebook.aura.maps.HatchMapMarkerImageProvider r0 = r8.this$0
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.meta.maps.display.Image> r1 = r0.images
                    java.lang.String r0 = r8.$identifier
                    r1.put(r0, r3)
                    com.facebook.aura.maps.HatchMapMarkerImageProvider r0 = r8.this$0
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, android.graphics.Bitmap> r2 = r0.imageSources
                    java.lang.String r1 = r8.$identifier
                    com.facebook.aura.maps.cache.HatchPlaceImageState$Loaded r9 = (com.facebook.aura.maps.cache.HatchPlaceImageState.Loaded) r9
                    android.graphics.Bitmap r0 = r9.bitmap
                    r2.put(r1, r0)
                    com.facebook.aura.maps.HatchMapMarkerImageProvider r0 = r8.this$0
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<com.meta.maps.display.ImageProvider$ImageCallback>> r1 = r0.callbacks
                    java.lang.String r0 = r8.$identifier
                    java.lang.Object r0 = r1.get(r0)
                    java.util.Set r0 = (java.util.Set) r0
                    if (r0 == 0) goto Lae
                    java.util.Iterator r1 = r0.iterator()
                L8b:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto Lae
                    java.lang.Object r0 = r1.next()
                    com.meta.maps.display.ImageProvider$ImageCallback r0 = (com.meta.maps.display.ImageProvider.ImageCallback) r0
                    r0.apply(r3)
                    goto L8b
                L9b:
                    r2 = move-exception
                    java.lang.String r1 = r8.$identifier
                    java.lang.String r0 = "Marker photo render failed for "
                    java.lang.String r1 = X.FGI.A0M(r0, r1)
                    java.lang.String r0 = "HatchMapMarkerImageProvider"
                    X.CFK.A0A(r0, r1, r2)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                Lac:
                    r0 = move-exception
                    throw r0
                Lae:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapMarkerImageProvider.AnonymousClass4.AnonymousClass1.emit(com.facebook.aura.maps.cache.HatchPlaceImageState, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchPlaceImageState) obj, (HtJ<? super Unit>) htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C1BN<? extends HatchPlaceImageState> c1bn, HatchMapMarkerImageProvider hatchMapMarkerImageProvider, String str, Request request, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$imageState = c1bn;
            this.this$0 = hatchMapMarkerImageProvider;
            this.$identifier = str;
            this.$request = request;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$imageState, this.this$0, this.$identifier, this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        C1BN<HatchPlaceImageState> c1bn = this.$imageState;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$identifier, this.$request);
                        this.label = 1;
                        if (c1bn.collect(anonymousClass1, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    throw C3cG.A0p();
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    this.this$0.observingIdentifiers.remove(this.$identifier);
                    this.this$0.callbacks.remove(this.$identifier);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th) {
                this.this$0.observingIdentifiers.remove(this.$identifier);
                this.this$0.callbacks.remove(this.$identifier);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchMapMarkerImageProvider(HatchSharedPlaceImageProvider hatchSharedPlaceImageProvider) {
        C7384Etj.A0Y(hatchSharedPlaceImageProvider, 0);
        this.placeImageProvider = hatchSharedPlaceImageProvider;
        Ey9<HatchMapDisplayMode> entries = HatchMapDisplayMode.getEntries();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(entries));
        for (HatchMapDisplayMode hatchMapDisplayMode : entries) {
            linkedHashMapA15.put(hatchMapDisplayMode, new HatchMapMarkerRenderer(hatchMapDisplayMode));
        }
        this.renderers = linkedHashMapA15;
        this.images = C60O.A1C();
        this.imageSources = C60O.A1C();
        this.fallbackImages = C60O.A1C();
        this.callbacks = C60O.A1C();
        this.observingIdentifiers = ConcurrentHashMap.newKeySet();
        this.scope = C78W.A05(new C8eO(null), AuraDispatchers.mainImmediate);
    }

    @Override // com.meta.maps.display.ImageProvider
    public void getImage(String str, ImageProvider.ImageCallback imageCallback) {
        HatchPlaceImageState.Loaded loaded;
        AnonymousClass003.A0u(str, imageCallback);
        final Request request = parse(str);
        if (request != null) {
            this.callbacks.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.maps.HatchMapMarkerImageProvider.getImage.1
                @Override // java.util.function.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return ConcurrentHashMap.newKeySet();
                }

                public final Set<ImageProvider.ImageCallback> apply(String str2) {
                    return ConcurrentHashMap.newKeySet();
                }
            }).add(imageCallback);
            C1BN<HatchPlaceImageState> c1bnObserveImage = this.placeImageProvider.observeImage(request.imageKey);
            Image imageRenderPhoto = this.images.get(str);
            if (imageRenderPhoto == null) {
                HatchPlaceImageState value = c1bnObserveImage != null ? c1bnObserveImage.getValue() : null;
                if (!(value instanceof HatchPlaceImageState.Loaded) || (loaded = (HatchPlaceImageState.Loaded) value) == null || (imageRenderPhoto = renderPhoto(str, request, loaded.bitmap)) == null) {
                    Image imageComputeIfAbsent = this.fallbackImages.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.maps.HatchMapMarkerImageProvider.getImage.3
                        @Override // java.util.function.Function
                        public final Image apply(String str2) {
                            HatchMapMarkerImageProvider hatchMapMarkerImageProvider = HatchMapMarkerImageProvider.this;
                            Request request2 = request;
                            return hatchMapMarkerImageProvider.useAsImage(request2.renderer.render(request2.isSelected, request2.isDarkMode, null), request);
                        }
                    });
                    C7384Etj.A0U(imageComputeIfAbsent);
                    imageRenderPhoto = imageComputeIfAbsent;
                }
            }
            imageCallback.apply(imageRenderPhoto);
            if (this.observingIdentifiers.add(str)) {
                if (c1bnObserveImage != null) {
                    AnonymousClass001.A1J(new AnonymousClass4(c1bnObserveImage, this, str, request, null), this.scope);
                } else {
                    this.observingIdentifiers.remove(str);
                    this.callbacks.remove(str);
                }
            }
        }
    }

    @Override // com.meta.maps.display.ImageProvider
    public boolean match(String str) {
        C7384Etj.A0Y(str, 0);
        return parse(str) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r6.equals("unselected") == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.maps.HatchMapMarkerImageProvider.Request parse(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r1 = "hatch-pin:"
            r5 = 0
            r7 = 2
            r3 = 0
            boolean r0 = X.AnonymousClass005.A1a(r9, r1)
            if (r0 != 0) goto Lc
            return r3
        Lc:
            java.lang.String r2 = X.C7BY.A0K(r1, r9)
            r4 = 1
            char[] r1 = new char[r4]
            r0 = 58
            r1[r5] = r0
            java.util.List r6 = X.C7BY.A0g(r2, r1)
            int r1 = r6.size()
            r0 = 3
            if (r1 >= r0) goto L23
            return r3
        L23:
            java.util.List r1 = X.AbstractC0878AGe.A0d(r6, r7)
            java.lang.String r0 = ":"
            java.lang.String r2 = X.AbstractC06907md.A01(r0, r1, r3)
            int r0 = r2.length()
            if (r0 <= 0) goto L9c
            int r0 = X.C60O.A00(r6)
            int r0 = r0 - r4
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "dark"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9b
            r4 = 0
        L4d:
            java.lang.Object r6 = X.AbstractC0878AGe.A0H(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r1 = r6.hashCode()
            r0 = -1577166796(0xffffffffa1fe5834, float:-1.7235057E-18)
            if (r1 == r0) goto L92
            r0 = -705062723(0xffffffffd5f998bd, float:-3.43043002E13)
            if (r1 == r0) goto L87
            r0 = 1915469791(0x722bbfdf, float:3.4018493E30)
            if (r1 != r0) goto L9a
            java.lang.String r0 = "selected_fullscreen"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9a
            com.facebook.aura.maps.HatchMapDisplayMode r3 = com.facebook.aura.maps.HatchMapDisplayMode.FULLSCREEN
        L70:
            r5 = 1
        L71:
            java.util.Map<com.facebook.aura.maps.HatchMapDisplayMode, com.facebook.aura.maps.HatchMapMarkerRenderer> r1 = r8.renderers
            if (r3 != 0) goto L77
            com.facebook.aura.maps.HatchMapDisplayMode r3 = com.facebook.aura.maps.HatchMapDisplayMode.INLINE
        L77:
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            java.lang.Object r1 = X.AbstractC2258BHp.A0L(r3, r1)
            com.facebook.aura.maps.HatchMapMarkerRenderer r1 = (com.facebook.aura.maps.HatchMapMarkerRenderer) r1
            com.facebook.aura.maps.HatchMapMarkerImageProvider$Request r0 = new com.facebook.aura.maps.HatchMapMarkerImageProvider$Request
            r0.<init>(r2, r4, r5, r1)
            return r0
        L87:
            java.lang.String r0 = "selected_inline"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9a
            com.facebook.aura.maps.HatchMapDisplayMode r3 = com.facebook.aura.maps.HatchMapDisplayMode.INLINE
            goto L70
        L92:
            java.lang.String r0 = "unselected"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L71
        L9a:
            return r3
        L9b:
            return r3
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapMarkerImageProvider.parse(java.lang.String):com.facebook.aura.maps.HatchMapMarkerImageProvider$Request");
    }

    private final Image renderPhoto(String str, Request request, Bitmap bitmap) {
        try {
            Image imageUseAsImage = useAsImage(request.renderer.render(request.isSelected, request.isDarkMode, bitmap), request);
            this.images.put(str, imageUseAsImage);
            this.imageSources.put(str, bitmap);
            return imageUseAsImage;
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Marker photo render failed for ", str), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image useAsImage(Bitmap bitmap, Request request) {
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
        int i = 0;
        for (int i2 = 0; i2 < width; i2++) {
            int i3 = iArr[i2];
            bArr[i] = (byte) ((i3 >> 16) & 255);
            bArr[i + 1] = (byte) ((i3 >> 8) & 255);
            int i4 = i + 3;
            bArr[i + 2] = (byte) (i3 & 255);
            i += 4;
            bArr[i4] = (byte) ((i3 >> 24) & 255);
        }
        Image image = new Image(bitmap.getWidth(), bitmap.getHeight(), 4L, 2.0f, bArr);
        bitmap.recycle();
        return image;
    }

    public final void close() {
        Hxb.A03(null, this.scope);
        this.callbacks.clear();
        this.observingIdentifiers.clear();
        this.images.clear();
        this.imageSources.clear();
        this.fallbackImages.clear();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
