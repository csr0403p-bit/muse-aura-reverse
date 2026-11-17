package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailSenderNameFields$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailSenderNameFields$1$3(String str) {
        super(2);
        this.$label = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AnonymousClass006.A17(bfm, this.$label, C06G.A08(bfm));
        } else {
            bfm.Afo();
        }
    }
}
