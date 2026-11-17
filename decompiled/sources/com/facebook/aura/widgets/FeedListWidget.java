package com.facebook.aura.widgets;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.C16n;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C7384Etj;
import X.HtJ;
import X.HwV;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class FeedListWidget extends ListWidget {
    public static final int $stable = 0;
    public static final int emptyRes = 2131888587;
    public static final int fallbackIconRes = 2131230906;
    public static final int loadFailedRes = 2131888589;
    public static final Class<FeedWidgetReceiver> receiver = FeedWidgetReceiver.class;
    public static final int signedOutRes = 2131888599;
    public static final int titleRes = 2131888588;
    public static final FeedListWidget INSTANCE = new FeedListWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.FEED;
    public static final long previewSize = C16n.A00(330.0f, 270.0f);

    @DebugMetadata(c = "com.facebook.aura.widgets.FeedListWidget", f = "FeedListWidget.kt", l = {59, 63}, m = "loadItems", v = 2)
    /* renamed from: com.facebook.aura.widgets.FeedListWidget$loadItems$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeedListWidget.this.loadItems(null, null, null, this);
        }
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri itemUri(String str) {
        C7384Etj.A0Y(str, 0);
        return C60R.A0B(WidgetComponentsKt.auraUri("feed"), "unit_id", str);
    }

    public FeedListWidget() {
        super("feed", "feed_widgets");
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getEmptyRes() {
        return emptyRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getFallbackIconRes() {
        return fallbackIconRes;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public HatchWidgetKind getKind() {
        return kind;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getLoadFailedRes() {
        return loadFailedRes;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /* renamed from: getPreviewSize-MYxV2XQ */
    public long mo3155getPreviewSizeMYxV2XQ() {
        return previewSize;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Class<FeedWidgetReceiver> getReceiver() {
        return receiver;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getSignedOutRes() {
        return signedOutRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getTitleRes() {
        return titleRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget, com.facebook.aura.widgets.HomeScreenWidget
    public boolean isAvailable() {
        return HatchUtil.INSTANCE.isFeedEnabled();
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri listUri() {
        return C60R.A0D("feed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Path cross not found for [B:18:0x0071, B:36:0x00e1], limit reached: 52 */
    /* JADX WARN: Path cross not found for [B:36:0x00e1, B:18:0x0071], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d8 -> B:12:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dc -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // com.facebook.aura.widgets.ListWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadItems(android.content.Context r17, X.AbstractC3358CGz r18, com.facebook.aura.widgets.ListWidgetIcons r19, X.HtJ<? super java.util.List<com.facebook.aura.widgets.ListWidgetItemJson>> r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.FeedListWidget.loadItems(android.content.Context, X.CGz, com.facebook.aura.widgets.ListWidgetIcons, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public GlanceAppWidget newGlanceWidget() {
        return new FeedWidget();
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public List<ListWidgetItemJson> previewItems(BFM bfm, int i) throws Resources.NotFoundException {
        bfm.AgE(-2120146937);
        Context contextA08 = C60Q.A08(bfm);
        List listAsList = Arrays.asList(new HwV(Integer.valueOf(R.string._name_removed__res_0x7f1209d1), Integer.valueOf(R.string._name_removed__res_0x7f1209d3), Integer.valueOf(R.string._name_removed__res_0x7f1209d2)), new HwV(Integer.valueOf(R.string._name_removed__res_0x7f1209ce), Integer.valueOf(R.string._name_removed__res_0x7f1209d0), Integer.valueOf(R.string._name_removed__res_0x7f1209cf)), new HwV(Integer.valueOf(R.string._name_removed__res_0x7f1209d4), Integer.valueOf(R.string._name_removed__res_0x7f1209d6), Integer.valueOf(R.string._name_removed__res_0x7f1209d5)));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listAsList);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            C60S.A03(contextA08, bfm, arrayListA0i, it);
        }
        AnonymousClass001.A1D(bfm);
        return arrayListA0i;
    }
}
