package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.AbstractC7531Ezs;
import X.AnonymousClass001;
import X.C06827l3;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.F0H;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceEarconAssets {
    public static final int $stable = 0;
    public static final String CACHE_DIR = "voice_earcons";
    public static final String END_FILE = "hatch_voice_call_end.opus";
    public static final VoiceEarconAssets INSTANCE = new VoiceEarconAssets();
    public static final long STALE_TMP_MAX_AGE_MS = 93600000;
    public static final String START_FILE = "hatch_voice_call_start.opus";
    public static final String TAG = "VoiceEarconAssets";
    public static final C06827l3 VERSIONED_EARCON;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceEarconAssets$materialize$2", f = "VoiceEarconAssets.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceEarconAssets$materialize$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ int $resId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, int i, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$fileName = str;
            this.$resId = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$fileName, this.$resId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                File fileA0O = C3cG.A0O(this.$context.getCacheDir(), VoiceEarconAssets.CACHE_DIR);
                if (!fileA0O.mkdirs() && !fileA0O.isDirectory()) {
                    throw C3cG.A0Q("Earcon cache directory voice_earcons unavailable");
                }
                VoiceEarconAssets voiceEarconAssets = VoiceEarconAssets.INSTANCE;
                long jAppVersionCode = voiceEarconAssets.appVersionCode(this.$context);
                StringBuilder sb = new StringBuilder();
                sb.append(jAppVersionCode);
                String strA0v = AnonymousClass001.A0v("_", sb);
                File fileA0O2 = C3cG.A0O(fileA0O, FGI.A0M(strA0v, this.$fileName));
                voiceEarconAssets.pruneStaleVersions(fileA0O, strA0v);
                if (!fileA0O2.exists()) {
                    File fileCreateTempFile = File.createTempFile(this.$fileName, AuraPrefsStorage.TEMP_FILE_SUFFIX, fileA0O);
                    try {
                        InputStream inputStreamOpenRawResource = this.$context.getResources().openRawResource(this.$resId);
                        try {
                            C7384Etj.A0X(fileCreateTempFile);
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            try {
                                C7384Etj.A0X(inputStreamOpenRawResource);
                                F0H.A00(inputStreamOpenRawResource, fileOutputStream);
                                fileOutputStream.close();
                                inputStreamOpenRawResource.close();
                                if (!fileCreateTempFile.renameTo(fileA0O2) && !fileA0O2.exists()) {
                                    throw C3cG.A0Q(FGI.A0U("Failed to move earcon ", this.$fileName, " into place"));
                                }
                                fileCreateTempFile.delete();
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC7531Ezs.A00(inputStreamOpenRawResource, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        fileCreateTempFile.delete();
                        throw th3;
                    }
                }
                return fileA0O2.getCanonicalPath();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0H(VoiceEarconAssets.TAG, "Failed to materialize earcon %s", this.$fileName, e2);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String strQuote = Pattern.quote(START_FILE);
        C7384Etj.A0U(strQuote);
        String strQuote2 = Pattern.quote(END_FILE);
        C7384Etj.A0U(strQuote2);
        VERSIONED_EARCON = new C06827l3(FGI.A0h("\\d+_(?:", strQuote, "|", strQuote2, ")"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long appVersionCode(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object materialize(Context context, int i, String str, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, str, i, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pruneStaleVersions(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            long r11 = java.lang.System.currentTimeMillis()
            java.io.File[] r9 = r13.listFiles()
            if (r9 == 0) goto L4c
            int r8 = r9.length
            r7 = 0
        Lc:
            if (r7 >= r8) goto L4c
            r10 = r9[r7]
            java.lang.String r1 = r10.getName()
            X.7l3 r0 = com.facebook.aura.partners.voice.api.VoiceEarconAssets.VERSIONED_EARCON
            X.C7384Etj.A0X(r1)
            boolean r0 = r0.A08(r1)
            r6 = 1
            if (r0 == 0) goto L2a
            X.C7384Etj.A0Y(r14, r6)
            boolean r0 = r1.startsWith(r14)
            r5 = 1
            if (r0 == 0) goto L2b
        L2a:
            r5 = 0
        L2b:
            java.lang.String r0 = ".tmp"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L4a
            long r0 = r10.lastModified()
            long r3 = r11 - r0
            r1 = 93600000(0x5943900, double:4.62445445E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
        L40:
            if (r5 != 0) goto L44
            if (r6 == 0) goto L47
        L44:
            r10.delete()
        L47:
            int r7 = r7 + 1
            goto Lc
        L4a:
            r6 = 0
            goto L40
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceEarconAssets.pruneStaleVersions(java.io.File, java.lang.String):void");
    }

    public final Object endEarconPath(Context context, HtJ<? super String> htJ) {
        return materialize(context, R.raw.hatch_voice_call_end, END_FILE, htJ);
    }

    public final Object startEarconPath(Context context, HtJ<? super String> htJ) {
        return materialize(context, R.raw.hatch_voice_call_start, START_FILE, htJ);
    }
}
