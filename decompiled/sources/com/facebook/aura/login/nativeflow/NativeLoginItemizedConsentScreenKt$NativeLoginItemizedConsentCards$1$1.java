package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AHD<Boolean> $accepted;
    public final /* synthetic */ boolean $allAccepted;
    public final /* synthetic */ HatchItemizedConsent $consent;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ long $linkColor;
    public final /* synthetic */ G0U<Boolean, Unit> $onAgreeToAllToggled;
    public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $allAccepted;
        public final /* synthetic */ HatchItemizedConsent $consent;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<Boolean, Unit> $onAgreeToAllToggled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, HatchItemizedConsent hatchItemizedConsent, boolean z2, G0U<? super Boolean, Unit> g0u) {
            super(3);
            this.$isLoading = z;
            this.$consent = hatchItemizedConsent;
            this.$allAccepted = z2;
            this.$onAgreeToAllToggled = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                boolean z = !this.$isLoading;
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String str = this.$consent.agreeToAllLabel;
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), toggle, null, null, null, Boolean.valueOf(this.$allAccepted), this.$onAgreeToAllToggled, null, z, false, null, null, 0L, false, null, null, bfm, 3078, 0, 260720);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$isLoading, this.$consent, this.$allAccepted, this.$onAgreeToAllToggled), -180230745);
        AHD<HatchConsentItem> ahd = this.$consent.items;
        long j = this.$linkColor;
        boolean z = this.$isLoading;
        Context context = this.$context;
        AHD<Boolean> ahd2 = this.$accepted;
        G0V<Integer, Boolean, Unit> g0v = this.$onItemToggled;
        int i = 0;
        for (Object obj : ahd) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0u(hatchSectionScope, new NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1((HatchConsentItem) obj, j, z, context, ahd2, i, g0v), -1646929871);
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1(HatchItemizedConsent hatchItemizedConsent, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, long j, Context context, AHD<Boolean> ahd, G0V<? super Integer, ? super Boolean, Unit> g0v) {
        super(1);
        this.$consent = hatchItemizedConsent;
        this.$isLoading = z;
        this.$allAccepted = z2;
        this.$onAgreeToAllToggled = g0u;
        this.$linkColor = j;
        this.$context = context;
        this.$accepted = ahd;
        this.$onItemToggled = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
