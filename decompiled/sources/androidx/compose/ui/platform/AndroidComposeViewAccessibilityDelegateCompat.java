package androidx.compose.ui.platform;

import X.AW6;
import X.AW7;
import X.AZE;
import X.AaC;
import X.Ab0;
import X.Ab1;
import X.Ab2;
import X.AbstractC0878AGe;
import X.AbstractC0903AHf;
import X.AbstractC0915AHr;
import X.AbstractC0977AKq;
import X.AbstractC1146Abz;
import X.AbstractC1188Adr;
import X.AbstractC1387AiH;
import X.AbstractC1414Aij;
import X.AbstractC1437Aj6;
import X.AbstractC1439Aj8;
import X.AbstractC1489Ajw;
import X.AbstractC1496Ak3;
import X.AbstractC1555AlK;
import X.AbstractC1566Alg;
import X.AbstractC1570Alk;
import X.AbstractC1571All;
import X.AbstractC1578Alt;
import X.AbstractC1667Anq;
import X.AbstractC1671Anw;
import X.AbstractC1688AoS;
import X.AbstractC1689AoT;
import X.AeA;
import X.Aeh;
import X.AlP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.Ao0;
import X.Ao1;
import X.Ao4;
import X.Ao6;
import X.Ao7;
import X.ApQ;
import X.Au3;
import X.BAV;
import X.BLU;
import X.BUT;
import X.BUX;
import X.C0864A6l;
import X.C0910AHm;
import X.C0918AHu;
import X.C0919AHv;
import X.C0920AHw;
import X.C1069ATz;
import X.C1097AYh;
import X.C1119Aaj;
import X.C1143Abw;
import X.C1438Aj7;
import X.C1453AjM;
import X.C1481Ajo;
import X.C1562Alc;
import X.C1629An1;
import X.C1668Ant;
import X.C1678AoG;
import X.C1680AoI;
import X.C1682AoK;
import X.C1710Aot;
import X.C1870Ask;
import X.C1958Aux;
import X.C1DM;
import X.C1Vi;
import X.C1Z3;
import X.C2197BAc;
import X.C2335BUj;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8053FRg;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.FRa;
import X.G0U;
import X.G0W;
import X.GCV;
import X.HzR;
import X.InterfaceC1068ATy;
import X.InterfaceC1476Ajj;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C8053FRg implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final Ab1 A0b;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1143Abw A05;
    public C1143Abw A06;
    public Ab2<Ao4> A07;
    public Aeh A08;
    public Ao1<Ao1<CharSequence>> A09;
    public Ao1<AeA<CharSequence>> A0A;
    public C1680AoI A0B;
    public Ao4 A0C;
    public C2197BAc A0D;
    public C2197BAc A0E;
    public Integer A0F;
    public List<? extends AccessibilityServiceInfo> A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public Ab0<C1629An1> A0K;
    public C1668Ant A0L;
    public final Handler A0N;
    public final AccessibilityManager A0O;
    public final C1143Abw A0P;
    public final Ab2<Ao7> A0Q;
    public final Ab2<Ao7> A0R;
    public final AndroidComposeView A0S;
    public final C1682AoK A0T;
    public final Runnable A0U;
    public final String A0V;
    public final String A0W;
    public final List<Ao6> A0X;
    public final Ao0<C1453AjM> A0Y;
    public final G0U<Ao6, Unit> A0Z;
    public final HzR<Unit> A0a;
    public int A03 = Integer.MIN_VALUE;
    public G0U<? super AccessibilityEvent, Boolean> A0M = BUX.A00(this, 43);

    public static final String A0C(C1562Alc c1562Alc) {
        Object objA0G;
        C0919AHv c0919AHv = c1562Alc.A04;
        C0920AHw<List<String>> c0920AHw = AbstractC1671Anw.A03;
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
        if (c0918AHu.A07(c0920AHw)) {
            return C1Vi.A00(",", "", "", (List) c0919AHv.A01(c0920AHw), null);
        }
        C0920AHw<ApQ> c0920AHw2 = AbstractC1671Anw.A06;
        if (c0918AHu.A07(c0920AHw2)) {
            objA0G = AlP.A01(c0919AHv, c0920AHw2);
        } else {
            List list = (List) AlP.A01(c0919AHv, AbstractC1671Anw.A0b);
            if (list == null) {
                return null;
            }
            objA0G = AbstractC0878AGe.A0G(list);
        }
        ApQ apQ = (ApQ) objA0G;
        if (apQ != null) {
            return apQ.A00;
        }
        return null;
    }

    public static final void A0D(Bundle bundle, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C2197BAc c2197BAc, String str, int i) {
        C1DM c1dm;
        RectF rectF;
        C1143Abw c1143Abw;
        int i2;
        C1629An1 c1629An1 = (C1629An1) A08(androidComposeViewAccessibilityDelegateCompat).A04(i);
        if (c1629An1 != null) {
            C1562Alc c1562Alc = c1629An1.A00;
            String strA0C = A0C(c1562Alc);
            if (C7384Etj.areEqual(str, androidComposeViewAccessibilityDelegateCompat.A0W)) {
                c1143Abw = androidComposeViewAccessibilityDelegateCompat.A06;
            } else {
                if (!C7384Etj.areEqual(str, androidComposeViewAccessibilityDelegateCompat.A0V)) {
                    C0919AHv c0919AHv = c1562Alc.A04;
                    C0920AHw<C0864A6l<G0U<List<C1958Aux>, Boolean>>> c0920AHw = AbstractC1578Alt.A08;
                    C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
                    if (c0918AHu.A07(c0920AHw) && bundle != null && "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY".equals(str)) {
                        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                        if (i4 > 0 && i3 >= 0) {
                            if (i3 < (strA0C != null ? strA0C.length() : Integer.MAX_VALUE)) {
                                C1958Aux c1958AuxA00 = AbstractC1667Anq.A00(c0919AHv);
                                if (c1958AuxA00 != null) {
                                    ArrayList arrayListA0h = C3cG.A0h();
                                    int i5 = 0;
                                    do {
                                        int i6 = i3 + i5;
                                        if (i6 >= C1870Ask.A00(c1958AuxA00)) {
                                            rectF = null;
                                        } else {
                                            AaC aaCA05 = c1958AuxA00.A05(i6);
                                            rectF = null;
                                            AbstractC1387AiH abstractC1387AiHA09 = c1562Alc.A09();
                                            AaC aaCA03 = aaCA05.A03((abstractC1387AiHA09 == null || !AZE.A03(abstractC1387AiHA09)) ? 0L : abstractC1387AiHA09.APo(0L));
                                            AaC aaCA052 = c1562Alc.A05();
                                            if (aaCA03.A07(aaCA052)) {
                                                AaC aaCA04 = aaCA03.A04(aaCA052);
                                                AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0S;
                                                long jAPq = androidComposeView.APq((C8j3.A0P(aaCA04.A03) & 4294967295L) | (C8j3.A0P(aaCA04.A01) << 32));
                                                long jAPq2 = androidComposeView.APq(AnonymousClass005.A0L(aaCA04.A02, aaCA04.A00));
                                                float fA00 = AnonymousClass001.A00(jAPq);
                                                float fA002 = AnonymousClass001.A00(jAPq2);
                                                float fMin = Math.min(fA00, fA002);
                                                float fA01 = AnonymousClass001.A01(jAPq, 4294967295L);
                                                float fA012 = AnonymousClass001.A01(jAPq2, 4294967295L);
                                                rectF = new RectF(fMin, Math.min(fA01, fA012), Math.max(fA00, fA002), Math.max(fA01, fA012));
                                            }
                                        }
                                        arrayListA0h.add(rectF);
                                        i5++;
                                    } while (i5 < i4);
                                    c2197BAc.A02.getExtras().putParcelableArray(str, (Parcelable[]) arrayListA0h.toArray(new RectF[0]));
                                    return;
                                }
                                return;
                            }
                        }
                        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                        return;
                    }
                    C0920AHw<String> c0920AHw2 = AbstractC1671Anw.A0a;
                    if (c0918AHu.A07(c0920AHw2) && bundle != null && "androidx.compose.ui.semantics.testTag".equals(str)) {
                        String str2 = (String) AlP.A01(c0919AHv, c0920AHw2);
                        if (str2 != null) {
                            c2197BAc.A02.getExtras().putCharSequence(str, str2);
                            return;
                        }
                        return;
                    }
                    if ("androidx.compose.ui.semantics.id".equals(str)) {
                        c2197BAc.A02.getExtras().putInt(str, c1562Alc.A01);
                        return;
                    }
                    if ("androidx.compose.ui.semantics.shapeType".equals(str)) {
                        C1DM c1dm2 = (C1DM) AlP.A01(c0919AHv, AbstractC1671Anw.A0Y);
                        if (c1dm2 != null) {
                            Rect rect = new Rect();
                            AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
                            accessibilityNodeInfo.getBoundsInScreen(rect);
                            AaC aaCA09 = androidComposeViewAccessibilityDelegateCompat.A09(rect, c1dm2, c1562Alc);
                            AbstractC1555AlK abstractC1555AlKA0A = A0A(aaCA09, c1dm2, androidComposeViewAccessibilityDelegateCompat, c1562Alc);
                            if (abstractC1555AlKA0A instanceof C1097AYh) {
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", androidComposeViewAccessibilityDelegateCompat.A04(abstractC1555AlKA0A, aaCA09.A01, aaCA09.A03));
                                return;
                            } else if (abstractC1555AlKA0A instanceof AW6) {
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", androidComposeViewAccessibilityDelegateCompat.A04(abstractC1555AlKA0A, aaCA09.A01, aaCA09.A03));
                                accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", A0Q(abstractC1555AlKA0A));
                                return;
                            } else {
                                if (!(abstractC1555AlKA0A instanceof C1069ATz)) {
                                    throw C3cG.A0q();
                                }
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", androidComposeViewAccessibilityDelegateCompat.A06(abstractC1555AlKA0A, aaCA09.A01, aaCA09.A03));
                                return;
                            }
                        }
                        return;
                    }
                    if ("androidx.compose.ui.semantics.shapeRect".equals(str)) {
                        C1DM c1dm3 = (C1DM) AlP.A01(c0919AHv, AbstractC1671Anw.A0Y);
                        if (c1dm3 != null) {
                            Rect rect2 = new Rect();
                            AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
                            accessibilityNodeInfo2.getBoundsInScreen(rect2);
                            AaC aaCA092 = androidComposeViewAccessibilityDelegateCompat.A09(rect2, c1dm3, c1562Alc);
                            Rect rectA04 = androidComposeViewAccessibilityDelegateCompat.A04(A0A(aaCA092, c1dm3, androidComposeViewAccessibilityDelegateCompat, c1562Alc), aaCA092.A01, aaCA092.A03);
                            if (rectA04 != null) {
                                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectA04);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if ("androidx.compose.ui.semantics.shapeCorners".equals(str)) {
                        C1DM c1dm4 = (C1DM) AlP.A01(c0919AHv, AbstractC1671Anw.A0Y);
                        if (c1dm4 != null) {
                            Rect rect3 = new Rect();
                            AccessibilityNodeInfo accessibilityNodeInfo3 = c2197BAc.A02;
                            accessibilityNodeInfo3.getBoundsInScreen(rect3);
                            float[] fArrA0Q = A0Q(A0A(androidComposeViewAccessibilityDelegateCompat.A09(rect3, c1dm4, c1562Alc), c1dm4, androidComposeViewAccessibilityDelegateCompat, c1562Alc));
                            if (fArrA0Q != null) {
                                accessibilityNodeInfo3.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrA0Q);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!"androidx.compose.ui.semantics.shapeRegion".equals(str) || (c1dm = (C1DM) AlP.A01(c0919AHv, AbstractC1671Anw.A0Y)) == null) {
                        return;
                    }
                    Rect rect4 = new Rect();
                    AccessibilityNodeInfo accessibilityNodeInfo4 = c2197BAc.A02;
                    accessibilityNodeInfo4.getBoundsInScreen(rect4);
                    AaC aaCA093 = androidComposeViewAccessibilityDelegateCompat.A09(rect4, c1dm, c1562Alc);
                    Region regionA06 = androidComposeViewAccessibilityDelegateCompat.A06(A0A(aaCA093, c1dm, androidComposeViewAccessibilityDelegateCompat, c1562Alc), aaCA093.A01, aaCA093.A03);
                    if (regionA06 != null) {
                        accessibilityNodeInfo4.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionA06);
                        return;
                    }
                    return;
                }
                c1143Abw = androidComposeViewAccessibilityDelegateCompat.A05;
            }
            int iA02 = c1143Abw.A02(i);
            if (iA02 < 0 || (i2 = c1143Abw.A03[iA02]) == -1) {
                return;
            }
            c2197BAc.A02.getExtras().putInt(str, i2);
        }
    }

    public static final boolean A0L(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (AnonymousClass002.A1b(null, true)) {
            return true;
        }
        if (AnonymousClass002.A1b(null, false)) {
            return false;
        }
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0O;
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1689AoT.A00(accessibilityManager);
        }
        return true;
    }

    public static final boolean A0P(Ao7 ao7, float f) {
        if (f >= 0.0f || AnonymousClass003.A04(ao7.A01) <= 0.0f) {
            return f > 0.0f && AnonymousClass003.A04(ao7.A01) < AnonymousClass003.A04(ao7.A00);
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.A0G = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.A0G = null;
    }

    public static final int A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0S.A11.A00().A01) {
            return -1;
        }
        return i;
    }

    public static final int A01(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C1562Alc c1562Alc) {
        C0919AHv c0919AHv = c1562Alc.A04;
        C0920AHw<List<String>> c0920AHw = AbstractC1671Anw.A03;
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
        if (!c0918AHu.A07(c0920AHw)) {
            C0920AHw<Au3> c0920AHw2 = AbstractC1671Anw.A0e;
            if (c0918AHu.A07(c0920AHw2)) {
                return AnonymousClass002.A09(((Au3) c0919AHv.A01(c0920AHw2)).A00);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final int A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C1562Alc c1562Alc) {
        C0919AHv c0919AHv = c1562Alc.A04;
        C0920AHw<List<String>> c0920AHw = AbstractC1671Anw.A03;
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
        if (!c0918AHu.A07(c0920AHw)) {
            C0920AHw<Au3> c0920AHw2 = AbstractC1671Anw.A0e;
            if (c0918AHu.A07(c0920AHw2)) {
                return C8j3.A0G(((Au3) c0919AHv.A01(c0920AHw2)).A00);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    private final Rect A03(float f, float f2, float f3, float f4) {
        AndroidComposeView androidComposeView = this.A0S;
        long jAPq = androidComposeView.APq((C8j3.A0P(f2) & 4294967295L) | (C8j3.A0P(f) << 32));
        long jAPq2 = androidComposeView.APq(AnonymousClass005.A0M(f3, f4));
        return new Rect((int) Math.floor(Math.min(r9, r8)), (int) Math.floor(Math.min(r4, r6)), C8j3.A08(Math.max(AnonymousClass001.A00(jAPq), AnonymousClass001.A00(jAPq2))), C8j3.A08(Math.max(AnonymousClass001.A01(jAPq, 4294967295L), AnonymousClass001.A01(jAPq2, 4294967295L))));
    }

    private final Rect A04(AbstractC1555AlK abstractC1555AlK, float f, float f2) {
        if (!(abstractC1555AlK instanceof C1097AYh) && !(abstractC1555AlK instanceof AW6)) {
            return null;
        }
        AaC aaCA00 = abstractC1555AlK.A00();
        return new Rect((int) (aaCA00.A01 + f), (int) (aaCA00.A03 + f2), (int) (aaCA00.A02 + f), (int) (aaCA00.A00 + f2));
    }

    public static final Rect A05(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C1629An1 c1629An1) {
        BLU blu = c1629An1.A01;
        return androidComposeViewAccessibilityDelegateCompat.A03(blu.A01, blu.A03, blu.A02, blu.A00);
    }

    private final Region A06(AbstractC1555AlK abstractC1555AlK, float f, float f2) {
        if (!(abstractC1555AlK instanceof C1069ATz)) {
            return null;
        }
        C1069ATz c1069ATz = (C1069ATz) abstractC1555AlK;
        AaC aaCA02 = c1069ATz.A00().A02(f, f2);
        Region region = new Region(new Rect((int) (aaCA02.A01 + 0.0f), (int) (aaCA02.A03 + 0.0f), (int) (aaCA02.A02 + 0.0f), (int) (aaCA02.A00 + 0.0f)));
        Region region2 = new Region();
        InterfaceC1068ATy interfaceC1068ATy = c1069ATz.A00;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static final Ab0 A08(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0I) {
            androidComposeViewAccessibilityDelegateCompat.A0I = false;
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0S;
            androidComposeViewAccessibilityDelegateCompat.A0K = AbstractC1571All.A00(androidComposeView.A11, BUT.A00(43));
            if (androidComposeViewAccessibilityDelegateCompat.A0S()) {
                Ab0<C1629An1> ab0 = androidComposeViewAccessibilityDelegateCompat.A0K;
                C1143Abw c1143Abw = androidComposeViewAccessibilityDelegateCompat.A06;
                C1143Abw c1143Abw2 = androidComposeViewAccessibilityDelegateCompat.A05;
                Resources resources = androidComposeView.getContext().getResources();
                c1143Abw.A03();
                c1143Abw2.A03();
                C1629An1 c1629An1A04 = ab0.A04(-1);
                C1562Alc c1562Alc = c1629An1A04 != null ? c1629An1A04.A00 : null;
                C7384Etj.A0X(c1562Alc);
                ArrayList arrayListA00 = AbstractC1566Alg.A00(c1562Alc, Collections.singletonList(c1562Alc), BUX.A00(ab0, 45), BUX.A00(resources, 46));
                int iA0E = AnonymousClass002.A0E(arrayListA00);
                int i = 1;
                if (1 <= iA0E) {
                    while (true) {
                        int i2 = ((C1562Alc) arrayListA00.get(i - 1)).A01;
                        int i3 = ((C1562Alc) arrayListA00.get(i)).A01;
                        c1143Abw.A04(i2, i3);
                        c1143Abw2.A04(i3, i2);
                        if (i == iA0E) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0K;
    }

    private final AaC A09(Rect rect, C1DM c1dm, C1562Alc c1562Alc) {
        AbstractC1439Aj8 abstractC1439Aj8;
        C1678AoG c1678AoG = new C1678AoG(c1dm);
        C1438Aj7 c1438Aj7 = c1562Alc.A03.A0f;
        AbstractC1439Aj8 abstractC1439Aj82 = c1438Aj7.A02;
        C1Z3 c1z3 = null;
        if ((abstractC1439Aj82.aggregateChildKindSet & 8) != 0) {
            loop0: while (true) {
                if ((abstractC1439Aj82.kindSet & 8) == 0) {
                    if ((abstractC1439Aj82.aggregateChildKindSet & 8) == 0) {
                        break;
                    }
                    break;
                    break;
                }
                AbstractC1439Aj8 abstractC1439Aj8A0X = abstractC1439Aj82;
                C0910AHm c0910AHmA0K = null;
                do {
                    if (abstractC1439Aj8A0X instanceof InterfaceC1476Ajj) {
                        ((InterfaceC1476Ajj) abstractC1439Aj8A0X).A4Y(c1678AoG);
                        if (c1678AoG.A00) {
                            c1z3 = abstractC1439Aj8A0X;
                            break loop0;
                        }
                    } else if ((abstractC1439Aj8A0X.kindSet & 8) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                        int i = 0;
                        for (AbstractC1439Aj8 abstractC1439Aj83 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.child) {
                            if ((abstractC1439Aj83.kindSet & 8) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC1439Aj8A0X = abstractC1439Aj83;
                                } else {
                                    c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                    abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0K, abstractC1439Aj8A0X);
                                    c0910AHmA0K.A0G(abstractC1439Aj83);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                } while (abstractC1439Aj8A0X != null);
                if ((abstractC1439Aj82.aggregateChildKindSet & 8) == 0 || (abstractC1439Aj82 = abstractC1439Aj82.child) == null) {
                    break;
                }
            }
        }
        C1Z3 c1z32 = (InterfaceC1476Ajj) c1z3;
        if (c1z32 == null || (abstractC1439Aj8 = ((AbstractC1439Aj8) c1z32).node) == null || !abstractC1439Aj8.isAttached) {
            return AbstractC1496Ak3.A00(c1438Aj7.A04, false);
        }
        AbstractC1387AiH abstractC1387AiHA05 = AbstractC1414Aij.A05(c1z32);
        AaC aaCAPk = AbstractC1496Ak3.A01(abstractC1387AiHA05).APk(abstractC1387AiHA05, false);
        Rect rectA03 = A03(aaCAPk.A01, aaCAPk.A03, aaCAPk.A02, aaCAPk.A00);
        float f = rectA03.left - rect.left;
        float f2 = rectA03.top - rect.top;
        return C8j3.A0f(f, f2, rectA03.width() + f, rectA03.height() + f2);
    }

    public static final void A0F(C1453AjM c1453AjM, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0Y.add(c1453AjM)) {
            androidComposeViewAccessibilityDelegateCompat.A0a.AhZ(Unit.INSTANCE);
        }
    }

    public static final void A0G(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        C1680AoI c1680AoI = androidComposeViewAccessibilityDelegateCompat.A0B;
        if (c1680AoI != null) {
            int i2 = c1680AoI.A05.A01;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1680AoI.A04 <= 1000) {
                AccessibilityEvent accessibilityEventA07 = A07(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i2), 131072);
                accessibilityEventA07.setFromIndex(c1680AoI.A01);
                accessibilityEventA07.setToIndex(c1680AoI.A03);
                accessibilityEventA07.setAction(c1680AoI.A00);
                accessibilityEventA07.setMovementGranularity(c1680AoI.A02);
                accessibilityEventA07.getText().add(A0C(c1680AoI.A05));
                A0E(accessibilityEventA07, androidComposeViewAccessibilityDelegateCompat);
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A0B = null;
    }

    public static final void A0H(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Ao6 ao6) {
        if (ao6.A05.contains(ao6)) {
            C1481Ajo c1481Ajo = androidComposeViewAccessibilityDelegateCompat.A0S.A0q;
            G0U<Ao6, Unit> g0u = androidComposeViewAccessibilityDelegateCompat.A0Z;
            c1481Ajo.A00.A03(ao6, new C2335BUj(8, ao6, androidComposeViewAccessibilityDelegateCompat), g0u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r17, X.Ao4 r18, X.C1562Alc r19) {
        /*
            int[] r0 = X.Ac1.A00
            r0 = 6
            X.Aeh r12 = new X.Aeh
            r12.<init>(r0)
            r11 = 0
            r10 = 1
            r13 = r19
            java.util.List r4 = r13.A0C(r11, r10)
            int r3 = r4.size()
            r6 = 0
            r2 = 0
        L16:
            r7 = r17
            r8 = r18
            if (r2 >= r3) goto L40
            java.lang.Object r5 = r4.get(r2)
            X.Alc r5 = (X.C1562Alc) r5
            X.Ab0 r1 = A08(r7)
            int r0 = r5.A01
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L3d
            X.Aeh r1 = r8.A00
            int r0 = r5.A01
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L7c
            int r0 = r5.A01
            r12.A07(r0)
        L3d:
            int r2 = r2 + 1
            goto L16
        L40:
            X.Aeh r0 = r8.A00
            int[] r9 = r0.A02
            long[] r8 = r0.A03
            int r0 = r8.length
            int r5 = r0 + (-2)
            if (r5 < 0) goto L8e
            r4 = 0
        L4c:
            r18 = r8[r4]
            long r14 = X.C8j5.A0A(r18)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L89
            int r0 = X.C8j3.A0E(r4, r5)
            r3 = 8
            int r2 = 8 - r0
            r1 = 0
        L65:
            if (r1 >= r2) goto L87
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r14 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L82
            int r0 = r4 << 3
            int r0 = r0 + r1
            r0 = r9[r0]
            boolean r0 = r12.A04(r0)
            if (r0 != 0) goto L82
        L7c:
            X.AjM r0 = r13.A03
            A0F(r0, r7)
        L81:
            return
        L82:
            long r18 = r18 >> r3
            int r1 = r1 + 1
            goto L65
        L87:
            if (r2 != r3) goto L8e
        L89:
            if (r4 == r5) goto L8e
            int r4 = r4 + 1
            goto L4c
        L8e:
            java.util.List r5 = r13.A0C(r11, r10)
            int r4 = r5.size()
        L96:
            if (r6 >= r4) goto L81
            java.lang.Object r3 = r5.get(r6)
            X.Alc r3 = (X.C1562Alc) r3
            X.Ab2<X.Ao4> r1 = r7.A07
            int r0 = r3.A01
            java.lang.Object r2 = r1.A04(r0)
            X.Ao4 r2 = (X.Ao4) r2
            if (r2 == 0) goto Lb9
            X.Ab0 r1 = A08(r7)
            int r0 = r3.A01
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto Lb9
            A0I(r7, r2, r3)
        Lb9:
            int r6 = r6 + 1
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, X.Ao4, X.Alc):void");
    }

    /* JADX WARN: Incorrect return type in method signature: (IILjava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;)Z */
    public static final void A0J(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Integer num, List list, int i, int i2) {
        if (i == Integer.MIN_VALUE || !androidComposeViewAccessibilityDelegateCompat.A0S()) {
            return;
        }
        AccessibilityEvent accessibilityEventA07 = A07(androidComposeViewAccessibilityDelegateCompat, i, i2);
        if (num != null) {
            accessibilityEventA07.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventA07.setContentDescription(C1Vi.A00(",", "", "", list, null));
        }
        A0E(accessibilityEventA07, androidComposeViewAccessibilityDelegateCompat);
    }

    public static final boolean A0M(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C1562Alc c1562Alc, int i, int i2, boolean z) {
        String strA0C;
        Integer numValueOf;
        C0919AHv c0919AHv = c1562Alc.A04;
        C0920AHw<C0864A6l<G0W<Integer, Integer, Boolean, Boolean>>> c0920AHw = AbstractC1578Alt.A0P;
        if (AbstractC0915AHr.A00(c0919AHv, c0920AHw) && AbstractC1570Alk.A02(c1562Alc)) {
            G0W g0w = (G0W) ((C0864A6l) c0919AHv.A01(c0920AHw)).A01;
            if (g0w != null) {
                return AnonymousClass001.A1X(g0w.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
            }
        } else if ((i != i2 || i2 != androidComposeViewAccessibilityDelegateCompat.A00) && (strA0C = A0C(c1562Alc)) != null) {
            if (i < 0 || i != i2 || i2 > strA0C.length()) {
                i = -1;
            }
            androidComposeViewAccessibilityDelegateCompat.A00 = i;
            int length = strA0C.length();
            boolean z2 = length > 0;
            int i3 = c1562Alc.A01;
            int iA00 = A00(androidComposeViewAccessibilityDelegateCompat, i3);
            Integer numValueOf2 = null;
            if (z2) {
                numValueOf = Integer.valueOf(androidComposeViewAccessibilityDelegateCompat.A00);
                numValueOf2 = Integer.valueOf(length);
            } else {
                numValueOf = null;
            }
            AccessibilityEvent accessibilityEventA07 = A07(androidComposeViewAccessibilityDelegateCompat, iA00, 8192);
            if (numValueOf != null) {
                accessibilityEventA07.setFromIndex(numValueOf.intValue());
                accessibilityEventA07.setToIndex(numValueOf.intValue());
            }
            if (numValueOf2 != null) {
                accessibilityEventA07.setItemCount(numValueOf2.intValue());
            }
            accessibilityEventA07.getText().add(strA0C);
            A0E(accessibilityEventA07, androidComposeViewAccessibilityDelegateCompat);
            A0G(androidComposeViewAccessibilityDelegateCompat, i3);
            return true;
        }
        return false;
    }

    public static final boolean A0N(Ao7 ao7) {
        Function0<Float> function0 = ao7.A01;
        if (AnonymousClass003.A04(function0) <= 0.0f || ao7.A02) {
            return AnonymousClass003.A04(function0) < AnonymousClass003.A04(ao7.A00) && ao7.A02;
        }
        return true;
    }

    public static final boolean A0O(Ao7 ao7) {
        Function0<Float> function0 = ao7.A01;
        if (AnonymousClass003.A04(function0) >= AnonymousClass003.A04(ao7.A00) || ao7.A02) {
            return AnonymousClass003.A04(function0) > 0.0f && ao7.A02;
        }
        return true;
    }

    public static final float[] A0Q(AbstractC1555AlK abstractC1555AlK) {
        if (!(abstractC1555AlK instanceof AW6)) {
            return null;
        }
        AW7 aw7 = ((AW6) abstractC1555AlK).A00;
        long j = aw7.A06;
        long j2 = aw7.A07;
        long j3 = aw7.A05;
        long j4 = aw7.A04;
        return new float[]{AnonymousClass001.A00(j), AnonymousClass001.A01(j, 4294967295L), AnonymousClass001.A00(j2), AnonymousClass001.A01(j2, 4294967295L), AnonymousClass001.A00(j3), AnonymousClass001.A01(j3, 4294967295L), AnonymousClass001.A00(j4), AnonymousClass001.A01(j4, 4294967295L)};
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:20:0x0053, B:21:0x0056, B:25:0x0067, B:27:0x006f, B:29:0x0078, B:31:0x0081, B:33:0x008c, B:35:0x009a, B:37:0x00a4, B:38:0x00ab, B:40:0x00b1, B:42:0x00bd, B:44:0x00c3, B:46:0x00c7, B:47:0x00cf, B:49:0x00d5, B:52:0x00e2, B:54:0x00ea, B:55:0x00f8, B:57:0x00fc, B:59:0x010a, B:63:0x0124, B:65:0x012c, B:67:0x014e, B:68:0x016e, B:62:0x0120, B:69:0x0172, B:72:0x0181, B:73:0x0188, B:24:0x0064, B:19:0x0046), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:20:0x0053, B:21:0x0056, B:25:0x0067, B:27:0x006f, B:29:0x0078, B:31:0x0081, B:33:0x008c, B:35:0x009a, B:37:0x00a4, B:38:0x00ab, B:40:0x00b1, B:42:0x00bd, B:44:0x00c3, B:46:0x00c7, B:47:0x00cf, B:49:0x00d5, B:52:0x00e2, B:54:0x00ea, B:55:0x00f8, B:57:0x00fc, B:59:0x010a, B:63:0x0124, B:65:0x012c, B:67:0x014e, B:68:0x016e, B:62:0x0120, B:69:0x0172, B:72:0x0181, B:73:0x0188, B:24:0x0064, B:19:0x0046), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a3 -> B:21:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0R(X.HtJ<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0R(X.HtJ):java.lang.Object");
    }

    public final boolean A0S() {
        AccessibilityManager accessibilityManager = this.A0O;
        if (accessibilityManager.isEnabled()) {
            List enabledAccessibilityServiceList = this.A0G;
            if (enabledAccessibilityServiceList == null) {
                enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.A0G = enabledAccessibilityServiceList;
            }
            if (!enabledAccessibilityServiceList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.A0O;
        if (accessibilityManager.isEnabled()) {
            this.A0G = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A0S.getHandler();
        C7384Etj.A0X(handler);
        handler.removeCallbacks(this.A0U);
        AccessibilityManager accessibilityManager = this.A0O;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        Ab1 ab1 = AbstractC1188Adr.A00;
        C1119Aaj c1119Aaj = new C1119Aaj(32);
        int i = c1119Aaj.A00;
        if (i < 0 || i > i) {
            throw new IndexOutOfBoundsException("");
        }
        C1119Aaj.A00(c1119Aaj, i + 32);
        int[] iArr2 = c1119Aaj.A01;
        int i2 = c1119Aaj.A00;
        if (i != i2) {
            AbstractC0903AHf.A03(iArr2, iArr2, i + 32, i, i2);
        }
        AbstractC0903AHf.A03(iArr, iArr2, i, 0, 32);
        c1119Aaj.A00 += 32;
        A0b = c1119Aaj;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0S = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A0O = (AccessibilityManager) systemService;
        this.A04 = 100L;
        this.A0N = C60O.A02();
        this.A0L = new C1668Ant(this);
        this.A01 = Integer.MIN_VALUE;
        this.A02 = Integer.MIN_VALUE;
        this.A0Q = new Ab2<>(6);
        this.A0R = new Ab2<>(6);
        this.A09 = new Ao1<>(10);
        this.A0A = new Ao1<>(10);
        this.A00 = -1;
        this.A0Y = new Ao0<>(0);
        this.A0a = new GCV(1, null);
        this.A0I = true;
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A0K = ab2;
        this.A08 = new Aeh(6);
        C1143Abw c1143Abw = new C1143Abw();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        C1143Abw.A01(c1143Abw, 6);
        this.A06 = c1143Abw;
        C1143Abw c1143Abw2 = new C1143Abw();
        C1143Abw.A01(c1143Abw2, 6);
        this.A05 = c1143Abw2;
        this.A0W = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.A0V = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A0T = new C1682AoK();
        this.A07 = new Ab2<>(6);
        this.A0C = new Ao4(ab2, androidComposeView.A11.A00());
        C1143Abw c1143Abw3 = AbstractC1146Abz.A00;
        C1143Abw c1143Abw4 = new C1143Abw();
        C1143Abw.A01(c1143Abw4, 6);
        this.A0P = c1143Abw4;
        androidComposeView.addOnAttachStateChangeListener(this);
        this.A0U = new Runnable() { // from class: X.Anu
            public static final String __redex_internal_original_name = "AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0";

            public static void A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
                AndroidComposeViewAccessibilityDelegateCompat.A0J(androidComposeViewAccessibilityDelegateCompat, 64, null, AndroidComposeViewAccessibilityDelegateCompat.A00(androidComposeViewAccessibilityDelegateCompat, i), 2048);
                AndroidComposeViewAccessibilityDelegateCompat.A0J(androidComposeViewAccessibilityDelegateCompat, 0, null, AndroidComposeViewAccessibilityDelegateCompat.A00(androidComposeViewAccessibilityDelegateCompat, i), 2048);
            }

            /* JADX WARN: Code restructure failed: missing block: B:270:0x0649, code lost:
            
                if (((r19 & ((r19 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L366;
             */
            /* JADX WARN: Removed duplicated region for block: B:126:0x02f4  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x02fc A[PHI: r15
  0x02fc: PHI (r15v16 boolean) = (r15v13 boolean), (r15v13 boolean), (r15v13 boolean), (r15v18 boolean) binds: [B:127:0x02f5, B:128:0x02f7, B:129:0x02f9, B:125:0x02f2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:140:0x034f A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:6:0x0026, B:8:0x002c, B:10:0x003f, B:13:0x0063, B:20:0x0092, B:22:0x00a2, B:24:0x00ad, B:27:0x00cf, B:34:0x00f3, B:36:0x0105, B:50:0x013f, B:53:0x014d, B:55:0x0155, B:57:0x0169, B:58:0x016e, B:60:0x0176, B:61:0x017b, B:63:0x0183, B:64:0x019f, B:66:0x01a7, B:67:0x01b8, B:69:0x01c0, B:70:0x01c5, B:72:0x01ce, B:74:0x01d8, B:76:0x01dc, B:78:0x01ec, B:80:0x020b, B:81:0x0211, B:83:0x021f, B:87:0x022b, B:89:0x0230, B:90:0x0237, B:91:0x023c, B:92:0x0247, B:93:0x024c, B:95:0x0254, B:96:0x026a, B:98:0x0274, B:100:0x027e, B:103:0x028b, B:106:0x0294, B:112:0x02ad, B:114:0x02b7, B:116:0x02bb, B:118:0x02bf, B:120:0x02cf, B:121:0x02d2, B:133:0x0300, B:137:0x0343, B:140:0x034f, B:134:0x0321, B:136:0x033a, B:141:0x036c, B:142:0x037b, B:144:0x0383, B:146:0x038b, B:149:0x0390, B:151:0x03a0, B:153:0x03bd, B:154:0x03c4, B:155:0x03ce, B:157:0x03d4, B:159:0x03dc, B:161:0x03e4, B:163:0x03ef, B:164:0x03fe, B:165:0x040f, B:167:0x0417, B:169:0x0427, B:171:0x0436, B:172:0x0444, B:174:0x0450, B:175:0x045e, B:176:0x0465, B:179:0x046e, B:181:0x0472, B:183:0x047c, B:185:0x0480, B:187:0x048c, B:189:0x0490, B:192:0x0495, B:195:0x049c, B:199:0x04ab, B:201:0x04b7, B:202:0x04bf, B:203:0x04d8, B:38:0x010d, B:40:0x0114, B:42:0x0120, B:48:0x0138, B:45:0x012b, B:47:0x0130, B:205:0x04dd, B:217:0x0513, B:210:0x04ed, B:212:0x04f3, B:213:0x04f9, B:215:0x04ff, B:224:0x0534, B:225:0x053a, B:218:0x0520, B:223:0x0530, B:227:0x0543, B:230:0x0562, B:236:0x0581, B:238:0x0592, B:240:0x059e, B:242:0x05ab, B:243:0x05b5, B:245:0x05bd, B:250:0x05c8, B:252:0x05cd, B:255:0x05d9, B:261:0x05f4, B:262:0x060c, B:263:0x0628, B:265:0x0630, B:273:0x0653, B:268:0x063b, B:269:0x0640, B:271:0x064b, B:274:0x0656, B:277:0x065f, B:278:0x0663, B:281:0x0678, B:287:0x0692, B:289:0x06a7, B:291:0x06ad, B:292:0x06bc, B:293:0x06ca, B:296:0x06d2, B:297:0x06d5), top: B:307:0x0026, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:208:0x04e9 A[PHI: r50
  0x04e9: PHI (r50v2 boolean) = (r50v1 boolean), (r50v4 boolean) binds: [B:28:0x00db, B:207:0x04e7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:212:0x04f3 A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:6:0x0026, B:8:0x002c, B:10:0x003f, B:13:0x0063, B:20:0x0092, B:22:0x00a2, B:24:0x00ad, B:27:0x00cf, B:34:0x00f3, B:36:0x0105, B:50:0x013f, B:53:0x014d, B:55:0x0155, B:57:0x0169, B:58:0x016e, B:60:0x0176, B:61:0x017b, B:63:0x0183, B:64:0x019f, B:66:0x01a7, B:67:0x01b8, B:69:0x01c0, B:70:0x01c5, B:72:0x01ce, B:74:0x01d8, B:76:0x01dc, B:78:0x01ec, B:80:0x020b, B:81:0x0211, B:83:0x021f, B:87:0x022b, B:89:0x0230, B:90:0x0237, B:91:0x023c, B:92:0x0247, B:93:0x024c, B:95:0x0254, B:96:0x026a, B:98:0x0274, B:100:0x027e, B:103:0x028b, B:106:0x0294, B:112:0x02ad, B:114:0x02b7, B:116:0x02bb, B:118:0x02bf, B:120:0x02cf, B:121:0x02d2, B:133:0x0300, B:137:0x0343, B:140:0x034f, B:134:0x0321, B:136:0x033a, B:141:0x036c, B:142:0x037b, B:144:0x0383, B:146:0x038b, B:149:0x0390, B:151:0x03a0, B:153:0x03bd, B:154:0x03c4, B:155:0x03ce, B:157:0x03d4, B:159:0x03dc, B:161:0x03e4, B:163:0x03ef, B:164:0x03fe, B:165:0x040f, B:167:0x0417, B:169:0x0427, B:171:0x0436, B:172:0x0444, B:174:0x0450, B:175:0x045e, B:176:0x0465, B:179:0x046e, B:181:0x0472, B:183:0x047c, B:185:0x0480, B:187:0x048c, B:189:0x0490, B:192:0x0495, B:195:0x049c, B:199:0x04ab, B:201:0x04b7, B:202:0x04bf, B:203:0x04d8, B:38:0x010d, B:40:0x0114, B:42:0x0120, B:48:0x0138, B:45:0x012b, B:47:0x0130, B:205:0x04dd, B:217:0x0513, B:210:0x04ed, B:212:0x04f3, B:213:0x04f9, B:215:0x04ff, B:224:0x0534, B:225:0x053a, B:218:0x0520, B:223:0x0530, B:227:0x0543, B:230:0x0562, B:236:0x0581, B:238:0x0592, B:240:0x059e, B:242:0x05ab, B:243:0x05b5, B:245:0x05bd, B:250:0x05c8, B:252:0x05cd, B:255:0x05d9, B:261:0x05f4, B:262:0x060c, B:263:0x0628, B:265:0x0630, B:273:0x0653, B:268:0x063b, B:269:0x0640, B:271:0x064b, B:274:0x0656, B:277:0x065f, B:278:0x0663, B:281:0x0678, B:287:0x0692, B:289:0x06a7, B:291:0x06ad, B:292:0x06bc, B:293:0x06ca, B:296:0x06d2, B:297:0x06d5), top: B:307:0x0026, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:221:0x052c  */
            /* JADX WARN: Removed duplicated region for block: B:276:0x065d  */
            /* JADX WARN: Removed duplicated region for block: B:295:0x06d0  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x013f A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:6:0x0026, B:8:0x002c, B:10:0x003f, B:13:0x0063, B:20:0x0092, B:22:0x00a2, B:24:0x00ad, B:27:0x00cf, B:34:0x00f3, B:36:0x0105, B:50:0x013f, B:53:0x014d, B:55:0x0155, B:57:0x0169, B:58:0x016e, B:60:0x0176, B:61:0x017b, B:63:0x0183, B:64:0x019f, B:66:0x01a7, B:67:0x01b8, B:69:0x01c0, B:70:0x01c5, B:72:0x01ce, B:74:0x01d8, B:76:0x01dc, B:78:0x01ec, B:80:0x020b, B:81:0x0211, B:83:0x021f, B:87:0x022b, B:89:0x0230, B:90:0x0237, B:91:0x023c, B:92:0x0247, B:93:0x024c, B:95:0x0254, B:96:0x026a, B:98:0x0274, B:100:0x027e, B:103:0x028b, B:106:0x0294, B:112:0x02ad, B:114:0x02b7, B:116:0x02bb, B:118:0x02bf, B:120:0x02cf, B:121:0x02d2, B:133:0x0300, B:137:0x0343, B:140:0x034f, B:134:0x0321, B:136:0x033a, B:141:0x036c, B:142:0x037b, B:144:0x0383, B:146:0x038b, B:149:0x0390, B:151:0x03a0, B:153:0x03bd, B:154:0x03c4, B:155:0x03ce, B:157:0x03d4, B:159:0x03dc, B:161:0x03e4, B:163:0x03ef, B:164:0x03fe, B:165:0x040f, B:167:0x0417, B:169:0x0427, B:171:0x0436, B:172:0x0444, B:174:0x0450, B:175:0x045e, B:176:0x0465, B:179:0x046e, B:181:0x0472, B:183:0x047c, B:185:0x0480, B:187:0x048c, B:189:0x0490, B:192:0x0495, B:195:0x049c, B:199:0x04ab, B:201:0x04b7, B:202:0x04bf, B:203:0x04d8, B:38:0x010d, B:40:0x0114, B:42:0x0120, B:48:0x0138, B:45:0x012b, B:47:0x0130, B:205:0x04dd, B:217:0x0513, B:210:0x04ed, B:212:0x04f3, B:213:0x04f9, B:215:0x04ff, B:224:0x0534, B:225:0x053a, B:218:0x0520, B:223:0x0530, B:227:0x0543, B:230:0x0562, B:236:0x0581, B:238:0x0592, B:240:0x059e, B:242:0x05ab, B:243:0x05b5, B:245:0x05bd, B:250:0x05c8, B:252:0x05cd, B:255:0x05d9, B:261:0x05f4, B:262:0x060c, B:263:0x0628, B:265:0x0630, B:273:0x0653, B:268:0x063b, B:269:0x0640, B:271:0x064b, B:274:0x0656, B:277:0x065f, B:278:0x0663, B:281:0x0678, B:287:0x0692, B:289:0x06a7, B:291:0x06ad, B:292:0x06bc, B:293:0x06ca, B:296:0x06d2, B:297:0x06d5), top: B:307:0x0026, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x014d A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:6:0x0026, B:8:0x002c, B:10:0x003f, B:13:0x0063, B:20:0x0092, B:22:0x00a2, B:24:0x00ad, B:27:0x00cf, B:34:0x00f3, B:36:0x0105, B:50:0x013f, B:53:0x014d, B:55:0x0155, B:57:0x0169, B:58:0x016e, B:60:0x0176, B:61:0x017b, B:63:0x0183, B:64:0x019f, B:66:0x01a7, B:67:0x01b8, B:69:0x01c0, B:70:0x01c5, B:72:0x01ce, B:74:0x01d8, B:76:0x01dc, B:78:0x01ec, B:80:0x020b, B:81:0x0211, B:83:0x021f, B:87:0x022b, B:89:0x0230, B:90:0x0237, B:91:0x023c, B:92:0x0247, B:93:0x024c, B:95:0x0254, B:96:0x026a, B:98:0x0274, B:100:0x027e, B:103:0x028b, B:106:0x0294, B:112:0x02ad, B:114:0x02b7, B:116:0x02bb, B:118:0x02bf, B:120:0x02cf, B:121:0x02d2, B:133:0x0300, B:137:0x0343, B:140:0x034f, B:134:0x0321, B:136:0x033a, B:141:0x036c, B:142:0x037b, B:144:0x0383, B:146:0x038b, B:149:0x0390, B:151:0x03a0, B:153:0x03bd, B:154:0x03c4, B:155:0x03ce, B:157:0x03d4, B:159:0x03dc, B:161:0x03e4, B:163:0x03ef, B:164:0x03fe, B:165:0x040f, B:167:0x0417, B:169:0x0427, B:171:0x0436, B:172:0x0444, B:174:0x0450, B:175:0x045e, B:176:0x0465, B:179:0x046e, B:181:0x0472, B:183:0x047c, B:185:0x0480, B:187:0x048c, B:189:0x0490, B:192:0x0495, B:195:0x049c, B:199:0x04ab, B:201:0x04b7, B:202:0x04bf, B:203:0x04d8, B:38:0x010d, B:40:0x0114, B:42:0x0120, B:48:0x0138, B:45:0x012b, B:47:0x0130, B:205:0x04dd, B:217:0x0513, B:210:0x04ed, B:212:0x04f3, B:213:0x04f9, B:215:0x04ff, B:224:0x0534, B:225:0x053a, B:218:0x0520, B:223:0x0530, B:227:0x0543, B:230:0x0562, B:236:0x0581, B:238:0x0592, B:240:0x059e, B:242:0x05ab, B:243:0x05b5, B:245:0x05bd, B:250:0x05c8, B:252:0x05cd, B:255:0x05d9, B:261:0x05f4, B:262:0x060c, B:263:0x0628, B:265:0x0630, B:273:0x0653, B:268:0x063b, B:269:0x0640, B:271:0x064b, B:274:0x0656, B:277:0x065f, B:278:0x0663, B:281:0x0678, B:287:0x0692, B:289:0x06a7, B:291:0x06ad, B:292:0x06bc, B:293:0x06ca, B:296:0x06d2, B:297:0x06d5), top: B:307:0x0026, outer: #1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1789
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1669Anu.run():void");
            }
        };
        this.A0X = C3cG.A0h();
        this.A0Z = BUX.A00(this, 44);
    }

    public static final AccessibilityEvent A07(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        C1629An1 c1629An1;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(BAV.DEFAULT_CLASS_NAME);
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0S;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0S() && (c1629An1 = (C1629An1) A08(androidComposeViewAccessibilityDelegateCompat).A04(i)) != null) {
            C0919AHv c0919AHv = c1629An1.A00.A04;
            accessibilityEventObtain.setPassword(AbstractC0915AHr.A00(c0919AHv, AbstractC1671Anw.A0T));
            boolean zA1P = C3cG.A1P(AlP.A01(c0919AHv, AbstractC1671Anw.A0M), true);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC1688AoS.A00(accessibilityEventObtain, zA1P);
            }
        }
        return accessibilityEventObtain;
    }

    public static AbstractC1555AlK A0A(AaC aaC, C1DM c1dm, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C1562Alc c1562Alc) {
        return c1dm.mo2createOutlinePq9zytI(aaC.A01(), c1562Alc.A03.A0G, androidComposeViewAccessibilityDelegateCompat.A0S.getDensity());
    }

    public static final CharSequence A0B(CharSequence charSequence) {
        int i = 100000;
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        C7384Etj.A0Z(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    public static final void A0E(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0S()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                androidComposeViewAccessibilityDelegateCompat.A0J = true;
            }
            try {
                androidComposeViewAccessibilityDelegateCompat.A0M.invoke(accessibilityEvent);
            } finally {
                androidComposeViewAccessibilityDelegateCompat.A0J = false;
            }
        }
    }

    public static final void A0K(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent accessibilityEventA07 = A07(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i), 32);
        accessibilityEventA07.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventA07.getText().add(str);
        }
        A0E(accessibilityEventA07, androidComposeViewAccessibilityDelegateCompat);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0T(int r19, long r20, boolean r22) {
        /*
            r18 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lcc
            X.Ab0 r8 = A08(r18)
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2 = r20
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 == 0) goto Lcc
            r6 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r6 = r6 & r20
            r0 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r6 = r6 + r0
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r6 = r6 & r0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto Lcc
            r0 = 1
            r1 = r22
            if (r1 != r0) goto Lc8
            X.AHw<X.Ao7> r11 = X.AbstractC1671Anw.A0i
        L41:
            java.lang.Object[] r10 = r8.A04
            long[] r9 = r8.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto Lcc
            r7 = 0
            r18 = 0
        L4d:
            r16 = r9[r7]
            long r12 = X.C8j5.A0A(r16)
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r4
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto Lc3
            int r0 = X.C8j3.A0E(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L66:
            if (r4 >= r5) goto Lc1
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r16 & r0
            r12 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto La9
            java.lang.Object r1 = X.C8j3.A11(r10, r7, r4)
            X.An1 r1 = (X.C1629An1) r1
            X.BLU r0 = r1.A01
            X.AaC r0 = X.C2Un.A00(r0)
            boolean r0 = r0.A06(r2)
            if (r0 == 0) goto La9
            X.Alc r0 = r1.A00
            X.AHv r0 = r0.A04
            java.lang.Object r12 = X.AlP.A01(r0, r11)
            X.Ao7 r12 = (X.Ao7) r12
            if (r12 == 0) goto La9
            boolean r1 = r12.A02
            r13 = r19
            r0 = r13
            if (r1 == 0) goto L98
            int r0 = -r13
        L98:
            if (r19 != 0) goto Lae
            if (r1 == 0) goto Lae
        L9c:
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r12.A01
            float r1 = X.AnonymousClass003.A04(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto La9
        La7:
            r18 = 1
        La9:
            long r16 = r16 >> r6
            int r4 = r4 + 1
            goto L66
        Lae:
            if (r0 < 0) goto L9c
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r12.A01
            float r1 = X.AnonymousClass003.A04(r0)
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r12.A00
            float r0 = X.AnonymousClass003.A04(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto La9
            goto La7
        Lc1:
            if (r5 != r6) goto Lce
        Lc3:
            if (r7 == r8) goto Lce
            int r7 = r7 + 1
            goto L4d
        Lc8:
            X.AHw<X.Ao7> r11 = X.AbstractC1671Anw.A0C
            goto L41
        Lcc:
            r18 = 0
        Lce:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0T(int, long, boolean):boolean");
    }

    @Override // X.C8053FRg
    public final FRa getAccessibilityNodeProvider(View view) {
        return this.A0L;
    }
}
