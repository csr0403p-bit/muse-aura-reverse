package X;

import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidget;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class Awn {
    /* JADX WARN: Incorrect types in method signature: (LX/F2N;LX/Huf;LX/G0V<-LX/3UX;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(EnumC10573Huf enumC10573Huf, F2N f2n, HtJ htJ, G0V g0v) {
        Object objA00;
        if (enumC10573Huf != EnumC10573Huf.A04) {
            return (((C5303Dfm) f2n).A01 == EnumC10573Huf.A03 || (objA00 = Hxb.A00(new C07298ii((Object) g0v, (GlanceAppWidget) enumC10573Huf, (Context) f2n, (C6PP) null, (HtJ<? super C07298ii>) 10), htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objA00;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
