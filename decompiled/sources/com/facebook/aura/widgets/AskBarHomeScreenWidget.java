package com.facebook.aura.widgets;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C16n;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import X.G0V;
import X.HtJ;
import X.HzP;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.tabs.AuraTabLayoutKt;
import com.facebook.aura.tabs.FixedTab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AskBarHomeScreenWidget extends AgentWidget {
    public static final int $stable = 0;
    public static final AskBarHomeScreenWidget INSTANCE = new AskBarHomeScreenWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.ASK_BAR;
    public static final long previewSize = C16n.A00(320.0f, 160.0f);
    public static final Class<AskBarWidgetReceiver> receiver = AskBarWidgetReceiver.class;

    /* renamed from: com.facebook.aura.widgets.AskBarHomeScreenWidget$Preview$1, reason: invalid class name */
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
            AskBarHomeScreenWidget.this.Preview(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.AskBarHomeScreenWidget", f = "AskBarHomeScreenWidget.kt", l = {54}, m = "decodeAvatar", v = 2)
    /* renamed from: com.facebook.aura.widgets.AskBarHomeScreenWidget$decodeAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C143721 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143721(HtJ<? super C143721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AskBarHomeScreenWidget.this.decodeAvatar(null, null, this);
        }
    }

    @Override // com.facebook.aura.widgets.AgentWidget
    public boolean isCallSupported(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return Voice.INSTANCE.isCallSupported(abstractC3358CGz);
    }

    @Override // com.facebook.aura.widgets.AgentWidget
    public List<String> tabIds(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        List<String> listAuraTabBarIds = AuraTabLayoutKt.auraTabBarIds(abstractC3358CGz, PinnedItemsRepository.Companion.getInstance(abstractC3358CGz).navigationOrder.getValue());
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : listAuraTabBarIds) {
            Ey9<FixedTab> entries = FixedTab.getEntries();
            if (!(entries instanceof Collection) || !entries.isEmpty()) {
                Iterator<FixedTab> it = entries.iterator();
                while (true) {
                    if (it.hasNext()) {
                        FixedTab next = it.next();
                        if (C7384Etj.areEqual(next.getNavigationId(), str) && AskBarWidgetKt.deeplinkPath(next) != null) {
                            arrayListA0h.add(str);
                            break;
                        }
                    }
                }
            }
        }
        return AbstractC0878AGe.A0a(arrayListA0h, 5);
    }

    public AskBarHomeScreenWidget() {
        super("ask_bar", "ask_bar_widgets");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @Override // com.facebook.aura.widgets.AgentWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decodeAvatar(android.content.Context r9, java.io.File r10, X.HtJ<? super android.graphics.Bitmap> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.AskBarHomeScreenWidget.C143721
            if (r0 == 0) goto L51
            r7 = r11
            com.facebook.aura.widgets.AskBarHomeScreenWidget$decodeAvatar$1 r7 = (com.facebook.aura.widgets.AskBarHomeScreenWidget.C143721) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1059481190(0x3f266666, float:0.65)
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L7d
            int r2 = r7.I$0
            X.Hwg.A00(r6)
        L25:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L57
            r5 = 0
            return r5
        L2b:
            X.Hwg.A00(r6)
            r1 = 1110441984(0x42300000, float:44.0)
            android.util.DisplayMetrics r0 = X.C60Q.A0B(r9)
            float r0 = r0.density
            float r1 = r1 * r0
            int r2 = X.Ab3.A01(r1)
            float r0 = (float) r2
            float r0 = r0 / r3
            int r1 = X.Ab3.A01(r0)
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.I$0 = r2
            r7.label = r4
            java.lang.Object r6 = com.facebook.aura.widgets.WidgetImagesKt.decodeWidgetBitmap(r10, r1, r7)
            if (r6 != r5) goto L25
            return r5
        L51:
            com.facebook.aura.widgets.AskBarHomeScreenWidget$decodeAvatar$1 r7 = new com.facebook.aura.widgets.AskBarHomeScreenWidget$decodeAvatar$1
            r7.<init>(r11)
            goto L12
        L57:
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            if (r3 >= r4) goto L69
            r3 = 1
        L69:
            int r0 = r6.getWidth()
            int r0 = r0 - r3
            int r1 = r0 / 2
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r1, r0, r3, r3)
            X.C7384Etj.A0U(r0)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r2, r4)
            return r5
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AskBarHomeScreenWidget.decodeAvatar(android.content.Context, java.io.File, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public HatchWidgetKind getKind() {
        return kind;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /* renamed from: getPreviewSize-MYxV2XQ, reason: not valid java name */
    public long mo3155getPreviewSizeMYxV2XQ() {
        return previewSize;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Class<AskBarWidgetReceiver> getReceiver() {
        return receiver;
    }

    @Override // com.facebook.aura.widgets.AgentWidget
    public GlanceAppWidget newGlanceWidget() {
        return new AskBarWidget();
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void Preview(BFM bfm, int i) {
        bfm.AgG(1953200719);
        int i2 = i & 1;
        if (bfm.AfS(i2, AnonymousClass002.A1L(i2))) {
            AskBarWidgetKt.AskBarPreview(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }
}
