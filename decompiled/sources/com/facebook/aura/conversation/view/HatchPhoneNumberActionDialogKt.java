package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0n6;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1D8;
import X.C1YD;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPhoneNumberActionDialogKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onCallClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onMessageClick;
        public final /* synthetic */ String $phoneUrl;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchScreen hatchScreen, Map<String, String> map, G0U<? super String, Unit> g0u, String str, Function0<Unit> function0, G0U<? super String, Unit> g0u2) {
            super(2);
            this.$screen = hatchScreen;
            this.$threadLogMetadata = map;
            this.$onCallClick = g0u;
            this.$phoneUrl = str;
            this.$onDismiss = function0;
            this.$onMessageClick = g0u2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRgA06 = C3U4.A06(C06G.A0P(bfm, BRg.A00, C1D8.A00(16.0f)), 8.0f);
                HatchScreen hatchScreen = this.$screen;
                Map<String, String> map = this.$threadLogMetadata;
                G0U<String, Unit> g0u = this.$onCallClick;
                String str = this.$phoneUrl;
                Function0<Unit> function0 = this.$onDismiss;
                G0U<String, Unit> g0u2 = this.$onMessageClick;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA06);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ab9);
                C1062ATq c1062ATq = C10G.A02;
                C1YD c1yd = new C1YD(0);
                int iOrdinal = hatchScreen.ordinal();
                boolean zA1T = AnonymousClass005.A1T(bfm, g0u, str, function0, AnonymousClass001.A1T(bfm, map, bfm.A63(iOrdinal)));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$2$1$1$1(hatchScreen, map, g0u, str, function0);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C0v5.A04(c1062ATq, c1yd, null, (Function0) objAaT, true), 24.0f, 16.0f), C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b7b);
                C1YD c1yd2 = new C1YD(0);
                boolean zA1T2 = AnonymousClass005.A1T(bfm, g0u2, str, function0, AnonymousClass001.A1T(bfm, map, bfm.A63(iOrdinal)));
                Object objAaT2 = bfm.AaT();
                if (zA1T2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$2$1$2$1(hatchScreen, map, g0u2, str, function0);
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0B(C0v5.A04(c1062ATq, c1yd2, null, (Function0) objAaT2, true), 24.0f, 16.0f), C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<String, Unit> $onCallClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onMessageClick;
        public final /* synthetic */ String $phoneUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, int i) {
            super(2);
            this.$phoneUrl = str;
            this.$onCallClick = g0u;
            this.$onMessageClick = g0u2;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPhoneNumberActionDialogKt.HatchPhoneNumberActionDialog(this.$phoneUrl, this.$onCallClick, this.$onMessageClick, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchPhoneNumberActionDialog(String str, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(str, g0u);
        AnonymousClass002.A1B(g0u2, 2, function0);
        bfm.AgG(273246911);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, zA1b ? 1 : 0);
            boolean zA1T = AnonymousClass001.A1T(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass002.A1U(bfm, hatchScreenA0M)) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$1$1(hatchScreenA0M, mapCurrentChatThreadLogMetadata, function0);
                bfm.Ai0(objAaT);
            }
            C0n6.A00(bfm, null, (Function0) objAaT, B1V.A00(bfm, new AnonymousClass2(hatchScreenA0M, mapCurrentChatThreadLogMetadata, g0u, str, function0, g0u2), -1231134058), 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, g0u, g0u2, function0, i);
        }
    }

    public static final void logPhoneActionClick(HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, hatchComponent, null, map, null);
    }
}
