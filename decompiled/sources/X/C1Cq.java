package X;

import android.view.View;
import androidx.compose.runtime.MutableState;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Cq, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Cq {
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA3;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(AT5 at5, BA3 ba3, BFM bfm, Function0 function0, G0V g0v, int i) {
        bfm.AgG(1254951810);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, ba3);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(at5, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((iA0T & 1171) == 1170 && bfm.AKh()) {
            bfm.Afo();
        } else {
            View viewA0J = AnonymousClass001.A0J(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            BBM bbmA5U = bfm.A5U();
            MutableState mutableStateA00 = C1er.A00(bfm, g0v);
            UUID uuid = (UUID) AFz.A02(bfm, null, new C05443bq(6), new Object[0], 6);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = ((C066978i) AnonymousClass007.A0V(bfm, objAaT, obj)).A00;
            boolean zA00 = C3O5.A00(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, viewA0J, axnA0Y);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (zA1K || objAaT2 == obj) {
                BA1 ba1 = new BA1(viewA0J, at5, ba3, axnA0Y, enumC1820ArjA0d, uuid, function0, c3ux, zA00);
                B1U b1uA01 = B1V.A01(new C05473bt(mutableStateA00, 10), -1560960657, true);
                ApG apG = ba1.A03;
                apG.setParentCompositionContext(bbmA5U);
                apG.A03.Af8(b1uA01);
                apG.A01 = true;
                apG.A0B();
                bfm.Ai0(ba1);
                obj2 = ba1;
            }
            boolean zA67 = bfm.A67(obj2);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new BUX(obj2, 13);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, obj2);
            boolean zA1W = AnonymousClass002.A1W(bfm, enumC1820ArjA0d, bfm.A67(obj2) | AnonymousClass004.A1F(iA0T), AnonymousClass004.A1I(iA0T));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new C3c9(enumC1820ArjA0d, ba3, obj2, function0, 2);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A15(bfm, objAaT4);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Cp(at5, ba3, function0, g0v, i);
        }
    }
}
