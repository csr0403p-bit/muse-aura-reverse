package com.facebook.aura.inappnotification;

import X.AKH;
import X.AKQ;
import X.AQI;
import X.ASj;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC1754Apr;
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
import X.B15;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0er;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1416Ail;
import X.C1515AkP;
import X.C1AC;
import X.C1DM;
import X.C1DP;
import X.C1Hg;
import X.C1YD;
import X.C28s;
import X.C2HU;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.Ejq;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.inappnotification.api.InAppNotification;
import com.facebook.aura.microphone.view.SilencedByMicrophoneKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInAppNotificationHostKt {
    public static final int ENTER_ANIMATION_MILLIS = 220;
    public static final int EXIT_ANIMATION_MILLIS = 160;
    public static final long LONG_DURATION_MILLIS = 7000;
    public static final long SHORT_DURATION_MILLIS = 4000;

    /* renamed from: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator, int i) {
            super(2);
            this.$navigator = auraNavigator;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInAppNotificationHostKt.HatchInAppNotificationHost(this.$navigator, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$InAppNotificationBar$3, reason: invalid class name and case insensitive filesystem */
    public final class C122463 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ InAppNotification.NotificationArgs $notification;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122463(InAppNotification.NotificationArgs notificationArgs) {
            super(3);
            this.$notification = notificationArgs;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingMedium;
                BRg bRgA0D = C3U4.A0D(c1062ATq, new C1DP(f, f, f, f));
                C1AC c1ac = C2VU.A04;
                InAppNotification.NotificationArgs notificationArgs = this.$notification;
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0D);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                BRg bRgAiP = C90m.A00.AiP(bs0, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(notificationArgs.title, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                String str = notificationArgs.subtitle;
                if (str != null && str.length() != 0) {
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, -664034718).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                } else {
                    bfm.AgE(-663792236);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                InAppNotification.Icon icon = notificationArgs.icon;
                if (icon == null) {
                    bfm.AgE(-748896040);
                } else {
                    bfm.AgE(-748896039);
                    C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
                    HatchInAppNotificationHostKt.InAppNotificationIcon(icon, bfm, 0);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$InAppNotificationBar$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ InAppNotification.NotificationArgs $notification;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InAppNotification.NotificationArgs notificationArgs, Function0<Unit> function0, int i) {
            super(2);
            this.$notification = notificationArgs;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInAppNotificationHostKt.InAppNotificationBar(this.$notification, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$InAppNotificationIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ InAppNotification.Icon $icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InAppNotification.Icon icon, int i) {
            super(2);
            this.$icon = icon;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInAppNotificationHostKt.InAppNotificationIcon(this.$icon, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchInAppNotificationHost(AuraNavigator auraNavigator, BFM bfm, int i) {
        C7384Etj.A0Y(auraNavigator, 0);
        bfm.AgG(-1891808037);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraNavigator, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Unit unit = Unit.INSTANCE;
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(auraNavigator));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1(auraNavigator, mutableState, mutableState2, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            InAppNotification.NotificationArgs notificationArgs = (InAppNotification.NotificationArgs) mutableState.getValue();
            if (notificationArgs == null) {
                bfm.AgE(959590089);
            } else {
                bfm.AgE(959590090);
                HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
                boolean zA0A = MutableState.A0A(mutableState2);
                C28s c28s = C2HU.A01;
                ASj aSj = new ASj(c28s, 220, 0);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AQI aqiA00 = AbstractC1011APs.A09(aSj, (G0U) objAaT3).A00(AnonymousClass003.A0P(c28s, 220, 0));
                ASj aSj2 = new ASj(c28s, 160, 0);
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == obj) {
                    objAaT4 = HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT4);
                }
                AbstractC04661Bq.A08(aqiA00, AbstractC1011APs.A0I(aSj2, (G0U) objAaT4).A00(AbstractC1011APs.A0E(new ASj(c28s, 160, 0))), bfm, c0z7.A4C(C2VU.A0C, bs0), null, B1V.A00(bfm, new HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3(notificationArgs, hatchSidePanelController, auraNavigator, mutableState2), 1244758900), 200064, 16, zA0A);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraNavigator, i);
        }
    }

    public static final boolean isSuppressed(InAppNotification.NotificationArgs notificationArgs, AuraNavigator auraNavigator) {
        AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
        if (auraNavKeyCurrentKey != null) {
            return notificationArgs.suppressionKeys.contains(auraNavKeyCurrentKey);
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppNotification.Duration.values().length];
            try {
                AnonymousClass002.A13(InAppNotification.Duration.SHORT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(InAppNotification.Duration.LONG, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(InAppNotification.Duration.CUSTOMIZED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long displayDurationMillis(InAppNotification.NotificationArgs notificationArgs) {
        int iOrdinal = notificationArgs.duration.ordinal();
        if (iOrdinal == 0) {
            return 4000L;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Long l = notificationArgs.customizedDurationMillis;
            if (l != null) {
                return l.longValue();
            }
        }
        return LONG_DURATION_MILLIS;
    }

    public static final void InAppNotificationBar(InAppNotification.NotificationArgs notificationArgs, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-123180972);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, notificationArgs) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            boolean zRememberSilencedByMicrophone = SilencedByMicrophoneKt.rememberSilencedByMicrophone(notificationArgs, bfm, iA0T & 14);
            BRg bRgA02 = AbstractC1754Apr.A02(BRg.A00);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0R = AnonymousClass001.A0R(C3U4.A0D(bRgA02, new C1DP(f, AuraDimensKt.SpacingMedium, f, 0.0f)));
            C1DM c1dm = AnonymousClass002.A0e(bfm).toast;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgThen = bRgA0R.then(new C1416Ail(c1dm, 12.0f, C0er.A00, AnonymousClass001.A0f(bfm, akh).toastShadow, true));
            boolean zA1X = AnonymousClass002.A1X(function0);
            C1YD c1yd = new C1YD(0);
            boolean zA1O = AnonymousClass001.A1O(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchInAppNotificationHostKt$InAppNotificationBar$1$1(function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgThen, c1yd, null, (Function0) objAaT, zA1X);
            boolean zA66 = bfm.A66(zRememberSilencedByMicrophone);
            Object objAaT2 = bfm.AaT();
            if (zA66 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchInAppNotificationHostKt$InAppNotificationBar$2$1(zRememberSilencedByMicrophone);
                bfm.Ai0(objAaT2);
            }
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(AnonymousClass001.A0Y(bRgA04, objAaT2, true), AnonymousClass002.A0e(bfm).toast, false, C06G.A0K(bfm, akh), null, C06G.A0L(bfm, akh), null, false, B1V.A00(bfm, new C122463(notificationArgs), 1252631924), bfm, 100663296, 212);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(notificationArgs, function0, i);
        }
    }

    public static final void InAppNotificationIcon(InAppNotification.Icon icon, BFM bfm, int i) {
        bfm.AgG(-341149471);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(icon, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            BRg bRgA03 = C11U.A03(C10G.A07(BRg.A00, AnonymousClass002.A0d(bfm).icon.large), AnonymousClass002.A0e(bfm).small);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (icon instanceof InAppNotification.Icon.Resource) {
                bfm.AgE(2049124156);
                AnonymousClass007.A0x(bfm, BOf.A00(bfm, ((InAppNotification.Icon.Resource) icon).resId, 0), AuraIconSize.MEDIUM);
            } else {
                if (!(icon instanceof InAppNotification.Icon.Url)) {
                    throw AnonymousClass003.A0k(bfm, bbi, -1180826656);
                }
                bfm.AgE(2049347015);
                InAppNotification.Icon.Url url = (InAppNotification.Icon.Url) icon;
                boolean zA65 = bfm.A65(url.url);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = B15.A01(url.url);
                    bfm.Ai0(objAaT);
                }
                C1Hg.A01(bfm, C10G.A01, null, B18.A00, null, null, null, (Ejq) objAaT, "HatchInAppNotification", null, 12610566, 868, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(icon, i);
        }
    }

    public static final /* synthetic */ InAppNotification.NotificationArgs access$HatchInAppNotificationHost$lambda$1(MutableState mutableState) {
        return (InAppNotification.NotificationArgs) mutableState.getValue();
    }
}
