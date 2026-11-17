package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.audio.HatchAudioItem;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$HatchCompactAudioPlayer$onTogglePlay$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $artist;
    public final /* synthetic */ String $artworkUrl;
    public final /* synthetic */ String $audioType;
    public final /* synthetic */ String $audioUrl;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ ChatAudioPlaybackViewModel $playbackViewModel;
    public final /* synthetic */ String $resolvedTitle;
    public final /* synthetic */ String $sourceMessageId;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCompactAudioPlayerKt$HatchCompactAudioPlayer$onTogglePlay$1$1(boolean z, String str, Map<String, String> map, ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(0);
        this.$isPlaying = z;
        this.$audioType = str;
        this.$threadLogMetadata = map;
        this.$playbackViewModel = chatAudioPlaybackViewModel;
        this.$audioUrl = str2;
        this.$fileName = str3;
        this.$resolvedTitle = str4;
        this.$artist = str5;
        this.$artworkUrl = str6;
        this.$sourceMessageId = str7;
        this.$sourceSessionId = str8;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCompactAudioPlayerKt.logAudioPlayPauseClick(this.$isPlaying, this.$audioType, this.$threadLogMetadata);
        ChatAudioPlaybackViewModel chatAudioPlaybackViewModel = this.$playbackViewModel;
        String str = this.$audioUrl;
        chatAudioPlaybackViewModel.onTogglePlay(new HatchAudioItem(str, str, this.$fileName, this.$resolvedTitle, this.$artist, this.$artworkUrl, null, this.$sourceMessageId, this.$sourceSessionId, this.$audioType));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
