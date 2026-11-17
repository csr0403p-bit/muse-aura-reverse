package com.facebook.aura.components.musicattribution;

import X.AEk;
import X.ART;
import X.ASR;
import X.AST;
import X.AT3;
import X.AnonymousClass004;
import X.B6A;
import X.BRg;
import X.C1335AhM;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraTopScrimKt {
    /* renamed from: auraTopScrim-4WTKRHQ, reason: not valid java name */
    public static final BRg m377auraTopScrim4WTKRHQ(BRg bRg, final long j) {
        C7384Etj.A0Y(bRg, 0);
        return AEk.A02(bRg, new G0U() { // from class: com.facebook.aura.components.musicattribution.AuraTopScrimKt$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AuraTopScrimKt.auraTopScrim_4WTKRHQ$lambda$0(j, (AST) obj);
            }
        });
    }

    public static final ASR auraTopScrim_4WTKRHQ$lambda$0(long j, AST ast) {
        C7384Etj.A0Y(ast, 1);
        final C1335AhM c1335AhMA01 = C1EQ.A01(AnonymousClass004.A17(new B6A(j), HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)), 0.0f, Float.POSITIVE_INFINITY);
        return ast.A00(new G0U() { // from class: com.facebook.aura.components.musicattribution.AuraTopScrimKt$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AuraTopScrimKt.auraTopScrim_4WTKRHQ$lambda$0$0(c1335AhMA01, (AT3) obj);
            }
        });
    }

    public static final Unit auraTopScrim_4WTKRHQ$lambda$0$0(C1EQ c1eq, AT3 at3) {
        C7384Etj.A0Y(at3, 1);
        at3.A9f(c1eq, null, C16a.A00, 1.0f, 3, 0L, ART.A00(at3.AKb(), 0L));
        return Unit.INSTANCE;
    }
}
