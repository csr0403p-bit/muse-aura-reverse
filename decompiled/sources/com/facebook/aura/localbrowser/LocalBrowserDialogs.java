package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.FGI;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class LocalBrowserDialogs implements AutoCloseable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long EXPIRY_MS = 60000;

    @Deprecated
    public static final int MAX_MESSAGE_LENGTH = 2048;

    @Deprecated
    public static final int MAX_PENDING = 4;

    @Deprecated
    public static final int MAX_TEXT_LENGTH = 8192;
    public boolean closed;
    public final LinkedHashMap<String, Entry> entries;
    public final Handler handler;
    public final BLG<Long> mutableRevision;
    public final C1BN<Long> revision;
    public final LocalBrowserSession session;

    public final class Entry {
        public final String defaultValue;
        public final String document;
        public final Runnable expire;
        public final long expiresElapsedMs;
        public final String id;
        public final LocalBrowserDialogKind kind;
        public final String message;
        public final String origin;
        public final JsResult result;
        public final /* synthetic */ LocalBrowserDialogs this$0;

        public Entry(final LocalBrowserDialogs localBrowserDialogs, String str, LocalBrowserDialogKind localBrowserDialogKind, String str2, String str3, String str4, String str5, long j, JsResult jsResult) {
            AnonymousClass005.A11(str, localBrowserDialogKind, str2, 1);
            AnonymousClass003.A0z(str4, str5);
            C7384Etj.A0Y(jsResult, 8);
            this.this$0 = localBrowserDialogs;
            this.id = str;
            this.kind = localBrowserDialogKind;
            this.document = str2;
            this.origin = str3;
            this.message = str4;
            this.defaultValue = str5;
            this.expiresElapsedMs = j;
            this.result = jsResult;
            this.expire = new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogs$Entry$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LocalBrowserDialogs.settle$default(localBrowserDialogs, this, false, null, 4, null);
                }
            };
        }

        public final String getDefaultValue() {
            return this.defaultValue;
        }

        public final String getDocument() {
            return this.document;
        }

        public final Runnable getExpire() {
            return this.expire;
        }

        public final long getExpiresElapsedMs() {
            return this.expiresElapsedMs;
        }

        public final String getId() {
            return this.id;
        }

        public final LocalBrowserDialogKind getKind() {
            return this.kind;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final JsResult getResult() {
            return this.result;
        }
    }

    public LocalBrowserDialogs(LocalBrowserSession localBrowserSession) {
        C7384Etj.A0Y(localBrowserSession, 0);
        this.session = localBrowserSession;
        this.handler = C60O.A02();
        this.entries = C3cG.A0j();
        C9286GCn c9286GCnA14 = C3cG.A14(0L);
        this.mutableRevision = c9286GCnA14;
        this.revision = C3Pi.A00(c9286GCnA14);
    }

    public final LocalBrowserUserDialog firstForUser(LocalBrowserTarget.HostLease hostLease) {
        C7384Etj.A0Y(hostLease, 0);
        checkMainThread();
        if (!this.session.acceptsUserInput(hostLease)) {
            return null;
        }
        discardStale();
        Collection<Entry> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        Entry entry = (Entry) AbstractC0878AGe.A0C(collectionValues);
        if (entry != null) {
            return new LocalBrowserUserDialog(entry.id, entry.kind, entry.origin, entry.message, entry.defaultValue);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean resolve(java.lang.String r7, boolean r8, java.lang.String r9) {
        /*
            r6 = this;
            r5 = 0
            X.C7384Etj.A0Y(r7, r5)
            r6.checkMainThread()
            r6.discardStale()
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserDialogs$Entry> r0 = r6.entries
            java.lang.Object r4 = r0.get(r7)
            com.facebook.aura.localbrowser.LocalBrowserDialogs$Entry r4 = (com.facebook.aura.localbrowser.LocalBrowserDialogs.Entry) r4
            if (r4 == 0) goto L2e
            r3 = 1
            if (r8 == 0) goto L1e
            com.facebook.aura.localbrowser.LocalBrowserDialogKind r2 = r4.kind
            com.facebook.aura.localbrowser.LocalBrowserDialogKind r1 = com.facebook.aura.localbrowser.LocalBrowserDialogKind.PROMPT
            r0 = 1
            if (r2 == r1) goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r9 != 0) goto L22
            r3 = 0
        L22:
            if (r0 != r3) goto L2e
            if (r9 == 0) goto L2f
            int r1 = r9.length()
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 <= r0) goto L2f
        L2e:
            return r5
        L2f:
            boolean r5 = r6.settle(r4, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserDialogs.resolve(java.lang.String, boolean, java.lang.String):boolean");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserDialogKind.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserDialogKind.ALERT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserDialogKind.BEFORE_UNLOAD, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserDialogKind.CONFIRM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LocalBrowserDialogKind.PROMPT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void changed() {
        BLG<Long> blg = this.mutableRevision;
        AnonymousClass002.A1I(blg, Long.valueOf(C3cG.A05(blg.getValue()) + 1));
    }

    public static /* synthetic */ boolean offer$default(LocalBrowserDialogs localBrowserDialogs, LocalBrowserDialogKind localBrowserDialogKind, String str, String str2, JsResult jsResult, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return localBrowserDialogs.offer(localBrowserDialogKind, str, str2, jsResult, str3);
    }

    private final boolean settle(Entry entry, boolean z, String str) {
        boolean z2 = false;
        if (this.entries.remove(entry.id) != entry) {
            return false;
        }
        this.handler.removeCallbacks(entry.expire);
        try {
            if (!z) {
                entry.result.cancel();
            } else if (entry.kind == LocalBrowserDialogKind.PROMPT) {
                JsResult jsResult = entry.result;
                C7384Etj.A0Z(jsResult, "null cannot be cast to non-null type android.webkit.JsPromptResult");
                JsPromptResult jsPromptResult = (JsPromptResult) jsResult;
                if (str == null) {
                    throw C60O.A0i("Required value was null.");
                }
                jsPromptResult.confirm(str);
            } else {
                entry.result.confirm();
            }
            z2 = true;
        } catch (RuntimeException unused) {
        }
        changed();
        return z2;
    }

    public final C1BN<Long> getRevision() {
        return this.revision;
    }

    public final boolean offer(LocalBrowserDialogKind localBrowserDialogKind, String str, String str2, JsResult jsResult, String str3) {
        String strNavigationUrl;
        String strA0U;
        String str4 = str2;
        String str5 = str3;
        AnonymousClass002.A1B(localBrowserDialogKind, 0, jsResult);
        checkMainThread();
        if (!this.closed) {
            if (this.session.getControl() != LocalBrowserControl.USER) {
                settleForAgent(localBrowserDialogKind, jsResult);
                return true;
            }
            LocalBrowserTarget localBrowserTarget = this.session.target;
            if (!localBrowserTarget.rendering.isTakeover) {
                try {
                    jsResult.cancel();
                } catch (RuntimeException unused) {
                }
                return true;
            }
            if (localBrowserTarget.hasStartedHost() && this.entries.size() < 4 && str != null && (strNavigationUrl = LocalBrowserUrlPolicy.INSTANCE.navigationUrl(str)) != null && (str2 == null || str4.length() <= 2048)) {
                if (str3 != null && str5.length() > 8192) {
                    return false;
                }
                if (strNavigationUrl.equals(C3cF.A00(1)) || localBrowserDialogKind == LocalBrowserDialogKind.BEFORE_UNLOAD) {
                    strA0U = null;
                } else {
                    Uri uri = Uri.parse(strNavigationUrl);
                    strA0U = FGI.A0U(uri.getScheme(), "://", uri.getEncodedAuthority());
                }
                String strA0k = AnonymousClass002.A0k();
                String str6 = this.session.target.page.state.getValue().document;
                if (str2 == null) {
                    str4 = "";
                }
                if (str3 == null) {
                    str5 = "";
                }
                Entry entry = new Entry(this, strA0k, localBrowserDialogKind, str6, strA0U, str4, str5, SystemClock.elapsedRealtime() + 60000, jsResult);
                this.entries.put(entry.id, entry);
                this.handler.postAtTime(entry.expire, SystemClock.uptimeMillis() + 60000);
                changed();
                return true;
            }
        }
        return false;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    private final void discardStale() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.session.target.page.state.getValue().document;
        Collection<Entry> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        for (Entry entry : AbstractC0878AGe.A0X(collectionValues)) {
            if (jElapsedRealtime >= entry.expiresElapsedMs || !C7384Etj.areEqual(str, entry.document)) {
                settle(entry, false, null);
            }
        }
    }

    public static /* synthetic */ boolean settle$default(LocalBrowserDialogs localBrowserDialogs, Entry entry, boolean z, String str, int i, Object obj) {
        return localBrowserDialogs.settle(entry, z, AnonymousClass006.A0t(i, str));
    }

    private final void settleForAgent(LocalBrowserDialogKind localBrowserDialogKind, JsResult jsResult) {
        try {
            int iOrdinal = localBrowserDialogKind.ordinal();
            if (iOrdinal == 0 || iOrdinal == 3) {
                jsResult.confirm();
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                jsResult.cancel();
            }
        } catch (RuntimeException unused) {
        }
    }

    public final void cancelPending() {
        checkMainThread();
        Collection<Entry> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        for (Entry entry : AbstractC0878AGe.A0X(collectionValues)) {
            C7384Etj.A0X(entry);
            settle(entry, false, null);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        checkMainThread();
        if (this.closed) {
            return;
        }
        this.closed = true;
        Collection<Entry> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        for (Entry entry : AbstractC0878AGe.A0X(collectionValues)) {
            C7384Etj.A0X(entry);
            settle(entry, false, null);
        }
    }

    public final boolean getHasPending() {
        checkMainThread();
        discardStale();
        return !this.entries.isEmpty();
    }
}
