package X;

import androidx.glance.appwidget.GlanceAppWidgetKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetKt", f = "GlanceAppWidget.kt", l = {299}, m = "provideContent", v = 1)
/* renamed from: X.77V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77V extends HzP {
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GlanceAppWidgetKt.A01(this, null);
    }

    public C77V(HtJ<? super C77V> htJ) {
        super(htJ);
    }
}
