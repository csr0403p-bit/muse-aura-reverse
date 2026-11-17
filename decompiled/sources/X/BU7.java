package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU7 extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU7(Object obj, AT5<T, V> at5, T t, HtJ<? super BU7> htJ) {
        super(1, t);
        this.$t = htJ;
        this.A02 = obj;
        this.A01 = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        Object obj;
        Object obj2;
        int i;
        switch (this.$t) {
            case 0:
                obj = this.A02;
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                obj = this.A02;
                obj2 = this.A01;
                i = 1;
                break;
            case 2:
                obj = this.A02;
                obj2 = this.A01;
                i = 2;
                break;
            case 3:
                obj = this.A02;
                obj2 = this.A01;
                i = 3;
                break;
            case 4:
                obj = this.A02;
                obj2 = this.A01;
                i = 4;
                break;
            default:
                return new BU7(this.A02, this.A01, htJ, 5);
        }
        return new BU7(obj, obj2, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BU7) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final BNM bnmInvoke;
        Object objA6U;
        MutableState mutableState;
        switch (this.$t) {
            case 0:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                AT5 at5 = (AT5) this.A02;
                AT5.A02(at5);
                objA6U = AT5.A01(at5, this.A01);
                at5.A04.A05.Af8(objA6U);
                mutableState = at5.A0B;
                mutableState.Af8(objA6U);
                return Unit.INSTANCE;
            case 1:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    Object obj2 = this.A02;
                    C2292BSs c2292BSsA00 = C2292BSs.A00(obj2, 22);
                    BUC buc = new BUC(obj2, (HtJ) null, this.A01, (HtJ<? super BUC>) 6);
                    this.A00 = 1;
                    if (AnchoredDraggableKt.A04(this, c2292BSsA00, buc) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A02;
                MutableState mutableState2 = anchoredDraggableState.A09;
                InterfaceC1153Acj interfaceC1153AcjA0T = C8j4.A0T(mutableState2);
                C00q c00q = anchoredDraggableState.A08;
                objA6U = interfaceC1153AcjA0T.A6U(c00q.AFn());
                if (objA6U != null) {
                    if (C8j3.A01(c00q.AFn(), C8j4.A0T(mutableState2).AYD(objA6U)) < 0.5f && AnonymousClass003.A1X(objA6U, anchoredDraggableState.A03)) {
                        anchoredDraggableState.A0C.Af8(objA6U);
                        mutableState = anchoredDraggableState.A0A;
                        mutableState.Af8(objA6U);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                Object obj3 = EnumC10460Hji.A02;
                try {
                    if (this.A00 != 0) {
                        Hwg.A00(obj);
                    } else {
                        Hwg.A00(obj);
                        final C1790Ar9 c1790Ar9 = new C1790Ar9();
                        final Ar6 ar6 = (Ar6) this.A02;
                        Object obj4 = this.A01;
                        BTB btb = new BTB(14, ar6, obj4);
                        BTB btb2 = new BTB(15, ar6, obj4);
                        View view = ar6.A03;
                        C7do c7do = new C7do(view, c1790Ar9, btb, btb2);
                        G0U<BNM, BNM> g0u = ar6.A06;
                        if (g0u == null || (bnmInvoke = g0u.invoke(c7do)) == null) {
                            bnmInvoke = c7do;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new Ar8(bnmInvoke), 1);
                            if (actionModeStartActionMode != null) {
                                ar6.A00 = actionModeStartActionMode;
                            }
                            return Unit.INSTANCE;
                        }
                        Runnable runnable = ar6.A02;
                        if (runnable == null) {
                            runnable = new Runnable() { // from class: X.Ar7
                                public static final String __redex_internal_original_name = "AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Ar6 ar62 = ar6;
                                    BNM bnm = bnmInvoke;
                                    C1790Ar9 c1790Ar92 = c1790Ar9;
                                    ActionMode actionModeStartActionMode2 = ar62.A03.startActionMode(new Ar8(bnm), 1);
                                    C7384Etj.areEqual(ar62.A00, actionModeStartActionMode2);
                                    if (actionModeStartActionMode2 == null) {
                                        c1790Ar92.close();
                                    }
                                }
                            };
                            ar6.A02 = runnable;
                        }
                        view.post(runnable);
                        this.A00 = 1;
                        Object objAZg = c1790Ar9.A00.AZg(this);
                        if (objAZg != obj3) {
                            objAZg = Unit.INSTANCE;
                        }
                        if (objAZg == obj3) {
                            return obj3;
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    final Ar6 ar62 = (Ar6) this.A02;
                    ar62.A04.A01();
                    Object objMyLooper = Looper.myLooper();
                    View view2 = ar62.A03;
                    Handler handler2 = view2.getHandler();
                    if (objMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable2 = ar62.A01;
                        if (runnable2 == null) {
                            runnable2 = new Runnable() { // from class: X.ArA
                                public static final String __redex_internal_original_name = "AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ActionMode actionMode = ar62.A00;
                                    if (actionMode != null) {
                                        actionMode.finish();
                                    }
                                }
                            };
                            ar62.A01 = runnable2;
                        }
                        view2.post(runnable2);
                    } else {
                        ActionMode actionMode = ar62.A00;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    Runnable runnable3 = ar62.A02;
                    if (runnable3 != null) {
                        view2.removeCallbacks(runnable3);
                    }
                    ar62.A00 = null;
                }
            case 3:
                Object obj5 = EnumC10460Hji.A02;
                try {
                    if (this.A00 != 0) {
                        Hwg.A00(obj);
                    } else {
                        Hwg.A00(obj);
                        Ar4 ar4 = (Ar4) this.A02;
                        Ar5 ar5 = (Ar5) this.A01;
                        ar4.A00.Af8(ar5);
                        this.A00 = 1;
                        Object objAZg2 = ar5.A01.AZg(this);
                        if (objAZg2 != obj5) {
                            objAZg2 = Unit.INSTANCE;
                        }
                        if (objAZg2 == obj5) {
                            return obj5;
                        }
                    }
                    ((Ar4) this.A02).A00.Af8(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ((Ar4) this.A02).A00.Af8(null);
                    throw th;
                }
            case 4:
                Object objA00 = obj;
                EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    AsyncFontListLoader asyncFontListLoader = (AsyncFontListLoader) this.A02;
                    B9B b9b = (B9B) this.A01;
                    this.A00 = 1;
                    objA00 = asyncFontListLoader.A00(b9b, this);
                    if (objA00 == enumC10460Hji2) {
                        return enumC10460Hji2;
                    }
                }
                return objA00;
            default:
                EnumC10460Hji enumC10460Hji3 = EnumC10460Hji.A02;
                try {
                    if (this.A00 != 0) {
                        Hwg.A00(obj);
                    } else {
                        Hwg.A00(obj);
                        BU6 bu6A0M = BU6.A0M((B98) this.A02, (B9B) this.A01, null, 41);
                        this.A00 = 1;
                        obj = GAX.A00(this, bu6A0M, 15000L);
                        if (obj == enumC10460Hji3) {
                            return enumC10460Hji3;
                        }
                    }
                    if (obj != null) {
                        return obj;
                    }
                    throw C3cG.A0Q(C8j3.A14(this.A01, C60O.A0x("Unable to load font ")));
                } catch (Exception e) {
                    throw new IllegalStateException(C8j3.A14(this.A01, C60O.A0x("Unable to load font ")), e);
                }
        }
    }
}
