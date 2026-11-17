package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.BQG;
import X.C1HY;
import X.C3cG;
import X.C5303Dfm;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.Dg5;
import X.EnumC10573Huf;
import X.FT4;
import X.HpR;
import X.HwU;
import X.ViewOnAttachStateChangeListenerC8438Fe2;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.localbrowser.LocalBrowserFileChooser;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalBrowserFileChooser {
    public static final int $stable = 8;
    public final Function0<Unit> onChanged;
    public Request pending;

    public final class Request implements Dg5 {
        public final ComponentActivity activity;
        public final ValueCallback<Uri[]> callback;
        public final LocalBrowserTarget.HostLease host;
        public HwU<Intent> launcher;
        public ViewOnAttachStateChangeListenerC8438Fe2 pendingDraw;
        public Uri[] result;
        public boolean returned;
        public final /* synthetic */ LocalBrowserFileChooser this$0;

        public Request(LocalBrowserFileChooser localBrowserFileChooser, LocalBrowserTarget.HostLease hostLease, ComponentActivity componentActivity, ValueCallback<Uri[]> valueCallback) {
            AnonymousClass005.A11(hostLease, componentActivity, valueCallback, 1);
            this.this$0 = localBrowserFileChooser;
            this.host = hostLease;
            this.activity = componentActivity;
            this.callback = valueCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean canRead(android.net.Uri r6) {
            /*
                r5 = this;
                r4 = 0
                X.C7384Etj.A0Y(r6, r4)
                java.lang.String r1 = r6.getScheme()
                java.lang.String r0 = "content"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L38
                java.lang.String r1 = r6.getAuthority()
                if (r1 == 0) goto L3b
                androidx.activity.ComponentActivity r0 = r5.activity
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r4)
                if (r0 == 0) goto L39
                android.content.pm.ApplicationInfo r0 = r0.applicationInfo
                if (r0 == 0) goto L39
                int r0 = r0.uid
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            L2c:
                int r1 = android.os.Process.myUid()
                if (r0 == 0) goto L3b
                int r0 = r0.intValue()
                if (r0 != r1) goto L3b
            L38:
                return r4
            L39:
                r0 = 0
                goto L2c
            L3b:
                androidx.activity.ComponentActivity r3 = r5.activity
                int r2 = android.os.Process.myPid()
                int r0 = android.os.Process.myUid()
                r1 = 1
                int r0 = r3.checkUriPermission(r6, r2, r0, r1)
                if (r0 != 0) goto L38
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserFileChooser.Request.canRead(android.net.Uri):boolean");
        }

        @Override // X.Dg5
        public void onDestroy(C1HY c1hy) {
            finish(null);
        }

        public final void deliverWhenResumed() {
            if (this.returned && this.pendingDraw == null && ((C5303Dfm) this.activity.getLifecycle()).A01.A00(EnumC10573Huf.A05)) {
                final View decorView = this.activity.getWindow().getDecorView();
                C7384Etj.A0U(decorView);
                this.pendingDraw = ViewOnAttachStateChangeListenerC8438Fe2.A00(decorView, new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserFileChooser$Request$deliverWhenResumed$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalBrowserFileChooser.Request request = this;
                        request.pendingDraw = null;
                        if (((C5303Dfm) request.activity.getLifecycle()).A01.A00(EnumC10573Huf.A05)) {
                            LocalBrowserFileChooser.Request request2 = this;
                            request2.finish(request2.result);
                        }
                    }
                });
            }
        }

        public final void finish(Uri[] uriArr) {
            LocalBrowserFileChooser localBrowserFileChooser = this.this$0;
            if (localBrowserFileChooser.pending == this) {
                localBrowserFileChooser.pending = null;
                ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
                if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                    viewOnAttachStateChangeListenerC8438Fe2.A01();
                }
                this.pendingDraw = null;
                HwU<Intent> hwU = this.launcher;
                if (hwU != null) {
                    hwU.A00();
                }
                this.launcher = null;
                this.activity.getLifecycle().A05(this);
                this.result = null;
                try {
                    this.callback.onReceiveValue(uriArr);
                } finally {
                    this.this$0.onChanged.invoke();
                }
            }
        }

        public final LocalBrowserTarget.HostLease getHost() {
            return this.host;
        }

        public final HwU<Intent> getLauncher() {
            return this.launcher;
        }

        public final Uri[] getResult() {
            return this.result;
        }

        public final boolean getReturned() {
            return this.returned;
        }

        @Override // X.Dg5
        public /* bridge */ void onCreate(C1HY c1hy) {
        }

        @Override // X.Dg5
        public void onPause(C1HY c1hy) {
            ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
            if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                viewOnAttachStateChangeListenerC8438Fe2.A01();
            }
            this.pendingDraw = null;
        }

        @Override // X.Dg5
        public /* bridge */ void onStart(C1HY c1hy) {
        }

        @Override // X.Dg5
        public /* bridge */ void onStop(C1HY c1hy) {
        }

        public final void setLauncher(HwU<Intent> hwU) {
            this.launcher = hwU;
        }

        public final void setResult(Uri[] uriArr) {
            this.result = uriArr;
        }

        public final void setReturned(boolean z) {
            this.returned = z;
        }

        @Override // X.Dg5
        public void onResume(C1HY c1hy) {
            deliverWhenResumed();
        }
    }

    public LocalBrowserFileChooser(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onChanged = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[EDGE_INSN: B:16:0x0030->B:17:0x0031 BREAK  A[LOOP:0: B:11:0x0020->B:22:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void open$lambda$0(com.facebook.aura.localbrowser.LocalBrowserFileChooser r5, com.facebook.aura.localbrowser.LocalBrowserFileChooser.Request r6, android.webkit.WebChromeClient.FileChooserParams r7, androidx.activity.result.ActivityResult r8) {
        /*
            r0 = 3
            X.C7384Etj.A0Y(r8, r0)
            com.facebook.aura.localbrowser.LocalBrowserFileChooser$Request r0 = r5.pending
            if (r0 != r6) goto L38
            int r1 = r8.A00
            android.content.Intent r0 = r8.A01
            android.net.Uri[] r5 = android.webkit.WebChromeClient.FileChooserParams.parseResult(r1, r0)
            r4 = 0
            r3 = 1
            if (r5 == 0) goto L30
            int r2 = r5.length
            r1 = 0
            if (r2 == 0) goto L30
            int r0 = r7.getMode()
            if (r0 == r3) goto L20
            if (r2 != r3) goto L30
        L20:
            r0 = r5[r1]
            X.C7384Etj.A0X(r0)
            boolean r0 = r6.canRead(r0)
            if (r0 == 0) goto L30
            int r1 = r1 + 1
            if (r1 >= r2) goto L31
            goto L20
        L30:
            r5 = r4
        L31:
            r6.result = r5
            r6.returned = r3
            r6.deliverWhenResumed()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserFileChooser.open$lambda$0(com.facebook.aura.localbrowser.LocalBrowserFileChooser, com.facebook.aura.localbrowser.LocalBrowserFileChooser$Request, android.webkit.WebChromeClient$FileChooserParams, androidx.activity.result.ActivityResult):void");
    }

    public final void cancel() {
        Request request = this.pending;
        if (request != null) {
            request.finish(null);
        }
    }

    public final boolean holds(LocalBrowserTarget.HostLease hostLease) {
        Request request;
        return (hostLease == null || (request = this.pending) == null || request.host != hostLease) ? false : true;
    }

    public final void open(LocalBrowserTarget.HostLease hostLease, final WebChromeClient.FileChooserParams fileChooserParams, ValueCallback<Uri[]> valueCallback) {
        int iA1Z = AnonymousClass005.A1Z(hostLease, fileChooserParams, valueCallback);
        cancel();
        ComponentActivity componentActivity = hostLease.activity;
        if (componentActivity != null && !componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
            if (C60Q.A1W(BFI.A0H(new Integer[]{0, Integer.valueOf(iA1Z)}), fileChooserParams.getMode())) {
                final Request request = new Request(this, hostLease, componentActivity, valueCallback);
                this.pending = request;
                try {
                    request.launcher = componentActivity.activityResultRegistry.A02(new FT4() { // from class: com.facebook.aura.localbrowser.LocalBrowserFileChooser$$ExternalSyntheticLambda0
                        @Override // X.FT4
                        public final void onActivityResult(Object obj) {
                            LocalBrowserFileChooser.open$lambda$0(this.f$0, request, fileChooserParams, (ActivityResult) obj);
                        }
                    }, new HpR(), AnonymousClass007.A0a("local-browser-file-", UUID.randomUUID()));
                    componentActivity.getLifecycle().A04(request);
                    String[] acceptTypes = fileChooserParams.getAcceptTypes();
                    ArrayList arrayListA0s = C60Q.A0s(acceptTypes);
                    for (String str : acceptTypes) {
                        C7384Etj.A0X(str);
                        AbstractC0882AGj.A0r(C7BY.A0h(str, new char[iA1Z], ','), arrayListA0s);
                    }
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator it = arrayListA0s.iterator();
                    while (it.hasNext()) {
                        String strA0j = C60Q.A0j(C7BY.A0b(it));
                        if (C7BY.A0m(strA0j, '.')) {
                            strA0j = MimeTypeMap.getSingleton().getMimeTypeFromExtension(BQG.A16(strA0j, iA1Z));
                            if (strA0j != null) {
                                arrayListA0h.add(strA0j);
                            }
                        } else if (C7BY.A0k(strA0j, '/')) {
                            arrayListA0h.add(strA0j);
                        }
                    }
                    List listA0m = C3cG.A0m(arrayListA0h);
                    HwU<Intent> hwU = request.launcher;
                    if (hwU != null) {
                        Intent intentA03 = C60P.A03(AnonymousClass000.A00(3));
                        intentA03.addCategory(AnonymousClass000.A00(4));
                        String str2 = (String) AbstractC0878AGe.A0K(listA0m);
                        if (str2 == null) {
                            str2 = "*/*";
                        }
                        intentA03.setType(str2);
                        if (listA0m.size() > iA1Z) {
                            intentA03.putExtra(AnonymousClass000.A00(5), (String[]) listA0m.toArray(new String[0]));
                        }
                        intentA03.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams.getMode() == iA1Z);
                        hwU.A01(null, intentA03);
                        return;
                    }
                    return;
                } catch (RuntimeException unused) {
                    request.finish(null);
                    return;
                }
            }
        }
        valueCallback.onReceiveValue(null);
    }
}
