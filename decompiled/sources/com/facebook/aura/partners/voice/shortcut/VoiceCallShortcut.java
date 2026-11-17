package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C3cG;
import X.C6565EFs;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import java.util.Collections;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class VoiceCallShortcut implements SignOutCleanupHandler {
    public static final VoiceCallShortcut INSTANCE = new VoiceCallShortcut();
    public static final Object writeLock = C3cG.A0T();

    @DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcut", f = "VoiceCallShortcut.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcut$publish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallShortcut.this.publish(null, null, this);
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        synchronized (writeLock) {
            C6565EFs.A04(C3cG.A06(), AbstractC0878AGe.A0P(VoiceCallShortcutKt.RETIRED_SHORTCUT_IDS, Collections.singletonList("aura_voice_call")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[PHI: r2
  0x00a0: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:14:0x0048, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(android.content.Context r8, X.AbstractC3358CGz r9, X.HtJ<? super kotlin.Unit> r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcut.publish(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    public final void reportUsed(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        if (str.equals("aura_voice_call")) {
            C6565EFs.A03(context, str);
        }
    }
}
