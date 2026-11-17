package com.facebook.aura.widgets;

import X.Ab3;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6JZ;
import X.C6O2;
import X.C6PE;
import X.C6PP;
import X.C6vW;
import X.C6yr;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceWidgetStore {
    public static final int $stable = 0;
    public static final SpaceWidgetStore INSTANCE = new SpaceWidgetStore();
    public static final C6JZ<String> SLUG = new C6JZ<>(SpaceShareUiCommandsKt.SPACE_SLUG_PARAM);
    public static final C6JZ<String> TITLE = new C6JZ<>("space_title");
    public static final C6JZ<Long> UPDATED_AT_MS = new C6JZ<>("updated_at_ms");
    public static final C6JZ<Boolean> REFRESHING = new C6JZ<>("refreshing");
    public static final C6JZ<Boolean> UNAVAILABLE = new C6JZ<>("unavailable");
    public static final C6JZ<Integer> SNAPSHOT_WIDTH_PX = new C6JZ<>("snapshot_width_px");
    public static final C6JZ<Integer> SNAPSHOT_HEIGHT_PX = new C6JZ<>("snapshot_height_px");
    public static final C6JZ<Boolean> SIGNED_OUT = new C6JZ<>(WidgetSessionReconcileWorkerKt.KEY_SIGNED_OUT);
    public static final C6JZ<String> VM_URL = new C6JZ<>("vm_url");
    public static final WidgetFileStore snapshots = new WidgetFileStore(SpaceWidgetStoreKt.SNAPSHOT_DIR);
    public static final ConcurrentHashMap<Integer, LoadedSnapshot> loadedSnapshots = C60O.A1C();

    public final class LoadedSnapshot {
        public final WeakReference<Bitmap> bitmap;
        public final Long updatedAtMs;

        public LoadedSnapshot(Long l, WeakReference<Bitmap> weakReference) {
            C7384Etj.A0Y(weakReference, 1);
            this.updatedAtMs = l;
            this.bitmap = weakReference;
        }

        public final WeakReference<Bitmap> getBitmap() {
            return this.bitmap;
        }

        public final Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetStore$edit$2", f = "SpaceWidgetStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetStore$edit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<C6O2, Unit> $block;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super C6O2, Unit> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$block.invoke(obj2);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetStore", f = "SpaceWidgetStore.kt", l = {60, 61}, m = "editAll", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetStore$editAll$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetStore.this.editAll(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetStore", f = "SpaceWidgetStore.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, 73}, m = "saveSnapshot", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C144181 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C144181(HtJ<? super C144181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetStore.this.saveSnapshot(null, 0, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$2", f = "SpaceWidgetStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$2, reason: invalid class name and case insensitive filesystem */
    public final class C144192 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144192(Bitmap bitmap, Context context, HtJ<? super C144192> htJ) {
            super(2, htJ);
            this.$bitmap = bitmap;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C144192(this.$bitmap, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return SpaceWidgetStore.INSTANCE.fitWidgetBitmapLimit(this.$bitmap, this.$context);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((C144192) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void deleteAllSnapshots(Context context) {
        C7384Etj.A0Y(context, 0);
        loadedSnapshots.clear();
        snapshots.deleteAll(context);
    }

    public final void deleteSnapshot(Context context, int i) {
        C7384Etj.A0Y(context, 0);
        loadedSnapshots.remove(Integer.valueOf(i));
        snapshots.delete(context, FGI.A0I(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, i, AuraBugReportSender.DEFAULT_IMAGE_EXTENSION));
    }

    public final Object edit(Context context, C6PP c6pp, G0U<? super C6O2, Unit> g0u, HtJ<? super Unit> htJ) {
        return C3cG.A0U(C6yr.A01(context, c6pp, htJ, new AnonymousClass2(g0u, null)));
    }

    public final C6PP glanceId(Context context, int i) {
        C7384Etj.A0Y(context, 0);
        if (new GlanceAppWidgetManager(context).A00.getAppWidgetInfo(i) != null) {
            return new C6vW(i);
        }
        throw C60O.A0i("Invalid AppWidget ID.");
    }

    public final Bitmap loadSnapshot(Context context, int i, Long l) {
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap;
        C7384Etj.A0Y(context, 0);
        ConcurrentHashMap<Integer, LoadedSnapshot> concurrentHashMap = loadedSnapshots;
        Integer numValueOf = Integer.valueOf(i);
        LoadedSnapshot loadedSnapshot = concurrentHashMap.get(numValueOf);
        if (loadedSnapshot != null && C7384Etj.areEqual(loadedSnapshot.updatedAtMs, l) && (weakReference = loadedSnapshot.bitmap) != null && (bitmap = weakReference.get()) != null) {
            return bitmap;
        }
        Bitmap bitmapLoad = snapshots.load(context, FGI.A0I(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, i, AuraBugReportSender.DEFAULT_IMAGE_EXTENSION));
        if (bitmapLoad == null) {
            return null;
        }
        concurrentHashMap.put(numValueOf, new LoadedSnapshot(l, new WeakReference(bitmapLoad)));
        return bitmapLoad;
    }

    private final String snapshotPath(int i) {
        return FGI.A0I(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, i, AuraBugReportSender.DEFAULT_IMAGE_EXTENSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object editAll(android.content.Context r7, X.G0U<? super X.C6O2, kotlin.Unit> r8, X.HtJ<? super kotlin.Unit> r9) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.SpaceWidgetStore.AnonymousClass1
            if (r0 == 0) goto L7d
            r4 = r9
            com.facebook.aura.widgets.SpaceWidgetStore$editAll$1 r4 = (com.facebook.aura.widgets.SpaceWidgetStore.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L55
            if (r0 == r2) goto L6c
            if (r0 != r5) goto L86
            java.lang.Object r3 = r4.L$3
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r8 = r4.L$1
            X.G0U r8 = (X.G0U) r8
            java.lang.Object r0 = r4.L$0
            android.content.Context r7 = X.C60P.A02(r0, r1)
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r2 = r3.next()
            X.6PP r2 = (X.C6PP) r2
            r1 = 0
            com.facebook.aura.widgets.SpaceWidgetStore$editAll$2$1 r0 = new com.facebook.aura.widgets.SpaceWidgetStore$editAll$2$1
            r0.<init>(r8, r1)
            r4.L$0 = r7
            r4.L$1 = r8
            r4.L$2 = r1
            r4.L$3 = r3
            r4.L$4 = r1
            r4.L$5 = r1
            r4.label = r5
            java.lang.Object r0 = X.C6yr.A01(r7, r2, r4, r0)
            if (r0 != r6) goto L2e
            return r6
        L55:
            X.Hwg.A00(r1)
            androidx.glance.appwidget.GlanceAppWidgetManager r1 = new androidx.glance.appwidget.GlanceAppWidgetManager
            r1.<init>(r7)
            java.lang.Class<com.facebook.aura.widgets.SpaceWidget> r0 = com.facebook.aura.widgets.SpaceWidget.class
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r2
            java.lang.Object r1 = r1.A01(r0, r4)
            if (r1 != r6) goto L76
            return r6
        L6c:
            java.lang.Object r8 = r4.L$1
            X.G0U r8 = (X.G0U) r8
            java.lang.Object r0 = r4.L$0
            android.content.Context r7 = X.C60P.A02(r0, r1)
        L76:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r3 = r1.iterator()
            goto L2e
        L7d:
            com.facebook.aura.widgets.SpaceWidgetStore$editAll$1 r4 = new com.facebook.aura.widgets.SpaceWidgetStore$editAll$1
            r4.<init>(r9)
            goto L12
        L83:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L86:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetStore.editAll(android.content.Context, X.G0U, X.HtJ):java.lang.Object");
    }

    public final C6JZ<Boolean> getREFRESHING() {
        return REFRESHING;
    }

    public final C6JZ<Boolean> getSIGNED_OUT() {
        return SIGNED_OUT;
    }

    public final C6JZ<String> getSLUG() {
        return SLUG;
    }

    public final C6JZ<Integer> getSNAPSHOT_HEIGHT_PX() {
        return SNAPSHOT_HEIGHT_PX;
    }

    public final C6JZ<Integer> getSNAPSHOT_WIDTH_PX() {
        return SNAPSHOT_WIDTH_PX;
    }

    public final C6JZ<String> getTITLE() {
        return TITLE;
    }

    public final C6JZ<Boolean> getUNAVAILABLE() {
        return UNAVAILABLE;
    }

    public final C6JZ<Long> getUPDATED_AT_MS() {
        return UPDATED_AT_MS;
    }

    public final C6JZ<String> getVM_URL() {
        return VM_URL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveSnapshot(android.content.Context r18, int r19, android.graphics.Bitmap r20, long r21, X.HtJ<? super java.lang.Boolean> r23) {
        /*
            r17 = this;
            r6 = r19
            r15 = r21
            r3 = r23
            r10 = r18
            boolean r0 = r3 instanceof com.facebook.aura.widgets.SpaceWidgetStore.C144181
            if (r0 == 0) goto L2d
            r5 = r3
            com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$1 r5 = (com.facebook.aura.widgets.SpaceWidgetStore.C144181) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r5.label = r2
        L1a:
            java.lang.Object r12 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            if (r0 == r7) goto L69
            if (r0 != r3) goto L35
            X.Hwg.A00(r12)
            return r12
        L2d:
            com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$1 r5 = new com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$1
            r0 = r17
            r5.<init>(r3)
            goto L1a
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r12)
            com.facebook.aura.widgets.WidgetFileStore r9 = com.facebook.aura.widgets.SpaceWidgetStore.snapshots
            java.lang.String r1 = "space_"
            java.lang.String r0 = ".jpg"
            java.lang.String r11 = X.FGI.A0I(r1, r6, r0)
            X.78T r1 = X.C3cG.A0v()
            com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$2 r0 = new com.facebook.aura.widgets.SpaceWidgetStore$saveSnapshot$2
            r8 = r20
            r0.<init>(r8, r10, r2)
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r9
            r5.L$3 = r10
            r5.L$4 = r11
            r5.I$0 = r6
            r5.J$0 = r15
            r5.label = r7
            java.lang.Object r12 = X.GAo.A00(r5, r1, r0)
            if (r12 != r4) goto L7c
        L68:
            return r4
        L69:
            long r15 = r5.J$0
            int r6 = r5.I$0
            java.lang.Object r11 = r5.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r5.L$3
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r9 = r5.L$2
            com.facebook.aura.widgets.WidgetFileStore r9 = (com.facebook.aura.widgets.WidgetFileStore) r9
            X.Hwg.A00(r12)
        L7c:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r2
            r5.L$3 = r2
            r5.L$4 = r2
            r5.I$0 = r6
            r5.J$0 = r15
            r5.label = r3
            r14 = 90
            r17 = r5
            java.lang.Object r0 = r9.save(r10, r11, r12, r13, r14, r15, r17)
            if (r0 == r4) goto L68
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetStore.saveSnapshot(android.content.Context, int, android.graphics.Bitmap, long, X.HtJ):java.lang.Object");
    }

    public final long snapshotGeneration() {
        return snapshots.generation();
    }

    public final Object state(Context context, C6PP c6pp, HtJ<? super Preferences> htJ) {
        return C6yr.A00(context, c6pp, C6PE.A00, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap fitWidgetBitmapLimit(Bitmap bitmap, Context context) {
        long jAuraHeadlessContainerSize = AuraLayoutSizeKt.auraHeadlessContainerSize(context);
        long jA09 = ((((int) (jAuraHeadlessContainerSize >> 32)) * AnonymousClass002.A09(jAuraHeadlessContainerSize)) * 6) / 4;
        if (bitmap.getByteCount() <= jA09) {
            return bitmap;
        }
        double dSqrt = Math.sqrt(jA09 / bitmap.getByteCount());
        int iA00 = Ab3.A00(bitmap.getWidth() * dSqrt);
        if (iA00 < 1) {
            iA00 = 1;
        }
        int iA002 = Ab3.A00(bitmap.getHeight() * dSqrt);
        if (iA002 < 1) {
            iA002 = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iA00, iA002, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }
}
