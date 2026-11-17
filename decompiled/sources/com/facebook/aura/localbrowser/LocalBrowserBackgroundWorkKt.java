package com.facebook.aura.localbrowser;

import X.Ab3;
import X.C7384Etj;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LocalBrowserBackgroundWorkKt {
    public static final int NOTIFICATION_PREVIEW_SIZE_PX = 480;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt", f = "LocalBrowserBackgroundWork.kt", l = {90, 93, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "captureLocalBrowserNotificationPreview", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBackgroundWorkKt.captureLocalBrowserNotificationPreview(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final Bitmap fitWithin(Bitmap bitmap, int i) {
        float fMax = i / Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (fMax >= 1.0f) {
            return bitmap;
        }
        int iA01 = Ab3.A01(bitmap.getWidth() * fMax);
        if (iA01 < 1) {
            iA01 = 1;
        }
        int iA012 = Ab3.A01(bitmap.getHeight() * fMax);
        if (iA012 < 1) {
            iA012 = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iA01, iA012, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[PHI: r10
  0x0052: PHI (r10v4 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r10v1 kotlin.jvm.functions.Function0<kotlin.Unit>), (r10v0 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:32:0x0050, B:30:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085 A[PHI: r10
  0x0085: PHI (r10v2 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r10v1 kotlin.jvm.functions.Function0<kotlin.Unit>), (r10v4 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:32:0x0050, B:34:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.backgroundwork.api.BackgroundWorkContent localBrowserBackgroundWorkContent(java.lang.String r11, com.facebook.aura.model.BrowserTaskPresentation r12, com.facebook.aura.localbrowser.LocalBrowserFacts r13, android.graphics.Bitmap r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, boolean r16, boolean r17) {
        /*
            r10 = r15
            android.content.Context r2 = X.C3cG.A06()
            r5 = 0
            if (r12 == 0) goto Le2
            java.lang.String r6 = r12.title
            if (r6 == 0) goto Le2
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto Le2
        L12:
            if (r13 == 0) goto Ldf
            java.lang.String r0 = r13.userActionRequired
        L16:
            r1 = 1
            if (r0 == 0) goto L27
            com.facebook.aura.localbrowser.LocalBrowserControl r3 = r13.control
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.AGENT
            if (r3 != r0) goto L27
            if (r12 == 0) goto Ld5
            boolean r0 = r12.isTombstone()
            if (r0 != r1) goto Ld5
        L27:
            r4 = 0
            if (r12 != 0) goto L9c
            r0 = 2131886510(0x7f1201ae, float:1.94076E38)
            if (r17 == 0) goto L97
            r0 = 2131886506(0x7f1201aa, float:1.9407593E38)
            java.lang.String r7 = r2.getString(r0)
        L36:
            X.C7384Etj.A0X(r7)
            if (r11 == 0) goto L95
            java.lang.String r9 = localBrowserTaskUri(r11)
        L3f:
            if (r15 == 0) goto L4f
            if (r12 == 0) goto L4f
            boolean r0 = r12.isTerminal()
            if (r0 != 0) goto L4f
            boolean r0 = com.facebook.aura.browsertask.data.BrowserTaskStateKt.canStopBrowserTask(r12)
            if (r0 != 0) goto L52
        L4f:
            r10 = r5
            if (r12 == 0) goto L85
        L52:
            boolean r0 = r12.isTerminal()
            if (r0 != r1) goto L85
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r11 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.FINISHED
        L5a:
            if (r16 == 0) goto L7d
            if (r12 == 0) goto L7d
            com.facebook.aura.model.BrowserTaskDisplayStatus r1 = r12.getDisplayState()
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.COMPLETED
            if (r1 == r0) goto L6e
            com.facebook.aura.model.BrowserTaskDisplayStatus r1 = r12.getDisplayState()
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.FAILED
            if (r1 != r0) goto L7d
        L6e:
            java.lang.String r0 = r12.status
            java.lang.String r1 = X.C3cJ.A0J(r0)
            java.lang.String r0 = "superseded"
            boolean r0 = r1.equals(r0)
            r12 = 1
            if (r0 == 0) goto L7e
        L7d:
            r12 = 0
        L7e:
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r5 = new com.facebook.aura.backgroundwork.api.BackgroundWorkContent
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L85:
            if (r4 != 0) goto L8f
            if (r12 == 0) goto L92
            boolean r0 = r12.isWaitingForUser()
            if (r0 != r1) goto L92
        L8f:
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r11 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.NEEDS_USER
            goto L5a
        L92:
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r11 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.RUNNING
            goto L5a
        L95:
            r9 = r5
            goto L3f
        L97:
            java.lang.String r7 = r2.getString(r0)
            goto L36
        L9c:
            java.lang.String r3 = r12.displayStatus
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto La6
            if (r3 != 0) goto Lb2
        La6:
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = r12.getDisplayState()
            int r0 = com.facebook.aura.ui.BrowserTaskTextKt.fallbackStatusLabelRes(r0)
            java.lang.String r3 = r2.getString(r0)
        Lb2:
            java.lang.String r7 = r12.activityTitle
            if (r7 == 0) goto Lcd
            boolean r0 = X.C7BY.A0j(r7)
            if (r0 != 0) goto Lcd
        Lbc:
            boolean r0 = r12.isTerminal()
            if (r0 != 0) goto Lcf
            boolean r0 = r12.isWaitingForUser()
            if (r0 != 0) goto Lcf
            if (r7 != 0) goto L36
            r7 = r3
            goto L36
        Lcd:
            r7 = r5
            goto Lbc
        Lcf:
            java.lang.String r7 = com.facebook.aura.ui.BrowserTaskTextKt.browserTaskStatusWithDetail(r2, r3, r7)
            goto L36
        Ld5:
            r4 = 1
            r0 = 2131889322(0x7f120caa, float:1.9413304E38)
            java.lang.String r7 = r2.getString(r0)
            goto L36
        Ldf:
            r0 = r5
            goto L16
        Le2:
            r0 = 2131886536(0x7f1201c8, float:1.9407654E38)
            java.lang.String r6 = r2.getString(r0)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(java.lang.String, com.facebook.aura.model.BrowserTaskPresentation, com.facebook.aura.localbrowser.LocalBrowserFacts, android.graphics.Bitmap, kotlin.jvm.functions.Function0, boolean, boolean):com.facebook.aura.backgroundwork.api.BackgroundWorkContent");
    }

    public static final String localBrowserTaskUri(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("hatch://browser_task/", Uri.encode(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object captureLocalBrowserNotificationPreview(java.lang.String r9, com.facebook.aura.localbrowser.LocalBrowserSession r10, com.facebook.aura.browsertask.data.BrowserTaskRepository r11, android.graphics.Bitmap r12, X.HtJ<? super android.graphics.Bitmap> r13) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.captureLocalBrowserNotificationPreview(java.lang.String, com.facebook.aura.localbrowser.LocalBrowserSession, com.facebook.aura.browsertask.data.BrowserTaskRepository, android.graphics.Bitmap, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ BackgroundWorkContent localBrowserBackgroundWorkContent$default(String str, BrowserTaskPresentation browserTaskPresentation, LocalBrowserFacts localBrowserFacts, Bitmap bitmap, Function0 function0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            browserTaskPresentation = null;
        }
        if ((i & 4) != 0) {
            localBrowserFacts = null;
        }
        if ((i & 8) != 0) {
            bitmap = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        return localBrowserBackgroundWorkContent(str, browserTaskPresentation, localBrowserFacts, bitmap, function0, z, z2);
    }
}
