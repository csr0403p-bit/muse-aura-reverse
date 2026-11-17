package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C10G;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;

    /* renamed from: com.facebook.aura.settings.HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onSetDefaultAssistantClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchDefaultAssistantSettingsScreenKt.DefaultAssistantRoleCard(this.$onSetDefaultAssistantClick, C10G.A02, bfm, 48, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$onSetDefaultAssistantClick), 1078470125);
        hatchSectionScope.item(ComposableSingletons$HatchDefaultAssistantSettingsScreenKt.lambda$1369770340);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$1$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$onSetDefaultAssistantClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
