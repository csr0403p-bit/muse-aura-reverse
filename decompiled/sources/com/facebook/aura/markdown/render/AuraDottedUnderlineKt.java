package com.facebook.aura.markdown.render;

import X.AEk;
import X.AHD;
import X.AT3;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BRg;
import X.C1731ApS;
import X.C1733ApU;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AuraDottedUnderlineKt {
    public static final void addDottedUnderlineAnnotation(C1731ApS c1731ApS, int i, int i2) {
        C7384Etj.A0Y(c1731ApS, 0);
        c1731ApS.A0G(AuraDottedUnderline.ANNOTATION_TAG, "", i, i2);
    }

    public static final Unit drawDottedUnderlines_9LQNqLg$lambda$0(AuraDottedUnderline auraDottedUnderline, long j, AHD ahd, AT3 at3) {
        C7384Etj.A0Y(at3, 3);
        auraDottedUnderline.m1359xaa5a628c(at3, j, ahd);
        return Unit.INSTANCE;
    }

    public static final Unit drawDottedUnderlines_mxwnekA$lambda$0(AuraDottedUnderline auraDottedUnderline, long j, AT3 at3) {
        C7384Etj.A0Y(at3, 2);
        auraDottedUnderline.m1358xd7e5825f(at3, j);
        return Unit.INSTANCE;
    }

    /* renamed from: drawDottedUnderlines-9LQNqLg, reason: not valid java name */
    public static final BRg m1360drawDottedUnderlines9LQNqLg(BRg bRg, final AuraDottedUnderline auraDottedUnderline, final long j, final AHD<C1733ApU<String>> ahd) {
        AnonymousClass005.A0y(bRg, auraDottedUnderline, ahd);
        return AEk.A01(bRg, new G0U() { // from class: com.facebook.aura.markdown.render.AuraDottedUnderlineKt$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AuraDottedUnderlineKt.drawDottedUnderlines_9LQNqLg$lambda$0(auraDottedUnderline, j, ahd, (AT3) obj);
            }
        });
    }

    /* renamed from: drawDottedUnderlines-mxwnekA, reason: not valid java name */
    public static final BRg m1361drawDottedUnderlinesmxwnekA(BRg bRg, final AuraDottedUnderline auraDottedUnderline, final long j) {
        AnonymousClass003.A0u(bRg, auraDottedUnderline);
        return AEk.A01(bRg, new G0U() { // from class: com.facebook.aura.markdown.render.AuraDottedUnderlineKt$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AuraDottedUnderlineKt.drawDottedUnderlines_mxwnekA$lambda$0(auraDottedUnderline, j, (AT3) obj);
            }
        });
    }
}
