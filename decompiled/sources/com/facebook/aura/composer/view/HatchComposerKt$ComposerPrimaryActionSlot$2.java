package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerPrimaryActionSlot$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $canSend;
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendBlocked;
    public final /* synthetic */ boolean $isSendEnabled;
    public final /* synthetic */ boolean $isUploading;
    public final /* synthetic */ Function0<Unit> $onBlockedSendClick;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ Function0<Unit> $onStopClick;
    public final /* synthetic */ boolean $showStop;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerPrimaryActionSlot$2(boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Function0<Unit> function0, Function0<Unit> function02, boolean z5, String str, HatchComposerEntryPoint hatchComposerEntryPoint, boolean z6, Function0<Unit> function03, int i, int i2, int i3) {
        super(2);
        this.$canSend = z;
        this.$showStop = z2;
        this.$isSendEnabled = z3;
        this.$isSendBlocked = z4;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
        this.$onSendClick = function0;
        this.$onStopClick = function02;
        this.$isPrimaryThread = z5;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$isUploading = z6;
        this.$onBlockedSendClick = function03;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchComposerKt.m432ComposerPrimaryActionSlotm9bfrB0(this.$canSend, this.$showStop, this.$isSendEnabled, this.$isSendBlocked, this.$userMessageBubbleColor, this.$userMessageTextColor, this.$onSendClick, this.$onStopClick, this.$isPrimaryThread, this.$threadId, this.$entryPoint, this.$isUploading, this.$onBlockedSendClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
