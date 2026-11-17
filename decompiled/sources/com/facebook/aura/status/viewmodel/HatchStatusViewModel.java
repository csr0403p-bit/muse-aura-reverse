package com.facebook.aura.status.viewmodel;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.ApQ;
import X.B6A;
import X.C06H;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C1BN;
import X.C20Q;
import X.C3Es;
import X.C3cG;
import X.C4JM;
import X.C7384Etj;
import X.C9uG;
import X.FGI;
import X.InterfaceC08439ui;
import android.app.Application;
import com.facebook.aura.R;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.AgentStatusCta;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.BuyCreditsEntrySurface;
import com.facebook.aura.status.repo.AgentActivityInfo;
import com.facebook.aura.status.repo.HatchAction;
import com.facebook.aura.status.repo.HatchModelInfo;
import com.facebook.aura.status.repo.HatchStatusRepository;
import com.facebook.aura.status.repo.HatchUpcomingTask;
import com.facebook.aura.status.repo.TextPart;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchStatusViewModel extends AEs {
    public final HatchStatusRepository repository;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final C1BN<HatchStatusUiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory implements InterfaceC08439ui {
        public final String subthreadSessionId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.subthreadSessionId = str;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchStatusViewModel(this.userSession, this.subthreadSessionId);
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
            this(abstractC3358CGz, AnonymousClass006.A0s(i, str));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        HatchStatusRepository hatchStatusRepository = new HatchStatusRepository(abstractC3358CGz, str);
        this.repository = hatchStatusRepository;
        AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz);
        this.subscriptionRepository = companion;
        HatchStatusViewModel$special$$inlined$combine$1 hatchStatusViewModel$special$$inlined$combine$1 = new HatchStatusViewModel$special$$inlined$combine$1(new C20Q[]{hatchStatusRepository.connectionState, hatchStatusRepository.pendingActions, hatchStatusRepository.upcomingTasks, hatchStatusRepository.simulatedWorkMessage, hatchStatusRepository.modelInfo, hatchStatusRepository.agentActivity, hatchStatusRepository.aiIdentity, hatchStatusRepository.isVmStarting, companion.subscriptionDetailsState, LiveSessions.INSTANCE.statusOverride(abstractC3358CGz, str)}, this);
        this.uiState = AnonymousClass441.A00(new HatchStatusUiState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0), AEu.A00(this), hatchStatusViewModel$special$$inlined$combine$1, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
    }

    private final OutOfCreditsCta outOfCreditsCta(AgentStatusCta agentStatusCta, SubscriptionDetails subscriptionDetails) {
        AuraSubscriptionPage auraSubscriptionPageSubscriptionPageForCtaUrl;
        Boolean boolValueOf;
        String str = null;
        if (agentStatusCta == null || (auraSubscriptionPageSubscriptionPageForCtaUrl = AuraSubscriptionUsageViewModelKt.subscriptionPageForCtaUrl(agentStatusCta.url, BuyCreditsEntrySurface.STATUS_OUT_OF_CREDITS)) == null) {
            return null;
        }
        String str2 = agentStatusCta.label;
        if (subscriptionDetails != null) {
            boolean z = subscriptionDetails.isPaidTier;
            boolValueOf = Boolean.valueOf(z);
            if (z) {
                str = subscriptionDetails.tierCode;
            }
        } else {
            boolValueOf = null;
        }
        return new OutOfCreditsCta(str2, auraSubscriptionPageSubscriptionPageForCtaUrl, boolValueOf, str);
    }

    public final void onActionAccept(String str) {
        C7384Etj.A0Y(str, 0);
        this.repository.acceptAction(str);
    }

    public final void onActionDismiss(String str) {
        C7384Etj.A0Y(str, 0);
        this.repository.dismissAction(str);
    }

    public final void onRemoveUpcomingTask(String str) {
        C7384Etj.A0Y(str, 0);
        this.repository.removeUpcomingTask(str);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchStatusState.values().length];
            try {
                AnonymousClass002.A13(HatchStatusState.READY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchStatusState.RESETTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchStatusState.THINKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchStatusState.TYPING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchStatusState.WORKING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchStatusState.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchStatusState.CONNECTING, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchStatusState.DISCONNECTED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchStatusState.ERROR, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchStatusState.PAUSED, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String deriveBodyText(HatchStatusState hatchStatusState, int i, boolean z, String str, AgentActivityInfo agentActivityInfo) {
        int i2;
        int i3;
        if (str == null && (str = agentActivityInfo.activityText) == null) {
            Application applicationA00 = C4JM.A00();
            switch (hatchStatusState.ordinal()) {
                case 0:
                    i2 = R.string._name_removed__res_0x7f120617;
                    break;
                case 1:
                    i2 = R.string._name_removed__res_0x7f12061c;
                    break;
                case 2:
                    i2 = R.string._name_removed__res_0x7f12061d;
                    break;
                case 3:
                    i2 = R.string._name_removed__res_0x7f12061e;
                    break;
                case 4:
                    i2 = R.string.status_out_of_credits;
                    break;
                case 5:
                    i2 = R.string._name_removed__res_0x7f120613;
                    break;
                case 6:
                    i2 = R.string._name_removed__res_0x7f120614;
                    break;
                case 7:
                    i2 = R.string._name_removed__res_0x7f120615;
                    break;
                case 8:
                    i2 = R.string._name_removed__res_0x7f12061b;
                    break;
                case 9:
                    i2 = R.string._name_removed__res_0x7f120616;
                    break;
                default:
                    throw C3cG.A0q();
            }
            str = applicationA00.getString(i2);
            if (hatchStatusState == HatchStatusState.READY) {
                if (i >= 2) {
                    i3 = R.string._name_removed__res_0x7f120619;
                } else if (i == 1) {
                    i3 = R.string._name_removed__res_0x7f120618;
                } else if (z) {
                    i3 = R.string._name_removed__res_0x7f12061a;
                }
                return FGI.A0M(str, applicationA00.getString(i3));
            }
        }
        return str;
    }

    private final HatchStatusState deriveStatusState(HatchGatewayConnectionState hatchGatewayConnectionState, String str, AgentActivityInfo agentActivityInfo) {
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) {
            return HatchStatusState.DISCONNECTED;
        }
        if ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connecting) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting)) {
            return HatchStatusState.CONNECTING;
        }
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error) {
            return HatchStatusState.ERROR;
        }
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Resetting) {
            return HatchStatusState.RESETTING;
        }
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Paused) {
            return HatchStatusState.PAUSED;
        }
        if (!(hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected)) {
            throw C3cG.A0q();
        }
        AgentActivityStatus agentActivityStatus = agentActivityInfo.status;
        return agentActivityStatus == AgentActivityStatus.OUT_OF_CREDITS ? HatchStatusState.OUT_OF_CREDITS : (str == null && agentActivityStatus == AgentActivityStatus.ONLINE) ? HatchStatusState.READY : HatchStatusState.WORKING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchStatusUiState mapToUiState(HatchGatewayConnectionState hatchGatewayConnectionState, List<HatchAction> list, List<HatchUpcomingTask> list2, String str, HatchModelInfo hatchModelInfo, AgentActivityInfo agentActivityInfo, AiIdentity aiIdentity, boolean z, SubscriptionDetails subscriptionDetails, Integer num) {
        String str2;
        HatchStatusState hatchStatusStateDeriveStatusState = deriveStatusState(hatchGatewayConnectionState, str, agentActivityInfo);
        String strDeriveBodyText = deriveBodyText(hatchStatusStateDeriveStatusState, list.size(), !list2.isEmpty(), str, agentActivityInfo);
        OutOfCreditsCta outOfCreditsCta = outOfCreditsCta(agentActivityInfo.outOfCreditsCta, subscriptionDetails);
        HatchStatusPillUiState hatchStatusPillUiStateWithStatusOverride = HatchStatusPillViewModelKt.withStatusOverride(HatchStatusPillViewModel.Companion.derivePillState(hatchGatewayConnectionState, agentActivityInfo, aiIdentity, true, z), num);
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (HatchAction hatchAction : list) {
            arrayListA0m.add(new HatchActionUiModel(hatchAction.id, buildRichText(hatchAction), true));
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        for (HatchUpcomingTask hatchUpcomingTask : list2) {
            arrayListA0m2.add(new HatchUpcomingTaskUiModel(hatchUpcomingTask.id, hatchUpcomingTask.title, hatchUpcomingTask.time));
        }
        AHD ahdA072 = AGI.A07(arrayListA0m2);
        AHD ahdA073 = AGI.A07(AHI.A01);
        AvatarMedia avatarMedia = null;
        HatchModelInfoUiModel hatchModelInfoUiModel = hatchModelInfo != null ? new HatchModelInfoUiModel(hatchModelInfo.tokensIn, hatchModelInfo.tokensOut, hatchModelInfo.contextUsed, hatchModelInfo.contextTotal, hatchModelInfo.modelName) : null;
        if (aiIdentity != null) {
            str2 = aiIdentity.name;
            avatarMedia = aiIdentity.avatarMedia;
        } else {
            str2 = null;
        }
        return new HatchStatusUiState(hatchStatusStateDeriveStatusState, hatchStatusPillUiStateWithStatusOverride, outOfCreditsCta, strDeriveBodyText, ahdA07, ahdA072, ahdA073, hatchModelInfoUiModel, str2, avatarMedia);
    }

    public final C1BN<HatchStatusUiState> getUiState() {
        return this.uiState;
    }

    @Override // X.AEs
    public void onCleared() {
        this.repository.dispose();
    }

    public final void onRefreshClick() {
        this.repository.checkConnection();
    }

    public final void refreshIdentity() {
        this.repository.refreshIdentity();
    }

    private final ApQ buildRichText(HatchAction hatchAction) {
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        for (TextPart textPart : hatchAction.textParts) {
            if (textPart.bold) {
                C1736ApY c1736ApY = C1736ApY.A01;
                long j = B6A.A07;
                long j2 = C1809ArT.A01;
                int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, j));
                try {
                    c1731ApSA0W.A0E(textPart.text);
                } finally {
                    c1731ApSA0W.A06(iA00);
                }
            } else {
                c1731ApSA0W.A0E(textPart.text);
            }
        }
        return c1731ApSA0W.A04();
    }

    public /* synthetic */ HatchStatusViewModel(AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
        this(abstractC3358CGz, AnonymousClass006.A0s(i, str));
    }
}
