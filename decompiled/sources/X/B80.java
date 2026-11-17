package X;

import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class B80 {
    /* JADX WARN: Incorrect types in method signature: (LX/AMb<+LX/AMZ;>;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, final AMb aMb, Function0 function0, final Function0 function02, final int i, final int i2, boolean z) {
        boolean z2;
        Function0 function03 = function0;
        bfm.AgG(1220469155);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aMb) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function03);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            z2 = i3 == 0 ? z : true;
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = C2283BSj.A00(bfm, 29);
                }
                function03 = (Function0) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = C2283BSj.A00(bfm, 30);
            }
            Function0 function04 = (Function0) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = C2283BSj.A00(bfm, 31);
            }
            int i5 = (iA0d & 14) | 3504;
            int i6 = iA0d << 9;
            A01(bfm, aMb, function04, (Function0) objAaT3, function03, function02, AnonymousClass001.A05(i6, AnonymousClass004.A02(i6, i5)), 0, false, z2);
        } else {
            bfm.Afo();
            z2 = z;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final Function0 function05 = function03;
            final boolean z3 = z2;
            bBbAAc.A06 = new G0V() { // from class: X.AMa
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AMb aMb2 = aMb;
                    boolean z4 = z3;
                    Function0 function06 = function05;
                    Function0 function07 = function02;
                    int i7 = i;
                    B80.A00((BFM) obj2, aMb2, function06, function07, AnonymousClass011.A00(i7), i2, z4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AMb<+LX/AMZ;>;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(BFM bfm, final AMb aMb, Function0 function0, Function0 function02, Function0 function03, Function0 function04, final int i, final int i2, boolean z, boolean z2) {
        final boolean zA1Q = z;
        final boolean zA1Q2 = z2;
        Function0 function05 = function0;
        Function0 function06 = function02;
        Function0 function07 = function03;
        Function0 function08 = function04;
        bfm.AgG(898330592);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aMb) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, zA1Q);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function05);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function06);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1Q2);
        }
        int i7 = i2 & 32;
        int iA0Y = 196608;
        if (i7 != 0) {
            iA0d |= iA0Y;
        } else if ((i & 196608) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function07);
            iA0d |= iA0Y;
        }
        int i8 = i2 & 64;
        int iA0Z = 1572864;
        if (i8 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function08);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            zA1Q = C60Q.A1Q(i3, zA1Q);
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = C2283BSj.A00(bfm, 32);
                }
                function05 = (Function0) objAaT;
            }
            if (i5 != 0) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = C2283BSj.A00(bfm, 33);
                }
                function06 = (Function0) objAaT2;
            }
            zA1Q2 = C60Q.A1Q(i6, zA1Q2);
            if (i7 != 0) {
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = C2283BSj.A00(bfm, 27);
                }
                function07 = (Function0) objAaT3;
            }
            if (i8 != 0) {
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == C78N.A00) {
                    objAaT4 = C2283BSj.A00(bfm, 28);
                }
                function08 = (Function0) objAaT4;
            }
            C28u c28uA00 = C1EP.A00(bfm);
            if (c28uA00 == null) {
                throw C3cG.A0Q("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
            }
            C2183B9b navigationEventDispatcher = c28uA00.getNavigationEventDispatcher();
            int i9 = iA0d & 14;
            boolean zA17 = AnonymousClass003.A17(i9);
            Object objAaT5 = bfm.AaT();
            if (zA17 || objAaT5 == C78N.A00) {
                objAaT5 = new B9X((AMZ) aMb.A02.getValue(), C2297BSx.A00(aMb, 40));
                BBI.A0T(bfm, objAaT5);
            }
            final B9X b9x = (B9X) objAaT5;
            boolean zA67 = bfm.A67(b9x) | AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass005.A1L(iA0d) | AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1C(iA0d) | AnonymousClass003.A17(i9);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == C78N.A00) {
                final Function0 function09 = function05;
                final Function0 function010 = function06;
                final Function0 function011 = function07;
                final Function0 function012 = function08;
                objAaT6 = new Function0() { // from class: X.B9W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        B9X b9x2 = b9x;
                        boolean z3 = zA1Q;
                        Function0<Unit> function013 = function09;
                        Function0<Unit> function014 = function010;
                        boolean z4 = zA1Q2;
                        Function0<Unit> function015 = function011;
                        Function0<Unit> function016 = function012;
                        AMb aMb2 = aMb;
                        if (b9x2.A06 != z3) {
                            b9x2.A06 = z3;
                            C2183B9b c2183B9b = ((B9Z) b9x2).A00;
                            if (c2183B9b != null) {
                                c2183B9b.A00.A01();
                            }
                        }
                        b9x2.A02 = function013;
                        b9x2.A03 = function014;
                        b9x2.A02(z4);
                        b9x2.A00 = function015;
                        b9x2.A01 = function016;
                        T t = (T) aMb2.A02.getValue();
                        List<? extends T> listA1C = C8j3.A1C(aMb2.A01);
                        List<? extends T> listA1C2 = C8j3.A1C(aMb2.A03);
                        AnonymousClass005.A0x(t, listA1C, listA1C2);
                        ((B9Z) b9x2).A01 = t;
                        ((B9Z) b9x2).A03 = listA1C;
                        ((B9Z) b9x2).A04 = listA1C2;
                        C2183B9b c2183B9b2 = ((B9Z) b9x2).A00;
                        if (c2183B9b2 != null) {
                            c2183B9b2.A00.A03(b9x2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT6);
            }
            bfm.AZp((Function0) objAaT6);
            boolean zA1V = AnonymousClass002.A1V(bfm, navigationEventDispatcher, bfm.A67(b9x), i9 == 4);
            Object objAaT7 = bfm.AaT();
            if (zA1V || objAaT7 == C78N.A00) {
                objAaT7 = new BTL(navigationEventDispatcher, aMb, b9x, 13);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A17(bfm, objAaT7, aMb);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final boolean z3 = zA1Q2;
            final boolean z4 = zA1Q;
            final Function0 function013 = function08;
            final Function0 function014 = function07;
            final Function0 function015 = function06;
            final Function0 function016 = function05;
            bBbAAc.A06 = new G0V() { // from class: X.B7y
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AMb aMb2 = aMb;
                    boolean z5 = z4;
                    Function0 function017 = function016;
                    Function0 function018 = function015;
                    boolean z6 = z3;
                    Function0 function019 = function014;
                    Function0 function020 = function013;
                    int i10 = i;
                    B80.A01((BFM) obj, aMb2, function017, function018, function019, function020, AnonymousClass011.A00(i10), i2, z5, z6);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
