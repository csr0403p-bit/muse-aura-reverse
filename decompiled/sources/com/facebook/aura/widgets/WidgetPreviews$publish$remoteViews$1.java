package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WidgetPreviews$publish$remoteViews$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HomeScreenWidget $widget;

    /* renamed from: com.facebook.aura.widgets.WidgetPreviews$publish$remoteViews$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HomeScreenWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeScreenWidget homeScreenWidget) {
            super(2);
            this.$widget = homeScreenWidget;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                this.$widget.Preview(bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPreviews$publish$remoteViews$1(HomeScreenWidget homeScreenWidget) {
        super(2);
        this.$widget = homeScreenWidget;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            WidgetResourcesKt.ProvideWidgetResources(B1V.A00(bfm, new AnonymousClass1(this.$widget), 126403839), bfm, 6);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
