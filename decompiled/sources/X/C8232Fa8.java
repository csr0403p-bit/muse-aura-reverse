package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.Fa8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8232Fa8 extends BaseAdapter {
    public C8249FaR A00;
    public boolean A01;
    public int A02 = -1;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r2 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r1 = r5.A04
            int r0 = r5.A03
            android.view.View r7 = r1.inflate(r0, r8, r2)
        Lb:
            X.FaX r0 = r5.getItem(r6)
            int r4 = r0.getGroupId()
            int r0 = r6 + (-1)
            if (r0 < 0) goto L44
            X.FaX r0 = r5.getItem(r0)
            int r1 = r0.getGroupId()
        L1f:
            r3 = r7
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.FaR r0 = r5.A00
            boolean r0 = r0.A0E()
            r2 = 1
            if (r0 == 0) goto L2e
            r0 = 1
            if (r4 != r1) goto L2f
        L2e:
            r0 = 0
        L2f:
            r3.setGroupDividerEnabled(r0)
            r1 = r7
            X.Fbz r1 = (X.InterfaceC8332Fbz) r1
            boolean r0 = r5.A01
            if (r0 == 0) goto L3c
            r3.setForceShowIcon(r2)
        L3c:
            X.FaX r0 = r5.getItem(r6)
            r1.ANf(r0)
            return r7
        L44:
            r1 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8232Fa8.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private final void A00() {
        int i;
        C8249FaR c8249FaR = this.A00;
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
        this.A02 = i;
    }

    @Override // android.widget.Adapter
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C8252FaX getItem(int i) {
        ArrayList<C8252FaX> arrayListA04;
        boolean z = this.A05;
        C8249FaR c8249FaR = this.A00;
        if (z) {
            c8249FaR.A05();
            arrayListA04 = c8249FaR.A08;
        } else {
            arrayListA04 = c8249FaR.A04();
        }
        int i2 = this.A02;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return AbstractC7607F5u.A0g(arrayListA04, i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C8252FaX> arrayListA04;
        boolean z = this.A05;
        C8249FaR c8249FaR = this.A00;
        if (z) {
            c8249FaR.A05();
            arrayListA04 = c8249FaR.A08;
        } else {
            arrayListA04 = c8249FaR.A04();
        }
        int i = this.A02;
        int size = arrayListA04.size();
        return i >= 0 ? size - 1 : size;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C8232Fa8(LayoutInflater layoutInflater, C8249FaR c8249FaR, int i, boolean z) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A00 = c8249FaR;
        this.A03 = i;
        A00();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00();
        super.notifyDataSetChanged();
    }
}
