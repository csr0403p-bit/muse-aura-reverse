package X;

import android.util.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.aura.widgets.WidgetComponentsKt;

/* loaded from: classes6.dex */
public abstract class FEn {
    public static final C7782FEm A00(C7778FEi c7778FEi, FDW fdw, InterfaceC7780FEk interfaceC7780FEk, int i, int i2) {
        LongSparseArray<FEI<?, FBB>> longSparseArray;
        C7384Etj.A0Y(fdw, 2);
        FCA fcaA01 = AbstractC7752FDe.A00.A01();
        long jA00 = C7827FGi.A00(i, i2);
        long j = fdw.A04;
        LongSparseArray<FEI<?, FBB>> longSparseArray2 = c7778FEi.A01;
        FEI<?, FBB> fei = longSparseArray2.get(j);
        FEE<?, FBB> feeA02 = null;
        if (fei != null || ((longSparseArray = c7778FEi.A00) != null && (fei = longSparseArray.get(j)) != null)) {
            feeA02 = fei.A02();
        }
        FEI<?, FBB> fei2 = new FEI<>(feeA02, new FEU(feeA02, interfaceC7780FEk.AJW(), fdw, fcaA01, interfaceC7780FEk.AH0(), jA00), jA00);
        longSparseArray2.put(j, fei2);
        return new C7782FEm(fei2, fdw);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final FIS A01(FIS fis, String str) {
        C7384Etj.A0Y(fis, 1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return FIS.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return FIS.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return FIS.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals(WidgetComponentsKt.START_PATH)) {
                        return FIS.FLEX_START;
                    }
                    break;
            }
        }
        return fis;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.recyclerview.widget.RecyclerView r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FEn.A02(androidx.recyclerview.widget.RecyclerView, int, boolean):void");
    }

    public static final void A03(RecyclerView recyclerView, FSF fsf, int i, boolean z) {
        C7384Etj.A0Y(recyclerView, 0);
        FTN ftn = recyclerView.A0H;
        if (ftn != null) {
            FSK fsk = new FSK(recyclerView.getContext(), ftn, fsf, z);
            ((AbstractC8094FTa) fsk).A00 = i;
            ftn.A1K(fsk);
        }
    }
}
