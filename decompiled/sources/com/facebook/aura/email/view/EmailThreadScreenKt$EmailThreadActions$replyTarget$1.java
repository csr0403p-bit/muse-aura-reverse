package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailThreadUiState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadActions$replyTarget$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $sendingPaused;
    public final /* synthetic */ EmailThreadUiState.Loaded $threadState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadActions$replyTarget$1(EmailThreadUiState.Loaded loaded, boolean z, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$threadState = loaded;
        this.$sendingPaused = z;
        this.$bottomPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailThreadScreenKt.m759EmailThreadActions942rkJo(this.$threadState, this.$sendingPaused, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
