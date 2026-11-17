package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C6JZ;
import X.C6PE;
import X.C6PP;
import X.C6yr;
import X.C7384Etj;
import X.CFK;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ListWidgetStore {
    public final WidgetFileStore icons;
    public final Function0<GlanceAppWidget> newGlanceWidget;
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetFileStore.$stable;
    public static final C6JZ<String> ITEMS = new C6JZ<>(ConnectorOrderCheckoutKt.ITEMS_KEY);
    public static final C6JZ<Long> UPDATED_AT_MS = new C6JZ<>("updated_at_ms");
    public static final C6JZ<Boolean> REFRESHING = new C6JZ<>("refreshing");
    public static final C6JZ<Boolean> SIGNED_OUT = new C6JZ<>(WidgetSessionReconcileWorkerKt.KEY_SIGNED_OUT);
    public static final C6JZ<String> VM_URL = new C6JZ<>("vm_url");

    public final class Companion {
        public final C6JZ<String> getITEMS() {
            return ListWidgetStore.ITEMS;
        }

        public final C6JZ<Boolean> getREFRESHING() {
            return ListWidgetStore.REFRESHING;
        }

        public final C6JZ<Boolean> getSIGNED_OUT() {
            return ListWidgetStore.SIGNED_OUT;
        }

        public final C6JZ<Long> getUPDATED_AT_MS() {
            return ListWidgetStore.UPDATED_AT_MS;
        }

        public final C6JZ<String> getVM_URL() {
            return ListWidgetStore.VM_URL;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetStore", f = "ListWidgetStore.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop, 40, 42}, m = "editAll", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetStore$editAll$1, reason: invalid class name */
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
            return ListWidgetStore.this.editAll(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetStore", f = "ListWidgetStore.kt", l = {71}, m = "saveIcon", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetStore$saveIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C143971 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C143971(HtJ<? super C143971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidgetStore.this.saveIcon(null, null, 0, null, 0L, this);
        }
    }

    public final void deleteAllIcons(Context context) {
        C7384Etj.A0Y(context, 0);
        this.icons.deleteAll(context);
    }

    public final String encodeItems(List<ListWidgetItemJson> list) {
        C7384Etj.A0Y(list, 0);
        return HatchJsonKt.HatchJson.A02(list, C3cG.A19(ListWidgetItemJson$$serializer.INSTANCE));
    }

    public final List<ListWidgetItemJson> decodeItems(String str) {
        if (str != null) {
            try {
                return (List) HatchJsonKt.HatchJson.A00(str, C3cG.A19(ListWidgetItemJson$$serializer.INSTANCE));
            } catch (SerializationException | IllegalArgumentException e) {
                CFK.A0A(ListWidgetStoreKt.TAG, "Dropping unreadable widget items", e);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object editAll(android.content.Context r9, X.G0U<? super X.C6O2, kotlin.Unit> r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.ListWidgetStore.AnonymousClass1
            if (r0 == 0) goto L9c
            r5 = r11
            com.facebook.aura.widgets.ListWidgetStore$editAll$1 r5 = (com.facebook.aura.widgets.ListWidgetStore.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r6 = 3
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L39
            if (r1 == r7) goto L4a
            if (r1 != r6) goto La3
            X.Hwg.A00(r2)
        L26:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L29:
            X.Hwg.A00(r2)
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r0
            java.lang.Object r2 = r8.glanceIds(r9, r5)
            if (r2 != r4) goto L43
            return r4
        L39:
            java.lang.Object r10 = r5.L$1
            X.G0U r10 = (X.G0U) r10
            java.lang.Object r0 = r5.L$0
            android.content.Context r9 = X.C60P.A02(r0, r2)
        L43:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
            goto L58
        L4a:
            java.lang.Object r3 = r5.L$3
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r10 = r5.L$1
            X.G0U r10 = (X.G0U) r10
            java.lang.Object r0 = r5.L$0
            android.content.Context r9 = X.C60P.A02(r0, r2)
        L58:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r3.next()
            X.6PP r1 = (X.C6PP) r1
            com.facebook.aura.widgets.ListWidgetStore$editAll$2$1 r0 = new com.facebook.aura.widgets.ListWidgetStore$editAll$2$1
            r0.<init>(r10, r2)
            r5.L$0 = r9
            r5.L$1 = r10
            r5.L$2 = r2
            r5.L$3 = r3
            r5.L$4 = r2
            r5.L$5 = r2
            r5.label = r7
            java.lang.Object r0 = X.C6yr.A01(r9, r1, r5, r0)
            if (r0 != r4) goto L58
            return r4
        L7f:
            kotlin.jvm.functions.Function0<androidx.glance.appwidget.GlanceAppWidget> r0 = r8.newGlanceWidget
            java.lang.Object r0 = r0.invoke()
            androidx.glance.appwidget.GlanceAppWidget r0 = (androidx.glance.appwidget.GlanceAppWidget) r0
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r2
            r5.L$3 = r2
            r5.L$4 = r2
            r5.L$5 = r2
            r5.label = r6
            java.lang.Object r0 = androidx.glance.appwidget.GlanceAppWidgetKt.A00(r9, r0, r5)
            if (r0 != r4) goto L26
            return r4
        L9c:
            com.facebook.aura.widgets.ListWidgetStore$editAll$1 r5 = new com.facebook.aura.widgets.ListWidgetStore$editAll$1
            r5.<init>(r11)
            goto L12
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetStore.editAll(android.content.Context, X.G0U, X.HtJ):java.lang.Object");
    }

    public final Object glanceIds(Context context, HtJ<? super List<? extends C6PP>> htJ) {
        return new GlanceAppWidgetManager(context).A01(this.newGlanceWidget.invoke().getClass(), htJ);
    }

    public final long iconGeneration() {
        return this.icons.generation();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveIcon(android.content.Context r15, java.lang.String r16, int r17, android.graphics.Bitmap r18, long r19, X.HtJ<? super java.lang.String> r21) {
        /*
            r14 = this;
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.widgets.ListWidgetStore.C143971
            if (r0 == 0) goto L60
            r13 = r3
            com.facebook.aura.widgets.ListWidgetStore$saveIcon$1 r13 = (com.facebook.aura.widgets.ListWidgetStore.C143971) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r13.label = r2
        L14:
            java.lang.Object r1 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L66
            java.lang.Object r7 = r13.L$4
            X.Hwg.A00(r1)
        L24:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L2b
            r7 = 0
        L2b:
            return r7
        L2c:
            X.Hwg.A00(r1)
            java.lang.String r1 = "/icon_"
            java.lang.String r0 = ".png"
            r4 = r17
            r5 = r16
            java.lang.String r7 = X.FGI.A0X(r5, r1, r0, r4)
            com.facebook.aura.widgets.WidgetFileStore r5 = r14.icons
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r0
            r13.L$4 = r7
            r13.L$5 = r0
            r13.I$0 = r4
            r11 = r19
            r13.J$0 = r11
            r13.label = r2
            r10 = 100
            r6 = r15
            r8 = r18
            java.lang.Object r1 = r5.save(r6, r7, r8, r9, r10, r11, r13)
            if (r1 != r3) goto L24
            return r3
        L60:
            com.facebook.aura.widgets.ListWidgetStore$saveIcon$1 r13 = new com.facebook.aura.widgets.ListWidgetStore$saveIcon$1
            r13.<init>(r3)
            goto L14
        L66:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetStore.saveIcon(android.content.Context, java.lang.String, int, android.graphics.Bitmap, long, X.HtJ):java.lang.Object");
    }

    public final Object state(Context context, C6PP c6pp, HtJ<? super Preferences> htJ) {
        return C6yr.A00(context, c6pp, C6PE.A00, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListWidgetStore(String str, Function0<? extends GlanceAppWidget> function0) {
        AnonymousClass003.A0u(str, function0);
        this.newGlanceWidget = function0;
        this.icons = new WidgetFileStore(str);
    }

    public final void deleteIconsExcept(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        this.icons.deleteAllExcept(context, str);
    }

    public final Bitmap loadIcon(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return this.icons.load(context, str);
    }
}
