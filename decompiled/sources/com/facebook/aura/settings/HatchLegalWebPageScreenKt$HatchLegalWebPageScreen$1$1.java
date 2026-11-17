package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C6t6;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.webview.auth.HatchWebSessionProvisioner;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1", f = "HatchLegalWebPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $url;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1(C6t6 c6t6, String str, HtJ<? super HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1> htJ) {
        super(2, htJ);
        this.$webView = c6t6;
        this.$url = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1(this.$webView, this.$url, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchWebSessionProvisioner.INSTANCE.load(this.$webView, this.$url);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
