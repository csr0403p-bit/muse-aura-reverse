package com.facebook.aura.pairs;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UV;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC2178B0w;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsComponentsKt {

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsBackButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $logMetadata;
        public final /* synthetic */ HatchScreen $logScreen;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchScreen hatchScreen, Map<String, String> map, BRg bRg, int i, int i2) {
            super(2);
            this.$logScreen = hatchScreen;
            this.$logMetadata = map;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsBackButton(this.$logScreen, this.$logMetadata, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsCard(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C129001 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ PairsConfirmation $confirmation;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129001(PairsConfirmation pairsConfirmation, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$confirmation = pairsConfirmation;
            this.$onConfirm = function0;
            this.$onCancel = function02;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmation)));
            PairsConfirmation pairsConfirmation = this.$confirmation;
            Function0<Unit> function0 = this.$onConfirm;
            Function0<Unit> function02 = this.$onCancel;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new PairsComponentsKt$PairsConfirmationDialog$1$1$1(pairsConfirmation, function0, function02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C129012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsConfirmation $confirmation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129012(PairsConfirmation pairsConfirmation, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$confirmation = pairsConfirmation;
            this.$onConfirm = function0;
            this.$onCancel = function02;
            this.$onDismiss = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsConfirmationDialog(this.$confirmation, this.$onConfirm, this.$onCancel, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C129022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129022(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C129032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129032(String str, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$onRetry = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsMessage(this.$text, this.$modifier, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsPrimaryButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C129041 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129041(String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$text = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$loading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsPrimaryButton(this.$text, this.$onClick, this.$modifier, this.$enabled, this.$loading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C129052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129052(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsSectionHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C129062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $backLogMetadata;
        public final /* synthetic */ HatchScreen $backLogScreen;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $bottomBar;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $floatingNavBar;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showBack;
        public final /* synthetic */ String $title;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C129062(BRg bRg, String str, boolean z, HatchScreen hatchScreen, Map<String, String> map, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$showBack = z;
            this.$backLogScreen = hatchScreen;
            this.$backLogMetadata = map;
            this.$floatingNavBar = z2;
            this.$trailingAction = g0v;
            this.$bottomBar = g0w;
            this.$content = g0w2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsSheet(this.$modifier, this.$title, this.$showBack, this.$backLogScreen, this.$backLogMetadata, this.$floatingNavBar, this.$trailingAction, this.$bottomBar, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsComponentsKt$PairsSheetNavBar$2, reason: invalid class name and case insensitive filesystem */
    public final class C129072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $backLogMetadata;
        public final /* synthetic */ HatchScreen $backLogScreen;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showBack;
        public final /* synthetic */ String $title;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C129072(String str, boolean z, HatchScreen hatchScreen, Map<String, String> map, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$showBack = z;
            this.$backLogScreen = hatchScreen;
            this.$backLogMetadata = map;
            this.$trailingAction = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsComponentsKt.PairsSheetNavBar(this.$title, this.$showBack, this.$backLogScreen, this.$backLogMetadata, this.$trailingAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: PairsAvatarPlaceholder--orJrPs, reason: not valid java name */
    public static final void m1662PairsAvatarPlaceholderorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1625110706);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA04), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            m1665PairsPersonPlaceholder8s8adOk(f, C3cH.A0W(bfm).highlight, bRg2, bfm, (iA04 & 14) | ((iA04 << 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PairsComponentsKt$PairsAvatarPlaceholder$1(f, bRg2, i, i2);
        }
    }

    public static final void PairsCard(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0w, 1);
        bfm.AgG(-1901458804);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(AnonymousClass001.A0R(bRg), 20.0f), AuraTheme.INSTANCE.getColors(bfm, 6).card);
            int i4 = (iA0d << 6) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            AnonymousClass001.A1G(C90l.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, g0w, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* renamed from: PairsPersonPhoto-vlEVYhg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1664PairsPersonPhotovlEVYhg(com.facebook.aura.pairs.PairsImageRef r12, float r13, X.BRg r14, long r15, X.BFM r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(com.facebook.aura.pairs.PairsImageRef, float, X.BRg, long, X.BFM, int, int):void");
    }

    /* renamed from: PairsPersonPlaceholder-8s8adOk, reason: not valid java name */
    public static final void m1665PairsPersonPlaceholder8s8adOk(float f, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1435504325);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f2 = 0.36f * f;
            AuraIconKt.m2568AuraIconFyETyZw(C3U4.A09(C1b8.A03(C10G.A07(bRg2, f), C1D8.A00, j), (f - f2) / 2.0f), BOf.A00(bfm, R.drawable.user_outline_24_wght400, 0), f2, null, C3cH.A0W(bfm).tertiaryText, null, bfm, AVy.$stable << 3, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PairsComponentsKt$PairsPersonPlaceholder$1(f, j, bRg2, i, i2);
        }
    }

    /* renamed from: PairsAvatar-uFdPcIQ, reason: not valid java name */
    public static final void m1661PairsAvataruFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object pairsComponentsKt$PairsAvatar$3;
        BRg bRg2 = bRg;
        bfm.AgG(1718266736);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(1464199479);
                m1662PairsAvatarPlaceholderorJrPs(f, bRg2, bfm, (iA0d >> 3) & 126, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    pairsComponentsKt$PairsAvatar$3 = new PairsComponentsKt$PairsAvatar$1(str, f, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, pairsComponentsKt$PairsAvatar$3);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1464256178);
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A02(bRg2, f), B18.A00, null, null, false, new C1DG(f), 0L, false, false, false, B1V.A00(bfm, new PairsComponentsKt$PairsAvatar$2(f), -1916400603), null, null, null, bfm, AnonymousClass001.A05(iA0d << 15, (iA0d & 14) | 384), 48, 30648);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            pairsComponentsKt$PairsAvatar$3 = new PairsComponentsKt$PairsAvatar$3(str, f, bRg2, i, i2);
            C3cG.A1D(bBbAAc, pairsComponentsKt$PairsAvatar$3);
        }
    }

    public static final void PairsBackButton(HatchScreen hatchScreen, Map<String, String> map, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-698311291);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(hatchScreen)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0D |= 384;
        } else if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_left, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206bb);
            long j = C3cH.A0W(bfm).primaryText;
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass003.A1B(iA0D), (iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0D & 64) != 0 && bfm.A67(map)));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new PairsComponentsKt$PairsBackButton$1$1(hatchScreen, auraNavigatorA0b, map);
                bfm.Ai0(objAaT);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA01, (Function0) objAaT, bRg2, false, 0.0f, null, C60P.A04(j), null, false, false, bfm, AVy.$stable | ((iA0D << 3) & 7168), 0, 1904);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchScreen, map, bRg2, i, i2);
        }
    }

    public static final void PairsConfirmationDialog(PairsConfirmation pairsConfirmation, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pairsConfirmation, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(-1211006369);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, pairsConfirmation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, pairsConfirmation.title, pairsConfirmation.message, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C129001(pairsConfirmation, function0, function02), 440863472), function03, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA0d << 9, ((iA0d >> 12) & 14) | 196608), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129012(pairsConfirmation, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void PairsMessage(String str, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        Function0<Unit> function02;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1674144354);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            function02 = i4 == 0 ? function0 : null;
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0T(bRg2), 28.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0a);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C3TH c3th = C2VU.A00;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PairsComponentsKt$PairsMessage$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bs0, (G0U) objAaT, false), jA07, c1822ArmA0C, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            if (function02 != null) {
                bfm.AgE(-811489232);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d9d), null, null, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, (iA0d << 6) & 57344, 0, 134201325);
            } else {
                bfm.AgE(-811312408);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
            function02 = function0;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129032(str, bRg2, function02, i, i2);
        }
    }

    public static final void PairsPrimaryButton(String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        boolean z3 = z;
        BRg bRg2 = bRg;
        boolean zA1K = z2;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(-301571695);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 44.0f), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, zA1a ? 1 : 0), null, null, false, false, z3, zA1K, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d << 18) & 1879048192), AnonymousClass001.A0B(iA0d << 9, (iA0d >> 12) & 14), 0, 134199781);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129041(str, function0, bRg2, z3, zA1K, i, i2);
        }
    }

    public static final void PairsSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1214378879);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA02 = C10G.A02(C2VU.A0B, C3U4.A07(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 34.0f), 16.0f), false);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PairsComponentsKt$PairsSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA02, objAaT, false), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129052(str, bRg2, i, i2);
        }
    }

    public static final void PairsSheet(BRg bRg, String str, boolean z, HatchScreen hatchScreen, Map<String, String> map, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, BFM bfm, int i, int i2) {
        C1062ATq c1062ATq;
        boolean z3;
        BRg bRg2 = bRg;
        boolean z4 = z;
        HatchScreen hatchScreen2 = hatchScreen;
        Map<String, String> map2 = map;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w3 = g0w;
        String strA0e = str;
        boolean zA1K = z2;
        C7384Etj.A0Y(g0w2, 8);
        bfm.AgG(-751445193);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, strA0e);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(hatchScreen2));
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, map2, 32768, i) ? 1 : 0);
        }
        int i8 = i2 & 32;
        int iA0s = 196608;
        if (i8 != 0) {
            iA0d |= iA0s;
        } else if ((i & 196608) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1K);
            iA0d |= iA0s;
        }
        int i9 = i2 & 64;
        int iA0Z = 1572864;
        if (i9 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0d |= iA0Z;
        }
        int i10 = i2 & 128;
        int iA0a = 12582912;
        if (i10 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            i10 = 0;
            iA0a = AnonymousClass004.A0a(bfm, g0w3);
            iA0d |= iA0a;
        }
        if ((i & 100663296) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, g0w2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            strA0e = C3cG.A0e(strA0e, i4);
            if (i5 != 0) {
                z4 = true;
            }
            if (i6 != 0) {
                hatchScreen2 = null;
            }
            if (i7 != 0) {
                map2 = null;
            }
            zA1K = C3cG.A1K(i8, zA1K);
            if (i9 != 0) {
                g0v2 = null;
            }
            if (i10 != 0) {
                g0w3 = null;
            }
            C1062ATq c1062ATq2 = C10G.A01;
            BRg bRgA00 = AbstractC1754Apr.A00(C1b8.A01(bRg2.then(c1062ATq2), C3cH.A0W(bfm).highlight));
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            if (zA1K) {
                bfm.AgE(-1430476659);
                c1062ATq = C10G.A02;
                z3 = true;
                BRg bRgAiP = c90l.AiP(c1062ATq, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA042, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                BRg bRgA04 = C3U4.A04(c1062ATq2, 16.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA043, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AnonymousClass001.A1G(c90l, bfm, g0w2, (((((iA0d >> 15) & 7168) | 6) >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                BBI.A0R(bbi, true);
                PairsSheetNavBar(strA0e, z4, hatchScreen2, map2, g0v2, null, bfm, AnonymousClass001.A0B(iA0d >> 6, (iA0d >> 3) & 8190), 32);
            } else {
                bfm.AgE(-1430242702);
                PairsSheetNavBar(strA0e, z4, hatchScreen2, map2, g0v2, null, bfm, AnonymousClass001.A0B(iA0d >> 6, (iA0d >> 3) & 8190), 32);
                c1062ATq = C10G.A02;
                z3 = true;
                BRg bRgAiP2 = c90l.AiP(c1062ATq, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgAiP2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                BPg.A02(bfm, akqA044, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0vA0u);
                AnonymousClass001.A1G(c90l, bfm, g0w2, ((((iA0d >> 15) & 7168) >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            }
            BBI.A0R(bbi, z3);
            BBI.A0R(bbi, false);
            if (g0w3 != null) {
                bfm.AgE(-1430050223);
                BRg bRgA0C = C3U4.A0C(AbstractC1754Apr.A01(c1062ATq), 24.0f, 12.0f, 24.0f, 0.0f);
                int i11 = ((iA0d >> 12) & 7168) | 384;
                InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA004, g0vA0v);
                BPg.A02(bfm, akqA045, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                BPg.A02(bfm, bRgA015, g0vA0u);
                AnonymousClass001.A1G(c90l, bfm, g0w3, ((i11 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                BBI.A0R(bbi, z3);
            } else {
                bfm.AgE(-1429800363);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129062(bRg2, strA0e, z4, hatchScreen2, map2, zA1K, g0v2, g0w3, g0w2, i, i2);
        }
    }

    public static final void PairsSheetNavBar(String str, boolean z, HatchScreen hatchScreen, Map<String, String> map, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1321721901);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(hatchScreen));
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(map, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            if (z) {
                bfm.AgE(-510251340);
                PairsBackButton(hatchScreen, map, null, bfm, (iA0d >> 6) & 126, 4);
            } else {
                C01N.A07(bfm, C10G.A07(C3cG.A09(bfm, -510185465), 48.0f));
            }
            BBI.A0R(bbi, false);
            String str2 = str == null ? "" : str;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PairsComponentsKt$PairsSheetNavBar$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822ArmA0D, null, null, C3cH.A0F(3), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14768);
            if (g0v != null) {
                bfm.AgE(-1401918527);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 12);
            } else {
                bfm.AgE(-1401917811);
                C01N.A07(bfm, C10G.A07(bs0, 48.0f));
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129072(str, z, hatchScreen, map, g0v, bRg2, i, i2);
        }
    }

    public static final C1D3 getPairsCardShape() {
        return C1D8.A00(20.0f);
    }

    public static final void PairsLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1130701634);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA02 = C10G.A02(C2VU.A09, AnonymousClass001.A0T(bRg), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new PairsComponentsKt$PairsLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129022(bRg, i, i2);
        }
    }

    /* renamed from: PairsMuseAvatar-uFdPcIQ, reason: not valid java name */
    public static final void m1663PairsMuseAvataruFdPcIQ(PairsImageRef pairsImageRef, float f, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object pairsComponentsKt$PairsMuseAvatar$1;
        bfm.AgG(1888366014);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsImageRef, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC2178B0w interfaceC2178B0wM1668rememberPairsImageziNgDLE = m1668rememberPairsImageziNgDLE(pairsImageRef, f, bfm, PairsImageRef.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            if (interfaceC2178B0wM1668rememberPairsImageziNgDLE == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    pairsComponentsKt$PairsMuseAvatar$1 = new PairsComponentsKt$PairsMuseAvatar$bitmap$1(pairsImageRef, f, bRg, i, i2);
                    C3cG.A1D(bBbAAc, pairsComponentsKt$PairsMuseAvatar$1);
                }
                return;
            }
            C1SA.A01(bfm, null, C11U.A01(C10G.A07(bRg, f), f / 4.0f), interfaceC2178B0wM1668rememberPairsImageziNgDLE, B18.A00, null, 24624, 232);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            pairsComponentsKt$PairsMuseAvatar$1 = new PairsComponentsKt$PairsMuseAvatar$1(pairsImageRef, f, bRg, i, i2);
            C3cG.A1D(bBbAAc, pairsComponentsKt$PairsMuseAvatar$1);
        }
    }

    /* renamed from: rememberPairsImage-ziNgDLE, reason: not valid java name */
    public static final InterfaceC2178B0w m1668rememberPairsImageziNgDLE(PairsImageRef pairsImageRef, float f, BFM bfm, int i) {
        String str;
        PairsImageKind pairsImageKind;
        Boolean boolValueOf;
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        int iAbr = AnonymousClass002.A0Y(bfm).Abr(f);
        if (pairsImageRef != null) {
            str = pairsImageRef.sha256;
            pairsImageKind = pairsImageRef.kind;
            boolValueOf = Boolean.valueOf(pairsImageRef.isReadable);
        } else {
            str = null;
            pairsImageKind = null;
            boolValueOf = null;
        }
        Object[] objArr = {abstractC3358CGzA0h, str, pairsImageKind, boolValueOf, Integer.valueOf(iAbr)};
        boolean zA1a = AnonymousClass001.A1a(AnonymousClass001.A1S(bfm, abstractC3358CGzA0h, (((i & 14) ^ 6) > 4 && bfm.A67(pairsImageRef)) || (i & 6) == 4), bfm, iAbr);
        Object objAaT = bfm.AaT();
        if (zA1a || objAaT == C78N.A00) {
            objAaT = new PairsComponentsKt$rememberPairsImage$bitmap$2$1(pairsImageRef, abstractC3358CGzA0h, iAbr, null);
            bfm.Ai0(objAaT);
        }
        return (InterfaceC2178B0w) C3UV.A03(bfm, null, (G0V) objAaT, objArr).getValue();
    }
}
