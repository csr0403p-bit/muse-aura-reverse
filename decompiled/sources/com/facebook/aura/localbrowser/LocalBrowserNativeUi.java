package com.facebook.aura.localbrowser;

import X.AnonymousClass006;
import X.BFI;
import X.BV4;
import X.Bs8;
import X.C05826xm;
import X.C06H;
import X.C3cH;
import X.C60N;
import X.C60O;
import X.C6xU;
import X.C6xj;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.HtJ;
import X.HzP;
import X.InterfaceC05836xn;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.hatch.browser.core.BrowserHostNativeControls;
import com.hatch.browser.core.NativeControlDecision;
import com.hatch.browser.protocol.NativeControlKind;
import com.hatch.browser.protocol.NativeControlRequest;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class LocalBrowserNativeUi implements AutoCloseable, BrowserHostNativeControls {
    public static final int $stable = 8;

    @Deprecated
    public static final String BRIDGE = "__hatchNativePicker";
    public static final Companion Companion = new Companion();
    public static final Set<String> KINDS = BFI.A0H(new String[]{"select", "date", "datetime-local", "time", "month", "week", "color"});

    @Deprecated
    public static final String SCRIPT = "\n      (() => {\n        const bridge = window.__hatchNativePicker;\n        delete window.__hatchNativePicker;\n        const types = new Set(['date', 'datetime-local', 'time', 'month', 'week', 'color']);\n        const control = node => node?.tagName === 'LABEL' ? node.control : node;\n        const kind = node => {\n          if (node?.tagName === 'SELECT') return node.matches(':disabled') ? null : 'select';\n          if (node?.tagName === 'INPUT' && types.has(node.type)) return node.matches(':disabled') || node.readOnly ? null : node.type;\n          return null;\n        };\n        const inPage = node => {\n          if (node?.tagName !== 'SELECT') return false;\n          if (node.multiple || node.size > 1) return false;\n          return getComputedStyle(node).appearance === 'base-select' &&\n              getComputedStyle(node, '::picker(select)').appearance === 'base-select';\n        };\n        const focus = HTMLElement.prototype.focus;\n        let focusing = false;\n        const allowed = (node, type) => {\n          const activated = navigator.userActivation?.isActive === true;\n          let allow = false;\n          try { allow = bridge.allow(type, activated); } catch {}\n          if (!allow && type !== 'color' && activated && !focusing && node.isConnected && node.getRootNode().activeElement !== node) {\n            focusing = true;\n            try { Reflect.apply(focus, node, [{preventScroll:true}]); } catch {}\n            finally { focusing = false; }\n          }\n          return allow;\n        };\n        const handled = new WeakSet();\n        const guard = event => {\n          if (handled.has(event)) return;\n          for (const item of event.composedPath()) {\n            const node = control(item);\n            const type = kind(node);\n            if (!type) continue;\n            handled.add(event);\n            if (inPage(node)) return;\n            if (event.type === 'keydown' &&\n                (['Tab', 'Escape', 'Shift', 'Control', 'Alt', 'Meta'].includes(event.key) ||\n                 type === 'select' && !['Enter', ' ', 'F4'].includes(event.key) &&\n                 !(event.altKey && ['ArrowDown', 'ArrowUp'].includes(event.key)))) return;\n            if (!allowed(node, type)) {\n              event.preventDefault();\n              event.stopImmediatePropagation();\n            }\n            return;\n          }\n        };\n        const install = root => {\n          for (const name of ['pointerdown', 'pointerup', 'mousedown', 'mouseup', 'touchstart', 'touchend', 'click', 'keydown']) {\n            root.addEventListener(name, guard, {capture: true, passive: false});\n          }\n        };\n        install(window);\n        const attachShadow = Element.prototype.attachShadow;\n        Element.prototype.attachShadow = function(options) {\n          const root = Reflect.apply(attachShadow, this, [options]);\n          install(root);\n          return root;\n        };\n        const click = HTMLElement.prototype.click;\n        HTMLElement.prototype.click = function(...args) {\n          const node = control(this);\n          const type = kind(node);\n          if (type && !inPage(node) && !allowed(node, type)) return;\n          return Reflect.apply(click, this, args);\n        };\n        for (const prototype of [HTMLSelectElement.prototype, HTMLInputElement.prototype]) {\n          const original = prototype.showPicker;\n          if (typeof original !== 'function') continue;\n          prototype.showPicker = function(...args) {\n            const type = kind(this);\n            if (type && !inPage(this) && !allowed(this, type)) {\n              throw new DOMException('Native picker blocked while automation is active.', 'NotAllowedError');\n            }\n            return Reflect.apply(original, this, args);\n          };\n        }\n      })();\n    ";
    public int activeCommands;
    public final AtomicReference<String> blocked;
    public volatile boolean closed;
    public final Handler handler;
    public G0U<? super String, Unit> onRequired;
    public final AtomicReference<String> pending;
    public final InterfaceC05836xn script;
    public volatile boolean userHost;
    public final LocalBrowserWebView view;

    public final class Bridge {
        @JavascriptInterface
        public final boolean allow(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            if (LocalBrowserNativeUi.this.closed || !LocalBrowserNativeUi.KINDS.contains(str)) {
                return false;
            }
            if (LocalBrowserNativeUi.this.userHost) {
                return true;
            }
            if (!z) {
                return false;
            }
            boolean zEquals = str.equals("color");
            LocalBrowserNativeUi localBrowserNativeUi = LocalBrowserNativeUi.this;
            if (zEquals) {
                localBrowserNativeUi.requireUser(str);
                return false;
            }
            Bs8.A00(null, str, localBrowserNativeUi.blocked);
            return false;
        }

        public Bridge() {
        }
    }

    public final class Companion {
        public final Set<String> getKINDS() {
            return LocalBrowserNativeUi.KINDS;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNativeUi", f = "LocalBrowserNativeUi.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "duringCommand", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNativeUi$duringCommand$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNativeUi.this.duringCommand(null, this);
        }
    }

    public LocalBrowserNativeUi(LocalBrowserWebView localBrowserWebView) {
        C7384Etj.A0Y(localBrowserWebView, 0);
        this.view = localBrowserWebView;
        this.handler = C60O.A02();
        this.pending = BV4.A16(null);
        this.blocked = BV4.A16(null);
        this.onRequired = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserNativeUi$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        };
        if (!C6xU.A00(C60N.A00(44))) {
            throw C60O.A0i("Native picker guard requires document-start scripts");
        }
        installBridge();
        this.script = C6xj.A01(localBrowserWebView, SCRIPT, Collections.singleton("*"));
    }

    public final void setOnRequired(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onRequired = g0u;
    }

    private final void installBridge() {
        this.view.addJavascriptInterface(new Bridge(), BRIDGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireUser(String str) {
        if (this.closed || !Bs8.A00(null, str, this.pending)) {
            return;
        }
        this.handler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserNativeUi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.dispatchPending();
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.userHost = false;
        this.onRequired = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserNativeUi$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        };
        this.handler.removeCallbacksAndMessages(null);
        try {
            ((C05826xm) this.script).A00.remove();
        } finally {
            this.view.removeJavascriptInterface(BRIDGE);
        }
    }

    public final void dispatchPending() {
        String str;
        if (this.closed || this.activeCommands != 0 || (str = this.pending.get()) == null) {
            return;
        }
        this.onRequired.invoke(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object duringCommand(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r6, X.HtJ<? super T> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.localbrowser.LocalBrowserNativeUi.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.localbrowser.LocalBrowserNativeUi$duringCommand$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserNativeUi.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.localbrowser.LocalBrowserNativeUi$duringCommand$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserNativeUi$duringCommand$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L52
            goto L48
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            boolean r0 = X.C3cH.A1K()
            if (r0 == 0) goto L5d
            int r0 = r5.activeCommands
            int r0 = r0 + 1
            r5.activeCommands = r0
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L52
            r4.label = r1     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L52
            if (r3 != r2) goto L48
            return r2
        L48:
            int r0 = r5.activeCommands
            int r0 = r0 + (-1)
            r5.activeCommands = r0
            r5.dispatchPending()
            return r3
        L52:
            r1 = move-exception
            int r0 = r5.activeCommands
            int r0 = r0 + (-1)
            r5.activeCommands = r0
            r5.dispatchPending()
            throw r1
        L5d:
            java.lang.IllegalStateException r0 = X.BV4.A0S()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNativeUi.duringCommand(X.G0U, X.HtJ):java.lang.Object");
    }

    public final G0U<String, Unit> getOnRequired() {
        return this.onRequired;
    }

    public final boolean getUserHost() {
        return this.userHost;
    }

    public final void reset() {
        this.pending.set(null);
        this.blocked.set(null);
    }

    public final void setUserHost(boolean z) {
        this.userHost = z;
    }

    public final String takeBlocked() {
        return (String) C8j3.A10(this.blocked);
    }

    @Override // com.hatch.browser.core.BrowserHostNativeControls
    public Object allow(NativeControlRequest nativeControlRequest, HtJ<? super NativeControlDecision> htJ) {
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        if (!this.closed && !this.userHost) {
            NativeControlKind nativeControlKind = nativeControlRequest.kind;
            if (nativeControlKind == NativeControlKind.UNKNOWN || nativeControlKind == NativeControlKind.COLOR) {
                requireUser(AnonymousClass006.A0x(nativeControlKind));
            } else {
                Bs8.A00(null, AnonymousClass006.A0x(nativeControlKind), this.blocked);
            }
        }
        return new NativeControlDecision(false);
    }

    public final void requireFileSelection() {
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        if (this.closed || this.userHost) {
            return;
        }
        requireUser("file");
    }
}
