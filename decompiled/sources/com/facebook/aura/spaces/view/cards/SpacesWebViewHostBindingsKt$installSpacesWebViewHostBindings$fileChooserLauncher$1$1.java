package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Function0<Unit> $endFileRequest;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;

    /* renamed from: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Uri uri) {
            String strA0f = C60R.A0f(uri);
            C7384Etj.A0U(strA0f);
            return strA0f;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(Uri uri) {
            String strA0f = C60R.A0f(uri);
            C7384Etj.A0U(strA0f);
            return strA0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(androidx.activity.result.ActivityResult r8) {
        /*
            r7 = this;
            r6 = 0
            X.C7384Etj.A0Y(r8, r6)
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r7.$session
            android.webkit.ValueCallback<android.net.Uri[]> r5 = r0.pendingFileCallback
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r7.$session
            android.net.Uri r4 = r0.pendingCaptureUri
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.$endFileRequest
            r0.invoke()
            int r3 = r8.A00
            android.content.Intent r2 = r8.A01
            r1 = 1
            if (r5 == 0) goto L20
            r0 = -1
            if (r3 == r0) goto L21
            android.net.Uri[] r3 = new android.net.Uri[r6]
        L1d:
            r5.onReceiveValue(r3)
        L20:
            return
        L21:
            if (r2 == 0) goto L66
            android.content.ClipData r0 = r2.getClipData()
            if (r0 == 0) goto L56
            android.content.ClipData r4 = r2.getClipData()
            X.C7384Etj.A0X(r4)
            int r0 = r4.getItemCount()
            java.util.ArrayList r3 = X.C60O.A11(r0)
            int r2 = r4.getItemCount()
            r1 = 0
        L3d:
            if (r1 >= r2) goto L4f
            android.content.ClipData$Item r0 = r4.getItemAt(r1)
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L4c
            r3.add(r0)
        L4c:
            int r1 = r1 + 1
            goto L3d
        L4f:
            android.net.Uri[] r0 = new android.net.Uri[r6]
            java.lang.Object[] r3 = r3.toArray(r0)
            goto L6c
        L56:
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto L66
            android.net.Uri[] r3 = new android.net.Uri[r1]
            android.net.Uri r4 = r2.getData()
            X.C7384Etj.A0X(r4)
            goto L6a
        L66:
            if (r4 == 0) goto L76
            android.net.Uri[] r3 = new android.net.Uri[r1]
        L6a:
            r3[r6] = r4
        L6c:
            com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1$1 r2 = com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1.AnonymousClass1.INSTANCE
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            X.BFI.A0B(r1, r0, r0, r2, r3)
            goto L1d
        L76:
            android.net.Uri[] r3 = new android.net.Uri[r6]
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1.invoke2(androidx.activity.result.ActivityResult):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, Function0<Unit> function0) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$endFileRequest = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
