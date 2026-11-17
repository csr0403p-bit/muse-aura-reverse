package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.PhoneNotificationsAccessMode;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
    public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
        public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f3d)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
            Boolean boolValueOf = Boolean.valueOf(this.$readMode$delegate.getValue() == PhoneNotificationsAccessMode.ALL);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$prefsStore, bfm.A65(this.$readMode$delegate)));
            HatchGatewayPrefsStore hatchGatewayPrefsStore = this.$prefsStore;
            Context context = this.$context;
            MutableState<PhoneNotificationsAccessMode> mutableState = this.$readMode$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$1$1$1(hatchGatewayPrefsStore, context, mutableState);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<PhoneNotificationsAccessMode> mutableState, HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context) {
            super(3);
            this.$readMode$delegate = mutableState;
            this.$prefsStore = hatchGatewayPrefsStore;
            this.$context = context;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
        public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f3e)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
            Boolean boolValueOf = Boolean.valueOf(this.$readMode$delegate.getValue() == PhoneNotificationsAccessMode.SELECTED);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$prefsStore, bfm.A65(this.$readMode$delegate)));
            HatchGatewayPrefsStore hatchGatewayPrefsStore = this.$prefsStore;
            Context context = this.$context;
            MutableState<PhoneNotificationsAccessMode> mutableState = this.$readMode$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$2$1$1(hatchGatewayPrefsStore, context, mutableState);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<PhoneNotificationsAccessMode> mutableState, HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context) {
            super(3);
            this.$readMode$delegate = mutableState;
            this.$prefsStore = hatchGatewayPrefsStore;
            this.$context = context;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$readMode$delegate, this.$prefsStore, this.$context), -1600595236);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$readMode$delegate, this.$prefsStore, this.$context), 385776965);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1(MutableState<PhoneNotificationsAccessMode> mutableState, HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context) {
        super(1);
        this.$readMode$delegate = mutableState;
        this.$prefsStore = hatchGatewayPrefsStore;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
