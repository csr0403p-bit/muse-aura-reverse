package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isPreAuth;
    public final /* synthetic */ Function0<Unit> $onContactSupport;
    public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$onOpenHelpCenter = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchHelpSupportSettingsScreenKt.HelpCenterCard(this.$onOpenHelpCenter, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isPreAuth;
        public final /* synthetic */ Function0<Unit> $onContactSupport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, Function0<Unit> function0) {
            super(3);
            this.$isPreAuth = z;
            this.$onContactSupport = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                boolean z = this.$isPreAuth;
                int i2 = R.string._name_removed__res_0x7f120c20;
                if (z) {
                    i2 = R.string._name_removed__res_0x7f120c1a;
                }
                HatchHelpSupportSettingsScreenKt.FeedbackCard(i2, this.$onContactSupport, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$onOpenHelpCenter), 2033393444);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$isPreAuth, this.$onContactSupport), -1316809143);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$1$1(G0V<? super String, ? super String, Unit> g0v, boolean z, Function0<Unit> function0) {
        super(1);
        this.$onOpenHelpCenter = g0v;
        this.$isPreAuth = z;
        this.$onContactSupport = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
