package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C1BO;
import X.C7384Etj;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;

/* loaded from: classes.dex */
public final class ConversationAudioPlayback {
    public static final int $stable = 0;
    public final C1BO<String> dismissedSourceId;
    public final C1BO<Boolean> isSourceVisible;
    public final C1BO<HatchAudioPlaybackState> playbackState;
    public final HatchAudioPlayerRepository repository;
    public final ChatAudioPlaybackViewModel viewModel;

    public final HatchAudioPlayerRepository getRepository() {
        return this.repository;
    }

    public final boolean getShowMiniPlayer() {
        HatchAudioPlaybackState value = this.playbackState.getValue();
        return (value == null || value.item.sourceMessageId == null || C1BO.A0F(this.isSourceVisible) || C7384Etj.areEqual(value.item.sourceMessageId, this.dismissedSourceId.getValue())) ? false : true;
    }

    public final HatchAudioPlaybackState getState() {
        return this.playbackState.getValue();
    }

    public final ChatAudioPlaybackViewModel getViewModel() {
        return this.viewModel;
    }

    public ConversationAudioPlayback(HatchAudioPlayerRepository hatchAudioPlayerRepository, ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, C1BO<HatchAudioPlaybackState> c1bo, C1BO<String> c1bo2, C1BO<Boolean> c1bo3) {
        AnonymousClass005.A17(hatchAudioPlayerRepository, chatAudioPlaybackViewModel, c1bo, c1bo2, c1bo3);
        this.repository = hatchAudioPlayerRepository;
        this.viewModel = chatAudioPlaybackViewModel;
        this.playbackState = c1bo;
        this.dismissedSourceId = c1bo2;
        this.isSourceVisible = c1bo3;
    }
}
