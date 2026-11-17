package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.AbstractC8508FfF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C8497Ff4;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FocusedInputReveal {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String REVEAL_FOCUSED_INPUT = "\n      (() => {\n        let element = document.activeElement;\n        while (element?.tagName === 'IFRAME') {\n          element.scrollIntoView({block: 'nearest', inline: 'nearest'});\n          try { element = element.contentDocument?.activeElement; } catch { return; }\n        }\n        if (!element || !(element.matches('input, textarea') || element.isContentEditable)) return;\n        element.scrollIntoView({block: 'nearest', inline: 'nearest'});\n        const viewportHeight = element.ownerDocument.defaultView?.innerHeight;\n        const rect = element.getBoundingClientRect();\n        if (!viewportHeight || rect.height >= viewportHeight) return;\n        const y = rect.top + rect.height / 2;\n        const hit = y >= 0 && y < viewportHeight\n            ? element.ownerDocument.elementFromPoint(rect.left + rect.width / 2, y)\n            : null;\n        if (!hit || !element.contains(hit)) {\n          element.scrollIntoView({block: 'center', inline: 'nearest'});\n        }\n      })();\n    ";
    public final Function0<Boolean> acceptsUserInput;
    public final Runnable reveal;
    public final WebView webView;

    /* renamed from: com.facebook.aura.webview.FocusedInputReveal$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyboardEditing() {
        C8497Ff4 c8497Ff4A00;
        return AnonymousClass003.A1Y(this.acceptsUserInput) && this.webView.hasFocus() && (c8497Ff4A00 = AbstractC8508FfF.A00(this.webView)) != null && c8497Ff4A00.A00.A0C(8);
    }

    public final void onDetachedFromWindow() {
        this.webView.removeCallbacks(this.reveal);
    }

    public final void onSizeChanged(int i, int i2) {
        if (i >= i2 || !isKeyboardEditing()) {
            return;
        }
        this.webView.removeCallbacks(this.reveal);
        this.webView.postOnAnimation(this.reveal);
    }

    public FocusedInputReveal(WebView webView, Function0<Boolean> function0) {
        AnonymousClass003.A0u(webView, function0);
        this.webView = webView;
        this.acceptsUserInput = function0;
        this.reveal = new Runnable() { // from class: com.facebook.aura.webview.FocusedInputReveal$reveal$1
            @Override // java.lang.Runnable
            public final void run() {
                if (this.this$0.isKeyboardEditing()) {
                    this.this$0.webView.evaluateJavascript(FocusedInputReveal.REVEAL_FOCUSED_INPUT, null);
                }
            }
        };
    }

    public /* synthetic */ FocusedInputReveal(WebView webView, Function0 function0, int i, C06H c06h) {
        this(webView, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
