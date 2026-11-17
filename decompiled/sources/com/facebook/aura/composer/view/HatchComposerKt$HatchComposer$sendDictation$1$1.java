package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSendButtonLoggerKt;
import com.facebook.aura.analytics.hatch.HatchSendButtonOrigin;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$HatchComposer$sendDictation$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $attachmentCount;
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onDictationSend;
    public final /* synthetic */ String $originId;
    public final /* synthetic */ String $replyPreview;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$HatchComposer$sendDictation$1$1(WaveformBuffer waveformBuffer, int i, String str, boolean z, String str2, HatchComposerEntryPoint hatchComposerEntryPoint, String str3, Function0<Unit> function0) {
        super(0);
        this.$waveformBuffer = waveformBuffer;
        this.$attachmentCount = i;
        this.$replyPreview = str;
        this.$isPrimaryThread = z;
        this.$threadId = str2;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$originId = str3;
        this.$onDictationSend = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$waveformBuffer.sendRequest.isPending) {
            return;
        }
        HatchSendButtonLoggerKt.logSendButtonClick(this.$attachmentCount, true, AnonymousClass002.A1X(this.$replyPreview), new HatchSendButtonOrigin(this.$isPrimaryThread, this.$threadId, this.$entryPoint, this.$originId), null);
        this.$onDictationSend.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
