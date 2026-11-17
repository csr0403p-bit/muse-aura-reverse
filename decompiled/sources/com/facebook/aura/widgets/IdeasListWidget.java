package com.facebook.aura.widgets;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C16n;
import X.C3b6;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HxE;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardSection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class IdeasListWidget extends ListWidget {
    public static final int $stable = 0;
    public static final int emptyRes = 2131889187;
    public static final int fallbackIconRes = 2131230896;
    public static final int loadFailedRes = 2131889189;
    public static final Class<IdeasWidgetReceiver> receiver = IdeasWidgetReceiver.class;
    public static final int signedOutRes = 2131889196;
    public static final int titleRes = 2131889188;
    public static final IdeasListWidget INSTANCE = new IdeasListWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.IDEAS;
    public static final long previewSize = C16n.A00(330.0f, 270.0f);

    @DebugMetadata(c = "com.facebook.aura.widgets.IdeasListWidget", f = "IdeasListWidget.kt", l = {55, 73}, m = "loadItems", v = 2)
    /* renamed from: com.facebook.aura.widgets.IdeasListWidget$loadItems$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
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
            return IdeasListWidget.this.loadItems(null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.widgets.IdeasListWidget$loadItems$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<IdeaCardSection, C3b6<? extends IdeaCard>> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final C3b6<IdeaCard> invoke(IdeaCardSection ideaCardSection) {
            C7384Etj.A0Y(ideaCardSection, 0);
            return AbstractC0878AGe.A06(ideaCardSection.cards);
        }
    }

    /* renamed from: com.facebook.aura.widgets.IdeasListWidget$loadItems$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<IdeaCard, String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(IdeaCard ideaCard) {
            IdeaCard ideaCard2 = ideaCard;
            C7384Etj.A0Y(ideaCard2, 0);
            return ideaCard2.ideaCardId;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(IdeaCard ideaCard) {
            C7384Etj.A0Y(ideaCard, 0);
            return ideaCard.ideaCardId;
        }
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri itemUri(String str) {
        C7384Etj.A0Y(str, 0);
        return C60R.A0B(WidgetComponentsKt.auraUri("ideas"), "id", str);
    }

    public IdeasListWidget() {
        super("ideas", "idea_widgets");
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
    public Class<IdeasWidgetReceiver> getReceiver() {
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

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri listUri() {
        return C60R.A0D("ideas");
    }

    /* JADX WARN: Path cross not found for [B:14:0x0052, B:16:0x0058], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:16:0x0058, B:14:0x0052], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c2 -> B:12:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c5 -> B:16:0x0058). Please report as a decompilation issue!!! */
    @Override // com.facebook.aura.widgets.ListWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadItems(android.content.Context r16, X.AbstractC3358CGz r17, com.facebook.aura.widgets.ListWidgetIcons r18, X.HtJ<? super java.util.List<com.facebook.aura.widgets.ListWidgetItemJson>> r19) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.IdeasListWidget.loadItems(android.content.Context, X.CGz, com.facebook.aura.widgets.ListWidgetIcons, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public GlanceAppWidget newGlanceWidget() {
        return new IdeasWidget();
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public List<ListWidgetItemJson> previewItems(BFM bfm, int i) throws Resources.NotFoundException {
        bfm.AgE(1135062089);
        Context contextA08 = C60Q.A08(bfm);
        List listAsList = Arrays.asList(AnonymousClass002.A0p(Integer.valueOf(R.string._name_removed__res_0x7f120c2b), R.string._name_removed__res_0x7f120c2a), AnonymousClass002.A0p(Integer.valueOf(R.string._name_removed__res_0x7f120c29), R.string._name_removed__res_0x7f120c28), AnonymousClass002.A0p(Integer.valueOf(R.string._name_removed__res_0x7f120c27), R.string._name_removed__res_0x7f120c26));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listAsList);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            HxE hxEA10 = C60Q.A10(it);
            int iA0F = AnonymousClass001.A0F(hxEA10.first);
            int iA0F2 = AnonymousClass001.A0F(hxEA10.second);
            String resourceEntryName = contextA08.getResources().getResourceEntryName(iA0F);
            C7384Etj.A0U(resourceEntryName);
            arrayListA0i.add(new ListWidgetItemJson(resourceEntryName, AbstractC2271BQs.A01(bfm, iA0F), AbstractC2271BQs.A01(bfm, iA0F2), null, null, false));
        }
        AnonymousClass001.A1D(bfm);
        return arrayListA0i;
    }
}
