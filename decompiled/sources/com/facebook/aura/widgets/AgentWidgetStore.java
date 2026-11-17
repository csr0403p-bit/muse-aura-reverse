package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.C06H;
import X.C6JZ;
import X.C6PE;
import X.C6PP;
import X.C6yr;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class AgentWidgetStore {
    public final WidgetFileStore avatars;
    public final Function0<GlanceAppWidget> newGlanceWidget;
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetFileStore.$stable;
    public static final C6JZ<String> NAME = new C6JZ<>("name");
    public static final C6JZ<String> AVATAR_SOURCE = new C6JZ<>("avatar_source");
    public static final C6JZ<String> AVATAR_FILE = new C6JZ<>("avatar_file");
    public static final C6JZ<Boolean> SIGNED_OUT = new C6JZ<>(WidgetSessionReconcileWorkerKt.KEY_SIGNED_OUT);
    public static final C6JZ<String> TABS = new C6JZ<>("tabs");
    public static final C6JZ<Boolean> CALL_SUPPORTED = new C6JZ<>("call_supported");

    public final class Companion {
        public final C6JZ<String> getAVATAR_FILE() {
            return AgentWidgetStore.AVATAR_FILE;
        }

        public final C6JZ<String> getAVATAR_SOURCE() {
            return AgentWidgetStore.AVATAR_SOURCE;
        }

        public final C6JZ<Boolean> getCALL_SUPPORTED() {
            return AgentWidgetStore.CALL_SUPPORTED;
        }

        public final C6JZ<String> getNAME() {
            return AgentWidgetStore.NAME;
        }

        public final C6JZ<Boolean> getSIGNED_OUT() {
            return AgentWidgetStore.SIGNED_OUT;
        }

        public final C6JZ<String> getTABS() {
            return AgentWidgetStore.TABS;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetStore", f = "AgentWidgetStore.kt", l = {33, 34, 36}, m = "editAll", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetStore$editAll$1, reason: invalid class name */
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
            return AgentWidgetStore.this.editAll(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetStore", f = "AgentWidgetStore.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "saveAvatar", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetStore$saveAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C143711 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C143711(HtJ<? super C143711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentWidgetStore.this.saveAvatar(null, null, null, 0L, this);
        }
    }

    public final void deleteAllAvatars(Context context) {
        C7384Etj.A0Y(context, 0);
        this.avatars.deleteAll(context);
    }

    public final long avatarGeneration() {
        return this.avatars.generation();
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
            boolean r0 = r11 instanceof com.facebook.aura.widgets.AgentWidgetStore.AnonymousClass1
            if (r0 == 0) goto L9c
            r5 = r11
            com.facebook.aura.widgets.AgentWidgetStore$editAll$1 r5 = (com.facebook.aura.widgets.AgentWidgetStore.AnonymousClass1) r5
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
            com.facebook.aura.widgets.AgentWidgetStore$editAll$2$1 r0 = new com.facebook.aura.widgets.AgentWidgetStore$editAll$2$1
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
            com.facebook.aura.widgets.AgentWidgetStore$editAll$1 r5 = new com.facebook.aura.widgets.AgentWidgetStore$editAll$1
            r5.<init>(r11)
            goto L12
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AgentWidgetStore.editAll(android.content.Context, X.G0U, X.HtJ):java.lang.Object");
    }

    public final Object glanceIds(Context context, HtJ<? super List<? extends C6PP>> htJ) {
        return new GlanceAppWidgetManager(context).A01(this.newGlanceWidget.invoke().getClass(), htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveAvatar(android.content.Context r13, java.lang.String r14, android.graphics.Bitmap r15, long r16, X.HtJ<? super java.lang.String> r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.widgets.AgentWidgetStore.C143711
            if (r0 == 0) goto L53
            r11 = r3
            com.facebook.aura.widgets.AgentWidgetStore$saveAvatar$1 r11 = (com.facebook.aura.widgets.AgentWidgetStore.C143711) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L59
            java.lang.Object r5 = r11.L$3
            X.Hwg.A00(r3)
        L24:
            boolean r0 = X.AnonymousClass001.A1X(r3)
            if (r0 != 0) goto L2b
            r5 = 0
        L2b:
            return r5
        L2c:
            X.Hwg.A00(r3)
            java.lang.String r0 = "/avatar.png"
            java.lang.String r5 = X.FGI.A0M(r14, r0)
            com.facebook.aura.widgets.WidgetFileStore r3 = r12.avatars
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.L$3 = r5
            r9 = r16
            r11.J$0 = r9
            r11.label = r1
            r8 = 100
            r4 = r13
            r6 = r15
            java.lang.Object r3 = r3.save(r4, r5, r6, r7, r8, r9, r11)
            if (r3 != r2) goto L24
            return r2
        L53:
            com.facebook.aura.widgets.AgentWidgetStore$saveAvatar$1 r11 = new com.facebook.aura.widgets.AgentWidgetStore$saveAvatar$1
            r11.<init>(r3)
            goto L14
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AgentWidgetStore.saveAvatar(android.content.Context, java.lang.String, android.graphics.Bitmap, long, X.HtJ):java.lang.Object");
    }

    public final Object state(Context context, C6PP c6pp, HtJ<? super Preferences> htJ) {
        return C6yr.A00(context, c6pp, C6PE.A00, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgentWidgetStore(String str, Function0<? extends GlanceAppWidget> function0) {
        AnonymousClass003.A0u(str, function0);
        this.newGlanceWidget = function0;
        this.avatars = new WidgetFileStore(str);
    }

    public final void deleteAvatarsExcept(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        this.avatars.deleteAllExcept(context, str);
    }

    public final Bitmap loadAvatar(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return this.avatars.load(context, str);
    }
}
