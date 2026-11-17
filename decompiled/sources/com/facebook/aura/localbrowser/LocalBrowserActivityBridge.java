package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.C05826xm;
import X.C06H;
import X.C60Q;
import X.C6xU;
import X.C6xj;
import X.C6yA;
import X.C6yG;
import X.C6yP;
import X.InterfaceC05836xn;
import android.net.Uri;
import android.webkit.WebView;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class LocalBrowserActivityBridge implements AutoCloseable {
    public static final int $stable = 8;

    @Deprecated
    public static final String BRIDGE = "__hatchTakeoverActivity";
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String IDLE = "idle";

    @Deprecated
    public static final int MAX_MESSAGE_CHARS = 8192;

    @Deprecated
    public static final int MAX_SUBFRAMES = 31;

    @Deprecated
    public static final String RECORDING = "recording";

    @Deprecated
    public static final String SCRIPT = "\n      (() => {\n        const bridge = window.__hatchTakeoverActivity;\n        if (!bridge) return;\n        try { delete window.__hatchTakeoverActivity; } catch {}\n        const stringify = JSON.stringify;\n        const clip = (value) => String(value ?? '').replace(/\\s+/g, ' ').trim().slice(0, 500);\n        const attribute = (element, name) => element.getAttribute(name) ?? '';\n        const firstOf = (...values) => clip(values.find((value) => clip(value)));\n        const labelledBy = (element) => attribute(element, 'aria-labelledby').split(/\\s+/)\n          .map((id) => document.getElementById(id)?.innerText ?? '').join(' ');\n        const nameOf = (control) => firstOf(attribute(control, 'aria-label'), labelledBy(control), control.innerText,\n          control.value, attribute(control, 'title'), control.querySelector('img[alt]')?.alt);\n        const labelOf = (field) => firstOf(attribute(field, 'aria-label'), labelledBy(field), field.labels?.[0]?.innerText,\n          attribute(field, 'placeholder'), attribute(field, 'title'), field.name, field.id);\n        const controls = 'a[href],button,summary,input[type=button],input[type=submit],input[type=reset],input[type=image],'\n          + '[role=button],[role=link],[role=tab],[role=menuitem],[role=menuitemcheckbox],[role=menuitemradio],'\n          + '[role=option],[role=switch],[role=checkbox],[role=radio]';\n        const roleOf = (control) => attribute(control, 'role').split(/\\s+/)[0] || (control.localName === 'a' ? 'link' : 'button');\n        const wasPassword = new WeakSet();\n        const isProtected = (field) => field.type === 'password' || wasPassword.has(field)\n          || /password|one-time-code|(^|\\s)cc-/i.test(attribute(field, 'autocomplete'));\n        const valueOf = (field) => {\n          if (field instanceof HTMLSelectElement) return [...field.selectedOptions].map((option) => option.label).join(', ');\n          if (field.type === 'checkbox' || field.type === 'radio') return field.checked ? 'checked' : 'unchecked';\n          return field.value;\n        };\n        let state = 'pending';\n        let held = [];\n        const post = (message) => { try { bridge.postMessage(stringify(message)); } catch {} };\n        const settle = (next) => {\n          state = next;\n          const pending = held;\n          held = [];\n          if (next === 'recording') pending.forEach(post);\n        };\n        bridge.onmessage = (event) => settle(event.data === 'recording' ? 'recording' : 'idle');\n        setTimeout(() => { if (state === 'pending') settle('idle'); }, 1000);\n        const report = (build) => {\n          if (state === 'idle') return;\n          const message = build();\n          if (!message) return;\n          if (state === 'recording') post(message);\n          else if (held.length < 50) held.push(message);\n        };\n        const options = { capture: true, passive: true };\n        const notePassword = (event) => {\n          const field = event.composedPath()[0];\n          if (field instanceof HTMLInputElement && field.type === 'password') wasPassword.add(field);\n        };\n        for (const name of ['pointerdown', 'focusin', 'input']) addEventListener(name, notePassword, options);\n        addEventListener('click', (event) => report(() => {\n          const target = event.composedPath()[0];\n          const control = event.isTrusted && target instanceof Element ? target.closest(controls) : null;\n          return control ? { type: 'activity', kind: 'clicked', role: roleOf(control), name: nameOf(control) } : null;\n        }), options);\n        addEventListener('change', (event) => report(() => {\n          const field = event.composedPath()[0];\n          const isField = field instanceof HTMLInputElement || field instanceof HTMLTextAreaElement\n            || field instanceof HTMLSelectElement;\n          if (!event.isTrusted || !isField || field.type === 'file') return null;\n          return isProtected(field)\n            ? { type: 'activity', kind: 'field_changed', label: labelOf(field), filled: true }\n            : { type: 'activity', kind: 'field_changed', label: labelOf(field), text: clip(valueOf(field)) };\n        }), options);\n        addEventListener('submit', (event) => report(() => {\n          const form = event.target;\n          if (!event.isTrusted || !(form instanceof HTMLFormElement)) return null;\n          const name = firstOf(event.submitter && nameOf(event.submitter), attribute(form, 'aria-label'),\n            attribute(form, 'name'), form.id);\n          return { type: 'activity', kind: 'form_submitted', name };\n        }), options);\n        post({ type: 'hello' });\n      })();\n    ";
    public boolean closed;
    public final boolean isInstalled;
    public C6yA mainFrame;
    public InterfaceC05836xn script;
    public LocalBrowserActivitySink sink;
    public final LinkedHashSet<C6yA> subframes;
    public final WebView view;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalBrowserActivityBridge(android.webkit.WebView r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            r4.<init>()
            r4.view = r5
            java.util.LinkedHashSet r0 = X.C3cG.A0k()
            r4.subframes = r0
            java.lang.String r0 = "WEB_MESSAGE_LISTENER"
            boolean r0 = X.C6xU.A00(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "DOCUMENT_START_SCRIPT"
            boolean r1 = X.C6xU.A00(r0)
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r4.isInstalled = r0
            if (r0 == 0) goto L41
            java.lang.String r3 = "*"
            java.util.Set r2 = java.util.Collections.singleton(r3)
            com.facebook.aura.localbrowser.LocalBrowserActivityBridge$$ExternalSyntheticLambda0 r1 = new com.facebook.aura.localbrowser.LocalBrowserActivityBridge$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.String r0 = "__hatchTakeoverActivity"
            X.C6xj.A03(r5, r1, r0, r2)
            java.lang.String r1 = "\n      (() => {\n        const bridge = window.__hatchTakeoverActivity;\n        if (!bridge) return;\n        try { delete window.__hatchTakeoverActivity; } catch {}\n        const stringify = JSON.stringify;\n        const clip = (value) => String(value ?? '').replace(/\\s+/g, ' ').trim().slice(0, 500);\n        const attribute = (element, name) => element.getAttribute(name) ?? '';\n        const firstOf = (...values) => clip(values.find((value) => clip(value)));\n        const labelledBy = (element) => attribute(element, 'aria-labelledby').split(/\\s+/)\n          .map((id) => document.getElementById(id)?.innerText ?? '').join(' ');\n        const nameOf = (control) => firstOf(attribute(control, 'aria-label'), labelledBy(control), control.innerText,\n          control.value, attribute(control, 'title'), control.querySelector('img[alt]')?.alt);\n        const labelOf = (field) => firstOf(attribute(field, 'aria-label'), labelledBy(field), field.labels?.[0]?.innerText,\n          attribute(field, 'placeholder'), attribute(field, 'title'), field.name, field.id);\n        const controls = 'a[href],button,summary,input[type=button],input[type=submit],input[type=reset],input[type=image],'\n          + '[role=button],[role=link],[role=tab],[role=menuitem],[role=menuitemcheckbox],[role=menuitemradio],'\n          + '[role=option],[role=switch],[role=checkbox],[role=radio]';\n        const roleOf = (control) => attribute(control, 'role').split(/\\s+/)[0] || (control.localName === 'a' ? 'link' : 'button');\n        const wasPassword = new WeakSet();\n        const isProtected = (field) => field.type === 'password' || wasPassword.has(field)\n          || /password|one-time-code|(^|\\s)cc-/i.test(attribute(field, 'autocomplete'));\n        const valueOf = (field) => {\n          if (field instanceof HTMLSelectElement) return [...field.selectedOptions].map((option) => option.label).join(', ');\n          if (field.type === 'checkbox' || field.type === 'radio') return field.checked ? 'checked' : 'unchecked';\n          return field.value;\n        };\n        let state = 'pending';\n        let held = [];\n        const post = (message) => { try { bridge.postMessage(stringify(message)); } catch {} };\n        const settle = (next) => {\n          state = next;\n          const pending = held;\n          held = [];\n          if (next === 'recording') pending.forEach(post);\n        };\n        bridge.onmessage = (event) => settle(event.data === 'recording' ? 'recording' : 'idle');\n        setTimeout(() => { if (state === 'pending') settle('idle'); }, 1000);\n        const report = (build) => {\n          if (state === 'idle') return;\n          const message = build();\n          if (!message) return;\n          if (state === 'recording') post(message);\n          else if (held.length < 50) held.push(message);\n        };\n        const options = { capture: true, passive: true };\n        const notePassword = (event) => {\n          const field = event.composedPath()[0];\n          if (field instanceof HTMLInputElement && field.type === 'password') wasPassword.add(field);\n        };\n        for (const name of ['pointerdown', 'focusin', 'input']) addEventListener(name, notePassword, options);\n        addEventListener('click', (event) => report(() => {\n          const target = event.composedPath()[0];\n          const control = event.isTrusted && target instanceof Element ? target.closest(controls) : null;\n          return control ? { type: 'activity', kind: 'clicked', role: roleOf(control), name: nameOf(control) } : null;\n        }), options);\n        addEventListener('change', (event) => report(() => {\n          const field = event.composedPath()[0];\n          const isField = field instanceof HTMLInputElement || field instanceof HTMLTextAreaElement\n            || field instanceof HTMLSelectElement;\n          if (!event.isTrusted || !isField || field.type === 'file') return null;\n          return isProtected(field)\n            ? { type: 'activity', kind: 'field_changed', label: labelOf(field), filled: true }\n            : { type: 'activity', kind: 'field_changed', label: labelOf(field), text: clip(valueOf(field)) };\n        }), options);\n        addEventListener('submit', (event) => report(() => {\n          const form = event.target;\n          if (!event.isTrusted || !(form instanceof HTMLFormElement)) return null;\n          const name = firstOf(event.submitter && nameOf(event.submitter), attribute(form, 'aria-label'),\n            attribute(form, 'name'), form.id);\n          return { type: 'activity', kind: 'form_submitted', name };\n        }), options);\n        post({ type: 'hello' });\n      })();\n    "
            java.util.Set r0 = java.util.Collections.singleton(r3)
            X.6xm r0 = X.C6xj.A01(r5, r1, r0)
            r4.script = r0
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserActivityBridge.<init>(android.webkit.WebView):void");
    }

    public static final void _init_$lambda$0(LocalBrowserActivityBridge localBrowserActivityBridge, WebView webView, C6yG c6yG, Uri uri, boolean z, C6yA c6yA) {
        AnonymousClass002.A1D(c6yG, 2, c6yA);
        localBrowserActivityBridge.receive(c6yG, z, c6yA);
    }

    private final void hello(C6yA c6yA, boolean z) {
        C6yP c6yP;
        boolean z2 = false;
        if (z) {
            if (c6yA != this.mainFrame) {
                this.mainFrame = c6yA;
                this.subframes.clear();
            }
        } else if (!this.subframes.contains(c6yA)) {
            if (this.subframes.size() >= 31) {
                try {
                    c6yP = (C6yP) c6yA;
                } catch (RuntimeException unused) {
                }
                if (!C6xU.A18.A01()) {
                    throw C60Q.A0q();
                }
                c6yP.A00.postMessage("idle");
                LocalBrowserActivitySink localBrowserActivitySink = this.sink;
                if (localBrowserActivitySink != null) {
                    localBrowserActivitySink.framesDropped();
                    return;
                }
                return;
            }
            this.subframes.add(c6yA);
        }
        LocalBrowserActivitySink localBrowserActivitySink2 = this.sink;
        if (localBrowserActivitySink2 != null && localBrowserActivitySink2.isRecording()) {
            z2 = true;
        }
        post(c6yA, z2);
    }

    private final void post(C6yA c6yA, boolean z) {
        String str = z ? RECORDING : "idle";
        try {
            C6yP c6yP = (C6yP) c6yA;
            if (!C6xU.A18.A01()) {
                throw C60Q.A0q();
            }
            c6yP.A00.postMessage(str);
        } catch (RuntimeException unused) {
        }
    }

    private final void receive(C6yG c6yG, boolean z, C6yA c6yA) {
        String str;
        LocalBrowserActivitySink localBrowserActivitySink;
        TakeoverActivityJson activity;
        if (this.closed || c6yG.A00 != 0 || (str = c6yG.A01) == null || str.length() > 8192) {
            return;
        }
        try {
            TakeoverPageMessageJson takeoverPageMessageJson = (TakeoverPageMessageJson) HatchJsonKt.HatchJson.A00(str, TakeoverPageMessageJson$$serializer.INSTANCE);
            String str2 = takeoverPageMessageJson.type;
            if ("hello".equals(str2)) {
                hello(c6yA, z);
            } else {
                if (!"activity".equals(str2) || (localBrowserActivitySink = this.sink) == null || !localBrowserActivitySink.isRecording() || (activity = takeoverPageMessageJson.toActivity()) == null) {
                    return;
                }
                localBrowserActivitySink.record(activity);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void broadcast(boolean z) {
        Iterator it = AbstractC0878AGe.A0P(this.subframes, AbstractC0885AGm.A0z(this.mainFrame)).iterator();
        while (it.hasNext()) {
            post((C6yA) it.next(), z);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.sink = null;
        this.mainFrame = null;
        this.subframes.clear();
        try {
            InterfaceC05836xn interfaceC05836xn = this.script;
            if (interfaceC05836xn != null) {
                ((C05826xm) interfaceC05836xn).A00.remove();
            }
        } finally {
            if (this.isInstalled) {
                C6xj.A04(this.view, BRIDGE);
            }
        }
    }

    public final LocalBrowserActivitySink getSink() {
        return this.sink;
    }

    public final boolean isInstalled() {
        return this.isInstalled;
    }

    public final void setSink(LocalBrowserActivitySink localBrowserActivitySink) {
        this.sink = localBrowserActivitySink;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
