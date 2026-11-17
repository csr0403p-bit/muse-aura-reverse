package com.facebook.aura.activation.view;

import X.AKL;
import X.AKQ;
import X.ASj;
import X.AVy;
import X.AXN;
import X.AbstractC1462AjV;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BLU;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C02i;
import X.C06I;
import X.C07C;
import X.C0Ig;
import X.C0v5;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1Dt;
import X.C1SA;
import X.C1YD;
import X.C1b8;
import X.C2HU;
import X.C2VU;
import X.C3IL;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7380Etd;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7OU;
import X.C7bA;
import X.C90l;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;
import com.facebook.aura.utils.HatchPermissionDeniedDialogKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraWaitlistScreenKt {
    public static final int CtaCrossfadeDurationMs = 300;
    public static final float OffsetY = 36.0f;
    public static final C1003AOr<Float> animationSpec = new C1003AOr<>(null, 15.0f / (2.0f * ((float) Math.sqrt(100.0d))), 100.0f);

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$AuraWaitlistScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraWaitlistCelebrationState $celebrationState;
        public final /* synthetic */ MutableState<BLU> $ctaBoundsInRoot$delegate;
        public final /* synthetic */ boolean $isJoined;
        public final /* synthetic */ boolean $isJoiningWaitlist;
        public final /* synthetic */ WaitlistScreenMode $mode;
        public final /* synthetic */ Function0<Unit> $onHaveInviteCodeClick;
        public final /* synthetic */ Function0<Unit> $onJoinWaitlistClick;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            BBI bbiA07;
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchActivationWaitlistInviteCopy.Screen screen = this.$screenCopy;
            AuraWaitlistScreenKt.WaitlistHeader(screen.title, screen.subtitle, null, bfm, 0, 4);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            C1062ATq c1062ATq = C10G.A02;
            MutableState<BLU> mutableState = this.$ctaBoundsInRoot$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AuraWaitlistScreenKt$AuraWaitlistScreen$3$ctaModifier$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AbstractC1462AjV.A00(c1062ATq, (G0U) objAaT, 0L, 64L);
            boolean zA65 = bfm.A65(this.$celebrationState);
            AuraWaitlistCelebrationState auraWaitlistCelebrationState = this.$celebrationState;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new AuraWaitlistScreenKt$AuraWaitlistScreen$3$ctaModifier$2$1(auraWaitlistCelebrationState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA00, objAaT2);
            int iOrdinal = this.$mode.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                bfm.AgE(304039417);
                AuraWaitlistScreenKt.JoinWaitlistCta(this.$isJoined, this.$isJoiningWaitlist, this.$onJoinWaitlistClick, bRgA0W, bfm, 0, 0);
                bbiA07 = C3cG.A07(bfm);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, 304036714);
                }
                bfm.AgE(304047031);
                AuraWaitlistScreenKt.NotificationOptInCta(bRgA0W, bfm, 0, 0);
                bbiA07 = C3cG.A07(bfm);
            }
            if (this.$onHaveInviteCodeClick != null) {
                bfm.AgE(835615038);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingMedium);
                AuraWaitlistScreenKt.HaveInviteCodeLink(this.$onHaveInviteCodeClick, null, bfm, 0, 2);
            } else {
                bfm.AgE(835731319);
            }
            BBI.A0R(bbiA07, false);
        }

        /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$AuraWaitlistScreen$3$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WaitlistScreenMode.values().length];
                try {
                    AnonymousClass002.A13(WaitlistScreenMode.JOIN, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(WaitlistScreenMode.JOINED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(WaitlistScreenMode.LIMITED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchActivationWaitlistInviteCopy.Screen screen, AuraWaitlistCelebrationState auraWaitlistCelebrationState, WaitlistScreenMode waitlistScreenMode, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, MutableState<BLU> mutableState) {
            super(3);
            this.$screenCopy = screen;
            this.$celebrationState = auraWaitlistCelebrationState;
            this.$mode = waitlistScreenMode;
            this.$isJoined = z;
            this.$isJoiningWaitlist = z2;
            this.$onJoinWaitlistClick = function0;
            this.$onHaveInviteCodeClick = function02;
            this.$ctaBoundsInRoot$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$AuraWaitlistScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $celebrationId;
        public final /* synthetic */ boolean $isJoiningWaitlist;
        public final /* synthetic */ WaitlistScreenMode $mode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onHaveInviteCodeClick;
        public final /* synthetic */ Function0<Unit> $onJoinWaitlistClick;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(WaitlistScreenMode waitlistScreenMode, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, int i, HatchActivationWaitlistInviteCopy.Screen screen, BRg bRg, int i2, int i3) {
            super(2);
            this.$mode = waitlistScreenMode;
            this.$onJoinWaitlistClick = function0;
            this.$onHaveInviteCodeClick = function02;
            this.$onRefresh = function03;
            this.$isJoiningWaitlist = z;
            this.$celebrationId = i;
            this.$screenCopy = screen;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWaitlistScreenKt.AuraWaitlistScreen(this.$mode, this.$onJoinWaitlistClick, this.$onHaveInviteCodeClick, this.$onRefresh, this.$isJoiningWaitlist, this.$celebrationId, this.$screenCopy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$HaveInviteCodeLink$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            AuraWaitlistScreenKt.HaveInviteCodeLink(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$JoinWaitlistCta$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isAlreadyJoined;
        public final /* synthetic */ boolean $isJoiningWaitlist;
        public final /* synthetic */ String $joinWaitlistLabel;
        public final /* synthetic */ String $joinedLabel;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, boolean z, boolean z2, Function0<Unit> function0) {
            super(3);
            this.$joinedLabel = str;
            this.$joinWaitlistLabel = str2;
            this.$isAlreadyJoined = z;
            this.$isJoiningWaitlist = z2;
            this.$onClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(boolean r34, X.BFM r35, int r36) {
            /*
                r33 = this;
                r1 = r36
                r0 = r36 & 6
                r2 = r34
                r3 = r35
                if (r0 != 0) goto L10
                int r0 = X.AnonymousClass004.A0n(r3, r2)
                r1 = r36 | r0
            L10:
                boolean r0 = X.AnonymousClass004.A1H(r1)
                boolean r0 = X.AnonymousClass001.A1b(r0, r3, r1)
                if (r0 == 0) goto L85
                r4 = r33
                if (r34 == 0) goto L82
                java.lang.String r6 = r4.$joinedLabel
            L20:
                com.facebook.aura.vds.compose.button.AuraButtonSize r10 = com.facebook.aura.vds.compose.button.AuraButtonSize.MEDIUM
                boolean r1 = r4.$isAlreadyJoined
                r14 = r1 ^ 1
                boolean r0 = r4.$isJoiningWaitlist
                if (r0 == 0) goto L2d
                r15 = 1
                if (r1 == 0) goto L2e
            L2d:
                r15 = 0
            L2e:
                r5 = 0
                X.ATq r8 = X.C10G.A02
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4.$onClick
                boolean r1 = r3.A65(r0)
                kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r4.$onClick
                java.lang.Object r0 = r3.AaT()
                if (r1 != 0) goto L43
                java.lang.Object r1 = X.C78N.A00
                if (r0 != r1) goto L4b
            L43:
                com.facebook.aura.activation.view.AuraWaitlistScreenKt$JoinWaitlistCta$1$1$1 r0 = new com.facebook.aura.activation.view.AuraWaitlistScreenKt$JoinWaitlistCta$1$1$1
                r0.<init>(r2)
                r3.Ai0(r0)
            L4b:
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                r12 = 0
                r36 = 134199765(0x7ffb9d5, float:3.8477358E-34)
                r33 = 199680(0x30c00, float:2.79811E-40)
                r7 = r5
                r9 = r5
                r11 = r5
                r13 = r12
                r16 = r12
                r17 = r5
                r18 = r5
                r19 = r0
                r20 = r5
                r21 = r5
                r22 = r5
                r23 = r5
                r24 = r5
                r25 = r5
                r26 = r5
                r27 = r5
                r28 = r12
                r29 = r12
                r30 = r12
                r31 = r12
                r32 = r3
                r34 = r12
                r35 = r12
                com.facebook.aura.vds.compose.button.AuraButtonKt.m2408AuraButtonnL3aKkM(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
                return
            L82:
                java.lang.String r6 = r4.$joinWaitlistLabel
                goto L20
            L85:
                r3.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistScreenKt.AnonymousClass1.invoke(boolean, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$JoinWaitlistCta$2, reason: invalid class name and case insensitive filesystem */
    public final class C107212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isAlreadyJoined;
        public final /* synthetic */ boolean $isJoiningWaitlist;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107212(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isAlreadyJoined = z;
            this.$isJoiningWaitlist = z2;
            this.$onClick = function0;
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
            AuraWaitlistScreenKt.JoinWaitlistCta(this.$isAlreadyJoined, this.$isJoiningWaitlist, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$NotificationOptInCta$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107222 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
        public final /* synthetic */ AVy $ctaIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107222(AVy aVy) {
            super(3);
            this.$ctaIcon = aVy;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
            invoke(iconContext, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(IconContext iconContext, BFM bfm, int i) {
            if (AnonymousClass002.A0B(iconContext, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, iconContext);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                AnonymousClass007.A0w(bfm, this.$ctaIcon, AuraButtonDefaults.INSTANCE, iconContext, i);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$NotificationOptInCta$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
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
            AuraWaitlistScreenKt.NotificationOptInCta(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$RequestWaitlistNotificationPermission$2, reason: invalid class name and case insensitive filesystem */
    public final class C107232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107232(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWaitlistScreenKt.RequestWaitlistNotificationPermission(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$4, reason: invalid class name and case insensitive filesystem */
    public final class C107244 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107244(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$description = str2;
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
            AuraWaitlistScreenKt.WaitlistHeader(this.$title, this.$description, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistSurface$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107251 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ InterfaceC1185Ado $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107251(InterfaceC1185Ado interfaceC1185Ado, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$verticalArrangement = interfaceC1185Ado;
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
                BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(C3U4.A09(AnonymousClass001.A0U(AnonymousClass005.A0T(bfm, BRg.A00), c0Ig.AHP()), AuraDimensKt.SpacingLarge), AuraContentRole.Focused, bfm, 48);
                C3TH c3th = C2VU.A00;
                InterfaceC1185Ado interfaceC1185Ado = this.$verticalArrangement;
                G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgAuraContentWidth);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                AnonymousClass001.A1G(C90l.A00, bfm, g0w, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistSurface$2, reason: invalid class name and case insensitive filesystem */
    public final class C107262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraWaitlistCelebrationState $celebrationState;
        public final /* synthetic */ HatchComponent $component;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<BLU> $ctaBoundsInRoot;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InterfaceC1185Ado $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107262(HatchComponent hatchComponent, InterfaceC1185Ado interfaceC1185Ado, AuraWaitlistCelebrationState auraWaitlistCelebrationState, Function0<BLU> function0, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$component = hatchComponent;
            this.$verticalArrangement = interfaceC1185Ado;
            this.$celebrationState = auraWaitlistCelebrationState;
            this.$ctaBoundsInRoot = function0;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWaitlistScreenKt.WaitlistSurface(this.$component, this.$verticalArrangement, this.$celebrationState, this.$ctaBoundsInRoot, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WaitlistScreenMode.values().length];
            try {
                AnonymousClass002.A13(WaitlistScreenMode.JOIN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WaitlistScreenMode.JOINED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WaitlistScreenMode.LIMITED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AuraWaitlistScreen(WaitlistScreenMode waitlistScreenMode, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, int i, HatchActivationWaitlistInviteCopy.Screen screen, BRg bRg, BFM bfm, int i2, int i3) {
        HatchComponent hatchComponent;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(waitlistScreenMode, function0);
        C7384Etj.A0Y(function03, 3);
        C7384Etj.A0Y(screen, 6);
        bfm.AgG(-1884919055);
        int iA08 = (i2 & 6) == 0 ? AnonymousClass005.A08(bfm, waitlistScreenMode) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i2 & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i2) == 0) {
            iA08 |= AnonymousClass004.A0H(bfm, i);
        }
        if ((1572864 & i2) == 0) {
            iA08 |= AnonymousClass004.A0Z(bfm, screen);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA08 |= iA0k;
        } else if ((12582912 & i2) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA08 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(waitlistScreenMode, WaitlistScreenMode.JOINED);
            AuraWaitlistCelebrationState auraWaitlistCelebrationStateRememberAuraWaitlistCelebrationState = AuraWaitlistConfettiKt.rememberAuraWaitlistCelebrationState(i, zA1Z, null, bfm, (iA08 >> 15) & 14, 4);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA1M = AnonymousClass004.A1M(iA08);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new AuraWaitlistScreenKt$AuraWaitlistScreen$1$1(function03);
                bfm.Ai0(objAaT2);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT2, 6, 2);
            if (zA1Z) {
                bfm.AgE(-1220488320);
                RequestWaitlistNotificationPermission(bfm, 0);
            } else {
                bfm.AgE(-1220441231);
            }
            AnonymousClass001.A1D(bfm);
            int iOrdinal = waitlistScreenMode.ordinal();
            if (iOrdinal == 0) {
                hatchComponent = HatchComponent.WAITLIST_STATUS;
            } else if (iOrdinal == zA1a) {
                hatchComponent = HatchComponent.JOINED_CONFIRMATION;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                hatchComponent = HatchComponent.WAITLIST_LIMITED;
            }
            C02i c02i = AcQ.A02;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AuraWaitlistScreenKt$AuraWaitlistScreen$2$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            WaitlistSurface(hatchComponent, c02i, auraWaitlistCelebrationStateRememberAuraWaitlistCelebrationState, (Function0) objAaT3, bRg2, B1V.A00(bfm, new AnonymousClass3(screen, auraWaitlistCelebrationStateRememberAuraWaitlistCelebrationState, waitlistScreenMode, zA1Z, z, function0, function02, mutableState), 585790571), bfm, ((iA08 >> 9) & 57344) | 199728, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(waitlistScreenMode, function0, function02, function03, z, i, screen, bRg2, i2, i3);
        }
    }

    public static final void HaveInviteCodeLink(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1840710666);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ab);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            long j = auraTheme.getColors(bfm, 6).link;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1B = AnonymousClass003.A1B(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AuraWaitlistScreenKt$HaveInviteCodeLink$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C10G.A01(C2VU.A04, AnonymousClass006.A0O(C0v5.A04(bRgA0R, c1ydA0A, null, (Function0) objAaT, true)), false), j, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void JoinWaitlistCta(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1861081089);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1Dt.A01(new ASj(C2HU.A01, 300, 0), bfm, bRg2, Boolean.valueOf(z), "waitlistCtaState", B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ac), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202a8), z, z2, function0), 1822683744), (iA0n & 14) | 28032 | ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107212(z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void NotificationOptInCta(BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-1893306089);
        int i4 = i2 & 1;
        int iA0d = i4 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass005.A0S(bfm, areNotificationsEnabled(contextA0H));
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new AuraWaitlistScreenKt$NotificationOptInCta$notificationPermissionLauncher$1$1(contextA0H, mutableState);
                bfm.Ai0(objAaT2);
            }
            C7OU<String, Boolean> c7ouRememberNotificationPermissionLauncher = HatchNotificationPermissionLauncherKt.rememberNotificationPermissionLauncher((G0U) objAaT2, bfm, 0, 0);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA672 = bfm.A67(contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new AuraWaitlistScreenKt$NotificationOptInCta$1$1(contextA0H, mutableState);
                bfm.Ai0(objAaT3);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT3, 6, 2);
            boolean zA0A = MutableState.A0A(mutableState);
            int i5 = R.drawable.bell_wght400_outline_24;
            if (zA0A) {
                i5 = R.drawable.checkmark_outline_24;
            }
            AVy aVyA00 = BOf.A00(bfm, i5, 0);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1970247826);
                i3 = R.string._name_removed__res_0x7f1206ad;
            } else {
                bfm.AgE(-1970149742);
                i3 = R.string._name_removed__res_0x7f1206aa;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbiA07 = C3cG.A07(bfm);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean z = !MutableState.A0A(mutableState);
            B1U b1uA00 = B1V.A00(bfm, new C107222(aVyA00), -917015201);
            boolean zA1M = AnonymousClass003.A1M(bfm, activity, c7ouRememberNotificationPermissionLauncher);
            Object objAaT4 = bfm.AaT();
            if (zA1M || objAaT4 == obj) {
                objAaT4 = new AuraWaitlistScreenKt$NotificationOptInCta$3$1(activity, c7ouRememberNotificationPermissionLauncher, mutableState2);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRg2, null, auraButtonSize, b1uA00, false, false, z, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 9) & 7168) | 1769472, 0, 0, 134200725);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(-1969367302);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f39);
                String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f38);
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = new AuraWaitlistScreenKt$NotificationOptInCta$4$1(mutableState2);
                    bfm.Ai0(objAaT5);
                }
                HatchPermissionDeniedDialogKt.HatchPermissionDeniedDialog(strA012, strA0v, (Function0) objAaT5, null, null, null, null, null, null, bfm, 384, 504);
            } else {
                bfm.AgE(-1969074197);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(bRg2, i, i2);
        }
    }

    public static final void WaitlistHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1675982630);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, Float.valueOf(0.0f));
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, Float.valueOf(0.0f));
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            Unit unit = Unit.INSTANCE;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AuraWaitlistScreenKt$WaitlistHeader$1$1(mutableState, mutableState2, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A06(bfm, unit, (G0V) objAaT3);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            boolean zA65 = bfm.A65(axnA0Y);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = new AuraWaitlistScreenKt$WaitlistHeader$2$1(axnA0Y, mutableState2, mutableState);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRg2, objAaT4);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0W);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A04(bs0, 52.0f), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Emphasized;
            long j = colors.primaryText;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = AuraWaitlistScreenKt$WaitlistHeader$3$1$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT5, false), j, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, colors.secondaryText, C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107244(str, str2, bRg2, i, i2);
        }
    }

    public static final void WaitlistSurface(HatchComponent hatchComponent, InterfaceC1185Ado interfaceC1185Ado, AuraWaitlistCelebrationState auraWaitlistCelebrationState, Function0<BLU> function0, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1092444128);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchComponent) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, interfaceC1185Ado);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, auraWaitlistCelebrationState);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3IL.A00(bfm, null, AbstractC1754Apr.A01(AbstractC1754Apr.A02(HatchImpressionModifierKt.hatchImpression(AuraWaitlistConfettiKt.auraWaitlistConfetti(C1b8.A01(AnonymousClass001.A0T(bRg2), AuraTheme.INSTANCE.getColors(bfm, 6).background), auraWaitlistCelebrationState, function0, bfm, (iA08 >> 3) & 1008), HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_WAITLIST, hatchComponent, null, null, null, 500L, 0.0f, null, null, null))), B1V.A00(bfm, new C107251(interfaceC1185Ado, g0w), -1131134410), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107262(hatchComponent, interfaceC1185Ado, auraWaitlistCelebrationState, function0, bRg2, g0w, i, i2);
        }
    }

    public static final boolean areNotificationsEnabled(Context context) {
        return new C7380Etd(context).A00.areNotificationsEnabled();
    }

    public static final void RequestWaitlistNotificationPermission(BFM bfm, int i) {
        bfm.AgG(1554396195);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            C7OU<String, Boolean> c7ouRememberNotificationPermissionLauncher = HatchNotificationPermissionLauncherKt.rememberNotificationPermissionLauncher(null, bfm, 0, 1);
            boolean zA1M = AnonymousClass003.A1M(bfm, activity, c7ouRememberNotificationPermissionLauncher);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new AuraWaitlistScreenKt$RequestWaitlistNotificationPermission$1$1(activity, c7ouRememberNotificationPermissionLauncher);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, activity);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107232(i);
        }
    }

    public static final void WaitlistHeader$lambda$2(MutableState<Float> mutableState, float f) {
        mutableState.Af8(Float.valueOf(f));
    }

    public static final void WaitlistHeader$lambda$5(MutableState<Float> mutableState, float f) {
        mutableState.Af8(Float.valueOf(f));
    }

    public static final /* synthetic */ BLU access$AuraWaitlistScreen$lambda$1(MutableState mutableState) {
        return (BLU) mutableState.getValue();
    }
}
