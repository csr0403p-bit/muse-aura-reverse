package com.facebook.aura.skills.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.skills.api.ConnectorDestinations;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect;
import com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.view.HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1", f = "HatchConnectorCatalogActions.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<LocalDeviceConnector, Unit> $manageLocal;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ ConnectorScreenViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1(ConnectorScreenViewModel connectorScreenViewModel, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, G0U<? super LocalDeviceConnector, Unit> g0u, HtJ<? super HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = connectorScreenViewModel;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$manageLocal = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1(this.$viewModel, this.$navigator, this.$userSession, this.$manageLocal, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectorCatalogEffect> c22i = this.$viewModel.effects;
            final AuraNavigator auraNavigator = this.$navigator;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            final G0U<LocalDeviceConnector, Unit> g0u = this.$manageLocal;
            C20Z<? super ConnectorCatalogEffect> c20z = new C20Z() { // from class: com.facebook.aura.skills.view.HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConnectorCatalogEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConnectorCatalogEffect connectorCatalogEffect, HtJ<? super Unit> htJ) {
                    if (connectorCatalogEffect instanceof ConnectorCatalogEffect.OpenDetails) {
                        ConnectorCatalogEffect.OpenDetails openDetails = (ConnectorCatalogEffect.OpenDetails) connectorCatalogEffect;
                        ConnectorSettingsAnalytics.INSTANCE.logConnectorRowClick(openDetails.connectorId);
                        AuraNavigator auraNavigator2 = auraNavigator;
                        AuraNavKey auraNavKeyFind = ConnectorDestinations.INSTANCE.find(abstractC3358CGz, openDetails.connectorId);
                        if (auraNavKeyFind == null) {
                            auraNavKeyFind = new HatchSkillDetailScreenKey(openDetails.connectorId);
                        }
                        auraNavigator2.navigate(auraNavKeyFind, false);
                    } else if (connectorCatalogEffect instanceof ConnectorCatalogEffect.Connect) {
                        ConnectorCatalogEffect.Connect connect = (ConnectorCatalogEffect.Connect) connectorCatalogEffect;
                        AuraNavKey auraNavKeyFind2 = ConnectorDestinations.INSTANCE.find(abstractC3358CGz, connect.connectorId);
                        if (auraNavKeyFind2 != null) {
                            auraNavigator.navigate(auraNavKeyFind2, false);
                        } else {
                            ConnectorConnectActionKt.handleEnableSkill(connect.connectorId, auraNavigator, "settings", HatchSkillOAuthOrigin.SETTINGS);
                        }
                    } else if (connectorCatalogEffect instanceof ConnectorCatalogEffect.ManageLocalConnector) {
                        ConnectorSettingsAnalytics.INSTANCE.logEnableDeviceConnectorClick();
                        g0u.invoke(((ConnectorCatalogEffect.ManageLocalConnector) connectorCatalogEffect).connector);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
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
        return ((HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
