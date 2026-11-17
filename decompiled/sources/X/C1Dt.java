package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Dt, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Dt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AOP<TT;>;LX/BRg;LX/AOe<Ljava/lang/Float;>;LX/G0U<-TT;+Ljava/lang/Object;>;LX/G0W<-TT;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(AOe aOe, AOP aop, BFM bfm, BRg bRg, G0U g0u, G0W g0w, int i, int i2) {
        AOe aOeA0K = aOe;
        BRg bRg2 = bRg;
        G0U g0u2 = g0u;
        bfm.AgG(-1877370462);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aop) | i : i;
        int i3 = i2 & 1;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, aOeA0K);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aOeA0K = AnonymousClass001.A0K(300, 0);
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C05433bp(5);
                    bfm.Ai0(objAaT);
                }
                g0u2 = (G0U) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            Object obj2 = objAaT2;
            if (objAaT2 == obj) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.add(aop.A02.A09());
                bfm.Ai0(snapshotStateList);
                obj2 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                C0918AHu c0918AHu = AbstractC0977AKq.A00;
                objAaT3 = new C0918AHu(6);
                bfm.Ai0(objAaT3);
            }
            C0918AHu c0918AHu2 = (C0918AHu) objAaT3;
            Object objA09 = aop.A02.A09();
            MutableState mutableState = aop.A07;
            if (MutableState.A0B(mutableState, objA09)) {
                bfm.AgE(321145192);
                if (snapshotStateList2.size() == 1 && MutableState.A0B(mutableState, snapshotStateList2.get(0))) {
                    bfm.AgE(321469824);
                } else {
                    bfm.AgE(321279546);
                    boolean zA1F = AnonymousClass004.A1F(iA0d);
                    Object objAaT4 = bfm.AaT();
                    if (zA1F || objAaT4 == obj) {
                        objAaT4 = new C05463bs(aop, 2);
                        bfm.Ai0(objAaT4);
                    }
                    AbstractC0882AGj.A0v(snapshotStateList2, (G0U) objAaT4);
                    c0918AHu2.A0D();
                }
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(321475776);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (c0918AHu2.A06(mutableState.getValue())) {
                bfm.AgE(322279296);
            } else {
                bfm.AgE(321536443);
                Iterator it = snapshotStateList2.iterator();
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!C7384Etj.areEqual(g0u2.invoke(it.next()), g0u2.invoke(mutableState.getValue()))) {
                        i6++;
                    } else if (i6 != -1) {
                        snapshotStateList2.set(i6, mutableState.getValue());
                    }
                }
                snapshotStateList2.add(mutableState.getValue());
                c0918AHu2.A0D();
                int size = snapshotStateList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj3 = snapshotStateList2.get(i7);
                    c0918AHu2.A0E(obj3, B1V.A00(bfm, new C3c8(aOeA0K, aop, obj3, g0w, 0), -934471669));
                }
            }
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, interfaceC1380AiAA0c, akqA04);
            BPg.A01(bfm, Integer.valueOf(iA0J), C1515AkP.A03);
            AnonymousClass003.A0n(bfm, bRgA01);
            bfm.AgE(-1312707512);
            int size2 = snapshotStateList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Object obj4 = snapshotStateList2.get(i8);
                bfm.Ag8(1171574969, g0u2.invoke(obj4));
                G0V g0v = (G0V) c0918AHu2.A05(obj4);
                if (g0v == null) {
                    bfm.AgE(1959122128);
                } else {
                    bfm.AgE(1171576145);
                    g0v.invoke(bfm, 0);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3cB(aOeA0K, aop, bRg2, g0u2, g0w, i, i2, 0);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/BRg;LX/AOe<Ljava/lang/Float;>;Ljava/lang/String;LX/G0W<-TT;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(AOe aOe, BFM bfm, BRg bRg, Object obj, String str, G0W g0w, int i, int i2) {
        BRg bRg2 = bRg;
        AOe aOeA0K = aOe;
        String str2 = str;
        bfm.AgG(-513216493);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(obj, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, aOeA0K);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aOeA0K = AnonymousClass001.A0K(300, 0);
            }
            if (i5 != 0) {
                str2 = "Crossfade";
            }
            A00(aOeA0K, AOR.A04(bfm, obj, str2, (iA05 & 14) | ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), bfm, bRg2, null, g0w, iA05 & 58352, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1BM(aOeA0K, bRg2, obj, str2, g0w, i, i2);
        }
    }
}
