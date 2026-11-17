package com.facebook.aura.share;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C7KQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraShareIntentHandlerActivity extends AppCompatActivity {
    public static final String AURA_MAIN_ACTIVITY_CLASS_NAME = "com.facebook.aura.main.AuraMainActivity";
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraShareIntentHandlerActivity";
    public boolean droppedUnreadableUri;
    public final List<Uri> urisToForward = C3cG.A0h();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
        processIntent();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void processIntent() {
        /*
            r6 = this;
            java.util.List<android.net.Uri> r0 = r6.urisToForward
            r0.clear()
            r0 = 0
            r6.droppedUnreadableUri = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = r0.getAction()
            if (r2 == 0) goto Lc4
            int r1 = r2.hashCode()
            r0 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r1 == r0) goto L8e
            r0 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r1 == r0) goto L7e
            r0 = 1703997026(0x6590ee62, float:8.555227E22)
            if (r1 != r0) goto Lc4
            r0 = 2
            java.lang.String r0 = X.AbstractC7606F5t.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc4
            r6.handleProcessTextIntent()
        L33:
            com.facebook.aura.conversation.common.HatchPendingMessage r0 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
            r0.notifyShareDataReady()
            java.lang.String r0 = "com.facebook.aura.action.SHARE"
            android.content.Intent r5 = X.C60P.A03(r0)
            java.lang.String r0 = "com.facebook.aura.main.AuraMainActivity"
            r5.setClassName(r6, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r5.addFlags(r0)
            java.util.List<android.net.Uri> r0 = r6.urisToForward
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r0 != 0) goto La0
            java.lang.String r1 = "shared"
            java.util.List<android.net.Uri> r0 = r6.urisToForward
            java.lang.Object r0 = X.AbstractC0878AGe.A0F(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            android.content.ClipData r3 = android.content.ClipData.newRawUri(r1, r0)
            java.util.List<android.net.Uri> r0 = r6.urisToForward
            java.util.List r0 = X.AbstractC0878AGe.A0Z(r0, r4)
            java.util.Iterator r2 = r0.iterator()
        L69:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.ClipData$Item r0 = new android.content.ClipData$Item
            r0.<init>(r1)
            r3.addItem(r0)
            goto L69
        L7e:
            r0 = 8
            java.lang.String r0 = X.BV3.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc4
            r6.handleSendMultipleIntent()
            goto L33
        L8e:
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc4
            r6.handleSendIntent()
            goto L33
        L9a:
            r5.setClipData(r3)
            r5.addFlags(r4)
        La0:
            r6.startActivity(r5)     // Catch: java.lang.SecurityException -> La4
            goto Lb8
        La4:
            r3 = move-exception
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "AuraShareIntentHandlerActivity"
            java.lang.String r0 = "processIntent: unable to forward URI grant for %s"
            X.CFK.A0D(r1, r0, r3, r2)
        Lb8:
            boolean r0 = r6.droppedUnreadableUri
            if (r0 == 0) goto Lc4
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131888824(0x7f120ab8, float:1.9412294E38)
            r1.showToast(r0)
        Lc4:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.share.AuraShareIntentHandlerActivity.processIntent():void");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean canReadUri(Uri uri) {
        return checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) == 0;
    }

    private final void handleFileShare() {
        Object parcelableExtra;
        boolean z;
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = C7KQ.A00(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
        }
        Uri uri = (Uri) parcelableExtra;
        if (uri == null) {
            z = false;
        } else {
            if (canReadUri(uri)) {
                String type = getContentResolver().getType(uri);
                if (type == null && (type = getIntent().getType()) == null) {
                    type = "application/octet-stream";
                }
                this.urisToForward.add(uri);
                HatchPendingMessage.INSTANCE.setPendingComposerFileUris(Collections.singletonList(C3cG.A0r(uri.toString(), type)), HatchComposerEntryPoint.SHARE_INTENT);
                stageOptionalCaption();
            }
            z = true;
        }
        this.droppedUnreadableUri = z;
        stageOptionalCaption();
    }

    private final void handleImageShare() {
        Object parcelableExtra;
        boolean z;
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = C7KQ.A00(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
        }
        Uri uri = (Uri) parcelableExtra;
        if (uri == null) {
            z = false;
        } else {
            if (canReadUri(uri)) {
                this.urisToForward.add(uri);
                HatchPendingMessage.INSTANCE.setPendingComposerImageUris(Collections.singletonList(uri.toString()), HatchComposerEntryPoint.SHARE_INTENT);
                stageOptionalCaption();
            }
            z = true;
        }
        this.droppedUnreadableUri = z;
        stageOptionalCaption();
    }

    private final void handleProcessTextIntent() {
        String strA0l;
        String stringExtra = getIntent().getStringExtra("android.intent.extra.PROCESS_TEXT");
        if (stringExtra == null || (strA0l = AnonymousClass002.A0l(stringExtra)) == null) {
            strA0l = "";
        }
        if (strA0l.length() > 0) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(strA0l, HatchComposerEntryPoint.PROCESS_TEXT);
        }
    }

    private final void handleSendIntent() {
        String type = getIntent().getType();
        if ("text/plain".equals(type)) {
            handleTextShare();
        } else if (type == null || !type.startsWith("image/")) {
            handleFileShare();
        } else {
            handleImageShare();
        }
    }

    private final void handleSendMultipleIntent() {
        Intent intent = getIntent();
        ArrayList arrayListA01 = Build.VERSION.SDK_INT >= 34 ? C7KQ.A01(intent) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        List listA0U = arrayListA01 != null ? AbstractC0878AGe.A0U(arrayListA01) : C0881AGi.A00;
        ArrayList<Uri> arrayListA0h = C3cG.A0h();
        for (Object obj : listA0U) {
            if (canReadUri((Uri) obj)) {
                arrayListA0h.add(obj);
            }
        }
        this.droppedUnreadableUri = arrayListA0h.size() < listA0U.size();
        if (!arrayListA0h.isEmpty()) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            for (Uri uri : arrayListA0h) {
                String type = getContentResolver().getType(uri);
                if (type == null && (type = getIntent().getType()) == null) {
                    type = "application/octet-stream";
                }
                boolean zStartsWith = type.startsWith("image/");
                String string = uri.toString();
                if (zStartsWith) {
                    C7384Etj.A0U(string);
                    arrayListA0h2.add(string);
                } else {
                    AnonymousClass002.A1J(string, type, arrayListA0h3);
                }
            }
            this.urisToForward.addAll(arrayListA0h);
            if (!arrayListA0h2.isEmpty()) {
                HatchPendingMessage.INSTANCE.setPendingComposerImageUris(arrayListA0h2, HatchComposerEntryPoint.SHARE_INTENT);
            }
            if (!arrayListA0h3.isEmpty()) {
                HatchPendingMessage.INSTANCE.setPendingComposerFileUris(arrayListA0h3, HatchComposerEntryPoint.SHARE_INTENT);
            }
        }
        stageOptionalCaption();
    }

    private final void handleTextShare() {
        String strA0l;
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null || (strA0l = AnonymousClass002.A0l(stringExtra)) == null) {
            strA0l = "";
        }
        if (strA0l.length() > 0) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(strA0l, HatchComposerEntryPoint.SHARE_INTENT);
        }
    }

    private final void stageOptionalCaption() {
        String strA0l;
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null || (strA0l = AnonymousClass002.A0l(stringExtra)) == null) {
            strA0l = "";
        }
        if (strA0l.length() > 0) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(strA0l, HatchComposerEntryPoint.SHARE_INTENT);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }
}
