package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ResetConfirmSheetKt$ResetConfirmSheet$2$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $confirmWord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetConfirmSheetKt$ResetConfirmSheet$2$1$3(String str) {
        super(2);
        this.$confirmWord = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraTextInputDefaults.INSTANCE.m2587PlaceholderTextqdpcsU(this.$confirmWord, 5, null, bfm, 3072, 4);
        } else {
            bfm.Afo();
        }
    }
}
