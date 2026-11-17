package com.facebook.aura.widgets;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C3cG;
import X.C6O2;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class ListWidget implements HomeScreenWidget {
    public static final int $stable = ListWidgetStore.$stable;
    public final String key;
    public final ListWidgetStore store;

    /* renamed from: com.facebook.aura.widgets.ListWidget$clear$2, reason: invalid class name */
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

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidget", f = "ListWidget.kt", l = {72, 73, 80}, m = "reconcile$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidget$reconcile$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidget.reconcile$suspendImpl(ListWidget.this, null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidget", f = "ListWidget.kt", l = {91, AuraWaitlistConfettiKt.StandardParticleCount}, m = "refreshIfStale$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidget$refreshIfStale$1, reason: invalid class name and case insensitive filesystem */
    public final class C143921 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143921(HtJ<? super C143921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidget.refreshIfStale$suspendImpl(ListWidget.this, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object refreshIfStale$suspendImpl(com.facebook.aura.widgets.ListWidget r9, android.content.Context r10, long r11, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r7 = r11
            r5 = r10
            r6 = r9
            boolean r0 = r13 instanceof com.facebook.aura.widgets.ListWidget.C143921
            if (r0 == 0) goto L63
            r9 = r13
            com.facebook.aura.widgets.ListWidget$refreshIfStale$1 r9 = (com.facebook.aura.widgets.ListWidget.C143921) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r9.label = r2
        L15:
            java.lang.Object r4 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r9.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L3d
            if (r1 != r2) goto L69
            X.Hwg.A00(r4)
        L26:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L29:
            X.Hwg.A00(r4)
            com.facebook.aura.widgets.ListWidgetRefresher r4 = com.facebook.aura.widgets.ListWidgetRefresher.INSTANCE
            r9.L$0 = r6
            r9.L$1 = r10
            r9.J$0 = r11
            r9.label = r0
            java.lang.Object r4 = r4.isStale(r5, r6, r7, r9)
            if (r4 != r3) goto L4a
            return r3
        L3d:
            long r7 = r9.J$0
            java.lang.Object r5 = r9.L$1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r9.L$0
            com.facebook.aura.widgets.ListWidget r6 = (com.facebook.aura.widgets.ListWidget) r6
            X.Hwg.A00(r4)
        L4a:
            boolean r0 = X.AnonymousClass001.A1X(r4)
            if (r0 == 0) goto L26
            com.facebook.aura.widgets.ListWidgetRefresher r1 = com.facebook.aura.widgets.ListWidgetRefresher.INSTANCE
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.J$0 = r7
            r9.label = r2
            r0 = 0
            java.lang.Object r0 = r1.refresh(r5, r6, r0, r9)
            if (r0 != r3) goto L26
            return r3
        L63:
            com.facebook.aura.widgets.ListWidget$refreshIfStale$1 r9 = new com.facebook.aura.widgets.ListWidget$refreshIfStale$1
            r9.<init>(r13)
            goto L15
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidget.refreshIfStale$suspendImpl(com.facebook.aura.widgets.ListWidget, android.content.Context, long, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void cancelWork(Context context) {
        C7384Etj.A0Y(context, 0);
        ListWidgetRefreshWorker.Companion.cancel$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context, this);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void deleteFiles(Context context) {
        C7384Etj.A0Y(context, 0);
        this.store.deleteAllIcons(context);
    }

    public abstract int getEmptyRes();

    public abstract int getFallbackIconRes();

    public abstract int getLoadFailedRes();

    public abstract int getSignedOutRes();

    public abstract int getTitleRes();

    public abstract Uri itemUri(String str);

    public abstract Uri listUri();

    public abstract Object loadItems(Context context, AbstractC3358CGz abstractC3358CGz, ListWidgetIcons listWidgetIcons, HtJ<? super List<ListWidgetItemJson>> htJ);

    public abstract GlanceAppWidget newGlanceWidget();

    public abstract List<ListWidgetItemJson> previewItems(BFM bfm, int i);

    /* renamed from: com.facebook.aura.widgets.ListWidget$showSignedOut$2, reason: invalid class name and case insensitive filesystem */
    public final class C143932 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C143932 INSTANCE = new C143932();

        public C143932() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C6O2.A00(c6o2);
            c6o2.A08(ListWidgetStore.SIGNED_OUT, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object clear$suspendImpl(ListWidget listWidget, Context context, HtJ<? super Unit> htJ) {
        return C3cG.A0U(listWidget.store.editAll(context, AnonymousClass2.INSTANCE, htJ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r0 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0091 -> B:32:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object reconcile$suspendImpl(com.facebook.aura.widgets.ListWidget r8, android.content.Context r9, java.lang.String r10, boolean r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidget.reconcile$suspendImpl(com.facebook.aura.widgets.ListWidget, android.content.Context, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object showSignedOut$suspendImpl(ListWidget listWidget, Context context, HtJ<? super Unit> htJ) {
        return C3cG.A0U(listWidget.store.editAll(context, C143932.INSTANCE, htJ));
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public String getKey() {
        return this.key;
    }

    public final ListWidgetStore getStore() {
        return this.store;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public /* bridge */ boolean isAvailable() {
        return true;
    }

    public ListWidget(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.store = new ListWidgetStore(str2, new ListWidget$store$1(this));
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void Preview(BFM bfm, int i) {
        bfm.AgE(839647325);
        ListGlanceWidgetKt.ListWidgetPreview(this, null, bfm, i & 14, 2);
        AnonymousClass002.A19(bfm);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object clear(Context context, HtJ<? super Unit> htJ) {
        return clear$suspendImpl(this, context, htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public /* bridge */ List<Class<?>> getComponents() {
        return Collections.singletonList(getReceiver());
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object reconcile(Context context, String str, boolean z, HtJ<? super Unit> htJ) {
        return reconcile$suspendImpl(this, context, str, z, htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object refreshIfStale(Context context, long j, HtJ<? super Unit> htJ) {
        return refreshIfStale$suspendImpl(this, context, j, htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object showSignedOut(Context context, HtJ<? super Unit> htJ) {
        return showSignedOut$suspendImpl(this, context, htJ);
    }

    /* renamed from: com.facebook.aura.widgets.ListWidget$reconcile$2, reason: invalid class name and case insensitive filesystem */
    public final class C143912 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C143912 INSTANCE = new C143912();

        public C143912() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C7384Etj.A0Y(c6o2, 0);
            c6o2.A07(ListWidgetStore.ITEMS);
            c6o2.A07(ListWidgetStore.UPDATED_AT_MS);
            c6o2.A07(ListWidgetStore.VM_URL);
            C6O2.A02(c6o2, ListWidgetStore.SIGNED_OUT, false);
            c6o2.A08(ListWidgetStore.REFRESHING, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }
}
