package X;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidget;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.DispatchException;

/* renamed from: X.7Bf, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7Bf extends C7438Evz implements G0V {
    public C7Bf(Object obj) {
        super(2, obj, C7Bg.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws DispatchException {
        G0U g0u = (G0U) obj;
        HtJ htJ = (HtJ) obj2;
        final EIN ein = (EIN) this.receiver;
        if ((ein.inCompatibilityMode() && ein.isOpenInternal$room_runtime() && ein.inTransaction()) || htJ.getContext().get(C78J.A00) == null) {
            return g0u.invoke(htJ);
        }
        final C07228ib c07228ib = new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) g0u, (HtJ<? super C07228ib>) 20);
        C06757Bd c06757Bd = (C06757Bd) htJ.getContext().get(C06757Bd.A01);
        if (c06757Bd != null) {
            return GAo.A00(htJ, c06757Bd.A00, c07228ib);
        }
        final GBL gblA03 = C7Bm.A03(htJ);
        try {
            ein.getTransactionExecutor().execute(new Runnable() { // from class: X.7Bc
                public static final String __redex_internal_original_name = "RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1";

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        HtJ htJ2 = gblA03;
                        AbstractC9245GAx.A00(htJ2.getContext().minusKey(InterfaceC10590Hxd.A00), new C07298ii((Object) htJ2, (GlanceAppWidget) ein, (Context) c07228ib, (C6PP) null, (HtJ<? super C07298ii>) 11));
                    } catch (Throwable th) {
                        gblA03.A5x(th);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            gblA03.A5x(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return gblA03.A0F();
    }
}
