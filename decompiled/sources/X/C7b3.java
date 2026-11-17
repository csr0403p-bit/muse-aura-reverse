package X;

import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7b3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7b3 {
    public static G2n<BRg, String, Boolean, C7az, G0W<? super B6A, ? super BFM, ? super Integer, Unit>, Function0<Unit>, BFM, Integer, Unit> A01 = B1V.A01(new G2n() { // from class: X.7b2
        @Override // X.G2n
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            BRg bRg = (BRg) obj;
            String str = (String) obj2;
            boolean zA1X = AnonymousClass001.A1X(obj3);
            C7az c7az = (C7az) obj4;
            G0W g0w = (G0W) obj5;
            Function0 function0 = (Function0) obj6;
            BFM bfm = (BFM) obj7;
            int iA0F = AnonymousClass001.A0F(obj8);
            int iA0d = (iA0F & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | iA0F : iA0F;
            if ((iA0F & 48) == 0) {
                iA0d |= AnonymousClass004.A0e(bfm, str);
            }
            if ((iA0F & 384) == 0) {
                iA0d |= AnonymousClass004.A0p(bfm, zA1X);
            }
            if ((iA0F & 3072) == 0) {
                iA0d |= AnonymousClass004.A0g(bfm, c7az);
            }
            if ((iA0F & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
                iA0d |= AnonymousClass004.A0X(bfm, g0w);
            }
            if ((iA0F & 196608) == 0) {
                iA0d |= AnonymousClass004.A0Y(bfm, function0);
            }
            if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
                AbstractC06777ay.A00(c7az, bfm, bRg, str, function0, g0w, AnonymousClass001.A08(iA0d, ((iA0d >> 3) & 1022) | ((iA0d << 9) & 7168) | (57344 & iA0d)), 0, zA1X);
            } else {
                bfm.Afo();
            }
            return Unit.INSTANCE;
        }
    }, -1571120048, false);
    public static G0W<C7az, BFM, Integer, Unit> A00 = B1V.A01(new G0W() { // from class: X.6lO
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C7az c7az = (C7az) obj;
            BFM bfm = (BFM) obj2;
            int iA0F = AnonymousClass001.A0F(obj3);
            if ((iA0F & 6) == 0) {
                iA0F |= AnonymousClass004.A0d(bfm, c7az);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 19, 18), bfm, iA0F)) {
                BS0 bs0 = BRg.A00;
                C1AC c1ac = C7b0.A03;
                C1b8.A04(bfm, C10G.A04(AnonymousClass001.A0R(C3U4.A06(bs0, 8.0f)), 1.0f), c7az.A03);
            } else {
                bfm.Afo();
            }
            return Unit.INSTANCE;
        }
    }, -1455401925, false);
}
