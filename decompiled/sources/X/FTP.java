package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FTP {
    public InterfaceC8112FUc A00 = null;
    public ArrayList A01 = C3cG.A0h();

    public final boolean A08(FTD ftd, FTD ftd2, FTV ftv, FTV ftv2) {
        int i;
        int i2;
        FTA fta = (FTA) this;
        int i3 = ftd.A00;
        int i4 = ftd.A01;
        if (AnonymousClass002.A1L(ftv2.A00 & 128)) {
            i2 = i4;
            i = i3;
        } else {
            i = ftd2.A00;
            i2 = ftd2.A01;
        }
        if (ftv == ftv2) {
            return fta.A0B(ftv, i3, i4, i, i2);
        }
        View view = ftv.A0I;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        FTA.A00(fta, ftv);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        FTA.A00(fta, ftv2);
        View view2 = ftv2.A0I;
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList<FTC> arrayList = fta.A07;
        FTC ftc = new FTC();
        ftc.A05 = ftv;
        ftc.A04 = ftv2;
        ftc.A00 = i3;
        ftc.A01 = i4;
        ftc.A02 = i;
        ftc.A03 = i2;
        arrayList.add(ftc);
        return true;
    }

    public final void A04() {
        FTA fta = (FTA) this;
        ArrayList<FTE> arrayList = fta.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            FTV ftv = arrayList.get(size).A04;
            View view = ftv.A0I;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            fta.A06(ftv);
            arrayList.remove(size);
        }
        ArrayList<FTV> arrayList2 = fta.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            fta.A06(AbstractC7607F5u.A0n(arrayList2, size2));
            arrayList2.remove(size2);
        }
        ArrayList<FTV> arrayList3 = fta.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList3, size3);
            ftvA0n.A0I.setAlpha(1.0f);
            fta.A06(ftvA0n);
            arrayList3.remove(size3);
        }
        ArrayList<FTC> arrayList4 = fta.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            FTC ftc = arrayList4.get(size4);
            FTV ftv2 = ftc.A05;
            if (ftv2 != null) {
                FTA.A03(ftc, fta, ftv2);
            }
            FTV ftv3 = ftc.A04;
            if (ftv3 != null) {
                FTA.A03(ftc, fta, ftv3);
            }
        }
        arrayList4.clear();
        if (fta.A07()) {
            ArrayList<ArrayList<FTE>> arrayList5 = fta.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<FTE> arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        FTV ftv4 = arrayList6.get(size6).A04;
                        View view2 = ftv4.A0I;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        fta.A06(ftv4);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<FTV>> arrayList7 = fta.A01;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<FTV> arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        FTV ftvA0n2 = AbstractC7607F5u.A0n(arrayList8, size8);
                        ftvA0n2.A0I.setAlpha(1.0f);
                        fta.A06(ftvA0n2);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<FTC>> arrayList9 = fta.A03;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList<FTC> arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        FTC ftc2 = arrayList10.get(size10);
                        FTV ftv5 = ftc2.A05;
                        if (ftv5 != null) {
                            FTA.A03(ftc2, fta, ftv5);
                        }
                        FTV ftv6 = ftc2.A04;
                        if (ftv6 != null) {
                            FTA.A03(ftc2, fta, ftv6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            FTA.A02(fta.A0A);
            FTA.A02(fta.A04);
            FTA.A02(fta.A00);
            FTA.A02(fta.A02);
            ArrayList arrayList11 = ((FTP) fta).A01;
            if (0 < arrayList11.size()) {
                arrayList11.get(0);
                throw BV4.A0a("onAnimationsFinished");
            }
            arrayList11.clear();
        }
    }

    public final void A05(FTV ftv) {
        FTA fta = (FTA) this;
        View view = ftv.A0I;
        view.animate().cancel();
        ArrayList<FTE> arrayList = fta.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).A04 == ftv) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                fta.A06(ftv);
                arrayList.remove(size);
            }
        }
        FTA.A01(fta, ftv, fta.A07);
        if (fta.A09.remove(ftv)) {
            view.setAlpha(1.0f);
            fta.A06(ftv);
        }
        if (fta.A06.remove(ftv)) {
            view.setAlpha(1.0f);
            fta.A06(ftv);
        }
        ArrayList<ArrayList<FTC>> arrayList2 = fta.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<FTC> arrayList3 = arrayList2.get(size2);
            FTA.A01(fta, ftv, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<FTE>> arrayList4 = fta.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<FTE> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).A04 == ftv) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    fta.A06(ftv);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<FTV>> arrayList6 = fta.A01;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                fta.A0A.remove(ftv);
                fta.A00.remove(ftv);
                fta.A02.remove(ftv);
                fta.A04.remove(ftv);
                fta.A0A();
                return;
            }
            ArrayList<FTV> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(ftv)) {
                view.setAlpha(1.0f);
                fta.A06(ftv);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    public final void A06(FTV ftv) {
        boolean z;
        InterfaceC8112FUc interfaceC8112FUc = this.A00;
        if (interfaceC8112FUc != null) {
            FU4 fu4 = (FU4) interfaceC8112FUc;
            ftv.A03(true);
            if (ftv.A0A != null && ftv.A0B == null) {
                ftv.A0A = null;
            }
            ftv.A0B = null;
            if ((ftv.A00 & 16) == 0) {
                RecyclerView recyclerView = fu4.A00;
                View view = ftv.A0I;
                RecyclerView.A0V(recyclerView);
                FTW ftw = recyclerView.A0C;
                int i = ftw.A00;
                if (i != 1) {
                    if (i == 2) {
                        throw C3cG.A0Q("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        ftw.A00 = 2;
                        RecyclerView recyclerView2 = ((C8103FTr) ftw.A03).A00;
                        int iIndexOfChild = recyclerView2.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            FTW.A03(view, ftw);
                        } else {
                            C8107FTw c8107FTw = ftw.A02;
                            if (c8107FTw.A06(iIndexOfChild)) {
                                c8107FTw.A07(iIndexOfChild);
                                FTW.A03(view, ftw);
                                View childAt = recyclerView2.getChildAt(iIndexOfChild);
                                if (childAt != null) {
                                    recyclerView2.A0w(childAt);
                                    childAt.clearAnimation();
                                }
                                recyclerView2.removeViewAt(iIndexOfChild);
                            }
                        }
                        ftw.A00 = 0;
                        z = true;
                        FTV ftvA08 = RecyclerView.A08(view);
                        FTR ftr = recyclerView.A11;
                        ftr.A0D(ftvA08);
                        ftr.A0C(ftvA08);
                        if (RecyclerView.A1I) {
                            Log.d("RecyclerView", AnonymousClass006.A0y(recyclerView, ", ", C3cG.A0f(view, "after removing animated view: ")));
                        }
                        RecyclerView.A0Y(recyclerView, !z);
                        if (z && AnonymousClass002.A1L(ftv.A00 & 256)) {
                            recyclerView.removeDetachedView(view, false);
                            return;
                        }
                    } finally {
                        ftw.A00 = 0;
                    }
                }
                if (ftw.A01 != view) {
                    throw C3cG.A0Q("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z = false;
                RecyclerView.A0Y(recyclerView, !z);
                if (z) {
                }
            }
        }
    }

    public final boolean A07() {
        FTA fta = (FTA) this;
        return (fta.A06.isEmpty() && fta.A07.isEmpty() && fta.A08.isEmpty() && fta.A09.isEmpty() && fta.A04.isEmpty() && fta.A0A.isEmpty() && fta.A00.isEmpty() && fta.A02.isEmpty() && fta.A05.isEmpty() && fta.A01.isEmpty() && fta.A03.isEmpty()) ? false : true;
    }

    public boolean A09(FTV ftv, List<Object> list) {
        return (((FTA) this).A0B && (ftv.A00 & 4) == 0) ? false : true;
    }
}
