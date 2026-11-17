package com.facebook.aura.audio.viewmodel;

import X.AEs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import com.facebook.aura.audio.AudioStatus;
import com.facebook.aura.audio.HatchAudioItem;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChatAudioPlaybackViewModel extends AEs {
    public final BLG<ChatAudioPlaybackUiState> _uiState;
    public Function0<Unit> pendingStart;
    public final HatchAudioPlayerRepository player;
    public final C1BN<ChatAudioPlaybackUiState> uiState;

    public final class Factory extends AuraViewModelFactory<ChatAudioPlaybackViewModel> {
        public final HatchAudioPlayerRepository player;

        public Factory(HatchAudioPlayerRepository hatchAudioPlayerRepository) {
            C7384Etj.A0Y(hatchAudioPlayerRepository, 0);
            this.player = hatchAudioPlayerRepository;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ChatAudioPlaybackViewModel(this.player);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ChatAudioPlaybackViewModel create() {
            return new ChatAudioPlaybackViewModel(this.player);
        }
    }

    /* renamed from: com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel$onMiniPlayerToggle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAudioPlaybackViewModel.this.player.resume();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel$onTogglePlay$1, reason: invalid class name and case insensitive filesystem */
    public final class C109751 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchAudioItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109751(HatchAudioItem hatchAudioItem) {
            super(0);
            this.$item = hatchAudioItem;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAudioPlaybackViewModel.this.player.play(this.$item);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel$onTogglePlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAudioPlaybackViewModel.this.player.resume();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ChatAudioPlaybackViewModel(HatchAudioPlayerRepository hatchAudioPlayerRepository) {
        C7384Etj.A0Y(hatchAudioPlayerRepository, 0);
        this.player = hatchAudioPlayerRepository;
        C9286GCn c9286GCn = new C9286GCn(new ChatAudioPlaybackUiState(false));
        this._uiState = c9286GCn;
        this.uiState = C3Pi.A00(c9286GCn);
    }

    private final void clearPendingStart() {
        this.pendingStart = null;
        AnonymousClass001.A1E(this._uiState, null, new ChatAudioPlaybackUiState(false));
    }

    public final void onTogglePlay(HatchAudioItem hatchAudioItem) {
        Function0<Unit> c109751;
        String str;
        C7384Etj.A0Y(hatchAudioItem, 0);
        HatchAudioPlaybackState value = this.player.playbackState.getValue();
        if (value != null && C7384Etj.areEqual(value.item.url, hatchAudioItem.url) && ((str = hatchAudioItem.sourceMessageId) == null || str.equals(value.item.sourceMessageId))) {
            int iOrdinal = value.status.ordinal();
            if (iOrdinal == 1) {
                this.player.pause();
                return;
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal != 0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                c109751 = new AnonymousClass2();
            }
        } else {
            c109751 = new C109751(hatchAudioItem);
        }
        requestStart(c109751);
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioStatus.values().length];
            try {
                AnonymousClass002.A13(AudioStatus.PLAYING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AudioStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AudioStatus.LOADING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void requestStart(Function0<Unit> function0) {
        if (this.player.isLiveSessionActive()) {
            this.pendingStart = function0;
            AnonymousClass002.A1I(this._uiState, new ChatAudioPlaybackUiState(true));
        } else {
            this.player.cancelLiveSessionTakeover();
            function0.invoke();
        }
    }

    public final C1BN<ChatAudioPlaybackUiState> getUiState() {
        return this.uiState;
    }

    public final void onConfirmEndCall() {
        Function0<Unit> function0 = this.pendingStart;
        if (function0 != null) {
            clearPendingStart();
            this.player.endLiveSessionThenPlay(function0);
        }
    }

    public final void onMiniPlayerToggle() {
        AudioStatus audioStatus;
        int iOrdinal;
        HatchAudioPlaybackState value = this.player.playbackState.getValue();
        if (value == null || (audioStatus = value.status) == null || (iOrdinal = audioStatus.ordinal()) == -1) {
            return;
        }
        if (iOrdinal == 1) {
            this.player.pause();
        } else if (iOrdinal == 2) {
            requestStart(new AnonymousClass1());
        } else if (iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onCancelEndCall() {
        clearPendingStart();
    }
}
