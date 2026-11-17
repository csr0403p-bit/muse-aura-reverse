package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.FaE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8238FaE extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ C8235FaB A01;

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C8235FaB c8235FaB = this.A01;
            view = c8235FaB.A02.inflate(c8235FaB.A00, viewGroup, false);
        }
        InterfaceC8332Fbz interfaceC8332Fbz = (InterfaceC8332Fbz) view;
        C8249FaR c8249FaR = this.A01.A05;
        c8249FaR.A05();
        ArrayList<C8252FaX> arrayList = c8249FaR.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        interfaceC8332Fbz.ANf(AbstractC7607F5u.A0g(arrayList, i));
        return view;
    }

    public C8238FaE(C8235FaB c8235FaB) {
        this.A01 = c8235FaB;
        A00();
    }

    private final void A00() {
        int i;
        C8249FaR c8249FaR = this.A01.A05;
        C8252FaX c8252FaX = c8249FaR.A04;
        if (c8252FaX != null) {
            c8249FaR.A05();
            ArrayList<C8252FaX> arrayList = c8249FaR.A08;
            int size = arrayList.size();
            i = 0;
            while (i < size) {
                if (arrayList.get(i) == c8252FaX) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C8249FaR c8249FaR = this.A01.A05;
        c8249FaR.A05();
        int size = c8249FaR.A08.size();
        return this.A00 >= 0 ? size - 1 : size;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        C8249FaR c8249FaR = this.A01.A05;
        c8249FaR.A05();
        ArrayList<C8252FaX> arrayList = c8249FaR.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return AbstractC7607F5u.A0g(arrayList, i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00();
        super.notifyDataSetChanged();
    }
}
