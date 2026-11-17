package com.facebook.aura.skills.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.SkillOAuthLinkHandlerKt;
import com.facebook.aura.skills.viewmodel.SkillAccountsEffect;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1", f = "HatchSkillDetailScreen.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, AuraNavigator auraNavigator, Context context, HtJ<? super HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1> htJ) {
        super(2, htJ);
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$navigator = auraNavigator;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1(this.$linkedAccountsViewModel, this.$navigator, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<SkillAccountsEffect> c22i = this.$linkedAccountsViewModel.effects;
            final AuraNavigator auraNavigator = this.$navigator;
            final Context context = this.$context;
            C20Z<? super SkillAccountsEffect> c20z = new C20Z() { // from class: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1.1
                public final Object emit(SkillAccountsEffect skillAccountsEffect, HtJ<? super Unit> htJ) {
                    if (skillAccountsEffect instanceof SkillAccountsEffect.OpenReconnectDestination) {
                        auraNavigator.navigate(((SkillAccountsEffect.OpenReconnectDestination) skillAccountsEffect).destination, false);
                    } else {
                        if (!(skillAccountsEffect instanceof SkillAccountsEffect.OpenConnectorAccountLink)) {
                            throw C3cG.A0q();
                        }
                        SkillAccountsEffect.OpenConnectorAccountLink openConnectorAccountLink = (SkillAccountsEffect.OpenConnectorAccountLink) skillAccountsEffect;
                        SkillOAuthLinkHandlerKt.openSkillOAuthLink(context, openConnectorAccountLink.linkUrl, openConnectorAccountLink.connectorId, HatchSkillOAuthOrigin.SETTINGS);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SkillAccountsEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSkillDetailScreenKt$HatchSkillDetailScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
