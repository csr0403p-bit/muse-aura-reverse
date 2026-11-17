package com.facebook.aura.widgets;

import X.C70A;
import X.C70B;
import X.HtJ;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AskBarWidget extends AuraGlanceAppWidget {
    public static final int $stable = AuraGlanceAppWidget.$stable;
    public final HatchWidgetKind kind = AskBarHomeScreenWidget.INSTANCE.getKind();
    public final C70B sizeMode = C70A.A00;

    @DebugMetadata(c = "com.facebook.aura.widgets.AskBarWidget", f = "AskBarWidget.kt", l = {66}, m = "provideGlance", v = 2)
    /* renamed from: com.facebook.aura.widgets.AskBarWidget$provideGlance$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return AskBarWidget.this.provideGlance(null, null, this);
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
    public java.lang.Object provideGlance(android.content.Context r6, X.C6PP r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.widgets.AskBarWidget.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r8
            com.facebook.aura.widgets.AskBarWidget$provideGlance$1 r4 = (com.facebook.aura.widgets.AskBarWidget.AnonymousClass1) r4
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
            if (r0 == r2) goto L3b
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.widgets.AskBarWidget$provideGlance$1 r4 = new com.facebook.aura.widgets.AskBarWidget$provideGlance$1
            r4.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r1)
            X.G0V<X.BFM, java.lang.Integer, kotlin.Unit> r1 = com.facebook.aura.widgets.ComposableSingletons$AskBarWidgetKt.f313lambda$1406885305
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r0 = com.facebook.aura.widgets.WidgetResourcesKt.provideWidgetContent(r5, r1, r4)
            if (r0 != r3) goto L3e
            return r3
        L3b:
            X.Hwg.A00(r1)
        L3e:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AskBarWidget.provideGlance(android.content.Context, X.6PP, X.HtJ):java.lang.Object");
    }
}
