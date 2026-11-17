package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C0Yr;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78g;
import X.C7OU;
import X.CFK;
import X.G0U;
import X.HsJ;
import android.content.Context;
import android.content.Intent;
import android.webkit.PermissionRequest;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesFileChooserHost;
import com.facebook.aura.spaces.repo.SpacesMediaPermissionHost;
import com.facebook.aura.utils.HatchPermissionUtils;
import com.facebook.aura.webview.HtmlWebViewPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ C7OU<String, Boolean> $cameraCapturePermissionLauncher;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $endFileRequest;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $fileChooserLauncher;
    public final /* synthetic */ C7OU<String[], Map<String, Boolean>> $mediaPermissionLauncher;
    public final /* synthetic */ MutableState<PermissionRequest> $pendingPermissionRequest$delegate;
    public final /* synthetic */ MutableState<String[]> $pendingRequestedResources$delegate;
    public final /* synthetic */ HtmlWebViewPool $pool;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;

    @Override // X.G0U
    public final C78g invoke(final C0Yr c0Yr) {
        C7384Etj.A0Y(c0Yr, 0);
        if (this.$session.pendingFileCallback == null) {
            this.$pool.setEvictionGuard(this.$cacheKey, false);
        }
        final HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
        final HtmlWebViewPool htmlWebViewPool = this.$pool;
        final String str = this.$cacheKey;
        final Context context = this.$context;
        final C7OU<String, Boolean> c7ou = this.$cameraCapturePermissionLauncher;
        final Function0<Unit> function0 = this.$endFileRequest;
        final C7OU<Intent, ActivityResult> c7ou2 = this.$fileChooserLauncher;
        final SpacesFileChooserHost spacesFileChooserHost = new SpacesFileChooserHost() { // from class: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1$fileHost$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.Hud] */
            @Override // com.facebook.aura.spaces.repo.SpacesFileChooserHost
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void launch(java.lang.String[] r9, boolean r10, boolean r11, android.webkit.ValueCallback<android.net.Uri[]> r12) {
                /*
                    r8 = this;
                    r5 = 0
                    X.AnonymousClass002.A1B(r9, r5, r12)
                    java.lang.String r1 = ","
                    r3 = 0
                    java.lang.String r0 = ""
                    X.BFI.A0B(r1, r0, r0, r3, r9)
                    java.lang.String r6 = "SpacesWebViewHost"
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r1
                    android.webkit.ValueCallback<android.net.Uri[]> r1 = r0.pendingFileCallback
                    if (r1 == 0) goto L19
                    android.net.Uri[] r0 = new android.net.Uri[r5]
                    r1.onReceiveValue(r0)
                L19:
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r1
                    r7 = 0
                    r0.pendingCameraIntent = r7
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r1
                    r0.pendingFileCallback = r12
                    com.facebook.aura.webview.HtmlWebViewPool r2 = r2
                    java.lang.String r1 = r3
                    r0 = 1
                    r2.setEvictionGuard(r1, r0)
                    int r2 = r9.length
                    if (r2 == 0) goto L4b
                    r1 = 0
                L2e:
                    r4 = r9[r1]
                    boolean r0 = X.C7BY.A0j(r4)
                    if (r0 != 0) goto L4b
                */
                //  java.lang.String r0 = "*/*"
                /*
                    boolean r0 = r0.equals(r4)
                    if (r0 != 0) goto L4b
                    java.lang.String r0 = "image/"
                    boolean r0 = X.AnonymousClass005.A1a(r4, r0)
                    if (r0 != 0) goto L4b
                    int r1 = r1 + 1
                    if (r1 >= r2) goto L71
                    goto L2e
                L4b:
                    if (r11 == 0) goto L71
                    android.content.Context r1 = r5
                    com.facebook.aura.model.HatchFileProviderUtil r0 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE     // Catch: java.lang.Throwable -> L56
                    android.net.Uri r4 = r0.createCaptureUri(r1)     // Catch: java.lang.Throwable -> L56
                    goto L5b
                L56:
                    r0 = move-exception
                    X.Hud r4 = X.C3cG.A0s(r0)
                L5b:
                    java.lang.Throwable r2 = X.HsJ.A00(r4)
                    if (r2 == 0) goto L6a
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "createSpacesCaptureUri failed: "
                    X.C3cH.A1B(r0, r1, r6, r2)
                L6a:
                    boolean r0 = r4 instanceof X.C10571Hud
                    if (r0 != 0) goto L6f
                    r7 = r4
                L6f:
                    android.net.Uri r7 = (android.net.Uri) r7
                L71:
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r1
                    r0.pendingCaptureUri = r7
                    android.content.Intent r4 = com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt.buildSpacesChooserIntent(r9, r10, r11, r7)
                    java.lang.String r1 = r4.getAction()
                    java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
                    boolean r0 = r0.equals(r1)
                    r4.getAction()
                    if (r0 == 0) goto Lb6
                    com.facebook.aura.utils.HatchPermissionUtils r2 = com.facebook.aura.utils.HatchPermissionUtils.INSTANCE
                    android.content.Context r0 = r5
                    java.lang.String r1 = "android.permission.CAMERA"
                    boolean r0 = r2.hasPermission(r0, r1)
                    if (r0 != 0) goto Lb6
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r1
                    r0.pendingCameraIntent = r4
                    X.7OU<java.lang.String, java.lang.Boolean> r0 = r6
                    r0.A01(r3, r1)     // Catch: java.lang.Throwable -> La0
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
                    goto La5
                La0:
                    r0 = move-exception
                    X.Hud r0 = X.C3cG.A0s(r0)
                La5:
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r4 = r1
                    kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r7
                    java.lang.Throwable r2 = X.HsJ.A00(r0)
                    if (r2 == 0) goto Le3
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "cameraCapturePermissionLauncher.launch failed: "
                    goto Ld3
                Lb6:
                    X.7OU<android.content.Intent, androidx.activity.result.ActivityResult> r0 = r8
                    r0.A01(r3, r4)     // Catch: java.lang.Throwable -> Lbe
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbe
                    goto Lc3
                Lbe:
                    r0 = move-exception
                    X.Hud r0 = X.C3cG.A0s(r0)
                Lc3:
                    com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r4 = r1
                    kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r7
                    java.lang.Throwable r2 = X.HsJ.A00(r0)
                    if (r2 == 0) goto Le3
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "fileChooserLauncher.launch failed: "
                Ld3:
                    X.C3cH.A1B(r0, r1, r6, r2)
                    com.facebook.aura.spaces.repo.SpacesUserError r0 = com.facebook.aura.spaces.repo.SpacesUserError.PICKER_FAILED
                    r4.emitUserError(r0)
                    r3.invoke()
                    android.net.Uri[] r0 = new android.net.Uri[r5]
                    r12.onReceiveValue(r0)
                Le3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1$fileHost$1.launch(java.lang.String[], boolean, boolean, android.webkit.ValueCallback):void");
            }
        };
        final MutableState<PermissionRequest> mutableState = this.$pendingPermissionRequest$delegate;
        final MutableState<String[]> mutableState2 = this.$pendingRequestedResources$delegate;
        final C7OU<String[], Map<String, Boolean>> c7ou3 = this.$mediaPermissionLauncher;
        final SpacesMediaPermissionHost spacesMediaPermissionHost = new SpacesMediaPermissionHost() { // from class: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1$permissionHost$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.aura.spaces.repo.SpacesMediaPermissionHost
            public final void resolve(PermissionRequest permissionRequest) {
                Object objA0s;
                C7384Etj.A0Y(permissionRequest, 0);
                String[] resources = permissionRequest.getResources();
                ArrayList arrayListA0s = C60Q.A0s(resources);
                for (String str2 : resources) {
                    if ("android.webkit.resource.VIDEO_CAPTURE".equals(str2) || "android.webkit.resource.AUDIO_CAPTURE".equals(str2)) {
                        arrayListA0s.add(str2);
                    }
                }
                if (arrayListA0s.isEmpty()) {
                    CFK.A06(SpacesWebViewHostBindingsKt.SPACES_HOST_TAG, "permissionHost.resolve: nothing supported \u2014 denying");
                } else {
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator it = arrayListA0s.iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        C7384Etj.A0X(strA0j);
                        String strAndroidPermissionFor = SpacesWebViewHostBindingsKt.androidPermissionFor(strA0j);
                        if (strAndroidPermissionFor != null) {
                            arrayListA0h.add(strAndroidPermissionFor);
                        }
                    }
                    Context context2 = context;
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    for (Object obj : arrayListA0h) {
                        if (!HatchPermissionUtils.INSTANCE.hasPermission(context2, (String) obj)) {
                            arrayListA0h2.add(obj);
                        }
                    }
                    List listA0m = C3cG.A0m(arrayListA0h2);
                    if (listA0m.isEmpty()) {
                        permissionRequest.grant((String[]) arrayListA0s.toArray(new String[0]));
                        return;
                    }
                    PermissionRequest value = mutableState.getValue();
                    if (value != null) {
                        value.deny();
                    }
                    mutableState.Af8(permissionRequest);
                    mutableState2.Af8(arrayListA0s.toArray(new String[0]));
                    try {
                        A01(null, listA0m.toArray(new String[0]));
                        objA0s = Unit.INSTANCE;
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    MutableState<PermissionRequest> mutableState3 = mutableState;
                    MutableState<String[]> mutableState4 = mutableState2;
                    Throwable thA00 = HsJ.A00(objA0s);
                    if (thA00 == null) {
                        return;
                    }
                    C3cH.A1B("mediaPermissionLauncher.launch failed: ", thA00.getMessage(), SpacesWebViewHostBindingsKt.SPACES_HOST_TAG, thA00);
                    mutableState3.Af8(null);
                    mutableState4.Af8(null);
                }
                permissionRequest.deny();
            }
        };
        htmlSpacesWebViewSession.fileChooserHost = spacesFileChooserHost;
        this.$session.mediaPermissionHost = spacesMediaPermissionHost;
        this.$session.hashCode();
        final HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = this.$session;
        final HtmlWebViewPool htmlWebViewPool2 = this.$pool;
        final String str2 = this.$cacheKey;
        final MutableState<PermissionRequest> mutableState3 = this.$pendingPermissionRequest$delegate;
        final MutableState<String[]> mutableState4 = this.$pendingRequestedResources$delegate;
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                htmlSpacesWebViewSession2.hashCode();
                if (htmlSpacesWebViewSession2.fileChooserHost == spacesFileChooserHost) {
                    htmlSpacesWebViewSession2.fileChooserHost = null;
                    if (htmlWebViewPool2.isPendingEviction(str2)) {
                        try {
                            htmlSpacesWebViewSession2.cancelPendingFileRequest();
                        } finally {
                            htmlWebViewPool2.setEvictionGuard(str2, false);
                        }
                    }
                }
                if (htmlSpacesWebViewSession2.mediaPermissionHost == spacesMediaPermissionHost) {
                    htmlSpacesWebViewSession2.mediaPermissionHost = null;
                }
                PermissionRequest permissionRequest = (PermissionRequest) mutableState3.getValue();
                if (permissionRequest != null) {
                    permissionRequest.deny();
                }
                mutableState3.Af8(null);
                mutableState4.Af8(null);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str, Context context, C7OU<String, Boolean> c7ou, Function0<Unit> function0, C7OU<Intent, ActivityResult> c7ou2, MutableState<PermissionRequest> mutableState, MutableState<String[]> mutableState2, C7OU<String[], Map<String, Boolean>> c7ou3) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$pool = htmlWebViewPool;
        this.$cacheKey = str;
        this.$context = context;
        this.$cameraCapturePermissionLauncher = c7ou;
        this.$endFileRequest = function0;
        this.$fileChooserLauncher = c7ou2;
        this.$pendingPermissionRequest$delegate = mutableState;
        this.$pendingRequestedResources$delegate = mutableState2;
        this.$mediaPermissionLauncher = c7ou3;
    }
}
