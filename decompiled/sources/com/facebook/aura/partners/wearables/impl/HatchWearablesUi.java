package com.facebook.aura.partners.wearables.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.partners.wearables.intf.WearablesUi;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWearablesUi implements WearablesUi {
    public static final HatchWearablesUi INSTANCE = new HatchWearablesUi();

    /* renamed from: com.facebook.aura.partners.wearables.impl.HatchWearablesUi$OnboardingLinkingStep$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLinked;
        public final /* synthetic */ Function0<Unit> $onSkip;
        public final /* synthetic */ boolean $phoneProviderLinked;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $wakeWordOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str, boolean z, String str2, BRg bRg, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$onLinked = function02;
            this.$onSkip = function03;
            this.$wakeWordOverride = str;
            this.$phoneProviderLinked = z;
            this.$setupSessionId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWearablesUi.this.OnboardingLinkingStep(this.$onDismiss, this.$onLinked, this.$onSkip, this.$wakeWordOverride, this.$phoneProviderLinked, this.$setupSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.partners.wearables.intf.WearablesUi
    public void OnboardingLinkingStep(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str, boolean z, String str2, BRg bRg, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        C7384Etj.A0Y(bRg, 6);
        bfm.AgG(-571248505);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0i(bfm, str2);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0j(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            WearablesLinkingFullScreenKt.WearablesLinkingFullScreen(WearablesLinkingOrigin.ONBOARDING, function0, bRg, function02, function03, zA1b, str, null, z, str2, bfm, AnonymousClass004.A01(iA0T << 12, AnonymousClass001.A05(iA0T << 9, AnonymousClass003.A07(iA0T << 6, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((iA0T >> 12) & 896)))), 160);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, function02, function03, str, z, str2, bRg, i);
        }
    }
}
