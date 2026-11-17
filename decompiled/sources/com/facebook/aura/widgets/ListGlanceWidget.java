package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C6PP;
import X.C70A;
import X.C70B;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class ListGlanceWidget extends AuraGlanceAppWidget {
    public static final int $stable = AuraGlanceAppWidget.$stable;
    public final C70B sizeMode = C70A.A00;

    @DebugMetadata(c = "com.facebook.aura.widgets.ListGlanceWidget", f = "ListGlanceWidget.kt", l = {55}, m = "provideGlance$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListGlanceWidget$provideGlance$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListGlanceWidget.provideGlance$suspendImpl(ListGlanceWidget.this, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListGlanceWidget$provideGlance$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public AnonymousClass2() {
            super(2);
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ListGlanceWidgetKt.ListWidgetContent(ListGlanceWidget.this.getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(), null, bfm, ListWidget.$stable, 2);
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

    public abstract ListWidget getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object provideGlance$suspendImpl(com.facebook.aura.widgets.ListGlanceWidget r5, android.content.Context r6, X.C6PP r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.widgets.ListGlanceWidget.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r8
            com.facebook.aura.widgets.ListGlanceWidget$provideGlance$1 r4 = (com.facebook.aura.widgets.ListGlanceWidget.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L47
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.widgets.ListGlanceWidget$provideGlance$1 r4 = new com.facebook.aura.widgets.ListGlanceWidget$provideGlance$1
            r4.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.widgets.ListGlanceWidget$provideGlance$2 r1 = new com.facebook.aura.widgets.ListGlanceWidget$provideGlance$2
            r1.<init>()
            r0 = -235034473(0xfffffffff1fda897, float:-2.5121126E30)
            X.B1U r1 = X.B1V.A01(r1, r0, r2)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.label = r2
            java.lang.Object r0 = com.facebook.aura.widgets.WidgetResourcesKt.provideWidgetContent(r5, r1, r4)
            if (r0 != r3) goto L4a
            return r3
        L47:
            X.Hwg.A00(r1)
        L4a:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListGlanceWidget.provideGlance$suspendImpl(com.facebook.aura.widgets.ListGlanceWidget, android.content.Context, X.6PP, X.HtJ):java.lang.Object");
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public C70B getSizeMode() {
        return this.sizeMode;
    }

    @Override // com.facebook.aura.widgets.AuraGlanceAppWidget
    public HatchWidgetKind getKind$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets() {
        return getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets().getKind();
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public Object provideGlance(Context context, C6PP c6pp, HtJ<? super Unit> htJ) {
        return provideGlance$suspendImpl(this, context, c6pp, htJ);
    }
}
