package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C70A;
import X.C70B;
import X.F60;
import X.G0V;
import X.HtJ;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class SpaceWidget extends AuraGlanceAppWidget {
    public static final int $stable = AuraGlanceAppWidget.$stable;
    public final HatchWidgetKind kind = SpaceHomeScreenWidget.INSTANCE.getKind();
    public final C70B sizeMode = C70A.A00;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidget", f = "SpaceWidget.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "provideGlance", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidget$provideGlance$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            SpaceWidget.this.provideGlance(null, null, this);
            throw F60.createAndThrow();
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidget$provideGlance$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $appWidgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$appWidgetId = i;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                SpaceWidgetKt.SpaceWidgetContent(this.$appWidgetId, bfm, 0);
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

    @Override // com.facebook.aura.widgets.AuraGlanceAppWidget
    public HatchWidgetKind getKind$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets() {
        return this.kind;
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public C70B getSizeMode() {
        return this.sizeMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // androidx.glance.appwidget.GlanceAppWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r7, X.C6PP r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.SpaceWidget.AnonymousClass1
            if (r0 == 0) goto L22
            r5 = r9
            com.facebook.aura.widgets.SpaceWidget$provideGlance$1 r5 = (com.facebook.aura.widgets.SpaceWidget.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L54
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.widgets.SpaceWidget$provideGlance$1 r5 = new com.facebook.aura.widgets.SpaceWidget$provideGlance$1
            r5.<init>(r9)
            goto L12
        L28:
            X.Hwg.A00(r1)
            androidx.glance.appwidget.GlanceAppWidgetManager r0 = new androidx.glance.appwidget.GlanceAppWidgetManager
            r0.<init>(r7)
            boolean r0 = r8 instanceof X.C6vW
            if (r0 == 0) goto L5c
            X.6vW r8 = (X.C6vW) r8
            int r2 = r8.A00
            com.facebook.aura.widgets.SpaceWidget$provideGlance$2 r1 = new com.facebook.aura.widgets.SpaceWidget$provideGlance$2
            r1.<init>(r2)
            r0 = 1911382725(0x71ed62c5, float:2.3509553E30)
            X.B1U r1 = X.B1V.A01(r1, r0, r3)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.I$0 = r2
            r5.label = r3
            java.lang.Object r0 = com.facebook.aura.widgets.WidgetResourcesKt.provideWidgetContent(r6, r1, r5)
            if (r0 != r4) goto L57
            return r4
        L54:
            X.Hwg.A00(r1)
        L57:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        L5c:
            java.lang.String r0 = "This method only accepts App Widget Glance Id"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidget.provideGlance(android.content.Context, X.6PP, X.HtJ):java.lang.Object");
    }
}
