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
public final class EmailThreadScreenKt$EmailLoadedThread$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $sendingPaused;
    public final /* synthetic */ EmailThreadUiState.Loaded $state;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailLoadedThread$2(EmailThreadUiState.Loaded loaded, String str, boolean z, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$state = loaded;
        this.$environmentId = str;
        this.$sendingPaused = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
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
        EmailThreadScreenKt.m758EmailLoadedThreadnSlTg7c(this.$state, this.$environmentId, this.$sendingPaused, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
