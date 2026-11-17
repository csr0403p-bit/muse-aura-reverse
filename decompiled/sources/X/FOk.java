package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public final class FOk implements FSC {
    public final /* synthetic */ FS7 A00;

    public FOk(FS7 fs7) {
        this.A00 = fs7;
    }

    public static void A00(View view) {
        if (view != null) {
            Integer num = C79.A00;
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(view);
            while (!arrayDeque.isEmpty()) {
                Object objPop = arrayDeque.pop();
                if (objPop instanceof FH0) {
                    ((FH0) objPop).ARW(num);
                } else if (objPop instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) objPop;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (-1 < childCount) {
                            arrayDeque.push(viewGroup.getChildAt(childCount));
                        }
                    }
                }
            }
        }
    }

    @Override // X.FSC
    public final void ASh(int i) {
    }

    @Override // X.FSC
    public final void AUm(View view, int i) {
        A00(view);
    }

    @Override // X.FSC
    public final void AUp(View view, FSE fse) {
        A00(view);
    }
}
