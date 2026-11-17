package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.PopupWindow;
import com.facebook.aura.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FHj<T extends View, U> implements InterfaceC7833FGo<FDW, T, U> {
    public final FBB A00;
    public final FHi<T, U> A01;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        FLU flu;
        KeyEvent.Callback callback = (View) obj;
        FDW fdw = (FDW) obj2;
        FHi<T, U> fHi = this.A01;
        FBB fbb = this.A00;
        if (fHi instanceof C7935FLh) {
            C8117FUh c8117FUh = (C8117FUh) callback;
            C7384Etj.A0Y(c8117FUh, 0);
            int childCount = c8117FUh.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c8117FUh.getChildAt(i);
                if (childAt instanceof FGR) {
                    ((FGR) childAt).setMountInput(null);
                    C8117FUh.A04(c8117FUh, false, false);
                    return;
                }
            }
            throw C3cG.A0Q("SwipeRefreshLayout does not contain RenderTreeHostView child");
        }
        if (fHi instanceof C7810FFr) {
            C7810FFr c7810FFr = (C7810FFr) fHi;
            F0C f0c = ((C7809FFq) AbstractC7608F5v.A0i(c7810FFr.A00, c7810FFr.A01)).A04;
            ((C7813FFu) f0c.getValue()).A00();
            ((C7813FFu) f0c.getValue()).A01 = false;
            return;
        }
        if (fHi instanceof C7917FKp) {
            AbsSeekBar absSeekBar = (AbsSeekBar) callback;
            AnonymousClass005.A0x(absSeekBar, fbb, fdw);
            C7918FKq c7918FKq = (C7918FKq) FBA.A05(fbb, fdw);
            if (c7918FKq == null) {
                throw BV4.A0c("SliderController is null even though a controller is defined");
            }
            absSeekBar.setThumb(c7918FKq.A0A);
            absSeekBar.setThumbOffset(c7918FKq.A01);
            if (c7918FKq.A0M) {
                absSeekBar.setBackground(c7918FKq.A0B);
            }
            FGE fge = c7918FKq.A0I;
            if (fge != null) {
                fge.setMountInput(null);
            }
            c7918FKq.A0H = null;
            c7918FKq.A0J = null;
            c7918FKq.A08 = 0;
            c7918FKq.A04 = 0;
            c7918FKq.A00 = 0;
            c7918FKq.A03 = 0;
            c7918FKq.A06 = 0;
            c7918FKq.A05 = 0;
            c7918FKq.A07 = 0;
            c7918FKq.A0A = null;
            c7918FKq.A0B = null;
            c7918FKq.A01 = 0;
            c7918FKq.A0M = false;
            c7918FKq.A0C = null;
            c7918FKq.A0D = null;
            c7918FKq.A0E = null;
            c7918FKq.A0F = null;
            c7918FKq.A0K = false;
            c7918FKq.A0I = null;
            c7918FKq.A09 = null;
            c7918FKq.A0G = null;
            return;
        }
        if (fHi instanceof FEX) {
            FGV fgv = (FGV) callback;
            AnonymousClass003.A0v(fgv, fdw);
            String strA0p = AbstractC7608F5v.A0p(fdw);
            if (strA0p != null) {
                Queue<C7615F6r> queue = AbstractC10520Hol.A00.get(strA0p);
                if (queue != null) {
                    Iterator<C7615F6r> it = queue.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().A00 == fgv) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                fgv.A02 = null;
                fgv.A01 = null;
                fgv.A03 = null;
                fgv.A04 = null;
                fgv.A09.setRenderResult(null, null);
                return;
            }
            return;
        }
        if (fHi instanceof FMP) {
            ((FJJ) callback).Aez(1.0f);
            return;
        }
        if (!(fHi instanceof FR5)) {
            if (fHi instanceof FEW) {
                FEW few = (FEW) fHi;
                AnonymousClass003.A0x(fbb, fdw);
                Object objA05 = FBA.A05(fbb, fdw);
                if (!(objA05 instanceof FLU) || (flu = (FLU) objA05) == null) {
                    throw BV4.A0c("Popup container defines a controller but none was found");
                }
                few.A00.removeCallbacksAndMessages(null);
                PopupWindow popupWindow = flu.A00;
                View contentView = popupWindow.getContentView();
                C1H.A00(contentView);
                FGR.A01(null, contentView);
                popupWindow.dismiss();
                return;
            }
            return;
        }
        FSU fsu = (FSU) callback;
        C7384Etj.A0Y(fsu, 0);
        FST fst = fsu.A00;
        if (fst.A02 - 1.0f > 0.05f) {
            HxE hxEA00 = FST.A00(fst, 1.0f);
            FST.A04(fst, 1.0d, AnonymousClass001.A02(hxEA00.first), AnonymousClass001.A02(hxEA00.second), true);
        }
        fst.A0E = null;
        fst.A0I = null;
        fst.A0O = null;
        fst.A0M = null;
        fst.A0N = null;
        fst.A0Q = false;
        fst.A09 = 0;
        fst.A0A = 0;
        fst.A0H.A09.remove(fst);
        fst.A0F.A09.remove(fst);
        fst.A0G.A09.remove(fst);
        fst.A09(C79.A00);
        fst.A06 = 4.0f;
        fsu.A01.setMountInput(null);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FHi<TT;TU;>;LX/FBB;)V */
    public FHj(FBB fbb, FHi fHi) {
        this.A01 = fHi;
        this.A00 = fbb;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        String str;
        View view = (View) AbstractC7608F5v.A0k(context, obj);
        FDW fdw = (FDW) obj2;
        FHi<T, U> fHi = this.A01;
        FBB fbb = this.A00;
        if (!(fHi instanceof FEX)) {
            return null;
        }
        FGV fgv = (FGV) view;
        AnonymousClass003.A0u(fgv, fbb);
        C7384Etj.A0Y(fdw, 2);
        String strA0p = AbstractC7608F5v.A0p(fdw);
        if (strA0p != null && (str = (String) FBB.A01(fbb, R.id.bk_screen_container_id)) != null) {
            Map<String, Queue<C7615F6r>> map = AbstractC10520Hol.A00;
            Queue<C7615F6r> queueA0y = map.get(strA0p);
            if (queueA0y == null) {
                queueA0y = BV4.A0y();
                map.put(strA0p, queueA0y);
            }
            Queue<C7615F6r> queue = queueA0y;
            queue.add(new C7615F6r(fgv, str));
            while (queue.size() > 2) {
                queue.poll();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
