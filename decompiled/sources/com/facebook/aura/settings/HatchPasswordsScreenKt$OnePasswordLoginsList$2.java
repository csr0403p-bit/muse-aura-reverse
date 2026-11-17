package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$OnePasswordLoginsList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ List<CredentialCandidate> $logins;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPasswordsScreenKt$OnePasswordLoginsList$2(List<CredentialCandidate> list, float f, float f2, G0U<? super CredentialCandidate, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$logins = list;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onCredentialClick = g0u;
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
        HatchPasswordsScreenKt.m1957OnePasswordLoginsListo3XDK20(this.$logins, this.$topPadding, this.$bottomPadding, this.$onCredentialClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
