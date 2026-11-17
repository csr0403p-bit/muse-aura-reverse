package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass005;
import X.C06H;
import X.C1DM;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinatorKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceOptionsWidgetState {
    public final boolean acceptsSelection;
    public final String confirmedVoiceId;
    public final long containerBackgroundColor;
    public final C1DM containerShape;
    public final VoiceOptionsWidgetData data;
    public final String hostMessageId;
    public final G0U<String, Unit> onSendSwitchVoiceMessage;
    public final VoiceControlsViewModel.WidgetUiState uiState;
    public final VoiceControlsViewModel viewModel;
    public final HatchWidget widget;
    public final WidgetStateMutationHost widgetStateMutationHost;

    public final boolean getAcceptsSelection() {
        return this.acceptsSelection;
    }

    public final String getConfirmedVoiceId() {
        return this.confirmedVoiceId;
    }

    /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1780getContainerBackgroundColor0d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1DM getContainerShape() {
        return this.containerShape;
    }

    public final VoiceOptionsWidgetData getData() {
        return this.data;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final VoiceControlsViewModel.UiState.Loaded getLoaded() {
        return this.uiState.loaded;
    }

    public final G0U<String, Unit> getOnSendSwitchVoiceMessage() {
        return this.onSendSwitchVoiceMessage;
    }

    public final boolean getPickedFromBrowseAll() {
        return this.confirmedVoiceId != null && VoiceWidgetSelectionCoordinatorKt.voiceWidgetPickedFromBrowseAll(this.widget.state);
    }

    public final boolean getShowsBrowseAll() {
        return this.data.browseAll && this.widgetStateMutationHost != null;
    }

    public final boolean getShowsChooseButton() {
        return this.data.switchVoice && this.acceptsSelection && this.widgetStateMutationHost != null;
    }

    public final VoiceControlsViewModel.WidgetUiState getUiState() {
        return this.uiState;
    }

    public final VoiceControlsViewModel getViewModel() {
        return this.viewModel;
    }

    public final HatchWidget getWidget() {
        return this.widget;
    }

    public final WidgetStateMutationHost getWidgetStateMutationHost() {
        return this.widgetStateMutationHost;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceOptionsWidgetState(HatchWidget hatchWidget, VoiceOptionsWidgetData voiceOptionsWidgetData, VoiceControlsViewModel voiceControlsViewModel, VoiceControlsViewModel.WidgetUiState widgetUiState, String str, boolean z, String str2, WidgetStateMutationHost widgetStateMutationHost, long j, C1DM c1dm, G0U<? super String, Unit> g0u) {
        AnonymousClass005.A14(hatchWidget, voiceOptionsWidgetData, voiceControlsViewModel, widgetUiState);
        C7384Etj.A0Y(str2, 6);
        C3cH.A18(c1dm, g0u);
        this.widget = hatchWidget;
        this.data = voiceOptionsWidgetData;
        this.viewModel = voiceControlsViewModel;
        this.uiState = widgetUiState;
        this.confirmedVoiceId = str;
        this.acceptsSelection = z;
        this.hostMessageId = str2;
        this.widgetStateMutationHost = widgetStateMutationHost;
        this.containerBackgroundColor = j;
        this.containerShape = c1dm;
        this.onSendSwitchVoiceMessage = g0u;
    }

    public /* synthetic */ VoiceOptionsWidgetState(HatchWidget hatchWidget, VoiceOptionsWidgetData voiceOptionsWidgetData, VoiceControlsViewModel voiceControlsViewModel, VoiceControlsViewModel.WidgetUiState widgetUiState, String str, boolean z, String str2, WidgetStateMutationHost widgetStateMutationHost, long j, C1DM c1dm, G0U g0u, C06H c06h) {
        this(hatchWidget, voiceOptionsWidgetData, voiceControlsViewModel, widgetUiState, str, z, str2, widgetStateMutationHost, j, c1dm, g0u);
    }
}
