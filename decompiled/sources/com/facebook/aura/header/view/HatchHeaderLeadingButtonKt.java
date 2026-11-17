package com.facebook.aura.header.view;

import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C78N;
import X.G0V;
import androidx.activity.ComponentActivity;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.header.view.SidePanelButtonViewModel;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchHeaderLeadingButtonKt {

    /* renamed from: com.facebook.aura.header.view.HatchHeaderLeadingButtonKt$HatchHeaderLeadingButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HeaderLeadingButton $button;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HeaderLeadingButton headerLeadingButton, Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$button = headerLeadingButton;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchHeaderLeadingButtonKt.HatchHeaderLeadingButton(this.$button, this.$onClick, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchHeaderLeadingButton(HeaderLeadingButton headerLeadingButton, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean zA0F;
        boolean z2 = z;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(headerLeadingButton, function0);
        bfm.AgG(-2019118866);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, headerLeadingButton) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (headerLeadingButton == HeaderLeadingButton.SidePanel) {
                bfm.AgE(-552922536);
                AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                boolean zA65 = bfm.A65(abstractC3358CGzA0h);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SidePanelButtonViewModel.Factory(abstractC3358CGzA0h);
                    bfm.Ai0(objAaT);
                }
                ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
                zA0F = C1BO.A0F(C2CK.A02(bfm, ((SidePanelButtonViewModel) AnonymousClass004.A14((AuraViewModelFactory) objAaT, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), SidePanelButtonViewModel.class)).hasUnreadThreads));
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -552581443);
                zA0F = false;
            }
            int i5 = iA08 << 3;
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, headerLeadingButton.getIcon$fbandroid_express_aura_java_com_facebook_aura_header_view_view(), zA1b ? 1 : 0), AbstractC2271BQs.A01(bfm, headerLeadingButton.getDescription$fbandroid_express_aura_java_com_facebook_aura_header_view_view()), function0, bRg2, z2, HeaderButtonKt.PillIconTouchTarget, null, null, null, zA0F, zA1b, bfm, AnonymousClass003.A07(i5, AVy.$stable | (i5 & 896)), zA1b ? 1 : 0, 1472);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(headerLeadingButton, function0, bRg2, z2, i, i2);
        }
    }
}
