package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.WindowInsetsRulers;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* renamed from: X.Amd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC1611Amd extends AbstractC8493Ff0 implements Runnable, FPU, View.OnAttachStateChangeListener {
    public static final String __redex_internal_original_name = "InsetsListener";
    public int A00;
    public C8497Ff4 A01;
    public boolean A02;
    public final C0912AHo<MutableState<Rect>> A03;
    public final AbstractC0915AHr<Object, C1581Alw> A04;
    public final C00r A05;
    public final SnapshotStateList<InterfaceC1601AmT> A06;
    public final AndroidComposeView A07;

    public RunnableC1611Amd(AndroidComposeView androidComposeView) {
        super(1);
        this.A07 = androidComposeView;
        C0918AHu c0918AHu = new C0918AHu(9);
        C1612Ame c1612Ame = WindowInsetsRulers.A00;
        A00(c0918AHu, C1612Ame.A00, "caption bar");
        A00(c0918AHu, C1612Ame.A01, "display cutout");
        A00(c0918AHu, C1612Ame.A02, "ime");
        A00(c0918AHu, C1612Ame.A03, "mandatory system gestures");
        A00(c0918AHu, C1612Ame.A04, "navigation bars");
        A00(c0918AHu, C1612Ame.A05, "status bars");
        A00(c0918AHu, C1612Ame.A06, "system gestures");
        A00(c0918AHu, C1612Ame.A07, "tappable element");
        A00(c0918AHu, C1612Ame.A08, "waterfall");
        this.A04 = c0918AHu;
        this.A05 = new ParcelableSnapshotMutableIntState(0);
        this.A03 = new C0912AHo<>(4);
        this.A06 = new SnapshotStateList();
    }

    @Override // X.AbstractC8493Ff0
    public final void A05(C8490Fex c8490Fex) {
        this.A02 = false;
        int iA07 = c8490Fex.A00.A07();
        this.A00 &= iA07 ^ (-1);
        this.A01 = null;
        WindowInsetsRulers windowInsetsRulersA04 = AbstractC1602AmU.A00.A04(iA07);
        if (windowInsetsRulersA04 != null) {
            C1581Alw c1581AlwA05 = this.A04.A05(windowInsetsRulersA04);
            C7384Etj.A0X(c1581AlwA05);
            C1581Alw c1581Alw = c1581AlwA05;
            C00q c00q = c1581Alw.A05;
            c00q.AdS(0.0f);
            c1581Alw.A04.AdS(1.0f);
            c1581Alw.A06.Adh(0L);
            c00q.AdS(0.0f);
            MutableState.A09(false, c1581Alw.A07);
            c1581Alw.A02 = -1L;
            c1581Alw.A03 = -1L;
            C00r c00r = this.A05;
            c00r.AdX(c00r.AGd() + 1);
            Snapshot.A05();
        }
    }

    @Override // X.AbstractC8493Ff0
    public final void A06(C8490Fex c8490Fex) {
        this.A02 = true;
    }

    public static void A00(C0918AHu c0918AHu, Object obj, String str) {
        c0918AHu.A0E(obj, new C1581Alw(str));
    }

    public static final void A01(C1581Alw c1581Alw, C8490Fex c8490Fex) {
        c1581Alw.A05.AdS(c8490Fex.A00.A06());
        c1581Alw.A04.AdS(c8490Fex.A00.A05());
        c1581Alw.A06.Adh(c8490Fex.A00.A08());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[PHI: r16
  0x008a: PHI (r16v19 boolean) = (r16v17 boolean), (r16v26 boolean) binds: [B:12:0x007c, B:14:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[PHI: r16
  0x00b9: PHI (r16v21 boolean) = (r16v20 boolean), (r16v20 boolean), (r16v24 boolean) binds: [B:16:0x008c, B:18:0x00ab, B:20:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5 A[PHI: r16 r24
  0x00d5: PHI (r16v16 boolean) = (r16v15 boolean), (r16v17 boolean) binds: [B:6:0x0030, B:26:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00d5: PHI (r24v6 boolean) = (r24v5 boolean), (r24v7 boolean) binds: [B:6:0x0030, B:26:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(X.C8497Ff4 r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1611Amd.A02(X.Ff4):void");
    }

    @Override // X.AbstractC8493Ff0
    public final C8492Fez A03(C8492Fez c8492Fez, C8490Fex c8490Fex) {
        C8497Ff4 c8497Ff4 = this.A01;
        this.A02 = false;
        this.A01 = null;
        if (c8490Fex.A00.A08() > 0 && c8497Ff4 != null) {
            int iA07 = c8490Fex.A00.A07();
            this.A00 |= iA07;
            WindowInsetsRulers windowInsetsRulersA04 = AbstractC1602AmU.A00.A04(iA07);
            if (windowInsetsRulersA04 != null) {
                C1581Alw c1581AlwA05 = this.A04.A05(windowInsetsRulersA04);
                C7384Etj.A0X(c1581AlwA05);
                C1581Alw c1581Alw = c1581AlwA05;
                C8345FcJ c8345FcJA04 = c8497Ff4.A00.A04(iA07);
                long j = c8345FcJA04.A00 | (c8345FcJA04.A01 << 48) | (c8345FcJA04.A03 << 32) | (c8345FcJA04.A02 << 16);
                long j2 = c1581Alw.A00;
                if (j != j2) {
                    c1581Alw.A02 = j2;
                    c1581Alw.A03 = j;
                    MutableState.A09(true, c1581Alw.A07);
                    A01(c1581Alw, c8490Fex);
                    C00r c00r = this.A05;
                    c00r.AdX(c00r.AGd() + 1);
                    Snapshot.A05();
                }
            }
        }
        return c8492Fez;
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        if (this.A02) {
            this.A01 = c8497Ff4;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (this.A00 == 0) {
            A02(c8497Ff4);
            return c8497Ff4;
        }
        return c8497Ff4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A02) {
            this.A00 = 0;
            this.A02 = false;
            C8497Ff4 c8497Ff4 = this.A01;
            if (c8497Ff4 != null) {
                A02(c8497Ff4);
                this.A01 = null;
            }
        }
    }

    @Override // X.AbstractC8493Ff0
    public final C8497Ff4 A04(C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8490Fex c8490Fex = list.get(i);
            WindowInsetsRulers windowInsetsRulersA04 = AbstractC1602AmU.A00.A04(c8490Fex.A00.A07());
            if (windowInsetsRulersA04 != null) {
                C1581Alw c1581AlwA05 = this.A04.A05(windowInsetsRulersA04);
                C7384Etj.A0X(c1581AlwA05);
                C1581Alw c1581Alw = c1581AlwA05;
                if (MutableState.A0A(c1581Alw.A07)) {
                    A01(c1581Alw, c8490Fex);
                }
            }
        }
        A02(c8497Ff4);
        return c8497Ff4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view = view2;
        }
        AbstractC8082FSn.A00(view, this);
        C8490Fex.A01(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view = view2;
        }
        AbstractC8082FSn.A00(view, null);
        C8490Fex.A01(view, null);
    }
}
