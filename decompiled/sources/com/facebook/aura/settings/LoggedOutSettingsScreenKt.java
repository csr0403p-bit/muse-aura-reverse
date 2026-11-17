package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LoggedOutSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.LoggedOutSettingsScreenKt$LoggedOutSettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$onHelpSupportSettingsClick = function02;
            this.$onLegalSafetySettingsClick = function03;
            this.$onInternalSettingsClick = function04;
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
            LoggedOutSettingsScreenKt.LoggedOutSettingsScreen(this.$onClose, this.$onHelpSupportSettingsClick, this.$onLegalSafetySettingsClick, this.$onInternalSettingsClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LoggedOutSettingsScreen(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A14(function0, function02, function03, function04);
        bfm.AgG(120583958);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function04);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T << 6;
            HatchActivationSettingsScreenKt.HatchActivationSettingsScreen(function0, null, function02, null, function03, null, bRg2, null, function04, bfm, AnonymousClass001.A05(i4, AnonymousClass001.A0A(i4, (iA0T & 14) | 199728 | ((iA0T << 3) & 896))) | ((iA0T << 15) & 234881024), 128);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, function02, function03, function04, bRg2, i, i2);
        }
    }
}
