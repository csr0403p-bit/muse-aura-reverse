package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1518AkS;
import X.C1C3;
import X.C78g;
import X.G0U;
import X.Hwg;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $autoFocus;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $hideKeyboardOnComplete;
    public final /* synthetic */ boolean $isComplete;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C1C3 $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$2$1(boolean z, boolean z2, boolean z3, C1C3 c1c3, boolean z4, boolean z5, C1518AkS c1518AkS) {
        super(1);
        this.$isComplete = z;
        this.$isError = z2;
        this.$hideKeyboardOnComplete = z3;
        this.$keyboardController = c1c3;
        this.$autoFocus = z4;
        this.$enabled = z5;
        this.$focusRequester = c1518AkS;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1C3 c1c3;
        if (!this.$isComplete || this.$isError) {
            if (this.$autoFocus && this.$enabled) {
                try {
                    C1518AkS.A00(this.$focusRequester);
                } catch (Throwable th) {
                    Hwg.A01(th);
                }
                C1C3 c1c32 = this.$keyboardController;
                if (c1c32 != null) {
                    c1c32.Afd();
                }
            }
        } else if (this.$hideKeyboardOnComplete && (c1c3 = this.$keyboardController) != null) {
            c1c3.hide();
        }
        return new C78g() { // from class: com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
