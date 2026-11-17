package com.facebook.aura.settings.importmemory;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$ImportMemoryScrollableContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ ChatUploadError $chatUploadError;
    public final /* synthetic */ ChatUploadState $chatUploadState;
    public final /* synthetic */ boolean $isSending;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onAddChats;
    public final /* synthetic */ Function0<Unit> $onAddMemory;
    public final /* synthetic */ G0U<String, Unit> $onPastedTextChanged;
    public final /* synthetic */ Function0<Unit> $onSummarizeChats;
    public final /* synthetic */ String $pastedText;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImportMemoryToHatchScreenKt$ImportMemoryScrollableContent$2(String str, G0U<? super String, Unit> g0u, ChatUploadState chatUploadState, ChatUploadError chatUploadError, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$pastedText = str;
        this.$onPastedTextChanged = g0u;
        this.$chatUploadState = chatUploadState;
        this.$chatUploadError = chatUploadError;
        this.$isSending = z;
        this.$onAddMemory = function0;
        this.$onAddChats = function02;
        this.$onSummarizeChats = function03;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
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
        HatchImportMemoryToHatchScreenKt.m1976ImportMemoryScrollableContentLJWHXA8(this.$pastedText, this.$onPastedTextChanged, this.$chatUploadState, this.$chatUploadError, this.$isSending, this.$onAddMemory, this.$onAddChats, this.$onSummarizeChats, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
