package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0981AMm;
import com.facebook.aura.conversation.view.TranscriptRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0981AMm<String, Boolean> $completedSequenceKeys;
    public final /* synthetic */ TranscriptRow $row;
    public final /* synthetic */ boolean $sequenceActive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$2$1(TranscriptRow transcriptRow, boolean z, C0981AMm<String, Boolean> c0981AMm) {
        super(0);
        this.$row = transcriptRow;
        this.$sequenceActive = z;
        this.$completedSequenceKeys = c0981AMm;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchTranscriptRendererKt.HatchTranscriptRendererWithBubbles_Oqtexg8$completeSequenceKey(this.$sequenceActive, this.$completedSequenceKeys, ((TranscriptRow.BareWidgets) this.$row).sequenceKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
