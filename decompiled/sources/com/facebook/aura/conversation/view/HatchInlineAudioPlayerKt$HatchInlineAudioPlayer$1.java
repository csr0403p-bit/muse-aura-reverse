package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $artist;
    public final /* synthetic */ String $artworkUrl;
    public final /* synthetic */ String $audioType;
    public final /* synthetic */ String $audioUrl;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $sourceMessageId;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$1(String str, String str2, String str3, String str4, String str5, String str6, String str7, BRg bRg, long j, C1D3 c1d3, int i, int i2) {
        super(2);
        this.$audioUrl = str;
        this.$fileName = str2;
        this.$title = str3;
        this.$artist = str4;
        this.$artworkUrl = str5;
        this.$sourceMessageId = str6;
        this.$audioType = str7;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInlineAudioPlayerKt.m624HatchInlineAudioPlayerFItCLgY(this.$audioUrl, this.$fileName, this.$title, this.$artist, this.$artworkUrl, this.$sourceMessageId, this.$audioType, this.$modifier, this.$backgroundColor, this.$containerShape, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
