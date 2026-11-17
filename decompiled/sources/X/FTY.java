package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class FTY implements FU8 {
    public final /* synthetic */ RecyclerView A00;

    public FTY(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public static final void A00(C8102FTp c8102FTp, FTY fty) {
        FTN ftn;
        int i;
        int i2;
        int i3 = c8102FTp.A00;
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 4;
                if (i3 != 4) {
                    i4 = 8;
                    if (i3 != 8) {
                        return;
                    }
                    ftn = fty.A00.A0H;
                    i = c8102FTp.A02;
                    i2 = c8102FTp.A01;
                    if (!(ftn instanceof StaggeredGridLayoutManager)) {
                        if (ftn instanceof GridLayoutManager) {
                            FTN.A0f(ftn);
                            return;
                        }
                        return;
                    }
                } else {
                    ftn = fty.A00.A0H;
                    i = c8102FTp.A02;
                    i2 = c8102FTp.A01;
                    if (!(ftn instanceof StaggeredGridLayoutManager)) {
                        if (ftn instanceof GridLayoutManager) {
                            FTN.A0f(ftn);
                            return;
                        }
                        return;
                    }
                }
            } else {
                ftn = fty.A00.A0H;
                i = c8102FTp.A02;
                i2 = c8102FTp.A01;
                if (!(ftn instanceof StaggeredGridLayoutManager)) {
                    if (ftn instanceof GridLayoutManager) {
                        FTN.A0f(ftn);
                        return;
                    }
                    return;
                }
            }
        } else {
            ftn = fty.A00.A0H;
            i = c8102FTp.A02;
            i2 = c8102FTp.A01;
            if (!(ftn instanceof StaggeredGridLayoutManager)) {
                if (ftn instanceof GridLayoutManager) {
                    FTN.A0f(ftn);
                    return;
                }
                return;
            }
        }
        StaggeredGridLayoutManager.A0K((StaggeredGridLayoutManager) ftn, i, i2, i4);
    }

    @Override // X.FU8
    public final FTV ABa(int i) {
        FTW ftw = this.A00.A0C;
        int iA05 = ftw.A05();
        FTV ftv = null;
        for (int i2 = 0; i2 < iA05; i2++) {
            FTV ftvA01 = FTW.A01(ftw, i2);
            if (ftvA01 != null && !AnonymousClass002.A1L(ftvA01.A00 & 8) && ftvA01.A04 == i) {
                ftv = ftvA01;
                if (!ftw.A04.contains(ftvA01.A0I)) {
                    break;
                }
            }
        }
        if (ftv != null) {
            if (!ftw.A04.contains(ftv.A0I)) {
                return ftv;
            }
            if (RecyclerView.A1I) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    @Override // X.FU8
    public final void AQA(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        FTW ftw = recyclerView.A0C;
        int iA05 = ftw.A05();
        int i5 = i + i2;
        for (int i6 = 0; i6 < iA05; i6++) {
            View childAt = ((C8103FTr) ftw.A03).A00.getChildAt(i6);
            FTV ftvA08 = RecyclerView.A08(childAt);
            if (ftvA08 != null && !AnonymousClass002.A1L(ftvA08.A00 & 128) && (i4 = ftvA08.A04) >= i && i4 < i5) {
                int i7 = ftvA08.A00 | 2;
                ftvA08.A00 = i7;
                if (obj == null) {
                    ftvA08.A00 = 1024 | i7;
                } else if ((1024 & i7) == 0) {
                    if (ftvA08.A0E == null) {
                        ArrayList arrayListA0h = C3cG.A0h();
                        ftvA08.A0E = arrayListA0h;
                        ftvA08.A0F = Collections.unmodifiableList(arrayListA0h);
                    }
                    ftvA08.A0E.add(obj);
                }
                AbstractC7607F5u.A0m(childAt).A01 = true;
            }
        }
        FTR ftr = recyclerView.A11;
        ArrayList<FTV> arrayList = ftr.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.A0Y = true;
                return;
            }
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, size);
            if (ftvA0n != null && (i3 = ftvA0n.A04) >= i && i3 < i5) {
                ftvA0n.A00 |= 2;
                FTR.A04(ftr, size);
            }
        }
    }

    @Override // X.FU8
    public final void ARe(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        FTW ftw = recyclerView.A0C;
        int iA05 = ftw.A05();
        for (int i3 = 0; i3 < iA05; i3++) {
            FTV ftvA01 = FTW.A01(ftw, i3);
            if (ftvA01 != null && !AnonymousClass002.A1L(ftvA01.A00 & 128) && ftvA01.A04 >= i) {
                if (RecyclerView.A1I) {
                    StringBuilder sbA0y = C60O.A0y("offsetPositionRecordsForInsert attached child ", i3);
                    sbA0y.append(" holder ");
                    sbA0y.append(ftvA01);
                    sbA0y.append(" now at position ");
                    Log.d("RecyclerView", BV4.A0l(sbA0y, ftvA01.A04 + i2));
                }
                ftvA01.A02(i2, false);
                recyclerView.A13.A0C = true;
            }
        }
        ArrayList<FTV> arrayList = recyclerView.A11.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, i4);
            if (ftvA0n != null && ftvA0n.A04 >= i) {
                if (RecyclerView.A1I) {
                    StringBuilder sbA0y2 = C60O.A0y("offsetPositionRecordsForInsert cached ", i4);
                    sbA0y2.append(" holder ");
                    sbA0y2.append(ftvA0n);
                    sbA0y2.append(" now at position ");
                    Log.d("RecyclerView", BV4.A0l(sbA0y2, ftvA0n.A04 + i2));
                }
                ftvA0n.A02(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0X = true;
    }

    @Override // X.FU8
    public final void ARf(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.A00;
        FTW ftw = recyclerView.A0C;
        int iA05 = ftw.A05();
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (i < i2) {
            i6 = -1;
            i5 = i;
            i4 = i2;
        }
        for (int i7 = 0; i7 < iA05; i7++) {
            FTV ftvA01 = FTW.A01(ftw, i7);
            if (ftvA01 != null && (i3 = ftvA01.A04) >= i5 && i3 <= i4) {
                if (RecyclerView.A1I) {
                    Log.d("RecyclerView", AnonymousClass006.A0y(ftvA01, " holder ", C60O.A0y("offsetPositionRecordsForMove attached child ", i7)));
                }
                if (ftvA01.A04 == i) {
                    ftvA01.A02(i2 - i, false);
                } else {
                    ftvA01.A02(i6, false);
                }
                recyclerView.A13.A0C = true;
            }
        }
        FTR ftr = recyclerView.A11;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        if (i < i2) {
            i8 = -1;
            i10 = i;
            i9 = i2;
        }
        ArrayList<FTV> arrayList = ftr.A06;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, i11);
            if (ftvA0n != null && ftvA0n.A04 >= i10 && ftvA0n.A04 <= i9) {
                if (ftvA0n.A04 == i) {
                    ftvA0n.A02(i2 - i, false);
                } else {
                    ftvA0n.A02(i8, false);
                }
                if (RecyclerView.A1I) {
                    Log.d("RecyclerView", AnonymousClass006.A0y(ftvA0n, " holder ", C60O.A0y("offsetPositionRecordsForMove cached child ", i11)));
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0X = true;
    }
}
