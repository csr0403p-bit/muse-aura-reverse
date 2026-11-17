package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchWalletScreenKt$HatchWalletScreen$2$1", f = "HatchWalletScreen.kt", l = {87}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchWalletScreenKt$HatchWalletScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchWalletViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$HatchWalletScreen$2$1(HatchWalletViewModel hatchWalletViewModel, AuraNavigator auraNavigator, HtJ<? super HatchWalletScreenKt$HatchWalletScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchWalletViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWalletScreenKt$HatchWalletScreen$2$1(this.$viewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectorCatalogEffect> c22i = this.$viewModel.effects;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super ConnectorCatalogEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchWalletScreenKt$HatchWalletScreen$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConnectorCatalogEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConnectorCatalogEffect connectorCatalogEffect, HtJ<? super Unit> htJ) {
                    AuraNavigator auraNavigator2;
                    boolean z;
                    AuraNavKey skillConnectDisconnectRouterScreenKey;
                    if (connectorCatalogEffect instanceof ConnectorCatalogEffect.OpenDetails) {
                        ConnectorCatalogEffect.OpenDetails openDetails = (ConnectorCatalogEffect.OpenDetails) connectorCatalogEffect;
                        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.WALLET, HatchScreen.WALLET, HatchComponent.SKILL_ROW, null, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), openDetails.connectorId), null);
                        auraNavigator2 = auraNavigator;
                        skillConnectDisconnectRouterScreenKey = new HatchSkillDetailScreenKey(openDetails.connectorId);
                        z = false;
                    } else if (connectorCatalogEffect instanceof ConnectorCatalogEffect.Connect) {
                        ConnectorCatalogEffect.Connect connect = (ConnectorCatalogEffect.Connect) connectorCatalogEffect;
                        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.WALLET, HatchScreen.WALLET, HatchComponent.CONNECTORS_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), connect.connectorId), null);
                        auraNavigator2 = auraNavigator;
                        z = false;
                        skillConnectDisconnectRouterScreenKey = new SkillConnectDisconnectRouterScreenKey(connect.connectorId, true, null, HatchSkillOAuthOrigin.WALLET, null, false);
                    } else {
                        if (!(connectorCatalogEffect instanceof ConnectorCatalogEffect.ManageLocalConnector)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    auraNavigator2.navigate(skillConnectDisconnectRouterScreenKey, z);
                    return Unit.INSTANCE;
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
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchWalletScreenKt$HatchWalletScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
