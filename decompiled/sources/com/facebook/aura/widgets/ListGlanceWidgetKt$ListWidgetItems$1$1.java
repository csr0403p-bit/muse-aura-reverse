package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1U;
import X.B1V;
import X.BFM;
import X.C3cG;
import X.C60O;
import X.C71Z;
import X.C71a;
import X.C71b;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.G2j;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ListGlanceWidgetKt$ListWidgetItems$1$1 extends AbstractC7559F3s implements G0U<C71a, Unit> {
    public final /* synthetic */ boolean $isClickable;
    public final /* synthetic */ List<ListWidgetItemJson> $items;
    public final /* synthetic */ Long $updatedAtMs;
    public final /* synthetic */ ListWidget $widget;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetItems$1$1$invoke$$inlined$items$1] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C71a c71a) {
        C7384Etj.A0Y(c71a, 0);
        final List<ListWidgetItemJson> list = this.$items;
        final ListWidget listWidget = this.$widget;
        final Long l = this.$updatedAtMs;
        final boolean z = this.$isClickable;
        int size = list.size();
        ?? r7 = new G0U<Integer, Long>() { // from class: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetItems$1$1$invoke$$inlined$items$1
            public final Long invoke(int i) {
                return Long.valueOf(((ListWidgetItemJson) list.get(i)).id.hashCode());
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Long invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        };
        final B1U b1uA01 = B1V.A01(new G2j<C71b, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.widgets.ListGlanceWidgetKt$ListWidgetItems$1$1$invoke$$inlined$items$2
            public final void invoke(C71b c71b, int i, BFM bfm, int i2) {
                int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c71b, bfm, i2) ? 1 : 0) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA05 |= AnonymousClass004.A0E(bfm, i);
                }
                if ((iA05 & 147) == 146 && bfm.AKh()) {
                    bfm.Afo();
                    return;
                }
                ListWidgetItemJson listWidgetItemJson = (ListWidgetItemJson) list.get(i);
                bfm.AgE(987996973);
                ListGlanceWidgetKt.ListWidgetRow(listWidget, listWidgetItemJson, l, z, null, bfm, ListWidget.$stable | (ListWidgetItemJson.$stable << 3), 16);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C71b c71b, Integer num, BFM bfm, Integer num2) {
                invoke(c71b, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 329696715, true);
        C71Z c71z = (C71Z) c71a;
        for (final int i = 0; i < size; i++) {
            long jA05 = C3cG.A05(r7.invoke(AnonymousClass001.A0F(Integer.valueOf(i))));
            B1U b1uA012 = B1V.A01(new G0W() { // from class: X.1SD
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    G2j g2j = b1uA01;
                    int i2 = i;
                    BFM bfm = (BFM) obj2;
                    int iA0F = AnonymousClass001.A0F(obj3);
                    if ((iA0F & 6) == 0) {
                        iA0F |= AnonymousClass002.A05(AnonymousClass004.A1X(obj, bfm, iA0F) ? 1 : 0);
                    }
                    if ((iA0F & 19) == 18 && bfm.AKh()) {
                        bfm.Afo();
                    } else {
                        AnonymousClass001.A1F(obj, Integer.valueOf(i2), bfm, g2j, iA0F & 14);
                    }
                    return Unit.INSTANCE;
                }
            }, 499182208, true);
            if (jA05 != Long.MIN_VALUE && jA05 <= -4611686018427387904L) {
                throw C60O.A0i("You may not specify item ids less than -4611686018427387904 in a Glance\nwidget. These are reserved.");
            }
            c71z.A00.add(C3cG.A0r(Long.valueOf(jA05), b1uA012));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListGlanceWidgetKt$ListWidgetItems$1$1(List<ListWidgetItemJson> list, ListWidget listWidget, Long l, boolean z) {
        super(1);
        this.$items = list;
        this.$widget = listWidget;
        this.$updatedAtMs = l;
        this.$isClickable = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C71a c71a) {
        invoke2(c71a);
        return Unit.INSTANCE;
    }
}
