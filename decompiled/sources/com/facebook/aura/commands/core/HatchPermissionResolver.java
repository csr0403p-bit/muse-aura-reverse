package com.facebook.aura.commands.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C60Q;
import X.C60S;
import X.HtJ;
import X.HzP;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.R;
import com.facebook.aura.commands.core.NodePermissionActivity;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.nodes.datasource.PermissionResolver;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchPermissionResolver implements PermissionResolver {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String EXTRA_FRAGMENT_ARGS_KEY = ":settings:fragment_args_key";
    public static final String EXTRA_SHOW_BUTTON_BAR = "EXTRA_PREFS_SHOW_BUTTON_BAR";
    public static final String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    public static final String NODE_NOTIFICATION_LISTENER_FQCN = "com.facebook.aura.commands.notifications.NodeNotificationListenerService";
    public static final String TOKEN_HEALTH_CONNECT = "@health_connect";
    public static final String TOKEN_NOTIFICATIONS = "notifications";
    public static final String TOKEN_NOTIFICATION_LISTENER = "@notification_listener";
    public final Context context;
    public final String healthTrigger;
    public final boolean isBackgroundLocationDisclosed;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final Intent buildNotificationListenerSettingsIntent(Context context) {
            return C60S.A00(new ComponentName(context, "com.facebook.aura.commands.notifications.NodeNotificationListenerService"));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.core.HatchPermissionResolver", f = "HatchPermissionResolver.kt", l = {91, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 114, 124}, m = "ensureHealthConnectAccess", v = 2)
    /* renamed from: com.facebook.aura.commands.core.HatchPermissionResolver$ensureHealthConnectAccess$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPermissionResolver.this.ensureHealthConnectAccess(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.core.HatchPermissionResolver", f = "HatchPermissionResolver.kt", l = {58, 59, 60, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 71}, m = "requestPermissions", v = 2)
    /* renamed from: com.facebook.aura.commands.core.HatchPermissionResolver$requestPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C111141 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111141(HtJ<? super C111141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPermissionResolver.this.requestPermissions(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ensureBackgroundLocationAccess(HtJ<? super Boolean> htJ) {
        if (hasRuntimePermission("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return true;
        }
        if (!hasForegroundLocationAccess()) {
            return false;
        }
        NodePermissionActivity.Companion companion = NodePermissionActivity.Companion;
        Context context = this.context;
        return companion.requestPermissions(context, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, context.getString(R.string._name_removed__res_0x7f120f16), C60Q.A0b(this.context, HatchAppName.value, R.string._name_removed__res_0x7f120f15), true, this.isBackgroundLocationDisclosed, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureHealthConnectAccess(X.HtJ<? super java.lang.Boolean> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.core.HatchPermissionResolver.ensureHealthConnectAccess(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ensureNotificationListenerAccess(HtJ<? super Boolean> htJ) {
        if (NotificationAccessUtils.INSTANCE.isNotificationAccessGranted(this.context)) {
            return AnonymousClass001.A0i();
        }
        NodePermissionActivity.Companion companion = NodePermissionActivity.Companion;
        Context context = this.context;
        return companion.requestSettingsPermission(context, Companion.buildNotificationListenerSettingsIntent(context), this.context.getString(R.string._name_removed__res_0x7f120b87), C60Q.A0b(this.context, HatchAppName.value, R.string._name_removed__res_0x7f120b86), false, htJ);
    }

    private final boolean hasForegroundLocationAccess() {
        return hasRuntimePermission("android.permission.ACCESS_FINE_LOCATION") || hasRuntimePermission("android.permission.ACCESS_COARSE_LOCATION");
    }

    private final boolean hasRuntimePermission(String str) {
        return AnonymousClass002.A1M(this.context.checkSelfPermission(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (X.AnonymousClass001.A1X(r0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (X.AnonymousClass001.A1X(r0) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
    
        if (r0 == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    @Override // com.facebook.aura.nodes.datasource.PermissionResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestPermissions(java.util.List<java.lang.String> r16, X.HtJ<? super java.lang.Boolean> r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.core.HatchPermissionResolver.requestPermissions(java.util.List, X.HtJ):java.lang.Object");
    }

    public HatchPermissionResolver(Context context, String str, boolean z) {
        AnonymousClass003.A0u(context, str);
        this.context = context;
        this.healthTrigger = str;
        this.isBackgroundLocationDisclosed = z;
    }

    public /* synthetic */ HatchPermissionResolver(Context context, String str, boolean z, int i, C06H c06h) {
        this(context, (i & 2) != 0 ? NodeCommandFallbackWorker.KEY_COMMAND : str, AnonymousClass005.A1O(i, z));
    }
}
