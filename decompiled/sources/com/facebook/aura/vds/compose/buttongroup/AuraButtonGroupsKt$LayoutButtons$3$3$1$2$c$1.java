package com.facebook.aura.vds.compose.buttongroup;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B6A;
import X.B9H;
import X.B9J;
import X.BFM;
import X.C0jw;
import X.C0zI;
import X.C7384Etj;
import X.C78N;
import X.F0C;
import X.G0W;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.IconContext;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraButtonGroupsKt$LayoutButtons$3$3$1$2$c$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public final /* synthetic */ Drawable $resId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonGroupsKt$LayoutButtons$3$3$1$2$c$1(Drawable drawable) {
        super(3);
        this.$resId = drawable;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        Object b9h;
        C7384Etj.A0Y(iconContext, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, iconContext);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AuraButtonDefaults auraButtonDefaults = AuraButtonDefaults.INSTANCE;
            Drawable drawable = this.$resId;
            F0C f0c = B9J.A00;
            bfm.AgE(1756822313);
            boolean zA1Y = AnonymousClass001.A1Y(drawable, bfm, 289266787);
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                if (drawable == null) {
                    objAaT = C0jw.A00;
                } else {
                    if (drawable instanceof ColorDrawable) {
                        long j = B6A.A01;
                        b9h = new C0zI(((ColorDrawable) drawable).getColor() << 32);
                    } else {
                        Drawable drawableMutate = drawable.mutate();
                        C7384Etj.A0U(drawableMutate);
                        b9h = new B9H(drawableMutate);
                    }
                    objAaT = (AVy) b9h;
                }
                bfm.Ai0(objAaT);
            }
            AnonymousClass006.A1N(bfm);
            AnonymousClass007.A0w(bfm, (AVy) objAaT, auraButtonDefaults, iconContext, i);
            return;
        }
        bfm.Afo();
    }
}
