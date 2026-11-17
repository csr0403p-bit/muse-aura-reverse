package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.facebook.aura.R;
import java.util.ArrayList;

/* renamed from: X.FaJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8243FaJ implements InterfaceC8291FbF, InterfaceC8346FcK {
    public int A00;
    public Context A01;
    public Context A02;
    public Drawable A03;
    public LayoutInflater A04;
    public LayoutInflater A05;
    public C8249FaR A06;
    public InterfaceC8331Fby A07;
    public InterfaceC8337Fc4 A08;
    public C8240FaG A09;
    public C8313Fbf A0A;
    public RunnableC8245FaN A0B;
    public FY0 A0C;
    public C8242FaI A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public final SparseBooleanArray A0L = new SparseBooleanArray();
    public final C8247FaP A0K = new C8247FaP(this);

    public final boolean A02() {
        Object obj;
        RunnableC8245FaN runnableC8245FaN = this.A0B;
        if (runnableC8245FaN == null || (obj = this.A08) == null) {
            C8242FaI c8242FaI = this.A0D;
            if (c8242FaI == null) {
                return false;
            }
            AbstractC8231Fa7 abstractC8231Fa7 = c8242FaI.A03;
            if (abstractC8231Fa7 != null && abstractC8231Fa7.AP1()) {
                c8242FaI.A03.dismiss();
                return true;
            }
        } else {
            ((View) obj).removeCallbacks(runnableC8245FaN);
            this.A0B = null;
        }
        return true;
    }

    public final boolean A03() {
        AbstractC8231Fa7 abstractC8231Fa7;
        C8242FaI c8242FaI = this.A0D;
        return (c8242FaI == null || (abstractC8231Fa7 = c8242FaI.A03) == null || !abstractC8231Fa7.AP1()) ? false : true;
    }

    public final boolean A04() {
        C8249FaR c8249FaR;
        if (!this.A0G || A03() || (c8249FaR = this.A06) == null || this.A08 == null || this.A0B != null) {
            return false;
        }
        c8249FaR.A05();
        if (c8249FaR.A08.isEmpty()) {
            return false;
        }
        RunnableC8245FaN runnableC8245FaN = new RunnableC8245FaN(new C8242FaI(this.A01, this.A0C, this.A06, this), this);
        this.A0B = runnableC8245FaN;
        ((View) this.A08).post(runnableC8245FaN);
        return true;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean A6W(C8252FaX c8252FaX) {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABB(C8252FaX c8252FaX) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8 A[PHI: r9 r15 r16
  0x00d8: PHI (r9v3 int) = (r9v1 int), (r9v5 int), (r9v5 int) binds: [B:44:0x00a8, B:49:0x00c4, B:50:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r15v3 boolean) = (r15v1 boolean), (r15v5 boolean), (r15v5 boolean) binds: [B:44:0x00a8, B:49:0x00c4, B:50:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r16v3 int) = (r16v1 int), (r16v5 int), (r16v5 int) binds: [B:44:0x00a8, B:49:0x00c4, B:50:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC8291FbF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ABf() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8243FaJ.ABf():boolean");
    }

    @Override // X.InterfaceC8291FbF
    public final void ANd(Context context, C8249FaR c8249FaR) {
        this.A01 = context;
        this.A04 = LayoutInflater.from(context);
        this.A06 = c8249FaR;
        Resources resources = context.getResources();
        if (!this.A0H) {
            this.A0G = true;
        }
        this.A0J = C60Q.A0B(context).widthPixels / 2;
        this.A00 = AbstractC10491Hlv.A00(context);
        int measuredWidth = this.A0J;
        if (this.A0G) {
            if (this.A0C == null) {
                FY0 fy0 = new FY0(this.A02, this);
                this.A0C = fy0;
                if (this.A0F) {
                    fy0.setImageDrawable(this.A03);
                    this.A03 = null;
                    this.A0F = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0C.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.A0C.getMeasuredWidth();
        } else {
            this.A0C = null;
        }
        this.A0I = measuredWidth;
        resources.getDisplayMetrics();
    }

    @Override // X.InterfaceC8291FbF
    public final void Acz(InterfaceC8331Fby interfaceC8331Fby) {
        this.A07 = interfaceC8331Fby;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC8291FbF
    public final void Ahy() {
        ArrayList<C8252FaX> arrayList;
        ViewGroup viewGroup = (ViewGroup) this.A08;
        if (viewGroup != null) {
            C8249FaR c8249FaR = this.A06;
            int i = 0;
            if (c8249FaR != null) {
                c8249FaR.A05();
                ArrayList<C8252FaX> arrayListA04 = this.A06.A04();
                int size = arrayListA04.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayListA04, i3);
                    if ((c8252FaXA0g.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        C8252FaX itemData = childAt instanceof InterfaceC8332Fbz ? ((InterfaceC8332Fbz) childAt).getItemData() : null;
                        View viewA00 = A00(childAt, viewGroup, c8252FaXA0g);
                        if (c8252FaXA0g != itemData) {
                            viewA00.setPressed(false);
                            viewA00.jumpDrawablesToCurrentState();
                        }
                        if (viewA00 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA00.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA00);
                            }
                            ((ViewGroup) this.A08).addView(viewA00, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0C) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A08).requestLayout();
        C8249FaR c8249FaR2 = this.A06;
        boolean z = false;
        if (c8249FaR2 != null) {
            c8249FaR2.A05();
            ArrayList<C8252FaX> arrayList2 = c8249FaR2.A06;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC8327Fbt abstractC8327Fbt = AbstractC7607F5u.A0g(arrayList2, i4).A0D;
                if (abstractC8327Fbt != null) {
                    abstractC8327Fbt.A00 = this;
                }
            }
        }
        C8249FaR c8249FaR3 = this.A06;
        if (c8249FaR3 != null) {
            c8249FaR3.A05();
            arrayList = c8249FaR3.A08;
        } else {
            arrayList = null;
        }
        if (this.A0G && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !AbstractC7607F5u.A0g(arrayList, 0).isActionViewExpanded();
            } else if (size3 > 0) {
                z = true;
            }
        }
        FY0 fy0 = this.A0C;
        if (z) {
            if (fy0 == null) {
                fy0 = new FY0(this.A02, this);
                this.A0C = fy0;
            }
            ViewGroup viewGroup3 = (ViewGroup) fy0.getParent();
            if (viewGroup3 != this.A08) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0C);
                }
                ViewGroup viewGroup4 = (ViewGroup) this.A08;
                FY0 fy02 = this.A0C;
                C8315Fbh c8315Fbh = new C8315Fbh(-2, -2);
                c8315Fbh.A04 = false;
                ((LinearLayout.LayoutParams) c8315Fbh).gravity = 16;
                c8315Fbh.A04 = true;
                viewGroup4.addView(fy02, c8315Fbh);
            }
        } else if (fy0 != null) {
            Object parent = fy0.getParent();
            Object obj = this.A08;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.A0C);
            }
        }
        ((ActionMenuView) this.A08).A06 = this.A0G;
    }

    public C8243FaJ(Context context) {
        this.A02 = context;
        this.A05 = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View A00(View view, ViewGroup viewGroup, C8252FaX c8252FaX) {
        View actionView = c8252FaX.getActionView();
        if (actionView == null || c8252FaX.A01()) {
            boolean z = view instanceof InterfaceC8332Fbz;
            Object objInflate = view;
            if (!z) {
                objInflate = this.A05.inflate(R.layout._name_removed__res_0x7f0d0001, viewGroup, false);
            }
            InterfaceC8332Fbz interfaceC8332Fbz = (InterfaceC8332Fbz) objInflate;
            interfaceC8332Fbz.ANf(c8252FaX);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC8332Fbz;
            actionMenuItemView.A01 = (ActionMenuView) this.A08;
            C8313Fbf c8313Fbf = this.A0A;
            if (c8313Fbf == null) {
                c8313Fbf = new C8313Fbf(this);
                this.A0A = c8313Fbf;
            }
            actionMenuItemView.A00 = c8313Fbf;
            actionView = (View) interfaceC8332Fbz;
        }
        actionView.setVisibility(c8252FaX.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C8315Fbh)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void A01() {
        AbstractC8231Fa7 abstractC8231Fa7;
        A02();
        C8240FaG c8240FaG = this.A09;
        if (c8240FaG == null || (abstractC8231Fa7 = c8240FaG.A03) == null || !abstractC8231Fa7.AP1()) {
            return;
        }
        c8240FaG.A03.dismiss();
    }

    @Override // X.InterfaceC8291FbF
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        A01();
        InterfaceC8331Fby interfaceC8331Fby = this.A07;
        if (interfaceC8331Fby != null) {
            interfaceC8331Fby.ASE(c8249FaR, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    @Override // X.InterfaceC8291FbF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AWM(X.SubMenuC8248FaQ r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r5 = 0
            if (r0 == 0) goto La0
            r0 = r8
        L8:
            X.FaR r2 = r0.A00
            X.FaR r1 = r7.A06
            if (r2 == r1) goto L13
            X.FaR r0 = r0.A00
            X.FaQ r0 = (X.SubMenuC8248FaQ) r0
            goto L8
        L13:
            android.view.MenuItem r4 = r0.getItem()
            X.Fc4 r3 = r7.A08
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto La0
            int r2 = r3.getChildCount()
            r1 = 0
        L22:
            if (r1 >= r2) goto La0
            android.view.View r6 = r3.getChildAt(r1)
            boolean r0 = r6 instanceof X.InterfaceC8332Fbz
            if (r0 == 0) goto L9d
            r0 = r6
            X.Fbz r0 = (X.InterfaceC8332Fbz) r0
            X.FaX r0 = r0.getItemData()
            if (r0 != r4) goto L9d
            if (r6 == 0) goto La0
            android.view.MenuItem r0 = r8.getItem()
            r0.getItemId()
            int r4 = r8.size()
            r2 = 0
        L43:
            r3 = 1
            if (r2 >= r4) goto L57
            android.view.MenuItem r1 = r8.getItem(r2)
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L9a
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L9a
            r5 = 1
        L57:
            android.content.Context r0 = r7.A01
            X.FaG r1 = new X.FaG
            r1.<init>(r0, r6, r8, r7)
            r7.A09 = r1
            r1.A05 = r5
            X.Fa7 r0 = r1.A03
            if (r0 == 0) goto L77
            r0.A02(r5)
            boolean r0 = r0.AP1()
            if (r0 == 0) goto L77
        L6f:
            X.Fby r0 = r7.A07
            if (r0 == 0) goto L76
            r0.AUQ(r8)
        L76:
            return r3
        L77:
            android.view.View r0 = r1.A01
            if (r0 != 0) goto L82
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L82:
            X.Fa7 r2 = r1.A00()
            r1 = 0
            boolean r0 = r2 instanceof X.ViewOnKeyListenerC8234FaA
            if (r0 == 0) goto L94
            r0 = r2
            X.FaA r0 = (X.ViewOnKeyListenerC8234FaA) r0
            r0.A07 = r1
        L90:
            r2.Afd()
            goto L6f
        L94:
            r0 = r2
            X.Fa9 r0 = (X.ViewOnKeyListenerC8233Fa9) r0
            r0.A0D = r1
            goto L90
        L9a:
            int r2 = r2 + 1
            goto L43
        L9d:
            int r1 = r1 + 1
            goto L22
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8243FaJ.AWM(X.FaQ):boolean");
    }
}
