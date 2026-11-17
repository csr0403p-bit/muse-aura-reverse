package X;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.state.GlanceState;
import kotlin.Unit;

/* renamed from: X.6yr, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6yr {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/content/Context;LX/6PQ<TT;>;LX/6PP;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    public static final Object A00(Context context, C6PP c6pp, C6PQ c6pq, HtJ htJ) {
        if (c6pp instanceof C6vW) {
            return GlanceState.A00.AMM(context, c6pq, FGI.A0H("appWidget-", ((C6vW) c6pp).A00), htJ);
        }
        throw C60O.A0i("The glance ID is not the one of an App Widget");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/6PP;LX/G0V<-LX/6O2;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A01(Context context, C6PP c6pp, HtJ htJ, G0V g0v) throws Throwable {
        C6PE c6pe = C6PE.A00;
        C07228ib c07228ib = new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) g0v, (HtJ<? super C07228ib>) 13);
        if (!(c6pp instanceof C6vW)) {
            throw C60O.A0i("The glance ID is not the one of an App Widget");
        }
        Object objA02 = GlanceState.A00.A02(context, c6pe, FGI.A0H("appWidget-", ((C6vW) c6pp).A00), htJ, c07228ib);
        return objA02 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA02;
    }
}
