package com.facebook.aura.widgets;

import X.AKH;
import X.AKJ;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C60Q;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class WidgetResourcesKt {

    /* renamed from: com.facebook.aura.widgets.WidgetResourcesKt$ProvideWidgetResources$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetResourcesKt.ProvideWidgetResources(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetResourcesKt", f = "WidgetResources.kt", l = {15}, m = "provideWidgetContent", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C144291 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetResourcesKt.provideWidgetContent(null, null, this);
        }

        public C144291(HtJ<? super C144291> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$content = g0v;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                WidgetResourcesKt.ProvideWidgetResources(this.$content, bfm, 0);
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

    public static final void ProvideWidgetResources(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(1287256867);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Context contextA08 = C60Q.A08(bfm);
            AKJ<Context> akjA04 = AndroidCompositionLocals_androidKt.A01.A04(contextA08);
            AKH<Configuration> akh = AndroidCompositionLocals_androidKt.A00;
            Configuration configuration = contextA08.getResources().getConfiguration();
            C7384Etj.A0U(configuration);
            AKT.A02(bfm, g0v, new AKJ[]{akjA04, akh.A04(configuration)}, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(g0v, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object provideWidgetContent(androidx.glance.appwidget.GlanceAppWidget r4, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r5, X.HtJ<?> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.widgets.WidgetResourcesKt.C144291
            if (r0 == 0) goto L22
            r4 = r6
            com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$1 r4 = (com.facebook.aura.widgets.WidgetResourcesKt.C144291) r4
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
            if (r0 == r2) goto L45
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$1 r4 = new com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$1
            r4.<init>(r6)
            goto L12
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$2 r1 = new com.facebook.aura.widgets.WidgetResourcesKt$provideWidgetContent$2
            r1.<init>(r5)
            r0 = 760787592(0x2d58b288, float:1.231782E-11)
            X.B1U r1 = X.B1V.A01(r1, r0, r2)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            X.Hji r0 = androidx.glance.appwidget.GlanceAppWidgetKt.A01(r4, r1)
            if (r0 != r3) goto L48
            return r3
        L45:
            X.Hwg.A00(r1)
        L48:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetResourcesKt.provideWidgetContent(androidx.glance.appwidget.GlanceAppWidget, X.G0V, X.HtJ):java.lang.Object");
    }
}
