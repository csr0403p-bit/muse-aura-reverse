package X;

import android.content.res.ColorStateList;
import java.util.ArrayList;

/* renamed from: X.FdZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8417FdZ {
    public final boolean A01() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (this instanceof C8409FdQ) {
            C8409FdQ c8409FdQ = (C8409FdQ) this;
            int i = 0;
            while (true) {
                ArrayList<AbstractC8417FdZ> arrayList = c8409FdQ.A0C;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).A01()) {
                    break;
                }
                i++;
            }
        } else {
            if (!(this instanceof C8412FdT)) {
                return false;
            }
            C8412FdT c8412FdT = (C8412FdT) this;
            C8414FdW c8414FdW = c8412FdT.A09;
            if (c8414FdW.A02 != null || (colorStateList2 = c8414FdW.A01) == null || !colorStateList2.isStateful()) {
                C8414FdW c8414FdW2 = c8412FdT.A0A;
                if (c8414FdW2.A02 != null || (colorStateList = c8414FdW2.A01) == null || !colorStateList.isStateful()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A02(int[] iArr) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        int iA08;
        ColorStateList colorStateList2;
        int iA082;
        if (!(this instanceof C8409FdQ)) {
            if (!(this instanceof C8412FdT)) {
                return false;
            }
            C8412FdT c8412FdT = (C8412FdT) this;
            C8414FdW c8414FdW = c8412FdT.A09;
            if (c8414FdW.A02 != null || (colorStateList2 = c8414FdW.A01) == null || !colorStateList2.isStateful() || (iA082 = AbstractC7608F5v.A08(colorStateList2, iArr)) == c8414FdW.A00) {
                z = false;
            } else {
                c8414FdW.A00 = iA082;
                z = true;
            }
            C8414FdW c8414FdW2 = c8412FdT.A0A;
            if (c8414FdW2.A02 != null || (colorStateList = c8414FdW2.A01) == null || !colorStateList.isStateful() || (iA08 = AbstractC7608F5v.A08(colorStateList, iArr)) == c8414FdW2.A00) {
                z2 = false;
            } else {
                c8414FdW2.A00 = iA08;
                z2 = true;
            }
            return z2 | z;
        }
        C8409FdQ c8409FdQ = (C8409FdQ) this;
        int i = 0;
        boolean zA02 = false;
        while (true) {
            ArrayList<AbstractC8417FdZ> arrayList = c8409FdQ.A0C;
            if (i >= arrayList.size()) {
                return zA02;
            }
            zA02 |= arrayList.get(i).A02(iArr);
            i++;
        }
    }
}
