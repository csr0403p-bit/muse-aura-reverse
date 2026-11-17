package com.facebook.aura.status.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BNH;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C1Cd;
import X.C1OP;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverTransition;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $applyStatusBarPadding;
    public final /* synthetic */ boolean $avatarVisible;
    public final /* synthetic */ boolean $canReportAvatarBounds;
    public final /* synthetic */ C1BO<HatchStatusPillUiState> $headerState$delegate;
    public final /* synthetic */ boolean $isCompactAvatar;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ C1BO<Boolean> $isPillHidden$delegate;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ StatusPillAvatarPanel $panel;
    public final /* synthetic */ boolean $suppressAvatar;
    public final /* synthetic */ AvatarTakeover $takeover;
    public final /* synthetic */ C1BO<Float> $takeoverFramingFraction;
    public final /* synthetic */ AvatarTakeoverTransition $takeoverTransition;
    public final /* synthetic */ InterfaceC05151eP $this_HatchStatusPill;
    public final /* synthetic */ boolean $wrapContent;

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $applyStatusBarPadding;
        public final /* synthetic */ float $avatarOverlap;
        public final /* synthetic */ boolean $avatarVisible;
        public final /* synthetic */ boolean $canReportAvatarBounds;
        public final /* synthetic */ BRg $chromeHostModifier;
        public final /* synthetic */ StatusPillChromeMotion $chromeMotion;
        public final /* synthetic */ C1BO<HatchStatusPillUiState> $headerState$delegate;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ StatusPillAvatarPanel $panel;
        public final /* synthetic */ boolean $suppressAvatar;
        public final /* synthetic */ AvatarTakeoverTransition $takeoverTransition;
        public final /* synthetic */ boolean $wrapContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, boolean z, boolean z2, Function0<Unit> function0, StatusPillAvatarPanel statusPillAvatarPanel, StatusPillChromeMotion statusPillChromeMotion, boolean z3, float f, boolean z4, boolean z5, AvatarTakeoverTransition avatarTakeoverTransition, C1BO<HatchStatusPillUiState> c1bo) {
            super(3);
            this.$chromeHostModifier = bRg;
            this.$wrapContent = z;
            this.$applyStatusBarPadding = z2;
            this.$onClick = function0;
            this.$panel = statusPillAvatarPanel;
            this.$chromeMotion = statusPillChromeMotion;
            this.$avatarVisible = z3;
            this.$avatarOverlap = f;
            this.$canReportAvatarBounds = z4;
            this.$suppressAvatar = z5;
            this.$takeoverTransition = avatarTakeoverTransition;
            this.$headerState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            float f;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                bfm.AgE(867942013);
                BRg bRgThen = this.$chromeHostModifier;
                if (!this.$wrapContent) {
                    bRgThen = AnonymousClass001.A0R(bRgThen);
                }
                if (this.$applyStatusBarPadding) {
                    bRgThen = bRgThen.then(BNH.A00(C1OP.A00(bfm), BRg.A00));
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                Alignment alignment = C2VU.A09;
                Function0<Unit> function0 = this.$onClick;
                StatusPillAvatarPanel statusPillAvatarPanel = this.$panel;
                StatusPillChromeMotion statusPillChromeMotion = this.$chromeMotion;
                boolean z = this.$avatarVisible;
                float f2 = this.$avatarOverlap;
                boolean z2 = this.$canReportAvatarBounds;
                boolean z3 = this.$suppressAvatar;
                AvatarTakeoverTransition avatarTakeoverTransition = this.$takeoverTransition;
                boolean z4 = this.$applyStatusBarPadding;
                C1BO<HatchStatusPillUiState> c1bo = this.$headerState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgThen);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                HatchStatusPillUiState value = c1bo.getValue();
                boolean zA1M = AnonymousClass003.A1M(bfm, statusPillAvatarPanel, statusPillChromeMotion);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new HatchStatusPillKt$HatchStatusPill$3$2$3$1$1(statusPillAvatarPanel, statusPillChromeMotion);
                    bfm.Ai0(objAaT);
                }
                Function0 function03 = (Function0) objAaT;
                if (z) {
                    f = statusPillChromeMotion.topPadding;
                } else {
                    f = 0.0f;
                }
                boolean zA66 = bfm.A66(z3);
                Object objAaT2 = bfm.AaT();
                if (zA66 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchStatusPillKt$HatchStatusPill$3$2$3$2$1(z3);
                    bfm.Ai0(objAaT2);
                }
                Function0 function04 = (Function0) objAaT2;
                BS0 bs0 = BRg.A00;
                float fA00 = C1BO.A00(avatarTakeoverTransition.topPadding);
                int i2 = 0;
                if (z4) {
                    i2 = 14;
                }
                HatchStatusPillKt.m2234StatusPillContentikN4xI4(value, function0, function03, f, f2, z, z2, function04, C3U4.A04(bs0, fA00 + i2), bfm, 0, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$3(boolean z, InterfaceC05151eP interfaceC05151eP, BRg bRg, AvatarTakeover avatarTakeover, C1BO<Float> c1bo, StatusPillAvatarPanel statusPillAvatarPanel, boolean z2, boolean z3, C1BO<Boolean> c1bo2, boolean z4, Function0<Unit> function0, boolean z5, boolean z6, boolean z7, AvatarTakeoverTransition avatarTakeoverTransition, C1BO<HatchStatusPillUiState> c1bo3) {
        super(2);
        this.$isCompactAvatar = z;
        this.$this_HatchStatusPill = interfaceC05151eP;
        this.$modifier = bRg;
        this.$takeover = avatarTakeover;
        this.$takeoverFramingFraction = c1bo;
        this.$panel = statusPillAvatarPanel;
        this.$isExpanded = z2;
        this.$wrapContent = z3;
        this.$isPillHidden$delegate = c1bo2;
        this.$applyStatusBarPadding = z4;
        this.$onClick = function0;
        this.$avatarVisible = z5;
        this.$canReportAvatarBounds = z6;
        this.$suppressAvatar = z7;
        this.$takeoverTransition = avatarTakeoverTransition;
        this.$headerState$delegate = c1bo3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r26, int r27) {
        /*
            r25 = this;
            r2 = r27
            boolean r0 = X.AnonymousClass004.A1E(r2)
            r1 = r26
            boolean r0 = X.AnonymousClass001.A1b(r0, r1, r2)
            if (r0 == 0) goto Lb8
            r2 = r25
            boolean r0 = r2.$isCompactAvatar
            if (r0 == 0) goto Lb4
            X.1eP r4 = r2.$this_HatchStatusPill
            X.BS0 r3 = X.BRg.A00
            androidx.compose.ui.Alignment r0 = X.C2VU.A0C
            X.BRg r7 = r4.A4C(r0, r3)
        L1e:
            float r4 = com.facebook.aura.avatarsize.HatchAvatarSizeKt.PillAvatarOverlap
            com.facebook.aura.header.api.AvatarTakeover r0 = r2.$takeover
            if (r0 == 0) goto Lb1
            float r3 = r0.mo974getAvatarOverlapD9Ej5fM()
        L28:
            X.1BO<java.lang.Float> r0 = r2.$takeoverFramingFraction
            float r0 = X.C1BO.A01(r0)
            float r14 = X.AnonymousClass003.A01(r0, r4, r3)
            com.facebook.aura.status.view.StatusPillAvatarPanel r4 = r2.$panel
            r3 = 1082130432(0x40800000, float:4.0)
            X.1BO<java.lang.Float> r0 = r2.$takeoverFramingFraction
            float r0 = X.C1BO.A01(r0)
            float r3 = r3 * r0
            float r0 = r14 + r3
            com.facebook.aura.status.view.StatusPillChromeMotion r12 = com.facebook.aura.status.view.HatchStatusPillAvatarPanelKt.m2230chromeMotion3ABfNKs(r4, r0)
            boolean r0 = r2.$isCompactAvatar
            if (r0 != 0) goto L55
            X.1BO<java.lang.Boolean> r0 = r2.$isPillHidden$delegate
            boolean r0 = X.C1BO.A0F(r0)
            if (r0 != 0) goto L55
            boolean r0 = r2.$isExpanded
            r27 = 1
            if (r0 == 0) goto L57
        L55:
            r27 = 0
        L57:
            X.BS0 r5 = X.BRg.A00
            float r0 = r12.zIndex
            X.BRg r0 = X.C5Mp.A00(r5, r0)
            boolean r8 = r2.$wrapContent
            X.1eP r4 = r2.$this_HatchStatusPill
            if (r8 == 0) goto L6f
            androidx.compose.ui.Alignment r3 = X.C2VU.A0C
            X.BRg r3 = r4.A4C(r3, r5)
            X.BRg r0 = r0.then(r3)
        L6f:
            X.28s r6 = X.C2HU.A02
            r23 = 0
            r5 = 150(0x96, float:2.1E-43)
            r4 = 0
            X.AQI r19 = X.AnonymousClass003.A0P(r6, r5, r4)
            X.ASj r3 = new X.ASj
            r3.<init>(r6, r5, r4)
            X.AQJ r20 = X.AbstractC1011APs.A0E(r3)
            boolean r9 = r2.$applyStatusBarPadding
            kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r2.$onClick
            com.facebook.aura.status.view.StatusPillAvatarPanel r11 = r2.$panel
            boolean r13 = r2.$avatarVisible
            boolean r15 = r2.$canReportAvatarBounds
            boolean r4 = r2.$suppressAvatar
            com.facebook.aura.header.api.AvatarTakeoverTransition r3 = r2.$takeoverTransition
            X.1BO<com.facebook.aura.status.viewmodel.HatchStatusPillUiState> r2 = r2.$headerState$delegate
            com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$3$2 r6 = new com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$3$2
            r16 = r4
            r17 = r3
            r18 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = -1670603363(0xffffffff9c6c9d9d, float:-7.828956E-22)
            X.B1U r24 = X.B1V.A00(r1, r6, r2)
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 16
            r21 = r1
            r22 = r0
            X.AbstractC04661Bq.A08(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        Lb1:
            r3 = r4
            goto L28
        Lb4:
            X.BRg r7 = r2.$modifier
            goto L1e
        Lb8:
            r1.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$3.invoke(X.BFM, int):void");
    }
}
