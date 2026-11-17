package com.meta.maps.display;

import X.AbstractC07127nr;
import X.AbstractC9266GBt;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.ETi;
import X.FGI;
import X.G0V;
import X.GBK;
import X.HlU;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.util.Log;
import com.meta.maps.core.MapsSdkProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.LibraryLoader;
import org.maplibre.android.MapLibre;

/* loaded from: classes4.dex */
public abstract class MapsSdkProviderMapLibreExtKt {
    public static final String TAG = "MapsSDKMapLibre";
    public static boolean _libraryLoaderSet;

    @DebugMetadata(c = "com.meta.maps.display.MapsSdkProviderMapLibreExtKt", f = "MapsSdkProviderMapLibreExt.kt", l = {33, 40}, m = "initMapLibre", v = 2)
    /* renamed from: com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$1, reason: invalid class name and case insensitive filesystem */
    public final class C144421 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapsSdkProviderMapLibreExtKt.initMapLibre(null, null, null, this);
        }

        public C144421(HtJ<? super C144421> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$2", f = "MapsSdkProviderMapLibreExt.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MapsSdkProvider.Companion $this_initMapLibre;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapsSdkProvider.Companion companion, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$this_initMapLibre = companion;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$this_initMapLibre, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$this_initMapLibre, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$this_initMapLibre.loadLibrary();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$3", f = "MapsSdkProviderMapLibreExt.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super MapLibre>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super MapLibre> htJ) {
            return new AnonymousClass3(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return MapLibre.getInstance(this.$context);
        }
    }

    public static final synchronized boolean ensureLibraryLoaderSet() {
        if (_libraryLoaderSet) {
            return false;
        }
        _libraryLoaderSet = true;
        LibraryLoader.setLibraryLoader(new LibraryLoader() { // from class: com.meta.maps.display.MapsSdkProviderMapLibreExtKt.ensureLibraryLoaderSet.1
            public void load(String str) {
                C7384Etj.A0Y(str, 0);
                ETi.loadLibraryUnsafe(str);
                SdkModule.INSTANCE.ensureLoaded();
                Log.w(MapsSdkProviderMapLibreExtKt.TAG, FGI.A0U("Loading MapLibre ", str, " again, which should've been loaded with MapsSDK."));
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object initMapLibre(com.meta.maps.core.MapsSdkProvider.Companion r8, android.content.Context r9, X.GBK r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof com.meta.maps.display.MapsSdkProviderMapLibreExtKt.C144421
            if (r0 == 0) goto L7c
            r4 = r11
            com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$1 r4 = (com.meta.maps.display.MapsSdkProviderMapLibreExtKt.C144421) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            java.lang.String r6 = "MapsSDKMapLibre"
            r7 = 1
            r5 = 0
            r2 = 2
            if (r0 == 0) goto L29
            if (r0 == r7) goto L51
            if (r0 != r2) goto L82
            X.Hwg.A00(r1)
        L26:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L29:
            X.Hwg.A00(r1)
            boolean r0 = ensureLibraryLoaderSet()
            if (r0 == 0) goto L58
            java.lang.String r0 = "Initializing MapsSDK with MapLibre..."
            android.util.Log.i(r6, r0)
            com.meta.maps.display.SdkModule r1 = com.meta.maps.display.SdkModule.INSTANCE
            r0 = 0
            r8.register(r1, r0)
            com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$2 r0 = new com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$2
            r0.<init>(r8, r5)
            r4.L$0 = r5
            r4.L$1 = r9
            r4.L$2 = r5
            r4.label = r7
            java.lang.Object r0 = X.GAo.A00(r4, r10, r0)
            if (r0 != r3) goto L58
            return r3
        L51:
            java.lang.Object r9 = r4.L$1
            android.content.Context r9 = (android.content.Context) r9
            X.Hwg.A00(r1)
        L58:
            boolean r0 = org.maplibre.android.MapLibre.hasInstance()
            if (r0 == 0) goto L64
            java.lang.String r0 = "MapLibre Android SDK is already loaded."
            android.util.Log.w(r6, r0)
            goto L26
        L64:
            X.GBK r0 = X.AbstractC9266GBt.A00
            X.GB9 r1 = X.AbstractC7429Evm.A00
            com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$3 r0 = new com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$3
            r0.<init>(r9, r5)
            r4.L$0 = r5
            r4.L$1 = r5
            r4.L$2 = r5
            r4.label = r2
            java.lang.Object r0 = X.GAo.A00(r4, r1, r0)
            if (r0 != r3) goto L26
            return r3
        L7c:
            com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$1 r4 = new com.meta.maps.display.MapsSdkProviderMapLibreExtKt$initMapLibre$1
            r4.<init>(r11)
            goto L12
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.display.MapsSdkProviderMapLibreExtKt.initMapLibre(com.meta.maps.core.MapsSdkProvider$Companion, android.content.Context, X.GBK, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object initMapLibre$default(MapsSdkProvider.Companion companion, Context context, GBK gbk, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            GBK gbk2 = AbstractC9266GBt.A00;
            gbk = HlU.A01;
        }
        return initMapLibre(companion, context, gbk, htJ);
    }

    public static final boolean isMapLibreLoaded(MapsSdkProvider.Companion companion) {
        return MapLibre.hasInstance();
    }
}
