package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
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
import X.C1BO;
import X.C1YL;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AppLockRepository $repository;
    public final /* synthetic */ C1BO<AppLockTimeout> $timeout$delegate;
    public final /* synthetic */ AppLockTimeout $timeoutOption;

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
        C1062ATq c1062ATq = C10G.A02;
        AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
        AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(BiometricsSettingsScreenKt.resolveTimeoutLabel(this.$timeoutOption, bfm, 0)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
        Boolean boolValueOf = Boolean.valueOf(this.$timeout$delegate.getValue() == this.$timeoutOption);
        boolean zA1H = AnonymousClass003.A1H(bfm, this.$timeoutOption, AnonymousClass001.A1T(bfm, this.$repository, bfm.A67(this.$coroutineScope)));
        C3UX c3ux = this.$coroutineScope;
        AppLockRepository appLockRepository = this.$repository;
        AppLockTimeout appLockTimeout = this.$timeoutOption;
        Object objAaT = bfm.AaT();
        if (zA1H || objAaT == C78N.A00) {
            objAaT = new BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1$1$1(c3ux, appLockRepository, appLockTimeout);
            bfm.Ai0(objAaT);
        }
        AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1(AppLockTimeout appLockTimeout, C3UX c3ux, AppLockRepository appLockRepository, C1BO<? extends AppLockTimeout> c1bo) {
        super(3);
        this.$timeoutOption = appLockTimeout;
        this.$coroutineScope = c3ux;
        this.$repository = appLockRepository;
        this.$timeout$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
