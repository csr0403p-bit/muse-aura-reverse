package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.FgU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8573FgU extends FgY implements InterfaceC8038FQp, FM1 {
    public int A00;
    public boolean A01;
    public final AbstractC8571FgQ A02;

    public final int A03(boolean z, boolean z2) {
        if (this.A01) {
            throw C3cG.A0Q("commit already called");
        }
        if (AbstractC8571FgQ.A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("Commit: ", this));
            PrintWriter printWriter = new PrintWriter(new HlN());
            A07(printWriter, "  ", true);
            printWriter.close();
        }
        this.A01 = true;
        this.A00 = this.A0E ? this.A02.A0Y.getAndIncrement() : -1;
        if (z2) {
            this.A02.A0p(this, z);
        }
        return this.A00;
    }

    public final void A04() {
        ArrayList<C8598Fh0> arrayList = this.A0B;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C8598Fh0 c8598Fh0 = arrayList.get(size);
            if (c8598Fh0.A08) {
                if (c8598Fh0.A00 == 8) {
                    c8598Fh0.A08 = false;
                    size--;
                    arrayList.remove(size);
                } else {
                    int i = c8598Fh0.A05.mContainerId;
                    c8598Fh0.A00 = 2;
                    c8598Fh0.A08 = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C8598Fh0 c8598Fh02 = arrayList.get(i2);
                        if (c8598Fh02.A08 && c8598Fh02.A05.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
        }
    }

    public final void A05(int i) {
        if (this.A0E) {
            if (AbstractC8571FgQ.A0N(2)) {
                Log.v("FragmentManager", C60P.A1O(" by ", C3cG.A0f(this, "Bump nesting in "), i));
            }
            ArrayList<C8598Fh0> arrayList = this.A0B;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8598Fh0 c8598Fh0 = arrayList.get(i2);
                Fragment fragment = c8598Fh0.A05;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (AbstractC8571FgQ.A0N(2)) {
                        StringBuilder sbA0x = C60O.A0x("Bump nesting of ");
                        sbA0x.append(c8598Fh0.A05);
                        sbA0x.append(" to ");
                        Log.v("FragmentManager", BV4.A0l(sbA0x, c8598Fh0.A05.mBackStackNesting));
                    }
                }
            }
        }
    }

    public final void A06(Fragment fragment) {
        AbstractC8571FgQ abstractC8571FgQ = fragment.mFragmentManager;
        if (abstractC8571FgQ != null && abstractC8571FgQ != this.A02) {
            throw BV5.A0V("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A02(new C8598Fh0(fragment, 3));
    }

    public final void A07(PrintWriter printWriter, String str, boolean z) {
        String strA0H;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A09);
            printWriter.print(" mIndex=");
            printWriter.print(this.A00);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A01);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                AbstractC7608F5v.A1H(printWriter, this.A06);
            }
            if (super.A02 != 0 || this.A03 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                AbstractC7608F5v.A1H(printWriter, super.A02);
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (this.A04 != 0 || this.A05 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                AbstractC7608F5v.A1H(printWriter, this.A04);
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (super.A01 != 0 || this.A08 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                AbstractC7608F5v.A1H(printWriter, super.A01);
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A08);
            }
            if (super.A00 != 0 || this.A07 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                AbstractC7608F5v.A1H(printWriter, super.A00);
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A07);
            }
        }
        ArrayList<C8598Fh0> arrayList = this.A0B;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8598Fh0 c8598Fh0 = arrayList.get(i);
            int i2 = c8598Fh0.A00;
            switch (i2) {
                case 0:
                    strA0H = "NULL";
                    break;
                case 1:
                    strA0H = "ADD";
                    break;
                case 2:
                    strA0H = "REPLACE";
                    break;
                case 3:
                    strA0H = "REMOVE";
                    break;
                case 4:
                    strA0H = "HIDE";
                    break;
                case 5:
                    strA0H = "SHOW";
                    break;
                case 6:
                    strA0H = "DETACH";
                    break;
                case 7:
                    strA0H = "ATTACH";
                    break;
                case 8:
                    strA0H = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    strA0H = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    strA0H = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    strA0H = FGI.A0H("cmd=", i2);
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(strA0H);
            printWriter.print(InviteCodeScratcherKt.CODE_SEPARATOR);
            printWriter.println(c8598Fh0.A05);
            if (z) {
                if (c8598Fh0.A01 != 0 || c8598Fh0.A02 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    AbstractC7608F5v.A1H(printWriter, c8598Fh0.A01);
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c8598Fh0.A02));
                }
                if (c8598Fh0.A03 != 0 || c8598Fh0.A04 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    AbstractC7608F5v.A1H(printWriter, c8598Fh0.A03);
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c8598Fh0.A04));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(128);
        sbA0p.append("BackStackEntry{");
        AbstractC7609F5w.A1K(sbA0p, this);
        int i = this.A00;
        if (i >= 0) {
            sbA0p.append(" #");
            sbA0p.append(i);
        }
        String str = this.A09;
        if (str != null) {
            sbA0p.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            sbA0p.append(str);
        }
        return BV7.A11(sbA0p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8573FgU(AbstractC8571FgQ abstractC8571FgQ) {
        C8518FfP c8518FfPA0V = abstractC8571FgQ.A0V();
        AbstractC8595Fgx<?> abstractC8595Fgx = abstractC8571FgQ.A09;
        super(c8518FfPA0V, abstractC8595Fgx != null ? abstractC8595Fgx.A01.getClassLoader() : null);
        this.A00 = -1;
        this.A02 = abstractC8571FgQ;
    }

    @Override // X.FgY
    public final void A01(Fragment fragment, String str, int i, int i2) {
        super.A01(fragment, str, i, i2);
        fragment.mFragmentManager = this.A02;
    }

    @Override // X.InterfaceC8038FQp
    public final boolean ABs(ArrayList<C8573FgU> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC8571FgQ.A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("Run: ", this));
        }
        arrayList.add(this);
        arrayList2.add(AnonymousClass001.A0h());
        if (!this.A0E) {
            return true;
        }
        this.A02.A0D.add(this);
        return true;
    }
}
