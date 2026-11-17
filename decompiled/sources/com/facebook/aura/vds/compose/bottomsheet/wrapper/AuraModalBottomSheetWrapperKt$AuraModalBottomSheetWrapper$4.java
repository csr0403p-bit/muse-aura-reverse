package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C13s;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4(G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
        super(3);
        this.$content = g0w;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        Window windowAMm;
        C13s c13s;
        C7384Etj.A0Y(c07c, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, c07c);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
            if ((parent instanceof C13s) && (c13s = (C13s) parent) != null) {
                windowAMm = c13s.AMm();
            } else {
                windowAMm = null;
            }
            boolean zA67 = bfm.A67(windowAMm);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4$1$1(windowAMm);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, windowAMm);
            AnonymousClass001.A1G(c07c, bfm, this.$content, i & 14);
            AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
            return;
        }
        bfm.Afo();
    }
}
