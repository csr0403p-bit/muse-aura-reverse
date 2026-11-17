package X;

import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.73F, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73F {
    /* JADX WARN: Incorrect types in method signature: (LX/70B;JLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A00(BFM bfm, C70B c70b, G0V g0v, int i, final long j) {
        ?? A0F;
        Object c73o;
        List listSingletonList;
        bfm.AgG(361732211);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c70b, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA05 & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (c70b instanceof C73B) {
                listSingletonList = Collections.singletonList(new C73O(j));
            } else {
                if (!(c70b instanceof C70A)) {
                    throw C3cG.A0q();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    bfm.AgE(291633998);
                    Bundle bundle = (Bundle) bfm.A6v(C7VV.A00);
                    boolean zA1C = AnonymousClass003.A1C(iA05);
                    Object objAaT = bfm.AaT();
                    if (zA1C || objAaT == C78N.A00) {
                        objAaT = new Function0() { // from class: X.73G
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return new C73O(j);
                            }
                        };
                        bfm.Ai0(objAaT);
                    }
                    Function0 function0 = (Function0) objAaT;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i2 = bundle.getInt("appWidgetMinHeight", 0);
                        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i4 = bundle.getInt("appWidgetMinWidth", 0);
                        int i5 = bundle.getInt("appWidgetMaxWidth", 0);
                        if (i2 == 0 || i3 == 0 || i4 == 0 || i5 == 0) {
                            c73o = function0.invoke();
                            A0F = Collections.singletonList(c73o);
                        } else {
                            A0F = Arrays.asList(new C73O(C16n.A00(i4, i3)), new C73O(C16n.A00(i5, i2)));
                        }
                    } else {
                        A0F = AnonymousClass002.A0m(parcelableArrayList);
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            SizeF sizeF = (SizeF) it.next();
                            A0F.add(new C73O(C16n.A00(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    AnonymousClass002.A19(bfm);
                    listSingletonList = A0F;
                } else {
                    bfm.AgE(291738344);
                    BaseBundle baseBundle = (BaseBundle) bfm.A6v(C7VV.A00);
                    int i6 = baseBundle.getInt("appWidgetMinHeight", 0);
                    int i7 = baseBundle.getInt("appWidgetMaxWidth", 0);
                    C73O c73o2 = (i6 == 0 || i7 == 0) ? null : new C73O(C16n.A00(i7, i6));
                    int i8 = baseBundle.getInt("appWidgetMaxHeight", 0);
                    int i9 = baseBundle.getInt("appWidgetMinWidth", 0);
                    A0F = BFI.A0F(new C73O[]{c73o2, (i8 == 0 || i9 == 0) ? null : new C73O(C16n.A00(i9, i8))});
                    if (A0F.isEmpty()) {
                        c73o = new C73O(j);
                        A0F = Collections.singletonList(c73o);
                    }
                    AnonymousClass002.A19(bfm);
                    listSingletonList = A0F;
                }
            }
            List listA0T = AbstractC0878AGe.A0T(listSingletonList);
            ArrayList arrayListA0m = AnonymousClass002.A0m(listA0T);
            Iterator it2 = listA0T.iterator();
            while (it2.hasNext()) {
                A01(bfm, c70b, g0v, ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA05 & 896), ((C73O) it2.next()).A00);
                arrayListA0m.add(Unit.INSTANCE);
            }
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iD(c70b, g0v, i, 1, j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/70B;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(BFM bfm, final C70B c70b, final G0V g0v, int i, final long j) {
        bfm.AgG(-771692794);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass002.A06(AnonymousClass004.A1Y(c70b, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA0M & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AKT.A01(bfm, C7VW.A02.A04(new C73O(j)), B1V.A00(bfm, new G0V() { // from class: X.73E
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    G0V g0v2 = g0v;
                    long j2 = j;
                    C70B c70b2 = c70b;
                    BFM bfm2 = (BFM) obj;
                    if (AnonymousClass005.A0D(obj2) == 2 && bfm2.AKh()) {
                        bfm2.Afo();
                    } else {
                        Object objAaT = bfm2.AaT();
                        if (objAaT == C78N.A00) {
                            objAaT = C73A.A00;
                            bfm2.Ai0(objAaT);
                        }
                        Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                        bfm2.AgF(-683746039);
                        bfm2.AgF(-548224868);
                        BBI bbi = (BBI) bfm2;
                        if (!(bbi.A0V instanceof C73Q)) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        C60R.A13(bfm2, bbi, function0);
                        C8i0.A00(bfm2, new C73O(j2), 10);
                        C8i0.A00(bfm2, c70b2, 11);
                        g0v2.invoke(bfm2, 0);
                        AnonymousClass002.A10(bbi, true, false);
                    }
                    return Unit.INSTANCE;
                }
            }, -367769018), 56);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iD(c70b, g0v, i, 0, j);
        }
    }
}
