package com.facebook.aura.shortcut;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.identity.provider.HatchIcon;
import com.facebook.aura.identity.provider.HatchIconKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.utils.ContextUtilsKt;
import com.facebook.aura.vds.toast.AuraToast;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchShortcutManager {
    public static final int $stable = 0;
    public static final HatchShortcutManager INSTANCE = new HatchShortcutManager();

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager", f = "HatchShortcutManager.kt", l = {338}, m = "downloadBitmapFromAuthenticatedUrl", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$downloadBitmapFromAuthenticatedUrl$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShortcutManager.this.downloadBitmapFromAuthenticatedUrl(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager", f = "HatchShortcutManager.kt", l = {150}, m = "identityShortcutIcon", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C137801 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C137801(HtJ<? super C137801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShortcutManager.this.identityShortcutIcon(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$2", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Icon>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String path;
            Bitmap bitmapDecodeFile;
            HatchIcon.LocalImage localImage;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchIcon hatchIcon = HatchIdentityProvider.Companion.getInstance(this.$userSession).hatchIcon();
            Uri uri = (!(hatchIcon instanceof HatchIcon.LocalImage) || (localImage = (HatchIcon.LocalImage) hatchIcon) == null) ? null : localImage.uri;
            ShortcutManager shortcutManager = (ShortcutManager) this.$context.getSystemService(ShortcutManager.class);
            Integer numA0R = shortcutManager != null ? C3cG.A0R(shortcutManager.getIconMaxWidth()) : null;
            if (uri == null || (path = uri.getPath()) == null || (bitmapDecodeFile = BitmapFactory.decodeFile(path)) == null || numA0R == null) {
                return Icon.createWithResource(this.$context, HatchIconKt.HATCH_DEFAULT_AVATAR_RES);
            }
            HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
            return Icon.createWithAdaptiveBitmap(hatchShortcutManager.addAdaptiveIconPadding(hatchShortcutManager.scaleBitmap(hatchShortcutManager.cropToHead(bitmapDecodeFile), numA0R.intValue())));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Icon> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$isIdentityShortcutPinned$2", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$isIdentityShortcutPinned$2, reason: invalid class name and case insensitive filesystem */
    public final class C137812 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137812(Context context, HtJ<? super C137812> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C137812(this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ShortcutManager shortcutManager = (ShortcutManager) this.$context.getSystemService(ShortcutManager.class);
            boolean z = false;
            if (shortcutManager != null) {
                List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                C7384Etj.A0U(pinnedShortcuts);
                if (!(pinnedShortcuts instanceof Collection) || !pinnedShortcuts.isEmpty()) {
                    Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (HatchShortcutManagerKt.SHORTCUT_ID.equals(it.next().getId())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C137812(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$isRequestPinShortcutSupported$2", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$isRequestPinShortcutSupported$2, reason: invalid class name and case insensitive filesystem */
    public final class C137822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137822(Context context, HtJ<? super C137822> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C137822(this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ShortcutManager shortcutManager = (ShortcutManager) this.$context.getSystemService(ShortcutManager.class);
            return Boolean.valueOf(shortcutManager == null ? false : HatchShortcutManager.INSTANCE.isPinShortcutSupported(shortcutManager));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C137822(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2", f = "HatchShortcutManager.kt", l = {238, 289, 307}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2, reason: invalid class name and case insensitive filesystem */
    public final class C137832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<String> $deeplinkPath;
        public final /* synthetic */ String $shortcutId;
        public final /* synthetic */ String $spaceImageUrl;
        public final /* synthetic */ String $spaceTitle;
        public final /* synthetic */ String $updatedToastMessage;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2$1", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $updatedToastMessage;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Context context, String str, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$context = context;
                this.$updatedToastMessage = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$context, this.$updatedToastMessage, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Window window;
                View decorView;
                View viewFindViewById;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                Activity activityFindActivity = ContextUtilsKt.findActivity(this.$context);
                if (activityFindActivity != null && (window = activityFindActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
                    AnonymousClass007.A0n(viewFindViewById, AuraToast.Companion, this.$updatedToastMessage);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2$2", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$requestPinDeeplinkShortcut$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03632 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ ShortcutInfo $shortcutInfo;
            public final /* synthetic */ ShortcutManager $shortcutManager;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03632(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo, HtJ<? super C03632> htJ) {
                super(2, htJ);
                this.$shortcutManager = shortcutManager;
                this.$shortcutInfo = shortcutInfo;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03632(this.$shortcutManager, this.$shortcutInfo, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(this.$shortcutManager.requestPinShortcut(this.$shortcutInfo, null));
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return ((C03632) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137832(Context context, String str, String str2, String str3, String str4, AbstractC3358CGz abstractC3358CGz, List<String> list, HtJ<? super C137832> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$spaceImageUrl = str;
            this.$shortcutId = str2;
            this.$spaceTitle = str3;
            this.$updatedToastMessage = str4;
            this.$userSession = abstractC3358CGz;
            this.$deeplinkPath = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137832 c137832 = new C137832(this.$context, this.$spaceImageUrl, this.$shortcutId, this.$spaceTitle, this.$updatedToastMessage, this.$userSession, this.$deeplinkPath, htJ);
            c137832.L$0 = obj;
            return c137832;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[LOOP:0: B:34:0x009c->B:36:0x00a2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0188 A[Catch: Exception -> 0x01b4, TRY_ENTER, TryCatch #1 {Exception -> 0x01b4, blocks: (B:66:0x01ab, B:67:0x01ae, B:63:0x0188), top: B:73:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HatchShortcutManager.C137832.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C137832) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$requestPinShortcut$2", f = "HatchShortcutManager.kt", l = {106, 140}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$requestPinShortcut$2, reason: invalid class name and case insensitive filesystem */
    public final class C137842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AiIdentity $identity;
        public final /* synthetic */ IntentSender $pinResult;
        public final /* synthetic */ String $updatedToastMessage;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.shortcut.HatchShortcutManager$requestPinShortcut$2$2", f = "HatchShortcutManager.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.shortcut.HatchShortcutManager$requestPinShortcut$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03642 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ IntentSender $pinResult;
            public final /* synthetic */ ShortcutInfo $shortcutInfo;
            public final /* synthetic */ ShortcutManager $shortcutManager;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03642(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo, IntentSender intentSender, HtJ<? super C03642> htJ) {
                super(2, htJ);
                this.$shortcutManager = shortcutManager;
                this.$shortcutInfo = shortcutInfo;
                this.$pinResult = intentSender;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03642(this.$shortcutManager, this.$shortcutInfo, this.$pinResult, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(this.$shortcutManager.requestPinShortcut(this.$shortcutInfo, this.$pinResult));
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return ((C03642) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137842(Context context, AiIdentity aiIdentity, AbstractC3358CGz abstractC3358CGz, String str, IntentSender intentSender, HtJ<? super C137842> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$identity = aiIdentity;
            this.$userSession = abstractC3358CGz;
            this.$updatedToastMessage = str;
            this.$pinResult = intentSender;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137842 c137842 = new C137842(this.$context, this.$identity, this.$userSession, this.$updatedToastMessage, this.$pinResult, htJ);
            c137842.L$0 = obj;
            return c137842;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: Exception -> 0x0106, TRY_ENTER, TryCatch #1 {Exception -> 0x0106, blocks: (B:41:0x00fb, B:42:0x00fe, B:38:0x00dc), top: B:56:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HatchShortcutManager.C137842.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C137842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadBitmapFromAuthenticatedUrl(java.lang.String r18, X.HtJ<? super android.graphics.Bitmap> r19) {
        /*
            r17 = this;
            java.lang.String r5 = "Bitmap download failed: HTTP "
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.shortcut.HatchShortcutManager.AnonymousClass1
            if (r0 == 0) goto L25
            r7 = r3
            com.facebook.aura.shortcut.HatchShortcutManager$downloadBitmapFromAuthenticatedUrl$1 r7 = (com.facebook.aura.shortcut.HatchShortcutManager.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.label = r2
        L16:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            java.lang.String r3 = "HatchShortcutManager"
            r4 = 1
            r11 = 0
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2d
            goto L6b
        L25:
            com.facebook.aura.shortcut.HatchShortcutManager$downloadBitmapFromAuthenticatedUrl$1 r7 = new com.facebook.aura.shortcut.HatchShortcutManager$downloadBitmapFromAuthenticatedUrl$1
            r0 = r17
            r7.<init>(r3)
            goto L16
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r8 = com.facebook.aura.network.transport.HatchHttpRequest.Companion
            r0 = 4
            java.lang.String r1 = X.C60N.A00(r0)
            java.lang.String r0 = "no-cache"
            java.util.Map r10 = X.AnonymousClass006.A10(r1, r0)
            com.facebook.aura.network.transport.HatchRequestCategory r14 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r15 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r17 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r19 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r9 = r18
            r12 = r11
            r13 = r11
            r16 = r11
            r18 = r17
            com.facebook.aura.network.transport.HatchHttpRequest r2 = r8.get(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.facebook.aura.network.transport.HatchTransport r1 = com.facebook.aura.network.transport.HatchTransport.INSTANCE     // Catch: java.lang.Exception -> L8d
            com.facebook.aura.network.transport.HatchAuthScheme r0 = com.facebook.aura.network.transport.HatchAuthScheme.VM_JWT     // Catch: java.lang.Exception -> L8d
            com.facebook.aura.network.transport.HatchHttpClient r0 = r1.httpClient(r0)     // Catch: java.lang.Exception -> L8d
            r7.L$0 = r11     // Catch: java.lang.Exception -> L8d
            r7.L$1 = r11     // Catch: java.lang.Exception -> L8d
            r7.label = r4     // Catch: java.lang.Exception -> L8d
            java.lang.Object r1 = r0.execute(r2, r7)     // Catch: java.lang.Exception -> L8d
            if (r1 != r6) goto L6e
            return r6
        L6b:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L8d
        L6e:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1     // Catch: java.lang.Exception -> L8d
            boolean r0 = r1.isSuccessful     // Catch: java.lang.Exception -> L8d
            if (r0 != 0) goto L7e
            int r0 = r1.statusCode     // Catch: java.lang.Exception -> L8d
            java.lang.String r0 = X.FGI.A0H(r5, r0)     // Catch: java.lang.Exception -> L8d
            X.CFK.A06(r3, r0)     // Catch: java.lang.Exception -> L8d
            return r11
        L7e:
            byte[] r2 = r1.bodyBytes()     // Catch: java.lang.Exception -> L8d
            if (r2 == 0) goto L8c
            r1 = 0
            int r0 = r2.length     // Catch: java.lang.Exception -> L8b java.lang.Exception -> L8d
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)     // Catch: java.lang.Exception -> L8b java.lang.Exception -> L8d
            return r11
        L8b:
            r11 = 0
        L8c:
            return r11
        L8d:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Failed to download bitmap: "
            X.C3cH.A1B(r0, r1, r3, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HatchShortcutManager.downloadBitmapFromAuthenticatedUrl(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object requestPinPeerSpaceShortcut$default(HatchShortcutManager hatchShortcutManager, Context context, String str, String str2, String str3, String str4, AbstractC3358CGz abstractC3358CGz, String str5, HtJ htJ, int i, Object obj) {
        if ((i & 64) != 0) {
            str5 = null;
        }
        return hatchShortcutManager.requestPinPeerSpaceShortcut(context, str, str2, str3, str4, abstractC3358CGz, str5, htJ);
    }

    public static /* synthetic */ Object requestPinShortcut$default(HatchShortcutManager hatchShortcutManager, Context context, AiIdentity aiIdentity, AbstractC3358CGz abstractC3358CGz, String str, IntentSender intentSender, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            intentSender = null;
        }
        return hatchShortcutManager.requestPinShortcut(context, aiIdentity, abstractC3358CGz, str, intentSender, htJ);
    }

    public static /* synthetic */ Object requestPinSpaceShortcut$default(HatchShortcutManager hatchShortcutManager, Context context, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, String str4, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        return hatchShortcutManager.requestPinSpaceShortcut(context, str, str2, str3, abstractC3358CGz, str4, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String resolveSpaceImageUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(str) ? workspaceUriResolver.resolveDaemonApiUrl(str, abstractC3358CGz) : workspaceUriResolver.resolveRawAssetUrl(str, abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object identityShortcutIcon(android.content.Context r7, X.AbstractC3358CGz r8, X.HtJ<? super android.graphics.drawable.Icon> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.shortcut.HatchShortcutManager.C137801
            if (r0 == 0) goto L3b
            r5 = r9
            com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$1 r5 = (com.facebook.aura.shortcut.HatchShortcutManager.C137801) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L41
            X.Hwg.A00(r0)
        L20:
            X.C7384Etj.A0W(r0)
            return r0
        L24:
            X.78T r2 = X.AnonymousClass002.A0s(r0)
            r1 = 0
            com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$2 r0 = new com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$2
            r0.<init>(r8, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L3b:
            com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$1 r5 = new com.facebook.aura.shortcut.HatchShortcutManager$identityShortcutIcon$1
            r5.<init>(r9)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HatchShortcutManager.identityShortcutIcon(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    public final Object requestPinPeerSpaceShortcut(Context context, String str, String str2, String str3, String str4, AbstractC3358CGz abstractC3358CGz, String str5, HtJ<? super Boolean> htJ) {
        return requestPinDeeplinkShortcut(context, FGI.A0M(HatchShortcutManagerKt.PEER_SPACE_SHORTCUT_ID_PREFIX, str2), Arrays.asList("peer_space", str, str2), str3, str4, abstractC3358CGz, str5, htJ);
    }

    public final Object requestPinSpaceShortcut(Context context, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, String str4, HtJ<? super Boolean> htJ) {
        return requestPinDeeplinkShortcut(context, FGI.A0M(HatchShortcutManagerKt.SPACE_SHORTCUT_ID_PREFIX, str), Arrays.asList("space", str), str2, str3, abstractC3358CGz, str4, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap addAdaptiveIconPadding(Bitmap bitmap) {
        int width = (int) (bitmap.getWidth() / 0.6666666f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        float width2 = (width - bitmap.getWidth()) / 2.0f;
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, width2, width2, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap cropToHead(Bitmap bitmap) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.65f);
        if (iMin < 1) {
            iMin = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, 0, iMin, iMin);
        C7384Etj.A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPinShortcutSupported(ShortcutManager shortcutManager) {
        try {
            return shortcutManager.isRequestPinShortcutSupported();
        } catch (SecurityException e) {
            CFK.A0A(HatchShortcutManagerKt.TAG, "isRequestPinShortcutSupported refused", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestPinDeeplinkShortcut(Context context, String str, List<String> list, String str2, String str3, AbstractC3358CGz abstractC3358CGz, String str4, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C137832(context, str3, str, str2, str4, abstractC3358CGz, list, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap scaleBitmap(Bitmap bitmap, int i) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i) {
            return bitmap;
        }
        float width = i / (bitmap.getWidth() > bitmap.getHeight() ? bitmap.getWidth() : bitmap.getHeight());
        int width2 = (int) (bitmap.getWidth() * width);
        if (width2 < 1) {
            width2 = 1;
        }
        int height = (int) (bitmap.getHeight() * width);
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, height, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    public final Object isIdentityShortcutPinned(Context context, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C137812(context, null));
    }

    public final Object isRequestPinShortcutSupported(Context context, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C137822(context, null));
    }

    public final Object requestPinShortcut(Context context, AiIdentity aiIdentity, AbstractC3358CGz abstractC3358CGz, String str, IntentSender intentSender, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C137842(context, aiIdentity, abstractC3358CGz, str, intentSender, null));
    }
}
