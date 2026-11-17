package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.C06G;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginTextField$placeholder$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ long $placeholderColor;
    public final /* synthetic */ String $placeholderText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginTextField$placeholder$1(String str, long j) {
        super(2);
        this.$placeholderText = str;
        this.$placeholderColor = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AnonymousClass007.A10(bfm, C06G.A0T(bfm), this.$placeholderText, this.$placeholderColor);
        } else {
            bfm.Afo();
        }
    }
}
