package com.facebook.aura.browsertask.data;

import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C05663ul;
import X.C06H;
import X.C20Q;
import X.C20Z;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class HatchComputerRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchComputerRepository getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchComputerRepository) abstractC3358CGz.A03(HatchComputerRepository.class, new Function0() { // from class: com.facebook.aura.browsertask.data.HatchComputerRepository$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new HatchComputerRepository(abstractC3358CGz);
                }
            });
        }

        public static final HatchComputerRepository getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new HatchComputerRepository(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.data.HatchComputerRepository$subscribe$1", f = "HatchComputerRepository.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.data.HatchComputerRepository$subscribe$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C20Z<? super HatchComputerContext>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = HatchComputerRepository.this.new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        
            if (r13 == r2) goto L12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x00e5, TryCatch #2 {all -> 0x00e5, blocks: (B:7:0x0022, B:26:0x007f, B:28:0x0085, B:33:0x00a1, B:36:0x00a6, B:38:0x00aa, B:40:0x00b4, B:42:0x00b8, B:32:0x009d, B:24:0x0070, B:30:0x0091), top: B:69:0x000c, outer: #0, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:46:0x00dc, B:47:0x00df, B:58:0x00fc, B:59:0x00ff, B:19:0x0062, B:21:0x0066, B:23:0x006a, B:57:0x00ed, B:7:0x0022, B:26:0x007f, B:28:0x0085, B:33:0x00a1, B:36:0x00a6, B:38:0x00aa, B:40:0x00b4, B:42:0x00b8, B:32:0x009d, B:24:0x0070, B:52:0x00e6), top: B:69:0x000c, inners: #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.aura.network.transport.HatchHttpResponseStream] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.data.HatchComputerRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super HatchComputerContext> c20z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C20Q<HatchComputerContext> subscribe() {
        return AbstractC05623ug.A00(AnonymousClass001.A0y(), new C05663ul(new AnonymousClass1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchComputerContext toContext(ComputerContextJson computerContextJson) {
        String strResolveDaemonApiUrl;
        List<JsonElement> list = computerContextJson.tasks;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            JsonElement jsonElementA11 = C60Q.A11(it);
            int i = BrowserTaskPresentation.$stable;
            BrowserTaskPresentation browserTaskPresentation = BrowserTaskPresentationJsonKt.parseBrowserTaskPresentation(jsonElementA11);
            if (browserTaskPresentation != null) {
                arrayListA0h.add(browserTaskPresentation);
            }
        }
        DesktopImageJson desktopImageJson = computerContextJson.default_desktop_image;
        HatchDesktopImage hatchDesktopImage = null;
        if (desktopImageJson != null && (strResolveDaemonApiUrl = WorkspaceUriResolver.INSTANCE.resolveDaemonApiUrl(desktopImageJson.url, this.userSession)) != null) {
            hatchDesktopImage = new HatchDesktopImage(strResolveDaemonApiUrl, desktopImageJson.width, desktopImageJson.height);
        }
        return new HatchComputerContext(arrayListA0h, hatchDesktopImage);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* renamed from: leaseBrowser-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m304leaseBrowsergIAlus(java.lang.String r24, X.HtJ<? super X.HsJ<com.facebook.aura.model.BrowserTaskPresentation>> r25) {
        /*
            r23 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser$1
            r5 = r23
            if (r0 == 0) goto L8b
            r2 = r4
            com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser$1 r2 = (com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L8b
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r15 = 1
            if (r0 == 0) goto L2c
            if (r0 != r15) goto La2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lac
            goto L91
        L2c:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.browsertask.data.BrowserTaskJarvisPath$BrowserLease r7 = com.facebook.aura.browsertask.data.BrowserTaskJarvisPath.BrowserLease.INSTANCE
            com.facebook.aura.browsertask.data.BrowserLeaseRequestJson r8 = new com.facebook.aura.browsertask.data.BrowserLeaseRequestJson
            r0 = r24
            r8.<init>(r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r10 = r5.userSession
            r6 = 0
            X.HxE[] r13 = new X.HxE[r6]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r17 = X.AGH.A0E()
            com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r11 = 0
            r2.L$0 = r11
            r2.L$1 = r11
            r2.L$2 = r11
            r2.L$3 = r11
            r2.L$4 = r11
            r2.L$5 = r11
            r2.L$6 = r11
            r2.L$7 = r11
            r2.L$8 = r11
            r2.I$0 = r15
            r2.I$1 = r15
            r2.I$2 = r6
            r2.I$3 = r15
            r2.I$4 = r6
            r2.I$5 = r6
            r2.I$6 = r6
            r2.label = r15
            r12 = r11
            r16 = r15
            r18 = r11
            r19 = r6
            r20 = r15
            r21 = r6
            r22 = r6
            r23 = r11
            r24 = r6
            r25 = r2
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 == r1) goto Lac
            r1 = r0
            goto L25
        L8b:
            com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser$1 r2 = new com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser$1
            r2.<init>(r5, r4)
            goto L16
        L91:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Throwable -> La7
            int r0 = com.facebook.aura.model.BrowserTaskPresentation.$stable     // Catch: java.lang.Throwable -> La7
            com.facebook.aura.model.BrowserTaskPresentation r1 = com.facebook.aura.model.BrowserTaskPresentationJsonKt.parseBrowserTaskPresentation(r1)     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto Lac
            java.lang.String r0 = "Browser lease returned no browser_task_id"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        La2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La7:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.data.HatchComputerRepository.m304leaseBrowsergIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* renamed from: loadContext-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m305loadContextIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.data.HatchComputerContext>> r20) {
        /*
            r19 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext$1
            r2 = r19
            if (r0 == 0) goto L72
            r4 = r5
            com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext$1 r4 = (com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext$1) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L72
            int r3 = r3 - r1
            r4.label = r3
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r15 = 1
            if (r0 == 0) goto L32
            if (r0 != r15) goto L78
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.browsertask.data.ComputerContextJson r1 = (com.facebook.aura.browsertask.data.ComputerContextJson) r1
            com.facebook.aura.browsertask.data.HatchComputerContext r1 = r2.toContext(r1)
        L31:
            return r1
        L32:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.browsertask.data.BrowserTaskJarvisPath$ComputerContext r8 = com.facebook.aura.browsertask.data.BrowserTaskJarvisPath.ComputerContext.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r2.userSession
            r7 = 0
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.browsertask.data.HatchComputerRepository$loadContextIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r11
            r4.I$0 = r15
            r4.I$1 = r15
            r4.I$2 = r7
            r4.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r4
            java.lang.Object r0 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == r1) goto L31
            r1 = r0
            goto L25
        L72:
            com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext$1 r4 = new com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext$1
            r4.<init>(r2, r5)
            goto L16
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.data.HatchComputerRepository.m305loadContextIoAF18A(X.HtJ):java.lang.Object");
    }

    public HatchComputerRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ HatchComputerRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
