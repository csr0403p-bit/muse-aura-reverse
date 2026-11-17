package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C16n;
import X.C3cG;
import X.C6O2;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class SpaceHomeScreenWidget implements HomeScreenWidget {
    public static final int $stable = 0;
    public static final String key = "space";
    public static final Class<SpaceWidgetReceiver> receiver = SpaceWidgetReceiver.class;
    public static final SpaceHomeScreenWidget INSTANCE = new SpaceHomeScreenWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.SPACE;
    public static final List<Class<?>> components = Arrays.asList(SpaceWidgetReceiver.class, SpaceWidgetConfigureActivity.class);
    public static final long previewSize = C16n.A00(330.0f, 360.0f);

    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$Preview$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceHomeScreenWidget.this.Preview(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$clear$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            C6O2.A00(c6o2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C6O2.A00(c6o2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceHomeScreenWidget", f = "SpaceHomeScreenWidget.kt", l = {55, 56, 63, 72}, m = "reconcile", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$reconcile$1, reason: invalid class name and case insensitive filesystem */
    public final class C143991 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C143991(HtJ<? super C143991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceHomeScreenWidget.this.reconcile(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceHomeScreenWidget", f = "SpaceHomeScreenWidget.kt", l = {78, 79}, m = "refreshIfStale", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$1, reason: invalid class name and case insensitive filesystem */
    public final class C144001 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C144001(HtJ<? super C144001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceHomeScreenWidget.this.refreshIfStale(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceHomeScreenWidget", f = "SpaceHomeScreenWidget.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, 50}, m = "showSignedOut", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C144011 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C144011(HtJ<? super C144011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceHomeScreenWidget.this.showSignedOut(null, this);
        }
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void cancelWork(Context context) {
        C7384Etj.A0Y(context, 0);
        SpaceWidgetRefreshWorker.Companion.cancelAll(context);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void deleteFiles(Context context) {
        C7384Etj.A0Y(context, 0);
        SpaceWidgetStore.INSTANCE.deleteAllSnapshots(context);
    }

    /* renamed from: com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$2, reason: invalid class name and case insensitive filesystem */
    public final class C144022 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C144022 INSTANCE = new C144022();

        public C144022() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C6O2.A00(c6o2);
            c6o2.A08(SpaceWidgetStore.SIGNED_OUT, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object clear(Context context, HtJ<? super Unit> htJ) {
        return C3cG.A0U(SpaceWidgetStore.INSTANCE.editAll(context, AnonymousClass2.INSTANCE, htJ));
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public List<Class<?>> getComponents() {
        return components;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public String getKey() {
        return key;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public HatchWidgetKind getKind() {
        return kind;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /* renamed from: getPreviewSize-MYxV2XQ */
    public long mo3155getPreviewSizeMYxV2XQ() {
        return previewSize;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Class<SpaceWidgetReceiver> getReceiver() {
        return receiver;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public /* bridge */ boolean isAvailable() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (X.C3cG.A1P(r1.A06(com.facebook.aura.widgets.SpaceWidgetStore.SIGNED_OUT), true) == false) goto L16;
     */
    /* JADX WARN: Path cross not found for [B:24:0x008d, B:33:0x00cb], limit reached: 51 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d6 -> B:16:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0114 -> B:14:0x003c). Please report as a decompilation issue!!! */
    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object reconcile(android.content.Context r13, java.lang.String r14, boolean r15, X.HtJ<? super kotlin.Unit> r16) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceHomeScreenWidget.reconcile(android.content.Context, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object refreshIfStale(android.content.Context r8, long r9, X.HtJ<? super kotlin.Unit> r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.SpaceHomeScreenWidget.C144001
            if (r0 == 0) goto L7e
            r4 = r11
            com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$1 r4 = (com.facebook.aura.widgets.SpaceHomeScreenWidget.C144001) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L5d
            if (r0 == r1) goto L6f
            if (r0 != r5) goto L87
            long r9 = r4.J$0
            java.lang.Object r7 = r4.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r0 = r4.L$0
            android.content.Context r8 = X.C60P.A02(r0, r2)
        L2c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r7.next()
            int r3 = X.AnonymousClass001.A0F(r0)
            java.lang.String r0 = "refresh Space widget "
            java.lang.String r2 = X.FGI.A0H(r0, r3)
            r0 = 0
            com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$2$1 r1 = new com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$2$1
            r1.<init>(r8, r3, r0)
            r4.L$0 = r8
            r4.L$1 = r0
            r4.L$2 = r7
            r4.L$3 = r0
            r4.J$0 = r9
            r4.I$0 = r3
            r4.label = r5
            java.lang.String r0 = "SpaceHomeScreenWidget"
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r0, r2, r1, r4)
            if (r0 != r6) goto L2c
            return r6
        L5d:
            X.Hwg.A00(r2)
            com.facebook.aura.widgets.SpaceWidgetRefresher r0 = com.facebook.aura.widgets.SpaceWidgetRefresher.INSTANCE
            r4.L$0 = r8
            r4.J$0 = r9
            r4.label = r1
            java.lang.Object r2 = r0.staleWidgetIds(r8, r9, r4)
            if (r2 != r6) goto L77
            return r6
        L6f:
            long r9 = r4.J$0
            java.lang.Object r0 = r4.L$0
            android.content.Context r8 = X.C60P.A02(r0, r2)
        L77:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r7 = r2.iterator()
            goto L2c
        L7e:
            com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$1 r4 = new com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$1
            r4.<init>(r11)
            goto L12
        L84:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L87:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceHomeScreenWidget.refreshIfStale(android.content.Context, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object showSignedOut(android.content.Context r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.widgets.SpaceHomeScreenWidget.C144011
            if (r0 == 0) goto L4f
            r5 = r8
            com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$1 r5 = (com.facebook.aura.widgets.SpaceHomeScreenWidget.C144011) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L38
            if (r0 != r3) goto L55
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.widgets.SpaceWidgetStore r1 = com.facebook.aura.widgets.SpaceWidgetStore.INSTANCE
            com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$2 r0 = com.facebook.aura.widgets.SpaceHomeScreenWidget.C144022.INSTANCE
            r5.L$0 = r7
            r5.label = r2
            java.lang.Object r0 = r1.editAll(r7, r0, r5)
            if (r0 != r4) goto L3e
            return r4
        L38:
            java.lang.Object r0 = r5.L$0
            android.content.Context r7 = X.C60P.A02(r0, r1)
        L3e:
            com.facebook.aura.widgets.SpaceWidget r1 = new com.facebook.aura.widgets.SpaceWidget
            r1.<init>()
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = androidx.glance.appwidget.GlanceAppWidgetKt.A00(r7, r1, r5)
            if (r0 != r4) goto L23
            return r4
        L4f:
            com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$1 r5 = new com.facebook.aura.widgets.SpaceHomeScreenWidget$showSignedOut$1
            r5.<init>(r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceHomeScreenWidget.showSignedOut(android.content.Context, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void Preview(BFM bfm, int i) {
        bfm.AgG(-1845902717);
        int i2 = i & 1;
        if (bfm.AfS(i2, AnonymousClass002.A1L(i2))) {
            SpaceWidgetKt.SpaceWidgetPreview(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }
}
