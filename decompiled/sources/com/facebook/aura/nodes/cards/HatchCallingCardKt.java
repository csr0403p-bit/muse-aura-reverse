package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3cG;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.C78N;
import X.C7Je;
import X.CFK;
import X.F60;
import X.FGI;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchCallingCardKt {
    public static final String TAG = "HatchCallingCard";

    /* renamed from: com.facebook.aura.nodes.cards.HatchCallingCardKt$HatchCallingCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CallingCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CallingCardData callingCardData, HatchScreen hatchScreen, Map<String, String> map, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = callingCardData;
            this.$screen = hatchScreen;
            this.$threadLogMetadata = map;
            this.$modifier = bRg;
            this.$inBubble = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCallingCardKt.HatchCallingCard(this.$data, this.$screen, this.$threadLogMetadata, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchCallingCard(CallingCardData callingCardData, HatchScreen hatchScreen, Map<String, String> map, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1a = AnonymousClass002.A1a(callingCardData, hatchScreen);
        C7384Etj.A0Y(map, 2);
        bfm.AgG(1857334661);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(callingCardData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(map, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(callingCardData.phoneNumber);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            String str = callingCardData.phoneNumber;
            String str2 = callingCardData.contactName;
            int i5 = iA05 & 14;
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableState, contextA0H, i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(callingCardData)));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCallingCardKt$HatchCallingCard$1$1(callingCardData, contextA0H, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, str, str2);
            NodeCardAppResolution nodeCardAppResolutionRememberNodeCardApp = NodeCardAppHeaderKt.rememberNodeCardApp(NodeCardAppKind.DIALER, bfm, 6);
            String str3 = callingCardData.contactName;
            if (str3 == null) {
                ContactInfo contactInfo = (ContactInfo) mutableState.getValue();
                str3 = contactInfo != null ? contactInfo.name : null;
            }
            boolean zA652 = bfm.A65(callingCardData.phoneNumber);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = CallingCardResolverKt.formatPhoneNumberForDisplay(callingCardData.phoneNumber);
                bfm.Ai0(objAaT3);
            }
            String str4 = (String) objAaT3;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3cI.A07(bRg2.then(c1062ATq), zA1K, bfm, iA05 >> 12);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 12.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA02);
            NodeCardAppHeaderKt.NodeCardAppHeader(nodeCardAppResolutionRememberNodeCardApp, null, bfm, NodeCardAppResolution.$stable, 2);
            ContactInfo contactInfo2 = (ContactInfo) mutableState.getValue();
            NodeCardComponentsKt.NodeCardContactRow(str3, str4, contactInfo2 != null ? contactInfo2.photoUri : null, null, bfm, 0, 8);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ab9);
            AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, zA1a ? 1 : 0);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, (iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(map)), AnonymousClass003.A1C(iA05)) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(callingCardData)));
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == C78N.A00) {
                objAaT4 = new HatchCallingCardKt$HatchCallingCard$2$1$1(hatchScreen, map, contextA0H, callingCardData);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(callingCardData, hatchScreen, map, bRg2, zA1K, i, i2);
        }
    }

    public static final void logCallClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.PHONE_CALL_CARD, null, map, null);
    }

    public static final void openDialer(Context context, String str) {
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(FGI.A0M("tel:", str));
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null) {
            Intent intentAddFlags = new Intent(C60N.A00(19), uriA01).addFlags(268435456);
            C7384Etj.A0U(intentAddFlags);
            try {
                C3cI.A18(context, intentAddFlags);
            } catch (ActivityNotFoundException e) {
                CFK.A0A(TAG, "No dialer app available to open", e);
            }
        }
    }
}
