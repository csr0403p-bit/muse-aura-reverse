package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchUnsendNuxSheetKt {
    public static final float NuxBodyTopPadding = 12.0f;
    public static final float NuxBottomPadding = 8.0f;
    public static final float NuxButtonTopPadding = 24.0f;
    public static final float NuxTitleTopPadding = 12.0f;
    public static final String UNSEND_NUX_LEARN_MORE_URL = "https://www.meta.com/help/artificial-intelligence/2225571704857152/";

    /* renamed from: com.facebook.aura.conversation.view.HatchUnsendNuxSheetKt$HatchUnsendNuxBody$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUnsendNuxSheetKt.HatchUnsendNuxBody(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchUnsendNuxSheetKt$HatchUnsendNuxSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C115151 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115151(Function0<Unit> function0) {
            super(3);
            this.$onConfirm = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, C06G.A00(bfm), 0.0f), 0.0f, 0.0f, 0.0f, HatchUnsendNuxSheetKt.NuxBottomPadding);
                Function0<Unit> function0 = this.$onConfirm;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C01N.A08(bfm, bs0, HatchUnsendNuxSheetKt.NuxTitleTopPadding);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120893), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, HatchUnsendNuxSheetKt.NuxBodyTopPadding);
                HatchUnsendNuxSheetKt.HatchUnsendNuxBody(null, bfm, 0, 1);
                C01N.A08(bfm, bs0, HatchUnsendNuxSheetKt.NuxButtonTopPadding);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120891), null, C3U4.A0C(c1062ATq, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium), AnonymousClass006.A0h(bfm), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchUnsendNuxSheetKt$HatchUnsendNuxSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUnsendNuxSheetKt.HatchUnsendNuxSheet(this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchUnsendNuxBody(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-768061400);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120892);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f120890);
            int iA09 = AnonymousClass007.A09(strA0t, strA01);
            HatchLinkTextKt.m1188HatchLinkText10k_G_c(strA0t, iA09 >= 0 ? Collections.singletonList(new HatchTextLink(iA09, strA01.length(), UNSEND_NUX_LEARN_MORE_URL)) : C0881AGi.A00, bRg2, C06G.A0T(bfm), C06G.A0C(bfm), null, null, false, bfm, (iA0d << 6) & 896, 224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void HatchUnsendNuxSheet(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(183445185);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, function02, null, null, null, null, null, null, null, zA1b, zA1b, zA1b, B1V.A00(bfm, new C115151(function0), -926421308), bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((iA0T << 3) & 896), 3072, 8184);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, i, i2);
        }
    }
}
