package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.BL4;
import X.C7384Etj;
import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.webview.FocusedInputReveal;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserWebView extends WebView {
    public static final int $stable = 8;
    public Function0<Boolean> acceptsAutofill;
    public Function0<Boolean> acceptsUserInput;
    public BL4 automationViewport;
    public final FocusedInputReveal focusedInputReveal;
    public boolean requestedKeepScreenOn;
    public boolean suppressScreenWakeLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserWebView(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.focusedInputReveal = new FocusedInputReveal(this, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWebView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserWebView.focusedInputReveal$lambda$0(this.f$0));
            }
        });
        this.requestedKeepScreenOn = super.getKeepScreenOn();
    }

    @Override // android.webkit.WebView, android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        C7384Etj.A0Y(sparseArray, 0);
        Function0<Boolean> function0 = this.acceptsAutofill;
        if (function0 == null || !AnonymousClass003.A1Y(function0)) {
            return;
        }
        super.autofill(sparseArray);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C7384Etj.A0Y(editorInfo, 0);
        Function0<Boolean> function0 = this.acceptsUserInput;
        if (function0 == null || !AnonymousClass003.A1Y(function0)) {
            return null;
        }
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions |= HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        String url;
        String strNavigationUrl;
        String host;
        C7384Etj.A0Y(viewStructure, 0);
        viewStructure.setAutofillId(getAutofillId());
        Function0<Boolean> function0 = this.acceptsAutofill;
        if (function0 == null || !AnonymousClass003.A1Y(function0) || (url = getUrl()) == null || (strNavigationUrl = LocalBrowserUrlPolicy.INSTANCE.navigationUrl(url)) == null || (host = Uri.parse(strNavigationUrl).getHost()) == null) {
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setWebDomain(host);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        C7384Etj.A0Y(callback, 0);
        Function0<Boolean> function0 = this.acceptsUserInput;
        if (function0 == null || !AnonymousClass003.A1Y(function0)) {
            return null;
        }
        return super.startActionMode(new LocalBrowserAutofillActionMode(callback, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWebView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserWebView.startActionMode$lambda$0(this.f$0));
            }
        }), i);
    }

    public static final boolean focusedInputReveal$lambda$0(LocalBrowserWebView localBrowserWebView) {
        Function0<Boolean> function0 = localBrowserWebView.acceptsUserInput;
        return function0 != null && AnonymousClass003.A1Y(function0);
    }

    public static final boolean startActionMode$lambda$0(LocalBrowserWebView localBrowserWebView) {
        Function0<Boolean> function0 = localBrowserWebView.acceptsAutofill;
        return function0 != null && AnonymousClass003.A1Y(function0);
    }

    public final Function0<Boolean> getAcceptsAutofill() {
        return this.acceptsAutofill;
    }

    public final Function0<Boolean> getAcceptsUserInput() {
        return this.acceptsUserInput;
    }

    /* renamed from: getAutomationViewport-bOM6tXw, reason: not valid java name */
    public final BL4 m1232getAutomationViewportbOM6tXw() {
        return this.automationViewport;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        Function0<Boolean> function0 = this.acceptsAutofill;
        return (function0 == null || !AnonymousClass003.A1Y(function0)) ? 8 : 1;
    }

    public final boolean getSuppressScreenWakeLock() {
        return this.suppressScreenWakeLock;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        Function0<Boolean> function0 = this.acceptsUserInput;
        return function0 != null && AnonymousClass003.A1Y(function0) && super.onCheckIsTextEditor();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.focusedInputReveal.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        BL4 bl4 = this.automationViewport;
        if (bl4 == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (bl4.A00 >> 32), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (bl4.A00 & 4294967295L), 1073741824));
        }
    }

    public final void setAcceptsAutofill(Function0<Boolean> function0) {
        this.acceptsAutofill = function0;
    }

    public final void setAcceptsUserInput(Function0<Boolean> function0) {
        this.acceptsUserInput = function0;
    }

    /* renamed from: setAutomationViewport-fhxjrPA, reason: not valid java name */
    public final void m1233setAutomationViewportfhxjrPA(BL4 bl4) {
        if (C7384Etj.areEqual(this.automationViewport, bl4)) {
            return;
        }
        this.automationViewport = bl4;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setKeepScreenOn(boolean r3) {
        /*
            r2 = this;
            r2.requestedKeepScreenOn = r3
            if (r3 == 0) goto L9
            boolean r1 = r2.suppressScreenWakeLock
            r0 = 1
            if (r1 == 0) goto La
        L9:
            r0 = 0
        La:
            super.setKeepScreenOn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserWebView.setKeepScreenOn(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSuppressScreenWakeLock(boolean r2) {
        /*
            r1 = this;
            r1.suppressScreenWakeLock = r2
            boolean r0 = r1.requestedKeepScreenOn
            if (r0 == 0) goto L9
            r0 = 1
            if (r2 == 0) goto La
        L9:
            r0 = 0
        La:
            super.setKeepScreenOn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserWebView.setSuppressScreenWakeLock(boolean):void");
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.focusedInputReveal.onSizeChanged(i2, i4);
    }
}
