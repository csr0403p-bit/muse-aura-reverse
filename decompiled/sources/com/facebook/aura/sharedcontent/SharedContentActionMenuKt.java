package com.facebook.aura.sharedcontent;

import X.AHD;
import X.AII;
import X.AIM;
import X.AVy;
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
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SharedContentActionMenuKt {
    public static final int MENU_REPORT = 1;
    public static final int MENU_SAVE = 0;
    public static final int MENU_SHARE = 2;

    /* renamed from: com.facebook.aura.sharedcontent.SharedContentActionMenuKt$SharedContentActionMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHD<AuraContextMenuItem> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$items = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(1698327390);
            AHD<AuraContextMenuItem> ahd = this.$items;
            AnonymousClass002.A19(bfm);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.SharedContentActionMenuKt$SharedContentActionMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ boolean $isSaved;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onReport;
        public final /* synthetic */ Function0<Unit> $onSave;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ boolean $saveInFlight;
        public final /* synthetic */ boolean $showReport;
        public final /* synthetic */ boolean $showSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
            super(2);
            this.$expanded = z;
            this.$isSaved = z2;
            this.$saveInFlight = z3;
            this.$showSave = z4;
            this.$showReport = z5;
            this.$onDismiss = function0;
            this.$onShare = function02;
            this.$onSave = function03;
            this.$onReport = function04;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SharedContentActionMenuKt.SharedContentActionMenu(this.$expanded, this.$isSaved, this.$saveInFlight, this.$showSave, this.$showReport, this.$onDismiss, this.$onShare, this.$onSave, this.$onReport, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void SharedContentActionMenu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BFM bfm, int i) {
        String strA0v;
        AnonymousClass005.A0z(function0, function02, function03);
        C7384Etj.A0Y(function04, 8);
        bfm.AgG(1239999766);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z3);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0q(bfm, z4);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0r(bfm, z5);
        }
        if ((i & 196608) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((i & 1572864) == 0) {
            iA0n |= AnonymousClass004.A0Z(bfm, function02);
        }
        if ((i & 12582912) == 0) {
            iA0n |= AnonymousClass004.A0a(bfm, function03);
        }
        if ((i & 100663296) == 0) {
            iA0n |= AnonymousClass004.A0b(bfm, function04);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 38347923, 38347922), bfm, iA0n)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f3);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0);
            if (z2) {
                bfm.AgE(1933848723);
                strA0v = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f2);
            } else {
                bfm.AgE(1933851448);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1205f1);
            }
            boolean zA1W = AnonymousClass001.A1W(bfm);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.arrowdownload_outline_24_wght400, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f0);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.ic_flag_outline, 0);
            boolean zA1T = AnonymousClass005.A1T(bfm, aVyA002, strA012, aVyA003, AnonymousClass005.A1T(bfm, strA01, aVyA00, strA0v, AnonymousClass004.A1I(iA0n) | AnonymousClass004.A1K(iA0n) | AnonymousClass004.A1M(iA0n) | AnonymousClass005.A1L(iA0n)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                AII aiiA17 = AIM.A17();
                boolean z6 = false;
                BS0 bs0 = BRg.A00;
                aiiA17.add(new AuraContextMenuItem(2, strA01, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1));
                if (z4) {
                    if (!z2 && !z3) {
                        z6 = true;
                    }
                    aiiA17.add(new AuraContextMenuItem(0, strA0v, null, aVyA002, null, null, false, false, false, z6, false, bs0, 1, 1));
                }
                if (z5) {
                    aiiA17.add(new AuraContextMenuItem(1, strA012, null, aVyA003, null, null, false, false, false, true, true, bs0, 1, 1));
                }
                objAaT = AnonymousClass001.A0z(bfm, AIM.A18(aiiA17));
            }
            AHD ahd = (AHD) objAaT;
            boolean zA1B = AnonymousClass005.A1B(iA0n) | ((458752 & iA0n) == 131072) | AnonymousClass005.A1J(iA0n) | AnonymousClass007.A1G(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1B || objAaT2 == C78N.A00) {
                objAaT2 = new SharedContentActionMenuKt$SharedContentActionMenu$1$1(function0, function02, function03, function04);
                bfm.Ai0(objAaT2);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, (G0U) objAaT2, function0, z, null, AnonymousClass003.A0N(AnonymousClass002.A0F()), null, zA1W, new AnonymousClass2(ahd), zA1W, null, null, null, zA1W, bfm, ((iA0n >> 9) & 896) | 196608 | ((iA0n << 9) & 7168), zA1W ? 1 : 0, 16081);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, z2, z3, z4, z5, function0, function02, function03, function04, i);
        }
    }
}
