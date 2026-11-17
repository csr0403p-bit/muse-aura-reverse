package X;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.ArrayList;

/* renamed from: X.Fjo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8749Fjo {
    public static final C6823Eab A01 = C6823Eab.A00("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final C6823Eab A02 = AbstractC7607F5u.A0p("d", "a");
    public static final C6823Eab A00 = AbstractC7607F5u.A0p("ty", "nm");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static C8675Fib A00(C6837Eap c6837Eap, AbstractC6806EaH abstractC6806EaH) {
        StringBuilder sb;
        String str;
        Integer num = C79.A00;
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        abstractC6806EaH.A0G();
        String strA0E = "UNSET";
        C8690Fiq c8690Fiq = null;
        Float fValueOf = Float.valueOf(0.0f);
        float fA09 = 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        Integer num2 = num;
        C8695Fiv c8695Fiv = null;
        C8689Fip c8689FipA01 = null;
        C8791FkV c8791FkV = null;
        C8778FkI c8778FkI = null;
        long jA0A = 0;
        Integer num3 = num;
        long jA0A2 = -1;
        boolean z = false;
        float fA092 = 0.0f;
        float fA093 = 0.0f;
        float fA094 = 0.0f;
        int iA0A = 0;
        int iA0A2 = 0;
        int color = 0;
        float fA095 = 0.0f;
        float fA096 = 0.0f;
        boolean zA0M = false;
        String strA0E2 = null;
        C8728FjT c8728FjT = null;
        Integer num4 = null;
        String strA0E3 = null;
        while (abstractC6806EaH.A0L()) {
            switch (abstractC6806EaH.A0B(A01)) {
                case 0:
                    strA0E = abstractC6806EaH.A0E();
                    break;
                case 1:
                    jA0A = abstractC6806EaH.A0A();
                    break;
                case 2:
                    strA0E3 = abstractC6806EaH.A0E();
                    break;
                case 3:
                    int iA0A3 = abstractC6806EaH.A0A();
                    num4 = C79.A0W;
                    if (iA0A3 >= 6) {
                        break;
                    } else {
                        num4 = C79.A00(7)[iA0A3];
                        break;
                    }
                case 4:
                    jA0A2 = abstractC6806EaH.A0A();
                    break;
                case 5:
                    iA0A = (int) (abstractC6806EaH.A0A() * AbstractC8712FjD.A00());
                    break;
                case 6:
                    iA0A2 = (int) (abstractC6806EaH.A0A() * AbstractC8712FjD.A00());
                    break;
                case 7:
                    color = Color.parseColor(abstractC6806EaH.A0E());
                    break;
                case 8:
                    c8728FjT = AbstractC8750Fjp.A00(c6837Eap, abstractC6806EaH);
                    break;
                case 9:
                    int iA0A4 = abstractC6806EaH.A0A();
                    if (iA0A4 >= C79.A00(6).length) {
                        sb = new StringBuilder("Unsupported matte type: ");
                        sb.append(iA0A4);
                        c6837Eap.A02(sb.toString());
                        break;
                    } else {
                        num3 = C79.A00(6)[iA0A4];
                        int iIntValue = num3.intValue();
                        if (iIntValue != 3) {
                            str = iIntValue == 4 ? "Unsupported matte type: Luma Inverted" : "Unsupported matte type: Luma";
                            c6837Eap.A04++;
                            break;
                        }
                        c6837Eap.A02(str);
                        c6837Eap.A04++;
                    }
                case 10:
                    abstractC6806EaH.A0F();
                    while (abstractC6806EaH.A0L()) {
                        abstractC6806EaH.A0G();
                        Integer num5 = null;
                        C8688Fio c8688Fio = null;
                        C8766Fk5 c8766Fk5A02 = null;
                        boolean zA0M2 = false;
                        while (abstractC6806EaH.A0L()) {
                            String strA0D = abstractC6806EaH.A0D();
                            switch (strA0D.hashCode()) {
                                case 111:
                                    if (!strA0D.equals("o")) {
                                        abstractC6806EaH.A0K();
                                        break;
                                    } else {
                                        c8766Fk5A02 = AbstractC8756Fjv.A02(c6837Eap, abstractC6806EaH);
                                        break;
                                    }
                                case 3588:
                                    if (!strA0D.equals("pt")) {
                                        abstractC6806EaH.A0K();
                                        break;
                                    } else {
                                        c8688Fio = new C8688Fio(AbstractC8753Fjs.A00(c6837Eap, HnX.A00, abstractC6806EaH, AbstractC8712FjD.A00(), false));
                                        break;
                                    }
                                case 104433:
                                    if (!strA0D.equals("inv")) {
                                        abstractC6806EaH.A0K();
                                        break;
                                    } else {
                                        zA0M2 = abstractC6806EaH.A0M();
                                        break;
                                    }
                                case 3357091:
                                    if (!strA0D.equals(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM)) {
                                        abstractC6806EaH.A0K();
                                        break;
                                    } else {
                                        String strA0E4 = abstractC6806EaH.A0E();
                                        switch (strA0E4.hashCode()) {
                                            case 97:
                                                if (!strA0E4.equals("a")) {
                                                    BXP.A00(FGI.A0U("Unknown mask mode ", strA0D, ". Defaulting to Add."));
                                                    num5 = num;
                                                    break;
                                                } else {
                                                    num5 = num;
                                                    break;
                                                }
                                            case 105:
                                                if (!strA0E4.equals("i")) {
                                                    BXP.A00(FGI.A0U("Unknown mask mode ", strA0D, ". Defaulting to Add."));
                                                    num5 = num;
                                                    break;
                                                } else {
                                                    c6837Eap.A02("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                    num5 = C79.A0C;
                                                    break;
                                                }
                                            case 110:
                                                if (!strA0E4.equals("n")) {
                                                    BXP.A00(FGI.A0U("Unknown mask mode ", strA0D, ". Defaulting to Add."));
                                                    num5 = num;
                                                    break;
                                                } else {
                                                    num5 = C79.A0K;
                                                    break;
                                                }
                                            case 115:
                                                if (!strA0E4.equals("s")) {
                                                    BXP.A00(FGI.A0U("Unknown mask mode ", strA0D, ". Defaulting to Add."));
                                                    num5 = num;
                                                    break;
                                                } else {
                                                    num5 = C79.A01;
                                                    break;
                                                }
                                            default:
                                                BXP.A00(FGI.A0U("Unknown mask mode ", strA0D, ". Defaulting to Add."));
                                                num5 = num;
                                                break;
                                        }
                                    }
                                default:
                                    abstractC6806EaH.A0K();
                                    break;
                            }
                        }
                        abstractC6806EaH.A0I();
                        arrayListA0h.add(new C8693Fit(c8766Fk5A02, c8688Fio, num5, zA0M2));
                    }
                    c6837Eap.A04 += arrayListA0h.size();
                    abstractC6806EaH.A0H();
                    break;
                case 11:
                    abstractC6806EaH.A0F();
                    while (abstractC6806EaH.A0L()) {
                        InterfaceC8696Fiw interfaceC8696FiwA02 = AbstractC8748Fjn.A02(c6837Eap, abstractC6806EaH);
                        if (interfaceC8696FiwA02 != null) {
                            arrayListA0h2.add(interfaceC8696FiwA02);
                        }
                    }
                    abstractC6806EaH.A0H();
                    break;
                case 12:
                    abstractC6806EaH.A0G();
                    while (abstractC6806EaH.A0L()) {
                        int iA0B = abstractC6806EaH.A0B(A02);
                        if (iA0B == 0) {
                            c8690Fiq = new C8690Fiq(AbstractC8753Fjs.A00(c6837Eap, C8754Fjt.A00, abstractC6806EaH, AbstractC8712FjD.A00(), false));
                        } else if (iA0B != 1) {
                            abstractC6806EaH.A0J();
                            abstractC6806EaH.A0K();
                        } else {
                            abstractC6806EaH.A0F();
                            if (abstractC6806EaH.A0L()) {
                                C6823Eab c6823Eab = Hjs.A00;
                                abstractC6806EaH.A0G();
                                c8695Fiv = null;
                                while (abstractC6806EaH.A0L()) {
                                    if (abstractC6806EaH.A0B(Hjs.A01) != 0) {
                                        abstractC6806EaH.A0J();
                                        abstractC6806EaH.A0K();
                                    } else {
                                        abstractC6806EaH.A0G();
                                        C8764Fk3 c8764Fk3A00 = null;
                                        C8764Fk3 c8764Fk3A002 = null;
                                        C8689Fip c8689FipA012 = null;
                                        C8689Fip c8689FipA013 = null;
                                        while (abstractC6806EaH.A0L()) {
                                            int iA0B2 = abstractC6806EaH.A0B(Hjs.A00);
                                            if (iA0B2 == 0) {
                                                c8764Fk3A00 = AbstractC8756Fjv.A00(c6837Eap, abstractC6806EaH);
                                            } else if (iA0B2 == 1) {
                                                c8764Fk3A002 = AbstractC8756Fjv.A00(c6837Eap, abstractC6806EaH);
                                            } else if (iA0B2 == 2) {
                                                c8689FipA012 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
                                            } else if (iA0B2 != 3) {
                                                abstractC6806EaH.A0J();
                                                abstractC6806EaH.A0K();
                                            } else {
                                                c8689FipA013 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
                                            }
                                        }
                                        abstractC6806EaH.A0I();
                                        c8695Fiv = new C8695Fiv(c8764Fk3A00, c8764Fk3A002, c8689FipA012, c8689FipA013);
                                    }
                                }
                                abstractC6806EaH.A0I();
                                if (c8695Fiv == null) {
                                    c8695Fiv = new C8695Fiv(null, null, null, null);
                                }
                            }
                            while (abstractC6806EaH.A0L()) {
                                abstractC6806EaH.A0K();
                            }
                            abstractC6806EaH.A0H();
                        }
                    }
                    abstractC6806EaH.A0I();
                    break;
                case 13:
                    abstractC6806EaH.A0F();
                    ArrayList arrayList = new ArrayList();
                    while (abstractC6806EaH.A0L()) {
                        abstractC6806EaH.A0G();
                        while (abstractC6806EaH.A0L()) {
                            int iA0B3 = abstractC6806EaH.A0B(A00);
                            if (iA0B3 == 0) {
                                int iA0A5 = abstractC6806EaH.A0A();
                                if (iA0A5 == 29) {
                                    C6823Eab c6823Eab2 = AbstractC8777FkH.A00;
                                    c8791FkV = null;
                                    while (abstractC6806EaH.A0L()) {
                                        if (abstractC6806EaH.A0B(AbstractC8777FkH.A00) != 0) {
                                            abstractC6806EaH.A0J();
                                            abstractC6806EaH.A0K();
                                        } else {
                                            abstractC6806EaH.A0F();
                                            while (abstractC6806EaH.A0L()) {
                                                abstractC6806EaH.A0G();
                                                C8791FkV c8791FkV2 = null;
                                                while (true) {
                                                    boolean z2 = false;
                                                    while (abstractC6806EaH.A0L()) {
                                                        int iA0B4 = abstractC6806EaH.A0B(AbstractC8777FkH.A01);
                                                        if (iA0B4 != 0) {
                                                            if (iA0B4 != 1) {
                                                                abstractC6806EaH.A0J();
                                                            } else if (z2) {
                                                                c8791FkV2 = new C8791FkV(AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true));
                                                            }
                                                            abstractC6806EaH.A0K();
                                                        } else {
                                                            z2 = true;
                                                            if (abstractC6806EaH.A0A() != 0) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    abstractC6806EaH.A0I();
                                                    if (c8791FkV2 != null) {
                                                        c8791FkV = c8791FkV2;
                                                    }
                                                }
                                            }
                                            abstractC6806EaH.A0H();
                                        }
                                    }
                                } else if (iA0A5 == 25) {
                                    C6823Eab c6823Eab3 = AbstractC8779FkJ.A00;
                                    C8764Fk3 c8764Fk3A003 = null;
                                    C8689Fip c8689FipA014 = null;
                                    C8689Fip c8689FipA015 = null;
                                    C8689Fip c8689FipA016 = null;
                                    C8689Fip c8689FipA017 = null;
                                    while (abstractC6806EaH.A0L()) {
                                        if (abstractC6806EaH.A0B(AbstractC8779FkJ.A00) != 0) {
                                            abstractC6806EaH.A0J();
                                            abstractC6806EaH.A0K();
                                        } else {
                                            abstractC6806EaH.A0F();
                                            while (abstractC6806EaH.A0L()) {
                                                abstractC6806EaH.A0G();
                                                String strA0E5 = "";
                                                while (abstractC6806EaH.A0L()) {
                                                    int iA0B5 = abstractC6806EaH.A0B(AbstractC8779FkJ.A01);
                                                    if (iA0B5 != 0) {
                                                        if (iA0B5 == 1) {
                                                            switch (strA0E5.hashCode()) {
                                                                case 353103893:
                                                                    if (!strA0E5.equals("Distance")) {
                                                                        break;
                                                                    } else {
                                                                        c8689FipA015 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
                                                                        break;
                                                                    }
                                                                case 397447147:
                                                                    if (!strA0E5.equals("Opacity")) {
                                                                        break;
                                                                    } else {
                                                                        c8689FipA016 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, false);
                                                                        break;
                                                                    }
                                                                case 1041377119:
                                                                    if (!strA0E5.equals("Direction")) {
                                                                        break;
                                                                    } else {
                                                                        c8689FipA014 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, false);
                                                                        break;
                                                                    }
                                                                case 1379387491:
                                                                    if (!strA0E5.equals("Shadow Color")) {
                                                                        break;
                                                                    } else {
                                                                        c8764Fk3A003 = AbstractC8756Fjv.A00(c6837Eap, abstractC6806EaH);
                                                                        break;
                                                                    }
                                                                case 1383710113:
                                                                    if (!strA0E5.equals("Softness")) {
                                                                        break;
                                                                    } else {
                                                                        c8689FipA017 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
                                                                        break;
                                                                    }
                                                            }
                                                        } else {
                                                            abstractC6806EaH.A0J();
                                                        }
                                                        abstractC6806EaH.A0K();
                                                    } else {
                                                        strA0E5 = abstractC6806EaH.A0E();
                                                    }
                                                }
                                                abstractC6806EaH.A0I();
                                            }
                                            abstractC6806EaH.A0H();
                                        }
                                    }
                                    c8778FkI = (c8764Fk3A003 == null || c8689FipA016 == null || c8689FipA014 == null || c8689FipA015 == null || c8689FipA017 == null) ? null : new C8778FkI(c8764Fk3A003, c8689FipA016, c8689FipA014, c8689FipA015, c8689FipA017);
                                }
                            } else if (iA0B3 != 1) {
                                abstractC6806EaH.A0J();
                                abstractC6806EaH.A0K();
                            } else {
                                arrayList.add(abstractC6806EaH.A0E());
                            }
                        }
                        abstractC6806EaH.A0I();
                    }
                    abstractC6806EaH.A0H();
                    sb = new StringBuilder("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sb.append(arrayList);
                    c6837Eap.A02(sb.toString());
                    break;
                case 14:
                    fA09 = (float) abstractC6806EaH.A09();
                    break;
                case 15:
                    fA092 = (float) abstractC6806EaH.A09();
                    break;
                case 16:
                    fA095 = (float) (abstractC6806EaH.A09() * AbstractC8712FjD.A00());
                    break;
                case 17:
                    fA096 = (float) (abstractC6806EaH.A09() * AbstractC8712FjD.A00());
                    break;
                case 18:
                    fA093 = (float) abstractC6806EaH.A09();
                    break;
                case 19:
                    fA094 = (float) abstractC6806EaH.A09();
                    break;
                case 20:
                    c8689FipA01 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, false);
                    break;
                case 21:
                    strA0E2 = abstractC6806EaH.A0E();
                    break;
                case 22:
                    zA0M = abstractC6806EaH.A0M();
                    break;
                case 23:
                    z = false;
                    if (abstractC6806EaH.A0A() != 1) {
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 24:
                    int iA0A6 = abstractC6806EaH.A0A();
                    if (iA0A6 < C79.A00(18).length) {
                        num2 = C79.A00(18)[iA0A6];
                        break;
                    } else {
                        c6837Eap.A02(FGI.A0H("Unsupported Blend Mode: ", iA0A6));
                        num2 = num;
                        break;
                    }
                default:
                    abstractC6806EaH.A0J();
                    abstractC6806EaH.A0K();
                    break;
            }
        }
        abstractC6806EaH.A0I();
        ArrayList arrayListA0h3 = C3cG.A0h();
        if (fA093 > 0.0f) {
            arrayListA0h3.add(new C8725FjQ((Interpolator) null, c6837Eap, Float.valueOf(fA093), fValueOf, fValueOf, 0.0f));
        }
        if (fA094 <= 0.0f) {
            fA094 = c6837Eap.A00;
        }
        arrayListA0h3.add(new C8725FjQ((Interpolator) null, c6837Eap, Float.valueOf(fA094), fValueOf2, fValueOf2, fA093));
        arrayListA0h3.add(new C8725FjQ((Interpolator) null, c6837Eap, Float.valueOf(Float.MAX_VALUE), fValueOf, fValueOf, fA094));
        if (strA0E.endsWith(".ai") || "ai".equals(strA0E2)) {
            c6837Eap.A02("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (c8728FjT == null) {
                c8728FjT = new C8728FjT();
            }
            c8728FjT.A00 = true;
        }
        return new C8675Fib(c6837Eap, c8689FipA01, c8690Fiq, c8695Fiv, c8728FjT, c8791FkV, c8778FkI, num4, num3, num2, strA0E, strA0E3, arrayListA0h2, arrayListA0h, arrayListA0h3, fA09, fA092, fA095, fA096, iA0A, iA0A2, color, jA0A, jA0A2, zA0M);
    }
}
