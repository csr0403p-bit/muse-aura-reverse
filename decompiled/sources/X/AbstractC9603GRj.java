package X;

import com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GRj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9603GRj {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/atomic/AtomicReference<LX/GSQ;>;LX/Hqv<LX/HoC;>;LX/Hqv<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;LX/G0U<-LX/GSQ;Lkotlin/Unit;>;LX/GSQ;)V */
    public static final void A01(GSQ gsq, AtomicReference atomicReference, G0U g0u, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2) {
        if (!Bs8.A00(null, gsq, atomicReference)) {
            String strA0y = AnonymousClass006.A0y(gsq, ". Ignoring later value: ", C3cG.A0f(atomicReference.get(), "Already completed with result: "));
            C7384Etj.A0Y(strA0y, 1);
            AbstractC7608F5v.A1L(strA0y);
            return;
        }
        HoC hoC = (HoC) c10543Hqv.element;
        if (hoC != null) {
            hoC.A5w(null);
        }
        Function0 function0 = (Function0) c10543Hqv2.element;
        if (function0 != null) {
            function0.invoke();
        }
        g0u.invoke(gsq);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/G0U<-LX/GRe;Lkotlin/Unit;>;LX/G0U<-LX/GRH;Ljava/lang/Boolean;>;JLX/HtJ<-LX/GSQ;>;)Ljava/lang/Object; */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.Hqc] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlin.jvm.functions.Function0] */
    public static final Object A00(String str, HtJ htJ, G0U g0u, G0U g0u2, long j) {
        GSQ gs5;
        String str2 = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        FZS fzsA02 = FZS.A02(gbl, 31);
        if (j != Long.MIN_VALUE && j <= 0) {
            throw C3cG.A0Q(FGI.A0B(j, "timeout must be a positive value or NEVER_TIME_OUT: "));
        }
        AtomicReference atomicReferenceA16 = BV4.A16(null);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        C10543Hqv c10543HqvA0z2 = C3cG.A0z();
        GRZ grzA00 = GRK.A00(str);
        if (C7384Etj.areEqual(grzA00, GRK.A01)) {
            gs5 = GSF.A00;
        } else {
            if (!AnonymousClass003.A1X(grzA00.AFy().invoke(), g0u2)) {
                c10543HqvA0z.element = grzA00.A00(new C9602GRi(grzA00, atomicReferenceA16, g0u, g0u2, fzsA02, c10543HqvA0z2, c10543HqvA0z), true);
                if (j != Long.MIN_VALUE) {
                    c10543HqvA0z2.element = AnonymousClass001.A11(new WaitForCallConditionKt$waitForCallCondition$3(grzA00, str, atomicReferenceA16, null, g0u2, fzsA02, c10543HqvA0z2, c10543HqvA0z, j), Hxb.A02(new C8eO(null)));
                }
                return gbl.A0F();
            }
            gs5 = new GS5(grzA00);
        }
        A01(gs5, atomicReferenceA16, fzsA02, c10543HqvA0z2, c10543HqvA0z);
        return gbl.A0F();
    }
}
