package com.facebook.aura.widgets;

import X.Ab3;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C60Q;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ListWidgetIcons {
    public static final int $stable = 8;
    public final String batch;
    public final Context context;
    public final long generation;
    public final int sizePx;
    public final ListWidget widget;

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetIcons", f = "ListWidget.kt", l = {107, 107}, m = HatchDataExportLoggingKt.PHASE_DOWNLOAD, v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetIcons$download$1, reason: invalid class name */
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
            return ListWidgetIcons.this.download(0, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetIcons$save$2", f = "ListWidget.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetIcons$save$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super String>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ int $index;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Bitmap bitmap, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$index = i;
            this.$bitmap = bitmap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ListWidgetIcons.this.new AnonymousClass2(this.$index, this.$bitmap, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ListWidgetIcons listWidgetIcons = ListWidgetIcons.this;
                ListWidgetStore listWidgetStore = listWidgetIcons.widget.store;
                Context context = listWidgetIcons.context;
                String str = listWidgetIcons.batch;
                int i2 = this.$index;
                Bitmap bitmap = this.$bitmap;
                long j = listWidgetIcons.generation;
                this.label = 1;
                obj = listWidgetStore.saveIcon(context, str, i2, bitmap, j, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object download(int r7, java.lang.String r8, X.HtJ<? super java.lang.String> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.ListWidgetIcons.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r9
            com.facebook.aura.widgets.ListWidgetIcons$download$1 r5 = (com.facebook.aura.widgets.ListWidgetIcons.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L24
            if (r0 == r2) goto L37
            if (r0 != r3) goto L56
            X.Hwg.A00(r1)
        L23:
            return r1
        L24:
            X.Hwg.A00(r1)
            int r1 = r6.sizePx
            r0 = 0
            r5.L$0 = r0
            r5.I$0 = r7
            r5.label = r2
            java.lang.Object r1 = com.facebook.aura.widgets.WidgetImagesKt.downloadWidgetBitmap(r8, r1, r5)
            if (r1 != r4) goto L3c
            return r4
        L37:
            int r7 = r5.I$0
            X.Hwg.A00(r1)
        L3c:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L5b
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.I$0 = r7
            r5.label = r3
            java.lang.Object r1 = r6.save(r7, r1, r5)
            if (r1 != r4) goto L23
            return r4
        L50:
            com.facebook.aura.widgets.ListWidgetIcons$download$1 r5 = new com.facebook.aura.widgets.ListWidgetIcons$download$1
            r5.<init>(r9)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetIcons.download(int, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final int getSizePx() {
        return this.sizePx;
    }

    public final Object save(int i, Bitmap bitmap, HtJ<? super String> htJ) {
        return WidgetContentLock.INSTANCE.writeIfEnabled(this.context, this.widget.getReceiver(), new AnonymousClass2(i, bitmap, null), htJ);
    }

    public ListWidgetIcons(Context context, ListWidget listWidget, String str, long j) {
        AnonymousClass005.A0x(context, listWidget, str);
        this.context = context;
        this.widget = listWidget;
        this.batch = str;
        this.generation = j;
        this.sizePx = Ab3.A01(40.0f * C60Q.A0B(context).density);
    }
}
