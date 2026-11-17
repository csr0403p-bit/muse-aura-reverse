package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.identity.provider.HatchChatThemeOption;
import com.facebook.aura.identity.provider.HatchChatThemesState;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AuraDrawableSource $avatarSource;
    public final /* synthetic */ C1BO<HatchChatThemesState> $chatThemes$delegate;
    public final /* synthetic */ HatchIdentityProvider $identityProvider;
    public final /* synthetic */ long $userBubble;

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ C1BO<HatchChatThemesState> $chatThemes$delegate;
        public final /* synthetic */ HatchIdentityProvider $identityProvider;
        public final /* synthetic */ long $userBubble;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraDrawableSource auraDrawableSource, long j, HatchIdentityProvider hatchIdentityProvider, C1BO<HatchChatThemesState> c1bo) {
            super(3);
            this.$avatarSource = auraDrawableSource;
            this.$userBubble = j;
            this.$identityProvider = hatchIdentityProvider;
            this.$chatThemes$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                String str = this.$chatThemes$delegate.getValue().selectedThemeId;
                List<HatchChatThemeOption> list = this.$chatThemes$delegate.getValue().themes;
                AuraDrawableSource auraDrawableSource = this.$avatarSource;
                long j = this.$userBubble;
                boolean zA67 = bfm.A67(this.$identityProvider);
                HatchIdentityProvider hatchIdentityProvider = this.$identityProvider;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1$1$1$1(hatchIdentityProvider);
                    bfm.Ai0(objAaT);
                }
                HatchAppAppearanceSettingsScreenKt.m235ChatThemePickerww6aTOc(str, list, auraDrawableSource, j, (G0U) objAaT, bfm, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$avatarSource, this.$userBubble, this.$identityProvider, this.$chatThemes$delegate), 672637201);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1(AuraDrawableSource auraDrawableSource, long j, HatchIdentityProvider hatchIdentityProvider, C1BO<HatchChatThemesState> c1bo) {
        super(1);
        this.$avatarSource = auraDrawableSource;
        this.$userBubble = j;
        this.$identityProvider = hatchIdentityProvider;
        this.$chatThemes$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
