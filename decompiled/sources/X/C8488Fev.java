package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fev, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8488Fev extends WindowInsetsAnimation.Callback {
    public ArrayList<C8490Fex> A00;
    public List<C8490Fex> A01;
    public final HashMap<WindowInsetsAnimation, C8490Fex> A02;
    public final AbstractC8493Ff0 A03;

    public C8488Fev(AbstractC8493Ff0 abstractC8493Ff0) {
        super(abstractC8493Ff0.A01);
        this.A02 = BV4.A0u();
        this.A03 = abstractC8493Ff0;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC8493Ff0 abstractC8493Ff0 = this.A03;
        HashMap<WindowInsetsAnimation, C8490Fex> map = this.A02;
        C8490Fex c8490FexA00 = map.get(windowInsetsAnimation);
        if (c8490FexA00 == null) {
            c8490FexA00 = C8490Fex.A00(windowInsetsAnimation);
            map.put(windowInsetsAnimation, c8490FexA00);
        }
        abstractC8493Ff0.A05(c8490FexA00);
        map.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC8493Ff0 abstractC8493Ff0 = this.A03;
        HashMap<WindowInsetsAnimation, C8490Fex> map = this.A02;
        C8490Fex c8490FexA00 = map.get(windowInsetsAnimation);
        if (c8490FexA00 == null) {
            c8490FexA00 = C8490Fex.A00(windowInsetsAnimation);
            map.put(windowInsetsAnimation, c8490FexA00);
        }
        abstractC8493Ff0.A06(c8490FexA00);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
        ArrayList<C8490Fex> arrayList = this.A00;
        if (arrayList == null) {
            ArrayList<C8490Fex> arrayListA0t = C60Q.A0t(list);
            this.A00 = arrayListA0t;
            this.A01 = Collections.unmodifiableList(arrayListA0t);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A03.A04(AbstractC7607F5u.A0j(windowInsets), this.A01).A02();
            }
            WindowInsetsAnimation windowInsetsAnimation = list.get(size);
            HashMap<WindowInsetsAnimation, C8490Fex> map = this.A02;
            C8490Fex c8490FexA00 = map.get(windowInsetsAnimation);
            if (c8490FexA00 == null) {
                c8490FexA00 = C8490Fex.A00(windowInsetsAnimation);
                map.put(windowInsetsAnimation, c8490FexA00);
            }
            c8490FexA00.A00.A09(windowInsetsAnimation.getFraction());
            this.A00.add(c8490FexA00);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AbstractC8493Ff0 abstractC8493Ff0 = this.A03;
        HashMap<WindowInsetsAnimation, C8490Fex> map = this.A02;
        C8490Fex c8490FexA00 = map.get(windowInsetsAnimation);
        if (c8490FexA00 == null) {
            c8490FexA00 = C8490Fex.A00(windowInsetsAnimation);
            map.put(windowInsetsAnimation, c8490FexA00);
        }
        return abstractC8493Ff0.A03(C8492Fez.A00(bounds), c8490FexA00).A01();
    }
}
