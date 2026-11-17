package com.facebook.aura.widgets;

import X.AbstractC058672f;
import X.AbstractC058772g;
import X.AbstractC059772w;
import X.AbstractC060773g;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AnonymousClass722;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHU;
import X.C058571g;
import X.C059672t;
import X.C062875i;
import X.C1809ArT;
import X.C3cG;
import X.C60Q;
import X.C71G;
import X.C71H;
import X.C71L;
import X.C71d;
import X.C72G;
import X.C72N;
import X.C72R;
import X.C72S;
import X.C72T;
import X.C72V;
import X.C72Y;
import X.C72Z;
import X.C72d;
import X.C72e;
import X.C7384Etj;
import X.C73O;
import X.C75U;
import X.C75V;
import X.C75X;
import X.C76B;
import X.C78N;
import X.C7BY;
import X.C7VW;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class ListGlanceWidgetKt {
    public static final float ROW_RESERVED_WIDTH = 84.0f;

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ListWidget listWidget, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetContent(this.$widget, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ListWidget listWidget, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetContent(this.$widget, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C143831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ListWidgetItemJson $item;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143831(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$item = listWidgetItemJson;
            this.$updatedAtMs = l;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetIcon(this.$widget, this.$item, this.$updatedAtMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C143842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143842(Bitmap bitmap, String str, ListWidget listWidget) {
            super(2);
            this.$bitmap = bitmap;
            this.$emoji = str;
            this.$widget = listWidget;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$bitmap != null || this.$emoji == null) {
                bfm.AgE(1586190943);
                Bitmap bitmap = this.$bitmap;
                AbstractC060773g.A01(bfm, new C72S(new C72V(WidgetComponentsKt.widgetPrimaryTextColor)), AnonymousClass722.A01(C76B.A00, 24.0f), bitmap != null ? new C71G(bitmap) : new C058571g(this.$widget.getFallbackIconRes()), null, 0, 32816, 8);
            } else {
                bfm.AgE(1586102593);
                AbstractC058672f.A00(bfm, null, new BHU(new C1809ArT(C60Q.A04()), AbstractC058772g.A01), this.$emoji, 0, 384, 10);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetIcon$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ListWidgetItemJson $item;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$item = listWidgetItemJson;
            this.$updatedAtMs = l;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetIcon(this.$widget, this.$item, this.$updatedAtMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetItems$2, reason: invalid class name and case insensitive filesystem */
    public final class C143852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isClickable;
        public final /* synthetic */ List<ListWidgetItemJson> $items;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143852(ListWidget listWidget, List<ListWidgetItemJson> list, Long l, boolean z, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$items = list;
            this.$updatedAtMs = l;
            this.$isClickable = z;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetItems(this.$widget, this.$items, this.$updatedAtMs, this.$isClickable, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetPanel$1, reason: invalid class name and case insensitive filesystem */
    public final class C143861 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isInteractive;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ List<ListWidgetItemJson> $items;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetPanel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04451 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ boolean $isInteractive;
            public final /* synthetic */ boolean $isRefreshing;
            public final /* synthetic */ List<ListWidgetItemJson> $items;
            public final /* synthetic */ Long $updatedAtMs;
            public final /* synthetic */ ListWidget $widget;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04451(ListWidget listWidget, List<ListWidgetItemJson> list, Long l, boolean z, boolean z2) {
                super(2);
                this.$widget = listWidget;
                this.$items = list;
                this.$updatedAtMs = l;
                this.$isInteractive = z;
                this.$isRefreshing = z2;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.BFM r12, int r13) {
                /*
                    r11 = this;
                    r3 = r13 & 3
                    r0 = 2
                    r2 = 0
                    r1 = 1
                    boolean r0 = X.AnonymousClass002.A1P(r3, r0)
                    r8 = r12
                    boolean r0 = X.AnonymousClass001.A1b(r0, r12, r13)
                    if (r0 == 0) goto L40
                    com.facebook.aura.widgets.ListWidget r3 = r11.$widget
                    java.util.List<com.facebook.aura.widgets.ListWidgetItemJson> r4 = r11.$items
                    java.lang.Long r5 = r11.$updatedAtMs
                    boolean r0 = r11.$isInteractive
                    if (r0 == 0) goto L1f
                    boolean r0 = r11.$isRefreshing
                    r6 = 1
                    if (r0 == 0) goto L20
                L1f:
                    r6 = 0
                L20:
                    int r9 = com.facebook.aura.widgets.ListWidget.$stable
                    r7 = 0
                    r10 = 16
                    com.facebook.aura.widgets.ListGlanceWidgetKt.ListWidgetItems(r3, r4, r5, r6, r7, r8, r9, r10)
                    boolean r0 = r11.$isRefreshing
                    if (r0 == 0) goto L39
                    r0 = 668042396(0x27d1849c, float:5.815293E-15)
                    r12.AgE(r0)
                    com.facebook.aura.widgets.WidgetComponentsKt.WidgetRefreshingOverlay(r7, r12, r2, r1)
                L35:
                    X.AnonymousClass001.A1D(r12)
                    return
                L39:
                    r0 = -765498177(0xffffffffd25f6cbf, float:-2.39900541E11)
                    r12.AgE(r0)
                    goto L35
                L40:
                    r12.Afo()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListGlanceWidgetKt.C143861.C04451.invoke(X.BFM, int):void");
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        public final void invoke(C71L c71l, BFM bfm, int i) {
            C7384Etj.A0Y(c71l, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            WidgetComponentsKt.WidgetHeader(AbstractC2271BQs.A01(bfm, this.$widget.getTitleRes()), this.$updatedAtMs, this.$isRefreshing, this.$isInteractive ? new C71H(ListWidgetReceiver.Companion.refreshIntent(this.$context, this.$widget)) : null, null, this.$isInteractive ? WidgetComponentsKt.auraDeeplinkAction(this.$context, this.$widget.listUri(), this.$widget.getKind()) : null, bfm, 0, 16);
            List<ListWidgetItemJson> list = this.$items;
            if (list == null) {
                if (this.$isRefreshing) {
                    bfm.AgE(1171313149);
                    WidgetComponentsKt.WidgetRefreshingOverlay(null, bfm, 0, 1);
                    AnonymousClass001.A1D(bfm);
                    return;
                } else {
                    bfm.AgE(1171315156);
                    WidgetComponentsKt.WidgetMessage(AbstractC2271BQs.A01(bfm, this.$widget.getLoadFailedRes()), AnonymousClass722.A00(C76B.A00), null, bfm, 0, 4);
                    AnonymousClass001.A1D(bfm);
                    return;
                }
            }
            if (list.isEmpty()) {
                bfm.AgE(1171320911);
                WidgetComponentsKt.WidgetMessage(AbstractC2271BQs.A01(bfm, this.$widget.getEmptyRes()), AnonymousClass722.A00(C76B.A00), null, bfm, 0, 4);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(1171326346);
                C72G.A00(bfm, AnonymousClass722.A00(C76B.A00), null, B1V.A00(bfm, new C04451(this.$widget, this.$items, this.$updatedAtMs, this.$isInteractive, this.$isRefreshing), -35059005), 384, 2);
                AnonymousClass001.A1D(bfm);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143861(ListWidget listWidget, Long l, boolean z, boolean z2, Context context, List<ListWidgetItemJson> list) {
            super(3);
            this.$widget = listWidget;
            this.$updatedAtMs = l;
            this.$isRefreshing = z;
            this.$isInteractive = z2;
            this.$context = context;
            this.$items = list;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
            invoke(c71l, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetPanel$2, reason: invalid class name and case insensitive filesystem */
    public final class C143872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isInteractive;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ List<ListWidgetItemJson> $items;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143872(ListWidget listWidget, List<ListWidgetItemJson> list, Long l, boolean z, boolean z2, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$items = list;
            this.$updatedAtMs = l;
            this.$isRefreshing = z;
            this.$isInteractive = z2;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetPanel(this.$widget, this.$items, this.$updatedAtMs, this.$isRefreshing, this.$isInteractive, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C143881 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143881(ListWidget listWidget, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetPreview(this.$widget, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C143891 extends AbstractC7559F3s implements G0W<C72d, BFM, Integer, Unit> {
        public final /* synthetic */ ListWidgetItemJson $item;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetRow$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04461 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
            public final /* synthetic */ ListWidgetItemJson $item;
            public final /* synthetic */ float $textWidth;

            public final void invoke(C71L c71l, BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c71l), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                WidgetTextKt.m3163WidgetTextb7W0Lw(this.$item.title, WidgetTextStyle.TITLE, WidgetComponentsKt.widgetPrimaryTextColor, this.$textWidth, null, 0, false, bfm, 48, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                if (C7BY.A0j(this.$item.subtitle)) {
                    bfm.AgE(720437577);
                } else {
                    bfm.AgE(720174015);
                    WidgetTextKt.m3163WidgetTextb7W0Lw(this.$item.subtitle, WidgetTextStyle.SUBTITLE, WidgetComponentsKt.widgetSecondaryTextColor, this.$textWidth, AbstractC059772w.A03(C76B.A00, 0.0f, 2.0f, 0.0f, 0.0f), 2, false, bfm, 196656, 64);
                }
                AnonymousClass001.A1D(bfm);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04461(ListWidgetItemJson listWidgetItemJson, float f) {
                super(3);
                this.$item = listWidgetItemJson;
                this.$textWidth = f;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
                invoke(c71l, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        public final void invoke(C72d c72d, BFM bfm, int i) {
            C7384Etj.A0Y(c72d, 0);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c72d, bfm, i) ? 1 : 0) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                bfm.Afo();
                return;
            }
            ListGlanceWidgetKt.ListWidgetIcon(this.$widget, this.$item, this.$updatedAtMs, null, bfm, (ListWidgetItemJson.$stable << 3) | ListWidget.$stable, 8);
            C72N.A00(bfm, C76B.A00, 12.0f);
            C72Y.A00(bfm, new C062875i(C72T.A00), B1V.A00(bfm, new C04461(this.$item, AnonymousClass003.A03(C73O.A00(bfm)) - ListGlanceWidgetKt.ROW_RESERVED_WIDTH), 2032676441), 0, 0, 3072, 6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143891(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l) {
            super(3);
            this.$widget = listWidget;
            this.$item = listWidgetItemJson;
            this.$updatedAtMs = l;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C72d c72d, BFM bfm, Integer num) {
            invoke(c72d, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C143902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isClickable;
        public final /* synthetic */ ListWidgetItemJson $item;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ Long $updatedAtMs;
        public final /* synthetic */ ListWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143902(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l, boolean z, C76B c76b, int i, int i2) {
            super(2);
            this.$widget = listWidget;
            this.$item = listWidgetItemJson;
            this.$updatedAtMs = l;
            this.$isClickable = z;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ListGlanceWidgetKt.ListWidgetRow(this.$widget, this.$item, this.$updatedAtMs, this.$isClickable, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ListWidgetPreview(ListWidget listWidget, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        C7384Etj.A0Y(listWidget, 0);
        bfm.AgG(-2099134968);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            int i4 = ListWidget.$stable;
            int i5 = iA05 & 14;
            ListWidgetPanel(listWidget, listWidget.previewItems(bfm, i4 | i5), null, false, false, c76b2, bfm, AnonymousClass001.A08(iA05 << 12, i4 | 28032 | i5), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143881(listWidget, c76b2, i, i2);
        }
    }

    public static final void ListWidgetContent(ListWidget listWidget, C76B c76b, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        C76B c76b2 = c76b;
        bfm.AgG(-388563975);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c76b2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            Context contextA08 = C60Q.A08(bfm);
            bfm.AgF(-534706435);
            Object objA6v = bfm.A6v(C7VW.A03);
            if (objA6v == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            Preferences preferences = (Preferences) objA6v;
            BBI bbiA07 = C3cG.A07(bfm);
            if (C7384Etj.areEqual(preferences.A06(ListWidgetStore.SIGNED_OUT), true)) {
                bfm.AgE(-772296837);
                WidgetComponentsKt.WidgetMessage(AnonymousClass006.A0v(bfm, listWidget.getSignedOutRes()), WidgetComponentsKt.widgetContainer(c76b2), WidgetComponentsKt.openAppAction(contextA08), bfm, 0, 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(listWidget, c76b2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            bfm.AgE(-772098871);
            BBI.A0R(bbiA07, false);
            String str = (String) preferences.A06(ListWidgetStore.ITEMS);
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = listWidget.store.decodeItems(str);
                bfm.Ai0(objAaT);
            }
            ListWidgetPanel(listWidget, (List) objAaT, (Long) preferences.A06(ListWidgetStore.UPDATED_AT_MS), Preferences.A03(ListWidgetStore.REFRESHING, preferences, true), true, c76b2, bfm, AnonymousClass001.A08(iA05 << 12, ListWidget.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (iA05 & 14)), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(listWidget, c76b2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }

    public static final void ListWidgetIcon(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l, C76B c76b, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        C76B c76b2 = c76b;
        bfm.AgG(604276570);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(listWidgetItemJson, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, l);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c76b2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            Context contextA08 = C60Q.A08(bfm);
            String str = listWidgetItemJson.icon_file;
            boolean zA65 = bfm.A65(str) | ((iA05 & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = str != null ? listWidget.store.loadIcon(contextA08, str) : null;
                bfm.Ai0(objAaT);
            }
            Bitmap bitmap = (Bitmap) objAaT;
            if (bitmap != null && listWidgetItemJson.is_color_icon) {
                bfm.AgE(1795734932);
                AbstractC060773g.A01(bfm, null, AnonymousClass722.A01(c76b2, 40.0f).Agp(new C75U(new C72R(10.0f))), new C71G(bitmap), null, 1, 48, 16);
                AnonymousClass002.A19(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new C143831(listWidget, listWidgetItemJson, l, c76b2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            bfm.AgE(1795938664);
            BBI.A0R((BBI) bfm, false);
            C72G.A00(bfm, AnonymousClass722.A01(c76b2, 40.0f).Agp(new C75U(new C72R(10.0f))).Agp(new C75X(WidgetComponentsKt.widgetElevatedColor)), C059672t.A02, B1V.A00(bfm, new C143842(bitmap, listWidgetItemJson.emoji, listWidget), 1798140988), 384, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(listWidget, listWidgetItemJson, l, c76b2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void ListWidgetItems(ListWidget listWidget, List<ListWidgetItemJson> list, Long l, boolean z, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-859479610);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, l);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c76b2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C76B c76bA03 = AbstractC059772w.A03(AnonymousClass722.A00(c76b2), 0.0f, 0.0f, 0.0f, 8.0f);
            boolean zA1D = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(listWidget))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(list))) | AnonymousClass003.A1D(iA05) | ((iA05 & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new ListGlanceWidgetKt$ListWidgetItems$1$1(list, listWidget, l, z);
                bfm.Ai0(objAaT);
            }
            C71d.A00(bfm, c76bA03, (G0U) objAaT, 0, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143852(listWidget, list, l, z, c76b2, i, i2);
        }
    }

    public static final void ListWidgetPanel(ListWidget listWidget, List<ListWidgetItemJson> list, Long l, boolean z, boolean z2, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-1355860946);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, l);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c76b2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Y.A00(bfm, WidgetComponentsKt.widgetContainer(c76b2), B1V.A00(bfm, new C143861(listWidget, l, z, z2, C60Q.A08(bfm), list), -1370846684), 0, 0, 3072, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143872(listWidget, list, l, z, z2, c76b2, i, i2);
        }
    }

    public static final void ListWidgetRow(ListWidget listWidget, ListWidgetItemJson listWidgetItemJson, Long l, boolean z, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-1753577345);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(listWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(listWidgetItemJson, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, l);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c76b2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Z.A00(bfm, AbstractC059772w.A02(C72e.A00(c76b2), 16.0f, 8.0f).Agp(z ? C75V.A00(C76B.A00, WidgetComponentsKt.auraDeeplinkAction(C60Q.A08(bfm), listWidget.itemUri(listWidgetItemJson.id), listWidget.getKind())) : C76B.A00), B1V.A00(bfm, new C143891(listWidget, listWidgetItemJson, l), -29523485), 0, 1, 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143902(listWidget, listWidgetItemJson, l, z, c76b2, i, i2);
        }
    }
}
