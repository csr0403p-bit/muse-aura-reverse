package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0881AGi;
import X.C0v5;
import X.C1515AkP;
import X.C1733ApU;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1YD;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.channels.ChannelApp;
import com.facebook.aura.channels.ChannelAppLauncherKt;
import com.facebook.aura.channels.HatchMessengerAgentThread;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchChannelRedirectFooterKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchChannelRedirectFooterKt$HatchChannelConnectionErrorFooter$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            HatchChannelRedirectFooterKt.HatchChannelConnectionErrorFooter(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchChannelRedirectFooterKt$HatchChannelRedirectFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMessageChannel $channel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchMessageChannel hatchMessageChannel, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$channel = hatchMessageChannel;
            this.$modifier = bRg;
            this.$needsAttention = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchChannelRedirectFooterKt.HatchChannelRedirectFooter(this.$channel, this.$modifier, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchChannelRedirectFooterKt$HatchChannelRedirectFooter$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMessageChannel $channel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchMessageChannel hatchMessageChannel, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$channel = hatchMessageChannel;
            this.$modifier = bRg;
            this.$needsAttention = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchChannelRedirectFooterKt.HatchChannelRedirectFooter(this.$channel, this.$modifier, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMessageChannel.values().length];
            try {
                AnonymousClass002.A13(HatchMessageChannel.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMessageChannel.MESSENGER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchMessageChannel.TELEGRAM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchMessageChannel.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchMessageChannel.THREADS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchChannelConnectionErrorFooter(BRg bRg, BFM bfm, int i, int i2) {
        List listSingletonList;
        BRg bRg2 = bRg;
        bfm.AgG(-1265942295);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12084e);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f12084d);
            long jA07 = C06G.A07(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0t, strA01) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                int iA09 = AnonymousClass007.A09(strA0t, strA01);
                if (iA09 >= 0) {
                    long j = C1809ArT.A01;
                    listSingletonList = Collections.singletonList(new C1733ApU(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA07, j, j, B6A.A07), iA09, strA01.length() + iA09));
                } else {
                    listSingletonList = C0881AGi.A00;
                }
                objAaT = new ApQ(strA0t, listSingletonList, C0881AGi.A00);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA0U = AnonymousClass003.A0U(AnonymousClass001.A0R(bRg2));
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchChannelRedirectFooterKt$HatchChannelConnectionErrorFooter$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA04 = C0v5.A04(bRgA0U, c1yd, strA01, (Function0) objAaT2, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA04, f, AuraDimensKt.SpacingXsmall, f, f);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == C78N.A00) {
                objAaT3 = HatchChannelRedirectFooterKt$HatchChannelConnectionErrorFooter$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, AbstractC07539Wl.A00(AnonymousClass001.A0Y(bRgA0C, objAaT3, false), "hatch-channel-connection-error-footer"), jA08, c1822ArmA0Y, null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void HatchChannelRedirectFooter(HatchMessageChannel hatchMessageChannel, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchMessageChannel, 0);
        bfm.AgG(1075401761);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchMessageChannel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            C1BO c1boA02 = C2CK.A02(bfm, HatchDeveloperPrefs.whatsAppConnectionPreview);
            if (hatchMessageChannel == HatchMessageChannel.WHATSAPP && (z2 || c1boA02.getValue() == HatchDeveloperPrefs.WhatsAppConnectionPreview.NEEDS_ATTENTION)) {
                bfm.AgE(1133178390);
                HatchChannelConnectionErrorFooter(bRg2, bfm, (iA08 >> 3) & 14, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(hatchMessageChannel, bRg2, z2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1133250465);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            int i5 = iA08 & 14;
            String strChannelDisplayName = HatchChannelDisplayNameKt.channelDisplayName(hatchMessageChannel, null, bfm, i5, 2);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1YD c1yd = new C1YD(0);
            boolean zA1T = AnonymousClass001.A1T(bfm, contextA0H, AnonymousClass002.A1Q(i5, 4));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchChannelRedirectFooterKt$HatchChannelRedirectFooter$2$1(hatchMessageChannel, contextA0H);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA0R, c1yd, null, (Function0) objAaT, true);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmall;
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A0C(bRgA04, f, f2, f, f), "hatch-channel-redirect-footer");
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(f2), bfm, C2VU.A00, 48);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, strChannelDisplayName, R.string._name_removed__res_0x7f120850), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, new C1YL(3), false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14770);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, strChannelDisplayName, R.string._name_removed__res_0x7f12084f), null, C06G.A0D(bfm), AnonymousClass002.A0f(bfm).footnoteEmphasized, null, null, new C1YL(3), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(hatchMessageChannel, bRg2, z2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final void openChannelConversation(HatchMessageChannel hatchMessageChannel, Context context) {
        ChannelApp channelApp = toChannelApp(hatchMessageChannel);
        ChannelAppLauncherKt.openChannelApp(context, channelApp, channelApp == ChannelApp.MESSENGER ? HatchMessengerAgentThread.MUSE_CHAT_DEEPLINK : null);
    }

    public static final ChannelApp toChannelApp(HatchMessageChannel hatchMessageChannel) {
        int iOrdinal = hatchMessageChannel.ordinal();
        if (iOrdinal == 0) {
            return ChannelApp.WHATSAPP;
        }
        if (iOrdinal == 1) {
            return ChannelApp.MESSENGER;
        }
        if (iOrdinal == 4) {
            return ChannelApp.TELEGRAM;
        }
        if (iOrdinal == 2) {
            return ChannelApp.INSTAGRAM;
        }
        if (iOrdinal == 3) {
            return ChannelApp.THREADS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
